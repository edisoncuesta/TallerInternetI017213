package com.example.toshiba1.tallerinterneti017213.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by TOSHIBA1 on 20/04/2018.
 */

public class HttpManager {

    public static String getDataJson(String url) throws IOException {


        BufferedReader bufferedReader;


        URL urlData = new URL(url);


        HttpURLConnection httpURLConnection = (HttpURLConnection) urlData.openConnection();


         StringBuilder stringBuilder = new StringBuilder();


        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));

        String line;
        while ( (line = bufferedReader.readLine()) != null ){
            stringBuilder.append(line + "\n");
        }

        return stringBuilder.toString();
    }

}
