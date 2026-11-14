package dev.epro.r0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M4537250314578012586 {
    public final byte[] a;
    public final int b;

    public M4537250314578012586(byte[] bArr) {
        this.a = bArr;
        this.b = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M4537250314578012586)) {
            return false;
        }
        M4537250314578012586 m4537250314578012586 = (M4537250314578012586) obj;
        return this.b == m4537250314578012586.b && Arrays.equals(this.a, m4537250314578012586.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
