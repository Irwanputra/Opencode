package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.zzaig;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzlh;
import com.google.android.gms.internal.zzmx;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zzzv;
import p131.p161.p162.p193.p194.p199.RunnableC2393;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaw extends zzlh {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final Object f2710 = new Object();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static zzaw f2711;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Context f2712;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f2713 = false;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public zzakd f2714;

    public zzaw(Context context, zzakd zzakdVar) {
        this.f2712 = context;
        this.f2714 = zzakdVar;
    }

    public static zzaw zza(Context context, zzakd zzakdVar) {
        zzaw zzawVar;
        synchronized (f2710) {
            if (f2711 == null) {
                f2711 = new zzaw(context.getApplicationContext(), zzakdVar);
            }
            zzawVar = f2711;
        }
        return zzawVar;
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void initialize() {
        synchronized (f2710) {
            if (this.f2713) {
                zzakb.zzcu("Mobile ads is initialized already.");
                return;
            }
            this.f2713 = true;
            zznh.initialize(this.f2712);
            zzbs.zzem().zzc(this.f2712, this.f2714);
            zzbs.zzen().initialize(this.f2712);
        }
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void setAppMuted(boolean z) {
        zzbs.zzff().setAppMuted(z);
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void setAppVolume(float f) {
        zzbs.zzff().setAppVolume(f);
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void zza(String str, InterfaceC2455 interfaceC2455) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zznh.initialize(this.f2712);
        boolean booleanValue = ((Boolean) zzkb.zzif().zzd(zznh.zzbpl)).booleanValue();
        zzmx<Boolean> zzmxVar = zznh.zzblc;
        boolean booleanValue2 = booleanValue | ((Boolean) zzkb.zzif().zzd(zzmxVar)).booleanValue();
        RunnableC2393 runnableC2393 = null;
        if (((Boolean) zzkb.zzif().zzd(zzmxVar)).booleanValue()) {
            booleanValue2 = true;
            runnableC2393 = new RunnableC2393(this, (Runnable) BinderC2454.m4502(interfaceC2455));
        }
        if (booleanValue2) {
            zzbs.zzep().zza(this.f2712, this.f2714, str, runnableC2393);
        }
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void zzb(InterfaceC2455 interfaceC2455, String str) {
        if (interfaceC2455 == null) {
            zzakb.e("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) BinderC2454.m4502(interfaceC2455);
        if (context == null) {
            zzakb.e("Context is null. Failed to open debug menu.");
            return;
        }
        zzaig zzaigVar = new zzaig(context);
        zzaigVar.setAdUnitId(str);
        zzaigVar.zzcl(this.f2714.zzcv);
        zzaigVar.showDialog();
    }

    @Override // com.google.android.gms.internal.zzlg
    public final float zzdn() {
        return zzbs.zzff().zzdn();
    }

    @Override // com.google.android.gms.internal.zzlg
    public final boolean zzdo() {
        return zzbs.zzff().zzdo();
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void zzu(String str) {
        zznh.initialize(this.f2712);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbpl)).booleanValue()) {
            zzbs.zzep().zza(this.f2712, this.f2714, str, null);
        }
    }
}
