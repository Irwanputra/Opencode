package ads_mobile_sdk;

import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.P9893650590651797888;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class dj2 extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ fl2 a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj2(fl2 fl2Var, byte b) {
        super(1);
        this.i = b;
        this.a = fl2Var;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.i;
        boolean z = false;
        fl2 fl2Var = this.a;
        switch (b) {
            case 0:
                qw2 qw2Var = (qw2) obj;
                qw2Var.getClass();
                if (qw2Var == qw2.e && fl2Var.t) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                qw2 qw2Var2 = (qw2) obj;
                qw2Var2.getClass();
                if (qw2Var2 == qw2.e && fl2Var.t) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
