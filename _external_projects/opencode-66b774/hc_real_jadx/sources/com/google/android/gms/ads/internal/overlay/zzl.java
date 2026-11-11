package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzje;
import com.google.android.gms.internal.zzzv;
import p034.p095.C1687;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzl {
    public static void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzcje == 4 && adOverlayInfoParcel.zzcix == null) {
            zzje zzjeVar = adOverlayInfoParcel.zzciw;
            if (zzjeVar != null) {
                zzjeVar.onAdClicked();
            }
            zzbs.zzef();
            zza.zza(context, adOverlayInfoParcel.zzciv, adOverlayInfoParcel.zzcjd);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzaty.zzdel);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.zza(intent, adOverlayInfoParcel);
        if (!C1687.m3651()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        zzbs.zzei();
        zzahn.zza(context, intent);
    }
}
