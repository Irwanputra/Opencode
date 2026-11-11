package p243;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ぺぁあねじ.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2803 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final C2803 f10470 = new C2804();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public long f10471;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public long f10472;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean f10473;

    /* renamed from: ぺぁあねじ.〻ぞまぎな〻$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2804 extends C2803 {
        @Override // p243.C2803
        /* renamed from: ぁごぐすすぃ */
        public C2803 mo4857(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // p243.C2803
        /* renamed from: なぎぱいぢぎ */
        public void mo4861() {
        }

        @Override // p243.C2803
        /* renamed from: びぐびあび */
        public C2803 mo4862(long j) {
            return this;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2803 mo4856() {
        this.f10472 = 0L;
        return this;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C2803 mo4857(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f10472 = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public long mo4858() {
        if (this.f10473) {
            return this.f10471;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2803 mo4859() {
        this.f10473 = false;
        return this;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean mo4860() {
        return this.f10473;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo4861() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f10473 && this.f10471 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C2803 mo4862(long j) {
        this.f10473 = true;
        this.f10471 = j;
        return this;
    }
}
