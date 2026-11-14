package dev.epro.r0;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class O12329764647113144543 {
    public static final W14885886591432735403 d = new W14885886591432735403();
    public boolean a;
    public long b;
    public long c;

    public O12329764647113144543 a() {
        this.a = false;
        return this;
    }

    public O12329764647113144543 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        S10973172697741180971.m("No deadline");
        return 0L;
    }

    public O12329764647113144543 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public O12329764647113144543 g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        S10973172697741180971.i(E12098517352909843120.k(j, "timeout < 0: "));
        return null;
    }
}
