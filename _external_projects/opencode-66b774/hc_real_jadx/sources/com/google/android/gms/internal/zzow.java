package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.zzbs;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p034.p095.C1687;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public class zzow implements zzos {
    private final Context mContext;
    private final zzakd zzapr;
    private zzafe zzaqh;
    private final zzzb zzarn;
    private String zzaro;
    private final zzot zzbuq;
    private final JSONObject zzbut;
    private final zzou zzbuu;
    private final zzcv zzbuv;
    public boolean zzbuw;
    private final Object mLock = new Object();
    private WeakReference<View> zzbux = null;

    public zzow(Context context, zzot zzotVar, zzzb zzzbVar, zzcv zzcvVar, JSONObject jSONObject, zzou zzouVar, zzakd zzakdVar, String str) {
        this.mContext = context;
        this.zzbuq = zzotVar;
        this.zzarn = zzzbVar;
        this.zzbuv = zzcvVar;
        this.zzbut = jSONObject;
        this.zzbuu = zzouVar;
        this.zzapr = zzakdVar;
        this.zzaro = str;
    }

    private final JSONObject zza(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] zzm = zzm(view);
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    int[] zzm2 = zzm(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", zzt(view2.getMeasuredWidth()));
                        jSONObject4.put("height", zzt(view2.getMeasuredHeight()));
                        jSONObject4.put("x", zzt(zzm2[0] - zzm[0]));
                        jSONObject4.put("y", zzt(zzm2[1] - zzm[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = zzb(rect);
                        } else {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("width", 0);
                            jSONObject5.put("height", 0);
                            jSONObject5.put("x", zzt(zzm2[0] - zzm[0]));
                            jSONObject5.put("y", zzt(zzm2[1] - zzm[1]));
                            jSONObject5.put("relative_to", "ad_view");
                            jSONObject = jSONObject5;
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject2.put(entry.getKey(), jSONObject3);
                    } catch (JSONException unused) {
                        zzakb.zzcu("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject2;
    }

    private final void zza(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        C1687.m3716("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzbut);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zzbuu.zzju());
            zzbs.zzek();
            jSONObject8.put("is_privileged_process", zzaht.zzqj());
            boolean z = true;
            jSONObject8.put("has_custom_click_handler", this.zzbuq.zzs(this.zzbuu.getCustomTemplateId()) != null);
            if (this.zzbuq.zzs(this.zzbuu.getCustomTemplateId()) == null) {
                z = false;
            }
            jSONObject7.put("has_custom_click_handler", z);
            try {
                JSONObject optJSONObject = this.zzbut.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject8.put("click_signals", this.zzbuv.zzaf().zza(this.mContext, optJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                zzakb.zzb("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject8);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.zzaro);
            zzakj.zza(this.zzarn.zzj(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e2) {
            zzakb.zzb("Unable to create click JSON.", e2);
        }
    }

    private final boolean zza(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        C1687.m3716("recordImpression must be called on the main UI thread.");
        if (this.zzbuw) {
            return true;
        }
        this.zzbuw = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzbut);
            jSONObject6.put("ads_id", this.zzaro);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            zzakj.zza(this.zzarn.zzk(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.zzbuq.zza(this);
            this.zzbuq.zzcc();
            return true;
        } catch (JSONException e) {
            zzakb.zzb("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final boolean zzar(String str) {
        JSONObject jSONObject = this.zzbut;
        JSONObject optJSONObject = jSONObject == null ? null : jSONObject.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    private final JSONObject zzb(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzt(rect.right - rect.left));
        jSONObject.put("height", zzt(rect.bottom - rect.top));
        jSONObject.put("x", zzt(rect.left));
        jSONObject.put("y", zzt(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static boolean zzl(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    private static int[] zzm(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    private final JSONObject zzn(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] zzm = zzm(view);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", zzt(view.getMeasuredWidth()));
            jSONObject3.put("height", zzt(view.getMeasuredHeight()));
            jSONObject3.put("x", zzt(zzm[0]));
            jSONObject3.put("y", zzt(zzm[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = zzb(rect);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("width", 0);
                jSONObject.put("height", 0);
                jSONObject.put("x", zzt(zzm[0]));
                jSONObject.put("y", zzt(zzm[1]));
                jSONObject.put("relative_to", "window");
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            zzakb.zzcu("Unable to get native ad view bounding box");
        }
        return jSONObject2;
    }

    private static JSONObject zzo(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzbs.zzei();
            jSONObject.put("contained_in_scroll_view", zzahn.zzw(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private final JSONObject zzp(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzbs.zzei();
            jSONObject.put("can_show_on_lock_screen", zzahn.zzv(view));
            zzbs.zzei();
            jSONObject.put("is_keyguard_locked", zzahn.zzat(this.mContext));
        } catch (JSONException unused) {
            zzakb.zzcu("Unable to get lock screen information");
        }
        return jSONObject;
    }

    private final int zzt(int i) {
        zzkb.zzia();
        return zzajr.zzd(this.mContext, i);
    }

    @Override // com.google.android.gms.internal.zzos
    public final Context getContext() {
        return this.mContext;
    }

    @Override // com.google.android.gms.internal.zzos
    public final void performClick(Bundle bundle) {
        if (bundle == null) {
            zzakb.zzbx("Click data is null. No click is reported.");
        } else if (zzar("click_reporting")) {
            zza(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, zzbs.zzei().zza(bundle, (JSONObject) null));
        } else {
            zzakb.e("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.zzos
    public final boolean recordImpression(Bundle bundle) {
        if (zzar("impression_reporting")) {
            return zza((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, zzbs.zzei().zza(bundle, (JSONObject) null));
        }
        zzakb.e("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.zzos
    public final void reportTouchEvent(Bundle bundle) {
        if (bundle == null) {
            zzakb.zzbx("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!zzar("touch_reporting")) {
            zzakb.e("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
            return;
        }
        this.zzbuv.zzaf().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.zzos
    public View zza(View.OnClickListener onClickListener, boolean z) {
        zzog zzjv = this.zzbuu.zzjv();
        if (zzjv == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!z) {
            int zzjp = zzjv.zzjp();
            if (zzjp != 0) {
                if (zzjp == 2) {
                    layoutParams.addRule(12);
                } else if (zzjp != 3) {
                    layoutParams.addRule(10);
                } else {
                    layoutParams.addRule(12);
                }
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(10);
            }
            layoutParams.addRule(9);
        }
        zzoh zzohVar = new zzoh(this.mContext, zzjv, layoutParams);
        zzohVar.setOnClickListener(onClickListener);
        zzohVar.setContentDescription((CharSequence) zzkb.zzif().zzd(zznh.zzbou));
        return zzohVar;
    }

    @Override // com.google.android.gms.internal.zzos
    public final void zza(View view, zzoq zzoqVar) {
        if (zzb(view, zzoqVar)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ((FrameLayout) view).removeAllViews();
        zzou zzouVar = this.zzbuu;
        if (zzouVar instanceof zzov) {
            zzov zzovVar = (zzov) zzouVar;
            if (zzovVar.getImages() == null || zzovVar.getImages().size() <= 0) {
                return;
            }
            Object obj = zzovVar.getImages().get(0);
            zzpq zzk = obj instanceof IBinder ? zzpr.zzk((IBinder) obj) : null;
            if (zzk != null) {
                try {
                    InterfaceC2455 zzjr = zzk.zzjr();
                    if (zzjr != null) {
                        Drawable drawable = (Drawable) BinderC2454.m4502(zzjr);
                        ImageView imageView = new ImageView(this.mContext);
                        imageView.setImageDrawable(drawable);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        ((FrameLayout) view).addView(imageView, layoutParams);
                    }
                } catch (RemoteException unused) {
                    zzakb.zzcu("Could not get drawable from image");
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.zzos
    public final void zza(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        JSONObject zza;
        JSONObject jSONObject2;
        JSONObject zza2 = zza(map, view2);
        JSONObject zzn = zzn(view2);
        JSONObject zzo = zzo(view2);
        JSONObject zzp = zzp(view2);
        JSONObject jSONObject3 = null;
        try {
            zza = zzbs.zzei().zza(bundle, (JSONObject) null);
            jSONObject2 = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            jSONObject2.put("click_point", zza);
            jSONObject2.put("asset_id", str);
            jSONObject = jSONObject2;
        } catch (Exception e2) {
            e = e2;
            jSONObject3 = jSONObject2;
            zzakb.zzb("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject3;
            zza(view, zzn, zza2, zzo, zzp, str, jSONObject, null);
        }
        zza(view, zzn, zza2, zzo, zzp, str, jSONObject, null);
    }

    @Override // com.google.android.gms.internal.zzos
    public void zza(View view, Map<String, WeakReference<View>> map) {
        zza(zzn(view), zza(map, view), zzo(view), zzp(view), (JSONObject) null);
    }

    @Override // com.google.android.gms.internal.zzos
    public void zza(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        C1687.m3716("performClick must be called on the main UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                    if (view.equals(entry.getValue().get())) {
                        zza(view, entry.getKey(), bundle, map, view2);
                        return;
                    }
                }
            }
        }
        if ("2".equals(this.zzbuu.zzju())) {
            zza(view, "2099", bundle, map, view2);
        } else if ("1".equals(this.zzbuu.zzju())) {
            zza(view, "1099", bundle, map, view2);
        }
    }

    public void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbos)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                synchronized (map) {
                    Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        View view2 = it.next().getValue().get();
                        if (view2 != null) {
                            view2.setOnTouchListener(onTouchListener);
                            view2.setClickable(true);
                            view2.setOnClickListener(onClickListener);
                        }
                    }
                }
            }
            if (map2 != null) {
                synchronized (map2) {
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        View view3 = it2.next().getValue().get();
                        if (view3 != null) {
                            view3.setOnTouchListener(onTouchListener);
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.zzos
    public void zzb(View view, Map<String, WeakReference<View>> map) {
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbor)).booleanValue()) {
            return;
        }
        view.setOnTouchListener(null);
        view.setClickable(false);
        view.setOnClickListener(null);
        if (map == null) {
            return;
        }
        synchronized (map) {
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = it.next().getValue().get();
                if (view2 != null) {
                    view2.setOnTouchListener(null);
                    view2.setClickable(false);
                    view2.setOnClickListener(null);
                }
            }
        }
    }

    public final boolean zzb(View view, zzoq zzoqVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        View zzjw = this.zzbuu.zzjw();
        if (zzjw == null) {
            return false;
        }
        ViewParent parent = zzjw.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(zzjw);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(zzjw, layoutParams);
        this.zzbuq.zza(zzoqVar);
        return true;
    }

    @Override // com.google.android.gms.internal.zzos
    public final void zzc(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.mLock) {
            if (this.zzbuw) {
                return;
            }
            if (zzl(view)) {
                zza(view, map);
                return;
            }
            if (((Boolean) zzkb.zzif().zzd(zznh.zzboz)).booleanValue() && map != null) {
                synchronized (map) {
                    Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        View view2 = it.next().getValue().get();
                        if (view2 != null && zzl(view2)) {
                            zza(view, map);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.zzos
    public final void zzd(MotionEvent motionEvent) {
        this.zzbuv.zza(motionEvent);
    }

    public final void zzh(Map<String, WeakReference<View>> map) {
        if (this.zzbuu.zzjw() != null) {
            if ("2".equals(this.zzbuu.zzju())) {
                zzbs.zzem().zzb(this.mContext, this.zzbuq.getAdUnitId(), this.zzbuu.zzju(), map.containsKey(NativeAppInstallAd.ASSET_MEDIA_VIDEO));
            } else if ("1".equals(this.zzbuu.zzju())) {
                zzbs.zzem().zzb(this.mContext, this.zzbuq.getAdUnitId(), this.zzbuu.zzju(), map.containsKey(NativeContentAd.ASSET_MEDIA_VIDEO));
            }
        }
    }

    @Override // com.google.android.gms.internal.zzos
    public final void zzi(View view) {
        zzcv zzcvVar;
        zzcr zzaf;
        if (!((Boolean) zzkb.zzif().zzd(zznh.zzbnp)).booleanValue() || (zzcvVar = this.zzbuv) == null || (zzaf = zzcvVar.zzaf()) == null) {
            return;
        }
        zzaf.zzb(view);
    }

    @Override // com.google.android.gms.internal.zzos
    public final void zzk(View view) {
        this.zzbux = new WeakReference<>(view);
    }

    @Override // com.google.android.gms.internal.zzos
    public boolean zzkc() {
        zzog zzjv = this.zzbuu.zzjv();
        return zzjv != null && zzjv.zzjq();
    }

    @Override // com.google.android.gms.internal.zzos
    public boolean zzkd() {
        JSONObject jSONObject = this.zzbut;
        return jSONObject != null && jSONObject.optBoolean("allow_pub_owned_ad_view", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzanh zzkg() {
        JSONObject jSONObject = this.zzbut;
        if (jSONObject == null || jSONObject.optJSONObject("overlay") == null) {
            return null;
        }
        zzanr zzej = zzbs.zzej();
        Context context = this.mContext;
        zzjn zzf = zzjn.zzf(context);
        zzanh zza = zzej.zza(context, zzapa.zzc(zzf), zzf.zzbek, false, false, this.zzbuv, this.zzapr, null, null, null, zzis.zzhl());
        if (zza != 0) {
            ((View) zza).setVisibility(8);
            new zzoy(zza).zza(this.zzarn);
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.zzos
    public void zzkh() {
        this.zzarn.zzls();
    }

    @Override // com.google.android.gms.internal.zzos
    public void zzki() {
        this.zzbuq.zzcv();
    }

    @Override // com.google.android.gms.internal.zzos
    public final View zzkj() {
        WeakReference<View> weakReference = this.zzbux;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final zzafe zzkk() {
        if (!zzbs.zzfd().zzs(this.mContext)) {
            return null;
        }
        if (this.zzaqh == null) {
            this.zzaqh = new zzafe(this.mContext, this.zzbuq.getAdUnitId());
        }
        return this.zzaqh;
    }
}
