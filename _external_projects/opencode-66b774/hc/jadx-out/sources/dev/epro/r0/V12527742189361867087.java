package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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
        String strN = G16660188620551127941.N(this.a);
        String strH = L2216691091636065972.h(this.c);
        String strH2 = L2216691091636065972.h(this.g);
        boolean z = this.i;
        StringBuilder sbH = X2485016533998461232.h("IndirectPointerInputChange(id=", strN, ", uptimeMillis=", this.b);
        sbH.append(", position=");
        sbH.append(strH);
        sbH.append(", pressed=");
        sbH.append(this.d);
        sbH.append(", pressure=");
        sbH.append(this.e);
        sbH.append(", previousUptimeMillis=");
        sbH.append(this.f);
        sbH.append(", previousPosition=");
        sbH.append(strH2);
        sbH.append(", previousPressed=");
        sbH.append(this.h);
        sbH.append(", isConsumed=");
        sbH.append(z);
        sbH.append(")");
        return sbH.toString();
    }
}
