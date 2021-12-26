/*
    Use a Java application to make a HTTP call
*/

package com.epam;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Runner {
    private static HttpURLConnection connection;

    public static void main(String[] args) {

        try {
            URL url = new URL("http://www.google.com");
            connection = (HttpURLConnection)url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setInstanceFollowRedirects(true);
            connection.setUseCaches(true);

            int status = connection.getResponseCode();
            InputStream inputStream = connection.getInputStream();

            System.out.printf("success: response code = %d\n", status);

        } catch (MalformedURLException e) {
            System.out.println("error: unknown protocol");
            System.exit(1);

        } catch (IOException e) {
            System.out.println("error: i/o exception");
            System.exit(2);

        } finally {
            connection.disconnect();
        }
    }
}
