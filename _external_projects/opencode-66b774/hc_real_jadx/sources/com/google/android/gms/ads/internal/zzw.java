package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.zzaaz;
import com.google.android.gms.internal.zzafb;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzzv;
import java.util.List;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzw {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f2805;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public zzafb f2806;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f2807;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public zzaaz f2808;

    public zzw(Context context, zzafb zzafbVar, zzaaz zzaazVar) {
        this.f2807 = context;
        this.f2806 = zzafbVar;
        this.f2808 = zzaazVar;
        if (zzaazVar == null) {
            this.f2808 = new zzaaz();
        }
    }

    public final void recordClick() {
        this.f2805 = true;
    }

    public final boolean zzda() {
        return !m1243() || this.f2805;
    }

    public final void zzt(String str) {
        List<String> list;
        if (m1243()) {
            if (str == null) {
                str = "";
            }
            zzafb zzafbVar = this.f2806;
            if (zzafbVar != null) {
                zzafbVar.zza(str, null, 3);
                return;
            }
            zzaaz zzaazVar = this.f2808;
            if (!zzaazVar.zzcpw || (list = zzaazVar.zzcpx) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzbs.zzei();
                    zzahn.zze(this.f2807, "", replace);
                }
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean m1243() {
        zzafb zzafbVar = this.f2806;
        return (zzafbVar != null && zzafbVar.zzok().zzcwu) || this.f2808.zzcpw;
    }
}
