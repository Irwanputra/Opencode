package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V12527742189361867087 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public boolean i;

    public V12527742189361867087(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
    }

    public final String toString() {
        String N = G16660188620551127941.N(this.a);
        String h = L2216691091636065972.h(this.c);
        String h2 = L2216691091636065972.h(this.g);
        boolean z = this.i;
        StringBuilder h3 = X2485016533998461232.h("IndirectPointerInputChange(id=", N, ", uptimeMillis=", this.b);
        h3.append(", position=");
        h3.append(h);
        h3.append(", pressed=");
        h3.append(this.d);
        h3.append(", pressure=");
        h3.append(this.e);
        h3.append(", previousUptimeMillis=");
        h3.append(this.f);
        h3.append(", previousPosition=");
        h3.append(h2);
        h3.append(", previousPressed=");
        h3.append(this.h);
        h3.append(", isConsumed=");
        h3.append(z);
        h3.append(")");
        return h3.toString();
    }
}
