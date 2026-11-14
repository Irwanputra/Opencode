package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class l52 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.B13729205492206812220 {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ ads_mobile_sdk.x52 b;
    public final /* synthetic */ ads_mobile_sdk.tx0 c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ ads_mobile_sdk.d00 e;
    public final /* synthetic */ ads_mobile_sdk.q31 f;
    public final /* synthetic */ ads_mobile_sdk.ha2 g;
    public final /* synthetic */ ads_mobile_sdk.ha2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l52(java.lang.String str, ads_mobile_sdk.x52 x52Var, ads_mobile_sdk.tx0 tx0Var, java.lang.String str2, ads_mobile_sdk.d00 d00Var, ads_mobile_sdk.q31 q31Var, ads_mobile_sdk.ha2 ha2Var, ads_mobile_sdk.ha2 ha2Var2) {
        super(0);
        this.a = str;
        this.b = x52Var;
        this.c = tx0Var;
        this.d = str2;
        this.e = d00Var;
        this.f = q31Var;
        this.g = ha2Var;
        this.h = ha2Var2;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final java.lang.Object invoke() {
        dev.epro.r0.R6320827706769103704 r6320827706769103704B = dev.epro.r0.R6320827706769103704.b(ads_mobile_sdk.ii.a(this.a, this.b.h), this.c, this.d, "");
        ads_mobile_sdk.j6 j6VarA = ads_mobile_sdk.j6.a(this.e, this.f, this.g, this.h, true);
        if (dev.epro.r0.K5751602218013079365.C.a) {
            return new ads_mobile_sdk.m6(j6VarA, r6320827706769103704B, java.util.UUID.randomUUID().toString());
        }
        dev.epro.r0.S10973172697741180971.m("Method called before OM SDK activation");
        return null;
    }
}
