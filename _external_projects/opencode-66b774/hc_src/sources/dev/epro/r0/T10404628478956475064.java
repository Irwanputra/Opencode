package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T10404628478956475064 implements H15322912479122270765 {
    public final boolean a;
    public final float b;
    public final long c;

    public T10404628478956475064(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // dev.epro.r0.H15322912479122270765
    public final R16749699847173633337 a(D5961215468735357278 d5961215468735357278) {
        return new H325378938050259142(d5961215468735357278, this.a, this.b, new C5950695083679873225(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T10404628478956475064)) {
            return false;
        }
        T10404628478956475064 t10404628478956475064 = (T10404628478956475064) obj;
        if (this.a != t10404628478956475064.a || !A891803927997771281.b(this.b, t10404628478956475064.b)) {
            return false;
        }
        long j = t10404628478956475064.c;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.c, j);
    }

    @Override // dev.epro.r0.H15322912479122270765
    public final int hashCode() {
        int e = E12098517352909843120.e(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = U10174709222559481877.i;
        return Long.hashCode(this.c) + e;
    }
}
