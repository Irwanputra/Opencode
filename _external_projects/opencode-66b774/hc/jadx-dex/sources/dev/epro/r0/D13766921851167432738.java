package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D13766921851167432738 extends dev.epro.r0.M2066880349381062048 {
    public final dev.epro.r0.I14541140868895480020 W;

    public D13766921851167432738(dev.epro.r0.I14541140868895480020 i14541140868895480020) {
        this.W = i14541140868895480020;
    }

    public final void U(java.lang.Object obj) throws java.lang.Exception {
        dev.epro.r0.G10327508498288787502 g10327508498288787502 = this.W.a;
        if (g10327508498288787502 == null) {
            dev.epro.r0.S10973172697741180971.m("Launcher has not been initialized");
            return;
        }
        dev.epro.r0.J6160233934771378283 j6160233934771378283 = g10327508498288787502.W;
        java.util.ArrayList arrayList = j6160233934771378283.d;
        java.util.LinkedHashMap linkedHashMap = j6160233934771378283.b;
        java.lang.String str = g10327508498288787502.X;
        java.lang.Object obj2 = linkedHashMap.get(str);
        dev.epro.r0.E3422549137300678133 e3422549137300678133 = g10327508498288787502.Y;
        if (obj2 == null) {
            dev.epro.r0.D11988991656201568495.o("Attempting to launch an unregistered ActivityResultLauncher with contract ", e3422549137300678133, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            return;
        }
        int iIntValue = ((java.lang.Number) obj2).intValue();
        arrayList.add(str);
        try {
            j6160233934771378283.b(iIntValue, e3422549137300678133, obj);
        } catch (java.lang.Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
