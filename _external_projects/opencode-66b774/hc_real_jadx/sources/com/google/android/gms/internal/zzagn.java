package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzagn extends zzahf {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzahg zzdai;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzagn(Context context, zzahg zzahgVar) {
        super(null);
        this.val$context = context;
        this.zzdai = zzahgVar;
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void zzdm() {
        SharedPreferences sharedPreferences = this.val$context.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("version_code", sharedPreferences.getInt("version_code", 0));
        zzahg zzahgVar = this.zzdai;
        if (zzahgVar != null) {
            zzahgVar.zzb(bundle);
        }
    }
}
