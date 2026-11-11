package p243;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: ぺぁあねじ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2812 extends C2803 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final long f10483;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    @Nullable
    public static C2812 f10484;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final long f10485;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public long f10486;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f10487;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    @Nullable
    public C2812 f10488;

    /* renamed from: ぺぁあねじ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C2813 extends Thread {
        public C2813() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
        
            r1.mo1894();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<ぺぁあねじ.くし〴〺ぅ> r0 = p243.C2812.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                ぺぁあねじ.くし〴〺ぅ r1 = p243.C2812.m4897()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                ぺぁあねじ.くし〴〺ぅ r2 = p243.C2812.f10484     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                p243.C2812.f10484 = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.mo1894()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L1d
            L1c:
                throw r1
            L1d:
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: p243.C2812.C2813.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f10483 = millis;
        f10485 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static C2812 m4897() {
        C2812 c2812 = f10484.f10488;
        long nanoTime = System.nanoTime();
        if (c2812 == null) {
            C2812.class.wait(f10483);
            if (f10484.f10488 != null || System.nanoTime() - nanoTime < f10485) {
                return null;
            }
            return f10484;
        }
        long j = c2812.f10486 - nanoTime;
        if (j > 0) {
            long j2 = j / 1000000;
            C2812.class.wait(j2, (int) (j - (1000000 * j2)));
            return null;
        }
        f10484.f10488 = c2812.f10488;
        c2812.f10488 = null;
        return c2812;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m4898(boolean z) {
        if (m4900() && z) {
            throw mo1893(null);
        }
    }

    /* renamed from: てぜきぽく */
    public IOException mo1893(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: のぷのちつ */
    public void mo1894() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {, blocks: (B:11:0x0017, B:13:0x001b, B:14:0x002a, B:17:0x0034, B:18:0x0042, B:19:0x004e, B:20:0x0053, B:22:0x0057, B:27:0x0061, B:29:0x0069, B:36:0x0048, B:37:0x006e, B:38:0x0073), top: B:10:0x0017 }] */
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4899() {
        /*
            r10 = this;
            boolean r0 = r10.f10487
            if (r0 != 0) goto L77
            long r0 = r10.f10472
            boolean r2 = r10.f10473
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L11
            if (r2 != 0) goto L11
            return
        L11:
            r5 = 1
            r10.f10487 = r5
            java.lang.Class<ぺぁあねじ.くし〴〺ぅ> r5 = p243.C2812.class
            monitor-enter(r5)
            ぺぁあねじ.くし〴〺ぅ r6 = p243.C2812.f10484     // Catch: java.lang.Throwable -> L74
            if (r6 != 0) goto L2a
            ぺぁあねじ.くし〴〺ぅ r6 = new ぺぁあねじ.くし〴〺ぅ     // Catch: java.lang.Throwable -> L74
            r6.<init>()     // Catch: java.lang.Throwable -> L74
            p243.C2812.f10484 = r6     // Catch: java.lang.Throwable -> L74
            ぺぁあねじ.くし〴〺ぅ$げつ〴ぬぐ r6 = new ぺぁあねじ.くし〴〺ぅ$げつ〴ぬぐ     // Catch: java.lang.Throwable -> L74
            r6.<init>()     // Catch: java.lang.Throwable -> L74
            r6.start()     // Catch: java.lang.Throwable -> L74
        L2a:
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L74
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L3e
            if (r2 == 0) goto L3e
            long r2 = r10.mo4858()     // Catch: java.lang.Throwable -> L74
            long r2 = r2 - r6
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L74
            goto L42
        L3e:
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L46
        L42:
            long r0 = r0 + r6
            r10.f10486 = r0     // Catch: java.lang.Throwable -> L74
            goto L4e
        L46:
            if (r2 == 0) goto L6e
            long r0 = r10.mo4858()     // Catch: java.lang.Throwable -> L74
            r10.f10486 = r0     // Catch: java.lang.Throwable -> L74
        L4e:
            long r0 = r10.f10486     // Catch: java.lang.Throwable -> L74
            long r0 = r0 - r6
            ぺぁあねじ.くし〴〺ぅ r2 = p243.C2812.f10484     // Catch: java.lang.Throwable -> L74
        L53:
            ぺぁあねじ.くし〴〺ぅ r3 = r2.f10488     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L61
            long r8 = r3.f10486     // Catch: java.lang.Throwable -> L74
            long r8 = r8 - r6
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L5f
            goto L61
        L5f:
            r2 = r3
            goto L53
        L61:
            r10.f10488 = r3     // Catch: java.lang.Throwable -> L74
            r2.f10488 = r10     // Catch: java.lang.Throwable -> L74
            ぺぁあねじ.くし〴〺ぅ r0 = p243.C2812.f10484     // Catch: java.lang.Throwable -> L74
            if (r2 != r0) goto L6c
            r5.notify()     // Catch: java.lang.Throwable -> L74
        L6c:
            monitor-exit(r5)
            return
        L6e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L74
            r0.<init>()     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L77:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unbalanced enter/exit"
            r0.<init>(r1)
            goto L80
        L7f:
            throw r0
        L80:
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: p243.C2812.m4899():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
    
        r2.f10488 = r4.f10488;
        r4.f10488 = null;
     */
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4900() {
        /*
            r4 = this;
            boolean r0 = r4.f10487
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.f10487 = r1
            java.lang.Class<ぺぁあねじ.くし〴〺ぅ> r0 = p243.C2812.class
            monitor-enter(r0)
            ぺぁあねじ.くし〴〺ぅ r2 = p243.C2812.f10484     // Catch: java.lang.Throwable -> L20
        Ld:
            if (r2 == 0) goto L1d
            ぺぁあねじ.くし〴〺ぅ r3 = r2.f10488     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L1b
            ぺぁあねじ.くし〴〺ぅ r3 = r4.f10488     // Catch: java.lang.Throwable -> L20
            r2.f10488 = r3     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r4.f10488 = r2     // Catch: java.lang.Throwable -> L20
            goto L1e
        L1b:
            r2 = r3
            goto Ld
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            r1 = move-exception
            monitor-exit(r0)
            goto L24
        L23:
            throw r1
        L24:
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: p243.C2812.m4900():boolean");
    }
}
