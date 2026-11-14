package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B8973123839147806920 extends android.widget.FrameLayout {
    public final java.util.ArrayList a;
    public final java.util.ArrayList b;
    public android.view.View.OnApplyWindowInsetsListener c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8973123839147806920(android.content.Context context, android.util.AttributeSet attributeSet, dev.epro.r0.P14575954172000745949 p14575954172000745949) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.a = new java.util.ArrayList();
        this.b = new java.util.ArrayList();
        this.d = true;
        java.lang.String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Z15406236664963307934.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        java.lang.String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        dev.epro.r0.C13374971588771233833 c13374971588771233833Z = p14575954172000745949.z(id);
        if (classAttribute != null && c13374971588771233833Z == null) {
            if (id == -1) {
                dev.epro.r0.S10973172697741180971.m(dev.epro.r0.G6547577305291411977.s("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            dev.epro.r0.U1393585516073146670 u1393585516073146670B = p14575954172000745949.B();
            context.getClassLoader();
            dev.epro.r0.C13374971588771233833 c13374971588771233833A = u1393585516073146670B.a(classAttribute);
            c13374971588771233833A.getClass();
            c13374971588771233833A.C = true;
            dev.epro.r0.C10994625127000459680 c10994625127000459680 = c13374971588771233833A.s;
            if ((c10994625127000459680 == null ? null : c10994625127000459680.q) != null) {
                c13374971588771233833A.C = true;
            }
            dev.epro.r0.W10130330342449691688 w10130330342449691688 = new dev.epro.r0.W10130330342449691688(p14575954172000745949);
            w10130330342449691688.o = true;
            c13374971588771233833A.D = this;
            w10130330342449691688.e(getId(), c13374971588771233833A, string);
            if (w10130330342449691688.g) {
                dev.epro.r0.S10973172697741180971.m("This transaction is already being added to the back stack");
                throw null;
            }
            dev.epro.r0.P14575954172000745949 p145759541720007459492 = w10130330342449691688.p;
            if (p145759541720007459492.t != null && !p145759541720007459492.G) {
                p145759541720007459492.w(true);
                w10130330342449691688.a(p145759541720007459492.I, p145759541720007459492.J);
                p145759541720007459492.b = true;
                try {
                    p145759541720007459492.M(p145759541720007459492.I, p145759541720007459492.J);
                    p145759541720007459492.c();
                    p145759541720007459492.W();
                    p145759541720007459492.t();
                    ((java.util.HashMap) p145759541720007459492.c.d).values().removeAll(java.util.Collections.singleton(null));
                } catch (java.lang.Throwable th) {
                    p145759541720007459492.c();
                    throw th;
                }
            }
        }
        java.util.ArrayList arrayListE = p14575954172000745949.c.E();
        int size = arrayListE.size();
        while (i < size) {
            java.lang.Object obj = arrayListE.get(i);
            i++;
            dev.epro.r0.C13374971588771233833 c13374971588771233833 = ((dev.epro.r0.B11652692535345282996) obj).c;
            getId();
        }
    }

    public final void a(android.view.View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        java.lang.Object tag = view.getTag(2131296483);
        if ((tag instanceof dev.epro.r0.C13374971588771233833 ? (dev.epro.r0.C13374971588771233833) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            dev.epro.r0.D11988991656201568495.m("Views added to a FragmentContainerView must be associated with a Fragment. View ", view, " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets windowInsets) {
        dev.epro.r0.N3121440022506799205 n3121440022506799205C;
        windowInsets.getClass();
        dev.epro.r0.N3121440022506799205 n3121440022506799205C2 = dev.epro.r0.N3121440022506799205.c(windowInsets, (android.view.View) null);
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            android.view.WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            n3121440022506799205C = dev.epro.r0.N3121440022506799205.c(windowInsetsOnApplyWindowInsets, (android.view.View) null);
        } else {
            java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
            android.view.WindowInsets windowInsetsB = n3121440022506799205C2.b();
            if (windowInsetsB != null && !windowInsetsB.equals(windowInsetsB)) {
                n3121440022506799205C2 = dev.epro.r0.N3121440022506799205.c(windowInsetsB, this);
            }
            n3121440022506799205C = n3121440022506799205C2;
        }
        if (!n3121440022506799205C.a.s()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                dev.epro.r0.W10240872260424387225.b(getChildAt(i), n3121440022506799205C);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        canvas.getClass();
        if (this.d) {
            java.util.ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (android.view.View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.d) {
            java.util.ArrayList arrayList = this.a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(android.view.View view) {
        view.getClass();
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends dev.epro.r0.C13374971588771233833> F getFragment() {
        dev.epro.r0.C13374971588771233833 c13374971588771233833;
        dev.epro.r0.R13227154569034155950 r13227154569034155950;
        dev.epro.r0.P14575954172000745949 p14575954172000745949E;
        android.view.View view = this;
        while (true) {
            if (view == null) {
                c13374971588771233833 = null;
                break;
            }
            java.lang.Object tag = view.getTag(2131296483);
            c13374971588771233833 = tag instanceof dev.epro.r0.C13374971588771233833 ? (dev.epro.r0.C13374971588771233833) tag : null;
            if (c13374971588771233833 != null) {
                break;
            }
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        if (c13374971588771233833 == null) {
            android.content.Context context = getContext();
            while (true) {
                if (!(context instanceof android.content.ContextWrapper)) {
                    r13227154569034155950 = null;
                    break;
                }
                if (context instanceof dev.epro.r0.R13227154569034155950) {
                    r13227154569034155950 = (dev.epro.r0.R13227154569034155950) context;
                    break;
                }
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (r13227154569034155950 == null) {
                dev.epro.r0.Q11088980322693754445.j("View ", this, " is not within a subclass of FragmentActivity.");
                return null;
            }
            p14575954172000745949E = ((dev.epro.r0.C10994625127000459680) r13227154569034155950.u.b).t;
        } else {
            if (c13374971588771233833.s == null || !c13374971588771233833.k) {
                throw new java.lang.IllegalStateException("The Fragment " + c13374971588771233833 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            p14575954172000745949E = c13374971588771233833.e();
        }
        return (F) p14575954172000745949E.z(getId());
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                android.view.View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        android.view.View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(android.view.View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            android.view.View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            android.view.View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        throw new java.lang.UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(android.view.View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}
