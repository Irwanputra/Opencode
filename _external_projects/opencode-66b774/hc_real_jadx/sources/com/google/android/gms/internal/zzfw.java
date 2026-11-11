package com.google.android.gms.internal;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfw extends ContentObserver {
    private /* synthetic */ zzft zzawn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfw(zzft zzftVar, Handler handler) {
        super(handler);
        this.zzawn = zzftVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        this.zzawn.zzfx();
    }
}
