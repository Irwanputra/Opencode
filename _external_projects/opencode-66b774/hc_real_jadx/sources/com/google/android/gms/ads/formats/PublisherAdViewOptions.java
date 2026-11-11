package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzbfp;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzky;
import com.google.android.gms.internal.zzzv;
import p131.p161.p162.p193.p194.p195.C2352;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class PublisherAdViewOptions extends zzbfm {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzc();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean f2563;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final zzkx f2564;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AppEventListener f2565;

    public static final class Builder {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public AppEventListener f2566;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f2567 = false;

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this, (C2352) null);
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.f2566 = appEventListener;
            return this;
        }

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.f2567 = z;
            return this;
        }
    }

    public PublisherAdViewOptions(Builder builder, C2352 c2352) {
        this.f2563 = builder.f2567;
        AppEventListener appEventListener = builder.f2566;
        this.f2565 = appEventListener;
        this.f2564 = appEventListener != null ? new zzjp(this.f2565) : null;
    }

    public PublisherAdViewOptions(boolean z, IBinder iBinder) {
        this.f2563 = z;
        this.f2564 = iBinder != null ? zzky.zzg(iBinder) : null;
    }

    public final AppEventListener getAppEventListener() {
        return this.f2565;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.f2563;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 1, getManualImpressionsEnabled());
        zzkx zzkxVar = this.f2564;
        zzbfp.zza(parcel, 2, zzkxVar == null ? null : zzkxVar.asBinder(), false);
        zzbfp.zzai(parcel, zze);
    }

    public final zzkx zzbn() {
        return this.f2564;
    }
}
