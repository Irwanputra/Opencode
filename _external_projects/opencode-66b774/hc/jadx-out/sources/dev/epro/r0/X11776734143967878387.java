package dev.epro.r0;

import ads_mobile_sdk.b03;
import ads_mobile_sdk.e52;
import ads_mobile_sdk.ko1;
import ads_mobile_sdk.qw2;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X11776734143967878387 {
    public static Q16898486116126855517 a(X11776734143967878387 x11776734143967878387, String str, boolean z, qw2 qw2Var, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) == 0;
        if ((i & 8) != 0) {
            qw2Var = qw2.d;
        }
        x11776734143967878387.getClass();
        str.getClass();
        qw2Var.getClass();
        try {
            Object objNewInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            if (!z) {
                if (objNewInstance instanceof J2562139256184902546) {
                    J2562139256184902546 j2562139256184902546 = (J2562139256184902546) objNewInstance;
                    if (((qw2Var == qw2.f && (j2562139256184902546 instanceof MediationBannerAdapter)) || ((qw2Var == qw2.h && (j2562139256184902546 instanceof MediationInterstitialAdapter)) || (qw2Var == qw2.i && (j2562139256184902546 instanceof MediationNativeAdapter)))) && !z2) {
                        return new e52((J2562139256184902546) objNewInstance);
                    }
                }
                if (objNewInstance instanceof R1776126100510317963) {
                    return new ko1((R1776126100510317963) objNewInstance);
                }
            } else if (objNewInstance instanceof RtbAdapter) {
                return new b03((RtbAdapter) objNewInstance);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
