package com.google.android.gms.internal;

import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.zzbs;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpj extends zzqa implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public static final String[] zzbvj = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO};
    private final Object mLock = new Object();
    private zzos zzbuf;
    private View zzbvo;
    private Point zzbvq;
    private Point zzbvr;
    private WeakReference<zzgp> zzbvs;
    private final WeakReference<View> zzbvw;
    private final Map<String, WeakReference<View>> zzbvx;
    private final Map<String, WeakReference<View>> zzbvy;
    private final Map<String, WeakReference<View>> zzbvz;

    public zzpj(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        HashMap hashMap3 = new HashMap();
        this.zzbvx = hashMap3;
        HashMap hashMap4 = new HashMap();
        this.zzbvy = hashMap4;
        HashMap hashMap5 = new HashMap();
        this.zzbvz = hashMap5;
        this.zzbvq = new Point();
        this.zzbvr = new Point();
        this.zzbvs = new WeakReference<>(null);
        zzbs.zzfc();
        zzaln.zza(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzbs.zzfc();
        zzaln.zza(view, (ViewTreeObserver.OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.zzbvw = new WeakReference<>(view);
        zzi(hashMap);
        hashMap5.putAll(hashMap3);
        zzj(hashMap2);
        hashMap5.putAll(hashMap4);
        zznh.initialize(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzow zzowVar) {
        View view;
        synchronized (this.mLock) {
            String[] strArr = zzbvj;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    view = null;
                    break;
                }
                WeakReference<View> weakReference = this.zzbvz.get(strArr[i]);
                if (weakReference != null) {
                    view = weakReference.get();
                    break;
                }
                i++;
            }
            if (!(view instanceof FrameLayout)) {
                zzowVar.zzki();
                return;
            }
            zzpl zzplVar = new zzpl(this, view);
            if (zzowVar instanceof zzor) {
                zzowVar.zzb(view, zzplVar);
            } else {
                zzowVar.zza(view, zzplVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zza(String[] strArr) {
        for (String str : strArr) {
            if (this.zzbvx.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.zzbvy.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    private final void zzi(Map<String, View> map) {
        for (Map.Entry<String, View> entry : map.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.zzbvx.put(key, new WeakReference<>(value));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
    }

    private final void zzj(Map<String, View> map) {
        for (Map.Entry<String, View> entry : map.entrySet()) {
            View value = entry.getValue();
            if (value != null) {
                this.zzbvy.put(entry.getKey(), new WeakReference<>(value));
                value.setOnTouchListener(this);
            }
        }
    }

    private final void zzk(View view) {
        synchronized (this.mLock) {
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
    }

    private final int zzt(int i) {
        int zzd;
        synchronized (this.mLock) {
            zzkb.zzia();
            zzd = zzajr.zzd(this.zzbuf.getContext(), i);
        }
        return zzd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Map<String, WeakReference<View>> map;
        synchronized (this.mLock) {
            if (this.zzbuf == null) {
                return;
            }
            View view2 = this.zzbvw.get();
            if (view2 == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("x", zzt(this.zzbvq.x));
            bundle.putFloat("y", zzt(this.zzbvq.y));
            bundle.putFloat("start_x", zzt(this.zzbvr.x));
            bundle.putFloat("start_y", zzt(this.zzbvr.y));
            View view3 = this.zzbvo;
            if (view3 == null || !view3.equals(view)) {
                this.zzbuf.zza(view, this.zzbvz, bundle, view2);
            } else {
                zzos zzosVar = this.zzbuf;
                if (!(zzosVar instanceof zzor)) {
                    str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
                    map = this.zzbvz;
                } else if (((zzor) zzosVar).zzkf() != null) {
                    zzosVar = ((zzor) this.zzbuf).zzkf();
                    str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
                    map = this.zzbvz;
                }
                zzosVar.zza(view, str, bundle, map, view2);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        synchronized (this.mLock) {
            if (this.zzbuf != null && (view = this.zzbvw.get()) != null) {
                this.zzbuf.zzc(view, this.zzbvz);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        View view;
        synchronized (this.mLock) {
            if (this.zzbuf != null && (view = this.zzbvw.get()) != null) {
                this.zzbuf.zzc(view, this.zzbvz);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.mLock) {
            if (this.zzbuf == null) {
                return false;
            }
            View view2 = this.zzbvw.get();
            if (view2 == null) {
                return false;
            }
            view2.getLocationOnScreen(new int[2]);
            Point point = new Point((int) (motionEvent.getRawX() - r2[0]), (int) (motionEvent.getRawY() - r2[1]));
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

    @Override // com.google.android.gms.internal.zzpz
    public final void unregisterNativeAd() {
        synchronized (this.mLock) {
            this.zzbvo = null;
            this.zzbuf = null;
            this.zzbvq = null;
            this.zzbvr = null;
        }
    }

    @Override // com.google.android.gms.internal.zzpz
    public final void zza(InterfaceC2455 interfaceC2455) {
        synchronized (this.mLock) {
            zzk(null);
            Object m4502 = BinderC2454.m4502(interfaceC2455);
            if (!(m4502 instanceof zzow)) {
                zzakb.zzcu("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            zzow zzowVar = (zzow) m4502;
            if (!zzowVar.zzkd()) {
                zzakb.e("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view = this.zzbvw.get();
            if (this.zzbuf != null && view != null) {
                if (((Boolean) zzkb.zzif().zzd(zznh.zzboq)).booleanValue()) {
                    this.zzbuf.zzb(view, this.zzbvz);
                }
            }
            synchronized (this.mLock) {
                zzos zzosVar = this.zzbuf;
                if (zzosVar instanceof zzow) {
                    zzow zzowVar2 = (zzow) zzosVar;
                    View view2 = this.zzbvw.get();
                    if (zzowVar2 != null && zzowVar2.getContext() != null && view2 != null && zzbs.zzfd().zzs(view2.getContext())) {
                        zzafe zzkk = zzowVar2.zzkk();
                        if (zzkk != null) {
                            zzkk.zzu(false);
                        }
                        zzgp zzgpVar = this.zzbvs.get();
                        if (zzgpVar != null && zzkk != null) {
                            zzgpVar.zzb(zzkk);
                        }
                    }
                }
            }
            zzos zzosVar2 = this.zzbuf;
            if ((zzosVar2 instanceof zzor) && ((zzor) zzosVar2).zzke()) {
                ((zzor) this.zzbuf).zzc(zzowVar);
            } else {
                this.zzbuf = zzowVar;
                if (zzowVar instanceof zzor) {
                    ((zzor) zzowVar).zzc(null);
                }
            }
            WeakReference<View> weakReference = this.zzbvz.get(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
            if (weakReference == null) {
                zzakb.zzcu("Ad choices asset view is not provided.");
            } else {
                View view3 = weakReference.get();
                ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                if (viewGroup != null) {
                    View zza = zzowVar.zza((View.OnClickListener) this, true);
                    this.zzbvo = zza;
                    if (zza != null) {
                        this.zzbvz.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference<>(this.zzbvo));
                        this.zzbvx.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference<>(this.zzbvo));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.zzbvo);
                    }
                }
            }
            zzowVar.zza(view, this.zzbvx, this.zzbvy, this, this);
            zzahn.zzdaw.post(new zzpk(this, zzowVar));
            zzk(view);
            this.zzbuf.zzi(view);
            synchronized (this.mLock) {
                zzos zzosVar3 = this.zzbuf;
                if (zzosVar3 instanceof zzow) {
                    zzow zzowVar3 = (zzow) zzosVar3;
                    View view4 = this.zzbvw.get();
                    if (zzowVar3 != null && zzowVar3.getContext() != null && view4 != null && zzbs.zzfd().zzs(view4.getContext())) {
                        zzgp zzgpVar2 = this.zzbvs.get();
                        if (zzgpVar2 == null) {
                            zzgpVar2 = new zzgp(view4.getContext(), view4);
                            this.zzbvs = new WeakReference<>(zzgpVar2);
                        }
                        zzgpVar2.zza(zzowVar3.zzkk());
                    }
                }
            }
        }
    }
}
