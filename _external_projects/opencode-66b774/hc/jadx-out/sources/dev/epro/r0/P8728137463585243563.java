package dev.epro.r0;

import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class P8728137463585243563 {
    public static final P8728137463585243563 a;

    static {
        int iJyqxmthpxhdt;
        izmyclvb.qgayjvbiagej2(299);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iJyqxmthpxhdt = jyqxmthpxhdt(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iJyqxmthpxhdt != 0) {
                switch (iJyqxmthpxhdt) {
                    case 1:
                        a = (P8728137463585243563) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native H4191455248956457601 a(Y11460403151847909905 y11460403151847909905);

    public static native H4191455248956457601 b(Y11460403151847909905 y11460403151847909905);

    private native void bfszsrqtwfvr();

    public static native void c(Y11460403151847909905 y11460403151847909905, String str);

    public static native Z11244019023321623390 d(Y11460403151847909905 y11460403151847909905);

    public static native H4191455248956457601 e(Y11460403151847909905 y11460403151847909905, Socket socket);

    public static native List f(Y11460403151847909905 y11460403151847909905, Socket socket);

    public static native int g(URL url);

    public static native String h(String str, Y11460403151847909905 y11460403151847909905, int i, String str2);

    public static native String i(OutputStream outputStream, Y11460403151847909905 y11460403151847909905);

    private static native int jyqxmthpxhdt(Object[] objArr);

    public static final class H4191455248956457601 {
        public final int a;
        public final String b;
        public final List c;
        public final String d;
        public final String e;
        public final List f;

        static {
            izmyclvb.qgayjvbiagej2(1236);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ H4191455248956457601(int i, String str, List list, String str2, String str3, List list2, int i2, O18369580107802500074 o18369580107802500074) {
            Object[] objArrKoonxeircltv = koonxeircltv(i, str, list, str2, str3, list2, i2, o18369580107802500074);
            this(((Integer) objArrKoonxeircltv[0]).intValue(), (String) objArrKoonxeircltv[1], (List) objArrKoonxeircltv[2], (String) objArrKoonxeircltv[3], (String) objArrKoonxeircltv[4], (List) objArrKoonxeircltv[5]);
            cjzmmmibefqc();
        }

        public static native H4191455248956457601 a(H4191455248956457601 h4191455248956457601, String str, List list);

        private native void cjzmmmibefqc();

        private static native Object[] koonxeircltv(int i, String str, List list, String str2, String str3, List list2, int i2, O18369580107802500074 o18369580107802500074);

        private native void stsyamfeesyg(int i, String str, List<O3815282298294382053> list, String str2, String str3, List<String> list2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public H4191455248956457601(int i, String str, List<O3815282298294382053> list, String str2, String str3, List<String> list2) {
            str.getClass();
            list.getClass();
            str3.getClass();
            list2.getClass();
            stsyamfeesyg(i, str, list, str2, str3, list2);
        }
    }

    public static final class Y6921797927338498306 {
        public final U14648071519629674379 a;
        public final String b;
        public final int c;
        public final String d;
        public final String e;
        public final boolean f;

        static {
            izmyclvb.qgayjvbiagej2(1442);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
        public /* synthetic */ Y6921797927338498306(U14648071519629674379 u14648071519629674379, String str, int i, String str2, String str3, boolean z, int i2, O18369580107802500074 o18369580107802500074) {
            Object[] objArrGnysnkxvobwg = gnysnkxvobwg(u14648071519629674379, str, i, str2, str3, z, i2, o18369580107802500074);
            this((U14648071519629674379) objArrGnysnkxvobwg[0], (String) objArrGnysnkxvobwg[1], ((Integer) objArrGnysnkxvobwg[2]).intValue(), (String) objArrGnysnkxvobwg[3], (String) objArrGnysnkxvobwg[4], ((Integer) objArrGnysnkxvobwg[5]).intValue());
            fjrbgkstpjpi();
        }

        private native void fjrbgkstpjpi();

        private static native Object[] gnysnkxvobwg(U14648071519629674379 u14648071519629674379, String str, int i, String str2, String str3, boolean z, int i2, O18369580107802500074 o18369580107802500074);

        private native void uvxcpiznfnoy(U14648071519629674379 u14648071519629674379, String str, int i, String str2, String str3, boolean z);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y6921797927338498306(U14648071519629674379 u14648071519629674379, String str, int i, String str2, String str3, boolean z) {
            u14648071519629674379.getClass();
            str.getClass();
            uvxcpiznfnoy(u14648071519629674379, str, i, str2, str3, z);
        }
    }

    public static final class Z11244019023321623390 {
        public final Socket a;
        public final List b;

        static {
            izmyclvb.qgayjvbiagej2(78);
        }

        private native void smyxrnlsrhsa(Socket socket, List<String> list);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(Socket socket, List<String> list) {
            socket.getClass();
            list.getClass();
            smyxrnlsrhsa(socket, list);
        }
    }

    private P8728137463585243563() {
        bfszsrqtwfvr();
    }

    public static final class Y11460403151847909905 {
        public final URL a;
        public final String b;
        public final String c;
        public final List d;
        public final String e;
        public final Y6921797927338498306 f;
        public final boolean g;
        public final int h;
        public final boolean i;
        public final String j;

        static {
            izmyclvb.qgayjvbiagej2(356);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r2v14, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v20, types: [boolean, int] */
        public /* synthetic */ Y11460403151847909905(URL url, String str, String str2, List list, String str3, Y6921797927338498306 y6921797927338498306, boolean z, int i, boolean z2, String str4, int i2, O18369580107802500074 o18369580107802500074) {
            Object[] objArrGhwokaadkhiw = ghwokaadkhiw(url, str, str2, list, str3, y6921797927338498306, z, i, z2, str4, i2, o18369580107802500074);
            this((URL) objArrGhwokaadkhiw[0], (String) objArrGhwokaadkhiw[1], (String) objArrGhwokaadkhiw[2], (List) objArrGhwokaadkhiw[3], (String) objArrGhwokaadkhiw[4], (Y6921797927338498306) objArrGhwokaadkhiw[5], ((Integer) objArrGhwokaadkhiw[6]).intValue(), ((Integer) objArrGhwokaadkhiw[7]).intValue(), ((Integer) objArrGhwokaadkhiw[8]).intValue(), (String) objArrGhwokaadkhiw[9]);
            dyrmznxrvpne();
        }

        private native void dyrmznxrvpne();

        private static native Object[] ghwokaadkhiw(URL url, String str, String str2, List list, String str3, Y6921797927338498306 y6921797927338498306, boolean z, int i, boolean z2, String str4, int i2, O18369580107802500074 o18369580107802500074);

        private native void tmimpzkfvhae(URL url, String str, String str2, List<O3815282298294382053> list, String str3, Y6921797927338498306 y6921797927338498306, boolean z, int i, boolean z2, String str4);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y11460403151847909905(URL url, String str, String str2, List<O3815282298294382053> list, String str3, Y6921797927338498306 y6921797927338498306, boolean z, int i, boolean z2, String str4) {
            url.getClass();
            str.getClass();
            str2.getClass();
            list.getClass();
            tmimpzkfvhae(url, str, str2, list, str3, y6921797927338498306, z, i, z2, str4);
        }
    }
}
