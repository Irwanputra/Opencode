package dev.epro.r0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class D8243293650800641817 implements Iterable, Serializable {
    public static final D8243293650800641817 c = new D8243293650800641817(A9187767737237685029.b);
    public static final E17149812035295265804 d;
    public int a = 0;
    public final byte[] b;

    static {
        d = A8141988655906277116.a() ? new E17149812035295265804((byte) 4) : new E17149812035295265804((byte) 3);
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
            W4415201450379021245.a(G6547577305291411977.o(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            W4415201450379021245.a(E12098517352909843120.l("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        W4415201450379021245.a(E12098517352909843120.l("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static D8243293650800641817 i(int i, byte[] bArr, int i2) {
        byte[] copyOfRange;
        c(i, i + i2, bArr.length);
        switch (d.a) {
            case 3:
                copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                copyOfRange = new byte[i2];
                System.arraycopy(bArr, i, copyOfRange, 0, i2);
                break;
        }
        return new D8243293650800641817(copyOfRange);
    }

    public byte b(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof D8243293650800641817) && size() == ((D8243293650800641817) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof D8243293650800641817)) {
                return obj.equals(this);
            }
            D8243293650800641817 d8243293650800641817 = (D8243293650800641817) obj;
            int i = this.a;
            int i2 = d8243293650800641817.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > d8243293650800641817.size()) {
                    Z3383101362411723454.h(size, size());
                    return false;
                }
                if (size > d8243293650800641817.size()) {
                    StringBuilder q = E12098517352909843120.q(size, "Ran off end of other: 0, ", ", ");
                    q.append(d8243293650800641817.size());
                    throw new IllegalArgumentException(q.toString());
                }
                byte[] bArr = d8243293650800641817.b;
                int k = k() + size;
                int k2 = k();
                int k3 = d8243293650800641817.k();
                while (k2 < k) {
                    if (this.b[k2] == bArr[k3]) {
                        k2++;
                        k3++;
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
        int k = k();
        int i2 = size;
        for (int i3 = k; i3 < k + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new E6859840916608331672(this);
    }

    public void j(int i, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i);
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

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = E14308387479134424328.i(this);
        } else {
            int c2 = c(0, 47, size());
            concat = E14308387479134424328.i(c2 == 0 ? c : new E5309387686778154323(this.b, k(), c2)).concat("...");
        }
        return G6547577305291411977.u(G6547577305291411977.x(size, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
