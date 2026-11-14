package ads_mobile_sdk;

import dev.epro.r0.B13729205492206812220;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.P9893650590651797888;
import dev.epro.r0.R6320827706769103704;
import dev.epro.r0.S10973172697741180971;
import java.util.UUID;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class i52 extends P9893650590651797888 implements B13729205492206812220 {
    public final /* synthetic */ x52 a;
    public final /* synthetic */ tx0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ d00 d;
    public final /* synthetic */ q31 e;
    public final /* synthetic */ ha2 f;
    public final /* synthetic */ ha2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i52(x52 x52Var, tx0 tx0Var, String str, d00 d00Var, q31 q31Var, ha2 ha2Var, ha2 ha2Var2) {
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
    public final Object invoke() {
        R6320827706769103704 a = R6320827706769103704.a(this.a.j, this.b, this.c, "");
        j6 a2 = j6.a(this.d, this.e, this.f, this.g, true);
        if (K5751602218013079365.C.a) {
            return new m6(a2, a, UUID.randomUUID().toString());
        }
        S10973172697741180971.m("Method called before OM SDK activation");
        return null;
    }
}
