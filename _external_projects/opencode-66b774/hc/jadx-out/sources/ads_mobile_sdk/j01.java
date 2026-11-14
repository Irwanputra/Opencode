package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B2825725843028148090;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.H2607093550274855851;
import dev.epro.r0.J6457333644812339360;
import dev.epro.r0.K8888766238980911980;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O12494175665883759871;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.V16504496955554646429;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class j01 {
    public final Context a;
    public final jr0 b;
    public final O12494175665883759871 c;

    public j01(Context context, jr0 jr0Var) {
        context.getClass();
        jr0Var.getClass();
        this.a = context;
        this.b = jr0Var;
        this.c = new O12494175665883759871(new H2607093550274855851(this, (byte) 2));
    }

    public final Object a(String str, String str2, Map map, boolean z, h92 h92Var) {
        jr0 jr0Var = this.b;
        jr0Var.getClass();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        return V16504496955554646429.s(E17093345031926825464.e(((E17093345031926825464) jr0Var.a("gads:hsdp_open_timeout:ms", new E17093345031926825464(M9216324016624295870.Z(60, N13798149404328803870.SECONDS)), ao.a)).a), new g01(this, str, str2, map, z, null), h92Var);
    }

    public final void a(String str) {
        synchronized (((K8888766238980911980) this.c.getValue())) {
            ((J6457333644812339360) ((K8888766238980911980) this.c.getValue())).a(str);
        }
    }

    public final Object a(B2825725843028148090 b2825725843028148090, jg2 jg2Var) {
        jr0 jr0Var = this.b;
        jr0Var.getClass();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        return V16504496955554646429.s(E17093345031926825464.e(((E17093345031926825464) jr0Var.a("gads:hsdp_prewarm_timeout:ms", new E17093345031926825464(M9216324016624295870.Z(60, N13798149404328803870.SECONDS)), ao.a)).a), new fb((Object) this, (Object) b2825725843028148090, (R4833348786910499294) null, (byte) 10), jg2Var);
    }
}
