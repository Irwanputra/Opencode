package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.F7878618420024429111;
import dev.epro.r0.H15747516787109764287;
import dev.epro.r0.O5378677881740157249;
import dev.epro.r0.T8598786036980488824;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class op3 {
    public final Context a;
    public final bs3 b;
    public final jr0 c;

    public op3(Context context, bs3 bs3Var, jr0 jr0Var) {
        context.getClass();
        bs3Var.getClass();
        jr0Var.getClass();
        this.a = context;
        this.b = bs3Var;
        this.c = jr0Var;
    }

    public final void a(F7878618420024429111 f7878618420024429111, boolean z, gq3 gq3Var) {
        Set set;
        jr0 jr0Var = this.c;
        f7878618420024429111.getClass();
        try {
            jr0Var.getClass();
            Boolean bool = Boolean.TRUE;
            ao aoVar = ao.a$11;
            set = (((Boolean) jr0Var.a("gads:webview_profile:enabled", bool, aoVar)).booleanValue() && ((Boolean) jr0Var.a("gads:init_profile_during_webview_startup:enabled", Boolean.FALSE, aoVar)).booleanValue()) ? O5378677881740157249.V0(new String[]{"GMA_WEBVIEW_PROFILE", "Default"}) : T8598786036980488824.z("Default");
        } catch (Throwable unused) {
            set = H15747516787109764287.a;
        }
        AtomicBoolean atomicBoolean = lp3.a;
        lp3.a(this.a, f7878618420024429111, z, set, gq3Var);
    }
}
