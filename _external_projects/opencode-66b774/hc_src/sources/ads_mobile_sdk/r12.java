package ads_mobile_sdk;

import android.view.View;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S9083891764085457300;
import dev.epro.r0.W1307410158614224409;
import dev.epro.r0.Y4798753258822141670;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class r12 implements Y4798753258822141670 {
    public final jp0 a;
    public final it1 b;

    public r12(jp0 jp0Var, it1 it1Var) {
        jp0Var.getClass();
        it1Var.getClass();
        this.a = jp0Var;
        this.b = it1Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        ew1 ew1Var;
        View b;
        int i = this.b.b;
        int i2 = i == 0 ? -1 : S9083891764085457300.a[L11610354117192841236.A(i)];
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (i2 != -1) {
            jp0 jp0Var = this.a;
            if (i2 == 1) {
                W1307410158614224409 w1307410158614224409 = (W1307410158614224409) jp0Var.c.get();
                if (w1307410158614224409 != null && (b = (ew1Var = (ew1) w1307410158614224409).b(NativeAdAssetNames.ASSET_MEDIA_CONTENT)) != null) {
                    ew1Var.onClick(b);
                }
            } else if (i2 == 2) {
                jp0Var.getClass();
                jp0.a(jp0Var, null, null, "_videoMediaView", null, 48);
                return o9245300239821758723;
            }
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 39;
    }
}
