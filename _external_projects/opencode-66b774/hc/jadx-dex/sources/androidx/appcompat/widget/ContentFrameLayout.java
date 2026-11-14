package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {
    public android.util.TypedValue a;
    public android.util.TypedValue b;
    public android.util.TypedValue c;
    public android.util.TypedValue d;
    public android.util.TypedValue e;
    public android.util.TypedValue f;
    public final android.graphics.Rect g;
    public dev.epro.r0.G14484913861726137649 h;

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.g = new android.graphics.Rect();
    }

    public android.util.TypedValue getFixedHeightMajor() {
        android.util.TypedValue typedValue = this.e;
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        this.e = typedValue2;
        return typedValue2;
    }

    public android.util.TypedValue getFixedHeightMinor() {
        android.util.TypedValue typedValue = this.f;
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        this.f = typedValue2;
        return typedValue2;
    }

    public android.util.TypedValue getFixedWidthMajor() {
        android.util.TypedValue typedValue = this.c;
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        this.c = typedValue2;
        return typedValue2;
    }

    public android.util.TypedValue getFixedWidthMinor() {
        android.util.TypedValue typedValue = this.d;
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        this.d = typedValue2;
        return typedValue2;
    }

    public android.util.TypedValue getMinWidthMajor() {
        android.util.TypedValue typedValue = this.a;
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        this.a = typedValue2;
        return typedValue2;
    }

    public android.util.TypedValue getMinWidthMinor() {
        android.util.TypedValue typedValue = this.b;
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        this.b = typedValue2;
        return typedValue2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dev.epro.r0.G14484913861726137649 g14484913861726137649 = this.h;
        if (g14484913861726137649 != null) {
            g14484913861726137649.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        dev.epro.r0.T1878852318042345820 t1878852318042345820;
        super.onDetachedFromWindow();
        dev.epro.r0.I11105136999178551542 i11105136999178551542 = this.h;
        if (i11105136999178551542 != null) {
            dev.epro.r0.L9687083612725928934 l9687083612725928934 = i11105136999178551542.b;
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = l9687083612725928934.q;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.j();
                androidx.appcompat.widget.ActionMenuView actionMenuView = actionBarOverlayLayout.e.a.a;
                if (actionMenuView != null && (t1878852318042345820 = actionMenuView.t) != null) {
                    t1878852318042345820.e();
                    dev.epro.r0.H10500197361170225543 h10500197361170225543 = t1878852318042345820.t;
                    if (h10500197361170225543 != null && h10500197361170225543.b()) {
                        ((dev.epro.r0.V2419641781538918069) h10500197361170225543).i.dismiss();
                    }
                }
            }
            if (l9687083612725928934.v != null) {
                l9687083612725928934.l.getDecorView().removeCallbacks(l9687083612725928934.w);
                if (l9687083612725928934.v.isShowing()) {
                    try {
                        l9687083612725928934.v.dismiss();
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                }
                l9687083612725928934.v = null;
            }
            dev.epro.r0.Q1445202285683234142 q1445202285683234142 = l9687083612725928934.x;
            if (q1445202285683234142 != null) {
                q1445202285683234142.b();
            }
            dev.epro.r0.T8605657386197958581 t8605657386197958581 = l9687083612725928934.x(0).h;
            if (t8605657386197958581 != null) {
                t8605657386197958581.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(dev.epro.r0.G14484913861726137649 g14484913861726137649) {
        this.h = g14484913861726137649;
    }

    public ContentFrameLayout(android.content.Context context) {
        this(context, null);
    }
}
