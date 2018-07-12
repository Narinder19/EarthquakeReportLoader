package com.example.neha.earthquakereport;

import android.support.v4.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    String murl;

    public EarthquakeLoader(Context context, String url){
        super(context);
        murl = url;
        Log.i("Earthquake", "Earthquakeloader constructor");
    }

    @Override
    protected void onStartLoading(){
        Log.i("Earthquake", "onstartloading");
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground(){

        Log.i("Earthquake", "loadinBackground");
        List<Earthquake> result = QueryUtils.fetchEarthquakeData(murl);
        return result;
    }

}
