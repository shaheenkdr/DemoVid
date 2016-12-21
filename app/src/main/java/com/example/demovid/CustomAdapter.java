package com.example.demovid;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.demovid.vidpojo.Video;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.VideoViewHolder> {


    private DataHolder d1 = new DataHolder();

    public class VideoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView video;
        private Context mcontext;


        VideoViewHolder(View itemView) {
            super(itemView);
            mcontext = itemView.getContext();
            video = (ImageView) itemView.findViewById(R.id.scrubImage);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(itemView.getContext(), VideoPlayer.class);
            Bundle extras = new Bundle();
            extras.putString("URL", d1.vids.get(getLayoutPosition()).getAssets().getVideos().get240p());
            intent.putExtras(extras);
            itemView.getContext().startActivity(intent);
        }

    }

    private static class DataHolder {
        List<Video> vids;

    }


    public CustomAdapter(List<Video> vids) {
        this.d1.vids = vids;
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new VideoViewHolder(v);
    }


    @Override
    public void onBindViewHolder(VideoViewHolder vidViewHolder, int i)
    {
        Picasso.with(vidViewHolder.mcontext).load(d1.vids.get(i).getAssets().getPosterFrames().get(i)).into(vidViewHolder.video);
    }

    @Override
    public int getItemCount() {

        if (d1.vids != null) {
            return d1.vids.size();
        } else {
            return 0;
        }
    }


}