package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T5223795089867562870 implements A13182230205880306765 {
    public final byte a;
    public final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public T5223795089867562870(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final long a(I11366018238968599357 i11366018238968599357, long j, long j2) {
        int i = (int) (j >> 32);
        int iD = ((i11366018238968599357.d() - i) / 2) + i11366018238968599357.a;
        if (iD < 0) {
            iD = i11366018238968599357.a;
        } else if (iD + i > ((int) (j2 >> 32))) {
            iD = i11366018238968599357.c - i;
        }
        int i2 = i11366018238968599357.b - ((int) (j & 4294967295L));
        int i3 = this.b;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = i11366018238968599357.d + i3;
        }
        return (((long) iD) << 32) | (((long) i4) & 4294967295L);
    }

    public final long b(I11366018238968599357 i11366018238968599357, long j) {
        int i = i11366018238968599357.a;
        int i2 = this.b;
        int i3 = i - (((int) (j >> 32)) + i2);
        if (i3 < 0) {
            i3 = i11366018238968599357.c + i2;
        }
        return (((long) i3) << 32) | (((long) (((i11366018238968599357.b + i11366018238968599357.d) - ((int) (j & 4294967295L))) / 2)) & 4294967295L);
    }

    public final long c(I11366018238968599357 i11366018238968599357, long j, long j2) {
        int i = i11366018238968599357.c;
        int i2 = this.b;
        int i3 = i + i2;
        int i4 = (int) (j >> 32);
        if (i3 + i4 > ((int) (j2 >> 32))) {
            i3 = i11366018238968599357.a - (i4 + i2);
        }
        return (((long) i3) << 32) | (((long) (((i11366018238968599357.b + i11366018238968599357.d) - ((int) (j & 4294967295L))) / 2)) & 4294967295L);
    }

    @Override // dev.epro.r0.A13182230205880306765
    public final long k(I11366018238968599357 i11366018238968599357, long j, F10342546226345611902 f10342546226345611902, long j2) {
        byte b = this.a;
        if (b == 3) {
            return b(i11366018238968599357, j2);
        }
        if (b == 4) {
            return c(i11366018238968599357, j2, j);
        }
        if (b == 1) {
            return a(i11366018238968599357, j2, j);
        }
        if (b != 2) {
            F10342546226345611902 f103425462263456119022 = F10342546226345611902.a;
            return b == 5 ? f10342546226345611902 == f103425462263456119022 ? b(i11366018238968599357, j2) : c(i11366018238968599357, j2, j) : b == 6 ? f10342546226345611902 == f103425462263456119022 ? c(i11366018238968599357, j2, j) : b(i11366018238968599357, j2) : a(i11366018238968599357, j2, j);
        }
        int i = (int) (j2 >> 32);
        int iD = ((i11366018238968599357.d() - i) / 2) + i11366018238968599357.a;
        if (iD < 0) {
            iD = i11366018238968599357.a;
        } else if (iD + i > ((int) (j >> 32))) {
            iD = i11366018238968599357.c - i;
        }
        int i2 = i11366018238968599357.d;
        int i3 = this.b;
        int i4 = i2 + i3;
        int i5 = (int) (j2 & 4294967295L);
        if (i4 + i5 > ((int) (j & 4294967295L))) {
            i4 = (i11366018238968599357.b - i5) - i3;
        }
        return (((long) iD) << 32) | (((long) i4) & 4294967295L);
    }
}
