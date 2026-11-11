package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaiz implements zzx {
    private /* synthetic */ String zzcml;
    private /* synthetic */ zzajc zzdcn;

    public zzaiz(zzaiv zzaivVar, String str, zzajc zzajcVar) {
        this.zzcml = str;
        this.zzdcn = zzajcVar;
    }

    @Override // com.google.android.gms.internal.zzx
    public final void zzd(zzad zzadVar) {
        String str = this.zzcml;
        String exc = zzadVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(exc).length() + String.valueOf(str).length() + 21);
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        zzakb.zzcu(sb.toString());
        this.zzdcn.zzb(null);
    }
}
