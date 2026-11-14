package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q16155885045079384933 implements B9345618057833789735 {
    public final String a;
    public final V697849047308847220 b;

    public Q16155885045079384933(N14790519616779385252 n14790519616779385252, String str) {
        this.a = str;
        this.b = V4416135141588678913.t(n14790519616779385252);
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

    public final N14790519616779385252 e() {
        return (N14790519616779385252) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q16155885045079384933) {
            return S10823041268949770285.t(e(), ((Q16155885045079384933) obj).e());
        }
        return false;
    }

    public final void f(N14790519616779385252 n14790519616779385252) {
        this.b.setValue(n14790519616779385252);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
