package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V4878375136513573151 {
    public V8232844453216786975 a;
    public int b;
    public M7798980774515057476 c;
    public L12639328004344855510 d;
    public int e;
    public M8849337839148886240 f;
    public A4559761392562572984 g;

    public V4878375136513573151(V8232844453216786975 v8232844453216786975) {
        this.a = v8232844453216786975;
    }

    public final boolean a() {
        if (this.a != null) {
            M7798980774515057476 m7798980774515057476 = this.c;
            if (m7798980774515057476 != null ? m7798980774515057476.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final O4470875117480878473 b(Object obj) {
        O4470875117480878473 e;
        V8232844453216786975 v8232844453216786975 = this.a;
        return (v8232844453216786975 == null || (e = v8232844453216786975.e(this, obj)) == null) ? O4470875117480878473.a : e;
    }

    public final void c() {
        V8232844453216786975 v8232844453216786975 = this.a;
        if (v8232844453216786975 != null) {
            v8232844453216786975.b();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
