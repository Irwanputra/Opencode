package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.zzalj;
import com.google.android.gms.internal.zzall;
import p131.p161.p162.p193.p194.p199.p200.C2362;
import p131.p161.p162.p193.p194.p199.p200.C2369;
import p131.p161.p162.p193.p194.p199.p200.C2370;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaa extends zzall<zzaj> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzae f2615;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f2616;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f2617 = new Object();

    public zzaa(zzae zzaeVar) {
        this.f2615 = zzaeVar;
    }

    public final void release() {
        synchronized (this.f2617) {
            if (this.f2616) {
                return;
            }
            this.f2616 = true;
            zza(new C2370(), new zzalj());
            zza(new C2362(this), new C2369(this));
        }
    }
}
