package dev.epro.r0;

import ads_mobile_sdk.d61;
import android.database.SQLException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S12227320117525376577 {
    static {
        izmyclvb.qgayjvbiagej2(1361);
    }

    public static final native H9594781759364688001 A(K6255634571546489463 k6255634571546489463);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(dev.epro.r0.Z7637734454282223795 r12, dev.epro.r0.N235339945877347053 r13, dev.epro.r0.Y1086209215650239921 r14, dev.epro.r0.B401944902727389462 r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12227320117525376577.B(dev.epro.r0.Z7637734454282223795, dev.epro.r0.N235339945877347053, dev.epro.r0.Y1086209215650239921, dev.epro.r0.B401944902727389462):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(dev.epro.r0.Z7637734454282223795 r11, dev.epro.r0.N235339945877347053 r12, dev.epro.r0.Y1086209215650239921 r13, int r14, dev.epro.r0.B401944902727389462 r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12227320117525376577.C(dev.epro.r0.Z7637734454282223795, dev.epro.r0.N235339945877347053, dev.epro.r0.Y1086209215650239921, int, dev.epro.r0.B401944902727389462):java.lang.Object");
    }

    public static String D(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(E(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(E(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String E(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strS = G6547577305291411977.s(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            "Exception during lenientFormat for ".concat(strS);
            logger.getClass();
            return E12098517352909843120.m("<", strS, " threw ", e.getClass().getName(), ">");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0429 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0778  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final dev.epro.r0.V14971122188687777455 r44, final java.lang.CharSequence r45, final dev.epro.r0.L12639328004344855510 r46, final dev.epro.r0.O8448855611469183895 r47, final dev.epro.r0.J12078565427869724451 r48, final dev.epro.r0.L12639328004344855510 r49, final dev.epro.r0.L12639328004344855510 r50, final dev.epro.r0.L12639328004344855510 r51, final dev.epro.r0.L12639328004344855510 r52, final boolean r53, final boolean r54, final boolean r55, final dev.epro.r0.D5961215468735357278 r56, final dev.epro.r0.T1241271073913685060 r57, final dev.epro.r0.M15706644554150934798 r58, final dev.epro.r0.L12639328004344855510 r59, dev.epro.r0.M3727281027331139839 r60, final int r61, final int r62) {
        /*
            Method dump skipped, instruction units count: 2071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12227320117525376577.a(dev.epro.r0.V14971122188687777455, java.lang.CharSequence, dev.epro.r0.L12639328004344855510, dev.epro.r0.O8448855611469183895, dev.epro.r0.J12078565427869724451, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, boolean, boolean, boolean, dev.epro.r0.D5961215468735357278, dev.epro.r0.T1241271073913685060, dev.epro.r0.M15706644554150934798, dev.epro.r0.L12639328004344855510, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final void b(long j, S16571168858015125610 s16571168858015125610, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, final int i) {
        M3727281027331139839 m37272810273311398392;
        final L12639328004344855510 l126393280043448555102;
        final S16571168858015125610 s165711688580151256102;
        final long j2;
        m3727281027331139839.b0(396611577);
        int i2 = (m3727281027331139839.e(j) ? 4 : 2) | i | (m3727281027331139839.f(s16571168858015125610) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= m3727281027331139839.h(l12639328004344855510) ? 256 : 128;
        }
        if (m3727281027331139839.R(i2 & 1, (i2 & 147) != 146)) {
            m37272810273311398392 = m3727281027331139839;
            D1286559660607336098.l(j, s16571168858015125610, l12639328004344855510, m37272810273311398392, i2 & 1022);
            j2 = j;
            s165711688580151256102 = s16571168858015125610;
            l126393280043448555102 = l12639328004344855510;
        } else {
            m37272810273311398392 = m3727281027331139839;
            l126393280043448555102 = l12639328004344855510;
            s165711688580151256102 = s16571168858015125610;
            j2 = j;
            m37272810273311398392.U();
        }
        V4878375136513573151 v4878375136513573151T = m37272810273311398392.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L12639328004344855510() { // from class: dev.epro.r0.D10850591722936647451
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    S12227320117525376577.b(j2, s165711688580151256102, l126393280043448555102, (M3727281027331139839) obj, V16504496955554646429.p(i | 1));
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static final void c(long j, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i) {
        m3727281027331139839.b0(590397809);
        int i2 = (m3727281027331139839.e(j) ? 4 : 2) | i | (m3727281027331139839.h(l12639328004344855510) ? 32 : 16);
        if (m3727281027331139839.R(i2 & 1, (i2 & 19) != 18)) {
            D1286559660607336098.a(L11610354117192841236.n(j, F14501669313667597110.a), l12639328004344855510, m3727281027331139839, (i2 & 112) | 8);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new H13075619831258834471(j, l12639328004344855510, i);
        }
    }

    public static final native void d(boolean z, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i);

    public static d61 e(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, boolean z) {
        v2597580950516131749.getClass();
        return new d61(v25975809505161317492, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[PHI: r1
      0x00b1: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v7 java.lang.String), (r1v7 java.lang.String), (r1v7 java.lang.String) binds: [B:14:0x003c, B:31:0x0090, B:33:0x00a0, B:35:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.webkit.WebResourceResponse f(ads_mobile_sdk.a21 r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12227320117525376577.f(ads_mobile_sdk.a21):android.webkit.WebResourceResponse");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(dev.epro.r0.Z7637734454282223795 r6, dev.epro.r0.B401944902727389462 r7) {
        /*
            boolean r0 = r7 instanceof dev.epro.r0.B14196118598506674804
            if (r0 == 0) goto L13
            r0 = r7
            dev.epro.r0.B14196118598506674804 r0 = (dev.epro.r0.B14196118598506674804) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.B14196118598506674804 r0 = new dev.epro.r0.B14196118598506674804
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            dev.epro.r0.Z7637734454282223795 r6 = r0.t
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            r6 = 0
            return r6
        L2e:
            dev.epro.r0.E17665849472693074628.k(r7)
        L31:
            r0.t = r6
            r0.v = r2
            dev.epro.r0.J17191566391535857141 r7 = dev.epro.r0.J17191566391535857141.b
            java.lang.Object r7 = r6.a(r7, r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r1) goto L40
            return r1
        L40:
            dev.epro.r0.Y1086209215650239921 r7 = (dev.epro.r0.Y1086209215650239921) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            dev.epro.r0.N13196868278329319633 r5 = (dev.epro.r0.N13196868278329319633) r5
            boolean r5 = dev.epro.r0.I3887072968740112330.q(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12227320117525376577.g(dev.epro.r0.Z7637734454282223795, dev.epro.r0.B401944902727389462):java.lang.Object");
    }

    public static final Object h(S14157914735975478504 s14157914735975478504, H3685497765029482167 h3685497765029482167, N235339945877347053 n235339945877347053, R4833348786910499294 r4833348786910499294) {
        P9733793856018248168 p9733793856018248168 = (P9733793856018248168) s14157914735975478504;
        p9733793856018248168.getClass();
        Object objN = V1475975160983963926.n(s14157914735975478504, new Q16819637563808121756(new N12245111110189169079(R7033599853981556291.R(p9733793856018248168).A), h3685497765029482167, n235339945877347053, null), r4833348786910499294);
        return objN == Z3437138737604933638.a ? objN : O9245300239821758723.a;
    }

    public static final I1722681268793429505 i(I1722681268793429505 i1722681268793429505, boolean z, String str) {
        return z ? J11170665878571083300.b(i1722681268793429505, false, new F17325007439613749879(str, (byte) 2)) : i1722681268793429505;
    }

    public static final native int j(H9594781759364688001 h9594781759364688001);

    public static final long m(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final K1823399244298350623 n(O8448855611469183895 o8448855611469183895) {
        if (o8448855611469183895 instanceof O8448855611469183895) {
            return T13350664027331345869.n;
        }
        Q11088980322693754445.l("Unknown position: ", o8448855611469183895);
        return null;
    }

    public static final L14576235570718031614 p(J5715778638296486773 j5715778638296486773) {
        return j5715778638296486773 instanceof M14569441752665048396 ? ((M14569441752665048396) j5715778638296486773).g() : H6810052497267380403.b;
    }

    public static final Q15796038708469204840 q(J5715778638296486773 j5715778638296486773) {
        return j5715778638296486773 instanceof M14569441752665048396 ? ((M14569441752665048396) j5715778638296486773).f() : W16166718746717276323.b;
    }

    public static final float s(M3727281027331139839 m3727281027331139839) {
        long j = ((L10797789142392276788) m3727281027331139839.j(V6937487778750555249.a)).l.b.c;
        long j2 = H14947050588585248010.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((R8540738700654750557) m3727281027331139839.j(Y238707362170117896.h)).Y(j) / 2.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x008d, B:37:0x0099, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00e3, B:56:0x00eb, B:58:0x00ef, B:60:0x00fb, B:62:0x0107, B:50:0x00bd), top: B:69:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(dev.epro.r0.Z7637734454282223795 r9, dev.epro.r0.H3685497765029482167 r10, dev.epro.r0.N12245111110189169079 r11, dev.epro.r0.Y1086209215650239921 r12, dev.epro.r0.B401944902727389462 r13) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12227320117525376577.t(dev.epro.r0.Z7637734454282223795, dev.epro.r0.H3685497765029482167, dev.epro.r0.N12245111110189169079, dev.epro.r0.Y1086209215650239921, dev.epro.r0.B401944902727389462):java.lang.Object");
    }

    public static final native Boolean u(String str, JSONObject jSONObject);

    public static final float v(M3727281027331139839 m3727281027331139839) {
        float f = ((A891803927997771281) m3727281027331139839.j(E11606037000563084849.c)).a;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - O4077903568229246.v) / 2.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    public static final void w(int i, String str) {
        throw new SQLException(G6547577305291411977.n(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final native JSONArray x(String str);

    public static final native String y(H9594781759364688001 h9594781759364688001);

    public static final native K6255634571546489463 z(H9594781759364688001 h9594781759364688001, String str);

    public Method k(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    public Constructor l(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    public String[] o(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    public boolean r(Class cls) {
        return false;
    }
}
