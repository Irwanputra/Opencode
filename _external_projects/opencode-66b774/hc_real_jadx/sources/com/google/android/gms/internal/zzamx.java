package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzamx extends zzagb {
    public final zzamp zzdhj;
    public final zzana zzdjw;
    private final String zzdjx;

    public zzamx(zzamp zzampVar, zzana zzanaVar, String str) {
        this.zzdhj = zzampVar;
        this.zzdjw = zzanaVar;
        this.zzdjx = str;
        zzbs.zzfb().zza(this);
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void onStop() {
        this.zzdjw.abort();
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void zzdm() {
        try {
            this.zzdjw.zzcx(this.zzdjx);
        } finally {
            zzahn.zzdaw.post(new zzamy(this));
        }
    }
}
