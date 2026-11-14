package dev.epro.r0;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class O10944101174480148852 extends ViewGroup {
    public WeakReference a;
    public IBinder b;
    public O13555142349968671984 c;
    public Y5209789131793062978 d;
    public B18380949320309934747 e;
    public M11952590796777100857 f;
    public boolean g;
    public boolean h;
    public boolean i;

    public O10944101174480148852(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        J10766838134493491179 j10766838134493491179 = new J10766838134493491179(this, (byte) 3);
        addOnAttachStateChangeListener(j10766838134493491179);
        Z3383101362411723454 z3383101362411723454 = new Z3383101362411723454((byte) 0);
        E686369837194379706.z(this).a.add(z3383101362411723454);
        this.f = new M11952590796777100857(this, j10766838134493491179, z3383101362411723454, (byte) 5);
    }

    private final void setParentContext(Y5209789131793062978 y5209789131793062978) {
        if (this.d != y5209789131793062978) {
            this.d = y5209789131793062978;
            if (y5209789131793062978 != null) {
                this.a = null;
            }
            O13555142349968671984 o13555142349968671984 = this.c;
            if (o13555142349968671984 != null) {
                o13555142349968671984.a();
                this.c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.b != iBinder) {
            this.b = iBinder;
            this.a = null;
        }
    }

    public abstract void a(int i, M3727281027331139839 m3727281027331139839);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.e == null) {
                S7974369370986781936 s7974369370986781936 = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof S7974369370986781936) {
                        s7974369370986781936 = (S7974369370986781936) childAt;
                    }
                }
                if (s7974369370986781936 != null) {
                    s7974369370986781936.setComposeViewContext(l(V933048422416352811.q(this), s7974369370986781936.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.h) {
            return;
        }
        D11988991656201568495.j(G6547577305291411977.s("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        B18380949320309934747 b18380949320309934747;
        if (this.d != null || isAttachedToWindow() || ((b18380949320309934747 = this.e) != null && b18380949320309934747.a.isAttachedToWindow())) {
            f();
        } else {
            S10973172697741180971.m("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        View childAt = getChildAt(0);
        S7974369370986781936 s7974369370986781936 = childAt instanceof S7974369370986781936 ? (S7974369370986781936) childAt : null;
        if (s7974369370986781936 != null && s7974369370986781936.D0) {
            s7974369370986781936.getComposeViewContext().b();
            s7974369370986781936.D0 = false;
        }
        O13555142349968671984 o13555142349968671984 = this.c;
        if (o13555142349968671984 != null) {
            o13555142349968671984.a();
        }
        this.c = null;
        requestLayout();
    }

    public final void f() {
        if (this.c == null) {
            try {
                this.h = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    B18380949320309934747 b18380949320309934747 = this.e;
                    if (b18380949320309934747 == null) {
                        b18380949320309934747 = j();
                    }
                    this.c = P7478038828660015483.a(this, b18380949320309934747, new T15443218846549482730(1003123809, true, new K5271540294206541871(this, (byte) 1)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.h = false;
            }
        }
    }

    public void g(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m22getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        Z15361361711907993645 z15361361711907993645 = tag instanceof Z15361361711907993645 ? (Z15361361711907993645) tag : null;
        if (z15361361711907993645 != null) {
            return z15361361711907993645.a;
        }
        return 1;
    }

    public final B18380949320309934747 getComposeViewContext$ui() {
        return this.e;
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.g;
    }

    public void i(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.i || super.isTransitionGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.B18380949320309934747 j() {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof dev.epro.r0.S7974369370986781936
            if (r2 == 0) goto L15
            dev.epro.r0.S7974369370986781936 r0 = (dev.epro.r0.S7974369370986781936) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            dev.epro.r0.B18380949320309934747 r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = dev.epro.r0.V933048422416352811.q(r9)
            dev.epro.r0.B18380949320309934747 r2 = dev.epro.r0.V933048422416352811.s(r4)
            if (r2 != 0) goto L87
            dev.epro.r0.Y5209789131793062978 r5 = r9.k()
            dev.epro.r0.I4293432593871965076 r9 = dev.epro.r0.U8836654130139556418.m(r4)
            if (r9 != 0) goto L3a
            if (r0 == 0) goto L37
            dev.epro.r0.I4293432593871965076 r9 = r0.d()
            goto L38
        L37:
            r9 = r1
        L38:
            if (r9 == 0) goto L3c
        L3a:
            r6 = r9
            goto L42
        L3c:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r1
        L42:
            dev.epro.r0.F18341548724281518495 r9 = dev.epro.r0.C468629748621011703.h(r4)
            if (r9 != 0) goto L56
            if (r0 == 0) goto L53
            r0.g()
            dev.epro.r0.F18341548724281518495 r9 = r0.e
            r9.getClass()
            goto L54
        L53:
            r9 = r1
        L54:
            if (r9 == 0) goto L58
        L56:
            r7 = r9
            goto L5e
        L58:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r1
        L5e:
            dev.epro.r0.J5715778638296486773 r9 = dev.epro.r0.E10717724117948616506.k(r4)
            if (r9 != 0) goto L6d
            if (r0 == 0) goto L6b
            r0.g()
            dev.epro.r0.J5715778638296486773 r1 = r0.f
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r9
        L6e:
            dev.epro.r0.B18380949320309934747 r2 = new dev.epro.r0.B18380949320309934747
            android.view.View r9 = dev.epro.r0.V933048422416352811.q(r4)
            dev.epro.r0.B18380949320309934747 r3 = dev.epro.r0.V933048422416352811.s(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 2131296339(0x7f090053, float:1.8210592E38)
            r4.setTag(r0, r9)
            return r2
        L87:
            dev.epro.r0.B18380949320309934747 r9 = r9.l(r4, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O10944101174480148852.j():dev.epro.r0.B18380949320309934747");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r3 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Type inference failed for: r0v0, types: [dev.epro.r0.Y5209789131793062978] */
    /* JADX WARN: Type inference failed for: r0v1, types: [dev.epro.r0.Y5209789131793062978] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [dev.epro.r0.Y5209789131793062978] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [dev.epro.r0.W5596570651735549214] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Y5209789131793062978 k() {
        /*
            r5 = this;
            dev.epro.r0.Y5209789131793062978 r0 = r5.d
            if (r0 != 0) goto L8c
            dev.epro.r0.Y5209789131793062978 r0 = dev.epro.r0.B15311772965484989679.b(r5)
            if (r0 == 0) goto Lb
            goto L20
        Lb:
            android.view.ViewParent r1 = r5.getParent()
        Lf:
            if (r0 != 0) goto L20
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L20
            android.view.View r1 = (android.view.View) r1
            dev.epro.r0.Y5209789131793062978 r0 = dev.epro.r0.B15311772965484989679.b(r1)
            android.view.ViewParent r1 = dev.epro.r0.P13747563277035175218.g(r1)
            goto Lf
        L20:
            dev.epro.r0.D1635665159522810927 r1 = dev.epro.r0.D1635665159522810927.b
            r2 = 0
            if (r0 == 0) goto L48
            boolean r3 = r0 instanceof dev.epro.r0.W5596570651735549214
            if (r3 == 0) goto L3d
            r3 = r0
            dev.epro.r0.W5596570651735549214 r3 = (dev.epro.r0.W5596570651735549214) r3
            dev.epro.r0.S17255966974483065294 r3 = r3.u
            java.lang.Object r3 = r3.getValue()
            dev.epro.r0.D1635665159522810927 r3 = (dev.epro.r0.D1635665159522810927) r3
            int r3 = r3.compareTo(r1)
            if (r3 <= 0) goto L3b
            goto L3d
        L3b:
            r3 = r2
            goto L3e
        L3d:
            r3 = r0
        L3e:
            if (r3 == 0) goto L49
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r5.a = r4
            goto L49
        L48:
            r0 = r2
        L49:
            if (r0 != 0) goto L8c
            java.lang.ref.WeakReference r0 = r5.a
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r0.get()
            dev.epro.r0.Y5209789131793062978 r0 = (dev.epro.r0.Y5209789131793062978) r0
            if (r0 == 0) goto L6d
            boolean r3 = r0 instanceof dev.epro.r0.W5596570651735549214
            if (r3 == 0) goto L6e
            r3 = r0
            dev.epro.r0.W5596570651735549214 r3 = (dev.epro.r0.W5596570651735549214) r3
            dev.epro.r0.S17255966974483065294 r3 = r3.u
            java.lang.Object r3 = r3.getValue()
            dev.epro.r0.D1635665159522810927 r3 = (dev.epro.r0.D1635665159522810927) r3
            int r3 = r3.compareTo(r1)
            if (r3 <= 0) goto L6d
            goto L6e
        L6d:
            r0 = r2
        L6e:
            if (r0 != 0) goto L8c
            dev.epro.r0.W5596570651735549214 r0 = dev.epro.r0.B15311772965484989679.c(r5)
            dev.epro.r0.S17255966974483065294 r3 = r0.u
            java.lang.Object r3 = r3.getValue()
            dev.epro.r0.D1635665159522810927 r3 = (dev.epro.r0.D1635665159522810927) r3
            int r1 = r3.compareTo(r1)
            if (r1 <= 0) goto L83
            r2 = r0
        L83:
            if (r2 == 0) goto L8c
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r5.a = r1
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O10944101174480148852.k():dev.epro.r0.Y5209789131793062978");
    }

    public final B18380949320309934747 l(View view, B18380949320309934747 b18380949320309934747) {
        Y5209789131793062978 k = k();
        I4293432593871965076 m = U8836654130139556418.m(view);
        J5715778638296486773 k2 = E10717724117948616506.k(view);
        F18341548724281518495 h = C468629748621011703.h(view);
        if (k == b18380949320309934747.c() && m == b18380949320309934747.d()) {
            b18380949320309934747.g();
            if (k2 == b18380949320309934747.f) {
                b18380949320309934747.g();
                F18341548724281518495 f18341548724281518495 = b18380949320309934747.e;
                f18341548724281518495.getClass();
                if (h == f18341548724281518495) {
                    return b18380949320309934747;
                }
            }
        }
        if (k.k() != b18380949320309934747.c().k()) {
            e();
        }
        if (m == null) {
            m = b18380949320309934747.d();
        }
        I4293432593871965076 i4293432593871965076 = m;
        if (h == null) {
            b18380949320309934747.g();
            h = b18380949320309934747.e;
            h.getClass();
        }
        B18380949320309934747 b183809493203099347472 = new B18380949320309934747(b18380949320309934747, view, k, i4293432593871965076, h, k2);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(b183809493203099347472));
        return b183809493203099347472;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A4559761392562572984 a4559761392562572984 = B15311772965484989679.a;
        Object g = P13747563277035175218.g(this);
        View view = this;
        while (g instanceof View) {
            View view2 = (View) g;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            g = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new W13948953340889349604(this, (byte) 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(i, i2, i3, i4, z);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        i(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m23setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new Z15361361711907993645(i));
    }

    public final void setComposeViewContext$ui(B18380949320309934747 b18380949320309934747) {
        if (this.e != b18380949320309934747) {
            if (b18380949320309934747 == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                S7974369370986781936 s7974369370986781936 = childAt instanceof S7974369370986781936 ? (S7974369370986781936) childAt : null;
                if (s7974369370986781936 != null) {
                    if (s7974369370986781936.getCoroutineContext() != b18380949320309934747.c().k()) {
                        e();
                    }
                    s7974369370986781936.setComposeViewContext(b18380949320309934747);
                }
            }
            this.e = b18380949320309934747;
        }
    }

    public final void setParentCompositionContext(Y5209789131793062978 y5209789131793062978) {
        setParentContext(y5209789131793062978);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.g = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((S7974369370986781936) ((Y633750919412282388) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.i = true;
    }

    public final void setViewCompositionStrategy(K5640149205951865382 k5640149205951865382) {
        M11952590796777100857 m11952590796777100857 = this.f;
        if (m11952590796777100857 != null) {
            m11952590796777100857.invoke();
        }
        ((Y2666402291564931474) k5640149205951865382).getClass();
        J10766838134493491179 j10766838134493491179 = new J10766838134493491179(this, (byte) 3);
        addOnAttachStateChangeListener(j10766838134493491179);
        Z3383101362411723454 z3383101362411723454 = new Z3383101362411723454((byte) 0);
        E686369837194379706.z(this).a.add(z3383101362411723454);
        this.f = new M11952590796777100857(this, j10766838134493491179, z3383101362411723454, (byte) 5);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
