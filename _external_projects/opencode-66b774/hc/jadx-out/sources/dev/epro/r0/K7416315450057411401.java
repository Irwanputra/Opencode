package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K7416315450057411401 implements B9345618057833789735 {
    public final short a;
    public final String b;
    public final V697849047308847220 c = V4416135141588678913.t(Z1975157152518754667.e);
    public final V697849047308847220 d = V4416135141588678913.t(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public K7416315450057411401(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int a(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        return e().a;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int b(R8540738700654750557 r8540738700654750557) {
        return e().b;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int c(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        return e().c;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int d(R8540738700654750557 r8540738700654750557) {
        return e().d;
    }

    public final Z1975157152518754667 e() {
        return (Z1975157152518754667) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K7416315450057411401) {
            return this.a == ((K7416315450057411401) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(N3121440022506799205 n3121440022506799205, int i) {
        short s = this.a;
        if (i == 0 || (i & s) != 0) {
            this.c.setValue(n3121440022506799205.a.i(s));
            f(n3121440022506799205.a.u(s));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ")";
    }
}
