package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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
        S5282637534609503170 s5282637534609503170A;
        G5298154673482189769 g5298154673482189769E = e(j);
        int i2 = g5298154673482189769E.c;
        int i3 = g5298154673482189769.c;
        if ((i2 | i3) < 0) {
            s5282637534609503170A = A10225670138084435446.A(g5298154673482189769E, g5298154673482189769);
        } else {
            Q9908018528090167751 q9908018528090167751 = E15414011840509146819.a;
            int i4 = i2 | (i3 << 6);
            Object objB = q9908018528090167751.b(i4);
            if (objB == null) {
                objB = A10225670138084435446.A(g5298154673482189769E, g5298154673482189769);
                q9908018528090167751.i(i4, objB);
            }
            s5282637534609503170A = (S5282637534609503170) objB;
        }
        return s5282637534609503170A.a(j);
    }

    public static long b(float f2, long j) {
        return J8045362843799184672.d(g(j), f(j), d(j), f2, e(j));
    }

    public static final float c(long j) {
        float fT;
        float f2;
        if ((63 & j) == 0) {
            fT = (float) Q9282725956684299602.t((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fT = (float) Q9282725956684299602.t((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fT / f2;
    }

    public static final float d(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) Q9282725956684299602.t((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - U3422997631686086993.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
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
        int i5 = Short.MIN_VALUE & s;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - U3422997631686086993.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
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
        int i5 = Short.MIN_VALUE & s;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - U3422997631686086993.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String h(long j) {
        float fG = g(j);
        float f2 = f(j);
        float fD = d(j);
        float fC = c(j);
        String str = e(j).a;
        StringBuilder sbK = G11450220448113054352.k("Color(", fG, ", ", f2, ", ");
        sbK.append(fD);
        sbK.append(", ");
        sbK.append(fC);
        sbK.append(", ");
        return G6547577305291411977.u(sbK, str, ")");
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
