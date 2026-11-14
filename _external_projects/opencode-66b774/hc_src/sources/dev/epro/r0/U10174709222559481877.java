package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U10174709222559481877 {
    public static final long b = J8045362843799184672.f(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final long a;

    static {
        J8045362843799184672.f(4282664004L);
        J8045362843799184672.f(4287137928L);
        c = J8045362843799184672.f(4291611852L);
        d = J8045362843799184672.f(4294967295L);
        e = J8045362843799184672.f(4294901760L);
        J8045362843799184672.f(4278255360L);
        f = J8045362843799184672.f(4278190335L);
        J8045362843799184672.f(4294967040L);
        J8045362843799184672.f(4278255615L);
        J8045362843799184672.f(4294902015L);
        g = J8045362843799184672.e(0);
        float[] fArr = E4238948680093459570.a;
        h = J8045362843799184672.d(0.0f, 0.0f, 0.0f, 0.0f, E4238948680093459570.u);
    }

    public /* synthetic */ U10174709222559481877(long j) {
        this.a = j;
    }

    public static final long a(long j, G5298154673482189769 g5298154673482189769) {
        S5282637534609503170 s5282637534609503170;
        G5298154673482189769 e2 = e(j);
        int i2 = e2.c;
        int i3 = g5298154673482189769.c;
        if ((i2 | i3) < 0) {
            s5282637534609503170 = A10225670138084435446.A(e2, g5298154673482189769);
        } else {
            Q9908018528090167751 q9908018528090167751 = E15414011840509146819.a;
            int i4 = i2 | (i3 << 6);
            Object b2 = q9908018528090167751.b(i4);
            if (b2 == null) {
                b2 = A10225670138084435446.A(e2, g5298154673482189769);
                q9908018528090167751.i(i4, b2);
            }
            s5282637534609503170 = (S5282637534609503170) b2;
        }
        return s5282637534609503170.a(j);
    }

    public static long b(float f2, long j) {
        return J8045362843799184672.d(g(j), f(j), d(j), f2, e(j));
    }

    public static final float c(long j) {
        float t;
        float f2;
        if ((63 & j) == 0) {
            t = (float) Q9282725956684299602.t((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            t = (float) Q9282725956684299602.t((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return t / f2;
    }

    public static final float d(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) Q9282725956684299602.t((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - U3422997631686086993.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final G5298154673482189769 e(long j) {
        float[] fArr = E4238948680093459570.a;
        return E4238948680093459570.y[(int) (j & 63)];
    }

    public static final float f(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) Q9282725956684299602.t((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - U3422997631686086993.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float g(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) Q9282725956684299602.t((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - U3422997631686086993.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String h(long j) {
        float g2 = g(j);
        float f2 = f(j);
        float d2 = d(j);
        float c2 = c(j);
        String str = e(j).a;
        StringBuilder k = G11450220448113054352.k("Color(", g2, ", ", f2, ", ");
        k.append(d2);
        k.append(", ");
        k.append(c2);
        k.append(", ");
        return G6547577305291411977.u(k, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof U10174709222559481877) {
            return this.a == ((U10174709222559481877) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
