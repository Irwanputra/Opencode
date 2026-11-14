package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import dev.epro.r0.S10973172697741180971;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ra1 {
    public final Context a;
    public qa1 b;

    public ra1(Context context) {
        context.getClass();
        this.a = context;
    }

    public final void a(c7 c7Var) {
        ServiceInfo serviceInfo;
        Context context = this.a;
        if (context == null) {
            S10973172697741180971.j("Please provide a valid Context.");
            return;
        }
        qa1 qa1Var = new qa1(context);
        byte b = qa1Var.a;
        if (b == 2 && qa1Var.d != null && qa1Var.e != null) {
            c7Var.a(0);
        } else if (b == 1) {
            c7Var.a(3);
        } else if (b == 3) {
            c7Var.a(3);
        } else {
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            Context context2 = qa1Var.b;
            List<ResolveInfo> queryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                qa1Var.a = (byte) 0;
                c7Var.a(2);
            } else {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    try {
                        if (context2.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                            Intent intent2 = new Intent(intent);
                            pa1 pa1Var = new pa1(qa1Var, c7Var);
                            qa1Var.e = pa1Var;
                            try {
                                if (!context2.bindService(intent2, pa1Var, 1)) {
                                    qa1Var.a = (byte) 0;
                                    c7Var.a(1);
                                }
                            } catch (SecurityException unused) {
                                qa1Var.a = (byte) 0;
                                c7Var.a(4);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
                qa1Var.a = (byte) 0;
                c7Var.a(2);
            }
        }
        this.b = qa1Var;
    }
}
