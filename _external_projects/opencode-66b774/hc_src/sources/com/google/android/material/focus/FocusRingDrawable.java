package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import dev.epro.r0.A11042752882447342413;
import dev.epro.r0.A12143630534484782974;
import dev.epro.r0.E1005111105761972824;
import dev.epro.r0.G7019617308371076781;
import dev.epro.r0.I11571046933844109529;
import dev.epro.r0.I9906786506247477813;
import dev.epro.r0.L7294648818075007471;
import dev.epro.r0.Q9005017131391967988;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.W8078457053980686709;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable p = new ColorDrawable(0);
    public static final int[] q = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator r = new OvershootInterpolator(4.0f);
    public static final A12143630534484782974 s = new A12143630534484782974("interpolation");
    public final Paint a;
    public final RectF b;
    public final Rect c;
    public final Path d;
    public final Path e;
    public final Matrix f;
    public final E1005111105761972824 g;
    public WeakReference h;
    public float i;
    public ObjectAnimator j;
    public float k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public L7294648818075007471 f145o;

    public FocusRingDrawable(L7294648818075007471 l7294648818075007471, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = E1005111105761972824.h();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        L7294648818075007471 l72946488180750074712 = new L7294648818075007471(l7294648818075007471);
        this.f145o = l72946488180750074712;
        Drawable.ConstantState constantState = l72946488180750074712.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f145o.j)) {
            return;
        }
        paint.setStrokeWidth(this.f145o.j);
    }

    public static int c(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static float e(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(RectF rectF) {
        Rect rect = this.f145o.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.h;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((I11571046933844109529) this.h.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.c;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        d(theme);
    }

    public final void b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.b;
        a(rectF);
        float f3 = f * 2.0f;
        float width = 1.0f - (f3 / rectF.width());
        float height = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.f;
        matrix.reset();
        matrix.postScale(width, height, rectF.centerX(), rectF.centerY());
        Path path2 = this.d;
        path.transform(matrix, path2);
        float f4 = f2 * this.k;
        Paint paint = this.a;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    public final void d(Resources.Theme theme) {
        TypedValue V;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(Q9005017131391967988.e);
        int i = this.f145o.d;
        if (i != Integer.MIN_VALUE && (V = S10823041268949770285.V(theme, i)) != null) {
            L7294648818075007471 l7294648818075007471 = this.f145o;
            l7294648818075007471.c = V.data != 0;
            l7294648818075007471.e = true;
        }
        L7294648818075007471 l72946488180750074712 = this.f145o;
        if (!l72946488180750074712.e) {
            l72946488180750074712.c = S10823041268949770285.W(theme, net.zetetic.database.R.attr.focusRingsEnabled, l72946488180750074712.c);
        }
        L7294648818075007471 l72946488180750074713 = this.f145o;
        if (l72946488180750074713.c) {
            int i2 = l72946488180750074713.f;
            int i3 = l72946488180750074713.g;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, -16777216);
            }
            l72946488180750074713.f = i2;
            L7294648818075007471 l72946488180750074714 = this.f145o;
            int i4 = l72946488180750074714.h;
            int i5 = l72946488180750074714.i;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            l72946488180750074714.h = i4;
            L7294648818075007471 l72946488180750074715 = this.f145o;
            l72946488180750074715.j = e(l72946488180750074715.j, theme, l72946488180750074715.k, obtainStyledAttributes, 6, net.zetetic.database.R.dimen.mtrl_focus_ring_outer_stroke_width);
            L7294648818075007471 l72946488180750074716 = this.f145o;
            l72946488180750074716.l = e(l72946488180750074716.l, theme, l72946488180750074716.m, obtainStyledAttributes, 3, net.zetetic.database.R.dimen.mtrl_focus_ring_inner_stroke_width);
            L7294648818075007471 l72946488180750074717 = this.f145o;
            l72946488180750074717.n = e(l72946488180750074717.n, theme, l72946488180750074717.f351o, obtainStyledAttributes, 7, 0);
            L7294648818075007471 l72946488180750074718 = this.f145o;
            l72946488180750074718.p = e(l72946488180750074718.p, theme, l72946488180750074718.q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.f145o.p)) {
                this.f145o.p = 0.0f;
            }
            L7294648818075007471 l72946488180750074719 = this.f145o;
            l72946488180750074719.r = e(l72946488180750074719.r, theme, l72946488180750074719.s, obtainStyledAttributes, 2, net.zetetic.database.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            L7294648818075007471 l729464881807500747110 = this.f145o;
            int i6 = l729464881807500747110.u;
            int[] iArr = Q9005017131391967988.f460o;
            if (i6 != Integer.MIN_VALUE) {
                l729464881807500747110.t = A11042752882447342413.f(theme.obtainStyledAttributes(i6, iArr), new W8078457053980686709(0.0f)).a();
            } else {
                int i7 = l729464881807500747110.v;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = net.zetetic.database.R.attr.focusRingsShapeAppearance;
                }
                TypedValue V2 = S10823041268949770285.V(theme, i7);
                if (V2 != null) {
                    this.f145o.t = A11042752882447342413.f(theme.obtainStyledAttributes(V2.resourceId, iArr), new W8078457053980686709(0.0f)).a();
                }
            }
        }
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.a;
        paint.setStyle(style);
        if (Float.isNaN(this.f145o.j)) {
            return;
        }
        paint.setStrokeWidth(this.f145o.j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0046, code lost:
    
        if (r1.isEmpty() == false) goto L9;
     */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.focus.FocusRingDrawable.draw(android.graphics.Canvas):void");
    }

    public final void f(I9906786506247477813 i9906786506247477813) {
        RectF rectF = this.b;
        a(rectF);
        A11042752882447342413 b = i9906786506247477813.b(q);
        boolean h = b.h(rectF);
        Path path = this.e;
        if (!h) {
            this.g.a(b, null, 1.0f, rectF, null, path);
            this.i = -1.0f;
            return;
        }
        L7294648818075007471 l7294648818075007471 = this.f145o;
        float f = ((l7294648818075007471.j / 2.0f) * this.k) + l7294648818075007471.p;
        rectF.inset(f, f);
        this.i = b.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        L7294648818075007471 l7294648818075007471 = this.f145o;
        if (l7294648818075007471.a == null) {
            return null;
        }
        l7294648818075007471.b = getChangingConfigurations();
        return this.f145o;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.f145o.c;
        } catch (NoSuchMethodError unused) {
            return this.f145o.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = Q9005017131391967988.e;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f145o.d = c(obtainStyledAttributes, 0);
        if (this.f145o.d == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            L7294648818075007471 l7294648818075007471 = this.f145o;
            l7294648818075007471.c = obtainStyledAttributes.getBoolean(0, l7294648818075007471.c);
            this.f145o.e = true;
        }
        this.f145o.g = c(obtainStyledAttributes, 5);
        L7294648818075007471 l72946488180750074712 = this.f145o;
        if (l72946488180750074712.g == Integer.MIN_VALUE) {
            l72946488180750074712.f = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f145o.i = c(obtainStyledAttributes, 1);
        L7294648818075007471 l72946488180750074713 = this.f145o;
        if (l72946488180750074713.i == Integer.MIN_VALUE) {
            l72946488180750074713.h = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f145o.k = c(obtainStyledAttributes, 6);
        L7294648818075007471 l72946488180750074714 = this.f145o;
        if (l72946488180750074714.k == Integer.MIN_VALUE) {
            l72946488180750074714.j = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f145o.m = c(obtainStyledAttributes, 3);
        L7294648818075007471 l72946488180750074715 = this.f145o;
        if (l72946488180750074715.m == Integer.MIN_VALUE) {
            l72946488180750074715.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f145o.m = c(obtainStyledAttributes, 3);
        L7294648818075007471 l72946488180750074716 = this.f145o;
        if (l72946488180750074716.m == Integer.MIN_VALUE) {
            l72946488180750074716.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f145o.f351o = c(obtainStyledAttributes, 7);
        L7294648818075007471 l72946488180750074717 = this.f145o;
        if (l72946488180750074717.f351o == Integer.MIN_VALUE) {
            l72946488180750074717.n = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f145o.q = c(obtainStyledAttributes, 4);
        L7294648818075007471 l72946488180750074718 = this.f145o;
        if (l72946488180750074718.q == Integer.MIN_VALUE) {
            l72946488180750074718.p = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f145o.s = c(obtainStyledAttributes, 2);
        L7294648818075007471 l72946488180750074719 = this.f145o;
        if (l72946488180750074719.s == Integer.MIN_VALUE) {
            l72946488180750074719.r = obtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f145o.v = c(obtainStyledAttributes, 8);
        this.f145o.u = obtainStyledAttributes.getType(8) == 1 ? obtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        obtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
            this.f145o.a = drawable.getConstantState();
        } else {
            ColorDrawable colorDrawable = p;
            setDrawable(colorDrawable);
            this.f145o.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        boolean isProjected;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return false;
        }
        isProjected = drawable.isProjected();
        return isProjected;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f145o.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.j;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.j = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.n && super.mutate() == this) {
            this.f145o = new L7294648818075007471(this.f145o);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f145o.a = drawable.getConstantState();
            }
            this.n = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018c  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBoundsChange(android.graphics.Rect r15) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.focus.FocusRingDrawable.onBoundsChange(android.graphics.Rect):void");
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        L7294648818075007471 l7294648818075007471 = this.f145o;
        if (!l7294648818075007471.c) {
            this.m = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(l7294648818075007471.x, iArr);
        boolean z = this.m != stateSetMatches;
        this.m = stateSetMatches;
        if (z && iArr.length > 0 && !this.l) {
            ObjectAnimator objectAnimator = this.j;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.j = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, s, 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(r);
                ofFloat.addListener(new G7019617308371076781(this, (byte) 2));
                this.j = ofFloat;
                ofFloat.start();
            } else {
                this.k = 1.0f;
            }
        }
        this.l = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = E1005111105761972824.h();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        L7294648818075007471 l7294648818075007471 = new L7294648818075007471(null);
        this.f145o = l7294648818075007471;
        if (drawable != null) {
            l7294648818075007471.a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public FocusRingDrawable() {
        super(null);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = E1005111105761972824.h();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        this.f145o = new L7294648818075007471(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
