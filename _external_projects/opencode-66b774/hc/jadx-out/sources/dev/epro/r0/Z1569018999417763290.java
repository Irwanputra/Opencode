package dev.epro.r0;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z1569018999417763290 extends C4265577456082395953 {
    public long e;
    public boolean f;
    public final /* synthetic */ V13312380994896612392 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1569018999417763290(V13312380994896612392 v13312380994896612392, P10208541982779414550 p10208541982779414550) {
        super(v13312380994896612392, p10208541982779414550);
        p10208541982779414550.getClass();
        this.g = v13312380994896612392;
        this.e = -1L;
        this.f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.c) {
            return;
        }
        if (this.f) {
            TimeZone timeZone = C14766148968941961570.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = C14766148968941961570.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.g.b.h();
                b(V13312380994896612392.f);
            }
        }
        this.c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r16.f == false) goto L46;
     */
    @Override // dev.epro.r0.C4265577456082395953, dev.epro.r0.S7370861580758580261
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(dev.epro.r0.P5176232750190581838 r17, long r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z1569018999417763290.m(dev.epro.r0.P5176232750190581838, long):long");
    }
}
