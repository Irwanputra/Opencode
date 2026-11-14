package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W12685451225593881345 implements J10190266792694782308, H7323971265464188398 {
    public static final J3301701597851028733 b = new J3301701597851028733(6);
    public final M3727281027331139839 a;

    public W12685451225593881345(M3727281027331139839 m3727281027331139839) {
        this.a = m3727281027331139839;
    }

    @Override // dev.epro.r0.J10190266792694782308
    public final List a(Integer num) {
        return this.a.F();
    }

    @Override // dev.epro.r0.J10190266792694782308
    public final boolean d() {
        return this.a.C;
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final Object fold(L12639328004344855510 l12639328004344855510, Object obj) {
        return l12639328004344855510.invoke(obj, this);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final /* bridge */ H7323971265464188398 get(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.I(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.H7323971265464188398
    public final R12081023847482212386 getKey() {
        return b;
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final /* bridge */ G8001132634698687269 minusKey(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.M(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final /* bridge */ G8001132634698687269 plus(G8001132634698687269 g8001132634698687269) {
        return S10823041268949770285.O(this, g8001132634698687269);
    }
}
