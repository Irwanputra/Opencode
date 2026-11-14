package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F17048500263560432125 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public F17048500263560432125(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F17048500263560432125.class == obj.getClass()) {
            F17048500263560432125 f17048500263560432125 = (F17048500263560432125) obj;
            return this.c == f17048500263560432125.c && this.d == f17048500263560432125.d && this.b == f17048500263560432125.b && this.a == f17048500263560432125.a && this.e == f17048500263560432125.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + X2485016533998461232.f(this.a, E12098517352909843120.e(this.b, E12098517352909843120.e(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
