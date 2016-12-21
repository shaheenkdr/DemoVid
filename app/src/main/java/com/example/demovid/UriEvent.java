package com.example.demovid;


import android.net.Uri;

public class UriEvent
{
    private final Uri uri;

    public UriEvent(Uri uri)
    {
        this.uri = uri;
    }

    public Uri getUri()
    {
        return uri;
    }

}
