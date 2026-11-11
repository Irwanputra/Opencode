package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.zzbs;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p034.p095.C1687;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpg extends zzpv implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static String[] zzbvj = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO};
    public FrameLayout zzamm;
    private zzos zzbuf;
    private final FrameLayout zzbvk;
    private View zzbvl;
    private final boolean zzbvm;
    private View zzbvo;
    private final Object mLock = new Object();
    private Map<String, WeakReference<View>> zzbvn = Collections.synchronizedMap(new HashMap());
    private boolean zzbvp = false;
    private Point zzbvq = new Point();
    private Point zzbvr = new Point();
    private WeakReference<zzgp> zzbvs = new WeakReference<>(null);

    @TargetApi(21)
    public zzpg(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.zzbvk = frameLayout;
        this.zzamm = frameLayout2;
        zzbs.zzfc();
        zzaln.zza((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzbs.zzfc();
        zzaln.zza((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
        if (frameLayout2 != null && C1687.m3651()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        zznh.initialize(frameLayout.getContext());
        this.zzbvm = ((Boolean) zzkb.zzif().zzd(zznh.zzboy)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzow zzowVar) {
        View view;
        synchronized (this.mLock) {
            zzowVar.zzh(this.zzbvn);
            if (this.zzbvn != null) {
                for (String str : zzbvj) {
                    WeakReference<View> weakReference = this.zzbvn.get(str);
                    if (weakReference != null) {
                        view = weakReference.get();
                        break;
                    }
                }
            }
            view = null;
            if (!(view instanceof FrameLayout)) {
                zzowVar.zzki();
                return;
            }
            zzpi zzpiVar = new zzpi(this, view);
            if (zzowVar instanceof zzor) {
                zzowVar.zzb(view, zzpiVar);
            } else {
                zzowVar.zza(view, zzpiVar);
            }
        }
    }

    private final void zzk(View view) {
        zzos zzosVar = this.zzbuf;
        if (zzosVar != null) {
            if (zzosVar instanceof zzor) {
                zzosVar = ((zzor) zzosVar).zzkf();
            }
            if (zzosVar != null) {
                zzosVar.zzk(view);
            }
        }
    }

    private final void zzkl() {
        FrameLayout frameLayout;
        synchronized (this.mLock) {
            if (!this.zzbvm && this.zzbvp) {
                int measuredWidth = this.zzbvk.getMeasuredWidth();
                int measuredHeight = this.zzbvk.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0 && (frameLayout = this.zzamm) != null) {
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(measuredWidth, measuredHeight));
                    this.zzbvp = false;
                }
            }
        }
    }

    private final int zzt(int i) {
        zzkb.zzia();
        return zzajr.zzd(this.zzbuf.getContext(), i);
    }

    @Override // com.google.android.gms.internal.zzpu
    public final void destroy() {
        synchronized (this.mLock) {
            FrameLayout frameLayout = this.zzamm;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.zzamm = null;
            this.zzbvn = null;
            this.zzbvo = null;
            this.zzbuf = null;
            this.zzbvq = null;
            this.zzbvr = null;
            this.zzbvs = null;
            this.zzbvl = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Map<String, WeakReference<View>> map;
        FrameLayout frameLayout;
        synchronized (this.mLock) {
            if (this.zzbuf == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("x", zzt(this.zzbvq.x));
            bundle.putFloat("y", zzt(this.zzbvq.y));
            bundle.putFloat("start_x", zzt(this.zzbvr.x));
            bundle.putFloat("start_y", zzt(this.zzbvr.y));
            View view2 = this.zzbvo;
            if (view2 == null || !view2.equals(view)) {
                this.zzbuf.zza(view, this.zzbvn, bundle, this.zzbvk);
            } else {
                zzos zzosVar = this.zzbuf;
                if (!(zzosVar instanceof zzor)) {
                    str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
                    map = this.zzbvn;
                    frameLayout = this.zzbvk;
                } else if (((zzor) zzosVar).zzkf() != null) {
                    zzosVar = ((zzor) this.zzbuf).zzkf();
                    str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
                    map = this.zzbvn;
                    frameLayout = this.zzbvk;
                }
                zzosVar.zza(view, str, bundle, map, frameLayout);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        synchronized (this.mLock) {
            zzkl();
            zzos zzosVar = this.zzbuf;
            if (zzosVar != null) {
                zzosVar.zzc(this.zzbvk, this.zzbvn);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        synchronized (this.mLock) {
            zzos zzosVar = this.zzbuf;
            if (zzosVar != null) {
                zzosVar.zzc(this.zzbvk, this.zzbvn);
            }
            zzkl();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.mLock) {
            if (this.zzbuf == null) {
                return false;
            }
            this.zzbvk.getLocationOnScreen(new int[2]);
            Point point = new Point((int) (motionEvent.getRawX() - r0[0]), (int) (motionEvent.getRawY() - r0[1]));
            this.zzbvq = point;
            if (motionEvent.getAction() == 0) {
                this.zzbvr = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(point.x, point.y);
            this.zzbuf.zzd(obtain);
            obtain.recycle();
            return false;
        }
    }

    @Override // com.google.android.gms.internal.zzpu
    public final void zza(InterfaceC2455 interfaceC2455) {
        zzow zzowVar;
        Map<String, WeakReference<View>> map;
        zzow zzowVar2;
        FrameLayout frameLayout;
        synchronized (this.mLock) {
            ViewGroup viewGroup = null;
            zzk(null);
            Object m4502 = BinderC2454.m4502(interfaceC2455);
            if (!(m4502 instanceof zzow)) {
                zzakb.zzcu("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            boolean z = false;
            if (!this.zzbvm && (frameLayout = this.zzamm) != null) {
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
                this.zzbvk.requestLayout();
            }
            this.zzbvp = true;
            zzow zzowVar3 = (zzow) m4502;
            if (this.zzbuf != null) {
                if (((Boolean) zzkb.zzif().zzd(zznh.zzboq)).booleanValue()) {
                    this.zzbuf.zzb(this.zzbvk, this.zzbvn);
                }
            }
            zzos zzosVar = this.zzbuf;
            if ((zzosVar instanceof zzow) && (zzowVar2 = (zzow) zzosVar) != null && zzowVar2.getContext() != null && zzbs.zzfd().zzs(this.zzbvk.getContext())) {
                zzafe zzkk = zzowVar2.zzkk();
                if (zzkk != null) {
                    zzkk.zzu(false);
                }
                zzgp zzgpVar = this.zzbvs.get();
                if (zzgpVar != null && zzkk != null) {
                    zzgpVar.zzb(zzkk);
                }
            }
            zzos zzosVar2 = this.zzbuf;
            if ((zzosVar2 instanceof zzor) && ((zzor) zzosVar2).zzke()) {
                ((zzor) this.zzbuf).zzc(zzowVar3);
            } else {
                this.zzbuf = zzowVar3;
                if (zzowVar3 instanceof zzor) {
                    ((zzor) zzowVar3).zzc(null);
                }
            }
            if (this.zzamm == null) {
                return;
            }
            if (((Boolean) zzkb.zzif().zzd(zznh.zzboq)).booleanValue()) {
                this.zzamm.setClickable(false);
            }
            this.zzamm.removeAllViews();
            boolean zzkc = zzowVar3.zzkc();
            if (zzkc && (map = this.zzbvn) != null) {
                WeakReference<View> weakReference = map.get(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
                KeyEvent.Callback callback = weakReference != null ? (View) weakReference.get() : null;
                if (callback instanceof ViewGroup) {
                    viewGroup = (ViewGroup) callback;
                }
            }
            if (zzkc && viewGroup != null) {
                z = true;
            }
            View zza = zzowVar3.zza(this, z);
            this.zzbvo = zza;
            if (zza != null) {
                Map<String, WeakReference<View>> map2 = this.zzbvn;
                if (map2 != null) {
                    map2.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference<>(this.zzbvo));
                }
                if (z) {
                    viewGroup.removeAllViews();
                    viewGroup.addView(this.zzbvo);
                } else {
                    AdChoicesView adChoicesView = new AdChoicesView(zzowVar3.getContext());
                    adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    adChoicesView.addView(this.zzbvo);
                    FrameLayout frameLayout2 = this.zzamm;
                    if (frameLayout2 != null) {
                        frameLayout2.addView(adChoicesView);
                    }
                }
            }
            zzowVar3.zza(this.zzbvk, this.zzbvn, (Map<String, WeakReference<View>>) null, this, this);
            zzahn.zzdaw.post(new zzph(this, zzowVar3));
            zzk(this.zzbvk);
            this.zzbuf.zzi(this.zzbvk);
            zzos zzosVar3 = this.zzbuf;
            if ((zzosVar3 instanceof zzow) && (zzowVar = (zzow) zzosVar3) != null && zzowVar.getContext() != null && zzbs.zzfd().zzs(this.zzbvk.getContext())) {
                zzgp zzgpVar2 = this.zzbvs.get();
                if (zzgpVar2 == null) {
                    zzgpVar2 = new zzgp(this.zzbvk.getContext(), this.zzbvk);
                    this.zzbvs = new WeakReference<>(zzgpVar2);
                }
                zzgpVar2.zza(zzowVar.zzkk());
            }
        }
    }

    @Override // com.google.android.gms.internal.zzpu
    public final InterfaceC2455 zzal(String str) {
        synchronized (this.mLock) {
            Map<String, WeakReference<View>> map = this.zzbvn;
            View view = null;
            if (map == null) {
                return null;
            }
            WeakReference<View> weakReference = map.get(str);
            if (weakReference != null) {
                view = weakReference.get();
            }
            return new BinderC2454(view);
        }
    }

    @Override // com.google.android.gms.internal.zzpu
    public final void zzb(String str, InterfaceC2455 interfaceC2455) {
        View view = (View) BinderC2454.m4502(interfaceC2455);
        synchronized (this.mLock) {
            Map<String, WeakReference<View>> map = this.zzbvn;
            if (map == null) {
                return;
            }
            if (view == null) {
                map.remove(str);
            } else {
                map.put(str, new WeakReference<>(view));
                if (NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    return;
                }
                view.setOnTouchListener(this);
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzpu
    public final void zzb(InterfaceC2455 interfaceC2455, int i) {
        WeakReference<zzgp> weakReference;
        zzgp zzgpVar;
        if (zzbs.zzfd().zzs(this.zzbvk.getContext()) && (weakReference = this.zzbvs) != null && (zzgpVar = weakReference.get()) != null) {
            zzgpVar.zzgi();
        }
        zzkl();
    }
}
