package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface MediationAdapter {

    public static class zza {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f2810;

        public final zza zzah(int i) {
            this.f2810 = 1;
            return this;
        }

        public final Bundle zzuk() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f2810);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
