package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C10200104071869769031 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte i = 1;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ java.lang.Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10200104071869769031(dev.epro.r0.B13729205492206812220 b13729205492206812220, boolean z) {
        super(1);
        this.j = z;
        this.k = b13729205492206812220;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        byte b = this.i;
        boolean z = this.j;
        java.lang.Object obj2 = this.k;
        switch (b) {
            case 0:
                ((dev.epro.r0.O16200024709371809403) obj).f(!z && ((java.lang.Boolean) ((dev.epro.r0.B13729205492206812220) obj2).invoke()).booleanValue());
                return dev.epro.r0.O9245300239821758723.a;
            default:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                entry.getClass();
                if (((ads_mobile_sdk.rf0) obj2).f.E0() && z && (str = (java.lang.String) entry.getValue()) != null && str.length() > 500) {
                    return entry.getKey() + " = [Debug dialog string omitted from screen due to length limit. Please use the Share option or Copy button to retrieve it.]";
                }
                return entry.getKey() + " = " + entry.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10200104071869769031(ads_mobile_sdk.rf0 rf0Var, boolean z) {
        super(1);
        this.k = rf0Var;
        this.j = z;
    }
}
