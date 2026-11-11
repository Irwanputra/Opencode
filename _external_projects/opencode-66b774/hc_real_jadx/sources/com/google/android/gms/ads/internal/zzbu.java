package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzaig;
import com.google.android.gms.internal.zzajq;
import com.google.android.gms.internal.zzanh;
import java.util.ArrayList;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzbu extends ViewSwitcher {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzaig f2798;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final zzajq f2799;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f2800;

    public zzbu(Context context, String str, String str2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(context);
        zzaig zzaigVar = new zzaig(context);
        this.f2798 = zzaigVar;
        zzaigVar.setAdUnitId(str);
        zzaigVar.zzcl(str2);
        this.f2800 = true;
        if (context instanceof Activity) {
            this.f2799 = new zzajq((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f2799 = new zzajq(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f2799.zzqu();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zzajq zzajqVar = this.f2799;
        if (zzajqVar != null) {
            zzajqVar.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zzajq zzajqVar = this.f2799;
        if (zzajqVar != null) {
            zzajqVar.onDetachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f2800) {
            return false;
        }
        this.f2798.zze(motionEvent);
        return false;
    }

    @Override // android.widget.ViewAnimator, android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof zzanh)) {
                arrayList.add((zzanh) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zzanh) obj).destroy();
        }
    }

    public final zzaig zzfn() {
        return this.f2798;
    }

    public final void zzfo() {
        zzagf.v("Disable position monitoring on adFrame.");
        zzajq zzajqVar = this.f2799;
        if (zzajqVar != null) {
            zzajqVar.zzqv();
        }
    }

    public final void zzfp() {
        zzagf.v("Enable debug gesture detector on adFrame.");
        this.f2800 = true;
    }

    public final void zzfq() {
        zzagf.v("Disable debug gesture detector on adFrame.");
        this.f2800 = false;
    }
}
