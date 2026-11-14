package dev.epro.r0;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P4575683796390162177 extends C4265577456082395953 {
    public long e;
    public final /* synthetic */ V13312380994896612392 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P4575683796390162177(V13312380994896612392 v13312380994896612392, P10208541982779414550 p10208541982779414550, long j) {
        super(v13312380994896612392, p10208541982779414550);
        p10208541982779414550.getClass();
        this.f = v13312380994896612392;
        this.e = j;
        if (j == 0) {
            b(F12902864952249894497.b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.c) {
            return;
        }
        if (this.e != 0) {
            TimeZone timeZone = C14766148968941961570.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = C14766148968941961570.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.f.b.h();
                b(V13312380994896612392.f);
            }
        }
        this.c = true;
    }

    @Override // dev.epro.r0.C4265577456082395953, dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) throws IOException {
        p5176232750190581838.getClass();
        if (this.c) {
            S10973172697741180971.m("closed");
            return 0L;
        }
        long j2 = this.e;
        if (j2 == 0) {
            return -1L;
        }
        long jM = super.m(p5176232750190581838, Math.min(j2, 8192L));
        if (jM == -1) {
            this.f.b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(V13312380994896612392.f);
            throw protocolException;
        }
        long j3 = this.e - jM;
        this.e = j3;
        if (j3 == 0) {
            b(F12902864952249894497.b);
        }
        return jM;
    }
}
