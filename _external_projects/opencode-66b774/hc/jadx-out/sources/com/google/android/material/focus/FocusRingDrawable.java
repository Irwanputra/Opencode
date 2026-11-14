package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
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
import dev.epro.r0.T13350664027331345869;
import dev.epro.r0.W8078457053980686709;
import dev.epro.r0.Z17967803306442720428;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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

    /* JADX INFO: renamed from: o, reason: collision with root package name */
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
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.f;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.res.Resources.Theme r9) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.focus.FocusRingDrawable.d(android.content.res.Resources$Theme):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.focus.FocusRingDrawable.draw(android.graphics.Canvas):void");
    }

    public final void f(I9906786506247477813 i9906786506247477813) {
        RectF rectF = this.b;
        a(rectF);
        A11042752882447342413 a11042752882447342413B = i9906786506247477813.b(q);
        boolean zH = a11042752882447342413B.h(rectF);
        Path path = this.e;
        if (!zH) {
            this.g.a(a11042752882447342413B, null, 1.0f, rectF, null, path);
            this.i = -1.0f;
            return;
        }
        L7294648818075007471 l7294648818075007471 = this.f145o;
        float f = ((l7294648818075007471.j / 2.0f) * this.k) + l7294648818075007471.p;
        rectF.inset(f, f);
        this.i = a11042752882447342413B.e.a(rectF);
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
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = Q9005017131391967988.e;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f145o.d = c(typedArrayObtainStyledAttributes, 0);
        if (this.f145o.d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            L7294648818075007471 l7294648818075007471 = this.f145o;
            l7294648818075007471.c = typedArrayObtainStyledAttributes.getBoolean(0, l7294648818075007471.c);
            this.f145o.e = true;
        }
        this.f145o.g = c(typedArrayObtainStyledAttributes, 5);
        L7294648818075007471 l72946488180750074712 = this.f145o;
        if (l72946488180750074712.g == Integer.MIN_VALUE) {
            l72946488180750074712.f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f145o.i = c(typedArrayObtainStyledAttributes, 1);
        L7294648818075007471 l72946488180750074713 = this.f145o;
        if (l72946488180750074713.i == Integer.MIN_VALUE) {
            l72946488180750074713.h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f145o.k = c(typedArrayObtainStyledAttributes, 6);
        L7294648818075007471 l72946488180750074714 = this.f145o;
        if (l72946488180750074714.k == Integer.MIN_VALUE) {
            l72946488180750074714.j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f145o.m = c(typedArrayObtainStyledAttributes, 3);
        L7294648818075007471 l72946488180750074715 = this.f145o;
        if (l72946488180750074715.m == Integer.MIN_VALUE) {
            l72946488180750074715.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f145o.m = c(typedArrayObtainStyledAttributes, 3);
        L7294648818075007471 l72946488180750074716 = this.f145o;
        if (l72946488180750074716.m == Integer.MIN_VALUE) {
            l72946488180750074716.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f145o.f351o = c(typedArrayObtainStyledAttributes, 7);
        L7294648818075007471 l72946488180750074717 = this.f145o;
        if (l72946488180750074717.f351o == Integer.MIN_VALUE) {
            l72946488180750074717.n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f145o.q = c(typedArrayObtainStyledAttributes, 4);
        L7294648818075007471 l72946488180750074718 = this.f145o;
        if (l72946488180750074718.q == Integer.MIN_VALUE) {
            l72946488180750074718.p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f145o.s = c(typedArrayObtainStyledAttributes, 2);
        L7294648818075007471 l72946488180750074719 = this.f145o;
        if (l72946488180750074719.s == Integer.MIN_VALUE) {
            l72946488180750074719.r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f145o.v = c(typedArrayObtainStyledAttributes, 8);
        this.f145o.u = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.f145o.a = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = p;
            setDrawable(colorDrawable);
            this.f145o.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
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

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        A11042752882447342413 a11042752882447342413;
        super.onBoundsChange(rect);
        L7294648818075007471 l7294648818075007471 = this.f145o;
        if (l7294648818075007471.c) {
            I9906786506247477813 i9906786506247477813 = l7294648818075007471.t;
            if (i9906786506247477813 != null) {
                f(i9906786506247477813);
                return;
            }
            Drawable drawable = getDrawable();
            byte b = 0;
            I9906786506247477813 i99067865062474778132 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    Z17967803306442720428 z17967803306442720428 = new Z17967803306442720428();
                    Z17967803306442720428 z179678033064427204282 = new Z17967803306442720428();
                    Z17967803306442720428 z179678033064427204283 = new Z17967803306442720428();
                    Z17967803306442720428 z179678033064427204284 = new Z17967803306442720428();
                    T13350664027331345869 t13350664027331345869 = new T13350664027331345869(b);
                    T13350664027331345869 t133506640273313458692 = new T13350664027331345869(b);
                    T13350664027331345869 t133506640273313458693 = new T13350664027331345869(b);
                    T13350664027331345869 t133506640273313458694 = new T13350664027331345869(b);
                    float radius = outline.getRadius();
                    W8078457053980686709 w8078457053980686709 = new W8078457053980686709(radius);
                    W8078457053980686709 w80784570539806867092 = new W8078457053980686709(radius);
                    W8078457053980686709 w80784570539806867093 = new W8078457053980686709(radius);
                    W8078457053980686709 w80784570539806867094 = new W8078457053980686709(radius);
                    a11042752882447342413 = new A11042752882447342413();
                    a11042752882447342413.a = z17967803306442720428;
                    a11042752882447342413.b = z179678033064427204282;
                    a11042752882447342413.c = z179678033064427204283;
                    a11042752882447342413.d = z179678033064427204284;
                    a11042752882447342413.e = w8078457053980686709;
                    a11042752882447342413.f = w80784570539806867092;
                    a11042752882447342413.g = w80784570539806867093;
                    a11042752882447342413.h = w80784570539806867094;
                    a11042752882447342413.i = t13350664027331345869;
                    a11042752882447342413.j = t133506640273313458692;
                    a11042752882447342413.k = t133506640273313458693;
                    a11042752882447342413.l = t133506640273313458694;
                    i99067865062474778132 = a11042752882447342413;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    Z17967803306442720428 z179678033064427204285 = new Z17967803306442720428();
                    Z17967803306442720428 z179678033064427204286 = new Z17967803306442720428();
                    Z17967803306442720428 z179678033064427204287 = new Z17967803306442720428();
                    Z17967803306442720428 z179678033064427204288 = new Z17967803306442720428();
                    T13350664027331345869 t133506640273313458695 = new T13350664027331345869(b);
                    T13350664027331345869 t133506640273313458696 = new T13350664027331345869(b);
                    T13350664027331345869 t133506640273313458697 = new T13350664027331345869(b);
                    T13350664027331345869 t133506640273313458698 = new T13350664027331345869(b);
                    W8078457053980686709 w80784570539806867095 = new W8078457053980686709(Math.min(cornerRadii[0], cornerRadii[1]));
                    W8078457053980686709 w80784570539806867096 = new W8078457053980686709(Math.min(cornerRadii[2], cornerRadii[3]));
                    W8078457053980686709 w80784570539806867097 = new W8078457053980686709(Math.min(cornerRadii[4], cornerRadii[5]));
                    W8078457053980686709 w80784570539806867098 = new W8078457053980686709(Math.min(cornerRadii[6], cornerRadii[7]));
                    a11042752882447342413 = new A11042752882447342413();
                    a11042752882447342413.a = z179678033064427204285;
                    a11042752882447342413.b = z179678033064427204286;
                    a11042752882447342413.c = z179678033064427204287;
                    a11042752882447342413.d = z179678033064427204288;
                    a11042752882447342413.e = w80784570539806867095;
                    a11042752882447342413.f = w80784570539806867096;
                    a11042752882447342413.g = w80784570539806867097;
                    a11042752882447342413.h = w80784570539806867098;
                    a11042752882447342413.i = t133506640273313458695;
                    a11042752882447342413.j = t133506640273313458696;
                    a11042752882447342413.k = t133506640273313458697;
                    a11042752882447342413.l = t133506640273313458698;
                    i99067865062474778132 = a11042752882447342413;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        Z17967803306442720428 z179678033064427204289 = new Z17967803306442720428();
                        Z17967803306442720428 z1796780330644272042810 = new Z17967803306442720428();
                        Z17967803306442720428 z1796780330644272042811 = new Z17967803306442720428();
                        Z17967803306442720428 z1796780330644272042812 = new Z17967803306442720428();
                        T13350664027331345869 t133506640273313458699 = new T13350664027331345869(b);
                        T13350664027331345869 t1335066402733134586910 = new T13350664027331345869(b);
                        T13350664027331345869 t1335066402733134586911 = new T13350664027331345869(b);
                        T13350664027331345869 t1335066402733134586912 = new T13350664027331345869(b);
                        W8078457053980686709 w80784570539806867099 = new W8078457053980686709(cornerRadius);
                        W8078457053980686709 w807845705398068670910 = new W8078457053980686709(cornerRadius);
                        W8078457053980686709 w807845705398068670911 = new W8078457053980686709(cornerRadius);
                        W8078457053980686709 w807845705398068670912 = new W8078457053980686709(cornerRadius);
                        A11042752882447342413 a110427528824473424132 = new A11042752882447342413();
                        a110427528824473424132.a = z179678033064427204289;
                        a110427528824473424132.b = z1796780330644272042810;
                        a110427528824473424132.c = z1796780330644272042811;
                        a110427528824473424132.d = z1796780330644272042812;
                        a110427528824473424132.e = w80784570539806867099;
                        a110427528824473424132.f = w807845705398068670910;
                        a110427528824473424132.g = w807845705398068670911;
                        a110427528824473424132.h = w807845705398068670912;
                        a110427528824473424132.i = t133506640273313458699;
                        a110427528824473424132.j = t1335066402733134586910;
                        a110427528824473424132.k = t1335066402733134586911;
                        a110427528824473424132.l = t1335066402733134586912;
                        i99067865062474778132 = a110427528824473424132;
                    }
                }
            }
            if (i99067865062474778132 != null) {
                f(i99067865062474778132);
            } else {
                this.i = -1.0f;
                this.e.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        L7294648818075007471 l7294648818075007471 = this.f145o;
        if (!l7294648818075007471.c) {
            this.m = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(l7294648818075007471.x, iArr);
        boolean z = this.m != zStateSetMatches;
        this.m = zStateSetMatches;
        if (z && iArr.length > 0 && !this.l) {
            ObjectAnimator objectAnimator = this.j;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.j = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, s, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(r);
                objectAnimatorOfFloat.addListener(new G7019617308371076781(this, (byte) 2));
                this.j = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
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
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
