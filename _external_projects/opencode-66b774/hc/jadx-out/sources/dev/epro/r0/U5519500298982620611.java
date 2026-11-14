package dev.epro.r0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U5519500298982620611 implements V1715405128288489768 {
    public Canvas a = R14166932666867597588.a;
    public Rect b;
    public Rect c;

    @Override // dev.epro.r0.V1715405128288489768
    public final void a(S6349823729575121924 s6349823729575121924, O3228356295430981133 o3228356295430981133) {
        this.a.saveLayer(s6349823729575121924.a, s6349823729575121924.b, s6349823729575121924.c, s6349823729575121924.d, (Paint) o3228356295430981133.b, 31);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void b(B1061516154492673368 b1061516154492673368) {
        Canvas canvas = this.a;
        if (b1061516154492673368 instanceof B1061516154492673368) {
            canvas.clipPath(b1061516154492673368.a, Region.Op.INTERSECT);
        } else {
            D11988991656201568495.j("Unable to obtain android.graphics.Path");
        }
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void c(float f, float f2, float f3, float f4, float f5, float f6, boolean z, O3228356295430981133 o3228356295430981133) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, z, (Paint) o3228356295430981133.b);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void d(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void e(F2238012860950049442 f2238012860950049442, long j, long j2, long j3, O3228356295430981133 o3228356295430981133) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapU = S2941385686793915703.u(f2238012860950049442);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapU, rect, rect2, (Paint) o3228356295430981133.b);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void f(float f) {
        this.a.rotate(f);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void g(long j, long j2, O3228356295430981133 o3228356295430981133) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) o3228356295430981133.b);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void h(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void i(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void j() {
        this.a.restore();
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void k(float f, float f2, float f3, float f4, O3228356295430981133 o3228356295430981133) {
        this.a.drawRect(f, f2, f3, f4, E12775674050813925581.C(o3228356295430981133));
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void l() {
        this.a.save();
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void m() {
        D1286559660607336098.t(this.a, false);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void o(B1061516154492673368 b1061516154492673368, O3228356295430981133 o3228356295430981133) {
        Canvas canvas = this.a;
        if (b1061516154492673368 instanceof B1061516154492673368) {
            canvas.drawPath(b1061516154492673368.a, E12775674050813925581.C(o3228356295430981133));
        } else {
            D11988991656201568495.j("Unable to obtain android.graphics.Path");
        }
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void p(F2238012860950049442 f2238012860950049442, O3228356295430981133 o3228356295430981133) {
        this.a.drawBitmap(S2941385686793915703.u(f2238012860950049442), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) o3228356295430981133.b);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void q(float f, long j, O3228356295430981133 o3228356295430981133) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) o3228356295430981133.b);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void r(float f, float f2, float f3, float f4, float f5, float f6, O3228356295430981133 o3228356295430981133) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) o3228356295430981133.b);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void s(float[] fArr) {
        if (D1286559660607336098.w(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        Q13169198992966610970.o0(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // dev.epro.r0.V1715405128288489768
    public final void t() {
        D1286559660607336098.t(this.a, true);
    }
}
