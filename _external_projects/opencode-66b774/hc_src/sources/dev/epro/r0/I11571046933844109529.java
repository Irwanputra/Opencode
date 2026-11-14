package dev.epro.r0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I11571046933844109529 extends Drawable implements G1431963772438413962 {
    public static final Paint E;
    public static final E4533293250206292098[] F;
    public final X8048304920543391717[] A;
    public float[] B;
    public float[] C;
    public L4980660535418402690 D;
    public final T6085905021688082777 a;
    public G8524789311406442313 b;
    public final F12589017238560935108[] c;
    public final F12589017238560935108[] d;
    public final BitSet e;
    public boolean f;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f282o;
    public final Paint p;
    public final C9031148265500358222 q;
    public final T6085905021688082777 r;
    public final E1005111105761972824 s;
    public PorterDuffColorFilter t;
    public PorterDuffColorFilter u;
    public final RectF v;
    public final boolean w;
    public boolean x;
    public A11042752882447342413 y;
    public Y16108220161693303283 z;

    static {
        Paint paint = new Paint(1);
        E = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        F = new E4533293250206292098[4];
        int i = 0;
        while (true) {
            E4533293250206292098[] e4533293250206292098Arr = F;
            if (i >= e4533293250206292098Arr.length) {
                return;
            }
            e4533293250206292098Arr[i] = new E4533293250206292098(i);
            i++;
        }
    }

    public I11571046933844109529(G8524789311406442313 g8524789311406442313) {
        this.a = new T6085905021688082777(this);
        this.c = new F12589017238560935108[4];
        this.d = new F12589017238560935108[4];
        this.e = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.f282o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new C9031148265500358222();
        this.s = E1005111105761972824.h();
        this.v = new RectF();
        this.w = true;
        this.x = true;
        this.A = new X8048304920543391717[4];
        this.b = g8524789311406442313;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        n();
        l(getState());
        this.r = new T6085905021688082777(this);
    }

    public final void a(RectF rectF, Path path) {
        this.s.a(this.b.a.c(), this.B, this.b.i, rectF, this.r, path);
        if (this.b.h != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.b.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.v, true);
    }

    public final float b(RectF rectF, A11042752882447342413 a11042752882447342413, float[] fArr) {
        if (fArr == null) {
            if (a11042752882447342413.h(rectF)) {
                return a11042752882447342413.e.a(rectF);
            }
            return -1.0f;
        }
        if (this.x) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int c(int i) {
        int i2;
        G8524789311406442313 g8524789311406442313 = this.b;
        float f = g8524789311406442313.m + 0.0f + g8524789311406442313.l;
        K1968397570448307835 k1968397570448307835 = g8524789311406442313.b;
        if (k1968397570448307835 == null || !k1968397570448307835.a || E7030189496516270437.d(i, 255) != k1968397570448307835.d) {
            return i;
        }
        float min = (k1968397570448307835.e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int F2 = E12775674050813925581.F(min, E7030189496516270437.d(i, 255), k1968397570448307835.b);
        if (min > 0.0f && (i2 = k1968397570448307835.c) != 0) {
            F2 = E7030189496516270437.b(E7030189496516270437.d(i2, K1968397570448307835.f), F2);
        }
        return E7030189496516270437.d(F2, alpha);
    }

    public final void d(Canvas canvas) {
        this.e.cardinality();
        int i = this.b.f259o;
        Path path = this.i;
        C9031148265500358222 c9031148265500358222 = this.q;
        if (i != 0) {
            canvas.drawPath(path, c9031148265500358222.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            F12589017238560935108 f12589017238560935108 = this.c[i2];
            int i3 = this.b.n;
            Matrix matrix = F12589017238560935108.b;
            f12589017238560935108.a(matrix, c9031148265500358222, i3, canvas);
            this.d[i2].a(matrix, c9031148265500358222, this.b.n, canvas);
        }
        if (this.w) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.b.f259o);
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * this.b.f259o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, E);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r26) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I11571046933844109529.draw(android.graphics.Canvas):void");
    }

    public final RectF e() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    public final float f() {
        if (h()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean g() {
        G8524789311406442313 g8524789311406442313 = this.b;
        g8524789311406442313.getClass();
        return g8524789311406442313.n > 0 && !i() && !this.i.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.b.getClass();
        RectF e = e();
        if (e.isEmpty()) {
            return;
        }
        float b = b(e, this.b.a.c(), this.B);
        if (b >= 0.0f) {
            outline.setRoundRect(getBounds(), b * this.b.i);
            return;
        }
        boolean z = this.f;
        Path path = this.i;
        if (z) {
            a(e, path);
            this.f = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            D425514333760445387.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                B12886818866954629718.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            B12886818866954629718.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF e = e();
        Path path = this.i;
        a(e, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.b.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    public final boolean i() {
        if (this.b.a.b(getState()).h(e())) {
            return this.B == null || this.x;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.b.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.b.getClass();
        ColorStateList colorStateList2 = this.b.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.b.c;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.b.a.d();
    }

    public final void j(Y16108220161693303283 y16108220161693303283) {
        if (this.z == y16108220161693303283) {
            return;
        }
        this.z = y16108220161693303283;
        int i = 0;
        while (true) {
            X8048304920543391717[] x8048304920543391717Arr = this.A;
            if (i >= x8048304920543391717Arr.length) {
                m(getState(), true);
                invalidateSelf();
                return;
            }
            if (x8048304920543391717Arr[i] == null) {
                x8048304920543391717Arr[i] = new X8048304920543391717(this, F[i]);
            }
            X8048304920543391717 x8048304920543391717 = x8048304920543391717Arr[i];
            Y16108220161693303283 y161082201616933032832 = new Y16108220161693303283();
            float f = (float) y16108220161693303283.b;
            if (f < 0.0f) {
                S10973172697741180971.j("Damping ratio must be non-negative");
                return;
            }
            y161082201616933032832.b = f;
            y161082201616933032832.c = false;
            double d = y16108220161693303283.a;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                S10973172697741180971.j("Spring stiffness constant must be positive.");
                return;
            }
            y161082201616933032832.a = Math.sqrt(f2);
            y161082201616933032832.c = false;
            x8048304920543391717.j = y161082201616933032832;
            i++;
        }
    }

    public final void k(I9906786506247477813 i9906786506247477813) {
        if (i9906786506247477813 instanceof A11042752882447342413) {
            setShapeAppearanceModel((A11042752882447342413) i9906786506247477813);
            return;
        }
        R3555377658195931925 r3555377658195931925 = (R3555377658195931925) i9906786506247477813;
        G8524789311406442313 g8524789311406442313 = this.b;
        if (g8524789311406442313.a != r3555377658195931925) {
            g8524789311406442313.a = r3555377658195931925;
            m(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean l(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.b.c == null || color2 == (colorForState2 = this.b.c.getColorForState(iArr, (color2 = (paint2 = this.f282o).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.b.d == null || color == (colorForState = this.b.d.getColorForState(iArr, (color = (paint = this.p).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Type inference failed for: r1v37, types: [dev.epro.r0.Y15734533472299678773, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int[] r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I11571046933844109529.m(int[], boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        G8524789311406442313 g8524789311406442313 = this.b;
        G8524789311406442313 g85247893114064423132 = new G8524789311406442313();
        g85247893114064423132.c = null;
        g85247893114064423132.d = null;
        g85247893114064423132.e = null;
        g85247893114064423132.f = PorterDuff.Mode.SRC_IN;
        g85247893114064423132.g = null;
        g85247893114064423132.h = 1.0f;
        g85247893114064423132.i = 1.0f;
        g85247893114064423132.k = 255;
        g85247893114064423132.l = 0.0f;
        g85247893114064423132.m = 0.0f;
        g85247893114064423132.n = 0;
        g85247893114064423132.f259o = 0;
        g85247893114064423132.p = Paint.Style.FILL_AND_STROKE;
        g85247893114064423132.a = g8524789311406442313.a;
        g85247893114064423132.b = g8524789311406442313.b;
        g85247893114064423132.j = g8524789311406442313.j;
        g85247893114064423132.c = g8524789311406442313.c;
        g85247893114064423132.d = g8524789311406442313.d;
        g85247893114064423132.f = g8524789311406442313.f;
        g85247893114064423132.e = g8524789311406442313.e;
        g85247893114064423132.k = g8524789311406442313.k;
        g85247893114064423132.h = g8524789311406442313.h;
        g85247893114064423132.f259o = g8524789311406442313.f259o;
        g85247893114064423132.i = g8524789311406442313.i;
        g85247893114064423132.l = g8524789311406442313.l;
        g85247893114064423132.m = g8524789311406442313.m;
        g85247893114064423132.n = g8524789311406442313.n;
        g85247893114064423132.p = g8524789311406442313.p;
        Rect rect = g8524789311406442313.g;
        if (rect != null) {
            g85247893114064423132.g = new Rect(rect);
        }
        this.b = g85247893114064423132;
        return this;
    }

    public final boolean n() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.u;
        G8524789311406442313 g8524789311406442313 = this.b;
        ColorStateList colorStateList = g8524789311406442313.e;
        PorterDuff.Mode mode = g8524789311406442313.f;
        if (colorStateList == null || mode == null) {
            int color = this.f282o.getColor();
            int c = c(color);
            porterDuffColorFilter = c != color ? new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.t = porterDuffColorFilter;
        this.b.getClass();
        this.u = null;
        this.b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.t) && Objects.equals(porterDuffColorFilter3, this.u)) ? false : true;
    }

    public final void o() {
        G8524789311406442313 g8524789311406442313 = this.b;
        float f = g8524789311406442313.m + 0.0f;
        g8524789311406442313.n = (int) Math.ceil(0.75f * f);
        this.b.f259o = (int) Math.ceil(f * 0.25f);
        n();
        if (g() || !i()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        if (!this.b.a.d() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        X8048304920543391717[] x8048304920543391717Arr = this.A;
        int length = x8048304920543391717Arr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                X8048304920543391717 x8048304920543391717 = x8048304920543391717Arr[i];
                if (x8048304920543391717 != null && x8048304920543391717.e) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        m(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.b.a.d()) {
            m(iArr, false);
        }
        boolean z = l(iArr) || n();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        G8524789311406442313 g8524789311406442313 = this.b;
        if (g8524789311406442313.k != i) {
            g8524789311406442313.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // dev.epro.r0.G1431963772438413962
    public final void setShapeAppearanceModel(A11042752882447342413 a11042752882447342413) {
        this.b.a = a11042752882447342413;
        this.B = null;
        this.C = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.b.e = colorStateList;
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        G8524789311406442313 g8524789311406442313 = this.b;
        if (g8524789311406442313.f != mode) {
            g8524789311406442313.f = mode;
            n();
            super.invalidateSelf();
        }
    }

    public I11571046933844109529(I9906786506247477813 i9906786506247477813) {
        this(new G8524789311406442313(i9906786506247477813));
    }

    public I11571046933844109529(A11042752882447342413 a11042752882447342413) {
        this(new G8524789311406442313(a11042752882447342413));
    }
}
