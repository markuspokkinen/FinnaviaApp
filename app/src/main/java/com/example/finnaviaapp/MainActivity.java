package com.example.finnaviaapp;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.finnaviaapp.Fragments.ElementFragment;
import com.example.finnaviaapp.Network.FinnaviaRequester;

public class MainActivity extends AppCompatActivity implements ElementFragment.OnFragmentInteractionListener{
    private Context context;
    private String s;

    private static final Handler handler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            switchfragment(ElementFragment.TAG);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    void switchfragment(String fragmentTAG) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag(fragmentTAG);
        if (fragment == null) {
            Log.d("MA_sf", "fragment ei löydy");
            Class c = Class.forName(fragmentTAG);
            fragment = (Fragment) c.newInstance();
            Log.d("MA_sf", fragment.toString());
        }
        FragmentTransaction tran = getSupportFragmentManager().beginTransaction();
        tran.replace(R.id.FragmentContainer,fragment);
        tran.addToBackStack(null);
        tran.commit();

    }
    @Override
    public void startUiUpdate(Runnable runnable) {
        runOnUiThread(runnable);
    }

    public static void uiUpdate(Runnable runnable) {
        handler.post(runnable);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
            Log.d("MA",uri.toString());
    }
}
