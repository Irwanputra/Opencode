package dev.epro.r0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B1061516154492673368 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public B1061516154492673368(Path path) {
        this.a = path;
    }

    public static void a(B1061516154492673368 b1061516154492673368, B1061516154492673368 b10615161544926733682) {
        Path path = b1061516154492673368.a;
        if (b10615161544926733682 instanceof B1061516154492673368) {
            path.addPath(b10615161544926733682.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            D11988991656201568495.j("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(B1061516154492673368 b1061516154492673368, S6349823729575121924 s6349823729575121924) {
        float f = s6349823729575121924.a;
        float f2 = s6349823729575121924.d;
        float f3 = s6349823729575121924.c;
        float f4 = s6349823729575121924.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            W7346099082318612118.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = b1061516154492673368.b;
        if (rectF == null) {
            rectF = new RectF();
            b1061516154492673368.b = rectF;
        }
        rectF.set(f, f4, f3, f2);
        Path path = b1061516154492673368.a;
        RectF rectF2 = b1061516154492673368.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void c(B1061516154492673368 b1061516154492673368, V14120702150497747934 v14120702150497747934) {
        RectF rectF = b1061516154492673368.b;
        if (rectF == null) {
            rectF = new RectF();
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
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = b1061516154492673368.a;
        RectF rectF2 = b1061516154492673368.b;
        rectF2.getClass();
        float[] fArr2 = b1061516154492673368.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final S6349823729575121924 d() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new S6349823729575121924(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(B1061516154492673368 b1061516154492673368, B1061516154492673368 b10615161544926733682, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(b1061516154492673368 instanceof B1061516154492673368)) {
            D11988991656201568495.j("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = b1061516154492673368.a;
        if (b10615161544926733682 instanceof B1061516154492673368) {
            return this.a.op(path, b10615161544926733682.a, op);
        }
        D11988991656201568495.j("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void g() {
        this.a.reset();
    }

    public final void h(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void i(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
