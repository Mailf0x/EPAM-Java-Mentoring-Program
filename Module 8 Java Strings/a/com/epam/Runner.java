package com.epam;

import java.nio.charset.Charset;

public class Runner {

	public static void main(String[] args) {
        String a = "string";
        String b = new String("string");
        char[] c = new char[]{'s', 't', 'r', 'i', 'n', 'g'};
        String d = new String(c);
        byte[] e = new byte[]{(byte)115, (byte)116, (byte)114, (byte)105, (byte)110, (byte)103};
        String f = new String(e);
        Charset g = Charset.forName("KOI8-R");
        byte[] h = new byte[]{(byte)211, (byte)212, (byte)210, (byte)207, (byte)203, (byte)193};
        String i = new String(h, g);
    }
}
