package dev.epro.r0;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L18291040423514828915 implements U10510841700634832156 {
    public final U10510841700634832156 a;
    public final long b;
    public final boolean c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ T558270488962777544 h;

    public L18291040423514828915(T558270488962777544 t558270488962777544, U10510841700634832156 u10510841700634832156, long j, boolean z) {
        u10510841700634832156.getClass();
        this.h = t558270488962777544;
        this.a = u10510841700634832156;
        this.b = j;
        this.c = z;
        this.f = z;
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final O12329764647113144543 a() {
        return this.a.a();
    }

    public final void b() {
        this.a.close();
    }

    public final IOException c(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return T558270488962777544.a(this.h, this.e, this.c, iOException, 4);
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        long j = this.b;
        if (j != -1 && this.e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            b();
            c(null);
        } catch (IOException e) {
            IOException c = c(e);
            c.getClass();
            throw c;
        }
    }

    public final void d() {
        this.a.flush();
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Flushable
    public final void flush() {
        try {
            d();
        } catch (IOException e) {
            IOException c = c(e);
            c.getClass();
            throw c;
        }
    }

    public final String toString() {
        return L18291040423514828915.class.getSimpleName() + '(' + this.a + ')';
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final void y(P5176232750190581838 p5176232750190581838, long j) {
        if (this.g) {
            S10973172697741180971.m("closed");
            return;
        }
        long j2 = this.b;
        if (j2 != -1 && this.e + j > j2) {
            throw new ProtocolException("expected " + this.b + " bytes but received " + (this.e + j));
        }
        try {
            if (this.f) {
                this.f = false;
                ((V5252629055842691065) this.h.b).d.c((V5252629055842691065) this.h.b);
            }
            this.a.y(p5176232750190581838, j);
            this.e += j;
        } catch (IOException e) {
            IOException c = c(e);
            c.getClass();
            throw c;
        }
    }
}
