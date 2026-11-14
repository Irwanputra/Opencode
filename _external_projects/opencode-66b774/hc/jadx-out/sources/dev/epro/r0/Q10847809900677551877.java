package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q10847809900677551877 implements K1823399244298350623 {
    public final float a;

    public Q10847809900677551877(float f) {
        this.a = f;
    }

    @Override // dev.epro.r0.K1823399244298350623
    public final int a(int i, int i2, F10342546226345611902 f10342546226345611902) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Q10847809900677551877) && Float.compare(this.a, ((Q10847809900677551877) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
