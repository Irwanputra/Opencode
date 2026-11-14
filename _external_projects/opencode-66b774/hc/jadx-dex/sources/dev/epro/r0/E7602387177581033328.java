package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E7602387177581033328 {
    public static final dev.epro.r0.I1722681268793429505 a = dev.epro.r0.V16747615581620678882.k(dev.epro.r0.V10993962107938880611.a, dev.epro.r0.O4077903568229246.v);

    public static final void a(dev.epro.r0.Z7022156542152740569 z7022156542152740569, java.lang.String str, dev.epro.r0.I1722681268793429505 i1722681268793429505, long j, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i, int i2) {
        int i3;
        java.lang.String str2;
        dev.epro.r0.M3727281027331139839 m37272810273311398392;
        long j2;
        dev.epro.r0.I1722681268793429505 i17226812687934295052;
        m3727281027331139839.b0(-126890956);
        if ((i & 6) == 0) {
            i3 = (m3727281027331139839.f(z7022156542152740569) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= m3727281027331139839.f(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && m3727281027331139839.e(j)) ? 2048 : 1024;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 1171) != 1170)) {
            m3727281027331139839.W();
            if ((i & 1) == 0 || m3727281027331139839.z()) {
                if (i4 != 0) {
                    i1722681268793429505 = dev.epro.r0.V10993962107938880611.a;
                }
                if ((i2 & 8) != 0) {
                    j = ((dev.epro.r0.U10174709222559481877) m3727281027331139839.j(dev.epro.r0.F14501669313667597110.a)).a;
                    i3 &= -7169;
                }
                dev.epro.r0.I1722681268793429505 i17226812687934295053 = i1722681268793429505;
                long j3 = j;
                m3727281027331139839.r();
                str2 = str;
                m37272810273311398392 = m3727281027331139839;
                b(dev.epro.r0.V16504496955554646429.i(z7022156542152740569, m3727281027331139839), str2, i17226812687934295053, j3, m37272810273311398392, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
                i17226812687934295052 = i17226812687934295053;
                j2 = j3;
            } else {
                m3727281027331139839.U();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                dev.epro.r0.I1722681268793429505 i172268126879342950532 = i1722681268793429505;
                long j32 = j;
                m3727281027331139839.r();
                str2 = str;
                m37272810273311398392 = m3727281027331139839;
                b(dev.epro.r0.V16504496955554646429.i(z7022156542152740569, m3727281027331139839), str2, i172268126879342950532, j32, m37272810273311398392, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
                i17226812687934295052 = i172268126879342950532;
                j2 = j32;
            }
        } else {
            str2 = str;
            m37272810273311398392 = m3727281027331139839;
            m37272810273311398392.U();
            j2 = j;
            i17226812687934295052 = i1722681268793429505;
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m37272810273311398392.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.I15374072598525673762(z7022156542152740569, str2, i17226812687934295052, j2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(dev.epro.r0.L1256556220631237103 r16, java.lang.String r17, dev.epro.r0.I1722681268793429505 r18, long r19, dev.epro.r0.M3727281027331139839 r21, int r22) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E7602387177581033328.b(dev.epro.r0.L1256556220631237103, java.lang.String, dev.epro.r0.I1722681268793429505, long, dev.epro.r0.M3727281027331139839, int):void");
    }
}
