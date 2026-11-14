package dev.epro.r0;

import java.net.Socket;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class D15369551508841294378 implements AutoCloseable {
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public final AtomicReference A;
    public final String a;
    public final int b;
    public final E13046209274714950185 c;
    public final int d;
    public final long e;
    public final long f;
    public final boolean g;
    public final I17469115366493754886 h;
    public final Z7310198924934296462 i;
    public final N5407556009060208754 j;
    public final B13729205492206812220 k;
    public final O8409066218305708966 l;
    public final F4096073349764486348 m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f197o;
    public final String p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final AtomicBoolean s;
    public final AtomicReference t;
    public final AtomicReference u;
    public final AtomicReference v;
    public final Set w;
    public final Object x;
    public final CountDownLatch y;
    public final AtomicReference z;

    public static final /* synthetic */ class Z11244019023321623390 extends H4611829575853284164 implements F4096073349764486348 {
        public static final Z11244019023321623390 h;

        static {
            int iJvjikxndzsof;
            izmyclvb.oeynnivvrnts0(207);
            Object[] objArr = new Object[3];
            while (true) {
                try {
                    iJvjikxndzsof = jvjikxndzsof(objArr);
                } finally {
                    Arrays.fill(objArr, (Object) null);
                }
                if (iJvjikxndzsof != 0) {
                    switch (iJvjikxndzsof) {
                        case 1:
                            h = (Z11244019023321623390) objArr[1];
                            break;
                        default:
                            throw null;
                    }
                    Arrays.fill(objArr, (Object) null);
                }
                return;
            }
        }

        private static native int jvjikxndzsof(Object[] objArr);

        private native void ztpbbcvpojjb();

        @Override // dev.epro.r0.F4096073349764486348
        public final native Object invoke(Object obj);

        public Z11244019023321623390() {
            super(1, Y582199805280922215.class, izmyclvb.sb250e956f549(161), izmyclvb.sb250e956f549(162), 1);
            ztpbbcvpojjb();
        }
    }

    static {
        int iGovrlmuelxcg;
        izmyclvb.oeynnivvrnts0(227);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iGovrlmuelxcg = govrlmuelxcg(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iGovrlmuelxcg != 0) {
                switch (iGovrlmuelxcg) {
                    case 1:
                        B = (byte[]) objArr[1];
                        continue;
                    case 2:
                        C = (byte[]) objArr[1];
                        continue;
                    case 3:
                        D = (byte[]) objArr[1];
                        continue;
                    case 4:
                        E = (byte[]) objArr[1];
                        continue;
                    case 5:
                        F = (byte[]) objArr[1];
                        continue;
                    case 6:
                        G = (byte[]) objArr[1];
                        continue;
                    case 7:
                        H = (byte[]) objArr[1];
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
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean, int] */
    public /* synthetic */ D15369551508841294378(String str, int i, E13046209274714950185 e13046209274714950185, SecureRandom secureRandom, int i2, long j, long j2, boolean z, I17469115366493754886 i17469115366493754886, Z7310198924934296462 z7310198924934296462, N5407556009060208754 n5407556009060208754, B13729205492206812220 b13729205492206812220, O8409066218305708966 o8409066218305708966, F4096073349764486348 f4096073349764486348, int i3, O18369580107802500074 o18369580107802500074) {
        Object[] objArrRfrbmzqdfkih = rfrbmzqdfkih(str, i, e13046209274714950185, secureRandom, i2, j, j2, z, i17469115366493754886, z7310198924934296462, n5407556009060208754, b13729205492206812220, o8409066218305708966, f4096073349764486348, i3, o18369580107802500074);
        this((String) objArrRfrbmzqdfkih[0], ((Integer) objArrRfrbmzqdfkih[1]).intValue(), (E13046209274714950185) objArrRfrbmzqdfkih[2], (SecureRandom) objArrRfrbmzqdfkih[3], ((Integer) objArrRfrbmzqdfkih[4]).intValue(), ((Long) objArrRfrbmzqdfkih[5]).longValue(), ((Long) objArrRfrbmzqdfkih[6]).longValue(), ((Integer) objArrRfrbmzqdfkih[7]).intValue(), (I17469115366493754886) objArrRfrbmzqdfkih[8], (Z7310198924934296462) objArrRfrbmzqdfkih[9], (N5407556009060208754) objArrRfrbmzqdfkih[10], (B13729205492206812220) objArrRfrbmzqdfkih[11], (O8409066218305708966) objArrRfrbmzqdfkih[12], (F4096073349764486348) objArrRfrbmzqdfkih[13]);
        pdinzvbfijdj();
    }

    public static native void c(AutoCloseable autoCloseable);

    public static native void g(Thread thread, long j);

    private static native int govrlmuelxcg(Object[] objArr);

    public static native S10242751055727588531 o(Socket socket);

    private native void pdinzvbfijdj();

    private static native Object[] rfrbmzqdfkih(String str, int i, E13046209274714950185 e13046209274714950185, SecureRandom secureRandom, int i2, long j, long j2, boolean z, I17469115366493754886 i17469115366493754886, Z7310198924934296462 z7310198924934296462, N5407556009060208754 n5407556009060208754, B13729205492206812220 b13729205492206812220, O8409066218305708966 o8409066218305708966, F4096073349764486348 f4096073349764486348, int i3, O18369580107802500074 o18369580107802500074);

    public static native void s(Socket socket, byte[] bArr);

    private native void vwelhnrbudmu(String str, int i, E13046209274714950185 e13046209274714950185, SecureRandom secureRandom, int i2, long j, long j2, boolean z, I17469115366493754886 i17469115366493754886, Z7310198924934296462 z7310198924934296462, N5407556009060208754 n5407556009060208754, B13729205492206812220 b13729205492206812220, O8409066218305708966 o8409066218305708966, F4096073349764486348 f4096073349764486348);

    public final native void b();

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native void d(Socket socket);

    public final native void e();

    public final native void h(Q15571097203552000958 q15571097203552000958);

    public final native Q15571097203552000958 j();

    public final native I7337137443934124917 p();

    public final native Thread q(B13729205492206812220 b13729205492206812220, String str, boolean z);

    public static final class Y6921797927338498306 {
        static {
            izmyclvb.oeynnivvrnts0(80);
        }

        public static native byte[] a(String str);

        private native void efovtjcuhawb(O18369580107802500074 o18369580107802500074);

        private native void gspntkgyoeav();

        public /* synthetic */ Y6921797927338498306(O18369580107802500074 o18369580107802500074) {
            this();
            efovtjcuhawb(o18369580107802500074);
        }

        private Y6921797927338498306() {
            gspntkgyoeav();
        }
    }

    public D15369551508841294378(String str, int i, E13046209274714950185 e13046209274714950185, SecureRandom secureRandom, int i2, long j, long j2, boolean z, I17469115366493754886 i17469115366493754886, Z7310198924934296462 z7310198924934296462, N5407556009060208754 n5407556009060208754, B13729205492206812220 b13729205492206812220, O8409066218305708966 o8409066218305708966, F4096073349764486348 f4096073349764486348) {
        str.getClass();
        e13046209274714950185.getClass();
        secureRandom.getClass();
        i17469115366493754886.getClass();
        z7310198924934296462.getClass();
        n5407556009060208754.getClass();
        b13729205492206812220.getClass();
        f4096073349764486348.getClass();
        vwelhnrbudmu(str, i, e13046209274714950185, secureRandom, i2, j, j2, z, i17469115366493754886, z7310198924934296462, n5407556009060208754, b13729205492206812220, o8409066218305708966, f4096073349764486348);
    }
}
