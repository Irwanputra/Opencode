package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P11184147566986477297 {
    public long a;
    public Object b;

    public P11184147566986477297(R7000310675073492254 r7000310675073492254, int i) {
        this(0L, (i & 1) != 0 ? null : r7000310675073492254);
    }

    public static long a(P11184147566986477297 p11184147566986477297, long j, float f) {
        long f2 = L2216691091636065972.f(p11184147566986477297.a, j);
        p11184147566986477297.a = f2;
        float c = ((R7000310675073492254) p11184147566986477297.b) == null ? L2216691091636065972.c(f2) : Math.abs(p11184147566986477297.b(f2));
        if (c <= 0.0f || c < f) {
            return 9205357640488583168L;
        }
        R7000310675073492254 r7000310675073492254 = (R7000310675073492254) p11184147566986477297.b;
        long j2 = p11184147566986477297.a;
        if (r7000310675073492254 == null) {
            float c2 = L2216691091636065972.c(j2);
            return L2216691091636065972.e(p11184147566986477297.a, L2216691091636065972.g(f, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / c2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / c2) & 4294967295L)));
        }
        float b = p11184147566986477297.b(j2) - (Math.signum(p11184147566986477297.b(p11184147566986477297.a)) * f);
        long j3 = p11184147566986477297.a;
        R7000310675073492254 r70003106750734922542 = (R7000310675073492254) p11184147566986477297.b;
        R7000310675073492254 r70003106750734922543 = R7000310675073492254.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (r70003106750734922542 == r70003106750734922543 ? j3 & 4294967295L : j3 >> 32));
        if (((R7000310675073492254) p11184147566986477297.b) == r70003106750734922543) {
            return (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public float b(long j) {
        return Float.intBitsToFloat((int) (((R7000310675073492254) this.b) == R7000310675073492254.b ? j >> 32 : j & 4294967295L));
    }

    public F12902864952249894497 c() {
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 2);
        while (true) {
            String o2 = ((T13344602445187831655) this.b).o(this.a);
            this.a -= o2.length();
            if (o2.length() == 0) {
                return X7410747940286448830.d(v14323974914327418545);
            }
            int V = M8927913404651150384.V(o2, ':', 1, 4);
            if (V != -1) {
                X7410747940286448830.c(v14323974914327418545, o2.substring(0, V), o2.substring(V + 1));
            } else if (o2.charAt(0) == ':') {
                X7410747940286448830.c(v14323974914327418545, "", o2.substring(1));
            } else {
                X7410747940286448830.c(v14323974914327418545, "", o2);
            }
        }
    }

    public P11184147566986477297(long j, R7000310675073492254 r7000310675073492254) {
        this.b = r7000310675073492254;
        this.a = j;
    }
}
