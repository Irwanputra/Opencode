package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X3174009376965511256 {
    public static final X3174009376965511256 a;

    static {
        X3174009376965511256 x3174009376965511256 = new X3174009376965511256();
        if (A891803927997771281.a(0.0f, 0.0f) < 0 || A891803927997771281.a(0.0f, 0.0f) < 0 || A891803927997771281.a(0.0f, 0.0f) < 0 || A891803927997771281.a(0.0f, 0.0f) < 0) {
            U6129583139759812404.a("Layer outsets must be non-negative");
        }
        a = x3174009376965511256;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X3174009376965511256) && A891803927997771281.b(0.0f, 0.0f) && A891803927997771281.b(0.0f, 0.0f) && A891803927997771281.b(0.0f, 0.0f) && A891803927997771281.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + E12098517352909843120.e(0.0f, E12098517352909843120.e(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        String c = A891803927997771281.c(0.0f);
        String c2 = A891803927997771281.c(0.0f);
        return G6547577305291411977.w(G6547577305291411977.y("LayerOutsets(left=", c, ", top=", c2, ", right="), A891803927997771281.c(0.0f), ", bottom=", A891803927997771281.c(0.0f), ")");
    }
}
