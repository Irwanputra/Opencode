package dev.epro.r0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H17422069811191965643 implements Y257452374762370649 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public final G3509037795884611271 b;
    public final N16536369055082677148 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public R3103059035698929241 k;
    public long l;
    public float m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f268o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public H17422069811191965643() {
        G3509037795884611271 g3509037795884611271 = new G3509037795884611271();
        N16536369055082677148 n16536369055082677148 = new N16536369055082677148();
        this.b = g3509037795884611271;
        this.c = n16536369055082677148;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        P(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = U10174709222559481877.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
        this.G = 0;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void A(long j) {
        this.s = j;
        this.d.setSpotShadowColor(J8045362843799184672.u0(j));
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void B(float f) {
        this.n = f;
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
        return this.u;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void E(float f) {
        this.w = f;
        this.d.setCameraDistance(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float F() {
        return this.q;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final boolean G() {
        return this.d.hasDisplayList();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float H() {
        return this.n;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void I(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float J() {
        return this.v;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final int K() {
        return this.j;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void L(long j) {
        this.l = j;
        R();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final long M() {
        return this.r;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void N(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902, B9692660393722135472 b9692660393722135472, J3227772737003951788 j3227772737003951788) {
        N16536369055082677148 n16536369055082677148 = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        float f = this.y;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.z)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            G3509037795884611271 g3509037795884611271 = this.b;
            U5519500298982620611 u5519500298982620611 = g3509037795884611271.a;
            Canvas canvas = u5519500298982620611.a;
            u5519500298982620611.a = recordingCanvasBeginRecording;
            Q7316561721656982910 q7316561721656982910 = n16536369055082677148.b;
            q7316561721656982910.M(r8540738700654750557);
            q7316561721656982910.O(f10342546226345611902);
            q7316561721656982910.c = b9692660393722135472;
            q7316561721656982910.P(this.e);
            q7316561721656982910.L(u5519500298982620611);
            if (this.y > 0.0f || this.z > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                u5519500298982620611.i(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                j3227772737003951788.invoke(n16536369055082677148);
                u5519500298982620611.i(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                j3227772737003951788.invoke(n16536369055082677148);
            }
            g3509037795884611271.a.a = canvas;
            this.d.endRecording();
        } catch (Throwable th) {
            this.d.endRecording();
            throw th;
        }
    }

    public final void O() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void P(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.G;
        if (i != 1 && this.j == 3 && this.k == null) {
            P(this.d, i);
        } else {
            P(this.d, 1);
        }
    }

    public final void R() {
        long j = this.l;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
        }
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float a() {
        return this.i;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void b(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void c(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float d() {
        return this.m;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void e(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void f(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbP = E12098517352909843120.p(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            sbP.append(i3);
            sbP.append(", Bottom: ");
            sbP.append(i4);
            U6129583139759812404.a(sbP.toString());
        }
        int i5 = this.y;
        if (i == i5 && i2 == this.z && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.z) ? false : true;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float g() {
        return this.p;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void h(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void i(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final long j() {
        return this.s;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void k(long j) {
        this.r = j;
        this.d.setAmbientShadowColor(J8045362843799184672.u0(j));
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void l(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        O();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void m(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void n(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(K5751602218013079365.g0(i));
        Q();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void o(V1715405128288489768 v1715405128288489768) {
        Canvas canvas = R14166932666867597588.a;
        ((U5519500298982620611) v1715405128288489768).a.drawRenderNode(this.d);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float p() {
        return this.w;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void q() {
        this.d.discardDisplayList();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void r(int i, long j, int i2) {
        this.E = i;
        this.F = i2;
        boolean zA = W8572396779607072172.a(this.e, I3887072968740112330.Q(j));
        this.e = I3887072968740112330.Q(j);
        S();
        if (zA || !L2216691091636065972.b(this.l, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float s() {
        return this.f268o;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void t(boolean z) {
        this.x = z;
        O();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final int u() {
        return this.G;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void v(R3103059035698929241 r3103059035698929241) {
        this.k = r3103059035698929241;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(r3103059035698929241 != null ? r3103059035698929241.a : null);
        Q();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final float w() {
        return this.t;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final R3103059035698929241 x() {
        return this.k;
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void y(int i) {
        this.G = i;
        Q();
    }

    @Override // dev.epro.r0.Y257452374762370649
    public final void z(float f) {
        this.f268o = f;
        this.d.setTranslationX(f);
    }
}
