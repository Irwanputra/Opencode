package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class E7602387177581033328 {
    public static final I1722681268793429505 a = V16747615581620678882.k(V10993962107938880611.a, O4077903568229246.v);

    public static final void a(final Z7022156542152740569 z7022156542152740569, String str, I1722681268793429505 i1722681268793429505, long j, M3727281027331139839 m3727281027331139839, final int i, final int i2) {
        int i3;
        String str2;
        M3727281027331139839 m37272810273311398392;
        final long j2;
        final I1722681268793429505 i17226812687934295052;
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
                    i1722681268793429505 = V10993962107938880611.a;
                }
                if ((i2 & 8) != 0) {
                    j = ((U10174709222559481877) m3727281027331139839.j(F14501669313667597110.a)).a;
                    i3 &= -7169;
                }
                I1722681268793429505 i17226812687934295053 = i1722681268793429505;
                long j3 = j;
                m3727281027331139839.r();
                str2 = str;
                m37272810273311398392 = m3727281027331139839;
                b(V16504496955554646429.i(z7022156542152740569, m3727281027331139839), str2, i17226812687934295053, j3, m37272810273311398392, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
                i17226812687934295052 = i17226812687934295053;
                j2 = j3;
            } else {
                m3727281027331139839.U();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                I1722681268793429505 i172268126879342950532 = i1722681268793429505;
                long j32 = j;
                m3727281027331139839.r();
                str2 = str;
                m37272810273311398392 = m3727281027331139839;
                b(V16504496955554646429.i(z7022156542152740569, m3727281027331139839), str2, i172268126879342950532, j32, m37272810273311398392, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
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
        V4878375136513573151 v4878375136513573151T = m37272810273311398392.t();
        if (v4878375136513573151T != null) {
            final String str3 = str2;
            v4878375136513573151T.d = new L12639328004344855510() { // from class: dev.epro.r0.I15374072598525673762
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    E7602387177581033328.a(z7022156542152740569, str3, i17226812687934295052, j2, (M3727281027331139839) obj, V16504496955554646429.p(i | 1), i2);
                    return O9245300239821758723.a;
                }
            };
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
