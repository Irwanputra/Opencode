package com.google.android.gms.internal;

import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzyd extends zzagb {
    private final zzyb zzcjj;
    private final zzafp zzcjk;
    private final zzaax zzcjl;

    public zzyd(zzafp zzafpVar, zzyb zzybVar) {
        this.zzcjk = zzafpVar;
        this.zzcjl = zzafpVar.zzcxy;
        this.zzcjj = zzybVar;
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void onStop() {
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void zzdm() {
        zzafp zzafpVar = this.zzcjk;
        zzaat zzaatVar = zzafpVar.zzcqv;
        zzjj zzjjVar = zzaatVar.zzcnd;
        zzaax zzaaxVar = this.zzcjl;
        int i = zzaaxVar.orientation;
        long j = zzaaxVar.zzcdq;
        String str = zzaatVar.zzcng;
        long j2 = zzaaxVar.zzcox;
        zzjn zzjnVar = zzafpVar.zzauc;
        long j3 = zzaaxVar.zzcov;
        long j4 = zzafpVar.zzcxp;
        long j5 = zzaaxVar.zzcpa;
        String str2 = zzaaxVar.zzcpb;
        JSONObject jSONObject = zzafpVar.zzcxj;
        zzaax zzaaxVar2 = zzafpVar.zzcxy;
        zzahn.zzdaw.post(new zzye(this, new zzafo(zzjjVar, null, null, 0, null, null, i, j, str, false, null, null, null, null, null, j2, zzjnVar, j3, j4, j5, str2, jSONObject, null, null, null, null, zzaaxVar2.zzcpo, zzaaxVar2.zzcpp, null, null, null, zzafpVar.zzcxw, zzaaxVar2.zzaqv, zzafpVar.zzcxx)));
    }
}
