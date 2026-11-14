package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D15369551508841294378 implements java.lang.AutoCloseable {
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public final java.util.concurrent.atomic.AtomicReference A;
    public final java.lang.String a;
    public final int b;
    public final dev.epro.r0.E13046209274714950185 c;
    public final int d;
    public final long e;
    public final long f;
    public final boolean g;
    public final dev.epro.r0.I17469115366493754886 h;
    public final dev.epro.r0.Z7310198924934296462 i;
    public final dev.epro.r0.N5407556009060208754 j;
    public final dev.epro.r0.B13729205492206812220 k;
    public final dev.epro.r0.O8409066218305708966 l;
    public final dev.epro.r0.F4096073349764486348 m;
    public final java.lang.String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f197o;
    public final java.lang.String p;
    public final java.util.concurrent.atomic.AtomicBoolean q;
    public final java.util.concurrent.atomic.AtomicBoolean r;
    public final java.util.concurrent.atomic.AtomicBoolean s;
    public final java.util.concurrent.atomic.AtomicReference t;
    public final java.util.concurrent.atomic.AtomicReference u;
    public final java.util.concurrent.atomic.AtomicReference v;
    public final java.util.Set w;
    public final java.lang.Object x;
    public final java.util.concurrent.CountDownLatch y;
    public final java.util.concurrent.atomic.AtomicReference z;

    public static final /* synthetic */ class Z11244019023321623390 extends dev.epro.r0.H4611829575853284164 implements dev.epro.r0.F4096073349764486348 {
        public static final dev.epro.r0.D15369551508841294378.Z11244019023321623390 h;

        static {
            int iJvjikxndzsof;
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(207);
            java.lang.Object[] objArr = new java.lang.Object[3];
            while (true) {
                try {
                    iJvjikxndzsof = jvjikxndzsof(objArr);
                } finally {
                    java.util.Arrays.fill(objArr, (java.lang.Object) null);
                }
                if (iJvjikxndzsof != 0) {
                    switch (iJvjikxndzsof) {
                        case 1:
                            h = (dev.epro.r0.D15369551508841294378.Z11244019023321623390) objArr[1];
                            break;
                        default:
                            throw null;
                    }
                    java.util.Arrays.fill(objArr, (java.lang.Object) null);
                }
                return;
            }
        }

        private static native int jvjikxndzsof(java.lang.Object[] objArr);

        private native void ztpbbcvpojjb();

        public final native java.lang.Object invoke(java.lang.Object obj);

        public Z11244019023321623390() {
            super(1, dev.epro.r0.Y582199805280922215.class, o.bwmna.gdrqkg.izmyclvb.sb250e956f549(161), o.bwmna.gdrqkg.izmyclvb.sb250e956f549(162), 1);
            ztpbbcvpojjb();
        }
    }

    static {
        int iGovrlmuelxcg;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(227);
        java.lang.Object[] objArr = new java.lang.Object[4];
        while (true) {
            try {
                iGovrlmuelxcg = govrlmuelxcg(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
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
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean, int] */
    public /* synthetic */ D15369551508841294378(java.lang.String str, int i, dev.epro.r0.E13046209274714950185 e13046209274714950185, java.security.SecureRandom secureRandom, int i2, long j, long j2, boolean z, dev.epro.r0.I17469115366493754886 i17469115366493754886, dev.epro.r0.Z7310198924934296462 z7310198924934296462, dev.epro.r0.N5407556009060208754 n5407556009060208754, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.O8409066218305708966 o8409066218305708966, dev.epro.r0.F4096073349764486348 f4096073349764486348, int i3, dev.epro.r0.O18369580107802500074 o18369580107802500074) {
        java.lang.Object[] objArrRfrbmzqdfkih = rfrbmzqdfkih(str, i, e13046209274714950185, secureRandom, i2, j, j2, z, i17469115366493754886, z7310198924934296462, n5407556009060208754, b13729205492206812220, o8409066218305708966, f4096073349764486348, i3, o18369580107802500074);
        this((java.lang.String) objArrRfrbmzqdfkih[0], ((java.lang.Integer) objArrRfrbmzqdfkih[1]).intValue(), (dev.epro.r0.E13046209274714950185) objArrRfrbmzqdfkih[2], (java.security.SecureRandom) objArrRfrbmzqdfkih[3], ((java.lang.Integer) objArrRfrbmzqdfkih[4]).intValue(), ((java.lang.Long) objArrRfrbmzqdfkih[5]).longValue(), ((java.lang.Long) objArrRfrbmzqdfkih[6]).longValue(), ((java.lang.Integer) objArrRfrbmzqdfkih[7]).intValue(), (dev.epro.r0.I17469115366493754886) objArrRfrbmzqdfkih[8], (dev.epro.r0.Z7310198924934296462) objArrRfrbmzqdfkih[9], (dev.epro.r0.N5407556009060208754) objArrRfrbmzqdfkih[10], (dev.epro.r0.B13729205492206812220) objArrRfrbmzqdfkih[11], (dev.epro.r0.O8409066218305708966) objArrRfrbmzqdfkih[12], (dev.epro.r0.F4096073349764486348) objArrRfrbmzqdfkih[13]);
        pdinzvbfijdj();
    }

    public static native void c(java.lang.AutoCloseable autoCloseable);

    public static native void g(java.lang.Thread thread, long j);

    private static native int govrlmuelxcg(java.lang.Object[] objArr);

    public static native dev.epro.r0.S10242751055727588531 o(java.net.Socket socket);

    private native void pdinzvbfijdj();

    private static native java.lang.Object[] rfrbmzqdfkih(java.lang.String str, int i, dev.epro.r0.E13046209274714950185 e13046209274714950185, java.security.SecureRandom secureRandom, int i2, long j, long j2, boolean z, dev.epro.r0.I17469115366493754886 i17469115366493754886, dev.epro.r0.Z7310198924934296462 z7310198924934296462, dev.epro.r0.N5407556009060208754 n5407556009060208754, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.O8409066218305708966 o8409066218305708966, dev.epro.r0.F4096073349764486348 f4096073349764486348, int i3, dev.epro.r0.O18369580107802500074 o18369580107802500074);

    public static native void s(java.net.Socket socket, byte[] bArr);

    private native void vwelhnrbudmu(java.lang.String str, int i, dev.epro.r0.E13046209274714950185 e13046209274714950185, java.security.SecureRandom secureRandom, int i2, long j, long j2, boolean z, dev.epro.r0.I17469115366493754886 i17469115366493754886, dev.epro.r0.Z7310198924934296462 z7310198924934296462, dev.epro.r0.N5407556009060208754 n5407556009060208754, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.O8409066218305708966 o8409066218305708966, dev.epro.r0.F4096073349764486348 f4096073349764486348);

    public final native void b();

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native void d(java.net.Socket socket);

    public final native void e();

    public final native void h(dev.epro.r0.Q15571097203552000958 q15571097203552000958);

    public final native dev.epro.r0.Q15571097203552000958 j();

    public final native dev.epro.r0.I7337137443934124917 p();

    public final native java.lang.Thread q(dev.epro.r0.B13729205492206812220 b13729205492206812220, java.lang.String str, boolean z);

    public static final class Y6921797927338498306 {
        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(80);
        }

        public static native byte[] a(java.lang.String str);

        private native void efovtjcuhawb(dev.epro.r0.O18369580107802500074 o18369580107802500074);

        private native void gspntkgyoeav();

        public /* synthetic */ Y6921797927338498306(dev.epro.r0.O18369580107802500074 o18369580107802500074) {
            this();
            efovtjcuhawb(o18369580107802500074);
        }

        private Y6921797927338498306() {
            gspntkgyoeav();
        }
    }

    public D15369551508841294378(java.lang.String str, int i, dev.epro.r0.E13046209274714950185 e13046209274714950185, java.security.SecureRandom secureRandom, int i2, long j, long j2, boolean z, dev.epro.r0.I17469115366493754886 i17469115366493754886, dev.epro.r0.Z7310198924934296462 z7310198924934296462, dev.epro.r0.N5407556009060208754 n5407556009060208754, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.O8409066218305708966 o8409066218305708966, dev.epro.r0.F4096073349764486348 f4096073349764486348) {
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
