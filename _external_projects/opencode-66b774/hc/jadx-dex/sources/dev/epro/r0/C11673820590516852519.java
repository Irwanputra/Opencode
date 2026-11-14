package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C11673820590516852519 {
    public static final dev.epro.r0.M2425720958364073225 e;
    public final java.util.concurrent.atomic.AtomicBoolean a;
    public final java.util.concurrent.ConcurrentHashMap b;
    public final dev.epro.r0.E13829039841835146305 c;
    public final java.util.concurrent.ScheduledThreadPoolExecutor d;

    static {
        int iOadhzjtedqfm;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(347);
        java.lang.Object[] objArr = new java.lang.Object[4];
        while (true) {
            try {
                iOadhzjtedqfm = oadhzjtedqfm(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iOadhzjtedqfm != 0) {
                switch (iOadhzjtedqfm) {
                    case 1:
                        e = (dev.epro.r0.M2425720958364073225) objArr[1];
                        break;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    private native void mlebunmrrqig();

    private static native int oadhzjtedqfm(java.lang.Object[] objArr);

    public final native void a(dev.epro.r0.X7661261485523370262 x7661261485523370262);

    public final native void b(long j, byte[] bArr);

    public final native void c();

    public final native void d();

    public final native void e(java.net.Socket socket, dev.epro.r0.X7661261485523370262 x7661261485523370262);

    public final native dev.epro.r0.E13829039841835146305.Z11244019023321623390 f(java.net.Socket socket, dev.epro.r0.C17200701318093115733 c17200701318093115733);

    public final native void g(java.net.Socket socket);

    public final native void h(java.net.Socket socket);

    public final native java.lang.AutoCloseable i(java.net.Socket socket, dev.epro.r0.R10697907419429218602 r10697907419429218602);

    public static final class Y6921797927338498306 implements java.lang.AutoCloseable {
        public final java.util.concurrent.Future a;

        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(867);
        }

        private native void whrayxionjtq(java.util.concurrent.Future<?> future);

        @Override // java.lang.AutoCloseable
        public final native void close();

        public Y6921797927338498306(java.util.concurrent.Future<?> future) {
            future.getClass();
            whrayxionjtq(future);
        }
    }

    public static final class Z11244019023321623390 {
        static {
            o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(744);
        }

        private native void jjnkfurepqiw();

        private native void ullncxvphfih(dev.epro.r0.O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(dev.epro.r0.O18369580107802500074 o18369580107802500074) {
            this();
            ullncxvphfih(o18369580107802500074);
        }

        private Z11244019023321623390() {
            jjnkfurepqiw();
        }
    }

    public C11673820590516852519() {
        mlebunmrrqig();
    }
}
