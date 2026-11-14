package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.E6758797890281795541;
import dev.epro.r0.G16864365537574524285;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.U4857089234315512256;
import java.util.ArrayList;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class od1 extends vb1 {
    public final View m;
    public final G16864365537574524285 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od1(View view, String str, z1 z1Var, hv hvVar, mi3 mi3Var, Optional optional, y2 y2Var, ih0 ih0Var, hf2 hf2Var, z03 z03Var, eg2 eg2Var, G16864365537574524285 g16864365537574524285, U4857089234315512256 u4857089234315512256) {
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

    public final E6758797890281795541 l() {
        if (b().r0) {
            ArrayList arrayList = b().a0;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (M8927913404651150384.L((String) obj, "FirstParty", false)) {
                    }
                }
            }
            View view = this.m;
            return new E6758797890281795541(view.getWidth(), view.getHeight());
        }
        g2 g2Var = !b().y.isEmpty() ? (g2) b().y.get(0) : (g2) b().g.get(0);
        return g2Var.c ? E6758797890281795541.h : new E6758797890281795541(g2Var.a, g2Var.b);
    }
}
