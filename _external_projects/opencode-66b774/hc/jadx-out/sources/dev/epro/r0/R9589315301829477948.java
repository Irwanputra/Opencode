package dev.epro.r0;

import java.io.Closeable;
import java.io.InputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class R9589315301829477948 implements Closeable {
    public static final /* synthetic */ int m = 0;
    public final InputStream a;
    public final int b;
    public final B13729205492206812220 c;
    public final B13729205492206812220 d;
    public final AtomicBoolean e;
    public final ArrayBlockingQueue f;
    public final ArrayBlockingQueue g;
    public final long h;
    public final Thread i;
    public E13089047702408248942 j;
    public int k;
    public B17939574668016876851 l;

    static {
        izmyclvb.qgayjvbiagej2(1726);
        amkmtxgksryk();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ R9589315301829477948(InputStream inputStream, int i, long j, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, int i2, O18369580107802500074 o18369580107802500074) {
        Object[] objArrJpojmtzmhqjf = jpojmtzmhqjf(inputStream, i, j, b13729205492206812220, b137292054922068122202, i2, o18369580107802500074);
        this((InputStream) objArrJpojmtzmhqjf[0], ((Integer) objArrJpojmtzmhqjf[1]).intValue(), ((Long) objArrJpojmtzmhqjf[2]).longValue(), (B13729205492206812220) objArrJpojmtzmhqjf[3], (B13729205492206812220) objArrJpojmtzmhqjf[4]);
        tusoevmublfw();
    }

    private static native void amkmtxgksryk();

    public static native void h(B17939574668016876851 b17939574668016876851);

    private static native Object[] jpojmtzmhqjf(InputStream inputStream, int i, long j, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, int i2, O18369580107802500074 o18369580107802500074);

    private native void mndoyidbssqh(InputStream inputStream, int i, long j, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202);

    private native void tusoevmublfw();

    public final native B17939574668016876851 b();

    public final native int c(int i, byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final native void close();

    public final native boolean d(B17939574668016876851 b17939574668016876851);

    public final native byte[] e();

    public final native void g(byte[] bArr);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(1262);
        }

        private native void dgljncizilkf(O18369580107802500074 o18369580107802500074);

        private native void nhnsdducicss();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            dgljncizilkf(o18369580107802500074);
        }

        private Z11244019023321623390() {
            nhnsdducicss();
        }
    }

    public R9589315301829477948(InputStream inputStream, int i, long j, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202) {
        inputStream.getClass();
        b13729205492206812220.getClass();
        b137292054922068122202.getClass();
        mndoyidbssqh(inputStream, i, j, b13729205492206812220, b137292054922068122202);
    }
}
