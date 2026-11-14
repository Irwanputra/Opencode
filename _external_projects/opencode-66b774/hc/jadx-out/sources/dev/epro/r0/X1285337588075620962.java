package dev.epro.r0;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class X1285337588075620962 extends InputStream {
    public static final byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H5336160545165318150 f570o;
    public final V5936968692107839754 a;
    public final F4096073349764486348 b;
    public final B13729205492206812220 c;
    public final B13729205492206812220 d;
    public final V5962473127612511307 e;
    public final F4096073349764486348 f;
    public final PushbackInputStream g;
    public final ArrayDeque h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    static {
        int iXvyagakqyund;
        izmyclvb.qgayjvbiagej2(152);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                iXvyagakqyund = xvyagakqyund(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iXvyagakqyund != 0) {
                switch (iXvyagakqyund) {
                    case 1:
                        n = (byte[]) objArr[1];
                        continue;
                    case 2:
                        f570o = (H5336160545165318150) objArr[1];
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
    public /* synthetic */ X1285337588075620962(InputStream inputStream, V5936968692107839754 v5936968692107839754, List list, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, V5962473127612511307 v5962473127612511307, F4096073349764486348 f40960733497644863482, int i, O18369580107802500074 o18369580107802500074) {
        Object[] objArrTjpofetbvunx = tjpofetbvunx(inputStream, v5936968692107839754, list, f4096073349764486348, b13729205492206812220, b137292054922068122202, v5962473127612511307, f40960733497644863482, i, o18369580107802500074);
        this((InputStream) objArrTjpofetbvunx[0], (V5936968692107839754) objArrTjpofetbvunx[1], (List) objArrTjpofetbvunx[2], (F4096073349764486348) objArrTjpofetbvunx[3], (B13729205492206812220) objArrTjpofetbvunx[4], (B13729205492206812220) objArrTjpofetbvunx[5], (V5962473127612511307) objArrTjpofetbvunx[6], (F4096073349764486348) objArrTjpofetbvunx[7]);
        sitbgvlapkad();
    }

    private native void ikualhdzsmrf(InputStream inputStream, V5936968692107839754 v5936968692107839754, List<String> list, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, V5962473127612511307 v5962473127612511307, F4096073349764486348 f40960733497644863482);

    private native void sitbgvlapkad();

    private static native Object[] tjpofetbvunx(InputStream inputStream, V5936968692107839754 v5936968692107839754, List list, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, V5962473127612511307 v5962473127612511307, F4096073349764486348 f40960733497644863482, int i, O18369580107802500074 o18369580107802500074);

    private static native int xvyagakqyund(Object[] objArr);

    @Override // java.io.InputStream
    public final native int available();

    public final native void b(long j);

    public final native void c();

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final native void close();

    public final native void d();

    public final native String e();

    public final native Y6921797927338498306 g();

    public final native void h();

    public final native boolean j();

    public final native void o();

    @Override // java.io.InputStream
    public final native int read();

    @Override // java.io.InputStream
    public final native int read(byte[] bArr, int i, int i2);

    public static final class Y6921797927338498306 {
        public final String a;
        public final int b;
        public final Long c;
        public final boolean d;

        static {
            izmyclvb.qgayjvbiagej2(2091);
        }

        private native void opbdntqfnrtv(String str, int i, Long l, boolean z);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y6921797927338498306(String str, int i, Long l, boolean z) {
            str.getClass();
            opbdntqfnrtv(str, i, l, z);
        }
    }

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(2154);
        }

        private native void anoaduxulqsa(O18369580107802500074 o18369580107802500074);

        private native void kascmoxndwou();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            anoaduxulqsa(o18369580107802500074);
        }

        private Z11244019023321623390() {
            kascmoxndwou();
        }
    }

    public X1285337588075620962(InputStream inputStream, V5936968692107839754 v5936968692107839754, List<String> list, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, V5962473127612511307 v5962473127612511307, F4096073349764486348 f40960733497644863482) {
        inputStream.getClass();
        v5936968692107839754.getClass();
        list.getClass();
        f4096073349764486348.getClass();
        b13729205492206812220.getClass();
        b137292054922068122202.getClass();
        f40960733497644863482.getClass();
        ikualhdzsmrf(inputStream, v5936968692107839754, list, f4096073349764486348, b13729205492206812220, b137292054922068122202, v5962473127612511307, f40960733497644863482);
    }
}
