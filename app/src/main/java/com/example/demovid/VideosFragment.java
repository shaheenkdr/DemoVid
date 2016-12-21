package com.example.demovid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.demovid.vidpojo.VideoPojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VideosFragment extends Fragment
{
    private static final String KEY = "a7147d985c7b40e50ff7dcbe1e8b3923";
    private RecyclerView rv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.videos, container, false);
        rv = (RecyclerView)rootView.findViewById(R.id.rView);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);

        makeRequest();
        return rootView;
    }


    private void makeRequest()
    {
        ApiInterfaceVid apiService =
                ApiClient.getClient().create(ApiInterfaceVid.class);

        Call<VideoPojo> call = apiService.getVideo(KEY);
        call.enqueue(new Callback<VideoPojo>()
        {
            @Override
            public void onResponse(Call<VideoPojo> call, Response<VideoPojo> response)
            {
                try
                {
                    Log.i("TAG",""+response.body().getTotal());
                    CustomAdapter adapter = new CustomAdapter(response.body().getVideos());
                    rv.setAdapter(adapter);

                }
                catch (Exception e)
                {
                    Log.e("error",e.toString());

                }
            }

            @Override
            public void onFailure(Call<VideoPojo> call, Throwable t)
            {
                // Log error here since request failed
                Toast.makeText(getActivity(), "Failed to fetch" , Toast.LENGTH_LONG).show();
                Log.e("FAILURE", t.toString());
            }
        });

    }
}