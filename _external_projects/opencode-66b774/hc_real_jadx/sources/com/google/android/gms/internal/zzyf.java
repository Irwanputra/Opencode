package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

@zzzv
@TargetApi(19)
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzyf extends zzyc {
    private Object zzcjt;
    private PopupWindow zzcju;
    private boolean zzcjv;

    public zzyf(Context context, zzafp zzafpVar, zzanh zzanhVar, zzyb zzybVar) {
        super(context, zzafpVar, zzanhVar, zzybVar);
        this.zzcjt = new Object();
        this.zzcjv = false;
    }

    private final void zznf() {
        synchronized (this.zzcjt) {
            this.zzcjv = true;
            Context context = this.mContext;
            if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
                this.zzcju = null;
            }
            PopupWindow popupWindow = this.zzcju;
            if (popupWindow != null) {
                if (popupWindow.isShowing()) {
                    this.zzcju.dismiss();
                }
                this.zzcju = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzxu, com.google.android.gms.internal.zzaif
    public final void cancel() {
        zznf();
        super.cancel();
    }

    @Override // com.google.android.gms.internal.zzyc
    public final void zzne() {
        Context context = this.mContext;
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) this.mContext).isDestroyed()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.mContext);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Object obj = this.zzbyk;
        obj.getClass();
        frameLayout.addView((View) obj, -1, -1);
        synchronized (this.zzcjt) {
            if (this.zzcjv) {
                return;
            }
            PopupWindow popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            this.zzcju = popupWindow;
            popupWindow.setOutsideTouchable(true);
            this.zzcju.setClippingEnabled(false);
            zzakb.zzbx("Displaying the 1x1 popup off the screen.");
            try {
                this.zzcju.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
                this.zzcju = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzxu
    public final void zzx(int i) {
        zznf();
        super.zzx(i);
    }
}
