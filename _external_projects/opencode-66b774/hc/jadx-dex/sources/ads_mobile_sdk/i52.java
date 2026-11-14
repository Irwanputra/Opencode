package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class i52 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.B13729205492206812220 {
    public final /* synthetic */ ads_mobile_sdk.x52 a;
    public final /* synthetic */ ads_mobile_sdk.tx0 b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ ads_mobile_sdk.d00 d;
    public final /* synthetic */ ads_mobile_sdk.q31 e;
    public final /* synthetic */ ads_mobile_sdk.ha2 f;
    public final /* synthetic */ ads_mobile_sdk.ha2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i52(ads_mobile_sdk.x52 x52Var, ads_mobile_sdk.tx0 tx0Var, java.lang.String str, ads_mobile_sdk.d00 d00Var, ads_mobile_sdk.q31 q31Var, ads_mobile_sdk.ha2 ha2Var, ads_mobile_sdk.ha2 ha2Var2) {
        super(0);
        this.a = x52Var;
        this.b = tx0Var;
        this.c = str;
        this.d = d00Var;
        this.e = q31Var;
        this.f = ha2Var;
        this.g = ha2Var2;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final java.lang.Object invoke() {
        dev.epro.r0.R6320827706769103704 r6320827706769103704A = dev.epro.r0.R6320827706769103704.a(this.a.j, this.b, this.c, "");
        ads_mobile_sdk.j6 j6VarA = ads_mobile_sdk.j6.a(this.d, this.e, this.f, this.g, true);
        if (dev.epro.r0.K5751602218013079365.C.a) {
            return new ads_mobile_sdk.m6(j6VarA, r6320827706769103704A, java.util.UUID.randomUUID().toString());
        }
        dev.epro.r0.S10973172697741180971.m("Method called before OM SDK activation");
        return null;
    }
}
