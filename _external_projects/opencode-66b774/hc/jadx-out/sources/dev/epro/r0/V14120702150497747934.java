package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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
        float fIntBitsToFloat = Float.intBitsToFloat(0);
        float fIntBitsToFloat2 = Float.intBitsToFloat(0);
        Float.floatToRawIntBits(fIntBitsToFloat);
        Float.floatToRawIntBits(fIntBitsToFloat2);
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
        String strK = D15913187640519482289.K(this.a);
        String strK2 = D15913187640519482289.K(this.b);
        String strK3 = D15913187640519482289.K(this.c);
        String strK4 = D15913187640519482289.K(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(strK);
        sb.append(", ");
        sb.append(strK2);
        sb.append(", ");
        sb.append(strK3);
        String strU = G6547577305291411977.u(sb, ", ", strK4);
        long j = this.e;
        long j2 = this.f;
        boolean zC = S2941385686793915703.C(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (zC && S2941385686793915703.C(j2, j3) && S2941385686793915703.C(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return E12098517352909843120.m("RoundRect(rect=", strU, ", radius=", D15913187640519482289.K(Float.intBitsToFloat(i)), ")");
            }
            String strK5 = D15913187640519482289.K(Float.intBitsToFloat(i));
            return G6547577305291411977.u(G6547577305291411977.y("RoundRect(rect=", strU, ", x=", strK5, ", y="), D15913187640519482289.K(Float.intBitsToFloat(i2)), ")");
        }
        String strF0 = S2941385686793915703.f0(j);
        String strF02 = S2941385686793915703.f0(j2);
        String strF03 = S2941385686793915703.f0(j3);
        String strF04 = S2941385686793915703.f0(j4);
        StringBuilder sbY = G6547577305291411977.y("RoundRect(rect=", strU, ", topLeft=", strF0, ", topRight=");
        G6547577305291411977.B(sbY, strF02, ", bottomRight=", strF03, ", bottomLeft=");
        return G6547577305291411977.u(sbY, strF04, ")");
    }
}
