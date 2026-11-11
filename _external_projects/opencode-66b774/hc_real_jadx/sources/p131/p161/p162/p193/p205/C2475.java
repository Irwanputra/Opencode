package p131.p161.p162.p193.p205;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2475 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final AtomicBoolean f9808;

    static {
        new AtomicBoolean();
        f9808 = new AtomicBoolean();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Context m4508(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
