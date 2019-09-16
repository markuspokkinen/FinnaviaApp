package com.example.finnaviaapp.Network;

import android.util.Log;

import com.example.finnaviaapp.Callbck;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.acl.LastOwnerException;
import java.util.Scanner;

public class FinnaviaRequester {
    /*
https://code.tutsplus.com/tutorials/android-from-scratch-using-rest-apis--cms-27117
http://roufid.com/5-ways-convert-inputstream-string-java/


Application ID
    4e435059

    This is the application ID, you should send with each API request.
Application Keys
    f77d35a68549aaf13b2fc9ba6fe01c6f


     */

    public FinnaviaRequester(){

    }

    public void loadData(final Callbck callbck){
        Worker worker = Worker.getInstance();
        worker.registerTask(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://api.finavia.fi/flights/public/v0/flights/all/all");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                    connection.setRequestProperty("app_id","4e435059");
                    connection.setRequestProperty("app_key","f77d35a68549aaf13b2fc9ba6fe01c6f");

                    Log.d("FinnaReq", connection.getResponseCode()+"");
                    if(connection.getResponseCode() == 200){
                        InputStream inputStream = connection.getInputStream();
                        String fulldata = new Scanner(inputStream).useDelimiter("\\A").next();
                        Log.d("FinnaReq",fulldata);
                        callbck.onItemsLoaded(fulldata);


                    }else{
                        //failed to connect
                        Log.d("FinnaReq","Failed to connect");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }



}
