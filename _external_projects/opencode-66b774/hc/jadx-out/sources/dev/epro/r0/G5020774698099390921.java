package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G5020774698099390921 {
    public final X6460762560403092052 a;
    public Z13251062865217617579 b;
    public Z13251062865217617579 c;
    public Z13251062865217617579 d;
    public final float e;

    public G5020774698099390921(X6460762560403092052 x6460762560403092052) {
        this.a = x6460762560403092052;
        this.e = x6460762560403092052.h();
    }

    public final Z13251062865217617579 a(long j, Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792) {
        Z13251062865217617579 z13251062865217617579C = this.c;
        if (z13251062865217617579C == null) {
            z13251062865217617579C = z13251062865217617579.c();
            this.c = z13251062865217617579C;
        }
        int iB = z13251062865217617579C.b();
        int i = 0;
        while (true) {
            Z13251062865217617579 z132510628652176175793 = this.c;
            if (i >= iB) {
                if (z132510628652176175793 != null) {
                    return z132510628652176175793;
                }
                S10823041268949770285.b0("velocityVector");
                throw null;
            }
            if (z132510628652176175793 == null) {
                S10823041268949770285.b0("velocityVector");
                throw null;
            }
            z13251062865217617579.getClass();
            z132510628652176175793.e(i, this.a.j(z132510628652176175792.a(i), j));
            i++;
        }
    }
}
