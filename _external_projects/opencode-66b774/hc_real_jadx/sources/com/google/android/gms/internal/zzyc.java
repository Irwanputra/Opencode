package com.google.android.gms.internal;

import android.content.Context;
import org.jasypt.digest.StandardStringDigester;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public class zzyc extends zzxu implements zzanm {
    public zzyc(Context context, zzafp zzafpVar, zzanh zzanhVar, zzyb zzybVar) {
        super(context, zzafpVar, zzanhVar, zzybVar);
    }

    @Override // com.google.android.gms.internal.zzxu
    public final void zznc() {
        if (this.zzcjl.errorCode != -2) {
            return;
        }
        this.zzbyk.zzsz().zza(this);
        zzne();
        zzakb.zzbx("Loading HTML in WebView.");
        zzanh zzanhVar = this.zzbyk;
        zzaax zzaaxVar = this.zzcjl;
        zzanhVar.loadDataWithBaseURL(zzaaxVar.zzcja, zzaaxVar.body, "text/html", StandardStringDigester.MESSAGE_CHARSET, null);
    }

    public void zzne() {
    }
}
