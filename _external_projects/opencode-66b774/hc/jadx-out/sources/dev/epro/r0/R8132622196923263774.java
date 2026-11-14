package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R8132622196923263774 implements J4847702399749976603 {
    public final int a;

    public R8132622196923263774(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof R8132622196923263774) && this.a == ((R8132622196923263774) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return G6547577305291411977.o(this.a, "AndroidFontResolveInterceptor(fontWeightAdjustment=", ")");
    }
}
