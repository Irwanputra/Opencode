package dev.epro.r0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U14221849108151894556 implements Y257452374762370649 {
    public static final O268798612179685348 H = new O268798612179685348();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final I9570621155112813784 b;
    public final G3509037795884611271 c;
    public final I2814787646979818974 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public R3103059035698929241 f518o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public U14221849108151894556(I9570621155112813784 i9570621155112813784) {
        G3509037795884611271 g3509037795884611271 = new G3509037795884611271();
        N16536369055082677148 n16536369055082677148 = new N16536369055082677148();
        this.b = i9570621155112813784;
        this.c = g3509037795884611271;
        I2814787646979818974 i2814787646979818974 = new I2814787646979818974(i9570621155112813784, g3509037795884611271, n16536369055082677148);
        this.d = i2814787646979818974;
        this.e = i9570621155112813784.getResources();
        this.f = new Rect();
        i9570621155112813784.addView(i2814787646979818974);
        i2814787646979818974.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = U10174709222559481877.b;
        this.y = j;
        this.z = j;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j;
            this.d.setOutlineSpotShadowColor(J8045362843799184672.u0(j));
        }
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void B(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final Matrix C() {
        return this.d.getMatrix();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float D() {
        return this.B;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void E(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float F() {
        return this.x;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float H() {
        return this.u;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void I(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float J() {
        return this.C;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final int K() {
        return this.n;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void L(long j) {
        this.s = j;
        this.r = (j & 9223372034707292159L) == 9205357640488583168L;
        R();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final long M() {
        return this.y;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void N(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902, B9692660393722135472 b9692660393722135472, J3227772737003951788 j3227772737003951788) {
        I2814787646979818974 i2814787646979818974 = this.d;
        ViewParent parent = i2814787646979818974.getParent();
        I9570621155112813784 i9570621155112813784 = this.b;
        if (parent == null) {
            i9570621155112813784.addView(i2814787646979818974);
        }
        float f = this.D;
        float f2 = this.E;
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        i2814787646979818974.g = r8540738700654750557;
        i2814787646979818974.h = f10342546226345611902;
        i2814787646979818974.i = j3227772737003951788;
        i2814787646979818974.j = b9692660393722135472;
        i2814787646979818974.k = intBitsToFloat;
        i2814787646979818974.l = intBitsToFloat2;
        if (i2814787646979818974.isAttachedToWindow()) {
            i2814787646979818974.setVisibility(4);
            i2814787646979818974.setVisibility(0);
            try {
                U5519500298982620611 u5519500298982620611 = this.c.a;
                O268798612179685348 o268798612179685348 = H;
                Canvas canvas = u5519500298982620611.a;
                u5519500298982620611.a = o268798612179685348;
                i9570621155112813784.a(u5519500298982620611, i2814787646979818974, i2814787646979818974.getDrawingTime());
                u5519500298982620611.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    public final void O(int i) {
        Paint paint = this.g;
        I2814787646979818974 i2814787646979818974 = this.d;
        boolean z = true;
        if (i == 1) {
            i2814787646979818974.setLayerType(2, paint);
        } else if (i == 2) {
            i2814787646979818974.setLayerType(0, paint);
            z = false;
        } else {
            i2814787646979818974.setLayerType(0, paint);
        }
        i2814787646979818974.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void P() {
        boolean z = this.m;
        I2814787646979818974 i2814787646979818974 = this.d;
        if (z || i2814787646979818974.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.D;
        int i3 = this.i;
        int i4 = i3 - this.E;
        long j = this.j;
        i2814787646979818974.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    public final void Q() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.f518o == null) {
            O(i);
        } else {
            O(1);
        }
    }

    public final void R() {
        boolean z = this.r;
        I2814787646979818974 i2814787646979818974 = this.d;
        if (z || L2216691091636065972.b(this.s, 9205357640488583168L)) {
            i2814787646979818974.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
            i2814787646979818974.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.E);
        } else {
            i2814787646979818974.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            i2814787646979818974.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + this.E);
        }
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float a() {
        return this.q;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void b(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void c(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float d() {
        return this.t;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void e(float f) {
        this.x = f;
        this.d.setElevation(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void f(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder p = E12098517352909843120.p(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            p.append(i3);
            p.append(", Bottom: ");
            p.append(i4);
            U6129583139759812404.a(p.toString());
        }
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        P();
        if (z) {
            R();
        }
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float g() {
        return this.w;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void h(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void i(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final long j() {
        return this.z;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void k(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            this.d.setOutlineAmbientShadowColor(J8045362843799184672.u0(j));
        }
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void l(Outline outline, long j) {
        I2814787646979818974 i2814787646979818974 = this.d;
        i2814787646979818974.e = outline;
        i2814787646979818974.invalidateOutline();
        if ((this.m || i2814787646979818974.getClipToOutline()) && outline != null) {
            i2814787646979818974.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void m(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void n(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(K5751602218013079365.j0(i)));
        Q();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void o(V1715405128288489768 v1715405128288489768) {
        Rect rect;
        boolean z = this.k;
        I2814787646979818974 i2814787646979818974 = this.d;
        if (z) {
            if ((this.m || i2814787646979818974.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = i2814787646979818974.getWidth();
                rect.bottom = i2814787646979818974.getHeight();
            } else {
                rect = null;
            }
            i2814787646979818974.setClipBounds(rect);
        }
        Canvas canvas = R14166932666867597588.a;
        if (((U5519500298982620611) v1715405128288489768).a.isHardwareAccelerated()) {
            this.b.a(v1715405128288489768, i2814787646979818974, i2814787646979818974.getDrawingTime());
        }
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float p() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void q() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void r(int i, long j, int i2) {
        if (!Q13254524308163418711.a(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            P();
            return;
        }
        int i3 = this.h;
        I2814787646979818974 i2814787646979818974 = this.d;
        if (i3 != i) {
            i2814787646979818974.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            i2814787646979818974.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float s() {
        return this.v;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void t(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final int u() {
        return this.p;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void v(R3103059035698929241 r3103059035698929241) {
        this.f518o = r3103059035698929241;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(r3103059035698929241 != null ? r3103059035698929241.a : null);
        Q();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float w() {
        return this.A;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final R3103059035698929241 x() {
        return this.f518o;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void y(int i) {
        this.p = i;
        Q();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void z(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }
}
