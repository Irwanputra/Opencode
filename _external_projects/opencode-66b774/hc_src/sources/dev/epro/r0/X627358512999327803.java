package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X627358512999327803 {
    public Object a;
    public G5920303990939058292 b;
    public W8823188230031025271 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        G5920303990939058292 g5920303990939058292 = this.b;
        if (g5920303990939058292 != null) {
            Q67451660661543800 q67451660661543800 = g5920303990939058292.b;
            q67451660661543800.getClass();
            if (obj == null) {
                obj = P16078978668947144669.g;
            }
            if (P16078978668947144669.f.u(q67451660661543800, null, obj)) {
                P16078978668947144669.c(q67451660661543800);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void b(Throwable th) {
        this.d = true;
        G5920303990939058292 g5920303990939058292 = this.b;
        if (g5920303990939058292 == null || !g5920303990939058292.b.h(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        W8823188230031025271 w8823188230031025271;
        G5920303990939058292 g5920303990939058292 = this.b;
        if (g5920303990939058292 != null) {
            Q67451660661543800 q67451660661543800 = g5920303990939058292.b;
            if (!q67451660661543800.isDone()) {
                q67451660661543800.h(new L9579792675533935114("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 2));
            }
        }
        if (this.d || (w8823188230031025271 = this.c) == null) {
            return;
        }
        w8823188230031025271.i(null);
    }
}
