package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K10859651572364480586 extends J8045362843799184672 {
    public final S6349823729575121924 r;

    public K10859651572364480586(S6349823729575121924 s6349823729575121924) {
        this.r = s6349823729575121924;
    }

    @Override // dev.epro.r0.J8045362843799184672
    public final S6349823729575121924 M() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K10859651572364480586) {
            return this.r.equals(((K10859651572364480586) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
