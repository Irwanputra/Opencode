package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K14082636229475424456 extends J8045362843799184672 {
    public final V14120702150497747934 r;
    public final B1061516154492673368 s;

    public K14082636229475424456(V14120702150497747934 v14120702150497747934) {
        B1061516154492673368 b1061516154492673368;
        this.r = v14120702150497747934;
        if (M17147082063200071302.G(v14120702150497747934)) {
            b1061516154492673368 = null;
        } else {
            b1061516154492673368 = W7346099082318612118.a();
            B1061516154492673368.c(b1061516154492673368, v14120702150497747934);
        }
        this.s = b1061516154492673368;
    }

    @Override // dev.epro.r0.J8045362843799184672
    public final S6349823729575121924 M() {
        V14120702150497747934 v14120702150497747934 = this.r;
        return new S6349823729575121924(v14120702150497747934.a, v14120702150497747934.b, v14120702150497747934.c, v14120702150497747934.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K14082636229475424456) {
            return this.r.equals(((K14082636229475424456) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
