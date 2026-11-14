package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D17975288941580018327 implements C2322693828285680440 {
    public final int a;
    public final int b;

    public D17975288941580018327(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        T12055643479535528558.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // dev.epro.r0.C2322693828285680440
    public final void a(K15317901533566777301 k15317901533566777301) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = k15317901533566777301.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(k15317901533566777301.b((i5 - i4) + (-1))) && Character.isLowSurrogate(k15317901533566777301.b(k15317901533566777301.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iC = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i6 = iC + 1;
            int i7 = k15317901533566777301.c;
            I15162792415829416729 i15162792415829416729 = k15317901533566777301.a;
            if (i7 + i6 >= i15162792415829416729.c()) {
                iC = i15162792415829416729.c() - k15317901533566777301.c;
                break;
            } else {
                iC = (Character.isHighSurrogate(k15317901533566777301.b((k15317901533566777301.c + i6) + (-1))) && Character.isLowSurrogate(k15317901533566777301.b(k15317901533566777301.c + i6))) ? iC + 2 : i6;
                i++;
            }
        }
        int i8 = k15317901533566777301.c;
        k15317901533566777301.a(i8, iC + i8);
        int i9 = k15317901533566777301.b;
        k15317901533566777301.a(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D17975288941580018327)) {
            return false;
        }
        D17975288941580018327 d17975288941580018327 = (D17975288941580018327) obj;
        return this.a == d17975288941580018327.a && this.b == d17975288941580018327.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return G11450220448113054352.h(this.a, this.b, "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}
