package com.google.android.gms.internal;

import android.text.TextUtils;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznm {
    public static zznk zza(zznj zznjVar) {
        if (!zznjVar.zziy()) {
            zzagf.v("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        }
        if (zznjVar.getContext() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zznjVar.zzfs())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        return new zznk(zznjVar.getContext(), zznjVar.zzfs(), zznjVar.zziz(), zznjVar.zzja());
    }
}
