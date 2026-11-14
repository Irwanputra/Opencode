package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import dev.epro.r0.B8669154544800329371;
import dev.epro.r0.E10717724117948616506;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.I3566570148522791385;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.T8598786036980488824;
import dev.epro.r0.W3966999060673115128;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class uo implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, B8669154544800329371 {
    public static final long p;
    public final Context a;
    public final W5797197595347441198 b;
    public final W3966999060673115128 c;
    public final dj0 d;
    public final jr0 f;
    public final qw2 g;
    public final g0 h;
    public View i;
    public boolean j;
    public WeakReference k = new WeakReference(null);
    public int l = -1;
    public long m;
    public Boolean n;

    /* renamed from: o, reason: collision with root package name */
    public qo f115o;

    static {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        p = M9216324016624295870.Z(200, N13798149404328803870.MILLISECONDS);
    }

    public uo(Context context, W5797197595347441198 w5797197595347441198, W3966999060673115128 w3966999060673115128, dj0 dj0Var, O16637889491137121389 o16637889491137121389, jr0 jr0Var, qw2 qw2Var, g0 g0Var, z1 z1Var) {
        this.a = context;
        this.b = w5797197595347441198;
        this.c = w3966999060673115128;
        this.d = dj0Var;
        this.f = jr0Var;
        this.g = qw2Var;
        this.h = g0Var;
        this.j = dj0Var.a(qw2Var, z1Var);
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.m = 0L;
    }

    public static final Object a(uo uoVar, int i, R14062301455140331524 r14062301455140331524) {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Resources resources;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Rect bounds2;
        jr0 jr0Var = uoVar.f;
        dj0 dj0Var = uoVar.d;
        Rect rect = new Rect();
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = null;
        boolean z = true;
        try {
            View view = uoVar.i;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            int i2 = iArr[0];
            rect.left = i2;
            rect.top = iArr[1];
            View view2 = uoVar.i;
            if (view2 != null) {
                rect.right = i2 + view2.getWidth();
                rect.bottom = rect.top + view2.getHeight();
            }
        } catch (Exception e) {
            xv.c("Failed to get view location: " + e.getMessage(), null);
        }
        Rect rect2 = new Rect();
        WindowManager b = dj0Var.b(uoVar.a);
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = b.getCurrentWindowMetrics();
            currentWindowMetrics.getClass();
            bounds = currentWindowMetrics.getBounds();
            rect2.right = bounds.width();
            bounds2 = currentWindowMetrics.getBounds();
            rect2.bottom = bounds2.height();
        } else {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            b.getDefaultDisplay().getMetrics(displayMetrics2);
            rect2.right = displayMetrics2.widthPixels;
            rect2.bottom = displayMetrics2.heightPixels;
        }
        Rect rect3 = new Rect();
        View view3 = uoVar.i;
        if (view3 != null && (resources = view3.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        if (displayMetrics == null) {
            displayMetrics = new DisplayMetrics();
        }
        rect3.right = displayMetrics.widthPixels + 1;
        rect3.bottom = displayMetrics.heightPixels + 1;
        Rect rect4 = new Rect();
        View view4 = uoVar.i;
        boolean globalVisibleRect = view4 != null ? view4.getGlobalVisibleRect(rect4) : false;
        Rect rect5 = new Rect();
        View view5 = uoVar.i;
        boolean localVisibleRect = view5 != null ? view5.getLocalVisibleRect(rect5) : false;
        Rect rect6 = new Rect();
        View view6 = uoVar.i;
        if (view6 != null) {
            view6.getHitRect(rect6);
        }
        View view7 = uoVar.i;
        int windowVisibility = view7 != null ? view7.getWindowVisibility() : 8;
        int i3 = uoVar.l;
        if (i3 == -1) {
            i3 = windowVisibility;
        }
        View view8 = uoVar.i;
        boolean a = view8 != null ? dj0Var.a(view8, uoVar.j) : false;
        boolean z2 = uoVar.g == qw2.l && !Rect.intersects(rect, rect3);
        if (!jr0Var.H0() ? !a || z2 : !a || ((uoVar.l != -1 && i3 != 0) || z2)) {
            z = false;
        }
        int i4 = jr0Var.H0() ? i3 : windowVisibility;
        View view9 = uoVar.i;
        Rect rect7 = (view9 == null || (context4 = view9.getContext()) == null) ? new Rect() : E10717724117948616506.c(context4, rect);
        View view10 = uoVar.i;
        boolean isAttachedToWindow = view10 != null ? view10.isAttachedToWindow() : false;
        View view11 = uoVar.i;
        Rect rect8 = (view11 == null || (context3 = view11.getContext()) == null) ? new Rect() : E10717724117948616506.c(context3, rect2);
        View view12 = uoVar.i;
        Rect rect9 = (view12 == null || (context2 = view12.getContext()) == null) ? new Rect() : E10717724117948616506.c(context2, rect4);
        View view13 = uoVar.i;
        boolean z3 = z;
        qo3 qo3Var = new qo3(i, z3, i4, rect7, isAttachedToWindow, rect8, rect9, globalVisibleRect, (view13 == null || (context = view13.getContext()) == null) ? new Rect() : E10717724117948616506.c(context, rect5), localVisibleRect, rect6);
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        long a0 = M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (i == 3 && Boolean.valueOf(z3).equals(uoVar.n) && E17093345031926825464.c(a0, E17093345031926825464.h(uoVar.m, p)) < 0) {
            return o9245300239821758723;
        }
        uoVar.n = Boolean.valueOf(z3);
        uoVar.m = a0;
        Object c = uoVar.c.c(qo3Var, r14062301455140331524);
        return c == Z3437138737604933638.a ? c : o9245300239821758723;
    }

    public final void b(int i) {
        R4833348786910499294 r4833348786910499294 = null;
        if (i == 0) {
            throw null;
        }
        J8045362843799184672.s0(new I3566570148522791385(this, i, r4833348786910499294, (byte) 2));
        W5797197595347441198 w5797197595347441198 = this.b;
        if (i == 3) {
            R7033599853981556291.E(w5797197595347441198, null, null, new so(this, r4833348786910499294, (byte) 0), 3);
        } else {
            R7033599853981556291.E(w5797197595347441198, null, null, new so(this, r4833348786910499294, (byte) 1), 3);
        }
    }

    public final void b$1() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.k.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            try {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                viewTreeObserver.removeOnScrollChangedListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.k = new WeakReference(null);
        if (this.f.H0()) {
            g0 g0Var = this.h;
            synchronized (g0Var) {
                try {
                    Iterator it = g0Var.i.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        if (weakReference.get() != null && !S10823041268949770285.t(weakReference.get(), this)) {
                        }
                        it.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object d(long j, R14062301455140331524 r14062301455140331524) {
        boolean H0 = this.f.H0();
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (H0) {
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
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.l = -1;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.k = new WeakReference(viewTreeObserver);
            try {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        if (this.f.H0()) {
            g0 g0Var = this.h;
            synchronized (g0Var) {
                g0Var.i.add(new WeakReference(this));
            }
        }
        b(2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        this.l = -1;
        b(2);
        b$1();
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object b(long j, R14062301455140331524 r14062301455140331524) {
        boolean H0 = this.f.H0();
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (H0) {
            return o9245300239821758723;
        }
        b(4);
        return o9245300239821758723;
    }

    public final void a(View view) {
        view.addOnAttachStateChangeListener(this);
        WeakReference weakReference = new WeakReference(this);
        g0 g0Var = this.h;
        qo qoVar = new qo(weakReference, g0Var);
        this.f115o = qoVar;
        Set z = T8598786036980488824.z(qoVar);
        synchronized (g0Var) {
            g0Var.h.addAll(z);
        }
        if (view.isAttachedToWindow()) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.k = new WeakReference(viewTreeObserver);
                try {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                } catch (IllegalStateException unused) {
                }
            }
            if (this.f.H0()) {
                g0 g0Var2 = this.h;
                synchronized (g0Var2) {
                    g0Var2.i.add(new WeakReference(this));
                }
                return;
            }
            return;
        }
        b(2);
    }

    public final void a(Activity activity, int i) {
        Window window;
        View peekDecorView;
        View view = this.i;
        if (view == null || (window = activity.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null || !S10823041268949770285.t(view.getRootView(), peekDecorView.getRootView())) {
            return;
        }
        this.l = i;
    }
}
