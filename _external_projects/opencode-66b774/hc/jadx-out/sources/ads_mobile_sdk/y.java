package ads_mobile_sdk;

import android.app.Activity;
import android.os.Bundle;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P9893650590651797888;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class y extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Activity activity, Bundle bundle, byte b) {
        super(1);
        this.i = b;
        this.a = activity;
        this.b = bundle;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.i;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                uo uoVar = (uo) obj;
                uoVar.getClass();
                if (uoVar.f.H0()) {
                    uoVar.a(this.a, 0);
                    uoVar.b(4);
                }
                break;
            default:
                uo uoVar2 = (uo) obj;
                uoVar2.getClass();
                if (uoVar2.f.H0()) {
                    uoVar2.b(4);
                }
                break;
        }
        return o9245300239821758723;
    }
}
