package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.B13729205492206812220;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P9893650590651797888;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class f52 extends P9893650590651797888 implements B13729205492206812220 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ View b;
    public final /* synthetic */ xr0 c;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f52(Object obj, View view, xr0 xr0Var, byte b) {
        super(0);
        this.i = b;
        this.a = obj;
        this.b = view;
        this.c = xr0Var;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.i;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        xr0 xr0Var = this.c;
        View view = this.b;
        Object obj = this.a;
        switch (b) {
            case 0:
                m6 m6Var = (m6) obj;
                if (!m6Var.f) {
                    m6Var.b.a(view, xr0Var);
                }
                break;
            default:
                dj1 dj1Var = (dj1) obj;
                for (m6 m6Var2 : dj1Var.e.values()) {
                    if (!m6Var2.f) {
                        m6Var2.b.a(view, xr0Var);
                    }
                }
                dj1Var.f.a(view, xr0Var);
                break;
        }
        return o9245300239821758723;
    }
}
