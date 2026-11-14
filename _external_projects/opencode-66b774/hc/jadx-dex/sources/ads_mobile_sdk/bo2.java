package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bo2 implements dev.epro.r0.S7864201625552763331 {
    public final /* synthetic */ dev.epro.r0.Q15035754882231748864 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ bo2(dev.epro.r0.Q15035754882231748864 q15035754882231748864, byte b) {
        this.b = b;
        this.a = q15035754882231748864;
    }

    public final java.lang.Object emit(java.lang.Object obj, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        byte b = this.b;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.X7175349259954592591 x7175349259954592591 = this.a;
        switch (b) {
            case 0:
                x7175349259954592591.A(new ads_mobile_sdk.kq2(new java.util.concurrent.CancellationException("Ad request cancelled by publisher action.")));
                break;
            default:
                x7175349259954592591.c(new ads_mobile_sdk.kq2(new java.util.concurrent.CancellationException("Ad request cancelled by publisher action.")));
                break;
        }
        return o9245300239821758723;
    }
}
