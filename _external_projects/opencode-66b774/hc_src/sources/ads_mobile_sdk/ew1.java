package ads_mobile_sdk;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames;
import dev.epro.r0.E13942609761711486177;
import dev.epro.r0.E4951175994894594588;
import dev.epro.r0.L15364388172060466559;
import dev.epro.r0.O13929443358578228167;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W1307410158614224409;
import dev.epro.r0.X9852054718446117252;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ew1 implements W1307410158614224409 {
    public final O13929443358578228167 b;
    public final FrameLayout c;
    public final AtomicBoolean d;
    public View e;
    public ImageView.ScaleType f;
    public GestureDetector g;
    public final LinkedHashMap h;
    public InternalNativeAd i;

    public ew1(O13929443358578228167 o13929443358578228167, FrameLayout frameLayout) {
        this.b = o13929443358578228167;
        this.c = frameLayout;
        o13929443358578228167.setOnClickListener(this);
        o13929443358578228167.setOnTouchListener(this);
        this.d = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
    }

    public final void a(View view, String str) {
        synchronized (this) {
            try {
                if (this.d.get()) {
                    return;
                }
                LinkedHashMap linkedHashMap = this.h;
                if (view != null) {
                    linkedHashMap.put(str, new WeakReference(view));
                } else {
                    linkedHashMap.remove(str);
                }
                if (NativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    return;
                }
                if (view != null) {
                    view.setOnTouchListener(this);
                }
                if (view != null) {
                    view.setClickable(true);
                }
                if (view != null) {
                    view.setOnClickListener(this);
                }
            } finally {
            }
        }
    }

    public final void b(InternalNativeAd internalNativeAd) {
        ew1 ew1Var;
        synchronized (this) {
            try {
                if (!this.d.get()) {
                    internalNativeAd.q.a(this);
                    iw1 iw1Var = internalNativeAd.l;
                    iw1Var.getClass();
                    R7033599853981556291.E(iw1Var.a, null, null, new E13942609761711486177((Object) iw1Var, (Object) this, (R4833348786910499294) null, (byte) 7), 3);
                    ew1Var = this;
                    try {
                        internalNativeAd.e.a(new WeakReference(this), this.b, this.h, ew1Var, this);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                ew1Var = this;
            }
        }
    }

    public final void c(InternalNativeAd internalNativeAd) {
        synchronized (this) {
            this.c.setClickable(false);
            this.c.removeAllViews();
            L15364388172060466559 l15364388172060466559 = internalNativeAd.q.a;
            View view = l15364388172060466559.i;
            if (view != null) {
                view.removeOnAttachStateChangeListener(l15364388172060466559);
            }
            qo qoVar = l15364388172060466559.f115o;
            if (qoVar != null) {
                l15364388172060466559.h.a(qoVar);
            }
            l15364388172060466559.f115o = null;
            l15364388172060466559.b$1();
            l15364388172060466559.i = null;
            jp0 jp0Var = internalNativeAd.e;
            LinkedHashMap linkedHashMap = this.h;
            jp0Var.getClass();
            linkedHashMap.getClass();
            jp0Var.c = new WeakReference(null);
            jp0Var.d = new WeakReference(null);
            jp0Var.D = new Point();
            jp0Var.E = new Point();
        }
    }

    public final FrameLayout d() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.c;
        }
    }

    public final ImageView.ScaleType e() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.f;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jp0 jp0Var;
        view.getClass();
        synchronized (this) {
            try {
                if (!this.d.get() && this.g == null) {
                    InternalNativeAd internalNativeAd = this.i;
                    if (internalNativeAd != null && (jp0Var = internalNativeAd.e) != null) {
                        O13929443358578228167 o13929443358578228167 = this.b;
                        LinkedHashMap linkedHashMap = this.h;
                        ImageView.ScaleType scaleType = this.f;
                        if (scaleType == null) {
                            scaleType = iw1.i;
                        }
                        jp0Var.a(view, o13929443358578228167, linkedHashMap, scaleType);
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        jp0 jp0Var;
        wf0 wf0Var;
        motionEvent.getClass();
        synchronized (this) {
            try {
                if (this.d.get()) {
                    return false;
                }
                InternalNativeAd internalNativeAd = this.i;
                if (internalNativeAd != null && (jp0Var = internalNativeAd.e) != null) {
                    jr0 jr0Var = internalNativeAd.r;
                    jr0Var.getClass();
                    Boolean bool = Boolean.FALSE;
                    ao aoVar = ao.a$11;
                    if (!((Boolean) jr0Var.a("gads:report_touch_event_on_intercept_touch:enabled", bool, aoVar)).booleanValue()) {
                        jp0Var.a(this.b, motionEvent);
                    }
                    InternalNativeAd internalNativeAd2 = this.i;
                    if (internalNativeAd2 != null) {
                        jr0 jr0Var2 = internalNativeAd2.r;
                        jr0Var2.getClass();
                        if (!((Boolean) jr0Var2.a("gads:native_ad_view:on_intercept_touch_event:enabled", Boolean.TRUE, aoVar)).booleanValue()) {
                            InternalNativeAd internalNativeAd3 = this.i;
                            if (internalNativeAd3 != null && (wf0Var = internalNativeAd3.s) != null) {
                                wf0Var.a(motionEvent);
                            }
                            if (jp0Var.e() != 0) {
                                jp0Var.f = new WeakReference(view);
                                GestureDetector gestureDetector = this.g;
                                if (gestureDetector != null) {
                                    gestureDetector.onTouchEvent(motionEvent);
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            } finally {
            }
        }
    }

    public final Map b() {
        synchronized (this) {
            if (this.d.get()) {
                return X9852054718446117252.a;
            }
            return E4951175994894594588.z0(this.h);
        }
    }

    public final View b(String str) {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.h.get(str);
            return weakReference != null ? (View) weakReference.get() : null;
        }
    }

    public final FrameLayout c() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.b;
        }
    }
}
