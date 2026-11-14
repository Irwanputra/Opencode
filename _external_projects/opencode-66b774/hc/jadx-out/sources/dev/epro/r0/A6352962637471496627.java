package dev.epro.r0;

import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A6352962637471496627 implements S7370861580758580261 {
    public final long a;
    public boolean b;
    public final P5176232750190581838 c = new P5176232750190581838();
    public final P5176232750190581838 d = new P5176232750190581838();
    public boolean e;
    public final /* synthetic */ W10382756971622296125 f;

    public A6352962637471496627(W10382756971622296125 w10382756971622296125, long j, boolean z) {
        this.f = w10382756971622296125;
        this.a = j;
        this.b = z;
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final O12329764647113144543 a() {
        return this.f.j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        W10382756971622296125 w10382756971622296125 = this.f;
        synchronized (w10382756971622296125) {
            this.e = true;
            P5176232750190581838 p5176232750190581838 = this.d;
            j = p5176232750190581838.b;
            p5176232750190581838.b();
            w10382756971622296125.notifyAll();
        }
        if (j > 0) {
            W10382756971622296125 w103827569716222961252 = this.f;
            TimeZone timeZone = C14766148968941961570.a;
            w103827569716222961252.b.g(j);
        }
        this.f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[Catch: all -> 0x0025, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0008, B:7:0x0015, B:13:0x001f, B:47:0x00bc, B:61:0x00e2, B:62:0x00e7, B:17:0x0028, B:19:0x002e, B:21:0x0032, B:23:0x0036, B:27:0x0047, B:29:0x004b, B:31:0x0055, B:33:0x0072, B:35:0x0083, B:38:0x009a, B:41:0x00a4, B:43:0x00aa, B:44:0x00b6, B:58:0x00d8, B:59:0x00df), top: B:66:0x0008, inners: #0 }] */
    @Override // dev.epro.r0.S7370861580758580261
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(dev.epro.r0.P5176232750190581838 r22, long r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A6352962637471496627.m(dev.epro.r0.P5176232750190581838, long):long");
    }
}
