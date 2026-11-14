package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.K4548097313143615345;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R9411874267597469228;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class s82 implements K4548097313143615345 {
    public final x52 a;
    public final String b;
    public final jr0 c;
    public final rw0 d;

    public s82(x52 x52Var, String str, jr0 jr0Var, rw0 rw0Var) {
        x52Var.getClass();
        str.getClass();
        jr0Var.getClass();
        rw0Var.getClass();
        this.a = x52Var;
        this.b = str;
        this.c = jr0Var;
        this.d = rw0Var;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* JADX INFO: renamed from: a */
    public final cw0 mo19a() {
        return cw0.OMID;
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object d(R4833348786910499294 r4833348786910499294) {
        String strC;
        String str;
        jr0 jr0Var = this.c;
        jr0Var.getClass();
        List list = (List) jr0Var.a("gads:omid_instant_app_incompatible_versions", K5751602218013079365.V("1.5.2", "1.4.14"), ao.a$23);
        x52 x52Var = this.a;
        if (R9411874267597469228.v0(list, x52Var.b()) && this.d.c()) {
            str = null;
            strC = null;
        } else {
            String strB = x52Var.b();
            strC = G6547577305291411977.C((String) jr0Var.a("gads:omid_partner_name_prefix", "Google/", ao.a$6), this.b);
            str = strB;
        }
        return new xu0(new r82(x52Var.b(), str, strC));
    }
}
