package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E1681831271425360860 extends L1256556220631237103 {
    public final F2238012860950049442 e;
    public final long f;
    public boolean g = true;
    public final long h;
    public float i;
    public R3103059035698929241 j;

    public E1681831271425360860(F2238012860950049442 f2238012860950049442, long j) {
        int i;
        this.e = f2238012860950049442;
        this.f = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > f2238012860950049442.a.getWidth() || i > f2238012860950049442.a.getHeight()) {
            S10973172697741180971.j("Failed requirement.");
            throw null;
        }
        this.h = j;
        this.i = 1.0f;
    }

    @Override // dev.epro.r0.L1256556220631237103
    public final void a(float f) {
        this.i = f;
    }

    @Override // dev.epro.r0.L1256556220631237103
    public final void b(R3103059035698929241 r3103059035698929241) {
        this.j = r3103059035698929241;
    }

    @Override // dev.epro.r0.L1256556220631237103
    public final long d() {
        return I3887072968740112330.Q(this.h);
    }

    @Override // dev.epro.r0.L1256556220631237103
    public final void e(L17598299826319227431 l17598299826319227431) {
        int iRound = Math.round(Float.intBitsToFloat((int) (l17598299826319227431.e() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (l17598299826319227431.e() & 4294967295L)));
        float f = this.i;
        R3103059035698929241 r3103059035698929241 = this.j;
        boolean z = this.g;
        L17598299826319227431.k0(l17598299826319227431, this.e, this.f, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, r3103059035698929241, z ? 1 : 0, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1681831271425360860)) {
            return false;
        }
        E1681831271425360860 e1681831271425360860 = (E1681831271425360860) obj;
        return S10823041268949770285.t(this.e, e1681831271425360860.e) && Q2551293802323679034.b(0L, 0L) && Q13254524308163418711.a(this.f, e1681831271425360860.f) && this.g == e1681831271425360860.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g ? 1 : 0) + G6547577305291411977.j(G6547577305291411977.j(this.e.hashCode() * 31, 0L, 31), this.f, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String strE = Q2551293802323679034.e(0L);
        String strB = Q13254524308163418711.b(this.f);
        boolean z = this.g;
        String str = z == 0 ? "None" : z == 1 ? "Low" : z == 2 ? "Medium" : z == 3 ? "High" : "Unknown";
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.e);
        sb.append(", srcOffset=");
        sb.append(strE);
        sb.append(", srcSize=");
        return G6547577305291411977.w(sb, strB, ", filterQuality=", str, ")");
    }
}
