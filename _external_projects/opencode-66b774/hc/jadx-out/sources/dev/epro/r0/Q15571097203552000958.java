package dev.epro.r0;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class Q15571097203552000958 implements AutoCloseable {
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public final E13046209274714950185 a;
    public final B13729205492206812220 b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final O10691870814879360114 g;
    public final Z7310198924934296462 h;
    public final int i;
    public final byte[] j;
    public final AtomicLong k;
    public final L17204527343130899122 l;
    public final String m;
    public final Q11542851217462518598 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final H4069867828596052489 f442o;
    public final AtomicBoolean p;
    public final AtomicLong q;
    public final M12941861773152651783 r;
    public final V15149177536219251726 s;
    public final AtomicBoolean t;
    public final Object u;
    public byte[] v;

    public static final /* synthetic */ class H4191455248956457601 extends H4611829575853284164 implements F4096073349764486348 {
        static {
            izmyclvb.qgayjvbiagej2(1820);
        }

        private native void qutaynjgbzjx();

        @Override // dev.epro.r0.F4096073349764486348
        public final native Object invoke(Object obj);

        public H4191455248956457601(Object obj) {
            super(1, obj, Q15571097203552000958.class, izmyclvb.sb250e956f549(608), izmyclvb.sb250e956f549(609), 0);
            qutaynjgbzjx();
        }
    }

    public static final /* synthetic */ class W6795409416048214137 extends H4611829575853284164 implements L12639328004344855510 {
        static {
            izmyclvb.qgayjvbiagej2(334);
        }

        private native void tihwxsxnixqo();

        @Override // dev.epro.r0.L12639328004344855510
        public final native Object invoke(Object obj, Object obj2);

        public W6795409416048214137(Object obj) {
            super(2, obj, Q15571097203552000958.class, izmyclvb.sb250e956f549(610), izmyclvb.sb250e956f549(611), 0);
            tihwxsxnixqo();
        }
    }

    static {
        int iNjmyzfrjwcif;
        izmyclvb.qgayjvbiagej2(1533);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iNjmyzfrjwcif = njmyzfrjwcif(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iNjmyzfrjwcif != 0) {
                switch (iNjmyzfrjwcif) {
                    case 1:
                        w = (byte[]) objArr[1];
                        continue;
                    case 2:
                        x = (byte[]) objArr[1];
                        continue;
                    case 3:
                        y = (byte[]) objArr[1];
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
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean, int] */
    public /* synthetic */ Q15571097203552000958(E13046209274714950185 e13046209274714950185, B13729205492206812220 b13729205492206812220, SecureRandom secureRandom, long j, int i, int i2, int i3, int i4, boolean z, O10691870814879360114 o10691870814879360114, Z7310198924934296462 z7310198924934296462, boolean z2, int i5, int i6, O18369580107802500074 o18369580107802500074) {
        Object[] objArrPhdnidauvmxw = phdnidauvmxw(e13046209274714950185, b13729205492206812220, secureRandom, j, i, i2, i3, i4, z, o10691870814879360114, z7310198924934296462, z2, i5, i6, o18369580107802500074);
        this((E13046209274714950185) objArrPhdnidauvmxw[0], (B13729205492206812220) objArrPhdnidauvmxw[1], (SecureRandom) objArrPhdnidauvmxw[2], ((Long) objArrPhdnidauvmxw[3]).longValue(), ((Integer) objArrPhdnidauvmxw[4]).intValue(), ((Integer) objArrPhdnidauvmxw[5]).intValue(), ((Integer) objArrPhdnidauvmxw[6]).intValue(), ((Integer) objArrPhdnidauvmxw[7]).intValue(), ((Integer) objArrPhdnidauvmxw[8]).intValue(), (O10691870814879360114) objArrPhdnidauvmxw[9], (Z7310198924934296462) objArrPhdnidauvmxw[10], ((Integer) objArrPhdnidauvmxw[11]).intValue(), ((Integer) objArrPhdnidauvmxw[12]).intValue());
        jgmtribctsht();
    }

    private native void aerldmflgdee(E13046209274714950185 e13046209274714950185, B13729205492206812220 b13729205492206812220, SecureRandom secureRandom, long j, int i, int i2, int i3, int i4, boolean z, O10691870814879360114 o10691870814879360114, Z7310198924934296462 z7310198924934296462, boolean z2, int i5);

    public static native L1776201576658992480 d(Q15571097203552000958 q15571097203552000958, C17200701318093115733 c17200701318093115733, L5444259874081088707 l5444259874081088707, int i, long j, int i2);

    public static native boolean e(IOException iOException);

    public static native void g(L1776201576658992480 l1776201576658992480);

    private native void jgmtribctsht();

    private static native int njmyzfrjwcif(Object[] objArr);

    private static native Object[] phdnidauvmxw(E13046209274714950185 e13046209274714950185, B13729205492206812220 b13729205492206812220, SecureRandom secureRandom, long j, int i, int i2, int i3, int i4, boolean z, O10691870814879360114 o10691870814879360114, Z7310198924934296462 z7310198924934296462, boolean z2, int i5, int i6, O18369580107802500074 o18369580107802500074);

    public final native void b();

    public final native String c();

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native C17200701318093115733 h(X7661261485523370262 x7661261485523370262, long j, byte[] bArr);

    public static final class Y11460403151847909905 {
        public final byte[] a;
        public final byte[] b;

        static {
            izmyclvb.qgayjvbiagej2(1513);
        }

        private native void nyqrrfwkufyx(byte[] bArr, byte[] bArr2);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y11460403151847909905(byte[] bArr, byte[] bArr2) {
            bArr.getClass();
            bArr2.getClass();
            nyqrrfwkufyx(bArr, bArr2);
        }
    }

    public static final class Y6921797927338498306 {
        static {
            izmyclvb.qgayjvbiagej2(2186);
        }

        private native void bshitlnrjoqe();

        private native void qnpdtbmqsfng(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Y6921797927338498306(O18369580107802500074 o18369580107802500074) {
            this();
            qnpdtbmqsfng(o18369580107802500074);
        }

        private Y6921797927338498306() {
            bshitlnrjoqe();
        }
    }

    public static final class Z11244019023321623390 {
        public final byte[] a;
        public final byte[] b;
        public final long c;

        static {
            izmyclvb.qgayjvbiagej2(721);
        }

        private native void zrsksfqsohps(byte[] bArr, byte[] bArr2, long j);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(byte[] bArr, byte[] bArr2, long j) {
            bArr.getClass();
            bArr2.getClass();
            zrsksfqsohps(bArr, bArr2, j);
        }
    }

    public Q15571097203552000958(E13046209274714950185 e13046209274714950185, B13729205492206812220 b13729205492206812220, SecureRandom secureRandom, long j, int i, int i2, int i3, int i4, boolean z, O10691870814879360114 o10691870814879360114, Z7310198924934296462 z7310198924934296462, boolean z2, int i5) {
        e13046209274714950185.getClass();
        b13729205492206812220.getClass();
        secureRandom.getClass();
        o10691870814879360114.getClass();
        z7310198924934296462.getClass();
        aerldmflgdee(e13046209274714950185, b13729205492206812220, secureRandom, j, i, i2, i3, i4, z, o10691870814879360114, z7310198924934296462, z2, i5);
    }
}
