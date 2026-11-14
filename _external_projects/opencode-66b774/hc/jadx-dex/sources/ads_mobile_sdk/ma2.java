package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ma2 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.B13729205492206812220 {
    public final /* synthetic */ ads_mobile_sdk.pa2 a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma2(ads_mobile_sdk.pa2 pa2Var, byte b) {
        super(0);
        this.i = b;
        this.a = pa2Var;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final java.lang.Object invoke() {
        ads_mobile_sdk.sa2 sa2Var;
        ads_mobile_sdk.ua2 ua2Var;
        switch (this.i) {
            case 0:
                return ads_mobile_sdk.yy0.a(this.a.b);
            case 1:
                android.content.Context context = this.a.b;
                ads_mobile_sdk.sa2 sa2Var2 = ads_mobile_sdk.sa2.h;
                synchronized (ads_mobile_sdk.sa2.class) {
                    try {
                        sa2Var = ads_mobile_sdk.sa2.h;
                        if (sa2Var == null) {
                            sa2Var = new ads_mobile_sdk.sa2(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                            ads_mobile_sdk.sa2.h = sa2Var;
                        }
                    } finally {
                    }
                    break;
                }
                return sa2Var;
            default:
                android.content.Context context2 = this.a.b;
                ads_mobile_sdk.ua2 ua2Var2 = ads_mobile_sdk.ua2.h;
                synchronized (ads_mobile_sdk.ua2.class) {
                    try {
                        ua2Var = ads_mobile_sdk.ua2.h;
                        if (ua2Var == null) {
                            ua2Var = new ads_mobile_sdk.ua2(context2, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                            ads_mobile_sdk.ua2.h = ua2Var;
                        }
                    } finally {
                    }
                    break;
                }
                return ua2Var;
        }
    }
}
