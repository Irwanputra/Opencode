package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A4300800680137755387 implements K1823399244298350623 {
    public final float a;

    public A4300800680137755387(float f) {
        this.a = f;
    }

    @Override // dev.epro.r0.K1823399244298350623
    public final int a(int i, int i2, F10342546226345611902 f10342546226345611902) {
        float f = (i2 - i) / 2.0f;
        F10342546226345611902 f103425462263456119022 = F10342546226345611902.a;
        float f2 = this.a;
        if (f10342546226345611902 != f103425462263456119022) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A4300800680137755387) && Float.compare(this.a, ((A4300800680137755387) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
