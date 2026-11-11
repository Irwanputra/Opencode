package com.google.android.gms.internal;

import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p034.p080.C1493;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzon extends zzqn implements zzou {
    private final Object mLock = new Object();
    private final zzog zzbua;
    private zzll zzbub;
    private View zzbuc;
    private zzos zzbuf;
    private final String zzbuk;
    private final C1493<String, zzoi> zzbul;
    private final C1493<String, String> zzbum;

    public zzon(String str, C1493<String, zzoi> c1493, C1493<String, String> c14932, zzog zzogVar, zzll zzllVar, View view) {
        this.zzbuk = str;
        this.zzbul = c1493;
        this.zzbum = c14932;
        this.zzbua = zzogVar;
        this.zzbub = zzllVar;
        this.zzbuc = view;
    }

    public static /* synthetic */ zzos zza(zzon zzonVar, zzos zzosVar) {
        zzonVar.zzbuf = null;
        return null;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final void destroy() {
        zzahn.zzdaw.post(new zzop(this));
        this.zzbub = null;
        this.zzbuc = null;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final List<String> getAvailableAssetNames() {
        String[] strArr = new String[this.zzbul.f6910 + this.zzbum.f6910];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C1493<String, zzoi> c1493 = this.zzbul;
            if (i2 >= c1493.f6910) {
                break;
            }
            strArr[i3] = c1493.m3246(i2);
            i2++;
            i3++;
        }
        while (true) {
            C1493<String, String> c14932 = this.zzbum;
            if (i >= c14932.f6910) {
                return Arrays.asList(strArr);
            }
            strArr[i3] = c14932.m3246(i);
            i++;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.zzqm, com.google.android.gms.internal.zzou
    public final String getCustomTemplateId() {
        return this.zzbuk;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final zzll getVideoController() {
        return this.zzbub;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final void performClick(String str) {
        synchronized (this.mLock) {
            zzos zzosVar = this.zzbuf;
            if (zzosVar == null) {
                zzakb.e("Attempt to call performClick before ad initialized.");
            } else {
                zzosVar.zza(null, str, null, null, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzqm
    public final void recordImpression() {
        synchronized (this.mLock) {
            zzos zzosVar = this.zzbuf;
            if (zzosVar == null) {
                zzakb.e("Attempt to perform recordImpression before ad initialized.");
            } else {
                zzosVar.zza((View) null, (Map<String, WeakReference<View>>) null);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzqm
    public final String zzap(String str) {
        return this.zzbum.getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.zzqm
    public final zzpq zzaq(String str) {
        return this.zzbul.getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.zzou
    public final void zzb(zzos zzosVar) {
        synchronized (this.mLock) {
            this.zzbuf = zzosVar;
        }
    }

    @Override // com.google.android.gms.internal.zzqm
    public final boolean zzf(InterfaceC2455 interfaceC2455) {
        if (this.zzbuf == null) {
            zzakb.e("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        }
        if (this.zzbuc == null) {
            return false;
        }
        zzoo zzooVar = new zzoo(this);
        this.zzbuf.zza((FrameLayout) BinderC2454.m4502(interfaceC2455), zzooVar);
        return true;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final InterfaceC2455 zzjt() {
        return new BinderC2454(this.zzbuf);
    }

    @Override // com.google.android.gms.internal.zzou
    public final String zzju() {
        return "3";
    }

    @Override // com.google.android.gms.internal.zzou
    public final zzog zzjv() {
        return this.zzbua;
    }

    @Override // com.google.android.gms.internal.zzou
    public final View zzjw() {
        return this.zzbuc;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final InterfaceC2455 zzka() {
        return new BinderC2454(this.zzbuf.getContext().getApplicationContext());
    }
}
