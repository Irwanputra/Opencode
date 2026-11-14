package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import dev.epro.r0.N1486767233833082383;
import dev.epro.r0.S10973172697741180971;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class lm0 implements N1486767233833082383 {
    public final Context a;
    public final mm0 b;

    public lm0(Context context) {
        if (context == null) {
            S10973172697741180971.j("Application context cannot be null");
            throw null;
        }
        this.a = context;
        this.b = mm0.a(context);
    }

    public final void a(c7 c7Var) {
        boolean hasSystemFeature;
        boolean z;
        Map map;
        mm0 mm0Var = this.b;
        if (mm0Var.b != null) {
            z = mm0Var.b.booleanValue();
        } else {
            synchronized (mm0Var) {
                try {
                    if (mm0Var.b != null) {
                        hasSystemFeature = mm0Var.b.booleanValue();
                    } else {
                        if (!mm0Var.a()) {
                            mm0Var.b = Boolean.FALSE;
                            return;
                        }
                        try {
                            PackageManager packageManager = mm0Var.c.getPackageManager();
                            if (packageManager == null) {
                                mm0Var.b = Boolean.FALSE;
                                return;
                            } else {
                                hasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                mm0Var.b = Boolean.valueOf(hasSystemFeature);
                            }
                        } catch (SecurityException unused) {
                            mm0Var.b = Boolean.FALSE;
                            return;
                        } catch (Exception unused2) {
                            mm0Var.b = Boolean.FALSE;
                            return;
                        }
                    }
                    z = hasSystemFeature;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z && (map = (Map) c7Var.a) != null) {
            String str = (String) map.get("verifierurl");
            String str2 = (String) ((Map) c7Var.a).get("version");
            if (str2 == null || str2.trim().isEmpty()) {
                str2 = "1.0";
            }
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            try {
                new URL(str);
                if (!str.startsWith("https://")) {
                    if (!str.startsWith("http://")) {
                        return;
                    }
                }
                if (this.a == null) {
                    return;
                }
                PrivacyPass.getInstance(this.a).attest(new VerificationContext(Collections.singletonList(str)), (AttestAPICallback) null, str2);
            } catch (IllegalArgumentException | MalformedURLException | Exception unused3) {
            }
        }
    }
}
