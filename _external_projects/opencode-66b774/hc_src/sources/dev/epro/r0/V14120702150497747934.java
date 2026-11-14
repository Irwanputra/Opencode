package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V14120702150497747934 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        float intBitsToFloat = Float.intBitsToFloat(0);
        float intBitsToFloat2 = Float.intBitsToFloat(0);
        Float.floatToRawIntBits(intBitsToFloat);
        Float.floatToRawIntBits(intBitsToFloat2);
    }

    public V14120702150497747934(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V14120702150497747934)) {
            return false;
        }
        V14120702150497747934 v14120702150497747934 = (V14120702150497747934) obj;
        return Float.compare(this.a, v14120702150497747934.a) == 0 && Float.compare(this.b, v14120702150497747934.b) == 0 && Float.compare(this.c, v14120702150497747934.c) == 0 && Float.compare(this.d, v14120702150497747934.d) == 0 && S2941385686793915703.C(this.e, v14120702150497747934.e) && S2941385686793915703.C(this.f, v14120702150497747934.f) && S2941385686793915703.C(this.g, v14120702150497747934.g) && S2941385686793915703.C(this.h, v14120702150497747934.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(E12098517352909843120.e(this.d, E12098517352909843120.e(this.c, E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        String K = D15913187640519482289.K(this.a);
        String K2 = D15913187640519482289.K(this.b);
        String K3 = D15913187640519482289.K(this.c);
        String K4 = D15913187640519482289.K(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(K);
        sb.append(", ");
        sb.append(K2);
        sb.append(", ");
        sb.append(K3);
        String u = G6547577305291411977.u(sb, ", ", K4);
        long j = this.e;
        long j2 = this.f;
        boolean C = S2941385686793915703.C(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (C && S2941385686793915703.C(j2, j3) && S2941385686793915703.C(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return E12098517352909843120.m("RoundRect(rect=", u, ", radius=", D15913187640519482289.K(Float.intBitsToFloat(i)), ")");
            }
            String K5 = D15913187640519482289.K(Float.intBitsToFloat(i));
            return G6547577305291411977.u(G6547577305291411977.y("RoundRect(rect=", u, ", x=", K5, ", y="), D15913187640519482289.K(Float.intBitsToFloat(i2)), ")");
        }
        String f0 = S2941385686793915703.f0(j);
        String f02 = S2941385686793915703.f0(j2);
        String f03 = S2941385686793915703.f0(j3);
        String f04 = S2941385686793915703.f0(j4);
        StringBuilder y = G6547577305291411977.y("RoundRect(rect=", u, ", topLeft=", f0, ", topRight=");
        G6547577305291411977.B(y, f02, ", bottomRight=", f03, ", bottomLeft=");
        return G6547577305291411977.u(y, f04, ")");
    }
}
