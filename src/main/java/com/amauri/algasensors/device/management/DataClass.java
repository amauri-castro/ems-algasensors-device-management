package com.amauri.algasensors.device.management;

public class DataClass {

    private String a,b,c,d,e,f,g,h;

    @SuppressWarnings("squid:S107")
    public DataClass(String a, String b, String c, String d, String e, String f, String g, String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }

    public static void main(String[] args) {
        String XoXXOta = "abc";

        String a = null;

        System.out.println(a.getClass());
    }
}
