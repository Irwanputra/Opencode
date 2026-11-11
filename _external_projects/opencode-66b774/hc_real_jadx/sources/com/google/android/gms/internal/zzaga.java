package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.zzbs;
import java.math.BigInteger;
import java.util.Locale;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaga {
    private static final Object sLock = new Object();
    private static String zzdab;

    public static String zzc(Context context, String str, String str2) {
        String str3;
        String str4;
        synchronized (sLock) {
            if (zzdab == null && !TextUtils.isEmpty(str)) {
                try {
                    ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
                    Class<?> cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
                    BigInteger bigInteger = new BigInteger(new byte[1]);
                    String[] split = str.split(",");
                    for (int i = 0; i < split.length; i++) {
                        zzbs.zzei();
                        if (zzahn.zza(classLoader, cls, split[i])) {
                            bigInteger = bigInteger.setBit(i);
                        }
                    }
                    str4 = String.format(Locale.US, "%X", bigInteger);
                } catch (Throwable unused) {
                    str4 = NotificationCompat.CATEGORY_ERROR;
                }
                zzdab = str4;
            }
            str3 = zzdab;
        }
        return str3;
    }

    public static String zzpx() {
        String str;
        synchronized (sLock) {
            str = zzdab;
        }
        return str;
    }
}
