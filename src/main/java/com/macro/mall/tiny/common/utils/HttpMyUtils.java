package com.macro.mall.tiny.common.utils;

/**
 * @ClassName HttpMyUtils
 * @Description TODO
 * @Author lr
 * @Date 2023/1/10 16:52
 * @Version 1.0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpMyUtils {
    public static void getReq(String path) {
        try {
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestMethod("GET");
            if (conn.getResponseCode() == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String s = null;
                while ((s = in.readLine()) != null) {
                    System.out.println(s);
                }
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void postReq(String path, String args) {
        try {
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            //发送数据
            conn.setDoOutput(true);
            OutputStream out = conn.getOutputStream();
            out.write(args.getBytes("UTF-8"));
            if (conn.getResponseCode() == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String s = null;
                while ((s = in.readLine()) != null) {
                    System.out.println(s);
                }
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void putReq(String path, String args) {
        try {
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json");
            //发送数据
            conn.setDoOutput(true);
            OutputStream out = conn.getOutputStream();
            out.write(args.getBytes("UTF-8"));
            if (conn.getResponseCode() == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String s = null;
                while ((s = in.readLine()) != null) {
                    System.out.println(s);
                }
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteReq(String path) {
        try {
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestMethod("DELETE");
            if (conn.getResponseCode() == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String s = null;
                while ((s = in.readLine()) != null) {
                    System.out.println(s);
                }
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

