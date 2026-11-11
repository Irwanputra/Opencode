package com.google.android.gms.internal;

import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaeg extends zzaen {
    private volatile zzaeh zzcvg;
    private volatile zzaee zzcvs;
    private volatile zzaef zzcvt;

    public zzaeg(zzaef zzaefVar) {
        this.zzcvt = zzaefVar;
    }

    public final void zza(zzaee zzaeeVar) {
        this.zzcvs = zzaeeVar;
    }

    public final void zza(zzaeh zzaehVar) {
        this.zzcvg = zzaehVar;
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zza(InterfaceC2455 interfaceC2455, zzaeq zzaeqVar) {
        if (this.zzcvt != null) {
            this.zzcvt.zzc(zzaeqVar);
        }
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzc(InterfaceC2455 interfaceC2455, int i) {
        if (this.zzcvs != null) {
            this.zzcvs.zzaa(i);
        }
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzd(InterfaceC2455 interfaceC2455, int i) {
        if (this.zzcvg != null) {
            this.zzcvg.zza(BinderC2454.m4502(interfaceC2455).getClass().getName(), i);
        }
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzm(InterfaceC2455 interfaceC2455) {
        if (this.zzcvs != null) {
            this.zzcvs.zzof();
        }
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzn(InterfaceC2455 interfaceC2455) {
        if (this.zzcvg != null) {
            this.zzcvg.zzbr(BinderC2454.m4502(interfaceC2455).getClass().getName());
        }
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzo(InterfaceC2455 interfaceC2455) {
        if (this.zzcvt != null) {
            this.zzcvt.onRewardedVideoAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzp(InterfaceC2455 interfaceC2455) {
        if (this.zzcvt != null) {
            this.zzcvt.onRewardedVideoStarted();
        }
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzq(InterfaceC2455 interfaceC2455) {
        if (this.zzcvt != null) {
            this.zzcvt.onRewardedVideoAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzr(InterfaceC2455 interfaceC2455) {
        if (this.zzcvt != null) {
            this.zzcvt.zzoc();
        }
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzs(InterfaceC2455 interfaceC2455) {
        if (this.zzcvt != null) {
            this.zzcvt.onRewardedVideoAdLeftApplication();
        }
    }
}
