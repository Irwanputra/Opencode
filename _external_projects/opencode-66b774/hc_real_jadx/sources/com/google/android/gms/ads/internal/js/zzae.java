package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzaiq;
import com.google.android.gms.internal.zzalj;
import com.google.android.gms.internal.zzall;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p199.p200.C2374;
import p131.p161.p162.p193.p194.p199.p200.C2377;
import p131.p161.p162.p193.p194.p199.p200.C2380;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzae extends zzall<zzc> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public zzaiq<zzc> f2618;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f2620 = new Object();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f2619 = false;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2621 = 0;

    public zzae(zzaiq<zzc> zzaiqVar) {
        this.f2618 = zzaiqVar;
    }

    public final zzaa zzlp() {
        zzaa zzaaVar = new zzaa(this);
        synchronized (this.f2620) {
            zza(new C2380(zzaaVar), new C2374(zzaaVar));
            C1687.m3706(this.f2621 >= 0);
            this.f2621++;
        }
        return zzaaVar;
    }

    public final void zzlr() {
        synchronized (this.f2620) {
            C1687.m3706(this.f2621 >= 0);
            zzagf.v("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f2619 = true;
            m1209();
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1209() {
        synchronized (this.f2620) {
            C1687.m3706(this.f2621 >= 0);
            if (this.f2619 && this.f2621 == 0) {
                zzagf.v("No reference is left (including root). Cleaning up engine.");
                zza(new C2377(this), new zzalj());
            } else {
                zzagf.v("There are still references to the engine. Not destroying.");
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1210() {
        synchronized (this.f2620) {
            C1687.m3706(this.f2621 > 0);
            zzagf.v("Releasing 1 reference for JS Engine");
            this.f2621--;
            m1209();
        }
    }
}
