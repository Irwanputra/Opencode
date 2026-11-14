package dev.epro.r0;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K13582539523188875145 implements U10510841700634832156 {
    public final boolean a;
    public final P5176232750190581838 b = new P5176232750190581838();
    public boolean c;
    public final /* synthetic */ W10382756971622296125 d;

    public K13582539523188875145(W10382756971622296125 w10382756971622296125, boolean z) {
        this.d = w10382756971622296125;
        this.a = z;
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final O12329764647113144543 a() {
        return this.d.k;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z) {
        long jMin;
        boolean z2;
        W10382756971622296125 w10382756971622296125 = this.d;
        synchronized (w10382756971622296125) {
            w10382756971622296125.k.h();
            while (w10382756971622296125.d >= w10382756971622296125.e && !this.a && !this.c && w10382756971622296125.g() == null) {
                try {
                    try {
                        w10382756971622296125.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    w10382756971622296125.k.k();
                    throw th;
                }
            }
            w10382756971622296125.k.k();
            w10382756971622296125.b();
            jMin = Math.min(w10382756971622296125.e - w10382756971622296125.d, this.b.b);
            w10382756971622296125.d += jMin;
            z2 = z && jMin == this.b.b;
        }
        this.d.k.h();
        try {
            W10382756971622296125 w103827569716222961252 = this.d;
            w103827569716222961252.b.h(w103827569716222961252.a, z2, this.b, jMin);
        } finally {
            this.d.k.k();
        }
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        W10382756971622296125 w10382756971622296125 = this.d;
        TimeZone timeZone = C14766148968941961570.a;
        synchronized (w10382756971622296125) {
            if (this.c) {
                return;
            }
            boolean z = w10382756971622296125.g() == null;
            W10382756971622296125 w103827569716222961252 = this.d;
            if (!w103827569716222961252.i.a) {
                if (this.b.b > 0) {
                    while (this.b.b > 0) {
                        b(true);
                    }
                } else if (z) {
                    w103827569716222961252.b.h(w103827569716222961252.a, true, null, 0L);
                }
            }
            W10382756971622296125 w103827569716222961253 = this.d;
            synchronized (w103827569716222961253) {
                this.c = true;
                w103827569716222961253.notifyAll();
            }
            this.d.b.w.flush();
            this.d.a();
        }
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Flushable
    public final void flush() {
        W10382756971622296125 w10382756971622296125 = this.d;
        TimeZone timeZone = C14766148968941961570.a;
        synchronized (w10382756971622296125) {
            w10382756971622296125.b();
        }
        while (this.b.b > 0) {
            b(false);
            this.d.b.w.flush();
        }
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final void y(P5176232750190581838 p5176232750190581838, long j) {
        TimeZone timeZone = C14766148968941961570.a;
        P5176232750190581838 p51762327501905818382 = this.b;
        p51762327501905818382.y(p5176232750190581838, j);
        while (p51762327501905818382.b >= 16384) {
            b(false);
        }
    }
}
