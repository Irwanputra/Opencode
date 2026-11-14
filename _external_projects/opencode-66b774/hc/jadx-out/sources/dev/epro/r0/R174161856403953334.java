package dev.epro.r0;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R174161856403953334 implements S7370861580758580261 {
    public final S7370861580758580261 a;
    public final long b;
    public final boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ T558270488962777544 h;

    public R174161856403953334(T558270488962777544 t558270488962777544, S7370861580758580261 s7370861580758580261, long j, boolean z) {
        s7370861580758580261.getClass();
        this.h = t558270488962777544;
        this.a = s7370861580758580261;
        this.b = j;
        this.c = z;
        this.e = true;
        if (j == 0) {
            c(null);
        }
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final O12329764647113144543 a() {
        return this.a.a();
    }

    public final void b() throws IOException {
        this.a.close();
    }

    public final IOException c(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        if (iOException == null && this.e) {
            this.e = false;
            ((V5252629055842691065) this.h.b).d.e((V5252629055842691065) this.h.b);
        }
        return T558270488962777544.a(this.h, this.d, this.c, iOException, 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            b();
            c(null);
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) throws IOException {
        p5176232750190581838.getClass();
        if (this.g) {
            S10973172697741180971.m("closed");
            return 0L;
        }
        try {
            long jM = this.a.m(p5176232750190581838, 8192L);
            if (this.e) {
                this.e = false;
                ((V5252629055842691065) this.h.b).d.e((V5252629055842691065) this.h.b);
            }
            if (jM == -1) {
                c(null);
                return -1L;
            }
            long j2 = this.d + jM;
            long j3 = this.b;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.b + " bytes but received " + j2);
            }
            this.d = j2;
            if (((R8365488887580997185) this.h.d).c()) {
                c(null);
            }
            return jM;
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    public final String toString() {
        return R174161856403953334.class.getSimpleName() + '(' + this.a + ')';
    }
}
