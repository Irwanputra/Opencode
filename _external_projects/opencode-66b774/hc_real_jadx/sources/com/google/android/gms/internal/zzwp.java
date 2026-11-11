package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzbs;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzwp implements DialogInterface.OnClickListener {
    private /* synthetic */ zzwo zzcgj;

    public zzwp(zzwo zzwoVar) {
        this.zzcgj = zzwoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent createIntent = this.zzcgj.createIntent();
        zzbs.zzei();
        context = this.zzcgj.mContext;
        zzahn.zza(context, createIntent);
    }
}
