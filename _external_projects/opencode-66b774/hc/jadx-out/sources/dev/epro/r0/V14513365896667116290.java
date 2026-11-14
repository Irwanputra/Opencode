package dev.epro.r0;

import android.net.Network;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class V14513365896667116290 {
    public static final Z11244019023321623390 l;
    public static final AtomicLong m;
    public final F4096073349764486348 a;
    public final B13729205492206812220 b;
    public final F4096073349764486348 c;
    public final B13729205492206812220 d;
    public final long e;
    public final long f;
    public long g;
    public G11194384581098170203 h;
    public int i;
    public boolean j;
    public int k;

    static {
        int iOkwfhcziztrp;
        izmyclvb.qgayjvbiagej2(681);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iOkwfhcziztrp = okwfhcziztrp(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iOkwfhcziztrp != 0) {
                switch (iOkwfhcziztrp) {
                    case 1:
                        l = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        m = (AtomicLong) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void gahthfzguewm(F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, F4096073349764486348 f40960733497644863482, B13729205492206812220 b137292054922068122202, O18369580107802500074 o18369580107802500074);

    private static native int okwfhcziztrp(Object[] objArr);

    private native void wyqtzdxmvpkm(F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, F4096073349764486348 f40960733497644863482, B13729205492206812220 b137292054922068122202);

    public final native String a(InetAddress inetAddress);

    public final native void b(int i);

    public final native void c(IOException iOException);

    public final native void d(Network network, InetAddress[] inetAddressArr);

    public final native void e(Network network, Throwable th);

    public final native void f(Exception exc);

    public final native void g(Network network, InetSocketAddress inetSocketAddress);

    public final native void h(G11194384581098170203 g11194384581098170203);

    public final native void i(String str);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(13);
        }

        private native void lwovigwivdzk(O18369580107802500074 o18369580107802500074);

        private native void qjllgulkczog();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            lwovigwivdzk(o18369580107802500074);
        }

        private Z11244019023321623390() {
            qjllgulkczog();
        }
    }

    private V14513365896667116290(F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, F4096073349764486348 f40960733497644863482, B13729205492206812220 b137292054922068122202) {
        wyqtzdxmvpkm(f4096073349764486348, b13729205492206812220, f40960733497644863482, b137292054922068122202);
    }

    public /* synthetic */ V14513365896667116290(F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, F4096073349764486348 f40960733497644863482, B13729205492206812220 b137292054922068122202, O18369580107802500074 o18369580107802500074) {
        this(f4096073349764486348, b13729205492206812220, f40960733497644863482, b137292054922068122202);
        gahthfzguewm(f4096073349764486348, b13729205492206812220, f40960733497644863482, b137292054922068122202, o18369580107802500074);
    }
}
