package dev.epro.r0;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D13766921851167432738 extends M2066880349381062048 {
    public final I14541140868895480020 W;

    public D13766921851167432738(I14541140868895480020 i14541140868895480020) {
        this.W = i14541140868895480020;
    }

    public final void U(Object obj) throws Exception {
        G10327508498288787502 g10327508498288787502 = this.W.a;
        if (g10327508498288787502 == null) {
            S10973172697741180971.m("Launcher has not been initialized");
            return;
        }
        J6160233934771378283 j6160233934771378283 = g10327508498288787502.W;
        ArrayList arrayList = j6160233934771378283.d;
        LinkedHashMap linkedHashMap = j6160233934771378283.b;
        String str = g10327508498288787502.X;
        Object obj2 = linkedHashMap.get(str);
        E3422549137300678133 e3422549137300678133 = g10327508498288787502.Y;
        if (obj2 == null) {
            D11988991656201568495.o("Attempting to launch an unregistered ActivityResultLauncher with contract ", e3422549137300678133, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            return;
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            j6160233934771378283.b(iIntValue, e3422549137300678133, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
