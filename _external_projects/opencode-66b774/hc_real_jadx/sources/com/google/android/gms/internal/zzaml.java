package com.google.android.gms.internal;

import android.os.Looper;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaml implements Runnable {
    public zzaml(zzamk zzamkVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
