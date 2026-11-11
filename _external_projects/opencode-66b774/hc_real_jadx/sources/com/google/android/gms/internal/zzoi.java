package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzoi extends zzpr {
    private final Uri mUri;
    private final Drawable zzbtq;
    private final double zzbtr;

    public zzoi(Drawable drawable, Uri uri, double d) {
        this.zzbtq = drawable;
        this.mUri = uri;
        this.zzbtr = d;
    }

    @Override // com.google.android.gms.internal.zzpq
    public final double getScale() {
        return this.zzbtr;
    }

    @Override // com.google.android.gms.internal.zzpq
    public final Uri getUri() {
        return this.mUri;
    }

    @Override // com.google.android.gms.internal.zzpq
    public final InterfaceC2455 zzjr() {
        return new BinderC2454(this.zzbtq);
    }
}
