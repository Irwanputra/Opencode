package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B1061516154492673368 {
    public final android.graphics.Path a;
    public android.graphics.RectF b;
    public float[] c;
    public android.graphics.Matrix d;

    public B1061516154492673368(android.graphics.Path path) {
        this.a = path;
    }

    public static void a(dev.epro.r0.B1061516154492673368 b1061516154492673368, dev.epro.r0.B1061516154492673368 b10615161544926733682) {
        android.graphics.Path path = b1061516154492673368.a;
        if (b10615161544926733682 instanceof dev.epro.r0.B1061516154492673368) {
            path.addPath(b10615161544926733682.a, java.lang.Float.intBitsToFloat(0), java.lang.Float.intBitsToFloat(0));
        } else {
            dev.epro.r0.D11988991656201568495.j("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(dev.epro.r0.B1061516154492673368 b1061516154492673368, dev.epro.r0.S6349823729575121924 s6349823729575121924) {
        float f = s6349823729575121924.a;
        float f2 = s6349823729575121924.d;
        float f3 = s6349823729575121924.c;
        float f4 = s6349823729575121924.b;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f4) || java.lang.Float.isNaN(f3) || java.lang.Float.isNaN(f2)) {
            dev.epro.r0.W7346099082318612118.b("Invalid rectangle, make sure no value is NaN");
        }
        android.graphics.RectF rectF = b1061516154492673368.b;
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            b1061516154492673368.b = rectF;
        }
        rectF.set(f, f4, f3, f2);
        android.graphics.Path path = b1061516154492673368.a;
        android.graphics.RectF rectF2 = b1061516154492673368.b;
        rectF2.getClass();
        path.addRect(rectF2, android.graphics.Path.Direction.CCW);
    }

    public static void c(dev.epro.r0.B1061516154492673368 b1061516154492673368, dev.epro.r0.V14120702150497747934 v14120702150497747934) {
        android.graphics.RectF rectF = b1061516154492673368.b;
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            b1061516154492673368.b = rectF;
        }
        float f = v14120702150497747934.a;
        long j = v14120702150497747934.h;
        long j2 = v14120702150497747934.g;
        long j3 = v14120702150497747934.f;
        long j4 = v14120702150497747934.e;
        rectF.set(f, v14120702150497747934.b, v14120702150497747934.c, v14120702150497747934.d);
        float[] fArr = b1061516154492673368.c;
        if (fArr == null) {
            fArr = new float[8];
            b1061516154492673368.c = fArr;
        }
        fArr[0] = java.lang.Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = java.lang.Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = java.lang.Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        android.graphics.Path path = b1061516154492673368.a;
        android.graphics.RectF rectF2 = b1061516154492673368.b;
        rectF2.getClass();
        float[] fArr2 = b1061516154492673368.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, android.graphics.Path.Direction.CCW);
    }

    public final dev.epro.r0.S6349823729575121924 d() {
        android.graphics.RectF rectF = this.b;
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new dev.epro.r0.S6349823729575121924(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(dev.epro.r0.B1061516154492673368 b1061516154492673368, dev.epro.r0.B1061516154492673368 b10615161544926733682, int i) {
        android.graphics.Path.Op op = i == 0 ? android.graphics.Path.Op.DIFFERENCE : i == 1 ? android.graphics.Path.Op.INTERSECT : i == 4 ? android.graphics.Path.Op.REVERSE_DIFFERENCE : i == 2 ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        if (!(b1061516154492673368 instanceof dev.epro.r0.B1061516154492673368)) {
            dev.epro.r0.D11988991656201568495.j("Unable to obtain android.graphics.Path");
            return false;
        }
        android.graphics.Path path = b1061516154492673368.a;
        if (b10615161544926733682 instanceof dev.epro.r0.B1061516154492673368) {
            return this.a.op(path, b10615161544926733682.a, op);
        }
        dev.epro.r0.D11988991656201568495.j("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void g() {
        this.a.reset();
    }

    public final void h(int i) {
        this.a.setFillType(i == 1 ? android.graphics.Path.FillType.EVEN_ODD : android.graphics.Path.FillType.WINDING);
    }

    public final void i(long j) {
        android.graphics.Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new android.graphics.Matrix();
        } else {
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        android.graphics.Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
