package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V14640412428901298565 {
    public final int a;
    public final long b;
    public final P13847083447510769873 c;
    public final M204440408817344908 d;

    public V14640412428901298565(int i, long j, P13847083447510769873 p13847083447510769873, M204440408817344908 m204440408817344908) {
        this.a = i;
        this.b = j;
        this.c = p13847083447510769873;
        this.d = m204440408817344908;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V14640412428901298565)) {
            return false;
        }
        V14640412428901298565 v14640412428901298565 = (V14640412428901298565) obj;
        return this.a == v14640412428901298565.a && this.b == v14640412428901298565.b && this.c == v14640412428901298565.c && S10823041268949770285.t(this.d, v14640412428901298565.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + G6547577305291411977.j(Integer.hashCode(this.a) * 31, this.b, 31)) * 31;
        M204440408817344908 m204440408817344908 = this.d;
        return hashCode + (m204440408817344908 == null ? 0 : m204440408817344908.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
