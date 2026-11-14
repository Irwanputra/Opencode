package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class G16651139905020516859 extends A8269341136279542501 {
    public final G4373553504164397325 a;
    public final R7000310675073492254 b;
    public final boolean c;
    public final boolean d;
    public final S9385204271696540760 e;

    public G16651139905020516859(G4373553504164397325 g4373553504164397325, R7000310675073492254 r7000310675073492254, boolean z, boolean z2, S9385204271696540760 s9385204271696540760) {
        this.a = g4373553504164397325;
        this.b = r7000310675073492254;
        this.c = z;
        this.d = z2;
        this.e = s9385204271696540760;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new U830809347177809305(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((U830809347177809305) r15896830329318850690).C1(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G16651139905020516859)) {
            return false;
        }
        G16651139905020516859 g16651139905020516859 = (G16651139905020516859) obj;
        return S10823041268949770285.t(this.a, g16651139905020516859.a) && this.b == g16651139905020516859.b && this.c == g16651139905020516859.c && this.d == g16651139905020516859.d && S10823041268949770285.t(this.e, g16651139905020516859.e);
    }

    public final int hashCode() {
        int i = G6547577305291411977.i(G6547577305291411977.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 961, this.d);
        S9385204271696540760 s9385204271696540760 = this.e;
        return (i + (s9385204271696540760 != null ? s9385204271696540760.hashCode() : 0)) * 31;
    }
}
