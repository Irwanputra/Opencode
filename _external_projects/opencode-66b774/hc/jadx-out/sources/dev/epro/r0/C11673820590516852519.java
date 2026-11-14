package dev.epro.r0;

import dev.epro.r0.E13829039841835146305;
import java.net.Socket;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class C11673820590516852519 {
    public static final M2425720958364073225 e;
    public final AtomicBoolean a;
    public final ConcurrentHashMap b;
    public final E13829039841835146305 c;
    public final ScheduledThreadPoolExecutor d;

    static {
        int iOadhzjtedqfm;
        izmyclvb.oeynnivvrnts0(347);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iOadhzjtedqfm = oadhzjtedqfm(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iOadhzjtedqfm != 0) {
                switch (iOadhzjtedqfm) {
                    case 1:
                        e = (M2425720958364073225) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void mlebunmrrqig();

    private static native int oadhzjtedqfm(Object[] objArr);

    public final native void a(X7661261485523370262 x7661261485523370262);

    public final native void b(long j, byte[] bArr);

    public final native void c();

    public final native void d();

    public final native void e(Socket socket, X7661261485523370262 x7661261485523370262);

    public final native E13829039841835146305.Z11244019023321623390 f(Socket socket, C17200701318093115733 c17200701318093115733);

    public final native void g(Socket socket);

    public final native void h(Socket socket);

    public final native AutoCloseable i(Socket socket, R10697907419429218602 r10697907419429218602);

    public static final class Y6921797927338498306 implements AutoCloseable {
        public final Future a;

        static {
            izmyclvb.oeynnivvrnts0(867);
        }

        private native void whrayxionjtq(Future<?> future);

        @Override // java.lang.AutoCloseable
        public final native void close();

        public Y6921797927338498306(Future<?> future) {
            future.getClass();
            whrayxionjtq(future);
        }
    }

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.oeynnivvrnts0(744);
        }

        private native void jjnkfurepqiw();

        private native void ullncxvphfih(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
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
