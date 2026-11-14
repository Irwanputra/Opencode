package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B13729205492206812220;
import dev.epro.r0.P9893650590651797888;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ma2 extends P9893650590651797888 implements B13729205492206812220 {
    public final /* synthetic */ pa2 a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma2(pa2 pa2Var, byte b) {
        super(0);
        this.i = b;
        this.a = pa2Var;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        sa2 sa2Var;
        ua2 ua2Var;
        switch (this.i) {
            case 0:
                return yy0.a(this.a.b);
            case 1:
                Context context = this.a.b;
                sa2 sa2Var2 = sa2.h;
                synchronized (sa2.class) {
                    try {
                        sa2Var = sa2.h;
                        if (sa2Var == null) {
                            sa2Var = new sa2(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                            sa2.h = sa2Var;
                        }
                    } finally {
                    }
                    break;
                }
                return sa2Var;
            default:
                Context context2 = this.a.b;
                ua2 ua2Var2 = ua2.h;
                synchronized (ua2.class) {
                    try {
                        ua2Var = ua2.h;
                        if (ua2Var == null) {
                            ua2Var = new ua2(context2, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                            ua2.h = ua2Var;
                        }
                    } finally {
                    }
                    break;
                }
                return ua2Var;
        }
    }
}
