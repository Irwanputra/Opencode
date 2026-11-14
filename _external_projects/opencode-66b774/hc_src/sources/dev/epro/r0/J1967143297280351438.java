package dev.epro.r0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class J1967143297280351438 {
    public static final List d;
    public static final List e;
    public static final List f;
    public static final ArrayList g;
    public static final List h;
    public final ConnectivityManager a;
    public final J12043550928838212009 b;
    public final Set c;

    public static final class Y6921797927338498306 extends ConnectivityManager.NetworkCallback {
        static {
            izmyclvb.dpqpjfpoanwt1(1191);
        }

        private native void frqpadkwqilg(J1967143297280351438 j1967143297280351438);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onAvailable(Network network);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onLost(Network network);

        public Y6921797927338498306() {
            frqpadkwqilg(J1967143297280351438.this);
        }
    }

    static {
        int nmekqrazqbra;
        izmyclvb.dpqpjfpoanwt1(1753);
        Object[] objArr = new Object[7];
        while (true) {
            try {
                nmekqrazqbra = nmekqrazqbra(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (nmekqrazqbra != 0) {
                switch (nmekqrazqbra) {
                    case 1:
                        d = (List) objArr[1];
                        continue;
                    case 2:
                        e = (List) objArr[1];
                        continue;
                    case 3:
                        f = (List) objArr[1];
                        continue;
                    case 4:
                        g = (ArrayList) objArr[1];
                        continue;
                    case 5:
                        h = (List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native int a();

    public static native String f(List list);

    public static native boolean g(String str);

    public static native String h(String str);

    public static native B2664082256516729321 k();

    private static native int nmekqrazqbra(Object[] objArr);

    private native void qnxsrghudhhh(Context context);

    public final native String b();

    public final native String c();

    public final native String d();

    public final native String e();

    public final native String i(Network network);

    public final native String j(Network network);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(2224);
        }

        private native void ljlqhgsekxgn();

        private native void qezydetsneya(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            qezydetsneya(o18369580107802500074);
        }

        private Z11244019023321623390() {
            ljlqhgsekxgn();
        }
    }

    public J1967143297280351438(Context context) {
        context.getClass();
        qnxsrghudhhh(context);
    }
}
