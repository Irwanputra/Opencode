package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E1005111105761972824 {
    public java.lang.Object a;
    public java.lang.Object b;
    public final java.lang.Object c;
    public java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public java.lang.Object g;
    public java.lang.Object h;
    public java.lang.Object i;
    public java.lang.Object j;
    public java.lang.Object k;

    public E1005111105761972824(byte b) {
        switch (b) {
            case 1:
                this.a = new dev.epro.r0.K6473381917781246827[4];
                this.b = new android.graphics.Matrix[4];
                this.c = new android.graphics.Matrix[4];
                this.d = new android.graphics.PointF();
                this.e = new android.graphics.Path();
                this.f = new android.graphics.Path();
                this.g = new dev.epro.r0.K6473381917781246827();
                this.h = new float[2];
                this.i = new float[2];
                this.j = new android.graphics.Path();
                this.k = new android.graphics.Path();
                for (int i = 0; i < 4; i++) {
                    ((dev.epro.r0.K6473381917781246827[]) this.a)[i] = new dev.epro.r0.K6473381917781246827();
                    ((android.graphics.Matrix[]) this.b)[i] = new android.graphics.Matrix();
                    ((android.graphics.Matrix[]) this.c)[i] = new android.graphics.Matrix();
                }
                break;
            default:
                dev.epro.r0.D389890677992184566 d389890677992184566 = new dev.epro.r0.D389890677992184566(0, new dev.epro.r0.F819643558874997944[16]);
                this.c = d389890677992184566;
                dev.epro.r0.E13273723708836014930 e13273723708836014930 = dev.epro.r0.L12621230156277355451.a;
                this.g = new dev.epro.r0.E13273723708836014930();
                this.d = d389890677992184566;
                this.e = new dev.epro.r0.D389890677992184566(0, new java.lang.Object[16]);
                this.f = new dev.epro.r0.D389890677992184566(0, new dev.epro.r0.B13729205492206812220[16]);
                break;
        }
    }

    public static final boolean g(dev.epro.r0.F819643558874997944 f819643558874997944, dev.epro.r0.D389890677992184566 d389890677992184566) {
        java.lang.Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        for (int i2 = 0; i2 < i; i2++) {
            dev.epro.r0.S17814127062194345634 s17814127062194345634 = ((dev.epro.r0.F819643558874997944) objArr[i2]).a;
            if (s17814127062194345634 instanceof dev.epro.r0.S17814127062194345634) {
                dev.epro.r0.D389890677992184566 d3898906779921845662 = s17814127062194345634.b;
                if (d3898906779921845662.l(f819643558874997944) || g(f819643558874997944, d3898906779921845662)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static dev.epro.r0.E1005111105761972824 h() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread() ? dev.epro.r0.P8557672422244076818.a : new dev.epro.r0.E1005111105761972824((byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(dev.epro.r0.A11042752882447342413 a11042752882447342413, float[] fArr, float f, android.graphics.RectF rectF, dev.epro.r0.T6085905021688082777 t6085905021688082777, android.graphics.Path path) {
        int i;
        char c;
        float f2;
        dev.epro.r0.T6085905021688082777 t60859050216880827772;
        char c2;
        dev.epro.r0.T6085905021688082777 t60859050216880827773 = t6085905021688082777;
        android.graphics.Matrix[] matrixArr = (android.graphics.Matrix[]) this.c;
        float[] fArr2 = (float[]) this.h;
        dev.epro.r0.K6473381917781246827[] k6473381917781246827Arr = (dev.epro.r0.K6473381917781246827[]) this.a;
        android.graphics.Matrix[] matrixArr2 = (android.graphics.Matrix[]) this.b;
        path.rewind();
        android.graphics.Path path2 = (android.graphics.Path) this.e;
        path2.rewind();
        android.graphics.Path path3 = (android.graphics.Path) this.f;
        path3.rewind();
        path3.addRect(rectF, android.graphics.Path.Direction.CW);
        int i2 = 0;
        while (true) {
            c = 0;
            if (i2 >= 4) {
                break;
            }
            android.graphics.PointF pointF = (android.graphics.PointF) this.d;
            dev.epro.r0.S17354436298385972004 q11072545018327078523 = fArr == null ? i2 != 1 ? i2 != 2 ? i2 != 3 ? a11042752882447342413.f : a11042752882447342413.e : a11042752882447342413.h : a11042752882447342413.g : new dev.epro.r0.Q11072545018327078523(fArr[i2]);
            dev.epro.r0.Q13169198992966610970 q13169198992966610970 = i2 != 1 ? i2 != 2 ? i2 != 3 ? a11042752882447342413.b : a11042752882447342413.a : a11042752882447342413.d : a11042752882447342413.c;
            dev.epro.r0.K6473381917781246827 k6473381917781246827 = k6473381917781246827Arr[i2];
            q13169198992966610970.getClass();
            android.graphics.Matrix[] matrixArr3 = matrixArr;
            q13169198992966610970.W(k6473381917781246827, f, q11072545018327078523.a(rectF));
            int i3 = i2 + 1;
            float f3 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            dev.epro.r0.K6473381917781246827 k64733819177812468272 = k6473381917781246827Arr[i2];
            fArr2[0] = k64733819177812468272.b;
            fArr2[1] = k64733819177812468272.c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr3[i2].reset();
            matrixArr3[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i2].preRotate(f3);
            i2 = i3;
            matrixArr = matrixArr3;
        }
        android.graphics.Matrix[] matrixArr4 = matrixArr;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            dev.epro.r0.K6473381917781246827 k64733819177812468273 = k6473381917781246827Arr[i4];
            k64733819177812468273.getClass();
            fArr2[c] = 0.0f;
            fArr2[1] = k64733819177812468273.a;
            matrixArr2[i4].mapPoints(fArr2);
            if (i4 == 0) {
                path.moveTo(fArr2[c], fArr2[1]);
            } else {
                path.lineTo(fArr2[c], fArr2[1]);
            }
            k6473381917781246827Arr[i4].b(matrixArr2[i4], path);
            if (t60859050216880827773 != null) {
                dev.epro.r0.K6473381917781246827 k64733819177812468274 = k6473381917781246827Arr[i4];
                android.graphics.Matrix matrix = matrixArr2[i4];
                dev.epro.r0.I11571046933844109529 i11571046933844109529 = t60859050216880827773.a;
                java.util.BitSet bitSet = i11571046933844109529.e;
                k64733819177812468274.getClass();
                f2 = 0.0f;
                bitSet.set(i4, (boolean) c);
                dev.epro.r0.F12589017238560935108[] f12589017238560935108Arr = i11571046933844109529.c;
                k64733819177812468274.a(k64733819177812468274.e);
                f12589017238560935108Arr[i4] = new dev.epro.r0.A13572972347976583540(new java.util.ArrayList(k64733819177812468274.g), new android.graphics.Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            android.graphics.Path path4 = (android.graphics.Path) this.j;
            dev.epro.r0.K6473381917781246827 k64733819177812468275 = (dev.epro.r0.K6473381917781246827) this.g;
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            dev.epro.r0.K6473381917781246827 k64733819177812468276 = k6473381917781246827Arr[i4];
            fArr2[0] = k64733819177812468276.b;
            fArr2[1] = k64733819177812468276.c;
            matrixArr2[i4].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.i;
            dev.epro.r0.K6473381917781246827 k64733819177812468277 = k6473381917781246827Arr[i6];
            k64733819177812468277.getClass();
            fArr3[0] = f2;
            fArr3[1] = k64733819177812468277.a;
            matrixArr2[i6].mapPoints(fArr3);
            dev.epro.r0.K6473381917781246827[] k6473381917781246827Arr2 = k6473381917781246827Arr;
            android.graphics.Matrix[] matrixArr5 = matrixArr2;
            float fMax = java.lang.Math.max(((float) java.lang.Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            dev.epro.r0.K6473381917781246827 k64733819177812468278 = k6473381917781246827Arr2[i4];
            fArr2[0] = k64733819177812468278.b;
            fArr2[1] = k64733819177812468278.c;
            matrixArr5[i4].mapPoints(fArr2);
            if (i4 == 1 || i4 == 3) {
                java.lang.Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                java.lang.Math.abs(rectF.centerY() - fArr2[1]);
            }
            k64733819177812468275.d(0.0f, 270.0f, 0.0f);
            (i4 != 1 ? i4 != 2 ? i4 != 3 ? a11042752882447342413.j : a11042752882447342413.i : a11042752882447342413.l : a11042752882447342413.k).getClass();
            k64733819177812468275.c(fMax, 0.0f);
            path4.reset();
            k64733819177812468275.b(matrixArr4[i4], path4);
            if (i(path4, i4) || i(path4, i6)) {
                path4.op(path4, path3, android.graphics.Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = k64733819177812468275.a;
                matrixArr4[i4].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                k64733819177812468275.b(matrixArr4[i4], path2);
            } else {
                k64733819177812468275.b(matrixArr4[i4], path);
            }
            if (t6085905021688082777 != null) {
                android.graphics.Matrix matrix2 = matrixArr4[i4];
                t60859050216880827772 = t6085905021688082777;
                dev.epro.r0.I11571046933844109529 i115710469338441095292 = t60859050216880827772.a;
                c2 = 0;
                i115710469338441095292.e.set(i4 + 4, false);
                dev.epro.r0.F12589017238560935108[] f12589017238560935108Arr2 = i115710469338441095292.d;
                k64733819177812468275.a(k64733819177812468275.e);
                f12589017238560935108Arr2[i4] = new dev.epro.r0.A13572972347976583540(new java.util.ArrayList(k64733819177812468275.g), new android.graphics.Matrix(matrix2));
            } else {
                t60859050216880827772 = t6085905021688082777;
                c2 = 0;
            }
            c = c2;
            t60859050216880827773 = t60859050216880827772;
            i4 = i5;
            k6473381917781246827Arr = k6473381917781246827Arr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, android.graphics.Path.Op.UNION);
    }

    public void b() {
        this.a = null;
        this.b = null;
        dev.epro.r0.D389890677992184566 d389890677992184566 = (dev.epro.r0.D389890677992184566) this.c;
        d389890677992184566.i();
        ((dev.epro.r0.E13273723708836014930) this.g).b();
        this.d = d389890677992184566;
        ((dev.epro.r0.D389890677992184566) this.e).i();
        ((dev.epro.r0.D389890677992184566) this.f).i();
        this.h = null;
        this.j = null;
        this.k = null;
    }

    public void c() {
        java.util.Set set = (java.util.Set) this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        android.os.Trace.beginSection("Compose:abandons");
        try {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                dev.epro.r0.Z4972949040470868463 z4972949040470868463 = (dev.epro.r0.Z4972949040470868463) it.next();
                it.remove();
                z4972949040470868463.d();
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    public void d() {
        dev.epro.r0.D389890677992184566 d389890677992184566 = (dev.epro.r0.D389890677992184566) this.c;
        dev.epro.r0.D389890677992184566 d3898906779921845662 = (dev.epro.r0.D389890677992184566) this.e;
        java.util.Set set = (java.util.Set) this.a;
        if (set == null) {
            return;
        }
        this.i = null;
        if (d3898906779921845662.c != 0) {
            android.os.Trace.beginSection("Compose:onForgotten");
            try {
                dev.epro.r0.E13273723708836014930 e13273723708836014930 = (dev.epro.r0.E13273723708836014930) this.h;
                int i = d3898906779921845662.c;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    java.lang.Object obj = d3898906779921845662.a[i];
                    try {
                        if (obj instanceof dev.epro.r0.F819643558874997944) {
                            dev.epro.r0.Z4972949040470868463 z4972949040470868463 = ((dev.epro.r0.F819643558874997944) obj).a;
                            set.remove(z4972949040470868463);
                            z4972949040470868463.f();
                        }
                        if (obj instanceof dev.epro.r0.Y1249283782686518426) {
                            if (e13273723708836014930 == null || !e13273723708836014930.c(obj)) {
                                ((dev.epro.r0.Y1249283782686518426) obj).g();
                            } else {
                                ((dev.epro.r0.Y1249283782686518426) obj).f();
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        dev.epro.r0.W12685451225593881345 w12685451225593881345 = (dev.epro.r0.W12685451225593881345) this.b;
                        if (w12685451225593881345 != null) {
                            dev.epro.r0.O8620973563946607355.Z(th, new dev.epro.r0.D16945471218061474327(w12685451225593881345, obj, (byte) 24));
                        }
                        throw th;
                    }
                }
            } finally {
                android.os.Trace.endSection();
            }
        }
        if (d389890677992184566.c != 0) {
            android.os.Trace.beginSection("Compose:onRemembered");
            try {
                java.util.Set set2 = (java.util.Set) this.a;
                if (set2 != null) {
                    java.lang.Object[] objArr = d389890677992184566.a;
                    int i2 = d389890677992184566.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        dev.epro.r0.F819643558874997944 f819643558874997944 = (dev.epro.r0.F819643558874997944) objArr[i3];
                        dev.epro.r0.Z4972949040470868463 z49729490404708684632 = f819643558874997944.a;
                        set2.remove(z49729490404708684632);
                        try {
                            z49729490404708684632.a();
                        } catch (java.lang.Throwable th2) {
                            dev.epro.r0.W12685451225593881345 w126854512255938813452 = (dev.epro.r0.W12685451225593881345) this.b;
                            if (w126854512255938813452 != null) {
                                dev.epro.r0.O8620973563946607355.Z(th2, new dev.epro.r0.D16945471218061474327(w126854512255938813452, f819643558874997944, (byte) 24));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void e() {
        dev.epro.r0.D389890677992184566 d389890677992184566 = (dev.epro.r0.D389890677992184566) this.f;
        if (d389890677992184566.c != 0) {
            android.os.Trace.beginSection("Compose:sideeffects");
            try {
                java.lang.Object[] objArr = d389890677992184566.a;
                int i = d389890677992184566.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((dev.epro.r0.B13729205492206812220) objArr[i2]).invoke();
                }
                d389890677992184566.i();
            } finally {
                android.os.Trace.endSection();
            }
        }
    }

    public void f(dev.epro.r0.F819643558874997944 f819643558874997944) {
        dev.epro.r0.D389890677992184566 d389890677992184566 = (dev.epro.r0.D389890677992184566) this.c;
        if (!((dev.epro.r0.E13273723708836014930) this.g).c(f819643558874997944)) {
            dev.epro.r0.E13273723708836014930 e13273723708836014930 = (dev.epro.r0.E13273723708836014930) this.i;
            if (e13273723708836014930 == null || !e13273723708836014930.c(f819643558874997944)) {
                ((dev.epro.r0.D389890677992184566) this.e).b(f819643558874997944);
                return;
            }
            return;
        }
        ((dev.epro.r0.E13273723708836014930) this.g).l(f819643558874997944);
        if (!((dev.epro.r0.D389890677992184566) this.d).l(f819643558874997944) && !d389890677992184566.l(f819643558874997944)) {
            g(f819643558874997944, d389890677992184566);
        }
        java.util.Set set = (java.util.Set) this.a;
        if (set == null) {
            return;
        }
        set.add(f819643558874997944.a);
    }

    public boolean i(android.graphics.Path path, int i) {
        android.graphics.Path path2 = (android.graphics.Path) this.k;
        path2.reset();
        ((dev.epro.r0.K6473381917781246827[]) this.a)[i].b(((android.graphics.Matrix[]) this.b)[i], path2);
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, android.graphics.Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public void j(java.util.Set set, dev.epro.r0.W12685451225593881345 w12685451225593881345) {
        b();
        this.a = set;
        this.b = w12685451225593881345;
    }
}
