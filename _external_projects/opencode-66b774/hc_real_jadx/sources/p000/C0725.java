package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p000.C0586;
import p000.p001.C0629;
import p000.p001.ThreadFactoryC0651;

/* renamed from: 〳ぜぞぜべっ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0725 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    @Nullable
    public ExecutorService f4808;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Deque<C0586.C0587> f4806 = new ArrayDeque();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Deque<C0586.C0587> f4807 = new ArrayDeque();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Deque<C0586> f4809 = new ArrayDeque();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1984() {
        ExecutorService executorService;
        if (this.f4807.size() < 64 && !this.f4806.isEmpty()) {
            Iterator<C0586.C0587> it = this.f4806.iterator();
            while (it.hasNext()) {
                C0586.C0587 next = it.next();
                Iterator<C0586.C0587> it2 = this.f4807.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw null;
                }
                it.remove();
                this.f4807.add(next);
                synchronized (this) {
                    if (this.f4808 == null) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        SynchronousQueue synchronousQueue = new SynchronousQueue();
                        byte[] bArr = C0629.f4347;
                        this.f4808 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC0651("OkHttp Dispatcher", false));
                    }
                    executorService = this.f4808;
                }
                executorService.execute(next);
                if (this.f4807.size() >= 64) {
                    return;
                }
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final <T> void m1985(Deque<T> deque, T t, boolean z) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (z) {
                m1984();
            }
            synchronized (this) {
                int size = this.f4807.size() + this.f4809.size();
            }
        }
    }
}
