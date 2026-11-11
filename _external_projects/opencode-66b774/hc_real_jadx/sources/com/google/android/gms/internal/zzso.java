package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzso implements zztc {
    private /* synthetic */ String val$name;
    private /* synthetic */ String zzbzf;

    public zzso(zzsn zzsnVar, String str, String str2) {
        this.val$name = str;
        this.zzbzf = str2;
    }

    @Override // com.google.android.gms.internal.zztc
    public final void zzb(zztd zztdVar) {
        zzkx zzkxVar = zztdVar.zzbzk;
        if (zzkxVar != null) {
            zzkxVar.onAppEvent(this.val$name, this.zzbzf);
        }
    }
}
