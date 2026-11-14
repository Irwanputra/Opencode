package dev.epro.r0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I18375393507362144511 {
    public final ByteBuffer a;
    public F11254987978987383037 b;
    public T17032536773975598836 c;
    public int d;
    public byte e = 1;
    public String f;
    public String g;
    public int h;
    public ArrayList i;
    public ByteBuffer j;
    public int k;

    public I18375393507362144511(ByteBuffer byteBuffer) throws I3603276906376719046 {
        N12245111110189169079 n12245111110189169079F;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.hasRemaining() && (n12245111110189169079F = N12245111110189169079.f(byteBuffer)) != null) {
            if (n12245111110189169079F.b == 3) {
                break;
            }
        }
        n12245111110189169079F = null;
        if (n12245111110189169079F == null) {
            throw new I3603276906376719046("No XML chunk in file");
        }
        this.a = n12245111110189169079F.h();
    }

    public static ByteBuffer f(int i, int i2, ByteBuffer byteBuffer) {
        if (i < 0) {
            S10973172697741180971.j(G6547577305291411977.n(i, "start: "));
            return null;
        }
        if (i2 < i) {
            S10973172697741180971.j(E12098517352909843120.l("end < start: ", i2, i, " < "));
            return null;
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            S10973172697741180971.j(E12098517352909843120.l("end > capacity: ", i2, iCapacity, " > "));
            return null;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(i);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    public static ByteBuffer g(ByteBuffer byteBuffer, long j, long j2) {
        if (j < 0) {
            S10973172697741180971.j(E12098517352909843120.k(j, "start: "));
            return null;
        }
        if (j2 < j) {
            StringBuilder sbR = E12098517352909843120.r("end < start: ", " < ", j2);
            sbR.append(j);
            throw new IllegalArgumentException(sbR.toString());
        }
        int iCapacity = byteBuffer.capacity();
        if (j2 <= byteBuffer.capacity()) {
            return f((int) j, (int) j2, byteBuffer);
        }
        throw new IllegalArgumentException("end > capacity: " + j2 + " > " + iCapacity);
    }

    public final V17270971036940711241 a(int i) {
        if (this.e != 3) {
            W4415201450379021245.a("Current event not a START_ELEMENT");
            return null;
        }
        if (i < 0) {
            W4415201450379021245.a("index must be >= 0");
            return null;
        }
        if (i >= this.h) {
            W4415201450379021245.a(E12098517352909843120.n(new StringBuilder("index must be <= attr count ("), this.h, ")"));
            return null;
        }
        if (this.i == null) {
            this.i = new ArrayList(this.h);
            for (int i2 = 0; i2 < this.h; i2++) {
                int i3 = this.k;
                int i4 = i2 * i3;
                ByteBuffer byteBufferF = f(i4, i3 + i4, this.j);
                byteBufferF.getInt();
                long j = ((long) byteBufferF.getInt()) & 4294967295L;
                byteBufferF.position(byteBufferF.position() + 7);
                this.i.add(new V17270971036940711241(j, byteBufferF.get() & 255, (int) (((long) byteBufferF.getInt()) & 4294967295L), this.b, this.c));
            }
        }
        return (V17270971036940711241) this.i.get(i);
    }

    public final int b(int i) {
        V17270971036940711241 v17270971036940711241A = a(i);
        int i2 = v17270971036940711241A.b;
        if (i2 != 1) {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                    break;
                default:
                    throw new I3603276906376719046(G6547577305291411977.n(i2, "Cannot coerce to int: value type "));
            }
        }
        return v17270971036940711241A.c;
    }

    public final int c(int i) {
        V17270971036940711241 v17270971036940711241A = a(i);
        T17032536773975598836 t17032536773975598836 = v17270971036940711241A.e;
        if (t17032536773975598836 == null) {
            return 0;
        }
        long j = v17270971036940711241A.a;
        if (j < 0 || j >= t17032536773975598836.a) {
            return 0;
        }
        return ((ByteBuffer) t17032536773975598836.b).getInt(((int) j) * 4);
    }

    public final String d(int i) throws I3603276906376719046 {
        V17270971036940711241 v17270971036940711241A = a(i);
        int i2 = v17270971036940711241A.c;
        int i3 = v17270971036940711241A.b;
        if (i3 == 1) {
            return "@" + Integer.toHexString(i2);
        }
        if (i3 == 3) {
            return v17270971036940711241A.d.c(((long) i2) & 4294967295L);
        }
        switch (i3) {
            case 16:
                return Integer.toString(i2);
            case 17:
                return "0x" + Integer.toHexString(i2);
            case 18:
                return Boolean.toString(i2 != 0);
            default:
                throw new I3603276906376719046(G6547577305291411977.n(i3, "Cannot coerce to string: value type "));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ad, code lost:
    
        r20.e = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b0, code lost:
    
        return 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e() {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I18375393507362144511.e():int");
    }
}
