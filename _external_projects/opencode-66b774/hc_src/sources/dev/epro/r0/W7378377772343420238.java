package dev.epro.r0;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class W7378377772343420238 implements Closeable {
    public static final H7893955938892024746 a;

    static {
        P5124777957357031757 p5124777957357031757 = P5124777957357031757.d;
        p5124777957357031757.getClass();
        P5176232750190581838 p5176232750190581838 = new P5176232750190581838();
        p5176232750190581838.B(p5124777957357031757);
        a = new H7893955938892024746(null, p5124777957357031757.a.length, p5176232750190581838);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] b() {
        long c = c();
        byte[] th = null;
        if (c > 2147483647L) {
            Q11088980322693754445.h(E12098517352909843120.k(c, "Cannot buffer entire body for content length: "));
            return null;
        }
        J6206369225411265287 e = e();
        try {
            byte[] k = e.k();
            try {
                e.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = k;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th4) {
                    O8620973563946607355.m(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (c == -1 || c == length) {
            return th;
        }
        throw new IOException("Content-Length (" + c + ") and stream length (" + length + ") disagree");
    }

    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        L14928198200995638215.b(e());
    }

    public abstract A459791877761184370 d();

    public abstract J6206369225411265287 e();
}
