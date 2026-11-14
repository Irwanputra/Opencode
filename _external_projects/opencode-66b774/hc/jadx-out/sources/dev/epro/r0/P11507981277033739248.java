package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P11507981277033739248 {
    public final T5853297761459116769 a;
    public final boolean b;
    public final L9201360080215238538 c;
    public final F4096073349764486348 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public P11507981277033739248(T5853297761459116769 t5853297761459116769, Object obj, boolean z, L9201360080215238538 l9201360080215238538, F4096073349764486348 f4096073349764486348, boolean z2) {
        this.a = t5853297761459116769;
        this.b = z;
        this.c = l9201360080215238538;
        this.d = f4096073349764486348;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        N2332913310205178802.b("Unexpected form of a provided value");
        Z3383101362411723454.n();
        return null;
    }
}
