package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfz implements zzhd {
    private final WeakReference<View> zzawr;
    private final WeakReference<zzafo> zzaws;

    public zzfz(View view, zzafo zzafoVar) {
        this.zzawr = new WeakReference<>(view);
        this.zzaws = new WeakReference<>(zzafoVar);
    }

    @Override // com.google.android.gms.internal.zzhd
    public final View zzgd() {
        return this.zzawr.get();
    }

    @Override // com.google.android.gms.internal.zzhd
    public final boolean zzge() {
        return this.zzawr.get() == null || this.zzaws.get() == null;
    }

    @Override // com.google.android.gms.internal.zzhd
    public final zzhd zzgf() {
        return new zzfy(this.zzawr.get(), this.zzaws.get());
    }
}
