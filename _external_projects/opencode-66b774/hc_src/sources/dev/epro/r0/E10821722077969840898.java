package dev.epro.r0;

import ads_mobile_sdk.pd;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E10821722077969840898 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final W13667419966741979084 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final O827298036535440209 f213o;

    public E10821722077969840898(E10821722077969840898 e10821722077969840898) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        O827298036535440209 o827298036535440209 = new O827298036535440209(0);
        this.f213o = o827298036535440209;
        this.g = new W13667419966741979084(e10821722077969840898.g, o827298036535440209);
        this.a = new Path(e10821722077969840898.a);
        this.b = new Path(e10821722077969840898.b);
        this.h = e10821722077969840898.h;
        this.i = e10821722077969840898.i;
        this.j = e10821722077969840898.j;
        this.k = e10821722077969840898.k;
        this.l = e10821722077969840898.l;
        this.m = e10821722077969840898.m;
        String str = e10821722077969840898.m;
        if (str != null) {
            o827298036535440209.put(str, this);
        }
        this.n = e10821722077969840898.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    public final void a(W13667419966741979084 w13667419966741979084, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        boolean z;
        Matrix matrix2;
        ArrayList arrayList;
        float f;
        int i4;
        float[] fArr;
        int i5;
        Path path;
        Path path2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        Matrix matrix3 = w13667419966741979084.a;
        ArrayList arrayList2 = w13667419966741979084.b;
        matrix3.set(matrix);
        Matrix matrix4 = w13667419966741979084.a;
        matrix4.preConcat(w13667419966741979084.j);
        canvas.save();
        boolean z2 = false;
        int i6 = 0;
        while (i6 < arrayList2.size()) {
            S7670568931305003909 s7670568931305003909 = (S7670568931305003909) arrayList2.get(i6);
            if (s7670568931305003909 instanceof W13667419966741979084) {
                a((W13667419966741979084) s7670568931305003909, matrix4, canvas, i, i2);
            } else if (s7670568931305003909 instanceof V13543759256294803054) {
                V13543759256294803054 v13543759256294803054 = (V13543759256294803054) s7670568931305003909;
                float f14 = i / this.j;
                float f15 = i2 / this.k;
                float min = Math.min(f14, f15);
                Matrix matrix5 = this.c;
                matrix5.set(matrix4);
                matrix5.postScale(f14, f15);
                float[] fArr2 = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix4.mapVectors(fArr2);
                double d = fArr2[z2 ? 1 : 0];
                float f16 = fArr2[1];
                ?? r42 = z2 ? 1 : 0;
                i3 = i6;
                float hypot = (float) Math.hypot(d, f16);
                float hypot2 = (float) Math.hypot(fArr2[2], fArr2[3]);
                float f17 = (fArr2[r42] * fArr2[3]) - (fArr2[1] * fArr2[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f17) / max : 0.0f;
                if (abs == 0.0f) {
                    z2 = r42;
                    matrix2 = matrix4;
                    arrayList = arrayList2;
                } else {
                    Path path3 = this.a;
                    path3.reset();
                    D488698419923809398[] d488698419923809398Arr = v13543759256294803054.a;
                    if (d488698419923809398Arr != null) {
                        float[] fArr3 = new float[6];
                        int length = d488698419923809398Arr.length;
                        z = true;
                        char c = 'm';
                        int i7 = r42;
                        while (i7 < length) {
                            D488698419923809398 d488698419923809398 = d488698419923809398Arr[i7];
                            char c2 = d488698419923809398.a;
                            Matrix matrix6 = matrix4;
                            float[] fArr4 = d488698419923809398.b;
                            float f18 = fArr3[r42];
                            float f19 = fArr3[1];
                            float f20 = fArr3[2];
                            float f21 = fArr3[3];
                            float f22 = fArr3[4];
                            ArrayList arrayList3 = arrayList2;
                            float f23 = fArr3[5];
                            switch (c2) {
                                case 'A':
                                case pd.H0 /* 97 */:
                                    i4 = 7;
                                    break;
                                case 'C':
                                case 'c':
                                    i4 = 6;
                                    break;
                                case 'H':
                                case 'V':
                                case pd.V0 /* 104 */:
                                case 'v':
                                    i4 = 1;
                                    break;
                                case 'Q':
                                case 'S':
                                case 'q':
                                case 's':
                                    i4 = 4;
                                    break;
                                case 'Z':
                                case 'z':
                                    path3.close();
                                    path3.moveTo(f22, f23);
                                    f18 = f22;
                                    f20 = f18;
                                    f19 = f23;
                                    f21 = f19;
                                default:
                                    i4 = 2;
                                    break;
                            }
                            float f24 = f22;
                            float f25 = f23;
                            float f26 = abs;
                            char c3 = c;
                            float f27 = f18;
                            float f28 = f19;
                            int i8 = r42;
                            while (i8 < fArr4.length) {
                                if (c2 != 'A') {
                                    if (c2 != 'C') {
                                        if (c2 == 'H') {
                                            fArr = fArr4;
                                            path2 = path3;
                                            i5 = i8;
                                            path2.lineTo(fArr[i5], f28);
                                            f27 = fArr[i5];
                                        } else if (c2 == 'Q') {
                                            fArr = fArr4;
                                            path2 = path3;
                                            i5 = i8;
                                            int i9 = i5 + 1;
                                            int i10 = i5 + 2;
                                            int i11 = i5 + 3;
                                            path2.quadTo(fArr[i5], fArr[i9], fArr[i10], fArr[i11]);
                                            f20 = fArr[i5];
                                            f21 = fArr[i9];
                                            f27 = fArr[i10];
                                            f28 = fArr[i11];
                                        } else if (c2 == 'V') {
                                            fArr = fArr4;
                                            i5 = i8;
                                            path3.lineTo(f27, fArr[i5]);
                                            f28 = fArr[i5];
                                        } else if (c2 == 'a') {
                                            fArr = fArr4;
                                            Path path4 = path3;
                                            i5 = i8;
                                            int i12 = i5 + 5;
                                            int i13 = i5 + 6;
                                            float f29 = f28;
                                            float f30 = f27;
                                            D488698419923809398.a(path4, f30, f29, fArr[i12] + f27, fArr[i13] + f28, fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3] != 0.0f ? true : r42, fArr[i5 + 4] != 0.0f ? true : r42);
                                            f27 = f30 + fArr[i12];
                                            f28 = f29 + fArr[i13];
                                            path3 = path4;
                                            f20 = f27;
                                            f21 = f28;
                                        } else if (c2 == 'c') {
                                            fArr = fArr4;
                                            i5 = i8;
                                            int i14 = i5 + 2;
                                            int i15 = i5 + 3;
                                            int i16 = i5 + 4;
                                            int i17 = i5 + 5;
                                            path = path3;
                                            path.rCubicTo(fArr[i5], fArr[i5 + 1], fArr[i14], fArr[i15], fArr[i16], fArr[i17]);
                                            float f31 = f27 + fArr[i14];
                                            float f32 = f28 + fArr[i15];
                                            f27 += fArr[i16];
                                            f28 += fArr[i17];
                                            f21 = f32;
                                            f20 = f31;
                                        } else if (c2 != 'h') {
                                            if (c2 != 'q') {
                                                if (c2 != 'v') {
                                                    if (c2 != 'L') {
                                                        if (c2 != 'M') {
                                                            if (c2 == 'S') {
                                                                fArr = fArr4;
                                                                i5 = i8;
                                                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                                    f27 = (f27 * 2.0f) - f20;
                                                                    f28 = (f28 * 2.0f) - f21;
                                                                }
                                                                int i18 = i5 + 1;
                                                                int i19 = i5 + 2;
                                                                int i20 = i5 + 3;
                                                                path3.cubicTo(f27, f28, fArr[i5], fArr[i18], fArr[i19], fArr[i20]);
                                                                f8 = fArr[i5];
                                                                f9 = fArr[i18];
                                                                f27 = fArr[i19];
                                                                f28 = fArr[i20];
                                                            } else if (c2 == 'T') {
                                                                fArr = fArr4;
                                                                i5 = i8;
                                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                    f27 = (f27 * 2.0f) - f20;
                                                                    f28 = (f28 * 2.0f) - f21;
                                                                }
                                                                float f33 = f27;
                                                                float f34 = f28;
                                                                int i21 = i5 + 1;
                                                                path3.quadTo(f33, f34, fArr[i5], fArr[i21]);
                                                                f20 = f33;
                                                                f21 = f34;
                                                                f27 = fArr[i5];
                                                                f28 = fArr[i21];
                                                            } else if (c2 == 'l') {
                                                                fArr = fArr4;
                                                                i5 = i8;
                                                                int i22 = i5 + 1;
                                                                path3.rLineTo(fArr[i5], fArr[i22]);
                                                                f27 += fArr[i5];
                                                                f5 = fArr[i22];
                                                            } else if (c2 == 'm') {
                                                                fArr = fArr4;
                                                                i5 = i8;
                                                                float f35 = fArr[i5];
                                                                f27 += f35;
                                                                float f36 = fArr[i5 + 1];
                                                                f28 += f36;
                                                                if (i5 > 0) {
                                                                    path3.rLineTo(f35, f36);
                                                                } else {
                                                                    path3.rMoveTo(f35, f36);
                                                                    f24 = f27;
                                                                }
                                                            } else if (c2 == 's') {
                                                                fArr = fArr4;
                                                                i5 = i8;
                                                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                                    f10 = f27 - f20;
                                                                    f11 = f28 - f21;
                                                                } else {
                                                                    f10 = 0.0f;
                                                                    f11 = 0.0f;
                                                                }
                                                                int i23 = i5 + 1;
                                                                int i24 = i5 + 2;
                                                                int i25 = i5 + 3;
                                                                path3.rCubicTo(f10, f11, fArr[i5], fArr[i23], fArr[i24], fArr[i25]);
                                                                f8 = f27 + fArr[i5];
                                                                f9 = f28 + fArr[i23];
                                                                f27 += fArr[i24];
                                                                f28 += fArr[i25];
                                                            } else if (c2 != 't') {
                                                                fArr = fArr4;
                                                                i5 = i8;
                                                            } else {
                                                                fArr = fArr4;
                                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                    f12 = f27 - f20;
                                                                    f13 = f28 - f21;
                                                                } else {
                                                                    f12 = 0.0f;
                                                                    f13 = 0.0f;
                                                                }
                                                                int i26 = i8 + 1;
                                                                i5 = i8;
                                                                path3.rQuadTo(f12, f13, fArr[i8], fArr[i26]);
                                                                f2 = f27 + f12;
                                                                f3 = f28 + f13;
                                                                f27 += fArr[i5];
                                                                f4 = fArr[i26];
                                                            }
                                                            f21 = f9;
                                                            f20 = f8;
                                                        } else {
                                                            fArr = fArr4;
                                                            i5 = i8;
                                                            f6 = fArr[i5];
                                                            f7 = fArr[i5 + 1];
                                                            if (i5 > 0) {
                                                                path3.lineTo(f6, f7);
                                                            } else {
                                                                path3.moveTo(f6, f7);
                                                                f27 = f6;
                                                                f24 = f27;
                                                                f28 = f7;
                                                            }
                                                        }
                                                        f25 = f28;
                                                    } else {
                                                        fArr = fArr4;
                                                        i5 = i8;
                                                        int i27 = i5 + 1;
                                                        path3.lineTo(fArr[i5], fArr[i27]);
                                                        f6 = fArr[i5];
                                                        f7 = fArr[i27];
                                                    }
                                                    f27 = f6;
                                                    f28 = f7;
                                                } else {
                                                    fArr = fArr4;
                                                    i5 = i8;
                                                    path3.rLineTo(0.0f, fArr[i5]);
                                                    f5 = fArr[i5];
                                                }
                                                f28 += f5;
                                            } else {
                                                fArr = fArr4;
                                                i5 = i8;
                                                int i28 = i5 + 1;
                                                int i29 = i5 + 2;
                                                int i30 = i5 + 3;
                                                path3.rQuadTo(fArr[i5], fArr[i28], fArr[i29], fArr[i30]);
                                                f2 = f27 + fArr[i5];
                                                f3 = f28 + fArr[i28];
                                                f27 += fArr[i29];
                                                f4 = fArr[i30];
                                            }
                                            f28 += f4;
                                            f20 = f2;
                                            f21 = f3;
                                        } else {
                                            fArr = fArr4;
                                            i5 = i8;
                                            path3.rLineTo(fArr[i5], 0.0f);
                                            f27 += fArr[i5];
                                        }
                                        path3 = path2;
                                    } else {
                                        fArr = fArr4;
                                        Path path5 = path3;
                                        i5 = i8;
                                        int i31 = i5 + 2;
                                        int i32 = i5 + 3;
                                        int i33 = i5 + 4;
                                        int i34 = i5 + 5;
                                        path = path5;
                                        path.cubicTo(fArr[i5], fArr[i5 + 1], fArr[i31], fArr[i32], fArr[i33], fArr[i34]);
                                        float f37 = fArr[i33];
                                        float f38 = fArr[i34];
                                        float f39 = fArr[i31];
                                        f21 = fArr[i32];
                                        f27 = f37;
                                        f28 = f38;
                                        f20 = f39;
                                    }
                                    path3 = path;
                                } else {
                                    fArr = fArr4;
                                    Path path6 = path3;
                                    i5 = i8;
                                    int i35 = i5 + 5;
                                    int i36 = i5 + 6;
                                    D488698419923809398.a(path6, f27, f28, fArr[i35], fArr[i36], fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3] != 0.0f ? true : r42, fArr[i5 + 4] != 0.0f ? true : r42);
                                    path3 = path6;
                                    float f40 = fArr[i35];
                                    f21 = fArr[i36];
                                    f28 = f21;
                                    f20 = f40;
                                    f27 = f20;
                                }
                                i8 = i5 + i4;
                                c3 = c2;
                                fArr4 = fArr;
                            }
                            fArr3[r42] = f27;
                            fArr3[1] = f28;
                            fArr3[2] = f20;
                            fArr3[3] = f21;
                            fArr3[4] = f24;
                            fArr3[5] = f25;
                            i7++;
                            c = d488698419923809398.a;
                            matrix4 = matrix6;
                            arrayList2 = arrayList3;
                            abs = f26;
                        }
                    } else {
                        z = true;
                    }
                    matrix2 = matrix4;
                    arrayList = arrayList2;
                    float f41 = abs;
                    Path path7 = this.b;
                    path7.reset();
                    if (v13543759256294803054 instanceof T11122899614028670287) {
                        path7.setFillType(v13543759256294803054.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path7.addPath(path3, matrix5);
                        canvas.clipPath(path7);
                        z2 = r42;
                    } else {
                        H12107640128773434115 h12107640128773434115 = (H12107640128773434115) v13543759256294803054;
                        float f42 = h12107640128773434115.i;
                        if (f42 == 0.0f && h12107640128773434115.j == 1.0f) {
                            z2 = r42;
                        } else {
                            float f43 = h12107640128773434115.k;
                            float f44 = (f42 + f43) % 1.0f;
                            float f45 = (h12107640128773434115.j + f43) % 1.0f;
                            PathMeasure pathMeasure = this.f;
                            if (pathMeasure == null) {
                                pathMeasure = new PathMeasure();
                                this.f = pathMeasure;
                            }
                            z2 = r42;
                            pathMeasure.setPath(path3, z2);
                            float length2 = this.f.getLength();
                            float f46 = f44 * length2;
                            float f47 = f45 * length2;
                            path3.reset();
                            PathMeasure pathMeasure2 = this.f;
                            if (f46 > f47) {
                                boolean z3 = z;
                                pathMeasure2.getSegment(f46, length2, path3, z3);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f47, path3, z3);
                            } else {
                                f = 0.0f;
                                pathMeasure2.getSegment(f46, f47, path3, z);
                            }
                            path3.rLineTo(f, f);
                        }
                        path7.addPath(path3, matrix5);
                        N12245111110189169079 n12245111110189169079 = h12107640128773434115.f;
                        if (((Shader) n12245111110189169079.c) != null || n12245111110189169079.b != 0) {
                            if (this.e == null) {
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) n12245111110189169079.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix5);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(h12107640128773434115.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i37 = n12245111110189169079.b;
                                float f48 = h12107640128773434115.h;
                                PorterDuff.Mode mode = R14609119592937689706.j;
                                paint2.setColor((i37 & 16777215) | (((int) (Color.alpha(i37) * f48)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path7.setFillType(h12107640128773434115.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path7, paint2);
                        }
                        N12245111110189169079 n122451111101891690792 = h12107640128773434115.d;
                        if (((Shader) n122451111101891690792.c) != null || n122451111101891690792.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = h12107640128773434115.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = h12107640128773434115.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(h12107640128773434115.n);
                            Shader shader2 = (Shader) n122451111101891690792.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix5);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(h12107640128773434115.g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i38 = n122451111101891690792.b;
                                float f49 = h12107640128773434115.g;
                                PorterDuff.Mode mode2 = R14609119592937689706.j;
                                paint4.setColor((i38 & 16777215) | (((int) (Color.alpha(i38) * f49)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(h12107640128773434115.e * min * f41);
                            canvas.drawPath(path7, paint4);
                        }
                    }
                }
                i6 = i3 + 1;
                matrix4 = matrix2;
                arrayList2 = arrayList;
            }
            matrix2 = matrix4;
            arrayList = arrayList2;
            i3 = i6;
            i6 = i3 + 1;
            matrix4 = matrix2;
            arrayList2 = arrayList;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public E10821722077969840898() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.f213o = new O827298036535440209(0);
        this.g = new W13667419966741979084();
        this.a = new Path();
        this.b = new Path();
    }
}
