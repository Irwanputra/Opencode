package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N42765300390889244 {

    @O7462376509978667369("app")
    public final C11752927553109765869 a;

    public N42765300390889244(C11752927553109765869 c11752927553109765869) {
        c11752927553109765869.getClass();
        this.a = c11752927553109765869;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N42765300390889244) && S10823041268949770285.t(this.a, ((N42765300390889244) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QualitySignals(appStats=" + this.a + ")";
    }
}
