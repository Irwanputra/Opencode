package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E10821722077969840898 {
    public static final android.graphics.Matrix p = new android.graphics.Matrix();
    public final android.graphics.Path a;
    public final android.graphics.Path b;
    public final android.graphics.Matrix c;
    public android.graphics.Paint d;
    public android.graphics.Paint e;
    public android.graphics.PathMeasure f;
    public final dev.epro.r0.W13667419966741979084 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public java.lang.String m;
    public java.lang.Boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dev.epro.r0.O827298036535440209 f213o;

    public E10821722077969840898(dev.epro.r0.E10821722077969840898 e10821722077969840898) {
        this.c = new android.graphics.Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        dev.epro.r0.O827298036535440209 o827298036535440209 = new dev.epro.r0.O827298036535440209(0);
        this.f213o = o827298036535440209;
        this.g = new dev.epro.r0.W13667419966741979084(e10821722077969840898.g, o827298036535440209);
        this.a = new android.graphics.Path(e10821722077969840898.a);
        this.b = new android.graphics.Path(e10821722077969840898.b);
        this.h = e10821722077969840898.h;
        this.i = e10821722077969840898.i;
        this.j = e10821722077969840898.j;
        this.k = e10821722077969840898.k;
        this.l = e10821722077969840898.l;
        this.m = e10821722077969840898.m;
        java.lang.String str = e10821722077969840898.m;
        if (str != null) {
            o827298036535440209.put(str, this);
        }
        this.n = e10821722077969840898.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(dev.epro.r0.W13667419966741979084 w13667419966741979084, android.graphics.Matrix matrix, android.graphics.Canvas canvas, int i, int i2) {
        int i3;
        boolean z;
        android.graphics.Matrix matrix2;
        java.util.ArrayList arrayList;
        float f;
        int i4;
        float[] fArr;
        int i5;
        android.graphics.Path path;
        android.graphics.Path path2;
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
        android.graphics.Matrix matrix3 = w13667419966741979084.a;
        java.util.ArrayList arrayList2 = w13667419966741979084.b;
        matrix3.set(matrix);
        android.graphics.Matrix matrix4 = w13667419966741979084.a;
        matrix4.preConcat(w13667419966741979084.j);
        canvas.save();
        boolean z2 = false;
        int i6 = 0;
        while (i6 < arrayList2.size()) {
            dev.epro.r0.H12107640128773434115 h12107640128773434115 = (dev.epro.r0.S7670568931305003909) arrayList2.get(i6);
            if (h12107640128773434115 instanceof dev.epro.r0.W13667419966741979084) {
                a((dev.epro.r0.W13667419966741979084) h12107640128773434115, matrix4, canvas, i, i2);
            } else {
                if (h12107640128773434115 instanceof dev.epro.r0.V13543759256294803054) {
                    dev.epro.r0.H12107640128773434115 h121076401287734341152 = (dev.epro.r0.V13543759256294803054) h12107640128773434115;
                    float f14 = i / this.j;
                    float f15 = i2 / this.k;
                    float fMin = java.lang.Math.min(f14, f15);
                    android.graphics.Matrix matrix5 = this.c;
                    matrix5.set(matrix4);
                    matrix5.postScale(f14, f15);
                    float[] fArr2 = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix4.mapVectors(fArr2);
                    double d = fArr2[z2 ? 1 : 0];
                    float f16 = fArr2[1];
                    java.lang.Object[] objArr = z2 ? 1 : 0;
                    i3 = i6;
                    float fHypot = (float) java.lang.Math.hypot(d, f16);
                    float fHypot2 = (float) java.lang.Math.hypot(fArr2[2], fArr2[3]);
                    float f17 = (fArr2[objArr == true ? 1 : 0] * fArr2[3]) - (fArr2[1] * fArr2[2]);
                    float fMax = java.lang.Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? java.lang.Math.abs(f17) / fMax : 0.0f;
                    if (fAbs == 0.0f) {
                        z2 = objArr == true ? 1 : 0;
                        matrix2 = matrix4;
                        arrayList = arrayList2;
                    } else {
                        android.graphics.Path path3 = this.a;
                        path3.reset();
                        dev.epro.r0.D488698419923809398[] d488698419923809398Arr = ((dev.epro.r0.V13543759256294803054) h121076401287734341152).a;
                        if (d488698419923809398Arr != null) {
                            float[] fArr3 = new float[6];
                            int length = d488698419923809398Arr.length;
                            z = true;
                            char c = 'm';
                            int i7 = objArr == true ? 1 : 0;
                            while (i7 < length) {
                                dev.epro.r0.D488698419923809398 d488698419923809398 = d488698419923809398Arr[i7];
                                char c2 = d488698419923809398.a;
                                android.graphics.Matrix matrix6 = matrix4;
                                float[] fArr4 = d488698419923809398.b;
                                float f18 = fArr3[objArr == true ? 1 : 0];
                                float f19 = fArr3[1];
                                float f20 = fArr3[2];
                                float f21 = fArr3[3];
                                float f22 = fArr3[4];
                                java.util.ArrayList arrayList3 = arrayList2;
                                float f23 = fArr3[5];
                                switch (c2) {
                                    case 'A':
                                    case ads_mobile_sdk.pd.H0 /* 97 */:
                                        i4 = 7;
                                        break;
                                    case 'C':
                                    case ads_mobile_sdk.pd.R0 /* 99 */:
                                        i4 = 6;
                                        break;
                                    case 'H':
                                    case 'V':
                                    case ads_mobile_sdk.pd.V0 /* 104 */:
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
                                float f26 = fAbs;
                                char c3 = c;
                                float f27 = f18;
                                float f28 = f19;
                                int i8 = objArr == true ? 1 : 0;
                                while (i8 < fArr4.length) {
                                    if (c2 != 'A') {
                                        if (c2 != 'C') {
                                            if (c2 == 'H') {
                                                fArr = fArr4;
                                                path2 = path3;
                                                i5 = i8;
                                                path2.lineTo(fArr[i5 == true ? 1 : 0], f28);
                                                f27 = fArr[i5 == true ? 1 : 0];
                                            } else if (c2 == 'Q') {
                                                fArr = fArr4;
                                                path2 = path3;
                                                i5 = i8;
                                                float f29 = fArr[i5 == true ? 1 : 0];
                                                int i9 = (i5 == true ? 1 : 0) + 1;
                                                float f30 = fArr[i9];
                                                int i10 = (i5 == true ? 1 : 0) + 2;
                                                float f31 = fArr[i10];
                                                int i11 = (i5 == true ? 1 : 0) + 3;
                                                path2.quadTo(f29, f30, f31, fArr[i11]);
                                                f20 = fArr[i5 == true ? 1 : 0];
                                                f21 = fArr[i9];
                                                f27 = fArr[i10];
                                                f28 = fArr[i11];
                                            } else if (c2 == 'V') {
                                                fArr = fArr4;
                                                i5 = i8;
                                                path3.lineTo(f27, fArr[i5 == true ? 1 : 0]);
                                                f28 = fArr[i5 == true ? 1 : 0];
                                            } else if (c2 == 'a') {
                                                fArr = fArr4;
                                                android.graphics.Path path4 = path3;
                                                i5 = i8;
                                                int i12 = (i5 == true ? 1 : 0) + 5;
                                                float f32 = fArr[i12] + f27;
                                                int i13 = (i5 == true ? 1 : 0) + 6;
                                                float f33 = f28;
                                                float f34 = f27;
                                                dev.epro.r0.D488698419923809398.a(path4, f34, f33, f32, fArr[i13] + f28, fArr[i5 == true ? 1 : 0], fArr[(i5 == true ? 1 : 0) + 1], fArr[(i5 == true ? 1 : 0) + 2], fArr[(i5 == true ? 1 : 0) + 3] != 0.0f ? true : objArr == true ? 1 : 0, fArr[(i5 == true ? 1 : 0) + 4] != 0.0f ? true : objArr == true ? 1 : 0);
                                                f27 = f34 + fArr[i12];
                                                f28 = f33 + fArr[i13];
                                                path3 = path4;
                                                f20 = f27;
                                                f21 = f28;
                                            } else if (c2 == 'c') {
                                                fArr = fArr4;
                                                i5 = i8;
                                                float f35 = fArr[i5 == true ? 1 : 0];
                                                float f36 = fArr[(i5 == true ? 1 : 0) + 1];
                                                int i14 = (i5 == true ? 1 : 0) + 2;
                                                float f37 = fArr[i14];
                                                int i15 = (i5 == true ? 1 : 0) + 3;
                                                float f38 = fArr[i15];
                                                int i16 = (i5 == true ? 1 : 0) + 4;
                                                float f39 = fArr[i16];
                                                int i17 = (i5 == true ? 1 : 0) + 5;
                                                path = path3;
                                                path.rCubicTo(f35, f36, f37, f38, f39, fArr[i17]);
                                                float f40 = f27 + fArr[i14];
                                                float f41 = f28 + fArr[i15];
                                                f27 += fArr[i16];
                                                f28 += fArr[i17];
                                                f21 = f41;
                                                f20 = f40;
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
                                                                    float f42 = f27;
                                                                    float f43 = f28;
                                                                    float f44 = fArr[i5 == true ? 1 : 0];
                                                                    int i18 = (i5 == true ? 1 : 0) + 1;
                                                                    float f45 = fArr[i18];
                                                                    int i19 = (i5 == true ? 1 : 0) + 2;
                                                                    float f46 = fArr[i19];
                                                                    int i20 = (i5 == true ? 1 : 0) + 3;
                                                                    path3.cubicTo(f42, f43, f44, f45, f46, fArr[i20]);
                                                                    f8 = fArr[i5 == true ? 1 : 0];
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
                                                                    float f47 = f27;
                                                                    float f48 = f28;
                                                                    float f49 = fArr[i5 == true ? 1 : 0];
                                                                    int i21 = (i5 == true ? 1 : 0) + 1;
                                                                    path3.quadTo(f47, f48, f49, fArr[i21]);
                                                                    f20 = f47;
                                                                    f21 = f48;
                                                                    f27 = fArr[i5 == true ? 1 : 0];
                                                                    f28 = fArr[i21];
                                                                } else if (c2 == 'l') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    float f50 = fArr[i5 == true ? 1 : 0];
                                                                    int i22 = (i5 == true ? 1 : 0) + 1;
                                                                    path3.rLineTo(f50, fArr[i22]);
                                                                    f27 += fArr[i5 == true ? 1 : 0];
                                                                    f5 = fArr[i22];
                                                                } else if (c2 == 'm') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    float f51 = fArr[i5 == true ? 1 : 0];
                                                                    f27 += f51;
                                                                    float f52 = fArr[(i5 == true ? 1 : 0) + 1];
                                                                    f28 += f52;
                                                                    if (i5 > 0) {
                                                                        path3.rLineTo(f51, f52);
                                                                    } else {
                                                                        path3.rMoveTo(f51, f52);
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
                                                                    float f53 = fArr[i5 == true ? 1 : 0];
                                                                    int i23 = (i5 == true ? 1 : 0) + 1;
                                                                    float f54 = fArr[i23];
                                                                    int i24 = (i5 == true ? 1 : 0) + 2;
                                                                    float f55 = fArr[i24];
                                                                    int i25 = (i5 == true ? 1 : 0) + 3;
                                                                    path3.rCubicTo(f10, f11, f53, f54, f55, fArr[i25]);
                                                                    f8 = f27 + fArr[i5 == true ? 1 : 0];
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
                                                                    f27 += fArr[i5 == true ? 1 : 0];
                                                                    f4 = fArr[i26];
                                                                }
                                                                f21 = f9;
                                                                f20 = f8;
                                                            } else {
                                                                fArr = fArr4;
                                                                i5 = i8;
                                                                f6 = fArr[i5 == true ? 1 : 0];
                                                                f7 = fArr[(i5 == true ? 1 : 0) + 1];
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
                                                            float f56 = fArr[i5 == true ? 1 : 0];
                                                            int i27 = (i5 == true ? 1 : 0) + 1;
                                                            path3.lineTo(f56, fArr[i27]);
                                                            f6 = fArr[i5 == true ? 1 : 0];
                                                            f7 = fArr[i27];
                                                        }
                                                        f27 = f6;
                                                        f28 = f7;
                                                    } else {
                                                        fArr = fArr4;
                                                        i5 = i8;
                                                        path3.rLineTo(0.0f, fArr[i5 == true ? 1 : 0]);
                                                        f5 = fArr[i5 == true ? 1 : 0];
                                                    }
                                                    f28 += f5;
                                                } else {
                                                    fArr = fArr4;
                                                    i5 = i8;
                                                    float f57 = fArr[i5 == true ? 1 : 0];
                                                    int i28 = (i5 == true ? 1 : 0) + 1;
                                                    float f58 = fArr[i28];
                                                    int i29 = (i5 == true ? 1 : 0) + 2;
                                                    float f59 = fArr[i29];
                                                    int i30 = (i5 == true ? 1 : 0) + 3;
                                                    path3.rQuadTo(f57, f58, f59, fArr[i30]);
                                                    f2 = f27 + fArr[i5 == true ? 1 : 0];
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
                                                path3.rLineTo(fArr[i5 == true ? 1 : 0], 0.0f);
                                                f27 += fArr[i5 == true ? 1 : 0];
                                            }
                                            path3 = path2;
                                        } else {
                                            fArr = fArr4;
                                            android.graphics.Path path5 = path3;
                                            i5 = i8;
                                            float f60 = fArr[i5 == true ? 1 : 0];
                                            float f61 = fArr[(i5 == true ? 1 : 0) + 1];
                                            int i31 = (i5 == true ? 1 : 0) + 2;
                                            float f62 = fArr[i31];
                                            int i32 = (i5 == true ? 1 : 0) + 3;
                                            float f63 = fArr[i32];
                                            int i33 = (i5 == true ? 1 : 0) + 4;
                                            float f64 = fArr[i33];
                                            int i34 = (i5 == true ? 1 : 0) + 5;
                                            path = path5;
                                            path.cubicTo(f60, f61, f62, f63, f64, fArr[i34]);
                                            float f65 = fArr[i33];
                                            float f66 = fArr[i34];
                                            float f67 = fArr[i31];
                                            f21 = fArr[i32];
                                            f27 = f65;
                                            f28 = f66;
                                            f20 = f67;
                                        }
                                        path3 = path;
                                    } else {
                                        fArr = fArr4;
                                        android.graphics.Path path6 = path3;
                                        i5 = i8;
                                        float f68 = f27;
                                        float f69 = f28;
                                        int i35 = (i5 == true ? 1 : 0) + 5;
                                        float f70 = fArr[i35];
                                        int i36 = (i5 == true ? 1 : 0) + 6;
                                        dev.epro.r0.D488698419923809398.a(path6, f68, f69, f70, fArr[i36], fArr[i5 == true ? 1 : 0], fArr[(i5 == true ? 1 : 0) + 1], fArr[(i5 == true ? 1 : 0) + 2], fArr[(i5 == true ? 1 : 0) + 3] != 0.0f ? true : objArr == true ? 1 : 0, fArr[(i5 == true ? 1 : 0) + 4] != 0.0f ? true : objArr == true ? 1 : 0);
                                        path3 = path6;
                                        float f71 = fArr[i35];
                                        f21 = fArr[i36];
                                        f28 = f21;
                                        f20 = f71;
                                        f27 = f20;
                                    }
                                    i8 = i5 + i4;
                                    c3 = c2;
                                    fArr4 = fArr;
                                }
                                fArr3[objArr == true ? 1 : 0] = f27;
                                fArr3[1] = f28;
                                fArr3[2] = f20;
                                fArr3[3] = f21;
                                fArr3[4] = f24;
                                fArr3[5] = f25;
                                i7++;
                                c = d488698419923809398.a;
                                matrix4 = matrix6;
                                arrayList2 = arrayList3;
                                fAbs = f26;
                            }
                        } else {
                            z = true;
                        }
                        matrix2 = matrix4;
                        arrayList = arrayList2;
                        float f72 = fAbs;
                        android.graphics.Path path7 = this.b;
                        path7.reset();
                        if (h121076401287734341152 instanceof dev.epro.r0.T11122899614028670287) {
                            path7.setFillType(((dev.epro.r0.V13543759256294803054) h121076401287734341152).c == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                            path7.addPath(path3, matrix5);
                            canvas.clipPath(path7);
                            z2 = objArr == true ? 1 : 0;
                        } else {
                            dev.epro.r0.H12107640128773434115 h121076401287734341153 = h121076401287734341152;
                            float f73 = h121076401287734341153.i;
                            if (f73 == 0.0f && h121076401287734341153.j == 1.0f) {
                                z2 = objArr == true ? 1 : 0;
                            } else {
                                float f74 = h121076401287734341153.k;
                                float f75 = (f73 + f74) % 1.0f;
                                float f76 = (h121076401287734341153.j + f74) % 1.0f;
                                android.graphics.PathMeasure pathMeasure = this.f;
                                if (pathMeasure == null) {
                                    pathMeasure = new android.graphics.PathMeasure();
                                    this.f = pathMeasure;
                                }
                                z2 = objArr == true ? 1 : 0;
                                pathMeasure.setPath(path3, z2);
                                float length2 = this.f.getLength();
                                float f77 = f75 * length2;
                                float f78 = f76 * length2;
                                path3.reset();
                                android.graphics.PathMeasure pathMeasure2 = this.f;
                                if (f77 > f78) {
                                    boolean z3 = z;
                                    pathMeasure2.getSegment(f77, length2, path3, z3);
                                    f = 0.0f;
                                    this.f.getSegment(0.0f, f78, path3, z3);
                                } else {
                                    f = 0.0f;
                                    pathMeasure2.getSegment(f77, f78, path3, z);
                                }
                                path3.rLineTo(f, f);
                            }
                            path7.addPath(path3, matrix5);
                            dev.epro.r0.N12245111110189169079 n12245111110189169079 = h121076401287734341153.f;
                            if (((android.graphics.Shader) n12245111110189169079.c) != null || n12245111110189169079.b != 0) {
                                if (this.e == null) {
                                    android.graphics.Paint paint = new android.graphics.Paint(1);
                                    this.e = paint;
                                    paint.setStyle(android.graphics.Paint.Style.FILL);
                                }
                                android.graphics.Paint paint2 = this.e;
                                android.graphics.Shader shader = (android.graphics.Shader) n12245111110189169079.c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix5);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(java.lang.Math.round(h121076401287734341153.h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i37 = n12245111110189169079.b;
                                    float f79 = h121076401287734341153.h;
                                    android.graphics.PorterDuff.Mode mode = dev.epro.r0.R14609119592937689706.j;
                                    paint2.setColor((i37 & 16777215) | (((int) (android.graphics.Color.alpha(i37) * f79)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path7.setFillType(((dev.epro.r0.V13543759256294803054) h121076401287734341153).c == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                                canvas.drawPath(path7, paint2);
                            }
                            dev.epro.r0.N12245111110189169079 n122451111101891690792 = h121076401287734341153.d;
                            if (((android.graphics.Shader) n122451111101891690792.c) != null || n122451111101891690792.b != 0) {
                                if (this.d == null) {
                                    android.graphics.Paint paint3 = new android.graphics.Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(android.graphics.Paint.Style.STROKE);
                                }
                                android.graphics.Paint paint4 = this.d;
                                android.graphics.Paint.Join join = h121076401287734341153.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                android.graphics.Paint.Cap cap = h121076401287734341153.l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(h121076401287734341153.n);
                                android.graphics.Shader shader2 = (android.graphics.Shader) n122451111101891690792.c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix5);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(java.lang.Math.round(h121076401287734341153.g * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i38 = n122451111101891690792.b;
                                    float f80 = h121076401287734341153.g;
                                    android.graphics.PorterDuff.Mode mode2 = dev.epro.r0.R14609119592937689706.j;
                                    paint4.setColor((i38 & 16777215) | (((int) (android.graphics.Color.alpha(i38) * f80)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(h121076401287734341153.e * fMin * f72);
                                canvas.drawPath(path7, paint4);
                            }
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
        this.c = new android.graphics.Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.f213o = new dev.epro.r0.O827298036535440209(0);
        this.g = new dev.epro.r0.W13667419966741979084();
        this.a = new android.graphics.Path();
        this.b = new android.graphics.Path();
    }
}
