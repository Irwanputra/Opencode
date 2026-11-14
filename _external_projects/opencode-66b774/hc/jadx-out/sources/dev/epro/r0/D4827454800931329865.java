package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D4827454800931329865 implements C2322693828285680440 {
    public final int a;
    public final int b;

    public D4827454800931329865(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // dev.epro.r0.C2322693828285680440
    public final void a(K15317901533566777301 k15317901533566777301) {
        int iQ = W7808703833045379622.q(this.a, 0, k15317901533566777301.a.c());
        int iQ2 = W7808703833045379622.q(this.b, 0, k15317901533566777301.a.c());
        if (iQ < iQ2) {
            k15317901533566777301.f(iQ, iQ2);
        } else {
            k15317901533566777301.f(iQ2, iQ);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D4827454800931329865)) {
            return false;
        }
        D4827454800931329865 d4827454800931329865 = (D4827454800931329865) obj;
        return this.a == d4827454800931329865.a && this.b == d4827454800931329865.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return G11450220448113054352.h(this.a, this.b, "SetSelectionCommand(start=", ", end=", ")");
    }
}
