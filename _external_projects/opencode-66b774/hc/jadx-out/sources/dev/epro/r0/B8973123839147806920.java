package dev.epro.r0;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B8973123839147806920 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8973123839147806920(Context context, AttributeSet attributeSet, P14575954172000745949 p14575954172000745949) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Z15406236664963307934.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        C13374971588771233833 c13374971588771233833Z = p14575954172000745949.z(id);
        if (classAttribute != null && c13374971588771233833Z == null) {
            if (id == -1) {
                S10973172697741180971.m(G6547577305291411977.s("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            U1393585516073146670 u1393585516073146670B = p14575954172000745949.B();
            context.getClassLoader();
            C13374971588771233833 c13374971588771233833A = u1393585516073146670B.a(classAttribute);
            c13374971588771233833A.getClass();
            c13374971588771233833A.C = true;
            C10994625127000459680 c10994625127000459680 = c13374971588771233833A.s;
            if ((c10994625127000459680 == null ? null : c10994625127000459680.q) != null) {
                c13374971588771233833A.C = true;
            }
            W10130330342449691688 w10130330342449691688 = new W10130330342449691688(p14575954172000745949);
            w10130330342449691688.f550o = true;
            c13374971588771233833A.D = this;
            w10130330342449691688.e(getId(), c13374971588771233833A, string);
            if (w10130330342449691688.g) {
                S10973172697741180971.m("This transaction is already being added to the back stack");
                throw null;
            }
            P14575954172000745949 p145759541720007459492 = w10130330342449691688.p;
            if (p145759541720007459492.t != null && !p145759541720007459492.G) {
                p145759541720007459492.w(true);
                w10130330342449691688.a(p145759541720007459492.I, p145759541720007459492.J);
                p145759541720007459492.b = true;
                try {
                    p145759541720007459492.M(p145759541720007459492.I, p145759541720007459492.J);
                    p145759541720007459492.c();
                    p145759541720007459492.W();
                    p145759541720007459492.t();
                    ((HashMap) p145759541720007459492.c.d).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    p145759541720007459492.c();
                    throw th;
                }
            }
        }
        ArrayList arrayListE = p14575954172000745949.c.E();
        int size = arrayListE.size();
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            C13374971588771233833 c13374971588771233833 = ((B11652692535345282996) obj).c;
            getId();
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof C13374971588771233833 ? (C13374971588771233833) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            D11988991656201568495.m("Views added to a FragmentContainerView must be associated with a Fragment. View ", view, " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        N3121440022506799205 n3121440022506799205C;
        windowInsets.getClass();
        N3121440022506799205 n3121440022506799205C2 = N3121440022506799205.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            n3121440022506799205C = N3121440022506799205.c(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = W10240872260424387225.a;
            WindowInsets windowInsetsB = n3121440022506799205C2.b();
            if (windowInsetsB != null && !windowInsetsB.equals(windowInsetsB)) {
                n3121440022506799205C2 = N3121440022506799205.c(windowInsetsB, this);
            }
            n3121440022506799205C = n3121440022506799205C2;
        }
        if (!n3121440022506799205C.a.s()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                W10240872260424387225.b(getChildAt(i), n3121440022506799205C);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.d) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.d) {
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends C13374971588771233833> F getFragment() {
        C13374971588771233833 c13374971588771233833;
        R13227154569034155950 r13227154569034155950;
        P14575954172000745949 p14575954172000745949E;
        View view = this;
        while (true) {
            if (view == null) {
                c13374971588771233833 = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            c13374971588771233833 = tag instanceof C13374971588771233833 ? (C13374971588771233833) tag : null;
            if (c13374971588771233833 != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (c13374971588771233833 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    r13227154569034155950 = null;
                    break;
                }
                if (context instanceof R13227154569034155950) {
                    r13227154569034155950 = (R13227154569034155950) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (r13227154569034155950 == null) {
                Q11088980322693754445.j("View ", this, " is not within a subclass of FragmentActivity.");
                return null;
            }
            p14575954172000745949E = ((C10994625127000459680) r13227154569034155950.u.b).t;
        } else {
            if (c13374971588771233833.s == null || !c13374971588771233833.k) {
                throw new IllegalStateException("The Fragment " + c13374971588771233833 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            p14575954172000745949E = c13374971588771233833.e();
        }
        return (F) p14575954172000745949E.z(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
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
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}
