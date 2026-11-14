package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ps1 extends dev.epro.r0.K14749510448791472029 {
    public /* synthetic */ java.lang.Object a;
    public int b;
    public final /* synthetic */ ads_mobile_sdk.fc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps1(ads_mobile_sdk.fc1 fc1Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.c = fc1Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
