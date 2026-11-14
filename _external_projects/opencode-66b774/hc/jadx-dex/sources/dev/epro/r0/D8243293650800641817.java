package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class D8243293650800641817 implements java.lang.Iterable, java.io.Serializable {
    public static final dev.epro.r0.D8243293650800641817 c = new dev.epro.r0.D8243293650800641817(dev.epro.r0.A9187767737237685029.b);
    public static final dev.epro.r0.E17149812035295265804 d;
    public int a = 0;
    public final byte[] b;

    static {
        d = dev.epro.r0.A8141988655906277116.a() ? new dev.epro.r0.E17149812035295265804((byte) 4) : new dev.epro.r0.E17149812035295265804((byte) 3);
    }

    public D8243293650800641817(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            dev.epro.r0.W4415201450379021245.a(dev.epro.r0.G6547577305291411977.o(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            dev.epro.r0.W4415201450379021245.a(dev.epro.r0.E12098517352909843120.l("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        dev.epro.r0.W4415201450379021245.a(dev.epro.r0.E12098517352909843120.l("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static dev.epro.r0.D8243293650800641817 i(int i, byte[] bArr, int i2) {
        byte[] bArrCopyOfRange;
        c(i, i + i2, bArr.length);
        switch (d.a) {
            case 3:
                bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                java.lang.System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new dev.epro.r0.D8243293650800641817(bArrCopyOfRange);
    }

    public byte b(int i) {
        return this.b[i];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof dev.epro.r0.D8243293650800641817) && size() == ((dev.epro.r0.D8243293650800641817) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof dev.epro.r0.D8243293650800641817)) {
                return obj.equals(this);
            }
            dev.epro.r0.D8243293650800641817 d8243293650800641817 = (dev.epro.r0.D8243293650800641817) obj;
            int i = this.a;
            int i2 = d8243293650800641817.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > d8243293650800641817.size()) {
                    dev.epro.r0.Z3383101362411723454.h(size, size());
                    return false;
                }
                if (size > d8243293650800641817.size()) {
                    java.lang.StringBuilder sbQ = dev.epro.r0.E12098517352909843120.q(size, "Ran off end of other: 0, ", ", ");
                    sbQ.append(d8243293650800641817.size());
                    throw new java.lang.IllegalArgumentException(sbQ.toString());
                }
                byte[] bArr = d8243293650800641817.b;
                int iK = k() + size;
                int iK2 = k();
                int iK3 = d8243293650800641817.k();
                while (iK2 < iK) {
                    if (this.b[iK2] == bArr[iK3]) {
                        iK2++;
                        iK3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iK = k();
        int i2 = size;
        for (int i3 = iK; i3 < iK + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new dev.epro.r0.E6859840916608331672(this);
    }

    public void j(int i, byte[] bArr) {
        java.lang.System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public int k() {
        return 0;
    }

    public byte l(int i) {
        return this.b[i];
    }

    public int size() {
        return this.b.length;
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = dev.epro.r0.E14308387479134424328.i(this);
        } else {
            int iC = c(0, 47, size());
            strConcat = dev.epro.r0.E14308387479134424328.i(iC == 0 ? c : new dev.epro.r0.E5309387686778154323(this.b, k(), iC)).concat("...");
        }
        return dev.epro.r0.G6547577305291411977.u(dev.epro.r0.G6547577305291411977.x(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
