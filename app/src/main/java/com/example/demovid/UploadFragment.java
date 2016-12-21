package com.example.demovid;


import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.demovid.pojo.SproutReply;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import retrofit2.Response;
import retrofit2.Call;
import retrofit2.Callback;

public class UploadFragment extends Fragment {


    private static final int SELECT_VIDEO_REQUEST=100;
    private ParcelFileDescriptor fd;
    private String selectedVideoPath;
    private static final String KEY = "a7147d985c7b40e50ff7dcbe1e8b3923";
    private ProgressDialog pr1;
    private File file;
    public static Uri damn;
    private static final String URL = "https://api.sproutvideo.com/v1/videos";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.upload, container, false);
        EventBus.getDefault().register(this);
        pr1 = new ProgressDialog(rootView.getContext());
        pr1.setMessage("video uploading ...");
        Button upButton = (Button)rootView.findViewById(R.id.uploadButton);
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                selectVideoFromGallery();
            }
        });
        return rootView;
    }

    private void selectVideoFromGallery()
    {
        Intent intent;
        if(android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED))
        {
            intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        }
        else
        {
            intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        }
        intent.setType("video/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.putExtra("return-data", true);
        getActivity().startActivityForResult(intent,SELECT_VIDEO_REQUEST);
    }

    private void makeRequest(Uri uri)
    {
        pr1.show();
        damn = uri;

       try {
           fd = getActivity().getContentResolver().openFileDescriptor(uri, "r");

       }
       catch (Exception e){}


        RequestBody video = createBody(MediaType.parse("video/mp4"), fd);

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<SproutReply> call = apiService.pushVideo(KEY,video);
        call.enqueue(new Callback<SproutReply>()
        {
            @Override
            public void onResponse(Call<SproutReply> call, Response<SproutReply> response)
            {
                try
                {
                    Log.e("TAG",""+response.code());
                    Toast.makeText(getActivity(), "successfully uploaded" , Toast.LENGTH_LONG).show();
                    pr1.dismiss();
                }
                catch (Exception e)
                {
                    Log.e("error",e.toString());

                }
            }

            @Override
            public void onFailure(Call<SproutReply> call, Throwable t)
            {
                // Log error here since request failed
                Toast.makeText(getActivity(), "upload failed" , Toast.LENGTH_LONG).show();
                pr1.dismiss();
                Log.e("FAILURE", t.toString());
            }
        });





    }

    @Subscribe
    public void onEvent(UriEvent event)
    {
        makeRequest(event.getUri());
    }

    public static RequestBody createBody(final MediaType contentType, final ParcelFileDescriptor fd)
    {
        if (fd == null)
            throw new NullPointerException("content == null");

        return new RequestBody() {
            @Override public MediaType contentType() {
                return contentType;
            }

            @Override public long contentLength() {
                return fd.getStatSize();
            }

            @Override public void writeTo(BufferedSink sink) throws IOException {
                Source source = null;
                try {
                    source = Okio.source(new ParcelFileDescriptor.AutoCloseInputStream(fd));
                    sink.writeAll(source);
                } finally {
                    Util.closeQuietly(source);
                }
            }
        };
    }


}