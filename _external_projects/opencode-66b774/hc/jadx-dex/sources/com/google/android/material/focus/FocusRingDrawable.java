package com.google.android.material.focus;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class FocusRingDrawable extends android.graphics.drawable.DrawableWrapper {
    public static final android.graphics.drawable.ColorDrawable p = new android.graphics.drawable.ColorDrawable(0);
    public static final int[] q = {android.R.attr.state_focused, android.R.attr.state_window_focused};
    public static final android.view.animation.OvershootInterpolator r = new android.view.animation.OvershootInterpolator(4.0f);
    public static final dev.epro.r0.A12143630534484782974 s = new dev.epro.r0.A12143630534484782974("interpolation");
    public final android.graphics.Paint a;
    public final android.graphics.RectF b;
    public final android.graphics.Rect c;
    public final android.graphics.Path d;
    public final android.graphics.Path e;
    public final android.graphics.Matrix f;
    public final dev.epro.r0.E1005111105761972824 g;
    public java.lang.ref.WeakReference h;
    public float i;
    public android.animation.ObjectAnimator j;
    public float k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dev.epro.r0.L7294648818075007471 f145o;

    public FocusRingDrawable(dev.epro.r0.L7294648818075007471 l7294648818075007471, android.content.res.Resources resources) {
        super(null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.a = paint;
        this.b = new android.graphics.RectF();
        this.c = new android.graphics.Rect();
        this.d = new android.graphics.Path();
        this.e = new android.graphics.Path();
        this.f = new android.graphics.Matrix();
        this.g = dev.epro.r0.E1005111105761972824.h();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        dev.epro.r0.L7294648818075007471 l72946488180750074712 = new dev.epro.r0.L7294648818075007471(l7294648818075007471);
        this.f145o = l72946488180750074712;
        android.graphics.drawable.Drawable.ConstantState constantState = l72946488180750074712.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        if (java.lang.Float.isNaN(this.f145o.j)) {
            return;
        }
        paint.setStrokeWidth(this.f145o.j);
    }

    public static int c(android.content.res.TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static float e(float f, android.content.res.Resources.Theme theme, int i, android.content.res.TypedArray typedArray, int i2, int i3) {
        if (!java.lang.Float.isNaN(f)) {
            return f;
        }
        android.content.res.Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!java.lang.Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(android.graphics.RectF rectF) {
        android.graphics.Rect rect = this.f145o.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.h;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((dev.epro.r0.I11571046933844109529) this.h.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof android.graphics.drawable.RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        android.graphics.drawable.RippleDrawable rippleDrawable = (android.graphics.drawable.RippleDrawable) getDrawable();
        android.graphics.Rect rect2 = this.c;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(java.lang.Math.max(0, (rect2.width() / 2) - radius), java.lang.Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(android.content.res.Resources.Theme theme) {
        super.applyTheme(theme);
        d(theme);
    }

    public final void b(android.graphics.Canvas canvas, android.graphics.Path path, float f, float f2, int i) {
        android.graphics.RectF rectF = this.b;
        a(rectF);
        float f3 = f * 2.0f;
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        android.graphics.Matrix matrix = this.f;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        android.graphics.Path path2 = this.d;
        path.transform(matrix, path2);
        float f4 = f2 * this.k;
        android.graphics.Paint paint = this.a;
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

    public final void f(dev.epro.r0.I9906786506247477813 i9906786506247477813) {
        android.graphics.RectF rectF = this.b;
        a(rectF);
        dev.epro.r0.A11042752882447342413 a11042752882447342413B = i9906786506247477813.b(q);
        boolean zH = a11042752882447342413B.h(rectF);
        android.graphics.Path path = this.e;
        if (!zH) {
            this.g.a(a11042752882447342413B, null, 1.0f, rectF, null, path);
            this.i = -1.0f;
            return;
        }
        dev.epro.r0.L7294648818075007471 l7294648818075007471 = this.f145o;
        float f = ((l7294648818075007471.j / 2.0f) * this.k) + l7294648818075007471.p;
        rectF.inset(f, f);
        this.i = a11042752882447342413B.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        dev.epro.r0.L7294648818075007471 l7294648818075007471 = this.f145o;
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
        } catch (java.lang.NoSuchMethodError unused) {
            return this.f145o.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = dev.epro.r0.Q9005017131391967988.e;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f145o.d = c(typedArrayObtainStyledAttributes, 0);
        if (this.f145o.d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            dev.epro.r0.L7294648818075007471 l7294648818075007471 = this.f145o;
            l7294648818075007471.c = typedArrayObtainStyledAttributes.getBoolean(0, l7294648818075007471.c);
            this.f145o.e = true;
        }
        this.f145o.g = c(typedArrayObtainStyledAttributes, 5);
        dev.epro.r0.L7294648818075007471 l72946488180750074712 = this.f145o;
        if (l72946488180750074712.g == Integer.MIN_VALUE) {
            l72946488180750074712.f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f145o.i = c(typedArrayObtainStyledAttributes, 1);
        dev.epro.r0.L7294648818075007471 l72946488180750074713 = this.f145o;
        if (l72946488180750074713.i == Integer.MIN_VALUE) {
            l72946488180750074713.h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f145o.k = c(typedArrayObtainStyledAttributes, 6);
        dev.epro.r0.L7294648818075007471 l72946488180750074714 = this.f145o;
        if (l72946488180750074714.k == Integer.MIN_VALUE) {
            l72946488180750074714.j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f145o.m = c(typedArrayObtainStyledAttributes, 3);
        dev.epro.r0.L7294648818075007471 l72946488180750074715 = this.f145o;
        if (l72946488180750074715.m == Integer.MIN_VALUE) {
            l72946488180750074715.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f145o.m = c(typedArrayObtainStyledAttributes, 3);
        dev.epro.r0.L7294648818075007471 l72946488180750074716 = this.f145o;
        if (l72946488180750074716.m == Integer.MIN_VALUE) {
            l72946488180750074716.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f145o.o = c(typedArrayObtainStyledAttributes, 7);
        dev.epro.r0.L7294648818075007471 l72946488180750074717 = this.f145o;
        if (l72946488180750074717.o == Integer.MIN_VALUE) {
            l72946488180750074717.n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f145o.q = c(typedArrayObtainStyledAttributes, 4);
        dev.epro.r0.L7294648818075007471 l72946488180750074718 = this.f145o;
        if (l72946488180750074718.q == Integer.MIN_VALUE) {
            l72946488180750074718.p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f145o.s = c(typedArrayObtainStyledAttributes, 2);
        dev.epro.r0.L7294648818075007471 l72946488180750074719 = this.f145o;
        if (l72946488180750074719.s == Integer.MIN_VALUE) {
            l72946488180750074719.r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f145o.v = c(typedArrayObtainStyledAttributes, 8);
        this.f145o.u = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        android.graphics.drawable.Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = android.graphics.drawable.Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.f145o.a = drawableCreateFromXmlInner.getConstantState();
        } else {
            android.graphics.drawable.ColorDrawable colorDrawable = p;
            setDrawable(colorDrawable);
            this.f145o.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f145o.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        android.animation.ObjectAnimator objectAnimator = this.j;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.j = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        if (!this.n && super.mutate() == this) {
            this.f145o = new dev.epro.r0.L7294648818075007471(this.f145o);
            android.graphics.drawable.Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f145o.a = drawable.getConstantState();
            }
            this.n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        dev.epro.r0.A11042752882447342413 a11042752882447342413;
        super.onBoundsChange(rect);
        dev.epro.r0.L7294648818075007471 l7294648818075007471 = this.f145o;
        if (l7294648818075007471.c) {
            dev.epro.r0.I9906786506247477813 i9906786506247477813 = l7294648818075007471.t;
            if (i9906786506247477813 != null) {
                f(i9906786506247477813);
                return;
            }
            android.graphics.drawable.Drawable drawable = getDrawable();
            dev.epro.r0.I9906786506247477813 i99067865062474778132 = null;
            if (drawable instanceof android.graphics.drawable.ShapeDrawable) {
                android.graphics.Outline outline = new android.graphics.Outline();
                ((android.graphics.drawable.ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    dev.epro.r0.Z17967803306442720428 z17967803306442720428 = new dev.epro.r0.Z17967803306442720428();
                    dev.epro.r0.Z17967803306442720428 z179678033064427204282 = new dev.epro.r0.Z17967803306442720428();
                    dev.epro.r0.Z17967803306442720428 z179678033064427204283 = new dev.epro.r0.Z17967803306442720428();
                    dev.epro.r0.Z17967803306442720428 z179678033064427204284 = new dev.epro.r0.Z17967803306442720428();
                    dev.epro.r0.T13350664027331345869 t13350664027331345869 = new dev.epro.r0.T13350664027331345869((byte) 0);
                    dev.epro.r0.T13350664027331345869 t133506640273313458692 = new dev.epro.r0.T13350664027331345869((byte) 0);
                    dev.epro.r0.T13350664027331345869 t133506640273313458693 = new dev.epro.r0.T13350664027331345869((byte) 0);
                    dev.epro.r0.T13350664027331345869 t133506640273313458694 = new dev.epro.r0.T13350664027331345869((byte) 0);
                    float radius = outline.getRadius();
                    dev.epro.r0.W8078457053980686709 w8078457053980686709 = new dev.epro.r0.W8078457053980686709(radius);
                    dev.epro.r0.W8078457053980686709 w80784570539806867092 = new dev.epro.r0.W8078457053980686709(radius);
                    dev.epro.r0.W8078457053980686709 w80784570539806867093 = new dev.epro.r0.W8078457053980686709(radius);
                    dev.epro.r0.W8078457053980686709 w80784570539806867094 = new dev.epro.r0.W8078457053980686709(radius);
                    a11042752882447342413 = new dev.epro.r0.A11042752882447342413();
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
            } else if (drawable instanceof android.graphics.drawable.GradientDrawable) {
                android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (java.lang.NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    dev.epro.r0.Z17967803306442720428 z179678033064427204285 = new dev.epro.r0.Z17967803306442720428();
                    dev.epro.r0.Z17967803306442720428 z179678033064427204286 = new dev.epro.r0.Z17967803306442720428();
                    dev.epro.r0.Z17967803306442720428 z179678033064427204287 = new dev.epro.r0.Z17967803306442720428();
                    dev.epro.r0.Z17967803306442720428 z179678033064427204288 = new dev.epro.r0.Z17967803306442720428();
                    dev.epro.r0.T13350664027331345869 t133506640273313458695 = new dev.epro.r0.T13350664027331345869((byte) 0);
                    dev.epro.r0.T13350664027331345869 t133506640273313458696 = new dev.epro.r0.T13350664027331345869((byte) 0);
                    dev.epro.r0.T13350664027331345869 t133506640273313458697 = new dev.epro.r0.T13350664027331345869((byte) 0);
                    dev.epro.r0.T13350664027331345869 t133506640273313458698 = new dev.epro.r0.T13350664027331345869((byte) 0);
                    dev.epro.r0.W8078457053980686709 w80784570539806867095 = new dev.epro.r0.W8078457053980686709(java.lang.Math.min(cornerRadii[0], cornerRadii[1]));
                    dev.epro.r0.W8078457053980686709 w80784570539806867096 = new dev.epro.r0.W8078457053980686709(java.lang.Math.min(cornerRadii[2], cornerRadii[3]));
                    dev.epro.r0.W8078457053980686709 w80784570539806867097 = new dev.epro.r0.W8078457053980686709(java.lang.Math.min(cornerRadii[4], cornerRadii[5]));
                    dev.epro.r0.W8078457053980686709 w80784570539806867098 = new dev.epro.r0.W8078457053980686709(java.lang.Math.min(cornerRadii[6], cornerRadii[7]));
                    a11042752882447342413 = new dev.epro.r0.A11042752882447342413();
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
                    } catch (java.lang.NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        dev.epro.r0.Z17967803306442720428 z179678033064427204289 = new dev.epro.r0.Z17967803306442720428();
                        dev.epro.r0.Z17967803306442720428 z1796780330644272042810 = new dev.epro.r0.Z17967803306442720428();
                        dev.epro.r0.Z17967803306442720428 z1796780330644272042811 = new dev.epro.r0.Z17967803306442720428();
                        dev.epro.r0.Z17967803306442720428 z1796780330644272042812 = new dev.epro.r0.Z17967803306442720428();
                        dev.epro.r0.T13350664027331345869 t133506640273313458699 = new dev.epro.r0.T13350664027331345869((byte) 0);
                        dev.epro.r0.T13350664027331345869 t1335066402733134586910 = new dev.epro.r0.T13350664027331345869((byte) 0);
                        dev.epro.r0.T13350664027331345869 t1335066402733134586911 = new dev.epro.r0.T13350664027331345869((byte) 0);
                        dev.epro.r0.T13350664027331345869 t1335066402733134586912 = new dev.epro.r0.T13350664027331345869((byte) 0);
                        dev.epro.r0.W8078457053980686709 w80784570539806867099 = new dev.epro.r0.W8078457053980686709(cornerRadius);
                        dev.epro.r0.W8078457053980686709 w807845705398068670910 = new dev.epro.r0.W8078457053980686709(cornerRadius);
                        dev.epro.r0.W8078457053980686709 w807845705398068670911 = new dev.epro.r0.W8078457053980686709(cornerRadius);
                        dev.epro.r0.W8078457053980686709 w807845705398068670912 = new dev.epro.r0.W8078457053980686709(cornerRadius);
                        dev.epro.r0.A11042752882447342413 a110427528824473424132 = new dev.epro.r0.A11042752882447342413();
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
        dev.epro.r0.L7294648818075007471 l7294648818075007471 = this.f145o;
        if (!l7294648818075007471.c) {
            this.m = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = android.util.StateSet.stateSetMatches(l7294648818075007471.x, iArr);
        boolean z = this.m != zStateSetMatches;
        this.m = zStateSetMatches;
        if (z && iArr.length > 0 && !this.l) {
            android.animation.ObjectAnimator objectAnimator = this.j;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.j = null;
            }
            if (zStateSetMatches) {
                android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, s, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(r);
                objectAnimatorOfFloat.addListener(new dev.epro.r0.G7019617308371076781(this, (byte) 2));
                this.j = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.k = 1.0f;
            }
        }
        this.l = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable(android.content.Context context, android.graphics.drawable.Drawable drawable) {
        super(drawable);
        this.a = new android.graphics.Paint(1);
        this.b = new android.graphics.RectF();
        this.c = new android.graphics.Rect();
        this.d = new android.graphics.Path();
        this.e = new android.graphics.Path();
        this.f = new android.graphics.Matrix();
        this.g = dev.epro.r0.E1005111105761972824.h();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        dev.epro.r0.L7294648818075007471 l7294648818075007471 = new dev.epro.r0.L7294648818075007471((dev.epro.r0.L7294648818075007471) null);
        this.f145o = l7294648818075007471;
        if (drawable != null) {
            l7294648818075007471.a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public FocusRingDrawable() {
        super(null);
        this.a = new android.graphics.Paint(1);
        this.b = new android.graphics.RectF();
        this.c = new android.graphics.Rect();
        this.d = new android.graphics.Path();
        this.e = new android.graphics.Path();
        this.f = new android.graphics.Matrix();
        this.g = dev.epro.r0.E1005111105761972824.h();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        this.f145o = new dev.epro.r0.L7294648818075007471((dev.epro.r0.L7294648818075007471) null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
