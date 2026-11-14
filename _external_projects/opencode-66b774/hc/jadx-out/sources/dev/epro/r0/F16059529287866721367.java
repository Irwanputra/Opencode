package dev.epro.r0;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F16059529287866721367 {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static volatile Charset f;
    public static volatile Charset g;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        a = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        charsetForName2.getClass();
        b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        charsetForName3.getClass();
        c = charsetForName3;
        Charset charsetForName4 = Charset.forName("US-ASCII");
        charsetForName4.getClass();
        d = charsetForName4;
        Charset charsetForName5 = Charset.forName("ISO-8859-1");
        charsetForName5.getClass();
        e = charsetForName5;
    }
}
