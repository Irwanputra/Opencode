package ads_mobile_sdk;

import dev.epro.r0.B13729205492206812220;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.P9893650590651797888;
import dev.epro.r0.R6320827706769103704;
import dev.epro.r0.S10973172697741180971;
import java.util.UUID;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class l52 extends P9893650590651797888 implements B13729205492206812220 {
    public final /* synthetic */ String a;
    public final /* synthetic */ x52 b;
    public final /* synthetic */ tx0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ d00 e;
    public final /* synthetic */ q31 f;
    public final /* synthetic */ ha2 g;
    public final /* synthetic */ ha2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l52(String str, x52 x52Var, tx0 tx0Var, String str2, d00 d00Var, q31 q31Var, ha2 ha2Var, ha2 ha2Var2) {
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
    public final Object invoke() {
        R6320827706769103704 b = R6320827706769103704.b(ii.a(this.a, this.b.h), this.c, this.d, "");
        j6 a = j6.a(this.e, this.f, this.g, this.h, true);
        if (K5751602218013079365.C.a) {
            return new m6(a, b, UUID.randomUUID().toString());
        }
        S10973172697741180971.m("Method called before OM SDK activation");
        return null;
    }
}
