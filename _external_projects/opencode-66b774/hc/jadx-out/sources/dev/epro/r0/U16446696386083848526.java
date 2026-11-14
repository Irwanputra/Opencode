package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U16446696386083848526 implements E13074456978433253839 {
    public final G16768067413993841943 a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public U16446696386083848526(G16768067413993841943 g16768067413993841943, int i) {
        this.a = g16768067413993841943;
        this.b = i;
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int a() {
        return this.a.l();
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int b() {
        return Math.min(r0.l() - 1, ((A17975991316152527869) R9411874267597469228.K0(this.a.k().a)).a + (this.b ? 1 : 0));
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final boolean c() {
        return !this.a.k().a.isEmpty();
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int d() {
        int i;
        G16768067413993841943 g16768067413993841943 = this.a;
        if (g16768067413993841943.k().a.size() == 0) {
            return 0;
        }
        int iM = Z1953481206310471956.M(g16768067413993841943.k());
        int i2 = g16768067413993841943.k().b + g16768067413993841943.k().c;
        if (i2 != 0 && (i = iM / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int e() {
        return Math.max(0, this.a.e - (this.b ? 1 : 0));
    }
}
