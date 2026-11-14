package dev.epro.r0;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F5574204526321220811 {
    static {
        B14824868959299866349.o("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                B14824868959299866349.n().getClass();
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
                B14824868959299866349.n().getClass();
            }
        } catch (Exception unused) {
            B14824868959299866349.n().getClass();
        }
    }
}
