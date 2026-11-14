package ads_mobile_sdk;

import android.os.Build;
import android.view.Window;
import android.widget.RelativeLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z13168519540281190457;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ei1 implements Y4798753258822141670 {
    public final et0 a;

    public ei1(et0 et0Var) {
        et0Var.getClass();
        this.a = et0Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        AdActivity adActivity;
        Window window;
        Integer numG;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        String str = (String) map.get("blurRadius");
        int iIntValue = (str == null || (numG = Z13168519540281190457.G(10, str)) == null) ? 0 : numG.intValue();
        et0 et0Var = this.a;
        RelativeLayout relativeLayout = et0Var.p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(zEquals ? 0 : -16777216);
        }
        et0Var.v = zEquals;
        et0Var.z = iIntValue;
        if (Build.VERSION.SDK_INT >= 31) {
            jr0 jr0Var = et0Var.e;
            jr0Var.getClass();
            if (((Boolean) jr0Var.a("gads:enable_blur_transparent_background", Boolean.TRUE, ao.a$11)).booleanValue() && (adActivity = et0Var.l) != null && (window = adActivity.getWindow()) != null) {
                window.setBackgroundBlurRadius(iIntValue);
            }
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 15;
    }
}
