package p000.p001.p008;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.p001.AbstractRunnableC0607;
import p000.p001.C0629;
import p000.p001.ThreadFactoryC0651;
import p000.p001.p008.C0668;
import p243.InterfaceC2805;
import p243.InterfaceC2823;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0654 implements Closeable {

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static final ExecutorService f4432;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f4433;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean f4434;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f4435;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final ExecutorService f4436;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final C0673 f4437;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f4438;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final AbstractC0660 f4440;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final C0659 f4441;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final Set<Integer> f4442;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final Socket f4443;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final String f4444;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f4445;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f4446;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final C0667 f4448;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public long f4450;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final ScheduledExecutorService f4451;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final InterfaceC0682 f4452;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Map<Integer, C0663> f4449 = new LinkedHashMap();

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public long f4447 = 0;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public C0673 f4439 = new C0673();

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public class C0655 extends AbstractRunnableC0607 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ int f4453;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ long f4455;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0655(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f4453 = i;
            this.f4455 = j;
        }

        @Override // p000.p001.AbstractRunnableC0607
        /* renamed from: げつ〴ぬぐ */
        public void mo1725() {
            try {
                C0654.this.f4448.m1897(this.f4453, this.f4455);
            } catch (IOException unused) {
                C0654.m1872(C0654.this);
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぁごぐすすぃ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0656 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public String f4456;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public InterfaceC2805 f4457;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Socket f4458;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public AbstractC0660 f4459 = AbstractC0660.f4471;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f4460;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public InterfaceC2823 f4461;

        public C0656(boolean z) {
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0657 extends AbstractRunnableC0607 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ int f4462;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ EnumC0653 f4464;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0657(String str, Object[] objArr, int i, EnumC0653 enumC0653) {
            super(str, objArr);
            this.f4462 = i;
            this.f4464 = enumC0653;
        }

        @Override // p000.p001.AbstractRunnableC0607
        /* renamed from: げつ〴ぬぐ */
        public void mo1725() {
            try {
                C0654 c0654 = C0654.this;
                c0654.f4448.m1900(this.f4462, this.f4464);
            } catch (IOException unused) {
                C0654.m1872(C0654.this);
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぁごぐすすぃ$づざかべべ, reason: contains not printable characters */
    public final class C0658 extends AbstractRunnableC0607 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final boolean f4465;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final int f4466;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final int f4468;

        public C0658(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C0654.this.f4444, Integer.valueOf(i), Integer.valueOf(i2));
            this.f4465 = z;
            this.f4468 = i;
            this.f4466 = i2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 != false) goto L19;
         */
        @Override // p000.p001.AbstractRunnableC0607
        /* renamed from: げつ〴ぬぐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo1725() {
            /*
                r7 = this;
                〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぁごぐすすぃ r0 = p000.p001.p008.C0654.this
                boolean r1 = r7.f4465
                int r2 = r7.f4468
                int r3 = r7.f4466
                r0.getClass()
                〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.〺つふすそ r4 = p000.p001.p008.EnumC0653.PROTOCOL_ERROR
                if (r1 != 0) goto L1f
                monitor-enter(r0)
                boolean r5 = r0.f4445     // Catch: java.lang.Throwable -> L1c
                r6 = 1
                r0.f4445 = r6     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                if (r5 == 0) goto L1f
            L18:
                r0.m1881(r4, r4)     // Catch: java.io.IOException -> L24
                goto L24
            L1c:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                throw r1
            L1f:
                〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぉざぅち〻 r5 = r0.f4448     // Catch: java.io.IOException -> L18
                r5.m1901(r1, r2, r3)     // Catch: java.io.IOException -> L18
            L24:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p001.p008.C0654.C0658.mo1725():void");
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぁごぐすすぃ$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0659 extends AbstractRunnableC0607 implements C0668.InterfaceC0669 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final C0668 f4469;

        public C0659(C0668 c0668) {
            super("OkHttp %s", C0654.this.f4444);
            this.f4469 = c0668;
        }

        @Override // p000.p001.AbstractRunnableC0607
        /* renamed from: げつ〴ぬぐ */
        public void mo1725() {
            EnumC0653 enumC0653;
            EnumC0653 enumC06532 = EnumC0653.INTERNAL_ERROR;
            try {
                try {
                    this.f4469.m1910(this);
                    while (this.f4469.m1916(false, this)) {
                    }
                    enumC0653 = EnumC0653.NO_ERROR;
                    try {
                        try {
                            C0654.this.m1881(enumC0653, EnumC0653.CANCEL);
                        } catch (IOException unused) {
                            EnumC0653 enumC06533 = EnumC0653.PROTOCOL_ERROR;
                            C0654.this.m1881(enumC06533, enumC06533);
                            C0629.m1816(this.f4469);
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            C0654.this.m1881(enumC0653, enumC06532);
                        } catch (IOException unused2) {
                        }
                        C0629.m1816(this.f4469);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                enumC0653 = enumC06532;
            } catch (Throwable th2) {
                th = th2;
                enumC0653 = enumC06532;
                C0654.this.m1881(enumC0653, enumC06532);
                C0629.m1816(this.f4469);
                throw th;
            }
            C0629.m1816(this.f4469);
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぁごぐすすぃ$びぐびあび, reason: contains not printable characters */
    public static abstract class AbstractC0660 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static final AbstractC0660 f4471 = new C0661();

        /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぁごぐすすぃ$びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0661 extends AbstractC0660 {
            @Override // p000.p001.p008.C0654.AbstractC0660
            /* renamed from: 〺つふすそ */
            public void mo1857(C0663 c0663) {
                c0663.m1886(EnumC0653.REFUSED_STREAM);
            }
        }

        /* renamed from: 〺つふすそ */
        public abstract void mo1857(C0663 c0663);

        /* renamed from: げつ〴ぬぐ */
        public void mo1861(C0654 c0654) {
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = C0629.f4347;
        f4432 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC0651("OkHttp Http2Connection", true));
    }

    public C0654(C0656 c0656) {
        C0673 c0673 = new C0673();
        this.f4437 = c0673;
        this.f4438 = false;
        this.f4442 = new LinkedHashSet();
        this.f4452 = InterfaceC0682.f4561;
        this.f4434 = true;
        this.f4440 = c0656.f4459;
        this.f4435 = 1;
        this.f4435 = 3;
        this.f4439.m1917(7, 16777216);
        String str = c0656.f4456;
        this.f4444 = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0651(C0629.m1820("OkHttp %s Writer", str), false));
        this.f4451 = scheduledThreadPoolExecutor;
        if (c0656.f4460 != 0) {
            C0658 c0658 = new C0658(false, 0, 0);
            long j = c0656.f4460;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c0658, j, j, TimeUnit.MILLISECONDS);
        }
        this.f4436 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0651(C0629.m1820("OkHttp %s Push Observer", str), true));
        c0673.m1917(7, 65535);
        c0673.m1917(5, 16384);
        this.f4450 = c0673.m1918();
        this.f4443 = c0656.f4458;
        this.f4448 = new C0667(c0656.f4461, true);
        this.f4441 = new C0659(new C0668(c0656.f4457, true));
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static void m1872(C0654 c0654) {
        c0654.getClass();
        try {
            EnumC0653 enumC0653 = EnumC0653.PROTOCOL_ERROR;
            c0654.m1881(enumC0653, enumC0653);
        } catch (IOException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m1881(EnumC0653.NO_ERROR, EnumC0653.CANCEL);
    }

    public void flush() {
        this.f4448.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f4448.f4504);
        r6 = r3;
        r8.f4450 -= r6;
     */
    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1873(int r9, boolean r10, p243.C2819 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぉざぅち〻 r12 = r8.f4448
            r12.m1905(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L5e
            monitor-enter(r8)
        L12:
            long r3 = r8.f4450     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L30
            java.util.Map<java.lang.Integer, 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぇぬぎばつ> r3 = r8.f4449     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            if (r3 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
        L30:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L54
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L54
            〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぉざぅち〻 r3 = r8.f4448     // Catch: java.lang.Throwable -> L54
            int r3 = r3.f4504     // Catch: java.lang.Throwable -> L54
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L54
            long r4 = r8.f4450     // Catch: java.lang.Throwable -> L54
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L54
            long r4 = r4 - r6
            r8.f4450 = r4     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            long r12 = r12 - r6
            〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぉざぅち〻 r4 = r8.f4448
            if (r10 == 0) goto L4f
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            r4.m1905(r5, r9, r11, r3)
            goto Ld
        L54:
            r9 = move-exception
            goto L5c
        L56:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L54
            r9.<init>()     // Catch: java.lang.Throwable -> L54
            throw r9     // Catch: java.lang.Throwable -> L54
        L5c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r9
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p001.p008.C0654.m1873(int, boolean, ぺぁあねじ.づざかべべ, long):void");
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public void m1874(int i, EnumC0653 enumC0653) {
        try {
            this.f4451.execute(new C0657("OkHttp %s stream %d", new Object[]{this.f4444, Integer.valueOf(i)}, i, enumC0653));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public synchronized C0663 m1875(int i) {
        return this.f4449.get(Integer.valueOf(i));
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public void m1876(EnumC0653 enumC0653) {
        synchronized (this.f4448) {
            synchronized (this) {
                if (this.f4433) {
                    return;
                }
                this.f4433 = true;
                this.f4448.m1903(this.f4446, enumC0653, C0629.f4347);
            }
        }
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public synchronized C0663 m1877(int i) {
        C0663 remove;
        remove = this.f4449.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public void m1878(int i, long j) {
        try {
            this.f4451.execute(new C0655("OkHttp Window Update %s stream %d", new Object[]{this.f4444, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public synchronized int m1879() {
        C0673 c0673;
        c0673 = this.f4437;
        return (c0673.f4528 & 16) != 0 ? c0673.f4527[4] : Integer.MAX_VALUE;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public boolean m1880(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public void m1881(EnumC0653 enumC0653, EnumC0653 enumC06532) {
        C0663[] c0663Arr = null;
        try {
            m1876(enumC0653);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f4449.isEmpty()) {
                c0663Arr = (C0663[]) this.f4449.values().toArray(new C0663[this.f4449.size()]);
                this.f4449.clear();
            }
        }
        if (c0663Arr != null) {
            for (C0663 c0663 : c0663Arr) {
                try {
                    c0663.m1886(enumC06532);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f4448.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f4443.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f4451.shutdown();
        this.f4436.shutdown();
        if (e != null) {
            throw e;
        }
    }
}
