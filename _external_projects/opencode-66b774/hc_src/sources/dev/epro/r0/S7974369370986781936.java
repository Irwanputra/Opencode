package dev.epro.r0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S7974369370986781936 extends ViewGroup implements Y633750919412282388, V10839011630592191394, R6859743369887268342, A17704723979876201899, Z14727533345643435323, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, D8915346189636035008 {
    public static Class I0;
    public static Method J0;
    public static Method K0;
    public static final U9803441765912152712 L0 = new U9803441765912152712();
    public static Z3874088516406380299 M0;
    public static Method N0;
    public static Method O0;
    public final U9803441765912152712 A;
    public final G16887229053736045178 A0;
    public U9803441765912152712 B;
    public final G16887229053736045178 B0;
    public boolean C;
    public boolean C0;
    public boolean D;
    public boolean D0;
    public final B1535087527421103026 E;
    public boolean E0;
    public final A6478343232691943615 F;
    public final P16680885353687213831 F0;
    public final V697849047308847220 G;
    public View G0;
    public final B4739506393801054036 H;
    public final W10005079536967311138 H0;
    public final X11266137519469539119 I;
    public final K10890637660175766944 J;
    public boolean K;
    public final B4499109999593241705 L;
    public boolean M;
    public M17822984967589214345 N;
    public I16980768508151520658 O;
    public boolean P;
    public final F9980190145435140234 Q;
    public long R;
    public final int[] S;
    public final float[] T;
    public final Matrix U;
    public final float[] V;
    public final float[] W;
    public final V697849047308847220 a;
    public long a0;
    public long b;
    public boolean b0;
    public final boolean c;
    public long c0;
    public L11375348705951955702 d;
    public F4096073349764486348 d0;
    public D15918656006271051004 e;
    public J17256830230353952700 e0;
    public O8781969179517515712 f;
    public Z1884745115210481769 f0;
    public U4939199919397343421 g;
    public final AtomicReference g0;
    public I1845098107738424918 h;
    public Y3239112907774449419 h0;
    public final N11678082982039175888 i;
    public final W1972671267364756056 i0;
    public final N12414026584235554262 j;
    public final V697849047308847220 j0;
    public final V697849047308847220 k;
    public H3362630114104355390 k0;
    public final View l;
    public final X1072671764734194220 l0;
    public final D10236220797215130727 m;
    public K15392964433003596311 m0;
    public G8001132634698687269 n;
    public MotionEvent n0;

    /* renamed from: o, reason: collision with root package name */
    public final K1799362756825499991 f488o;
    public long o0;
    public final V697849047308847220 p;
    public final V10300877997588547986 p0;
    public final B4739506393801054036 q;
    public final U9803441765912152712 q0;
    public final K8408785450183178122 r;
    public float r0;
    public final H11725168162114556860 s;
    public float s0;
    public final Q9908018528090167751 t;
    public float t0;
    public final W12302045505279551894 u;
    public float u0;
    public final Y3847252189195102539 v;
    public final U3594978070141619353 v0;
    public final J8477675461387041761 w;
    public final N12414026584235554262 w0;
    public Y9618897734314500490 x;
    public boolean x0;
    public final I1843037381664720286 y;
    public L12639328004344855510 y0;
    public final H6941026884529629628 z;
    public final L17198367453683279477 z0;

    public S7974369370986781936(Context context, B18380949320309934747 b18380949320309934747) {
        super(context);
        this.a = V4416135141588678913.t(b18380949320309934747);
        this.b = 9205357640488583168L;
        byte b = 1;
        this.c = true;
        this.h = B14824868959299866349.h;
        this.i = new N11678082982039175888();
        byte b2 = 0;
        this.j = new N12414026584235554262(this, b2);
        this.k = new V697849047308847220(Q3181834110876746778.g(context), B14824868959299866349.m);
        this.m = new D10236220797215130727(this, this);
        this.n = b18380949320309934747.c().k();
        this.f488o = new K1799362756825499991();
        this.p = V4416135141588678913.t(Boolean.FALSE);
        byte b3 = 2;
        this.q = Z3658309082448601011.b(new G16887229053736045178(this, b3));
        this.r = new K8408785450183178122();
        H11725168162114556860 h11725168162114556860 = new H11725168162114556860(3);
        h11725168162114556860.d0(U12983467231443592389.c);
        h11725168162114556860.a0(getDensity());
        h11725168162114556860.f0(getViewConfiguration());
        h11725168162114556860.e0(new E4550134253818461316(this).Q0(((D10236220797215130727) getFocusOwner()).e).Q0(getDragAndDropManager().c));
        this.s = h11725168162114556860;
        Q9908018528090167751 q9908018528090167751 = C4240022152304578596.a;
        this.t = new Q9908018528090167751();
        this.u = new W12302045505279551894(m31getLayoutNodes(), this);
        this.v = new Y3847252189195102539(getRoot(), new B311902522295760553(), m31getLayoutNodes());
        J8477675461387041761 j8477675461387041761 = new J8477675461387041761(this);
        this.w = j8477675461387041761;
        this.x = new Y9618897734314500490(this, new A307398149131398783(0, this, E18444280280170001567.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, (byte) 0));
        this.y = new I1843037381664720286(this);
        this.z = new H6941026884529629628();
        this.A = new U9803441765912152712();
        this.E = new B1535087527421103026();
        H11725168162114556860 root = getRoot();
        A6478343232691943615 a6478343232691943615 = new A6478343232691943615();
        a6478343232691943615.b = root;
        a6478343232691943615.c = new T11693019737995189368((I16141028645763443416) root.F.d);
        a6478343232691943615.d = new F6942723054099263096((byte) 26);
        a6478343232691943615.e = new Z12993664435766561681();
        this.F = a6478343232691943615;
        this.G = V4416135141588678913.t(new Configuration(context.getResources().getConfiguration()));
        this.H = Z3658309082448601011.b(new G16887229053736045178(this, (byte) 3));
        this.I = g() ? new X11266137519469539119(this, getAutofillTree()) : null;
        this.J = g() ? new K10890637660175766944(new V10300877997588547986((Object) context, (byte) 15), getSemanticsOwner(), this, getRectManager(), context.getPackageName()) : null;
        this.L = new B4499109999593241705(new U15792790160341789301(this, b));
        this.Q = new F9980190145435140234(getRoot());
        this.R = 9223372034707292159L;
        this.S = new int[]{0, 0};
        this.T = N9580590882934638229.a();
        this.U = new Matrix();
        this.V = N9580590882934638229.a();
        this.W = N9580590882934638229.a();
        this.a0 = -1L;
        this.c0 = 9187343241974906880L;
        this.g0 = new AtomicReference(null);
        this.i0 = b18380949320309934747.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = U13290528641708548929.a;
        F10342546226345611902 f10342546226345611902 = F10342546226345611902.a;
        F10342546226345611902 f103425462263456119022 = layoutDirection != 0 ? layoutDirection != 1 ? null : F10342546226345611902.b : f10342546226345611902;
        this.j0 = V4416135141588678913.t(f103425462263456119022 != null ? f103425462263456119022 : f10342546226345611902);
        this.l0 = new X1072671764734194220(this);
        this.p0 = new V10300877997588547986((byte) 28);
        this.q0 = new U9803441765912152712();
        this.r0 = Float.NaN;
        this.s0 = Float.NaN;
        this.t0 = Float.NaN;
        this.u0 = Float.NaN;
        this.v0 = new U3594978070141619353(this, b2);
        this.w0 = new N12414026584235554262(this, b);
        this.y0 = new H16572684364813036023(this, b);
        this.z0 = new L17198367453683279477(context, new U15792790160341789301(this, b3));
        this.A0 = new G16887229053736045178(this, (byte) 4);
        this.B0 = new G16887229053736045178(this, b2);
        addOnAttachStateChangeListener(this.x);
        setWillNotDraw(false);
        setFocusable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            K11889416609898324541.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        W10240872260424387225.j(this, j8477675461387041761);
        setOnDragListener(getDragAndDropManager());
        if (i >= 29) {
            L465372013436014398.a.a(this);
        }
        if (p()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.l = view;
            addView(view, -1);
        }
        this.F0 = i >= 31 ? new P16680885353687213831() : null;
        this.H0 = new W10005079536967311138(this);
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final G3509037795884611271 getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    private final J17256830230353952700 getLegacyTextInputServiceAndroid() {
        J17256830230353952700 j17256830230353952700 = this.e0;
        if (j17256830230353952700 != null) {
            return j17256830230353952700;
        }
        J17256830230353952700 j172568302303539527002 = new J17256830230353952700(getView(), this, new O14070163759106485193(this, (byte) 0));
        this.e0 = j172568302303539527002;
        return j172568302303539527002;
    }

    private final B18380949320309934747 get_composeViewContext() {
        return (B18380949320309934747) this.a.getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof S7974369370986781936) {
                ((S7974369370986781936) childAt).y();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long i(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        Z3383101362411723454.r();
        return 0L;
    }

    public static final boolean k(S7974369370986781936 s7974369370986781936, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static void n(H11725168162114556860 h11725168162114556860) {
        h11725168162114556860.D();
        D389890677992184566 z = h11725168162114556860.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            n((H11725168162114556860) objArr[i2]);
        }
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean q(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !K810338829148779546.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.p.setValue(Boolean.valueOf(z));
    }

    private void setDensity(R8540738700654750557 r8540738700654750557) {
        this.k.setValue(r8540738700654750557);
    }

    private void setLayoutDirection(F10342546226345611902 f10342546226345611902) {
        this.j0.setValue(f10342546226345611902);
    }

    private final void set_composeViewContext(B18380949320309934747 b18380949320309934747) {
        this.a.setValue(b18380949320309934747);
    }

    public final void A(H11725168162114556860 h11725168162114556860, boolean z, boolean z2, boolean z3) {
        H11725168162114556860 u;
        H11725168162114556860 u2;
        F9980190145435140234 f9980190145435140234 = this.Q;
        if (!z) {
            if (f9980190145435140234.s(h11725168162114556860, z2) && z3) {
                J(h11725168162114556860);
                return;
            }
            return;
        }
        Q7316561721656982910 q7316561721656982910 = f9980190145435140234.b;
        H11725168162114556860 h117251681621145568602 = h11725168162114556860.h;
        R8000300579679385019 r8000300579679385019 = h11725168162114556860.G;
        if (h117251681621145568602 == null) {
            P753981624812481271.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = r8000300579679385019.d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    Z3383101362411723454.g();
                    return;
                }
                if (!r8000300579679385019.e || z2) {
                    r8000300579679385019.e = true;
                    r8000300579679385019.p.v = true;
                    if (h11725168162114556860.Q) {
                        return;
                    }
                    if ((S10823041268949770285.t(h11725168162114556860.J(), Boolean.TRUE) || F9980190145435140234.i(h11725168162114556860)) && ((u = h11725168162114556860.u()) == null || !u.G.e)) {
                        q7316561721656982910.f(h11725168162114556860, J5032171413189498920.a);
                    } else if ((h11725168162114556860.I() || F9980190145435140234.j(h11725168162114556860)) && ((u2 = h11725168162114556860.u()) == null || !u2.q())) {
                        q7316561721656982910.f(h11725168162114556860, J5032171413189498920.c);
                    }
                    if (f9980190145435140234.d || !z3) {
                        return;
                    }
                    J(h11725168162114556860);
                    return;
                }
                return;
            }
        }
        f9980190145435140234.g.b(new A12350950740000434161(h11725168162114556860, true, z2));
    }

    public final void B(H11725168162114556860 h11725168162114556860, boolean z, boolean z2) {
        R8000300579679385019 r8000300579679385019 = h11725168162114556860.G;
        J5032171413189498920 j5032171413189498920 = J5032171413189498920.d;
        F9980190145435140234 f9980190145435140234 = this.Q;
        if (!z) {
            f9980190145435140234.getClass();
            int ordinal = r8000300579679385019.d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                Z3383101362411723454.g();
                return;
            }
            H11725168162114556860 u = h11725168162114556860.u();
            boolean z3 = u == null || u.I();
            if (!z2) {
                if (h11725168162114556860.q()) {
                    return;
                }
                if (h11725168162114556860.p() && h11725168162114556860.I() == z3 && h11725168162114556860.I() == r8000300579679385019.p.u) {
                    return;
                }
            }
            T8458668874796040341 t8458668874796040341 = r8000300579679385019.p;
            t8458668874796040341.w = true;
            t8458668874796040341.x = true;
            if (!h11725168162114556860.Q && t8458668874796040341.u && z3) {
                if ((u == null || !u.p()) && (u == null || !u.q())) {
                    f9980190145435140234.b.f(h11725168162114556860, j5032171413189498920);
                }
                if (f9980190145435140234.d) {
                    return;
                }
                J(null);
                return;
            }
            return;
        }
        Q7316561721656982910 q7316561721656982910 = f9980190145435140234.b;
        int ordinal2 = r8000300579679385019.d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    Z3383101362411723454.g();
                    return;
                }
            }
        }
        if ((r8000300579679385019.e || r8000300579679385019.f) && !z2) {
            return;
        }
        r8000300579679385019.f = true;
        r8000300579679385019.g = true;
        T8458668874796040341 t84586688747960403412 = r8000300579679385019.p;
        t84586688747960403412.w = true;
        t84586688747960403412.x = true;
        if (h11725168162114556860.Q) {
            return;
        }
        H11725168162114556860 u2 = h11725168162114556860.u();
        if (S10823041268949770285.t(h11725168162114556860.J(), Boolean.TRUE) && ((u2 == null || !u2.G.e) && (u2 == null || !u2.G.f))) {
            q7316561721656982910.f(h11725168162114556860, J5032171413189498920.b);
        } else if (h11725168162114556860.I() && ((u2 == null || !u2.p()) && (u2 == null || !u2.q()))) {
            q7316561721656982910.f(h11725168162114556860, j5032171413189498920);
        }
        if (f9980190145435140234.d) {
            return;
        }
        J(null);
    }

    public final void C() {
        J8477675461387041761 j8477675461387041761 = this.w;
        j8477675461387041761.x = true;
        Handler handler = j8477675461387041761.d.getHandler();
        if (j8477675461387041761.q() && !j8477675461387041761.I && handler != null) {
            j8477675461387041761.I = true;
            handler.post(j8477675461387041761.K);
        }
        Y9618897734314500490 y9618897734314500490 = this.x;
        y9618897734314500490.f = true;
        Handler handler2 = y9618897734314500490.a.getHandler();
        if (!y9618897734314500490.h() || y9618897734314500490.l || handler2 == null) {
            return;
        }
        y9618897734314500490.l = true;
        handler2.post(y9618897734314500490.m);
    }

    public final void D(ViewStructure viewStructure) {
        K10890637660175766944 m28getAutofillManager = m28getAutofillManager();
        if (m28getAutofillManager != null) {
            H11725168162114556860 h11725168162114556860 = m28getAutofillManager.b.a;
            AutofillId autofillId = m28getAutofillManager.g;
            String str = m28getAutofillManager.e;
            W12302045505279551894 w12302045505279551894 = m28getAutofillManager.d;
            Z860808776098365610.J(viewStructure, h11725168162114556860, autofillId, str, w12302045505279551894);
            Object[] objArr = M17189296052689530719.a;
            U9803441765912152712 u9803441765912152712 = new U9803441765912152712(2);
            u9803441765912152712.a(h11725168162114556860);
            u9803441765912152712.a(viewStructure);
            while (u9803441765912152712.i()) {
                Object k = u9803441765912152712.k(u9803441765912152712.b - 1);
                k.getClass();
                ViewStructure viewStructure2 = (ViewStructure) k;
                Object k2 = u9803441765912152712.k(u9803441765912152712.b - 1);
                k2.getClass();
                K7217096618580727896 k7217096618580727896 = (K7217096618580727896) ((H11725168162114556860) k2).n();
                int i = ((D389890677992184566) k7217096618580727896.b).c;
                for (int i2 = 0; i2 < i; i2++) {
                    H11725168162114556860 h117251681621145568602 = (H11725168162114556860) k7217096618580727896.get(i2);
                    if (!h117251681621145568602.Q && h117251681621145568602.H() && h117251681621145568602.I()) {
                        E10198359844879945462 w = h117251681621145568602.w();
                        if (w != null) {
                            A4559761392562572984 a4559761392562572984 = w.a;
                            if (a4559761392562572984.b(E5458822993765169982.g) || a4559761392562572984.b(E5458822993765169982.h) || a4559761392562572984.b(D10671166500636893138.r) || a4559761392562572984.b(D10671166500636893138.s) || (Build.VERSION.SDK_INT >= 34 && a4559761392562572984.b(C12265524002282074474.C))) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                Z860808776098365610.J(newChild, h117251681621145568602, m28getAutofillManager.g, str, w12302045505279551894);
                                u9803441765912152712.a(h117251681621145568602);
                                u9803441765912152712.a(newChild);
                            }
                        }
                        u9803441765912152712.a(h117251681621145568602);
                        u9803441765912152712.a(viewStructure2);
                    }
                }
            }
        }
        X11266137519469539119 autofill = getAutofill();
        if (autofill != null) {
            H6941026884529629628 h6941026884529629628 = autofill.b;
            LinkedHashMap linkedHashMap = h6941026884529629628.a;
            LinkedHashMap linkedHashMap2 = h6941026884529629628.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    Z3383101362411723454.s();
                    return;
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                newChild2.setAutofillId(autofill.c, intValue);
                newChild2.setId(intValue, autofill.a.getContext().getPackageName(), null, null);
                newChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    public final void E() {
        if (this.b0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.a0) {
            this.a0 = currentAnimationTimeMillis;
            G();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.S;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.c0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void F(MotionEvent motionEvent) {
        this.a0 = AnimationUtils.currentAnimationTimeMillis();
        G();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long b = N9580590882934638229.b((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.V);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (b & 4294967295L));
        this.c0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final void G() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.V;
        int[] iArr = this.S;
        if (i >= 29) {
            U8051324867136307887.a.a(this, fArr, this.U, iArr);
        } else {
            N9580590882934638229.d(fArr);
            Y582199805280922215.S(this, fArr, this.T, iArr);
        }
        U15853425786981391261.S(fArr, this.W);
    }

    public final boolean H() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void I(B13729205492206812220 b13729205492206812220) {
        N11678082982039175888 n11678082982039175888 = this.i;
        boolean isEmpty = n11678082982039175888.isEmpty();
        n11678082982039175888.addLast(b13729205492206812220);
        if (isEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.j);
            } else {
                S10973172697741180971.j("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void J(H11725168162114556860 h11725168162114556860) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (h11725168162114556860 != null) {
            while (h11725168162114556860 != null && h11725168162114556860.r() == Q8181337811809788579.a) {
                if (!this.P) {
                    H11725168162114556860 u = h11725168162114556860.u();
                    if (u == null) {
                        break;
                    }
                    long j = ((I16141028645763443416) u.F.d).d;
                    if (I16980768508151520658.g(j) && I16980768508151520658.f(j)) {
                        break;
                    }
                }
                h11725168162114556860 = h11725168162114556860.u();
            }
            if (h11725168162114556860 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long K(long j) {
        E();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.c0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.c0 & 4294967295L));
        return N9580590882934638229.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.W);
    }

    public final int L(MotionEvent motionEvent) {
        Object obj;
        if (this.C0) {
            this.C0 = false;
            L16736062046028781057 l16736062046028781057 = getComposeViewContext().t;
            R18079949935870878886.a.setValue(new S9638495764905866632(motionEvent.getMetaState()));
        }
        B1535087527421103026 b1535087527421103026 = this.E;
        V10300877997588547986 c = b1535087527421103026.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        A6478343232691943615 a6478343232691943615 = this.F;
        if (c == null) {
            if (!a6478343232691943615.a) {
                ((A18377563779865231301) ((F6942723054099263096) a6478343232691943615.d).b).a();
                ((T11693019737995189368) a6478343232691943615.c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) c.b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = arrayList.get(size);
                if (((R9761660112265475292) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        R9761660112265475292 r9761660112265475292 = (R9761660112265475292) obj;
        if (r9761660112265475292 != null) {
            this.b = r9761660112265475292.d;
        }
        int e = a6478343232691943615.e(c, this, r(motionEvent));
        c.c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (e & 1) != 0) {
            return e;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        b1535087527421103026.c.delete(pointerId);
        b1535087527421103026.b.delete(pointerId);
        return e;
    }

    public final void M(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i2 > i5) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long u = u((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (u >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (u & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        V10300877997588547986 c = this.E.c(obtain, this);
        c.getClass();
        this.F.e(c, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(dev.epro.r0.L12639328004344855510 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof dev.epro.r0.T13699191027521917069
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.T13699191027521917069 r0 = (dev.epro.r0.T13699191027521917069) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.T13699191027521917069 r0 = new dev.epro.r0.T13699191027521917069
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.t
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return
        L27:
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L4b
        L2b:
            dev.epro.r0.E17665849472693074628.k(r9)
            r9 = r2
            dev.epro.r0.U15792790160341789301 r2 = new dev.epro.r0.U15792790160341789301
            r1 = 0
            r2.<init>(r7, r1)
            r0.v = r9
            dev.epro.r0.J13979756969328643311 r1 = new dev.epro.r0.J13979756969328643311
            r5 = 0
            r6 = 10
            java.util.concurrent.atomic.AtomicReference r3 = r7.g0
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = dev.epro.r0.O8620973563946607355.B(r1, r0)
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r8) goto L4b
            return
        L4b:
            dev.epro.r0.Z3383101362411723454.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S7974369370986781936.N(dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):void");
    }

    public final void O(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (S10823041268949770285.t(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(Q3181834110876746778.g(getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S7974369370986781936.P():void");
    }

    public final void Q(float f) {
        if (p()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.r0) || f > this.r0) {
                    this.r0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.s0) || f < this.s0) {
                    this.s0 = f;
                }
            }
        }
    }

    @Override // dev.epro.r0.D8915346189636035008
    public final void a(J9638579967056948799 j9638579967056948799, J9638579967056948799 j96385799670569487992) {
        X9608137461199640409 x9608137461199640409;
        boolean z;
        X9608137461199640409 x96081374611996404092;
        boolean z2;
        if (j9638579967056948799 != null) {
            J9638579967056948799 j96385799670569487993 = j9638579967056948799;
            if (!j96385799670569487993.a.n) {
                P753981624812481271.b("visitAncestors called on an unattached node");
            }
            R15896830329318850690 r15896830329318850690 = j96385799670569487993.a;
            H11725168162114556860 R = R7033599853981556291.R(j9638579967056948799);
            E13273723708836014930 e13273723708836014930 = null;
            ArrayList arrayList = null;
            while (R != null) {
                if ((((R15896830329318850690) R.F.g).d & 2097152) != 0) {
                    while (r15896830329318850690 != null) {
                        if ((r15896830329318850690.c & 2097152) != 0) {
                            R15896830329318850690 r158968303293188506902 = r15896830329318850690;
                            D389890677992184566 d389890677992184566 = null;
                            while (r158968303293188506902 != null) {
                                if (r158968303293188506902 instanceof T1688716394939190891) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(r158968303293188506902);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (r158968303293188506902.c & 2097152) != 0 && (r158968303293188506902 instanceof J2215566372910931965)) {
                                    int i = 0;
                                    for (R15896830329318850690 r158968303293188506903 = ((J2215566372910931965) r158968303293188506902).p; r158968303293188506903 != null; r158968303293188506903 = r158968303293188506903.f) {
                                        if ((r158968303293188506903.c & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                r158968303293188506902 = r158968303293188506903;
                                            } else {
                                                if (d389890677992184566 == null) {
                                                    d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                }
                                                if (r158968303293188506902 != null) {
                                                    d389890677992184566.b(r158968303293188506902);
                                                    r158968303293188506902 = null;
                                                }
                                                d389890677992184566.b(r158968303293188506903);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                r158968303293188506902 = R7033599853981556291.M(d389890677992184566);
                            }
                        }
                        r15896830329318850690 = r15896830329318850690.e;
                    }
                }
                R = R.u();
                r15896830329318850690 = (R == null || (x96081374611996404092 = R.F) == null) ? null : (E6101237837392211295) x96081374611996404092.f;
            }
            if (arrayList == null) {
                return;
            }
            if (j96385799670569487992 != null) {
                if (!j96385799670569487992.a.n) {
                    P753981624812481271.b("visitAncestors called on an unattached node");
                }
                R15896830329318850690 r158968303293188506904 = j96385799670569487992.a;
                H11725168162114556860 R2 = R7033599853981556291.R(j96385799670569487992);
                E13273723708836014930 e132737237088360149302 = null;
                while (R2 != null) {
                    if ((((R15896830329318850690) R2.F.g).d & 2097152) != 0) {
                        while (r158968303293188506904 != null) {
                            if ((r158968303293188506904.c & 2097152) != 0) {
                                R15896830329318850690 r158968303293188506905 = r158968303293188506904;
                                D389890677992184566 d3898906779921845662 = null;
                                while (r158968303293188506905 != null) {
                                    if (r158968303293188506905 instanceof T1688716394939190891) {
                                        if (e132737237088360149302 == null) {
                                            E13273723708836014930 e132737237088360149303 = L12621230156277355451.a;
                                            e132737237088360149302 = new E13273723708836014930();
                                        }
                                        e132737237088360149302.a(r158968303293188506905);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (r158968303293188506905.c & 2097152) != 0 && (r158968303293188506905 instanceof J2215566372910931965)) {
                                        int i2 = 0;
                                        for (R15896830329318850690 r158968303293188506906 = ((J2215566372910931965) r158968303293188506905).p; r158968303293188506906 != null; r158968303293188506906 = r158968303293188506906.f) {
                                            if ((r158968303293188506906.c & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    r158968303293188506905 = r158968303293188506906;
                                                } else {
                                                    if (d3898906779921845662 == null) {
                                                        d3898906779921845662 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                    }
                                                    if (r158968303293188506905 != null) {
                                                        d3898906779921845662.b(r158968303293188506905);
                                                        r158968303293188506905 = null;
                                                    }
                                                    d3898906779921845662.b(r158968303293188506906);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    r158968303293188506905 = R7033599853981556291.M(d3898906779921845662);
                                }
                            }
                            r158968303293188506904 = r158968303293188506904.e;
                        }
                    }
                    R2 = R2.u();
                    r158968303293188506904 = (R2 == null || (x9608137461199640409 = R2.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
                }
                e13273723708836014930 = e132737237088360149302;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                T1688716394939190891 t1688716394939190891 = (T1688716394939190891) arrayList.get(i3);
                if (!(e13273723708836014930 != null ? e13273723708836014930.c(t1688716394939190891) : false)) {
                    t1688716394939190891.O();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        J9638579967056948799 j9638579967056948799 = ((D10236220797215130727) getFocusOwner()).c;
        if (!j9638579967056948799.n) {
            return;
        }
        if (!j9638579967056948799.a.n) {
            P753981624812481271.b("visitSubtreeIf called on an unattached node");
        }
        D389890677992184566 d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
        R15896830329318850690 r15896830329318850690 = j9638579967056948799.a;
        R15896830329318850690 r158968303293188506902 = r15896830329318850690.f;
        if (r158968303293188506902 == null) {
            R7033599853981556291.i(d389890677992184566, r15896830329318850690);
        } else {
            d389890677992184566.b(r158968303293188506902);
        }
        while (true) {
            int i3 = d389890677992184566.c;
            if (i3 == 0) {
                return;
            }
            R15896830329318850690 r158968303293188506903 = (R15896830329318850690) d389890677992184566.m(i3 - 1);
            if ((r158968303293188506903.d & 1024) != 0) {
                for (R15896830329318850690 r158968303293188506904 = r158968303293188506903; r158968303293188506904 != null && r158968303293188506904.n; r158968303293188506904 = r158968303293188506904.f) {
                    if ((r158968303293188506904.c & 1024) != 0) {
                        R15896830329318850690 r158968303293188506905 = r158968303293188506904;
                        D389890677992184566 d3898906779921845662 = null;
                        while (r158968303293188506905 != null) {
                            if (r158968303293188506905 instanceof J9638579967056948799) {
                                J9638579967056948799 j96385799670569487992 = (J9638579967056948799) r158968303293188506905;
                                if (j96385799670569487992.n && j96385799670569487992.j1().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    J9638579967056948799 j96385799670569487993 = ((D10236220797215130727) getFocusOwner()).c;
                                    if (j96385799670569487993.n) {
                                        if (!j96385799670569487993.a.n) {
                                            P753981624812481271.b("visitSubtreeIf called on an unattached node");
                                        }
                                        D389890677992184566 d3898906779921845663 = new D389890677992184566(0, new R15896830329318850690[16]);
                                        R15896830329318850690 r158968303293188506906 = j96385799670569487993.a;
                                        R15896830329318850690 r158968303293188506907 = r158968303293188506906.f;
                                        if (r158968303293188506907 == null) {
                                            R7033599853981556291.i(d3898906779921845663, r158968303293188506906);
                                        } else {
                                            d3898906779921845663.b(r158968303293188506907);
                                        }
                                        while (true) {
                                            int i4 = d3898906779921845663.c;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            R15896830329318850690 r158968303293188506908 = (R15896830329318850690) d3898906779921845663.m(i4 - 1);
                                            if ((r158968303293188506908.d & 1024) != 0) {
                                                for (R15896830329318850690 r158968303293188506909 = r158968303293188506908; r158968303293188506909 != null && r158968303293188506909.n; r158968303293188506909 = r158968303293188506909.f) {
                                                    if ((r158968303293188506909.c & 1024) != 0) {
                                                        R15896830329318850690 r1589683032931885069010 = r158968303293188506909;
                                                        D389890677992184566 d3898906779921845664 = null;
                                                        while (r1589683032931885069010 != null) {
                                                            if (r1589683032931885069010 instanceof J9638579967056948799) {
                                                                J9638579967056948799 j96385799670569487994 = (J9638579967056948799) r1589683032931885069010;
                                                                if (j96385799670569487994.n) {
                                                                    I12008059209901932953 j1 = j96385799670569487994.j1();
                                                                    if (j96385799670569487994.n && !j96385799670569487994.f321o && j1.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((r1589683032931885069010.c & 1024) != 0 && (r1589683032931885069010 instanceof J2215566372910931965)) {
                                                                int i5 = 0;
                                                                for (R15896830329318850690 r1589683032931885069011 = ((J2215566372910931965) r1589683032931885069010).p; r1589683032931885069011 != null; r1589683032931885069011 = r1589683032931885069011.f) {
                                                                    if ((r1589683032931885069011.c & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            r1589683032931885069010 = r1589683032931885069011;
                                                                        } else {
                                                                            if (d3898906779921845664 == null) {
                                                                                d3898906779921845664 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                                            }
                                                                            if (r1589683032931885069010 != null) {
                                                                                d3898906779921845664.b(r1589683032931885069010);
                                                                                r1589683032931885069010 = null;
                                                                            }
                                                                            d3898906779921845664.b(r1589683032931885069011);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            r1589683032931885069010 = R7033599853981556291.M(d3898906779921845664);
                                                        }
                                                    }
                                                }
                                            }
                                            R7033599853981556291.i(d3898906779921845663, r158968303293188506908);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((r158968303293188506905.c & 1024) != 0 && (r158968303293188506905 instanceof J2215566372910931965)) {
                                int i6 = 0;
                                for (R15896830329318850690 r1589683032931885069012 = ((J2215566372910931965) r158968303293188506905).p; r1589683032931885069012 != null; r1589683032931885069012 = r1589683032931885069012.f) {
                                    if ((r1589683032931885069012.c & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            r158968303293188506905 = r1589683032931885069012;
                                        } else {
                                            if (d3898906779921845662 == null) {
                                                d3898906779921845662 = new D389890677992184566(0, new R15896830329318850690[16]);
                                            }
                                            if (r158968303293188506905 != null) {
                                                d3898906779921845662.b(r158968303293188506905);
                                                r158968303293188506905 = null;
                                            }
                                            d3898906779921845662.b(r1589683032931885069012);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            r158968303293188506905 = R7033599853981556291.M(d3898906779921845662);
                        }
                    }
                }
            }
            R7033599853981556291.i(d389890677992184566, r158968303293188506903);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        E10198359844879945462 w;
        F4096073349764486348 f4096073349764486348;
        F4096073349764486348 f40960733497644863482;
        CharSequence textValue2;
        if (g()) {
            K10890637660175766944 m28getAutofillManager = m28getAutofillManager();
            if (m28getAutofillManager != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    AutofillValue h = J16238531192459137453.h(sparseArray.get(keyAt));
                    H11725168162114556860 h11725168162114556860 = (H11725168162114556860) m28getAutofillManager.b.c.b(keyAt);
                    if (h11725168162114556860 != null && (w = h11725168162114556860.w()) != null) {
                        A4559761392562572984 a4559761392562572984 = w.a;
                        Object g = a4559761392562572984.g(E5458822993765169982.g);
                        if (g == null) {
                            g = null;
                        }
                        R17587901753867651123 r17587901753867651123 = (R17587901753867651123) g;
                        if (r17587901753867651123 != null && (f40960733497644863482 = (F4096073349764486348) r17587901753867651123.b) != null) {
                            textValue2 = h.getTextValue();
                        }
                        Object g2 = a4559761392562572984.g(E5458822993765169982.h);
                        R17587901753867651123 r175879017538676511232 = (R17587901753867651123) (g2 != null ? g2 : null);
                        if (r175879017538676511232 != null && (f4096073349764486348 = (F4096073349764486348) r175879017538676511232.b) != null) {
                        }
                    }
                }
            }
            X11266137519469539119 autofill = getAutofill();
            if (autofill != null) {
                H6941026884529629628 h6941026884529629628 = autofill.b;
                if (h6941026884529629628.a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int keyAt2 = sparseArray.keyAt(i2);
                    AutofillValue h2 = J16238531192459137453.h(sparseArray.get(keyAt2));
                    isText = h2.isText();
                    if (isText) {
                        textValue = h2.getTextValue();
                        textValue.toString();
                        if (h6941026884529629628.a.get(Integer.valueOf(keyAt2)) != null) {
                            Z3383101362411723454.s();
                            return;
                        }
                    } else {
                        isDate = h2.isDate();
                        if (isDate) {
                            throw new X12144930698824946031("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        isList = h2.isList();
                        if (isList) {
                            throw new X12144930698824946031("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        isToggle = h2.isToggle();
                        if (isToggle) {
                            throw new X12144930698824946031("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // dev.epro.r0.A17704723979876201899
    public final void c(I4293432593871965076 i4293432593871965076) {
        O8781969179517515712 o8781969179517515712 = this.f;
        if (o8781969179517515712 != null) {
            G17795399428317025709 g17795399428317025709 = (G17795399428317025709) o8781969179517515712.a.b;
            if (g17795399428317025709.a && !g17795399428317025709.c) {
                P8628803860726212495 p8628803860726212495 = o8781969179517515712.d;
                if (p8628803860726212495 != null) {
                    p8628803860726212495.cancel();
                }
                o8781969179517515712.d = null;
                return;
            }
            if (g17795399428317025709.b) {
                return;
            }
            if (!g17795399428317025709.c) {
                M8835823653360628475.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!g17795399428317025709.d.i()) {
                M8835823653360628475.a("Attempted to start retaining exited values with pending exited values");
            }
            g17795399428317025709.c = false;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.w.h(i, this.b, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.w.h(i, this.b, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        U9803441765912152712 u9803441765912152712 = this.A;
        if (!isAttachedToWindow()) {
            n(getRoot());
        }
        v(true);
        D459204867321966484.h().m();
        this.C = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            G3509037795884611271 canvasHolder = getCanvasHolder();
            U5519500298982620611 u5519500298982620611 = canvasHolder.a;
            Canvas canvas2 = u5519500298982620611.a;
            u5519500298982620611.a = canvas;
            getRoot().i(u5519500298982620611, null);
            canvasHolder.a.a = canvas2;
            if (u9803441765912152712.i()) {
                int i = u9803441765912152712.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((R12643293538999642754) ((U18133900443301080740) u9803441765912152712.f(i2))).g();
                }
            }
            int i3 = N5383162769192748846.a;
            u9803441765912152712.d();
            this.C = false;
            Trace.endSection();
            U9803441765912152712 u98034417659121527122 = this.B;
            if (u98034417659121527122 != null) {
                u9803441765912152712.b(u98034417659121527122);
                u98034417659121527122.d();
            }
            if (p()) {
                if (Float.compare(this.r0, this.t0) != 0) {
                    float f = this.r0;
                    this.t0 = f;
                    J4109667680871496830.a(this, f);
                }
                View view = this.l;
                if (view != null) {
                    if (Float.compare(this.s0, this.u0) != 0) {
                        float f2 = this.s0;
                        this.u0 = f2;
                        J4109667680871496830.a(view, f2);
                    }
                    if (!Float.isNaN(this.s0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.r0 = Float.NaN;
                this.s0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:656:0x0446, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L256;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r4v59 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instructions count: 1997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S7974369370986781936.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0163, code lost:
    
        if (s(r25) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00da, code lost:
    
        r10 = Integer.MIN_VALUE;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S7974369370986781936.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((D10236220797215130727) getFocusOwner()).e(keyEvent, new D16945471218061474327((Object) this, (Object) keyEvent, (byte) 4));
        }
        L16736062046028781057 l16736062046028781057 = getComposeViewContext().t;
        R18079949935870878886.a.setValue(new S9638495764905866632(keyEvent.getMetaState()));
        return ((D10236220797215130727) getFocusOwner()).e(keyEvent, new U1207462583958712397((byte) 20)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        X9608137461199640409 x9608137461199640409;
        if (isFocused()) {
            D10236220797215130727 d10236220797215130727 = (D10236220797215130727) getFocusOwner();
            if (d10236220797215130727.d.e) {
                F4537322127226430183.a.getClass();
            } else {
                J9638579967056948799 s = B11964701839924937722.s(d10236220797215130727.c);
                if (s != null) {
                    if (!s.a.n) {
                        P753981624812481271.b("visitAncestors called on an unattached node");
                    }
                    R15896830329318850690 r15896830329318850690 = s.a;
                    H11725168162114556860 R = R7033599853981556291.R(s);
                    while (R != null) {
                        if ((((R15896830329318850690) R.F.g).d & 131072) != 0) {
                            while (r15896830329318850690 != null) {
                                if ((r15896830329318850690.c & 131072) != 0) {
                                    R15896830329318850690 r158968303293188506902 = r15896830329318850690;
                                    D389890677992184566 d389890677992184566 = null;
                                    while (r158968303293188506902 != null) {
                                        if ((r158968303293188506902.c & 131072) != 0 && (r158968303293188506902 instanceof J2215566372910931965)) {
                                            int i = 0;
                                            for (R15896830329318850690 r158968303293188506903 = ((J2215566372910931965) r158968303293188506902).p; r158968303293188506903 != null; r158968303293188506903 = r158968303293188506903.f) {
                                                if ((r158968303293188506903.c & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        r158968303293188506902 = r158968303293188506903;
                                                    } else {
                                                        if (d389890677992184566 == null) {
                                                            d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                        }
                                                        if (r158968303293188506902 != null) {
                                                            d389890677992184566.b(r158968303293188506902);
                                                            r158968303293188506902 = null;
                                                        }
                                                        d389890677992184566.b(r158968303293188506903);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        r158968303293188506902 = R7033599853981556291.M(d389890677992184566);
                                    }
                                }
                                r15896830329318850690 = r15896830329318850690.e;
                            }
                        }
                        R = R.u();
                        r15896830329318850690 = (R == null || (x9608137461199640409 = R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (g()) {
            this.E0 = true;
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                this.E0 = false;
                D(viewStructure);
            } catch (Throwable th) {
                this.E0 = false;
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            H7435526716351069026.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object z15361361711907993645;
        J9638579967056948799 g;
        if (this.x0) {
            N12414026584235554262 n12414026584235554262 = this.w0;
            removeCallbacks(n12414026584235554262);
            MotionEvent motionEvent2 = this.n0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.x0 = false;
            } else {
                n12414026584235554262.run();
            }
        }
        if (!q(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || s(motionEvent))) {
            int m = m(motionEvent);
            int i = 1;
            if ((m & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (z15361361711907993645 = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    z15361361711907993645 = new Z15361361711907993645(i);
                }
                if (z15361361711907993645.equals(new Z15361361711907993645(i)) && (g = ((D10236220797215130727) getFocusOwner()).g()) != null) {
                    Y4989033692226475498 Q = R7033599853981556291.Q(g);
                    if (!V12319504402545346730.z(Q).E(Q, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        T10243012841839397329.a(getFocusOwner());
                    }
                }
            }
            if ((m & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.A17704723979876201899
    public final void e(I4293432593871965076 i4293432593871965076) {
        P8628803860726212495 p8628803860726212495;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(O5354877807466160604.U());
        }
        O8781969179517515712 o8781969179517515712 = this.f;
        if (o8781969179517515712 != null) {
            D15918656006271051004 d15918656006271051004 = this.e;
            d15918656006271051004.getClass();
            G17795399428317025709 g17795399428317025709 = (G17795399428317025709) o8781969179517515712.a.b;
            if (!g17795399428317025709.a || g17795399428317025709.c) {
                return;
            }
            try {
                p8628803860726212495 = ((V11105185854535875412) d15918656006271051004).a.v(new W2269277550458425547(o8781969179517515712, (byte) 11));
            } catch (CancellationException unused) {
                if (!g17795399428317025709.b) {
                    if (g17795399428317025709.c) {
                        M8835823653360628475.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    g17795399428317025709.a();
                    g17795399428317025709.c = true;
                }
                p8628803860726212495 = null;
            }
            P8628803860726212495 p86288038607262124952 = o8781969179517515712.d;
            if (p86288038607262124952 != null) {
                p86288038607262124952.cancel();
            }
            o8781969179517515712.d = p8628803860726212495;
        }
    }

    public final void f(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d;
        J8477675461387041761 j8477675461387041761 = this.w;
        if (S10823041268949770285.t(str, j8477675461387041761.D)) {
            int d2 = j8477675461387041761.B.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        if (!S10823041268949770285.t(str, j8477675461387041761.E) || (d = j8477675461387041761.C.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, d);
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return O5354877807466160604.O(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        S6349823729575121924 a;
        if (view == null || this.Q.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (findNextFocus == null || !E18444280280170001567.y(this, findNextFocus)) {
            findNextFocus = null;
        }
        if (view == this) {
            J9638579967056948799 s = B11964701839924937722.s(((D10236220797215130727) getFocusOwner()).c);
            a = s != null ? B11964701839924937722.u(s) : null;
            if (a == null) {
                a = U13290528641708548929.a(view, this);
            }
        } else {
            a = U13290528641708548929.a(view, this);
        }
        A2608878181351957686 d = U13290528641708548929.d(i);
        int i2 = d != null ? d.a : 6;
        A7209497065939201693 a7209497065939201693 = new A7209497065939201693();
        if (((D10236220797215130727) getFocusOwner()).f(i2, a, new I12007476123594936550(a7209497065939201693, (byte) 0)) == null) {
            return view;
        }
        Object obj = a7209497065939201693.a;
        if (obj == null) {
            if (findNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (findNextFocus == null || i2 == 1 || i2 == 2 || V4416135141588678913.p(B11964701839924937722.u((J9638579967056948799) obj), U13290528641708548929.a(findNextFocus, this), a, i2)) {
            return this;
        }
        return findNextFocus;
    }

    public X15211751545736488346 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final M17822984967589214345 getAndroidViewsHandler$ui() {
        if (this.N == null) {
            M17822984967589214345 m17822984967589214345 = new M17822984967589214345(getContext());
            this.N = m17822984967589214345;
            addView(m17822984967589214345, -1);
            requestLayout();
        }
        M17822984967589214345 m178229849675892143452 = this.N;
        m178229849675892143452.getClass();
        return m178229849675892143452;
    }

    public H6941026884529629628 getAutofillTree() {
        return this.z;
    }

    public L3957284589981577691 getClipboard() {
        return getComposeViewContext().n;
    }

    public A16637565109935164485 getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final B18380949320309934747 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.D0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.G.getValue();
    }

    public final Y9618897734314500490 getContentCaptureManager$ui() {
        return this.x;
    }

    public G8001132634698687269 getCoroutineContext() {
        return this.n;
    }

    public R8540738700654750557 getDensity() {
        return (R8540738700654750557) this.k.getValue();
    }

    public S6349823729575121924 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            J9638579967056948799 s = B11964701839924937722.s(((D10236220797215130727) getFocusOwner()).c);
            if (s != null) {
                return B11964701839924937722.u(s);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return U13290528641708548929.a(findFocus, this);
        }
        return null;
    }

    public Y10761909198794972532 getFocusOwner() {
        return this.m;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        S6349823729575121924 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (S10823041268949770285.t(((D10236220797215130727) getFocusOwner()).f(6, null, new M14716691558468128220((byte) 12)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public U14340554418656580554 getFontFamilyResolver() {
        return (U14340554418656580554) this.i0.getValue();
    }

    public F2699648658094956990 getFontLoader() {
        return getComposeViewContext().f174o;
    }

    public final D15918656006271051004 getFrameEndScheduler$ui() {
        return this.e;
    }

    public Y17698807562857349923 getGraphicsContext() {
        return this.y;
    }

    public I16162375839174538453 getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.Q.b.I() || !this.i.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    /* renamed from: getInputModeManager, reason: merged with bridge method [inline-methods] */
    public H3362630114104355390 m30getInputModeManager() {
        H3362630114104355390 h3362630114104355390 = this.k0;
        if (h3362630114104355390 == null) {
            h3362630114104355390 = new H3362630114104355390(isInTouchMode() ? 1 : 2);
            this.k0 = h3362630114104355390;
        }
        return h3362630114104355390;
    }

    public final K8408785450183178122 getInsetsListener() {
        return this.r;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.a0;
    }

    @Override // android.view.View, android.view.ViewParent
    public F10342546226345611902 getLayoutDirection() {
        return (F10342546226345611902) this.j0.getValue();
    }

    public A5535629440393075509 getLocaleList() {
        return (A5535629440393075509) this.H.getValue();
    }

    public long getMeasureIteration() {
        if (this.Q.c) {
            return 1L;
        }
        P753981624812481271.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    public X1072671764734194220 getModifierLocalManager() {
        return this.l0;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public S7974369370986781936 m32getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public Y2066038017114788875 getPlacementScope() {
        J12623741444539852712 j12623741444539852712 = T7887780890365754025.a;
        return new I18227652366819457368(this, (byte) 1);
    }

    public final L12639328004344855510 getPlayNavigationSoundEffect$ui() {
        return this.y0;
    }

    public M6265862390699539972 getPointerIconService() {
        return this.H0;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final L11375348705951955702 m25getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.d;
    }

    public W12302045505279551894 getRectManager() {
        return this.u;
    }

    public I1845098107738424918 getRetainedValuesStore() {
        return this.h;
    }

    public H11725168162114556860 getRoot() {
        return this.s;
    }

    public final U4939199919397343421 getSavedStateRegistry() {
        U4939199919397343421 u4939199919397343421 = this.g;
        if (u4939199919397343421 != null) {
            return u4939199919397343421;
        }
        B18380949320309934747 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        F18341548724281518495 f18341548724281518495 = composeViewContext.e;
        f18341548724281518495.getClass();
        Object parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view.getId());
        }
        String C = G6547577305291411977.C("SaveableStateRegistry:", str);
        V10300877997588547986 b = f18341548724281518495.b();
        Bundle g = b.g(C);
        if (g != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str2 : g.keySet()) {
                ArrayList parcelableArrayList = g.getParcelableArrayList(str2);
                parcelableArrayList.getClass();
                linkedHashMap.put(str2, parcelableArrayList);
            }
        }
        V10450421848591554621 v10450421848591554621 = new V10450421848591554621((byte) 12);
        X354568553596380848 x354568553596380848 = T1414416723643307303.a;
        L6644189956008555542 l6644189956008555542 = new L6644189956008555542(linkedHashMap, v10450421848591554621);
        boolean z = false;
        if (b.q(C) == null) {
            try {
                b.y(C, new N8459270538234465343(l6644189956008555542, (byte) 1));
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        U4939199919397343421 u49391999193973434212 = new U4939199919397343421(l6644189956008555542, new F16149516508942115248(z, (Object) b, (Object) C, (byte) 3));
        this.g = u49391999193973434212;
        return u49391999193973434212;
    }

    public final boolean getScrollCaptureInProgress() {
        P16680885353687213831 p16680885353687213831;
        if (Build.VERSION.SDK_INT >= 31 && (p16680885353687213831 = this.F0) != null && ((Boolean) p16680885353687213831.a.getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof S7974369370986781936) {
                return ((S7974369370986781936) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    public Y3847252189195102539 getSemanticsOwner() {
        return this.v;
    }

    public N17396598995248644478 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? I260040962416569104.a.a(this) : this.M;
    }

    public B4499109999593241705 getSnapshotObserver() {
        return this.L;
    }

    public L2387191309177986288 getSoftwareKeyboardController() {
        Y3239112907774449419 y3239112907774449419 = this.h0;
        if (y3239112907774449419 != null) {
            return y3239112907774449419;
        }
        Y3239112907774449419 y32391129077744494192 = new Y3239112907774449419(getTextInputService());
        this.h0 = y32391129077744494192;
        return y32391129077744494192;
    }

    public Z1884745115210481769 getTextInputService() {
        Z1884745115210481769 z1884745115210481769 = this.f0;
        if (z1884745115210481769 != null) {
            return z1884745115210481769;
        }
        Z1884745115210481769 z18847451152104817692 = new Z1884745115210481769(getLegacyTextInputServiceAndroid());
        this.f0 = z18847451152104817692;
        return z18847451152104817692;
    }

    public J2710184422383030101 getTextToolbar() {
        K15392964433003596311 k15392964433003596311 = this.m0;
        if (k15392964433003596311 != null) {
            return k15392964433003596311;
        }
        K15392964433003596311 k153929644330035963112 = new K15392964433003596311();
        new U11450443558875589191(new S464754454553842217(k153929644330035963112, (byte) 6), (byte) 2);
        this.m0 = k153929644330035963112;
        return k153929644330035963112;
    }

    public final R5115491762083341408 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public K1865709164992808030 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    public H18157283590851071619 getWindowInfo() {
        return getComposeViewContext().t;
    }

    public final U18133900443301080740 j(L12639328004344855510 l12639328004344855510, S1648718292978346120 s1648718292978346120, B9692660393722135472 b9692660393722135472) {
        D389890677992184566 d389890677992184566;
        Reference poll;
        Object obj;
        if (b9692660393722135472 != null) {
            return new R12643293538999642754(b9692660393722135472, null, this, l12639328004344855510, s1648718292978346120);
        }
        do {
            V10300877997588547986 v10300877997588547986 = this.p0;
            ReferenceQueue referenceQueue = (ReferenceQueue) v10300877997588547986.c;
            d389890677992184566 = (D389890677992184566) v10300877997588547986.b;
            poll = referenceQueue.poll();
            if (poll != null) {
                d389890677992184566.l(poll);
            }
        } while (poll != null);
        while (true) {
            int i = d389890677992184566.c;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) d389890677992184566.m(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        U18133900443301080740 u18133900443301080740 = (U18133900443301080740) obj;
        if (u18133900443301080740 == null) {
            return new R12643293538999642754(getGraphicsContext().b(), getGraphicsContext(), this, l12639328004344855510, s1648718292978346120);
        }
        R12643293538999642754 r12643293538999642754 = (R12643293538999642754) u18133900443301080740;
        Y17698807562857349923 y17698807562857349923 = r12643293538999642754.b;
        if (y17698807562857349923 == null) {
            throw L11610354117192841236.j("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!r12643293538999642754.a.s) {
            P753981624812481271.a("layer should have been released before reuse");
        }
        r12643293538999642754.a = y17698807562857349923.b();
        r12643293538999642754.g = false;
        r12643293538999642754.d = l12639328004344855510;
        r12643293538999642754.e = s1648718292978346120;
        r12643293538999642754.q = false;
        r12643293538999642754.r = false;
        r12643293538999642754.s = true;
        N9580590882934638229.d(r12643293538999642754.h);
        float[] fArr = r12643293538999642754.i;
        if (fArr != null) {
            N9580590882934638229.d(fArr);
        }
        r12643293538999642754.f463o = N13757329872968394114.b;
        r12643293538999642754.t = false;
        r12643293538999642754.f = 9223372034707292159L;
        r12643293538999642754.p = null;
        r12643293538999642754.n = 0;
        return u18133900443301080740;
    }

    public final void l(H11725168162114556860 h11725168162114556860, boolean z) {
        this.Q.g(h11725168162114556860, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a4 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:97:0x0190, B:103:0x019c, B:105:0x01a4, B:106:0x01ae, B:110:0x01a7), top: B:96:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:97:0x0190, B:103:0x019c, B:105:0x01a4, B:106:0x01ae, B:110:0x01a7), top: B:96:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:121:0x0034, B:123:0x003e, B:128:0x004e, B:131:0x007d, B:133:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:88:0x0180, B:89:0x018c, B:134:0x0056, B:140:0x0062, B:143:0x006a), top: B:120:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:26:0x00bc, B:33:0x00cd, B:37:0x00da, B:38:0x00dd, B:40:0x00e1, B:42:0x00e7, B:44:0x00eb, B:45:0x00f1, B:48:0x00f9, B:51:0x0101, B:52:0x010d, B:54:0x0113, B:56:0x0119, B:58:0x011f, B:59:0x0125, B:61:0x0129, B:62:0x012d, B:67:0x0140, B:69:0x0144, B:70:0x014b, B:76:0x015c, B:77:0x0166, B:79:0x016e, B:80:0x0171, B:86:0x0178), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:121:0x0034, B:123:0x003e, B:128:0x004e, B:131:0x007d, B:133:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:88:0x0180, B:89:0x018c, B:134:0x0056, B:140:0x0062, B:143:0x006a), top: B:120:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S7974369370986781936.m(android.view.MotionEvent):int");
    }

    public final void o(H11725168162114556860 h11725168162114556860) {
        this.Q.s(h11725168162114556860, false);
        D389890677992184566 z = h11725168162114556860.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            o((H11725168162114556860) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        I1845098107738424918 i1845098107738424918;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().H()) {
            getRoot().b(this);
        }
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(O5354877807466160604.U());
        }
        this.r.onViewAttachedToWindow(this);
        if (!this.D0) {
            getComposeViewContext().e();
        }
        int i = 0;
        this.D0 = false;
        o(getRoot());
        n(getRoot());
        getSnapshotObserver().a.e();
        S7974369370986781936 m32getOutOfFrameExecutor = m32getOutOfFrameExecutor();
        if (m32getOutOfFrameExecutor == null) {
            S10973172697741180971.m("Expected the view to be attached to window.");
            return;
        }
        m32getOutOfFrameExecutor.I(new G16887229053736045178(this, r0));
        getComposeViewContext().d();
        B18380949320309934747 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        J5715778638296486773 j5715778638296486773 = composeViewContext.f;
        D15918656006271051004 d15918656006271051004 = this.e;
        if (j5715778638296486773 == null || d15918656006271051004 == null) {
            i1845098107738424918 = null;
        } else {
            L3530692241870850490 i2 = j5715778638296486773.i();
            F7192844493769026772 f7192844493769026772 = new F7192844493769026772();
            H6810052497267380403 h6810052497267380403 = H6810052497267380403.b;
            i2.getClass();
            h6810052497267380403.getClass();
            J15730374346044043770 j15730374346044043770 = new J15730374346044043770(i2, f7192844493769026772, h6810052497267380403);
            V6281043481934004271 a = J17975719213314763068.a(F184880366311637856.class);
            String b = a.b();
            if (b == null) {
                S10973172697741180971.j("Local and anonymous classes can not be ViewModels");
                return;
            }
            F184880366311637856 f184880366311637856 = (F184880366311637856) j15730374346044043770.L(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            Q9908018528090167751 q9908018528090167751 = f184880366311637856.b;
            Object b2 = q9908018528090167751.b(id);
            if (b2 == null) {
                b2 = new U9803441765912152712(1);
                q9908018528090167751.i(id, b2);
            }
            U9803441765912152712 u9803441765912152712 = (U9803441765912152712) b2;
            Object[] objArr = u9803441765912152712.a;
            int i3 = u9803441765912152712.b;
            while (true) {
                if (i >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((O8781969179517515712) obj).c) {
                    break;
                } else {
                    i++;
                }
            }
            O8781969179517515712 o8781969179517515712 = (O8781969179517515712) obj;
            if (o8781969179517515712 == null) {
                o8781969179517515712 = new O8781969179517515712();
                u9803441765912152712.a(o8781969179517515712);
            }
            o8781969179517515712.c = true;
            this.f = o8781969179517515712;
            i1845098107738424918 = o8781969179517515712.b;
        }
        if (i1845098107738424918 == null) {
            i1845098107738424918 = B14824868959299866349.h;
        }
        this.h = i1845098107738424918;
        F4096073349764486348 f4096073349764486348 = this.d0;
        if (f4096073349764486348 != null) {
            f4096073349764486348.invoke(getComposeViewContext());
            this.d0 = null;
        }
        R3192876217964974737 j = getComposeViewContext().d().j();
        j.a(this);
        j.a(this.x);
        m30getInputModeManager().a.setValue(new K2783449822245835676(isInTouchMode() ? (byte) 1 : (byte) 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            B12765698533310778745.a.b(this);
        }
        K10890637660175766944 m28getAutofillManager = m28getAutofillManager();
        if (m28getAutofillManager != null) {
            ((D10236220797215130727) getFocusOwner()).g.a(m28getAutofillManager);
            getSemanticsOwner().d.a(m28getAutofillManager);
        }
        ((D10236220797215130727) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        R14326288163422347685 r14326288163422347685 = (R14326288163422347685) this.g0.get();
        N17834861578880914456 n17834861578880914456 = (N17834861578880914456) (r14326288163422347685 != null ? r14326288163422347685.b : null);
        if (n17834861578880914456 == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        R14326288163422347685 r143262881634223476852 = (R14326288163422347685) n17834861578880914456.d.get();
        L17223171236090219140 l17223171236090219140 = (L17223171236090219140) (r143262881634223476852 != null ? r143262881634223476852.b : null);
        return l17223171236090219140 != null && (l17223171236090219140.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        O(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r18) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S7974369370986781936.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        Y9618897734314500490 y9618897734314500490 = this.x;
        y9618897734314500490.getClass();
        M6916561348591858303.f(y9618897734314500490, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.r.onViewDetachedFromWindow(this);
        View view = this.l;
        if (p() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            U9803441765912152712 u9803441765912152712 = L0;
            synchronized (u9803441765912152712) {
                u9803441765912152712.j(this);
            }
        }
        getComposeViewContext().b();
        O1149508413621311762 o1149508413621311762 = getSnapshotObserver().a;
        L4980660535418402690 l4980660535418402690 = o1149508413621311762.h;
        if (l4980660535418402690 != null) {
            l4980660535418402690.d();
        }
        o1149508413621311762.a();
        R3192876217964974737 j = getComposeViewContext().d().j();
        j.b(this.x);
        j.b(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        O8781969179517515712 o8781969179517515712 = this.f;
        if (o8781969179517515712 != null) {
            o8781969179517515712.c = false;
        }
        this.f = null;
        if (i >= 31) {
            B12765698533310778745.a.a(this);
        }
        K10890637660175766944 m28getAutofillManager = m28getAutofillManager();
        if (m28getAutofillManager != null) {
            getSemanticsOwner().d.j(m28getAutofillManager);
            ((D10236220797215130727) getFocusOwner()).g.j(m28getAutofillManager);
        }
        W12302045505279551894 rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        W12302045505279551894 rectManager2 = getRectManager();
        S6873153560207725378 s6873153560207725378 = rectManager2.i;
        if (s6873153560207725378 != null) {
            rectManager2.b.removeCallbacks(s6873153560207725378);
            rectManager2.i = null;
        }
        ((D10236220797215130727) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        D10236220797215130727 d10236220797215130727 = (D10236220797215130727) getFocusOwner();
        V12319504402545346730.T(d10236220797215130727.c, true);
        if (d10236220797215130727.g() != null) {
            J9638579967056948799 g = d10236220797215130727.g();
            d10236220797215130727.j(null);
            if (g != null) {
                g.i1(H12838525957287096428.a, H12838525957287096428.c);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a0 = 0L;
        P();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        O(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.a0 = 0L;
            this.Q.l(this.A0);
            this.O = null;
            P();
            if (this.N != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        F9980190145435140234 f9980190145435140234 = this.Q;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().H()) {
                getRoot().b(this);
            }
            if (!isAttachedToWindow()) {
                o(getRoot());
            }
            long i3 = i(i);
            long i4 = i(i2);
            long Q = C12265524002282074474.Q((int) (i3 >>> 32), (int) (i3 & 4294967295L), (int) (i4 >>> 32), (int) (4294967295L & i4));
            I16980768508151520658 i16980768508151520658 = this.O;
            if (i16980768508151520658 == null) {
                this.O = new I16980768508151520658(Q);
                this.P = false;
            } else if (!I16980768508151520658.c(i16980768508151520658.a, Q)) {
                this.P = true;
            }
            f9980190145435140234.t(Q);
            f9980190145435140234.n();
            setMeasuredDimension(getRoot().G.p.a, getRoot().G.p.b);
            if (this.N != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().G.p.a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().G.p.b, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!g() || viewStructure == null || this.E0) {
            return;
        }
        D(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        O7949773076758836562 o7949773076758836562;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (o7949773076758836562 = ((W10005079536967311138) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return o7949773076758836562 instanceof P10283164515565247229 ? PointerIcon.getSystemIcon(context, ((P10283164515565247229) o7949773076758836562).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.c) {
            int[] iArr = U13290528641708548929.a;
            F10342546226345611902 f10342546226345611902 = F10342546226345611902.a;
            F10342546226345611902 f103425462263456119022 = i != 0 ? i != 1 ? null : F10342546226345611902.b : f10342546226345611902;
            if (f103425462263456119022 != null) {
                f10342546226345611902 = f103425462263456119022;
            }
            setLayoutDirection(f10342546226345611902);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        P16680885353687213831 p16680885353687213831;
        if (Build.VERSION.SDK_INT < 31 || (p16680885353687213831 = this.F0) == null) {
            return;
        }
        p16680885353687213831.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        P();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        m30getInputModeManager().a.setValue(new K2783449822245835676(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        Y9618897734314500490 y9618897734314500490 = this.x;
        y9618897734314500490.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (S10823041268949770285.t(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            M6916561348591858303.b(y9618897734314500490, longSparseArray);
        } else {
            y9618897734314500490.a.post(new Q9622116641457785369(y9618897734314500490, longSparseArray, (byte) 1));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean U;
        this.C0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (U = O5354877807466160604.U())) {
            return;
        }
        setShowLayoutBounds(U);
        n(getRoot());
    }

    public final boolean r(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            A2608878181351957686 d = U13290528641708548929.d(i);
            int i2 = d != null ? d.a : 7;
            Boolean f = ((D10236220797215130727) getFocusOwner()).f(i2, rect != null ? new S6349823729575121924(rect.left, rect.top, rect.right, rect.bottom) : null, new O16774394856129852758(i2, (byte) 0));
            Boolean bool = Boolean.TRUE;
            if (!S10823041268949770285.t(f, bool)) {
                if (!S10823041268949770285.t(((D10236220797215130727) getFocusOwner()).f(i2, null, new O16774394856129852758(i2, (byte) 1)), bool)) {
                    if (hasFocus() && (i2 == 1 || i2 == 2)) {
                        return ((D10236220797215130727) getFocusOwner()).i(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean s(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.n0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.w.h = j;
    }

    public final void setComposeViewContext(B18380949320309934747 b18380949320309934747) {
        if (getCoroutineContext() != b18380949320309934747.c().k() && !((K7217096618580727896) getRoot().n()).isEmpty()) {
            P753981624812481271.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        M4722199849958580248 h = T8598786036980488824.h();
        F4096073349764486348 e = h != null ? h.e() : null;
        M4722199849958580248 o2 = T8598786036980488824.o(h);
        try {
            B18380949320309934747 b183809493203099347472 = get_composeViewContext();
            if (b18380949320309934747 != b183809493203099347472) {
                if (isAttachedToWindow()) {
                    b183809493203099347472.b();
                    b18380949320309934747.e();
                }
                set_composeViewContext(b18380949320309934747);
                setCoroutineContext(b18380949320309934747.c().k());
            }
        } finally {
            T8598786036980488824.x(h, o2, e);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.D0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.G.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(Y9618897734314500490 y9618897734314500490) {
        this.x = y9618897734314500490;
    }

    public void setCoroutineContext(G8001132634698687269 g8001132634698687269) {
        this.n = g8001132634698687269;
    }

    public final void setFrameEndScheduler$ui(D15918656006271051004 d15918656006271051004) {
        this.e = d15918656006271051004;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.a0 = j;
    }

    public final void setOnReadyForComposition(F4096073349764486348 f4096073349764486348) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.D0) {
            f4096073349764486348.invoke(getComposeViewContext());
        } else {
            this.d0 = f4096073349764486348;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(L12639328004344855510 l12639328004344855510) {
        this.y0 = l12639328004344855510;
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m26setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(L11375348705951955702 l11375348705951955702) {
        this.d = l11375348705951955702;
    }

    public void setShowLayoutBounds(boolean z) {
        this.M = z;
    }

    public void setUncaughtExceptionHandler(R5115491762083341408 r5115491762083341408) {
        this.Q.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(float[] fArr) {
        E();
        N9580590882934638229.e(fArr, this.V);
        E18444280280170001567.L(fArr, Float.intBitsToFloat((int) (this.c0 >> 32)), Float.intBitsToFloat((int) (this.c0 & 4294967295L)), this.T);
    }

    public final long u(long j) {
        E();
        long b = N9580590882934638229.b(j, this.V);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.c0 >> 32)) + Float.intBitsToFloat((int) (b >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.c0 & 4294967295L)) + Float.intBitsToFloat((int) (b & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final void v(boolean z) {
        F9980190145435140234 f9980190145435140234 = this.Q;
        if (f9980190145435140234.b.I() || ((D389890677992184566) f9980190145435140234.e.b).c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (f9980190145435140234.l(z ? this.A0 : this.B0)) {
                    requestLayout();
                }
                f9980190145435140234.b(false);
                getRectManager().a();
                if (this.D) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.D = false;
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void w(H11725168162114556860 h11725168162114556860, long j) {
        F9980190145435140234 f9980190145435140234 = this.Q;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            f9980190145435140234.m(h11725168162114556860, j);
            if (!f9980190145435140234.b.I()) {
                f9980190145435140234.b(false);
                getRectManager().a();
                this.B0.invoke();
                if (this.D) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.D = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean x(int i) {
        if (i != 7 && i != 8) {
            Integer c = U13290528641708548929.c(i);
            if (c == null) {
                throw L11610354117192841236.j("Invalid focus direction");
            }
            int intValue = c.intValue();
            J9638579967056948799 g = ((D10236220797215130727) getFocusOwner()).g();
            if (g == null) {
                S10973172697741180971.m("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer c2 = U13290528641708548929.c(i);
            if (c2 == null) {
                throw L11610354117192841236.j("Invalid focus direction");
            }
            int intValue2 = c2.intValue();
            E3889562084885881810 e3889562084885881810 = R7033599853981556291.R(g).f262o;
            View interopView = e3889562084885881810 != null ? e3889562084885881810.getInteropView() : null;
            View findFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue2);
            if (findNextFocus == null || interopView == null || !E18444280280170001567.y(interopView, findNextFocus)) {
                findNextFocus = null;
            }
            if (findNextFocus != null) {
                return U13290528641708548929.b(findNextFocus, Integer.valueOf(intValue), null);
            }
        }
        return false;
    }

    public final void y() {
        U9803441765912152712 u9803441765912152712;
        K10890637660175766944 m28getAutofillManager;
        Object[] objArr;
        if (this.K) {
            O1149508413621311762 o1149508413621311762 = getSnapshotObserver().a;
            J12623741444539852712 j12623741444539852712 = new J12623741444539852712((byte) 3);
            synchronized (o1149508413621311762.g) {
                try {
                    D389890677992184566 d389890677992184566 = o1149508413621311762.f;
                    int i = d389890677992184566.c;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = d389890677992184566.a;
                        if (i2 >= i) {
                            break;
                        }
                        G12738412843435213993 g12738412843435213993 = (G12738412843435213993) objArr[i2];
                        g12738412843435213993.d(j12623741444539852712);
                        if (!g12738412843435213993.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = d389890677992184566.a;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    d389890677992184566.c = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.K = false;
        }
        M17822984967589214345 m17822984967589214345 = this.N;
        if (m17822984967589214345 != null) {
            h(m17822984967589214345);
        }
        if (g() && (m28getAutofillManager = m28getAutofillManager()) != null) {
            P12475571966978616537 p12475571966978616537 = m28getAutofillManager.h;
            if (p12475571966978616537.d == 0 && m28getAutofillManager.i) {
                m28getAutofillManager.a.p().commit();
                m28getAutofillManager.i = false;
            }
            if (p12475571966978616537.d != 0) {
                m28getAutofillManager.i = true;
            }
        }
        while (this.q0.i() && this.q0.f(0) != null) {
            int i5 = this.q0.b;
            int i6 = 0;
            while (true) {
                u9803441765912152712 = this.q0;
                if (i6 < i5) {
                    B13729205492206812220 b13729205492206812220 = (B13729205492206812220) u9803441765912152712.f(i6);
                    this.q0.n(i6, null);
                    if (b13729205492206812220 != null) {
                        b13729205492206812220.invoke();
                    }
                    i6++;
                }
            }
            u9803441765912152712.l(0, i5);
        }
    }

    public final void z(H11725168162114556860 h11725168162114556860) {
        J8477675461387041761 j8477675461387041761 = this.w;
        j8477675461387041761.x = true;
        if (j8477675461387041761.q()) {
            j8477675461387041761.r(h11725168162114556860);
        }
        Y9618897734314500490 y9618897734314500490 = this.x;
        y9618897734314500490.f = true;
        if (y9618897734314500490.h()) {
            y9618897734314500490.g.a(O9245300239821758723.a);
        }
    }

    public X11266137519469539119 getAutofill() {
        return this.I;
    }

    /* renamed from: getAutofillManager, reason: merged with bridge method [inline-methods] */
    public K10890637660175766944 m28getAutofillManager() {
        return this.J;
    }

    public K1799362756825499991 getDragAndDropManager() {
        return this.f488o;
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public Q9908018528090167751 m31getLayoutNodes() {
        return this.t;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @P11229048577947898441
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m24getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @P11229048577947898441
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public V10839011630592191394 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(R5115491762083341408 r5115491762083341408) {
    }
}
