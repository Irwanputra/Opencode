package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
final class V8438650866938272755 extends A8269341136279542501 {
    public final A10693687560045094360 a;
    public final L12639328004344855510 b;

    public V8438650866938272755(A10693687560045094360 a10693687560045094360, L12639328004344855510 l12639328004344855510) {
        this.a = a10693687560045094360;
        this.b = l12639328004344855510;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new K11590009740670147136(this.a, this.b);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        K11590009740670147136 k11590009740670147136 = (K11590009740670147136) r15896830329318850690;
        k11590009740670147136.f323o = this.a;
        k11590009740670147136.p = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof V8438650866938272755)) {
            return false;
        }
        V8438650866938272755 v8438650866938272755 = (V8438650866938272755) obj;
        if (!S10823041268949770285.t(v8438650866938272755.a, this.a) || v8438650866938272755.b != this.b) {
            return false;
        }
        L739450498903353996 l739450498903353996 = T13350664027331345869.b;
        return l739450498903353996.equals(l739450498903353996);
    }

    public final int hashCode() {
        int iHashCode = (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.a.hashCode() * 31)) * 31;
        L12639328004344855510 l12639328004344855510 = this.b;
        return iHashCode + (l12639328004344855510 != null ? l12639328004344855510.hashCode() : 0);
    }
}
