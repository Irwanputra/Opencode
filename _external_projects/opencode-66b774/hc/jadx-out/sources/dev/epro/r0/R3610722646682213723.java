package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R3610722646682213723 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Q17957571128037780363 f;

    public R3610722646682213723(long j, int i, int i2, int i3, int i4, Q17957571128037780363 q17957571128037780363) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = q17957571128037780363;
    }

    public final Z6884774333691094167 a(int i) {
        return new Z6884774333691094167(P13747563277035175218.i(this.f, i), i, this.a);
    }

    public final M16210313685714734865 b() {
        int i = this.c;
        int i2 = this.d;
        return i < i2 ? M16210313685714734865.b : i > i2 ? M16210313685714734865.a : M16210313685714734865.c;
    }

    public final V5656221289452463152 c(int i, int i2) {
        return new V5656221289452463152(a(i), a(i2), i > i2);
    }

    public final String toString() {
        Q17957571128037780363 q17957571128037780363 = this.f;
        int i = this.c;
        O16392062884302746898 o16392062884302746898I = P13747563277035175218.i(q17957571128037780363, i);
        int i2 = this.d;
        return "SelectionInfo(id=" + this.a + ", range=(" + i + "-" + o16392062884302746898I + "," + i2 + "-" + P13747563277035175218.i(q17957571128037780363, i2) + "), prevOffset=" + this.e + ")";
    }
}
