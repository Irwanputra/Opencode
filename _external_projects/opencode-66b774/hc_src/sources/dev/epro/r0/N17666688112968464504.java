package dev.epro.r0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class N17666688112968464504 implements Iterable, Serializable {
    public static final M18082356575916498704 b = new M18082356575916498704(S15638288480382345131.b);
    public static final M10846389789027735899 c;
    public int a;

    static {
        c = E6993330184355272251.a() ? new M10846389789027735899((byte) 4) : new M10846389789027735899((byte) 3);
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

    public static M18082356575916498704 i(int i, byte[] bArr, int i2) {
        byte[] copyOfRange;
        c(i, i + i2, bArr.length);
        switch (c.a) {
            case 3:
                copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                copyOfRange = new byte[i2];
                System.arraycopy(bArr, i, copyOfRange, 0, i2);
                break;
        }
        return new M18082356575916498704(copyOfRange);
    }

    public abstract byte b(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        M18082356575916498704 m18082356575916498704 = (M18082356575916498704) this;
        int l = m18082356575916498704.l();
        int i2 = size;
        for (int i3 = l; i3 < l + size; i3++) {
            i2 = (i2 * 31) + m18082356575916498704.d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    public abstract void j(int i, byte[] bArr);

    public final byte[] k() {
        int size = size();
        if (size == 0) {
            return S15638288480382345131.b;
        }
        byte[] bArr = new byte[size];
        j(size, bArr);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = U1554499319261669842.o(this);
        } else {
            M18082356575916498704 m18082356575916498704 = (M18082356575916498704) this;
            int c2 = c(0, 47, m18082356575916498704.size());
            concat = U1554499319261669842.o(c2 == 0 ? b : new F4816433342645112776(m18082356575916498704.d, m18082356575916498704.l(), c2)).concat("...");
        }
        return G6547577305291411977.u(G6547577305291411977.x(size, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
