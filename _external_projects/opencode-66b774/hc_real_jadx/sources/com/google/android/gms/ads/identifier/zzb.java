package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import p131.p161.p162.p193.p205.C2475;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzb {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public SharedPreferences f2582;

    public zzb(Context context) {
        try {
            Context m4508 = C2475.m4508(context);
            this.f2582 = m4508 == null ? null : m4508.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable unused) {
            this.f2582 = null;
        }
    }

    public final boolean getBoolean(String str, boolean z) {
        try {
            SharedPreferences sharedPreferences = this.f2582;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
