package dev.epro.r0;

import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class M13546338973594881483 {
    public static final Z11244019023321623390 e;
    public static final byte[] f;
    public static final Set g;
    public final URI a;
    public final F4096073349764486348 b;
    public final B13729205492206812220 c;
    public final O12494175665883759871 d;

    static {
        int iDgtshdypagos;
        izmyclvb.dpqpjfpoanwt1(76);
        Object[] objArr = new Object[14];
        while (true) {
            try {
                iDgtshdypagos = dgtshdypagos(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iDgtshdypagos != 0) {
                switch (iDgtshdypagos) {
                    case 1:
                        e = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        f = (byte[]) objArr[1];
                        continue;
                    case 3:
                        g = (Set) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ M13546338973594881483(URI uri, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202, int i, O18369580107802500074 o18369580107802500074) {
        Object[] objArrNerasuqfjlyg = nerasuqfjlyg(uri, b13729205492206812220, f4096073349764486348, b137292054922068122202, i, o18369580107802500074);
        this((URI) objArrNerasuqfjlyg[0], (B13729205492206812220) objArrNerasuqfjlyg[1], (F4096073349764486348) objArrNerasuqfjlyg[2], (B13729205492206812220) objArrNerasuqfjlyg[3]);
        eqztfeqzhwgw1();
    }

    public static native byte[] a(String str, String str2, String str3, String str4);

    public static native K15455132743820483959 d(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, String str2, String str3, String str4);

    private static native int dgtshdypagos(Object[] objArr);

    private native void eqztfeqzhwgw();

    private native void eqztfeqzhwgw1();

    public static native byte[] g(InputStream inputStream);

    public static native void i(String str, JSONObject jSONObject);

    private static native Object[] nerasuqfjlyg(URI uri, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202, int i, O18369580107802500074 o18369580107802500074);

    private native void uteahxhbjhmb(URI uri, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202);

    public final native String b(String str, String str2);

    public final native K15455132743820483959 c(String str, JSONObject jSONObject);

    public final native byte[] e(byte[] bArr);

    public final native K15455132743820483959 f(int i, String str, String str2);

    public final native K15455132743820483959 h(String str);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(914);
        }

        public static native String a(String str);

        public static native boolean b(char c);

        private native void iqssojmfjepe();

        private native void redvjnyzuqxm(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            redvjnyzuqxm(o18369580107802500074);
        }

        private Z11244019023321623390() {
            iqssojmfjepe();
        }
    }

    public M13546338973594881483(URI uri, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202) {
        uri.getClass();
        b13729205492206812220.getClass();
        f4096073349764486348.getClass();
        b137292054922068122202.getClass();
        uteahxhbjhmb(uri, b13729205492206812220, f4096073349764486348, b137292054922068122202);
    }

    public M13546338973594881483() {
        this(null, null, null, null, 15, null);
        eqztfeqzhwgw();
    }
}
