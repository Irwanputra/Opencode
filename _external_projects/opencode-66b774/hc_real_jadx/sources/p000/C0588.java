package p000;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.p001.C0629;
import p000.p001.ThreadFactoryC0651;
import p000.p001.p004.C0626;
import p000.p001.p007.C0643;
import p000.p001.p007.C0645;
import p000.p001.p007.C0650;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0588 {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final Executor f4229;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final long f4230;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Runnable f4231;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int f4232;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C0650 f4233;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f4234;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Deque<C0645> f4235;

    /* renamed from: 〳ぜぞぜべっ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0589 implements Runnable {
        public RunnableC0589() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            while (true) {
                C0588 c0588 = C0588.this;
                long nanoTime = System.nanoTime();
                synchronized (c0588) {
                    C0645 c0645 = null;
                    long j2 = Long.MIN_VALUE;
                    int i = 0;
                    int i2 = 0;
                    for (C0645 c06452 : c0588.f4235) {
                        if (c0588.m1726(c06452, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j3 = nanoTime - c06452.f4390;
                            if (j3 > j2) {
                                c0645 = c06452;
                                j2 = j3;
                            }
                        }
                    }
                    j = c0588.f4230;
                    if (j2 < j && i <= c0588.f4232) {
                        if (i > 0) {
                            j -= j2;
                        } else if (i2 <= 0) {
                            c0588.f4234 = false;
                            j = -1;
                        }
                    }
                    c0588.f4235.remove(c0645);
                    C0629.m1819(c0645.f4392);
                    j = 0;
                }
                if (j == -1) {
                    return;
                }
                if (j > 0) {
                    long j4 = j / 1000000;
                    long j5 = j - (1000000 * j4);
                    synchronized (C0588.this) {
                        try {
                            C0588.this.wait(j4, (int) j5);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = C0629.f4347;
        f4229 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC0651("OkHttp ConnectionPool", true));
    }

    public C0588() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f4231 = new RunnableC0589();
        this.f4235 = new ArrayDeque();
        this.f4233 = new C0650();
        this.f4232 = 5;
        this.f4230 = timeUnit.toNanos(5L);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int m1726(C0645 c0645, long j) {
        List<Reference<C0643>> list = c0645.f4397;
        int i = 0;
        while (i < list.size()) {
            Reference<C0643> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder m4207 = C2098.m4207("A connection to ");
                m4207.append(c0645.f4391.f4668.f4620);
                m4207.append(" was leaked. Did you forget to close a response body?");
                C0626.f4331.mo1789(m4207.toString(), ((C0643.C0644) reference).f4385);
                list.remove(i);
                c0645.f4399 = true;
                if (list.isEmpty()) {
                    c0645.f4390 = j - this.f4230;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
