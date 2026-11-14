package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class od1 extends ads_mobile_sdk.vb1 {
    public final android.view.View m;
    public final dev.epro.r0.G16864365537574524285 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od1(android.view.View view, java.lang.String str, ads_mobile_sdk.z1 z1Var, ads_mobile_sdk.hv hvVar, ads_mobile_sdk.mi3 mi3Var, java.util.Optional optional, ads_mobile_sdk.y2 y2Var, ads_mobile_sdk.ih0 ih0Var, ads_mobile_sdk.hf2 hf2Var, ads_mobile_sdk.z03 z03Var, ads_mobile_sdk.eg2 eg2Var, dev.epro.r0.G16864365537574524285 g16864365537574524285, dev.epro.r0.U4857089234315512256 u4857089234315512256) {
        super(str, z1Var, hvVar, mi3Var, optional, y2Var, ih0Var, hf2Var, z03Var, eg2Var, u4857089234315512256);
        view.getClass();
        str.getClass();
        z1Var.getClass();
        hvVar.getClass();
        mi3Var.getClass();
        optional.getClass();
        y2Var.getClass();
        ih0Var.getClass();
        hf2Var.getClass();
        z03Var.getClass();
        eg2Var.getClass();
        g16864365537574524285.getClass();
        u4857089234315512256.getClass();
        this.m = view;
        this.n = g16864365537574524285;
    }

    public final dev.epro.r0.E6758797890281795541 l() {
        if (b().r0) {
            java.util.ArrayList arrayList = b().a0;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    java.lang.Object obj = arrayList.get(i);
                    i++;
                    if (dev.epro.r0.M8927913404651150384.L((java.lang.String) obj, "FirstParty", false)) {
                    }
                }
            }
            android.view.View view = this.m;
            return new dev.epro.r0.E6758797890281795541(view.getWidth(), view.getHeight());
        }
        ads_mobile_sdk.g2 g2Var = !b().y.isEmpty() ? (ads_mobile_sdk.g2) b().y.get(0) : (ads_mobile_sdk.g2) b().g.get(0);
        return g2Var.c ? dev.epro.r0.E6758797890281795541.h : new dev.epro.r0.E6758797890281795541(g2Var.a, g2Var.b);
    }
}
