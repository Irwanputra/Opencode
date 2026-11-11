package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaaj {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(Context context, boolean z) {
        if (!z) {
            return true;
        }
        zzbs.zzei();
        int zzav = zzahn.zzav(context);
        if (zzav == 0) {
            return false;
        }
        zzbs.zzei();
        return zzav <= zzahn.zzaw(context);
    }
}
