package dev.epro.r0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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

    public I18375393507362144511(ByteBuffer byteBuffer) {
        N12245111110189169079 n12245111110189169079;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.hasRemaining() && (n12245111110189169079 = N12245111110189169079.f(byteBuffer)) != null) {
            if (n12245111110189169079.b == 3) {
                break;
            }
        }
        n12245111110189169079 = null;
        if (n12245111110189169079 == null) {
            throw new I3603276906376719046("No XML chunk in file");
        }
        this.a = n12245111110189169079.h();
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
        int capacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            S10973172697741180971.j(E12098517352909843120.l("end > capacity: ", i2, capacity, " > "));
            return null;
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(i);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    public static ByteBuffer g(ByteBuffer byteBuffer, long j, long j2) {
        if (j < 0) {
            S10973172697741180971.j(E12098517352909843120.k(j, "start: "));
            return null;
        }
        if (j2 < j) {
            StringBuilder r = E12098517352909843120.r("end < start: ", " < ", j2);
            r.append(j);
            throw new IllegalArgumentException(r.toString());
        }
        int capacity = byteBuffer.capacity();
        if (j2 <= byteBuffer.capacity()) {
            return f((int) j, (int) j2, byteBuffer);
        }
        throw new IllegalArgumentException("end > capacity: " + j2 + " > " + capacity);
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
                ByteBuffer f = f(i4, i3 + i4, this.j);
                f.getInt();
                f.position(f.position() + 7);
                this.i.add(new V17270971036940711241(f.getInt() & 4294967295L, f.get() & 255, (int) (f.getInt() & 4294967295L), this.b, this.c));
            }
        }
        return (V17270971036940711241) this.i.get(i);
    }

    public final int b(int i) {
        V17270971036940711241 a = a(i);
        int i2 = a.b;
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
        return a.c;
    }

    public final int c(int i) {
        V17270971036940711241 a = a(i);
        T17032536773975598836 t17032536773975598836 = a.e;
        if (t17032536773975598836 == null) {
            return 0;
        }
        long j = a.a;
        if (j < 0 || j >= t17032536773975598836.a) {
            return 0;
        }
        return ((ByteBuffer) t17032536773975598836.b).getInt(((int) j) * 4);
    }

    public final String d(int i) {
        V17270971036940711241 a = a(i);
        int i2 = a.c;
        int i3 = a.b;
        if (i3 == 1) {
            return "@" + Integer.toHexString(i2);
        }
        if (i3 == 3) {
            return a.d.c(i2 & 4294967295L);
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

    public final int e() {
        N12245111110189169079 f;
        int i;
        int i2 = 1;
        if (this.e == 4) {
            this.d--;
        }
        while (true) {
            ByteBuffer byteBuffer = this.a;
            if (!byteBuffer.hasRemaining() || (f = N12245111110189169079.f(byteBuffer)) == null) {
                break;
            }
            int i3 = f.b;
            if (i3 == i2) {
                i = i2;
                if (this.b != null) {
                    throw new I3603276906376719046("Multiple string pools not supported");
                }
                this.b = new F11254987978987383037(f);
            } else if (i3 != 384) {
                if (i3 == 258) {
                    if (this.b == null) {
                        throw new I3603276906376719046("Named element encountered before string pool");
                    }
                    ByteBuffer h = f.h();
                    if (h.remaining() < 20) {
                        throw new I3603276906376719046("Start element chunk too short. Need at least 20 bytes. Available: " + h.remaining() + " bytes");
                    }
                    long j = h.getInt() & 4294967295L;
                    long j2 = h.getInt() & 4294967295L;
                    int i4 = h.getShort() & 65535;
                    int i5 = h.getShort() & 65535;
                    int i6 = 65535 & h.getShort();
                    long j3 = i4;
                    long j4 = (i6 * i5) + j3;
                    h.position(0);
                    if (i4 > h.remaining()) {
                        StringBuilder q = E12098517352909843120.q(i4, "Attributes start offset out of bounds: ", ", max: ");
                        q.append(h.remaining());
                        throw new I3603276906376719046(q.toString());
                    }
                    if (j4 > h.remaining()) {
                        StringBuilder r = E12098517352909843120.r("Attributes end offset out of bounds: ", ", max: ", j4);
                        r.append(h.remaining());
                        throw new I3603276906376719046(r.toString());
                    }
                    this.f = this.b.c(j2);
                    this.g = j == 4294967295L ? "" : this.b.c(j);
                    this.h = i6;
                    this.i = null;
                    this.k = i5;
                    this.j = g(h, j3, j4);
                    this.d++;
                    this.e = (byte) 3;
                    return 3;
                }
                if (i3 == 259) {
                    if (this.b == null) {
                        throw new I3603276906376719046("Named element encountered before string pool");
                    }
                    ByteBuffer h2 = f.h();
                    if (h2.remaining() < 8) {
                        throw new I3603276906376719046("End element chunk too short. Need at least 8 bytes. Available: " + h2.remaining() + " bytes");
                    }
                    long j5 = h2.getInt() & 4294967295L;
                    this.f = this.b.c(h2.getInt() & 4294967295L);
                    this.g = j5 != 4294967295L ? this.b.c(j5) : "";
                    this.e = (byte) 4;
                    this.i = null;
                    this.j = null;
                    return 4;
                }
                i = i2;
            } else {
                i = i2;
                if (this.c != null) {
                    throw new I3603276906376719046("Multiple resource maps not supported");
                }
                T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
                ByteBuffer slice = f.h().slice();
                t17032536773975598836.b = slice;
                slice.order(f.h().order());
                t17032536773975598836.a = slice.remaining() / 4;
                this.c = t17032536773975598836;
            }
            i2 = i;
        }
        this.e = (byte) 2;
        return 2;
    }
}
