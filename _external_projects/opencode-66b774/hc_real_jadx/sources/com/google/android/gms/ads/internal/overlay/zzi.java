package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzzv;
import p131.p161.p162.p193.p194.p199.p201.C2402;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final Context zzair;
    public final ViewGroup.LayoutParams zzcis;

    /* JADX WARN: Multi-variable type inference failed */
    public zzi(zzanh zzanhVar) {
        this.zzcis = zzanhVar.getLayoutParams();
        ViewParent parent = zzanhVar.getParent();
        this.zzair = zzanhVar.zzsu();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C2402("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.parent = viewGroup;
        View view = (View) zzanhVar;
        this.index = viewGroup.indexOfChild(view);
        viewGroup.removeView(view);
        zzanhVar.zzad(true);
    }
}
