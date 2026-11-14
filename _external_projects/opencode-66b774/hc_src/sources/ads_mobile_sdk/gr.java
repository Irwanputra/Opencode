package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class gr implements Y4798753258822141670 {
    public final Context a;

    public gr(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        int i = Build.VERSION.SDK_INT;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (i >= 30) {
            zi3.a(6, "CanOpenAppGmsgHandler not enabled on R+ devices.", null);
            return o9245300239821758723;
        }
        String str = (String) map.get("package_name");
        if (str == null || str.length() == 0) {
            zi3.a(6, "Package name missing in canOpenApp GMSG.", null);
            return o9245300239821758723;
        }
        PackageManager packageManager = this.a.getPackageManager();
        boolean z = (packageManager != null ? packageManager.getLaunchIntentForPackage(str) : null) != null;
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.r(str, Boolean.valueOf(z));
        Object a = tx0Var.a(i16631908410500040363, "openableApp", r4833348786910499294);
        return a == Z3437138737604933638.a ? a : o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 34;
    }
}
