package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzaiq;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzzv;
import p131.p161.p162.p193.p194.p199.p200.C2363;
import p131.p161.p162.p193.p194.p199.p200.C2381;
import p131.p161.p162.p193.p194.p199.p200.RunnableC2368;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzn {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2625;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Context f2626;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public zzae f2627;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f2628;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f2629;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public zzaiq<zzc> f2630;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public zzaiq<zzc> f2631;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final zzakd f2632;

    public zzn(Context context, zzakd zzakdVar, String str) {
        this.f2629 = new Object();
        this.f2625 = 1;
        this.f2628 = str;
        this.f2626 = context.getApplicationContext();
        this.f2632 = zzakdVar;
        this.f2630 = new zzz();
        this.f2631 = new zzz();
    }

    public zzn(Context context, zzakd zzakdVar, String str, zzaiq<zzc> zzaiqVar, zzaiq<zzc> zzaiqVar2) {
        this(context, zzakdVar, str);
        this.f2630 = zzaiqVar;
        this.f2631 = zzaiqVar2;
    }

    public final zzaa zzb(zzcv zzcvVar) {
        synchronized (this.f2629) {
            zzae zzaeVar = this.f2627;
            if (zzaeVar != null && zzaeVar.getStatus() != -1) {
                int i = this.f2625;
                if (i == 0) {
                    return this.f2627.zzlp();
                }
                if (i == 1) {
                    this.f2625 = 2;
                    m1212(null);
                    return this.f2627.zzlp();
                }
                if (i == 2) {
                    return this.f2627.zzlp();
                }
                return this.f2627.zzlp();
            }
            this.f2625 = 2;
            zzae m1212 = m1212(null);
            this.f2627 = m1212;
            return m1212.zzlp();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final zzae m1212(zzcv zzcvVar) {
        zzae zzaeVar = new zzae(this.f2631);
        zzbs.zzei();
        zzahn.runOnUiThread(new RunnableC2368(this, zzcvVar, zzaeVar));
        zzaeVar.zza(new C2381(this, zzaeVar), new C2363(this, zzaeVar));
        return zzaeVar;
    }
}
