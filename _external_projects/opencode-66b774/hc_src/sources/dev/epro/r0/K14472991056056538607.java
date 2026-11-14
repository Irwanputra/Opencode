package dev.epro.r0;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class K14472991056056538607 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f325o = 0;
    public final int a;
    public final B13729205492206812220 b;
    public final L12639328004344855510 c;
    public final F4096073349764486348 d;
    public final B13729205492206812220 e;
    public final B13729205492206812220 f;
    public final long g;
    public final long h;
    public final B13729205492206812220 i;
    public final F4096073349764486348 j;
    public final H4069867828596052489 k;
    public final int l;
    public final Q11542851217462518598 m;
    public final long n;

    public static final /* synthetic */ class Z11244019023321623390 extends H4611829575853284164 implements F4096073349764486348 {
        public static final Z11244019023321623390 h;

        static {
            int crghxxuhyqcv;
            izmyclvb.dpqpjfpoanwt1(1784);
            Object[] objArr = new Object[3];
            while (true) {
                try {
                    crghxxuhyqcv = crghxxuhyqcv(objArr);
                } finally {
                    Arrays.fill(objArr, (Object) null);
                }
                if (crghxxuhyqcv != 0) {
                    switch (crghxxuhyqcv) {
                        case 1:
                            h = (Z11244019023321623390) objArr[1];
                        default:
                            throw null;
                    }
                    Arrays.fill(objArr, (Object) null);
                }
                return;
            }
        }

        private static native int crghxxuhyqcv(Object[] objArr);

        private native void ppbdoxdyfwet();

        @Override // dev.epro.r0.F4096073349764486348
        public final native Object invoke(Object obj);

        public Z11244019023321623390() {
            super(1, Thread.class, izmyclvb.sb250e956f549(253), izmyclvb.sb250e956f549(254), 0);
            ppbdoxdyfwet();
        }
    }

    static {
        izmyclvb.dpqpjfpoanwt1(502);
        xqunsytevcgh();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ K14472991056056538607(int r64, int r65, dev.epro.r0.B13729205492206812220 r66, dev.epro.r0.L12639328004344855510 r67, dev.epro.r0.F4096073349764486348 r68, dev.epro.r0.B13729205492206812220 r69, dev.epro.r0.B13729205492206812220 r70, long r71, long r73, dev.epro.r0.B13729205492206812220 r75, dev.epro.r0.F4096073349764486348 r76, dev.epro.r0.H4069867828596052489 r77, int r78, dev.epro.r0.Q11542851217462518598 r79, int r80, dev.epro.r0.O18369580107802500074 r81) {
        /*
            r63 = this;
            r24 = r63
            r25 = r64
            r26 = r65
            r27 = r66
            r28 = r67
            r29 = r68
            r30 = r69
            r31 = r70
            r32 = r71
            r34 = r73
            r36 = r75
            r37 = r76
            r38 = r77
            r39 = r78
            r40 = r79
            r41 = r80
            r42 = r81
            r43 = r24
            java.lang.Object[] r0 = ufdlospmqzkj(r64, r65, r66, r67, r68, r69, r70, r71, r73, r75, r76, r77, r78, r79, r80, r81)
            r1 = 0
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8 = r2
            r1 = 1
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r9 = r2
            r1 = 2
            r2 = r0[r1]
            dev.epro.r0.B13729205492206812220 r2 = (dev.epro.r0.B13729205492206812220) r2
            r10 = r2
            r1 = 3
            r2 = r0[r1]
            dev.epro.r0.L12639328004344855510 r2 = (dev.epro.r0.L12639328004344855510) r2
            r11 = r2
            r1 = 4
            r2 = r0[r1]
            dev.epro.r0.F4096073349764486348 r2 = (dev.epro.r0.F4096073349764486348) r2
            r12 = r2
            r1 = 5
            r2 = r0[r1]
            dev.epro.r0.B13729205492206812220 r2 = (dev.epro.r0.B13729205492206812220) r2
            r13 = r2
            r1 = 6
            r2 = r0[r1]
            dev.epro.r0.B13729205492206812220 r2 = (dev.epro.r0.B13729205492206812220) r2
            r14 = r2
            r1 = 7
            r2 = r0[r1]
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r15 = r2
            r1 = 8
            r2 = r0[r1]
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r17 = r2
            r1 = 9
            r2 = r0[r1]
            dev.epro.r0.B13729205492206812220 r2 = (dev.epro.r0.B13729205492206812220) r2
            r19 = r2
            r1 = 10
            r2 = r0[r1]
            dev.epro.r0.F4096073349764486348 r2 = (dev.epro.r0.F4096073349764486348) r2
            r20 = r2
            r1 = 11
            r2 = r0[r1]
            dev.epro.r0.H4069867828596052489 r2 = (dev.epro.r0.H4069867828596052489) r2
            r21 = r2
            r1 = 12
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r22 = r2
            r1 = 13
            r2 = r0[r1]
            dev.epro.r0.Q11542851217462518598 r2 = (dev.epro.r0.Q11542851217462518598) r2
            r23 = r2
            r7 = r43
            r44 = r7
            r45 = r8
            r46 = r9
            r47 = r10
            r48 = r11
            r49 = r12
            r50 = r13
            r51 = r14
            r52 = r15
            r54 = r17
            r56 = r19
            r57 = r20
            r58 = r21
            r59 = r22
            r60 = r23
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r54, r56, r57, r58, r59, r60)
            r44 = r7
            r44.jxsuqebwgtoy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K14472991056056538607.<init>(int, int, dev.epro.r0.B13729205492206812220, dev.epro.r0.L12639328004344855510, dev.epro.r0.F4096073349764486348, dev.epro.r0.B13729205492206812220, dev.epro.r0.B13729205492206812220, long, long, dev.epro.r0.B13729205492206812220, dev.epro.r0.F4096073349764486348, dev.epro.r0.H4069867828596052489, int, dev.epro.r0.Q11542851217462518598, int, dev.epro.r0.O18369580107802500074):void");
    }

    public static native void d(H4191455248956457601 h4191455248956457601, Throwable th);

    public static native boolean f(H4191455248956457601 h4191455248956457601, long j, I2317137612466095358 i2317137612466095358, boolean z);

    public static native void h(H4191455248956457601 h4191455248956457601, HashMap hashMap);

    public static native void i(I2317137612466095358 i2317137612466095358);

    private native void jxsuqebwgtoy();

    public static native void k(Throwable th);

    private native void pmfwqibrqbgs(int i, int i2, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, long j, long j2, B13729205492206812220 b137292054922068122204, F4096073349764486348 f40960733497644863482, H4069867828596052489 h4069867828596052489, int i3, Q11542851217462518598 q11542851217462518598);

    private static native Object[] ufdlospmqzkj(int i, int i2, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, long j, long j2, B13729205492206812220 b137292054922068122204, F4096073349764486348 f40960733497644863482, H4069867828596052489 h4069867828596052489, int i3, Q11542851217462518598 q11542851217462518598, int i4, O18369580107802500074 o18369580107802500074);

    private static native void xqunsytevcgh();

    public final native boolean a(H4191455248956457601 h4191455248956457601, int i);

    public final native Y6921797927338498306 b(H4191455248956457601 h4191455248956457601);

    public final native boolean c(OutputStream outputStream, H4191455248956457601 h4191455248956457601, HashMap hashMap, D16332389733167563673 d16332389733167563673);

    public final native I2317137612466095358 e(H4191455248956457601 h4191455248956457601, long j, int i, AtomicInteger atomicInteger);

    public final native void g(OutputStream outputStream);

    public final native void j(H4191455248956457601 h4191455248956457601, ArrayList arrayList);

    public static final class H4191455248956457601 {
        public final int a;
        public final Semaphore b;
        public final ArrayBlockingQueue c;
        public final CountDownLatch d;
        public final AtomicReference e;
        public final AtomicBoolean f;
        public boolean g;
        public final AtomicLong h;
        public final AtomicLong i;
        public final Object j;

        static {
            izmyclvb.dpqpjfpoanwt1(529);
        }

        private native void lhqybuvetcse(int i, int i2, int i3, long j);

        public H4191455248956457601(int i, int i2, int i3, long j) {
            lhqybuvetcse(i, i2, i3, j);
        }
    }

    public static final class K5271540294206541871 {
        public final long a;
        public final boolean b;

        static {
            izmyclvb.dpqpjfpoanwt1(624);
        }

        private native void jgfabhbqyiri(long j, boolean z);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public K5271540294206541871(long j, boolean z) {
            jgfabhbqyiri(j, z);
        }
    }

    public static final class W6795409416048214137 {
        public final long a;
        public final I2317137612466095358 b;
        public final boolean c;

        static {
            izmyclvb.dpqpjfpoanwt1(223);
        }

        private native void srxgmegtanvg(long j, I2317137612466095358 i2317137612466095358, boolean z);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public W6795409416048214137(long j, I2317137612466095358 i2317137612466095358, boolean z) {
            i2317137612466095358.getClass();
            srxgmegtanvg(j, i2317137612466095358, z);
        }
    }

    public static final class Y11460403151847909905 {
        static {
            izmyclvb.dpqpjfpoanwt1(880);
        }

        private native void kjfdsbhzlxbs();

        private native void llzxthbzwckq(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Y11460403151847909905(O18369580107802500074 o18369580107802500074) {
            this();
            llzxthbzwckq(o18369580107802500074);
        }

        private Y11460403151847909905() {
            kjfdsbhzlxbs();
        }
    }

    public static final class Y6921797927338498306 {
        public final long a;
        public final int b;

        static {
            izmyclvb.dpqpjfpoanwt1(211);
        }

        private native void nzsrfcfnmyqy(long j, int i);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y6921797927338498306(long j, int i) {
            nzsrfcfnmyqy(j, i);
        }
    }

    public K14472991056056538607(int i, int i2, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, long j, long j2, B13729205492206812220 b137292054922068122204, F4096073349764486348 f40960733497644863482, H4069867828596052489 h4069867828596052489, int i3, Q11542851217462518598 q11542851217462518598) {
        b13729205492206812220.getClass();
        l12639328004344855510.getClass();
        f4096073349764486348.getClass();
        b137292054922068122202.getClass();
        b137292054922068122203.getClass();
        b137292054922068122204.getClass();
        f40960733497644863482.getClass();
        h4069867828596052489.getClass();
        pmfwqibrqbgs(i, i2, b13729205492206812220, l12639328004344855510, f4096073349764486348, b137292054922068122202, b137292054922068122203, j, j2, b137292054922068122204, f40960733497644863482, h4069867828596052489, i3, q11542851217462518598);
    }
}
