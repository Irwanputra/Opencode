package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class I126528583771688852 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ X16625187937554653603 b;

    public /* synthetic */ I126528583771688852(X16625187937554653603 x16625187937554653603, byte b) {
        this.a = b;
        this.b = x16625187937554653603;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        int iG;
        int iJ;
        byte b = this.a;
        X16625187937554653603 x16625187937554653603 = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(x16625187937554653603.k.b() ? x16625187937554653603.r.g() : ((P6024466796603310388) x16625187937554653603.d.c).g());
            case 1:
                P6024466796603310388 p6024466796603310388 = x16625187937554653603.q;
                boolean zB = x16625187937554653603.k.b();
                N3336634644320470588 n3336634644320470588 = x16625187937554653603.d;
                if (!zB) {
                    iG = ((P6024466796603310388) n3336634644320470588.c).g();
                } else if (p6024466796603310388.g() != -1) {
                    iG = p6024466796603310388.g();
                } else {
                    float fAbs = Math.abs(((O15319392248629494012) n3336634644320470588.d).g());
                    R8540738700654750557 r8540738700654750557 = x16625187937554653603.n;
                    Z5398859297832919716 z5398859297832919716 = G14082206658910936320.a;
                    if (fAbs >= Math.abs(Math.min(r8540738700654750557.K(56.0f), x16625187937554653603.m() / 2.0f) / x16625187937554653603.m())) {
                        boolean zBooleanValue = ((Boolean) x16625187937554653603.D.getValue()).booleanValue();
                        int i = x16625187937554653603.e;
                        iG = zBooleanValue ? i + 1 : i;
                    } else {
                        iG = ((P6024466796603310388) n3336634644320470588.c).g();
                    }
                }
                iJ = x16625187937554653603.j(iG);
                break;
            default:
                iJ = x16625187937554653603.l();
                break;
        }
        return Integer.valueOf(iJ);
    }
}
