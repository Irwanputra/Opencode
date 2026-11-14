package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O6225539295864356213 {
    public G842859980338292746 a;
    public P10544952747155442696 b;
    public String d;
    public F3187248827616951674 e;
    public L6498280162989651404 h;
    public P10917817599008460069 i;
    public P10917817599008460069 j;
    public P10917817599008460069 k;
    public long l;
    public long m;
    public T558270488962777544 n;
    public int c = -1;
    public W7378377772343420238 g = W7378377772343420238.a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public S76089685918653100 f413o = S76089685918653100.Wo;
    public V14323974914327418545 f = new V14323974914327418545((byte) 2);

    public static void b(String str, P10917817599008460069 p10917817599008460069) {
        if (p10917817599008460069 != null) {
            if (p10917817599008460069.i != null) {
                S10973172697741180971.i(str.concat(".networkResponse != null"));
            } else if (p10917817599008460069.j != null) {
                S10973172697741180971.i(str.concat(".cacheResponse != null"));
            } else {
                if (p10917817599008460069.k == null) {
                    return;
                }
                S10973172697741180971.i(str.concat(".priorResponse != null"));
            }
        }
    }

    public final P10917817599008460069 a() {
        int i = this.c;
        if (i < 0) {
            D11988991656201568495.q(this.c, "code < 0: ");
            return null;
        }
        G842859980338292746 g842859980338292746 = this.a;
        if (g842859980338292746 == null) {
            S10973172697741180971.m("request == null");
            return null;
        }
        P10544952747155442696 p10544952747155442696 = this.b;
        if (p10544952747155442696 == null) {
            S10973172697741180971.m("protocol == null");
            return null;
        }
        String str = this.d;
        if (str == null) {
            S10973172697741180971.m("message == null");
            return null;
        }
        F3187248827616951674 f3187248827616951674 = this.e;
        V14323974914327418545 v14323974914327418545 = this.f;
        v14323974914327418545.getClass();
        return new P10917817599008460069(g842859980338292746, p10544952747155442696, str, i, f3187248827616951674, X7410747940286448830.d(v14323974914327418545), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f413o);
    }
}
