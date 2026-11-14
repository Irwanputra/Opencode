package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L13686798803278025478 implements C2322693828285680440 {
    public final int a;
    public final int b;

    public L13686798803278025478(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        T12055643479535528558.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // dev.epro.r0.C2322693828285680440
    public final void a(K15317901533566777301 k15317901533566777301) {
        int i = k15317901533566777301.c;
        I15162792415829416729 i15162792415829416729 = k15317901533566777301.a;
        int i2 = this.b;
        int iC = i + i2;
        if (((i ^ iC) & (i2 ^ iC)) < 0) {
            iC = i15162792415829416729.c();
        }
        k15317901533566777301.a(k15317901533566777301.c, Math.min(iC, i15162792415829416729.c()));
        int i3 = k15317901533566777301.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        k15317901533566777301.a(Math.max(0, i5), k15317901533566777301.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L13686798803278025478)) {
            return false;
        }
        L13686798803278025478 l13686798803278025478 = (L13686798803278025478) obj;
        return this.a == l13686798803278025478.a && this.b == l13686798803278025478.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return G11450220448113054352.h(this.a, this.b, "DeleteSurroundingTextCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}
