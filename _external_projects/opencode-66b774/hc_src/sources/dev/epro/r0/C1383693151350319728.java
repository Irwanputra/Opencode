package dev.epro.r0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C1383693151350319728 implements Y257452374762370649 {
    public static final AtomicBoolean J = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final G3509037795884611271 b;
    public final N16536369055082677148 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public R3103059035698929241 l;
    public float m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public long f182o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public C1383693151350319728(S7974369370986781936 s7974369370986781936, G3509037795884611271 g3509037795884611271, N16536369055082677148 n16536369055082677148) {
        this.b = g3509037795884611271;
        this.c = n16536369055082677148;
        RenderNode create = RenderNode.create("Compose", s7974369370986781936);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (J.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                B5116976444210178028.c(create, B5116976444210178028.a(create));
                B5116976444210178028.d(create, B5116976444210178028.b(create));
            }
            N10395685405522556971.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        P(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.f182o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = U10174709222559481877.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            B5116976444210178028.d(this.d, J8045362843799184672.u0(j));
        }
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void B(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final Matrix C() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float D() {
        return this.x;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void E(float f) {
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float F() {
        return this.t;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final boolean G() {
        return this.d.isValid();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float H() {
        return this.q;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void I(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float J() {
        return this.y;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final int K() {
        return this.k;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void L(long j) {
        this.f182o = j;
        R();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final long M() {
        return this.u;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void N(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902, B9692660393722135472 b9692660393722135472, J3227772737003951788 j3227772737003951788) {
        DisplayListCanvas displayListCanvas;
        U5519500298982620611 u5519500298982620611;
        Canvas canvas;
        DisplayListCanvas displayListCanvas2;
        R8540738700654750557 C;
        F10342546226345611902 E;
        V1715405128288489768 A;
        Canvas canvas2;
        long F;
        B9692660393722135472 b96926603937221354722;
        long j;
        int i;
        int i2;
        N16536369055082677148 n16536369055082677148 = this.c;
        Q7316561721656982910 q7316561721656982910 = n16536369055082677148.b;
        DisplayListCanvas start = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f = this.B;
        float f2 = this.C;
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            u5519500298982620611 = this.b.a;
            canvas = u5519500298982620611.a;
            u5519500298982620611.a = (Canvas) start;
        } catch (Throwable th) {
            th = th;
            displayListCanvas = start;
        }
        try {
            try {
                if (this.B <= 0.0f) {
                    try {
                        if (this.C <= 0.0f) {
                            long Q = I3887072968740112330.Q(this.e);
                            C = q7316561721656982910.C();
                            E = q7316561721656982910.E();
                            A = q7316561721656982910.A();
                            canvas2 = canvas;
                            F = q7316561721656982910.F();
                            displayListCanvas2 = start;
                            b96926603937221354722 = (B9692660393722135472) q7316561721656982910.c;
                            q7316561721656982910.M(r8540738700654750557);
                            q7316561721656982910.O(f10342546226345611902);
                            q7316561721656982910.L(u5519500298982620611);
                            q7316561721656982910.P(Q);
                            q7316561721656982910.c = b9692660393722135472;
                            u5519500298982620611.l();
                            try {
                                j3227772737003951788.invoke(n16536369055082677148);
                                u5519500298982620611.a = canvas2;
                                this.d.end(displayListCanvas2);
                                return;
                            } finally {
                                u5519500298982620611.j();
                                q7316561721656982910.M(C);
                                q7316561721656982910.O(E);
                                q7316561721656982910.L(A);
                                q7316561721656982910.P(F);
                                q7316561721656982910.c = b96926603937221354722;
                            }
                        }
                        displayListCanvas2 = start;
                        j = 4294967295L;
                        canvas2 = canvas;
                    } catch (Throwable th2) {
                        th = th2;
                        displayListCanvas2 = start;
                        displayListCanvas = displayListCanvas2;
                        this.d.end(displayListCanvas);
                        throw th;
                    }
                } else {
                    displayListCanvas2 = start;
                    canvas2 = canvas;
                    j = 4294967295L;
                }
                j3227772737003951788.invoke(n16536369055082677148);
                u5519500298982620611.j();
                q7316561721656982910.M(C);
                q7316561721656982910.O(E);
                q7316561721656982910.L(A);
                q7316561721656982910.P(F);
                q7316561721656982910.c = b96926603937221354722;
                u5519500298982620611.i(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                u5519500298982620611.a = canvas2;
                this.d.end(displayListCanvas2);
                return;
            } catch (Throwable th3) {
                displayListCanvas = displayListCanvas2;
                try {
                    throw th3;
                } catch (Throwable th4) {
                    th = th4;
                    this.d.end(displayListCanvas);
                    throw th;
                }
            }
            i = (int) (floatToRawIntBits >> 32);
            i2 = (int) (floatToRawIntBits & j);
            u5519500298982620611.i(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            long Q2 = I3887072968740112330.Q(this.e);
            C = q7316561721656982910.C();
            E = q7316561721656982910.E();
            A = q7316561721656982910.A();
            F = q7316561721656982910.F();
            b96926603937221354722 = (B9692660393722135472) q7316561721656982910.c;
            q7316561721656982910.M(r8540738700654750557);
            q7316561721656982910.O(f10342546226345611902);
            q7316561721656982910.L(u5519500298982620611);
            q7316561721656982910.P(Q2);
            q7316561721656982910.c = b9692660393722135472;
            u5519500298982620611.l();
        } catch (Throwable th5) {
            th = th5;
            displayListCanvas = displayListCanvas2;
            this.d.end(displayListCanvas);
            throw th;
        }
    }

    public final void O() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void P(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            P(i);
        } else {
            P(1);
        }
    }

    public final void R() {
        long j = this.f182o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.f182o & 4294967295L)) + this.C);
        }
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float a() {
        return this.m;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void b(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void c(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float d() {
        return this.p;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void e(float f) {
        this.t = f;
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
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float g() {
        return this.s;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void h(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void i(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final long j() {
        return this.v;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void k(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            B5116976444210178028.c(this.d, J8045362843799184672.u0(j));
        }
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void l(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        O();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void m(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void n(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(K5751602218013079365.j0(i)));
        Q();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void o(V1715405128288489768 v1715405128288489768) {
        Canvas canvas = R14166932666867597588.a;
        DisplayListCanvas displayListCanvas = ((U5519500298982620611) v1715405128288489768).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float p() {
        return this.z;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void q() {
        N10395685405522556971.a(this.d);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void r(int i, long j, int i2) {
        this.H = i;
        this.I = i2;
        boolean a = Q13254524308163418711.a(this.e, j);
        this.e = j;
        S();
        if (a) {
            return;
        }
        if (this.n || L2216691091636065972.b(this.f182o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float s() {
        return this.r;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void t(boolean z) {
        this.A = z;
        O();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final int u() {
        return this.j;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void v(R3103059035698929241 r3103059035698929241) {
        this.l = r3103059035698929241;
        if (r3103059035698929241 == null) {
            Q();
            return;
        }
        P(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(r3103059035698929241.a);
        renderNode.setLayerPaint(paint);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float w() {
        return this.w;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final R3103059035698929241 x() {
        return this.l;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void y(int i) {
        this.j = i;
        Q();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void z(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }
}
