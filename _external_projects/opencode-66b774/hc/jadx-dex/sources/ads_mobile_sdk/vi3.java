package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vi3 {
    public final ads_mobile_sdk.qm1 a;
    public final dev.epro.r0.O16637889491137121389 b;

    public vi3(dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.qm1 qm1Var) {
        this.a = qm1Var;
        this.b = o16637889491137121389;
    }

    public final void a(ads_mobile_sdk.yk0 yk0Var, dev.epro.r0.L7743116545240101509 l7743116545240101509) {
        ads_mobile_sdk.sh3 sh3Var = new ads_mobile_sdk.sh3(yk0Var, this.b, this.a);
        sh3Var.b();
        l7743116545240101509.a(new dev.epro.r0.I3863025946240164840(l7743116545240101509, new ads_mobile_sdk.c7((java.lang.Object) sh3Var, (byte) 26), (byte) 0), dev.epro.r0.Z886113521968091188.a);
    }

    public final void b(ads_mobile_sdk.yk0 yk0Var) {
        this.a.a(yk0Var.a, -1L, null, null);
    }

    public final ads_mobile_sdk.sh3 a(ads_mobile_sdk.yk0 yk0Var) {
        return new ads_mobile_sdk.sh3(yk0Var, this.b, this.a);
    }

    public final void a(ads_mobile_sdk.yk0 yk0Var, java.lang.Runnable runnable) {
        try {
            new ads_mobile_sdk.sh3(yk0Var, this.b, this.a).b();
            runnable.run();
        } finally {
        }
    }
}
