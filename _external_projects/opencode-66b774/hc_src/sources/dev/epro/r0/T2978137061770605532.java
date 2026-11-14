package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T2978137061770605532 {

    @O7462376509978667369("package_version")
    public String a;

    public T2978137061770605532(int i) {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T2978137061770605532) && S10823041268949770285.t(this.a, ((T2978137061770605532) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return G6547577305291411977.s("PlayStoreSignals(playStoreVersion=", this.a, ")");
    }

    public T2978137061770605532() {
        this(0);
    }
}
