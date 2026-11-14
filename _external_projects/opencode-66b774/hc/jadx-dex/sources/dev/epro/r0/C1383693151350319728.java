package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C1383693151350319728 implements dev.epro.r0.Y257452374762370649 {
    public static final java.util.concurrent.atomic.AtomicBoolean J = new java.util.concurrent.atomic.AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final dev.epro.r0.G3509037795884611271 b;
    public final dev.epro.r0.N16536369055082677148 c;
    public final android.view.RenderNode d;
    public long e;
    public android.graphics.Paint f;
    public android.graphics.Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public dev.epro.r0.R3103059035698929241 l;
    public float m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
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

    public C1383693151350319728(dev.epro.r0.S7974369370986781936 s7974369370986781936, dev.epro.r0.G3509037795884611271 g3509037795884611271, dev.epro.r0.N16536369055082677148 n16536369055082677148) {
        this.b = g3509037795884611271;
        this.c = n16536369055082677148;
        android.view.RenderNode renderNodeCreate = android.view.RenderNode.create("Compose", s7974369370986781936);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (J.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                dev.epro.r0.B5116976444210178028.c(renderNodeCreate, dev.epro.r0.B5116976444210178028.a(renderNodeCreate));
                dev.epro.r0.B5116976444210178028.d(renderNodeCreate, dev.epro.r0.B5116976444210178028.b(renderNodeCreate));
            }
            dev.epro.r0.N10395685405522556971.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        P(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.f182o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = dev.epro.r0.U10174709222559481877.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    public final void A(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            dev.epro.r0.B5116976444210178028.d(this.d, dev.epro.r0.J8045362843799184672.u0(j));
        }
    }

    public final void B(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    public final android.graphics.Matrix C() {
        android.graphics.Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    public final float D() {
        return this.x;
    }

    public final void E(float f) {
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    public final float F() {
        return this.t;
    }

    public final boolean G() {
        return this.d.isValid();
    }

    public final float H() {
        return this.q;
    }

    public final void I(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    public final float J() {
        return this.y;
    }

    public final int K() {
        return this.k;
    }

    public final void L(long j) {
        this.f182o = j;
        R();
    }

    public final long M() {
        return this.u;
    }

    public final void N(dev.epro.r0.R8540738700654750557 r8540738700654750557, dev.epro.r0.F10342546226345611902 f10342546226345611902, dev.epro.r0.B9692660393722135472 b9692660393722135472, dev.epro.r0.J3227772737003951788 j3227772737003951788) throws java.lang.Throwable {
        android.view.DisplayListCanvas displayListCanvas;
        dev.epro.r0.U5519500298982620611 u5519500298982620611;
        android.graphics.Canvas canvas;
        android.view.DisplayListCanvas displayListCanvas2;
        dev.epro.r0.R8540738700654750557 r8540738700654750557C;
        dev.epro.r0.F10342546226345611902 f10342546226345611902E;
        dev.epro.r0.V1715405128288489768 v1715405128288489768A;
        android.graphics.Canvas canvas2;
        long jF;
        dev.epro.r0.B9692660393722135472 b96926603937221354722;
        long j;
        int i;
        int i2;
        dev.epro.r0.N16536369055082677148 n16536369055082677148 = this.c;
        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = n16536369055082677148.b;
        android.view.DisplayListCanvas displayListCanvasStart = this.d.start(java.lang.Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), java.lang.Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f = this.B;
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(this.C)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
        try {
            u5519500298982620611 = this.b.a;
            canvas = u5519500298982620611.a;
            u5519500298982620611.a = (android.graphics.Canvas) displayListCanvasStart;
        } catch (java.lang.Throwable th) {
            th = th;
            displayListCanvas = displayListCanvasStart;
        }
        try {
        } catch (java.lang.Throwable th2) {
            th = th2;
            displayListCanvas = displayListCanvas2;
            this.d.end(displayListCanvas);
            throw th;
        }
        try {
            if (this.B <= 0.0f) {
                try {
                    if (this.C <= 0.0f) {
                        long jQ = dev.epro.r0.I3887072968740112330.Q(this.e);
                        r8540738700654750557C = q7316561721656982910.C();
                        f10342546226345611902E = q7316561721656982910.E();
                        v1715405128288489768A = q7316561721656982910.A();
                        canvas2 = canvas;
                        jF = q7316561721656982910.F();
                        displayListCanvas2 = displayListCanvasStart;
                        b96926603937221354722 = (dev.epro.r0.B9692660393722135472) q7316561721656982910.c;
                        q7316561721656982910.M(r8540738700654750557);
                        q7316561721656982910.O(f10342546226345611902);
                        q7316561721656982910.L(u5519500298982620611);
                        q7316561721656982910.P(jQ);
                        q7316561721656982910.c = b9692660393722135472;
                        u5519500298982620611.l();
                        try {
                            j3227772737003951788.invoke(n16536369055082677148);
                            u5519500298982620611.a = canvas2;
                            this.d.end(displayListCanvas2);
                            return;
                        } finally {
                            u5519500298982620611.j();
                            q7316561721656982910.M(r8540738700654750557C);
                            q7316561721656982910.O(f10342546226345611902E);
                            q7316561721656982910.L(v1715405128288489768A);
                            q7316561721656982910.P(jF);
                            q7316561721656982910.c = b96926603937221354722;
                        }
                    }
                    displayListCanvas2 = displayListCanvasStart;
                    j = 4294967295L;
                    canvas2 = canvas;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    displayListCanvas2 = displayListCanvasStart;
                    displayListCanvas = displayListCanvas2;
                }
                this.d.end(displayListCanvas);
                throw th;
            }
            displayListCanvas2 = displayListCanvasStart;
            canvas2 = canvas;
            j = 4294967295L;
            j3227772737003951788.invoke(n16536369055082677148);
            u5519500298982620611.j();
            q7316561721656982910.M(r8540738700654750557C);
            q7316561721656982910.O(f10342546226345611902E);
            q7316561721656982910.L(v1715405128288489768A);
            q7316561721656982910.P(jF);
            q7316561721656982910.c = b96926603937221354722;
            u5519500298982620611.i(-java.lang.Float.intBitsToFloat(i), -java.lang.Float.intBitsToFloat(i2));
            u5519500298982620611.a = canvas2;
            this.d.end(displayListCanvas2);
            return;
        } catch (java.lang.Throwable th4) {
            displayListCanvas = displayListCanvas2;
            try {
                throw th4;
            } catch (java.lang.Throwable th5) {
                th = th5;
            }
        }
        i = (int) (jFloatToRawIntBits >> 32);
        i2 = (int) (jFloatToRawIntBits & j);
        u5519500298982620611.i(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2));
        long jQ2 = dev.epro.r0.I3887072968740112330.Q(this.e);
        r8540738700654750557C = q7316561721656982910.C();
        f10342546226345611902E = q7316561721656982910.E();
        v1715405128288489768A = q7316561721656982910.A();
        jF = q7316561721656982910.F();
        b96926603937221354722 = (dev.epro.r0.B9692660393722135472) q7316561721656982910.c;
        q7316561721656982910.M(r8540738700654750557);
        q7316561721656982910.O(f10342546226345611902);
        q7316561721656982910.L(u5519500298982620611);
        q7316561721656982910.P(jQ2);
        q7316561721656982910.c = b9692660393722135472;
        u5519500298982620611.l();
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
        android.view.RenderNode renderNode = this.d;
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
            this.d.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(java.lang.Float.intBitsToFloat((int) (this.f182o & 4294967295L)) + this.C);
        }
    }

    public final void S() {
        android.view.RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    public final float a() {
        return this.m;
    }

    public final void b(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    public final void c(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    public final float d() {
        return this.p;
    }

    public final void e(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    public final void f(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            sbP.append(i3);
            sbP.append(", Bottom: ");
            sbP.append(i4);
            dev.epro.r0.U6129583139759812404.a(sbP.toString());
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

    public final float g() {
        return this.s;
    }

    public final void h(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    public final void i(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    public final long j() {
        return this.v;
    }

    public final void k(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            dev.epro.r0.B5116976444210178028.c(this.d, dev.epro.r0.J8045362843799184672.u0(j));
        }
    }

    public final void l(android.graphics.Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        O();
    }

    public final void m(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    public final void n(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        android.graphics.Paint paint = this.f;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.f = paint;
        }
        paint.setXfermode(new android.graphics.PorterDuffXfermode(dev.epro.r0.K5751602218013079365.j0(i)));
        Q();
    }

    public final void o(dev.epro.r0.V1715405128288489768 v1715405128288489768) {
        android.graphics.Canvas canvas = dev.epro.r0.R14166932666867597588.a;
        android.view.DisplayListCanvas displayListCanvas = ((dev.epro.r0.U5519500298982620611) v1715405128288489768).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    public final float p() {
        return this.z;
    }

    public final void q() {
        dev.epro.r0.N10395685405522556971.a(this.d);
    }

    public final void r(int i, long j, int i2) {
        this.H = i;
        this.I = i2;
        boolean zA = dev.epro.r0.Q13254524308163418711.a(this.e, j);
        this.e = j;
        S();
        if (zA) {
            return;
        }
        if (this.n || dev.epro.r0.L2216691091636065972.b(this.f182o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    public final float s() {
        return this.r;
    }

    public final void t(boolean z) {
        this.A = z;
        O();
    }

    public final int u() {
        return this.j;
    }

    public final void v(dev.epro.r0.R3103059035698929241 r3103059035698929241) {
        this.l = r3103059035698929241;
        if (r3103059035698929241 == null) {
            Q();
            return;
        }
        P(1);
        android.view.RenderNode renderNode = this.d;
        android.graphics.Paint paint = this.f;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.f = paint;
        }
        paint.setColorFilter(r3103059035698929241.a);
        renderNode.setLayerPaint(paint);
    }

    public final float w() {
        return this.w;
    }

    public final dev.epro.r0.R3103059035698929241 x() {
        return this.l;
    }

    public final void y(int i) {
        this.j = i;
        Q();
    }

    public final void z(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }
}
