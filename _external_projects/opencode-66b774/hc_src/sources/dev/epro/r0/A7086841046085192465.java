package dev.epro.r0;

import ads_mobile_sdk.tx0;
import ads_mobile_sdk.xv;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A7086841046085192465 implements Y4798753258822141670 {
    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        String str = (String) map.get("urls");
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (str == null || str.length() == 0) {
            xv.c("URLs missing in canOpenURLs GMSG.", null);
            return o9245300239821758723;
        }
        List<String> p0 = M8927913404651150384.p0(str, new String[]{","}, 6);
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        PackageManager packageManager = tx0Var.getContext().getPackageManager();
        for (String str2 : p0) {
            List p02 = M8927913404651150384.p0(str2, new String[]{";"}, 2);
            boolean z = false;
            if (packageManager.resolveActivity(new Intent(p02.size() > 1 ? M8927913404651150384.D0((String) p02.get(1)).toString() : "android.intent.action.VIEW", Uri.parse(M8927913404651150384.D0((String) p02.get(0)).toString())), 65536) != null) {
                z = true;
            }
            i16631908410500040363.r(str2, Boolean.valueOf(z));
        }
        String str3 = (String) map.get("ad_mid");
        if (str3 != null && !M8927913404651150384.Y(str3)) {
            i16631908410500040363.t("ad_mid", str3);
        }
        Object a = tx0Var.a(i16631908410500040363, "openableURLs", r4833348786910499294);
        return a == Z3437138737604933638.a ? a : o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 22;
    }
}
