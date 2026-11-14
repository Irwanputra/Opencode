package ads_mobile_sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.view.View;
import android.view.WindowManager;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.Y2677586711477821327;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 {
    public final g0 a;
    public final jr0 b;
    public final PowerManager c;
    public final KeyguardManager d;

    public dj0(Context context, g0 g0Var, jr0 jr0Var) {
        context.getClass();
        g0Var.getClass();
        jr0Var.getClass();
        this.a = g0Var;
        this.b = jr0Var;
        this.c = (PowerManager) context.getSystemService(PowerManager.class);
        this.d = (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public final boolean a(qw2 qw2Var, z1 z1Var) {
        qw2Var.getClass();
        z1Var.getClass();
        jr0 jr0Var = this.b;
        jr0Var.getClass();
        Y2677586711477821327 y2677586711477821327 = qw2.b;
        if (((List) jr0Var.a("gads:lock_screen_viewable_formats", K5751602218013079365.U("native"), ao.a$23)).contains(qw2Var.a)) {
            return true;
        }
        return ((Boolean) jr0Var.a("gads:lockscreen_display_allowlist", Boolean.TRUE, ao.a$11)).booleanValue() && z1Var.B;
    }

    public final WindowManager b(Context context) {
        context.getClass();
        Object systemService = c(context).getSystemService((Class<Object>) WindowManager.class);
        systemService.getClass();
        return (WindowManager) systemService;
    }

    public final Context c(Context context) {
        context.getClass();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            return activity;
        }
        Activity activityB = this.a.b();
        return activityB != null ? activityB : context;
    }

    public final boolean a(View view, boolean z) {
        view.getClass();
        if (this.c.isInteractive() && view.getVisibility() == 0 && view.isShown() && view.getLocalVisibleRect(new Rect()) && view.getGlobalVisibleRect(new Rect())) {
            return z || !this.d.isKeyguardLocked();
        }
        return false;
    }
}
