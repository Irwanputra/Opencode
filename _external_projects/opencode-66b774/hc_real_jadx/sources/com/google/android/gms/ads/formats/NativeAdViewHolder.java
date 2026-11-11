package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzpz;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p034.p095.C1687;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class NativeAdViewHolder {
    public static WeakHashMap<View, NativeAdViewHolder> zzamp = new WeakHashMap<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public WeakReference<View> f2561;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public zzpz f2562;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        C1687.m3726(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzakb.e("The provided containerView is of type NativeAdView. NativeAdView objects should not be used with NativeAdViewHolder.");
        } else {
            if (zzamp.get(view) != null) {
                zzakb.e("The provided containerView is already in use with another NativeAdViewHolder.");
                return;
            }
            zzamp.put(view, this);
            this.f2561 = new WeakReference<>(view);
            this.f2562 = zzkb.zzib().zza(view, map == null ? new HashMap<>() : new HashMap<>(map), map2 == null ? new HashMap<>() : new HashMap<>(map2));
        }
    }

    public final void setNativeAd(NativeAd nativeAd) {
        WeakReference<View> weakReference = this.f2561;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            zzakb.zzcu("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zzamp.containsKey(view)) {
            zzamp.put(view, this);
        }
        zzpz zzpzVar = this.f2562;
        if (zzpzVar != null) {
            try {
                zzpzVar.zza((InterfaceC2455) nativeAd.zzbl());
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void unregisterNativeAd() {
        zzpz zzpzVar = this.f2562;
        if (zzpzVar != null) {
            try {
                zzpzVar.unregisterNativeAd();
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference<View> weakReference = this.f2561;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            zzamp.remove(view);
        }
    }
}
