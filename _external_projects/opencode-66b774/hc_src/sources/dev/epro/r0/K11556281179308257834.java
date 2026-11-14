package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K11556281179308257834 extends F3160751278268780235 {
    public int c;
    public int d;
    public final int e;
    public final int f;
    public int g = Integer.MAX_VALUE;

    public K11556281179308257834(byte[] bArr, int i, int i2, boolean z) {
        this.c = i2 + i;
        this.e = i;
        this.f = i;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int b() {
        return this.e - this.f;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int j(int i) {
        if (i < 0) {
            throw F10620977331851870088.d();
        }
        int b = b() + i;
        if (b < 0) {
            throw new F10620977331851870088("Failed to parse the message.");
        }
        int i2 = this.g;
        if (b > i2) {
            throw F10620977331851870088.e();
        }
        this.g = b;
        int i3 = this.c + this.d;
        this.c = i3;
        int i4 = i3 - this.f;
        int i5 = this.g;
        if (i4 > i5) {
            int i6 = i4 - i5;
            this.d = i6;
            this.c = i3 - i6;
        } else {
            this.d = 0;
        }
        return i2;
    }
}
