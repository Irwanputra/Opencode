package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S4320905983517725173 implements I2388620560486547149, AutoCloseable {
    public final String a;
    public final L13135072960070674001 b;
    public boolean c;

    public S4320905983517725173(String str, L13135072960070674001 l13135072960070674001) {
        this.a = str;
        this.b = l13135072960070674001;
    }

    @Override // dev.epro.r0.I2388620560486547149
    public final void d(I4293432593871965076 i4293432593871965076, P72364327365747079 p72364327365747079) {
        if (p72364327365747079 == P72364327365747079.ON_DESTROY) {
            this.c = false;
            i4293432593871965076.j().b(this);
        }
    }

    public final void g(V10300877997588547986 v10300877997588547986, R3192876217964974737 r3192876217964974737) {
        v10300877997588547986.getClass();
        r3192876217964974737.getClass();
        if (this.c) {
            S10973172697741180971.m("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        r3192876217964974737.a(this);
        v10300877997588547986.y(this.a, (N8459270538234465343) this.b.b.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
