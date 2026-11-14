package ads_mobile_sdk;

import android.content.Context;
import android.os.BatteryManager;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class xo extends dr {
    public final BatteryManager l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo(jr0 jr0Var, Context context, W5797197595347441198 w5797197595347441198, O16637889491137121389 o16637889491137121389, kz2 kz2Var, g0 g0Var) {
        super(o16637889491137121389, w5797197595347441198, kz2Var, jr0Var, g0Var);
        jr0Var.getClass();
        context.getClass();
        w5797197595347441198.getClass();
        o16637889491137121389.getClass();
        kz2Var.getClass();
        g0Var.getClass();
        this.l = (BatteryManager) context.getSystemService(BatteryManager.class);
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a */
    public final cw0 mo19a() {
        return cw0.BATTERY;
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object d(R4833348786910499294 r4833348786910499294) {
        return new xu0(new wo(r5.getIntProperty(4) / 100.0d, this.l.isCharging()));
    }
}
