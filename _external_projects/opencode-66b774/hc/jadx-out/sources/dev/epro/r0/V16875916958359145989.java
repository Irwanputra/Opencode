package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V16875916958359145989 implements U10510841700634832156 {
    public final A11740628756173341578 a;
    public boolean b;
    public final /* synthetic */ V13312380994896612392 c;

    public V16875916958359145989(V13312380994896612392 v13312380994896612392) {
        this.c = v13312380994896612392;
        this.a = new A11740628756173341578(((L673873344574563461) v13312380994896612392.c.d).a.a());
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final O12329764647113144543 a() {
        return this.a;
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((L673873344574563461) this.c.c.d).t("0\r\n\r\n");
        ((L673873344574563461) this.c.c.d).flush();
        A11740628756173341578 a11740628756173341578 = this.a;
        O12329764647113144543 o12329764647113144543 = a11740628756173341578.e;
        a11740628756173341578.e = O12329764647113144543.d;
        o12329764647113144543.a();
        o12329764647113144543.b();
        this.c.d = (byte) 3;
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        ((L673873344574563461) this.c.c.d).flush();
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final void y(P5176232750190581838 p5176232750190581838, long j) {
        if (this.b) {
            S10973172697741180971.m("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        L673873344574563461 l673873344574563461 = (L673873344574563461) this.c.c.d;
        if (l673873344574563461.c) {
            S10973172697741180971.m("closed");
            return;
        }
        l673873344574563461.b.F(j);
        l673873344574563461.b();
        l673873344574563461.t("\r\n");
        l673873344574563461.y(p5176232750190581838, j);
        l673873344574563461.t("\r\n");
    }
}
