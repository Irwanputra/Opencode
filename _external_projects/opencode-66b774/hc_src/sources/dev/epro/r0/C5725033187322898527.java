package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C5725033187322898527 implements C2322693828285680440 {
    public final int a;
    public final int b;

    public C5725033187322898527(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // dev.epro.r0.C2322693828285680440
    public final void a(K15317901533566777301 k15317901533566777301) {
        boolean z = k15317901533566777301.d != -1;
        I15162792415829416729 i15162792415829416729 = k15317901533566777301.a;
        if (z) {
            k15317901533566777301.d = -1;
            k15317901533566777301.e = -1;
        }
        int q = W7808703833045379622.q(this.a, 0, i15162792415829416729.c());
        int q2 = W7808703833045379622.q(this.b, 0, i15162792415829416729.c());
        if (q != q2) {
            if (q < q2) {
                k15317901533566777301.e(q, q2);
            } else {
                k15317901533566777301.e(q2, q);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5725033187322898527)) {
            return false;
        }
        C5725033187322898527 c5725033187322898527 = (C5725033187322898527) obj;
        return this.a == c5725033187322898527.a && this.b == c5725033187322898527.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return G11450220448113054352.h(this.a, this.b, "SetComposingRegionCommand(start=", ", end=", ")");
    }
}
