package dev.epro.r0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W13667419966741979084 extends S7670568931305003909 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARN: Multi-variable type inference failed */
    public W13667419966741979084(W13667419966741979084 w13667419966741979084, O827298036535440209 o827298036535440209) {
        T11122899614028670287 t11122899614028670287;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = w13667419966741979084.c;
        this.d = w13667419966741979084.d;
        this.e = w13667419966741979084.e;
        this.f = w13667419966741979084.f;
        this.g = w13667419966741979084.g;
        this.h = w13667419966741979084.h;
        this.i = w13667419966741979084.i;
        String str = w13667419966741979084.k;
        this.k = str;
        if (str != null) {
            o827298036535440209.put(str, this);
        }
        matrix.set(w13667419966741979084.j);
        ArrayList arrayList = w13667419966741979084.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof W13667419966741979084) {
                this.b.add(new W13667419966741979084((W13667419966741979084) obj, o827298036535440209));
            } else {
                if (obj instanceof H12107640128773434115) {
                    H12107640128773434115 h12107640128773434115 = (H12107640128773434115) obj;
                    H12107640128773434115 h121076401287734341152 = new H12107640128773434115(h12107640128773434115);
                    h121076401287734341152.e = 0.0f;
                    h121076401287734341152.g = 1.0f;
                    h121076401287734341152.h = 1.0f;
                    h121076401287734341152.i = 0.0f;
                    h121076401287734341152.j = 1.0f;
                    h121076401287734341152.k = 0.0f;
                    h121076401287734341152.l = Paint.Cap.BUTT;
                    h121076401287734341152.m = Paint.Join.MITER;
                    h121076401287734341152.n = 4.0f;
                    h121076401287734341152.d = h12107640128773434115.d;
                    h121076401287734341152.e = h12107640128773434115.e;
                    h121076401287734341152.g = h12107640128773434115.g;
                    h121076401287734341152.f = h12107640128773434115.f;
                    h121076401287734341152.c = h12107640128773434115.c;
                    h121076401287734341152.h = h12107640128773434115.h;
                    h121076401287734341152.i = h12107640128773434115.i;
                    h121076401287734341152.j = h12107640128773434115.j;
                    h121076401287734341152.k = h12107640128773434115.k;
                    h121076401287734341152.l = h12107640128773434115.l;
                    h121076401287734341152.m = h12107640128773434115.m;
                    h121076401287734341152.n = h12107640128773434115.n;
                    t11122899614028670287 = h121076401287734341152;
                } else {
                    if (!(obj instanceof T11122899614028670287)) {
                        S10973172697741180971.m("Unknown object in the tree!");
                        throw null;
                    }
                    t11122899614028670287 = new T11122899614028670287((T11122899614028670287) obj);
                }
                this.b.add(t11122899614028670287);
                Object obj2 = t11122899614028670287.b;
                if (obj2 != null) {
                    o827298036535440209.put(obj2, t11122899614028670287);
                }
            }
        }
    }

    @Override // dev.epro.r0.S7670568931305003909
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((S7670568931305003909) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // dev.epro.r0.S7670568931305003909
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((S7670568931305003909) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public W13667419966741979084() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
