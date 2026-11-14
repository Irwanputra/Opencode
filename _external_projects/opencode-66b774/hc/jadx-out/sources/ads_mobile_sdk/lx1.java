package ads_mobile_sdk;

import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.O13929443358578228167;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W1307410158614224409;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z3437138737604933638;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class lx1 implements Y4798753258822141670 {
    public final jp0 a;

    public lx1(jp0 jp0Var) {
        jp0Var.getClass();
        this.a = jp0Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        I16631908410500040363 i16631908410500040363;
        jp0 jp0Var;
        W1307410158614224409 w1307410158614224409 = (W1307410158614224409) this.a.c.get();
        if (w1307410158614224409 != null) {
            ew1 ew1Var = (ew1) w1307410158614224409;
            synchronized (ew1Var) {
                if (ew1Var.d.get()) {
                    i16631908410500040363 = new I16631908410500040363();
                } else {
                    InternalNativeAd internalNativeAd = ew1Var.i;
                    if (internalNativeAd == null || (jp0Var = internalNativeAd.e) == null) {
                        i16631908410500040363 = new I16631908410500040363();
                    } else {
                        O13929443358578228167 o13929443358578228167 = ew1Var.b;
                        LinkedHashMap linkedHashMap = ew1Var.h;
                        ImageView.ScaleType scaleType = ew1Var.f;
                        if (scaleType == null) {
                            scaleType = iw1.i;
                        }
                        i16631908410500040363 = jp0Var.b(o13929443358578228167, scaleType, linkedHashMap);
                    }
                }
            }
        } else {
            i16631908410500040363 = new I16631908410500040363();
        }
        Object objA = tx0Var.a(i16631908410500040363, "nativeClickMetaReady", r4833348786910499294);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 38;
    }
}
