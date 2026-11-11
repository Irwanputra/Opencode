package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqt;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzrc;
import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzzv;
import p034.p080.C1493;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaj extends zzko {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public zzrf f2685;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public zzkh f2686;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public PublisherAdViewOptions f2688;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final zzakd f2689;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final zzv f2690;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final String f2691;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public zzqq f2692;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public zzqt f2693;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public zzld f2694;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final Context f2696;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public zzrc f2697;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final zzux f2698;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public zzjn f2699;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public zzpe f2700;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1493<String, zzqz> f2687 = new C1493<>();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1493<String, zzqw> f2695 = new C1493<>();

    public zzaj(Context context, String str, zzux zzuxVar, zzakd zzakdVar, zzv zzvVar) {
        this.f2696 = context;
        this.f2691 = str;
        this.f2698 = zzuxVar;
        this.f2689 = zzakdVar;
        this.f2690 = zzvVar;
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.f2688 = publisherAdViewOptions;
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(zzpe zzpeVar) {
        this.f2700 = zzpeVar;
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(zzqq zzqqVar) {
        this.f2692 = zzqqVar;
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(zzqt zzqtVar) {
        this.f2693 = zzqtVar;
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(zzrc zzrcVar) {
        this.f2697 = zzrcVar;
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(zzrf zzrfVar, zzjn zzjnVar) {
        this.f2685 = zzrfVar;
        this.f2699 = zzjnVar;
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zza(String str, zzqz zzqzVar, zzqw zzqwVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f2687.put(str, zzqzVar);
        this.f2695.put(str, zzqwVar);
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zzb(zzkh zzkhVar) {
        this.f2686 = zzkhVar;
    }

    @Override // com.google.android.gms.internal.zzkn
    public final void zzb(zzld zzldVar) {
        this.f2694 = zzldVar;
    }

    @Override // com.google.android.gms.internal.zzkn
    public final zzkk zzdi() {
        return new zzag(this.f2696, this.f2691, this.f2698, this.f2689, this.f2686, this.f2692, this.f2697, this.f2693, this.f2687, this.f2695, this.f2700, this.f2694, this.f2690, this.f2685, this.f2699, this.f2688);
    }
}
