package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class uo implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, dev.epro.r0.B8669154544800329371 {
    public static final long p;
    public final android.content.Context a;
    public final dev.epro.r0.W5797197595347441198 b;
    public final dev.epro.r0.W3966999060673115128 c;
    public final ads_mobile_sdk.dj0 d;
    public final ads_mobile_sdk.jr0 f;
    public final ads_mobile_sdk.qw2 g;
    public final ads_mobile_sdk.g0 h;
    public android.view.View i;
    public boolean j;
    public java.lang.ref.WeakReference k = new java.lang.ref.WeakReference(null);
    public int l = -1;
    public long m;
    public java.lang.Boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ads_mobile_sdk.qo f115o;

    static {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        p = dev.epro.r0.M9216324016624295870.Z(200, dev.epro.r0.N13798149404328803870.d);
    }

    public uo(android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.W3966999060673115128 w3966999060673115128, ads_mobile_sdk.dj0 dj0Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.qw2 qw2Var, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.z1 z1Var) {
        this.a = context;
        this.b = w5797197595347441198;
        this.c = w3966999060673115128;
        this.d = dj0Var;
        this.f = jr0Var;
        this.g = qw2Var;
        this.h = g0Var;
        this.j = dj0Var.a(qw2Var, z1Var);
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        this.m = 0L;
    }

    public static final java.lang.Object a(ads_mobile_sdk.uo uoVar, int i, dev.epro.r0.R14062301455140331524 r14062301455140331524) {
        android.content.Context context;
        android.content.Context context2;
        android.content.Context context3;
        android.content.Context context4;
        android.content.res.Resources resources;
        ads_mobile_sdk.jr0 jr0Var = uoVar.f;
        ads_mobile_sdk.dj0 dj0Var = uoVar.d;
        android.graphics.Rect rect = new android.graphics.Rect();
        int[] iArr = new int[2];
        android.util.DisplayMetrics displayMetrics = null;
        boolean z = true;
        try {
            android.view.View view = uoVar.i;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            int i2 = iArr[0];
            rect.left = i2;
            rect.top = iArr[1];
            android.view.View view2 = uoVar.i;
            if (view2 != null) {
                rect.right = i2 + view2.getWidth();
                rect.bottom = rect.top + view2.getHeight();
            }
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.xv.c("Failed to get view location: " + e.getMessage(), null);
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        android.view.WindowManager windowManagerB = dj0Var.b(uoVar.a);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.view.WindowMetrics windowMetricsL = dev.epro.r0.I2796715180830478750.l(windowManagerB);
            windowMetricsL.getClass();
            rect2.right = dev.epro.r0.F11474578038339593445.d(windowMetricsL).width();
            rect2.bottom = dev.epro.r0.F11474578038339593445.d(windowMetricsL).height();
        } else {
            android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
            windowManagerB.getDefaultDisplay().getMetrics(displayMetrics2);
            rect2.right = displayMetrics2.widthPixels;
            rect2.bottom = displayMetrics2.heightPixels;
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        android.view.View view3 = uoVar.i;
        if (view3 != null && (resources = view3.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        if (displayMetrics == null) {
            displayMetrics = new android.util.DisplayMetrics();
        }
        rect3.right = displayMetrics.widthPixels + 1;
        rect3.bottom = displayMetrics.heightPixels + 1;
        android.graphics.Rect rect4 = new android.graphics.Rect();
        android.view.View view4 = uoVar.i;
        boolean globalVisibleRect = view4 != null ? view4.getGlobalVisibleRect(rect4) : false;
        android.graphics.Rect rect5 = new android.graphics.Rect();
        android.view.View view5 = uoVar.i;
        boolean localVisibleRect = view5 != null ? view5.getLocalVisibleRect(rect5) : false;
        android.graphics.Rect rect6 = new android.graphics.Rect();
        android.view.View view6 = uoVar.i;
        if (view6 != null) {
            view6.getHitRect(rect6);
        }
        android.view.View view7 = uoVar.i;
        int windowVisibility = view7 != null ? view7.getWindowVisibility() : 8;
        int i3 = uoVar.l;
        if (i3 == -1) {
            i3 = windowVisibility;
        }
        android.view.View view8 = uoVar.i;
        boolean zA = view8 != null ? dj0Var.a(view8, uoVar.j) : false;
        boolean z2 = uoVar.g == ads_mobile_sdk.qw2.l && !android.graphics.Rect.intersects(rect, rect3);
        if (!jr0Var.H0() ? !zA || z2 : !zA || ((uoVar.l != -1 && i3 != 0) || z2)) {
            z = false;
        }
        int i4 = jr0Var.H0() ? i3 : windowVisibility;
        android.view.View view9 = uoVar.i;
        android.graphics.Rect rect7 = (view9 == null || (context4 = view9.getContext()) == null) ? new android.graphics.Rect() : dev.epro.r0.E10717724117948616506.c(context4, rect);
        android.view.View view10 = uoVar.i;
        boolean zIsAttachedToWindow = view10 != null ? view10.isAttachedToWindow() : false;
        android.view.View view11 = uoVar.i;
        android.graphics.Rect rect8 = (view11 == null || (context3 = view11.getContext()) == null) ? new android.graphics.Rect() : dev.epro.r0.E10717724117948616506.c(context3, rect2);
        android.view.View view12 = uoVar.i;
        android.graphics.Rect rect9 = (view12 == null || (context2 = view12.getContext()) == null) ? new android.graphics.Rect() : dev.epro.r0.E10717724117948616506.c(context2, rect4);
        android.view.View view13 = uoVar.i;
        boolean z3 = z;
        ads_mobile_sdk.qo3 qo3Var = new ads_mobile_sdk.qo3(i, z3, i4, rect7, zIsAttachedToWindow, rect8, rect9, globalVisibleRect, (view13 == null || (context = view13.getContext()) == null) ? new android.graphics.Rect() : dev.epro.r0.E10717724117948616506.c(context, rect5), localVisibleRect, rect6);
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        long jA0 = dev.epro.r0.M9216324016624295870.a0(android.os.SystemClock.elapsedRealtime(), dev.epro.r0.N13798149404328803870.d);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (i == 3 && java.lang.Boolean.valueOf(z3).equals(uoVar.n) && dev.epro.r0.E17093345031926825464.c(jA0, dev.epro.r0.E17093345031926825464.h(uoVar.m, p)) < 0) {
            return o9245300239821758723;
        }
        uoVar.n = java.lang.Boolean.valueOf(z3);
        uoVar.m = jA0;
        java.lang.Object objC = uoVar.c.c(qo3Var, r14062301455140331524);
        return objC == dev.epro.r0.Z3437138737604933638.a ? objC : o9245300239821758723;
    }

    public final void b(int i) {
        if (i == 0) {
            throw null;
        }
        dev.epro.r0.J8045362843799184672.s0(new dev.epro.r0.I3566570148522791385(this, i, (dev.epro.r0.R4833348786910499294) null, (byte) 2));
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.b;
        if (i == 3) {
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.so(this, null, (byte) 0), 3);
        } else {
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.so(this, null, (byte) 1), 3);
        }
    }

    public final void b$1() {
        android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) this.k.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            try {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                viewTreeObserver.removeOnScrollChangedListener(this);
            } catch (java.lang.IllegalStateException unused) {
            }
        }
        this.k = new java.lang.ref.WeakReference(null);
        if (this.f.H0()) {
            ads_mobile_sdk.g0 g0Var = this.h;
            synchronized (g0Var) {
                try {
                    java.util.Iterator it = g0Var.i.iterator();
                    while (it.hasNext()) {
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                        if (weakReference.get() == null || dev.epro.r0.S10823041268949770285.t(weakReference.get(), this)) {
                            it.remove();
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final java.lang.Object d(long j, dev.epro.r0.R14062301455140331524 r14062301455140331524) {
        boolean zH0 = this.f.H0();
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (zH0) {
            return o9245300239821758723;
        }
        b(4);
        return o9245300239821758723;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        b(1);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        b(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        view.getClass();
        this.l = -1;
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.k = new java.lang.ref.WeakReference(viewTreeObserver);
            try {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            } catch (java.lang.IllegalStateException unused) {
            }
        }
        if (this.f.H0()) {
            ads_mobile_sdk.g0 g0Var = this.h;
            synchronized (g0Var) {
                g0Var.i.add(new java.lang.ref.WeakReference(this));
            }
        }
        b(2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        view.getClass();
        this.l = -1;
        b(2);
        b$1();
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final java.lang.Object b(long j, dev.epro.r0.R14062301455140331524 r14062301455140331524) {
        boolean zH0 = this.f.H0();
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (zH0) {
            return o9245300239821758723;
        }
        b(4);
        return o9245300239821758723;
    }

    public final void a(android.view.View view) {
        view.addOnAttachStateChangeListener(this);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        ads_mobile_sdk.g0 g0Var = this.h;
        ads_mobile_sdk.qo qoVar = new ads_mobile_sdk.qo(weakReference, g0Var);
        this.f115o = qoVar;
        java.util.Set setZ = dev.epro.r0.T8598786036980488824.z(qoVar);
        synchronized (g0Var) {
            g0Var.h.addAll(setZ);
        }
        if (view.isAttachedToWindow()) {
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.k = new java.lang.ref.WeakReference(viewTreeObserver);
                try {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                } catch (java.lang.IllegalStateException unused) {
                }
            }
            if (this.f.H0()) {
                ads_mobile_sdk.g0 g0Var2 = this.h;
                synchronized (g0Var2) {
                    g0Var2.i.add(new java.lang.ref.WeakReference(this));
                }
                return;
            }
            return;
        }
        b(2);
    }

    public final void a(android.app.Activity activity, int i) {
        android.view.Window window;
        android.view.View viewPeekDecorView;
        android.view.View view = this.i;
        if (view == null || (window = activity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null || !dev.epro.r0.S10823041268949770285.t(view.getRootView(), viewPeekDecorView.getRootView())) {
            return;
        }
        this.l = i;
    }
}
