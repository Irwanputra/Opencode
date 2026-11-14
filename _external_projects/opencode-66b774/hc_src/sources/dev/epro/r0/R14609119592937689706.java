package dev.epro.r0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R14609119592937689706 extends N8137951887770464883 {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public U2622488099009331968 b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public R14609119592937689706() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        U2622488099009331968 u2622488099009331968 = new U2622488099009331968();
        u2622488099009331968.c = null;
        u2622488099009331968.d = j;
        u2622488099009331968.b = new E10821722077969840898();
        this.b = u2622488099009331968;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        U2622488099009331968 u2622488099009331968 = this.b;
        Bitmap bitmap = u2622488099009331968.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != u2622488099009331968.f.getHeight()) {
            u2622488099009331968.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            u2622488099009331968.k = true;
        }
        boolean z = this.f;
        U2622488099009331968 u26224880990093319682 = this.b;
        if (!z) {
            u26224880990093319682.f.eraseColor(0);
            Canvas canvas2 = new Canvas(u26224880990093319682.f);
            E10821722077969840898 e10821722077969840898 = u26224880990093319682.b;
            e10821722077969840898.a(e10821722077969840898.g, E10821722077969840898.p, canvas2, min, min2);
        } else if (u26224880990093319682.k || u26224880990093319682.g != u26224880990093319682.c || u26224880990093319682.h != u26224880990093319682.d || u26224880990093319682.j != u26224880990093319682.e || u26224880990093319682.i != u26224880990093319682.b.getRootAlpha()) {
            U2622488099009331968 u26224880990093319683 = this.b;
            u26224880990093319683.f.eraseColor(0);
            Canvas canvas3 = new Canvas(u26224880990093319683.f);
            E10821722077969840898 e108217220779698408982 = u26224880990093319683.b;
            e108217220779698408982.a(e108217220779698408982.g, E10821722077969840898.p, canvas3, min, min2);
            U2622488099009331968 u26224880990093319684 = this.b;
            u26224880990093319684.g = u26224880990093319684.c;
            u26224880990093319684.h = u26224880990093319684.d;
            u26224880990093319684.i = u26224880990093319684.b.getRootAlpha();
            u26224880990093319684.j = u26224880990093319684.e;
            u26224880990093319684.k = false;
        }
        U2622488099009331968 u26224880990093319685 = this.b;
        if (u26224880990093319685.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (u26224880990093319685.l == null) {
                Paint paint2 = new Paint();
                u26224880990093319685.l = paint2;
                paint2.setFilterBitmap(true);
            }
            u26224880990093319685.l.setAlpha(u26224880990093319685.b.getRootAlpha());
            u26224880990093319685.l.setColorFilter(colorFilter);
            paint = u26224880990093319685.l;
        }
        canvas.drawBitmap(u26224880990093319685.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new P536697688222291964(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        U2622488099009331968 u2622488099009331968 = this.b;
        u2622488099009331968.b = new E10821722077969840898();
        TypedArray n = O17574792317020433029.n(resources, theme, attributeSet, Y582199805280922215.a);
        U2622488099009331968 u26224880990093319682 = this.b;
        E10821722077969840898 e10821722077969840898 = u26224880990093319682.b;
        int i5 = !O17574792317020433029.l(xmlPullParser, "tintMode") ? -1 : n.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        u26224880990093319682.d = mode;
        ColorStateList i7 = O17574792317020433029.i(n, xmlPullParser, theme);
        if (i7 != null) {
            u26224880990093319682.c = i7;
        }
        boolean z = u26224880990093319682.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = n.getBoolean(5, z);
        }
        u26224880990093319682.e = z;
        float f = e10821722077969840898.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = n.getFloat(7, f);
        }
        e10821722077969840898.j = f;
        float f2 = e10821722077969840898.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = n.getFloat(8, f2);
        }
        e10821722077969840898.k = f2;
        if (e10821722077969840898.j <= 0.0f) {
            throw new XmlPullParserException(n.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(n.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        e10821722077969840898.h = n.getDimension(3, e10821722077969840898.h);
        int i8 = 2;
        float dimension = n.getDimension(2, e10821722077969840898.i);
        e10821722077969840898.i = dimension;
        if (e10821722077969840898.h <= 0.0f) {
            throw new XmlPullParserException(n.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(n.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = e10821722077969840898.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = n.getFloat(4, alpha);
        }
        e10821722077969840898.setAlpha(alpha);
        String string = n.getString(0);
        if (string != null) {
            e10821722077969840898.m = string;
            e10821722077969840898.f213o.put(string, e10821722077969840898);
        }
        n.recycle();
        u2622488099009331968.a = getChangingConfigurations();
        int i9 = 1;
        u2622488099009331968.k = true;
        U2622488099009331968 u26224880990093319683 = this.b;
        E10821722077969840898 e108217220779698408982 = u26224880990093319683.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        W13667419966741979084 w13667419966741979084 = e108217220779698408982.g;
        O827298036535440209 o827298036535440209 = e108217220779698408982.f213o;
        arrayDeque.push(w13667419966741979084);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i9 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i8) {
                String name = xmlPullParser.getName();
                W13667419966741979084 w136674199667419790842 = (W13667419966741979084) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    H12107640128773434115 h12107640128773434115 = new H12107640128773434115();
                    h12107640128773434115.e = 0.0f;
                    h12107640128773434115.g = 1.0f;
                    h12107640128773434115.h = 1.0f;
                    h12107640128773434115.i = 0.0f;
                    h12107640128773434115.j = 1.0f;
                    h12107640128773434115.k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    h12107640128773434115.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    h12107640128773434115.m = join;
                    h12107640128773434115.n = 4.0f;
                    TypedArray n2 = O17574792317020433029.n(resources, theme, attributeSet, Y582199805280922215.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = n2.getString(0);
                        if (string2 != null) {
                            h12107640128773434115.b = string2;
                        }
                        String string3 = n2.getString(2);
                        if (string3 != null) {
                            h12107640128773434115.a = T18016951143603335921.C(string3);
                        }
                        h12107640128773434115.f = O17574792317020433029.j(n2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = h12107640128773434115.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = n2.getFloat(12, f3);
                        }
                        h12107640128773434115.h = f3;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? n2.getInt(8, -1) : -1;
                        h12107640128773434115.l = i10 != 0 ? i10 != 1 ? i10 != 2 ? h12107640128773434115.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? n2.getInt(9, -1) : -1;
                        h12107640128773434115.m = i11 != 0 ? i11 != 1 ? i11 != 2 ? h12107640128773434115.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = h12107640128773434115.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = n2.getFloat(10, f4);
                        }
                        h12107640128773434115.n = f4;
                        h12107640128773434115.d = O17574792317020433029.j(n2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = h12107640128773434115.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = n2.getFloat(11, f5);
                        }
                        h12107640128773434115.g = f5;
                        float f6 = h12107640128773434115.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = n2.getFloat(4, f6);
                        }
                        h12107640128773434115.e = f6;
                        float f7 = h12107640128773434115.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = n2.getFloat(6, f7);
                        }
                        h12107640128773434115.j = f7;
                        float f8 = h12107640128773434115.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = n2.getFloat(7, f8);
                        }
                        h12107640128773434115.k = f8;
                        float f9 = h12107640128773434115.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = n2.getFloat(5, f9);
                        }
                        h12107640128773434115.i = f9;
                        int i12 = h12107640128773434115.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i12 = n2.getInt(13, i12);
                        }
                        h12107640128773434115.c = i12;
                    }
                    n2.recycle();
                    w136674199667419790842.b.add(h12107640128773434115);
                    if (h12107640128773434115.getPathName() != null) {
                        o827298036535440209.put(h12107640128773434115.getPathName(), h12107640128773434115);
                    }
                    u26224880990093319683.a = u26224880990093319683.a;
                    i4 = 1;
                    z2 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        T11122899614028670287 t11122899614028670287 = new T11122899614028670287();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray n3 = O17574792317020433029.n(resources, theme, attributeSet, Y582199805280922215.d);
                            String string4 = n3.getString(0);
                            if (string4 != null) {
                                t11122899614028670287.b = string4;
                            }
                            String string5 = n3.getString(1);
                            if (string5 != null) {
                                t11122899614028670287.a = T18016951143603335921.C(string5);
                            }
                            t11122899614028670287.c = !O17574792317020433029.l(xmlPullParser, "fillType") ? 0 : n3.getInt(2, 0);
                            n3.recycle();
                        }
                        w136674199667419790842.b.add(t11122899614028670287);
                        if (t11122899614028670287.getPathName() != null) {
                            o827298036535440209.put(t11122899614028670287.getPathName(), t11122899614028670287);
                        }
                        u26224880990093319683.a = u26224880990093319683.a;
                    } else if ("group".equals(name)) {
                        W13667419966741979084 w136674199667419790843 = new W13667419966741979084();
                        TypedArray n4 = O17574792317020433029.n(resources, theme, attributeSet, Y582199805280922215.b);
                        float f10 = w136674199667419790843.c;
                        if (O17574792317020433029.l(xmlPullParser, "rotation")) {
                            f10 = n4.getFloat(5, f10);
                        }
                        w136674199667419790843.c = f10;
                        i4 = 1;
                        w136674199667419790843.d = n4.getFloat(1, w136674199667419790843.d);
                        w136674199667419790843.e = n4.getFloat(2, w136674199667419790843.e);
                        float f11 = w136674199667419790843.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = n4.getFloat(3, f11);
                        }
                        w136674199667419790843.f = f11;
                        float f12 = w136674199667419790843.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = n4.getFloat(4, f12);
                        }
                        w136674199667419790843.g = f12;
                        float f13 = w136674199667419790843.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = n4.getFloat(6, f13);
                        }
                        w136674199667419790843.h = f13;
                        float f14 = w136674199667419790843.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = n4.getFloat(7, f14);
                        }
                        w136674199667419790843.i = f14;
                        String string6 = n4.getString(0);
                        if (string6 != null) {
                            w136674199667419790843.k = string6;
                        }
                        w136674199667419790843.c();
                        n4.recycle();
                        w136674199667419790842.b.add(w136674199667419790843);
                        arrayDeque.push(w136674199667419790843);
                        if (w136674199667419790843.getGroupName() != null) {
                            o827298036535440209.put(w136674199667419790843.getGroupName(), w136674199667419790843);
                        }
                        u26224880990093319683.a = u26224880990093319683.a;
                    }
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i9 = i3;
            depth = i;
            i8 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.c = a(u2622488099009331968.c, u2622488099009331968.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        U2622488099009331968 u2622488099009331968 = this.b;
        if (u2622488099009331968 == null) {
            return false;
        }
        E10821722077969840898 e10821722077969840898 = u2622488099009331968.b;
        Boolean bool = e10821722077969840898.n;
        if (bool == null) {
            bool = Boolean.valueOf(e10821722077969840898.g.a());
            e10821722077969840898.n = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            U2622488099009331968 u2622488099009331968 = this.b;
            U2622488099009331968 u26224880990093319682 = new U2622488099009331968();
            u26224880990093319682.c = null;
            u26224880990093319682.d = j;
            if (u2622488099009331968 != null) {
                u26224880990093319682.a = u2622488099009331968.a;
                E10821722077969840898 e10821722077969840898 = new E10821722077969840898(u2622488099009331968.b);
                u26224880990093319682.b = e10821722077969840898;
                if (u2622488099009331968.b.e != null) {
                    e10821722077969840898.e = new Paint(u2622488099009331968.b.e);
                }
                if (u2622488099009331968.b.d != null) {
                    u26224880990093319682.b.d = new Paint(u2622488099009331968.b.d);
                }
                u26224880990093319682.c = u2622488099009331968.c;
                u26224880990093319682.d = u2622488099009331968.d;
                u26224880990093319682.e = u2622488099009331968.e;
            }
            this.b = u26224880990093319682;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        U2622488099009331968 u2622488099009331968 = this.b;
        ColorStateList colorStateList = u2622488099009331968.c;
        if (colorStateList == null || (mode = u2622488099009331968.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        E10821722077969840898 e10821722077969840898 = u2622488099009331968.b;
        Boolean bool = e10821722077969840898.n;
        if (bool == null) {
            bool = Boolean.valueOf(e10821722077969840898.g.a());
            e10821722077969840898.n = bool;
        }
        if (bool.booleanValue()) {
            boolean b = u2622488099009331968.b.g.b(iArr);
            u2622488099009331968.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        U2622488099009331968 u2622488099009331968 = this.b;
        if (u2622488099009331968.c != colorStateList) {
            u2622488099009331968.c = colorStateList;
            this.c = a(colorStateList, u2622488099009331968.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        U2622488099009331968 u2622488099009331968 = this.b;
        if (u2622488099009331968.d != mode) {
            u2622488099009331968.d = mode;
            this.c = a(u2622488099009331968.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public R14609119592937689706(U2622488099009331968 u2622488099009331968) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = u2622488099009331968;
        this.c = a(u2622488099009331968.c, u2622488099009331968.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
