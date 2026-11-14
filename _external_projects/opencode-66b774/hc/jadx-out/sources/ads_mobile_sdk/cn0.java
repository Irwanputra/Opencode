package ads_mobile_sdk;

import android.net.Uri;
import dev.epro.r0.E16285158603488107888;
import dev.epro.r0.G842859980338292746;
import dev.epro.r0.I1581330382723795749;
import dev.epro.r0.N4061146215511977314;
import dev.epro.r0.P10917817599008460069;
import dev.epro.r0.Z13168519540281190457;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class cn0 implements E16285158603488107888 {
    public final bn0 a;
    public final jr0 b;

    public cn0(bn0 bn0Var, jr0 jr0Var) {
        bn0Var.getClass();
        jr0Var.getClass();
        this.a = bn0Var;
        this.b = jr0Var;
    }

    @Override // dev.epro.r0.E16285158603488107888
    public final P10917817599008460069 intercept(N4061146215511977314 n4061146215511977314) {
        String str = n4061146215511977314.e.a.h;
        String strR = this.b.R();
        bn0 bn0Var = this.a;
        Uri.Builder builderAppendQueryParameter = Uri.parse(Z13168519540281190457.D(false, str, strR, bn0Var.c)).buildUpon().appendQueryParameter("gmp_app_id", bn0Var.a).appendQueryParameter("fbs_aiid", bn0Var.b);
        if (builderAppendQueryParameter.build().getQueryParameter("fbs_aeid") == null) {
            builderAppendQueryParameter.appendQueryParameter("fbs_aeid", bn0Var.c);
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        I1581330382723795749 i1581330382723795749 = new I1581330382723795749((byte) 5);
        String string = uriBuild.toString();
        string.getClass();
        i1581330382723795749.p(string);
        return n4061146215511977314.b(new G842859980338292746(i1581330382723795749));
    }
}
