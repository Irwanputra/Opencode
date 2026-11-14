package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ew1 implements dev.epro.r0.W1307410158614224409 {
    public final dev.epro.r0.O13929443358578228167 b;
    public final android.widget.FrameLayout c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public android.view.View e;
    public android.widget.ImageView.ScaleType f;
    public android.view.GestureDetector g;
    public final java.util.LinkedHashMap h;
    public com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd i;

    /* JADX WARN: Multi-variable type inference failed */
    public ew1(dev.epro.r0.O13929443358578228167 o13929443358578228167, android.widget.FrameLayout frameLayout) {
        this.b = o13929443358578228167;
        this.c = frameLayout;
        o13929443358578228167.setOnClickListener(this);
        o13929443358578228167.setOnTouchListener(this);
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.view.View view, java.lang.String str) {
        synchronized (this) {
            try {
                if (this.d.get()) {
                    return;
                }
                java.util.LinkedHashMap linkedHashMap = this.h;
                if (view != null) {
                    linkedHashMap.put(str, new java.lang.ref.WeakReference(view));
                } else {
                    linkedHashMap.remove(str);
                }
                if (com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
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

    public final void b(com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd internalNativeAd) throws java.lang.Throwable {
        ads_mobile_sdk.ew1 ew1Var;
        synchronized (this) {
            try {
                if (!this.d.get()) {
                    internalNativeAd.q.a(this);
                    ads_mobile_sdk.iw1 iw1Var = internalNativeAd.l;
                    iw1Var.getClass();
                    dev.epro.r0.R7033599853981556291.E(iw1Var.a, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.E13942609761711486177((java.lang.Object) iw1Var, (java.lang.Object) this, (dev.epro.r0.R4833348786910499294) null, (byte) 7), 3);
                    ew1Var = this;
                    try {
                        internalNativeAd.e.a(new java.lang.ref.WeakReference(this), this.b, this.h, ew1Var, this);
                        return;
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                ew1Var = this;
            }
            java.lang.Throwable th3 = th;
            throw th3;
        }
    }

    public final void c(com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd internalNativeAd) {
        synchronized (this) {
            this.c.setClickable(false);
            this.c.removeAllViews();
            dev.epro.r0.L15364388172060466559 l15364388172060466559 = internalNativeAd.q.a;
            android.view.View view = l15364388172060466559.i;
            if (view != null) {
                view.removeOnAttachStateChangeListener(l15364388172060466559);
            }
            ads_mobile_sdk.qo qoVar = l15364388172060466559.f115o;
            if (qoVar != null) {
                l15364388172060466559.h.a(qoVar);
            }
            l15364388172060466559.f115o = null;
            l15364388172060466559.b$1();
            l15364388172060466559.i = null;
            ads_mobile_sdk.jp0 jp0Var = internalNativeAd.e;
            java.util.LinkedHashMap linkedHashMap = this.h;
            jp0Var.getClass();
            linkedHashMap.getClass();
            jp0Var.c = new java.lang.ref.WeakReference(null);
            jp0Var.d = new java.lang.ref.WeakReference(null);
            jp0Var.D = new android.graphics.Point();
            jp0Var.E = new android.graphics.Point();
        }
    }

    public final android.widget.FrameLayout d() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.c;
        }
    }

    public final android.widget.ImageView.ScaleType e() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.f;
        }
    }

    public final void onClick(android.view.View view) {
        ads_mobile_sdk.jp0 jp0Var;
        view.getClass();
        synchronized (this) {
            try {
                if (!this.d.get() && this.g == null) {
                    com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd internalNativeAd = this.i;
                    if (internalNativeAd != null && (jp0Var = internalNativeAd.e) != null) {
                        dev.epro.r0.O13929443358578228167 o13929443358578228167 = this.b;
                        java.util.LinkedHashMap linkedHashMap = this.h;
                        android.widget.ImageView.ScaleType scaleType = this.f;
                        if (scaleType == null) {
                            scaleType = ads_mobile_sdk.iw1.i;
                        }
                        jp0Var.a(view, o13929443358578228167, linkedHashMap, scaleType);
                    }
                }
            } finally {
            }
        }
    }

    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        ads_mobile_sdk.jp0 jp0Var;
        ads_mobile_sdk.wf0 wf0Var;
        motionEvent.getClass();
        synchronized (this) {
            try {
                if (this.d.get()) {
                    return false;
                }
                com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd internalNativeAd = this.i;
                if (internalNativeAd != null && (jp0Var = internalNativeAd.e) != null) {
                    ads_mobile_sdk.jr0 jr0Var = internalNativeAd.r;
                    jr0Var.getClass();
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
                    if (!((java.lang.Boolean) jr0Var.a("gads:report_touch_event_on_intercept_touch:enabled", bool, aoVar)).booleanValue()) {
                        jp0Var.a(this.b, motionEvent);
                    }
                    com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd internalNativeAd2 = this.i;
                    if (internalNativeAd2 != null) {
                        ads_mobile_sdk.jr0 jr0Var2 = internalNativeAd2.r;
                        jr0Var2.getClass();
                        if (!((java.lang.Boolean) jr0Var2.a("gads:native_ad_view:on_intercept_touch_event:enabled", java.lang.Boolean.TRUE, aoVar)).booleanValue()) {
                            com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd internalNativeAd3 = this.i;
                            if (internalNativeAd3 != null && (wf0Var = internalNativeAd3.s) != null) {
                                wf0Var.a(motionEvent);
                            }
                            if (jp0Var.e() != 0) {
                                jp0Var.f = new java.lang.ref.WeakReference(view);
                                android.view.GestureDetector gestureDetector = this.g;
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

    public final java.util.Map b() {
        synchronized (this) {
            if (this.d.get()) {
                return dev.epro.r0.X9852054718446117252.a;
            }
            return dev.epro.r0.E4951175994894594588.z0(this.h);
        }
    }

    public final android.view.View b(java.lang.String str) {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.h.get(str);
            return weakReference != null ? (android.view.View) weakReference.get() : null;
        }
    }

    public final android.widget.FrameLayout c() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.b;
        }
    }
}
