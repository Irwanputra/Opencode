package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R4031171079172756347 extends Z3069203969753053913 {
    public final N10275480315124087338 e;

    public R4031171079172756347(N10275480315124087338 n10275480315124087338) {
        this.e = n10275480315124087338;
    }

    @Override // dev.epro.r0.Z3069203969753053913
    public final boolean m() {
        return false;
    }

    @Override // dev.epro.r0.Z3069203969753053913
    public final void n(Throwable th) {
        Object objM = l().M();
        boolean z = objM instanceof T13610764347093379131;
        N10275480315124087338 n10275480315124087338 = this.e;
        if (z) {
            n10275480315124087338.resumeWith(E17665849472693074628.d(((T13610764347093379131) objM).a));
        } else {
            n10275480315124087338.resumeWith(O4077903568229246.X(objM));
        }
    }
}
