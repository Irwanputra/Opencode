package dev.epro.r0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K6473381917781246827 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public K6473381917781246827() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        N11020017223587803565 n11020017223587803565 = new N11020017223587803565(f4, f5, f4, f5);
        n11020017223587803565.f = this.d;
        n11020017223587803565.g = f3;
        this.g.add(new O3040981991330091368(n11020017223587803565));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Y5826249320482397604) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        A10893230477173419393 a10893230477173419393 = new A10893230477173419393();
        a10893230477173419393.b = f;
        a10893230477173419393.c = f2;
        this.f.add(a10893230477173419393);
        Y18442090079458478045 y18442090079458478045 = new Y18442090079458478045(a10893230477173419393, this.b, this.c);
        float b = y18442090079458478045.b() + 270.0f;
        float b2 = y18442090079458478045.b() + 270.0f;
        a(b);
        this.g.add(y18442090079458478045);
        this.d = b2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
