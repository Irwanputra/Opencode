package com.google.android.gms.internal;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzbs;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzph implements Runnable {
    private /* synthetic */ zzow zzbvt;
    private /* synthetic */ zzpg zzbvu;

    public zzph(zzpg zzpgVar, zzow zzowVar) {
        this.zzbvu = zzpgVar;
        this.zzbvt = zzowVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        FrameLayout frameLayout;
        View view;
        FrameLayout frameLayout2;
        View view2;
        FrameLayout frameLayout3;
        View view3;
        FrameLayout frameLayout4;
        View view4;
        z = this.zzbvu.zzbvm;
        if (z) {
            view = this.zzbvu.zzbvl;
            if (view == null) {
                zzpg zzpgVar = this.zzbvu;
                frameLayout4 = this.zzbvu.zzbvk;
                zzpgVar.zzbvl = new View(frameLayout4.getContext());
                view4 = this.zzbvu.zzbvl;
                view4.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            }
            frameLayout2 = this.zzbvu.zzbvk;
            view2 = this.zzbvu.zzbvl;
            if (frameLayout2 != view2.getParent()) {
                frameLayout3 = this.zzbvu.zzbvk;
                view3 = this.zzbvu.zzbvl;
                frameLayout3.addView(view3);
            }
        }
        Object obj = null;
        try {
            obj = this.zzbvt.zzkg();
        } catch (Exception e) {
            zzbs.zzek();
            if (zzaht.zzqj()) {
                zzakb.zzcu("Privileged processes cannot create HTML overlays.");
            } else {
                zzakb.zzb("Error obtaining overlay.", e);
            }
        }
        if (obj != null && (frameLayout = this.zzbvu.zzamm) != null) {
            frameLayout.addView((View) obj);
        }
        this.zzbvu.zza(this.zzbvt);
    }
}
