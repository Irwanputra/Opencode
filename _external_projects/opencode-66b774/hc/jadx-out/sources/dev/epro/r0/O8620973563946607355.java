package dev.epro.r0;

import android.view.View;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class O8620973563946607355 {
    public static final T15443218846549482730 a;
    public static final T15443218846549482730 b;
    public static final V10933700885381486763 c;
    public static final D4961612090878789022 d;
    public static final B9178969769697472001 e;
    public static final Y4261039727803185691 f;
    public static final V10933700885381486763 g;
    public static final Y4261039727803185691 h;
    public static final float i;
    public static final float j;
    public static final float k;
    public static final Z14997871575210439922 l;
    public static Z7022156542152740569 m;
    public static Z7022156542152740569 n;

    public static final Object A(R4833348786910499294 r4833348786910499294, F4096073349764486348 f4096073349764486348, J196785984016436306 j196785984016436306) {
        return (j196785984016436306.k() && j196785984016436306.o() && j196785984016436306.l()) ? f4096073349764486348.invoke(r4833348786910499294) : r4833348786910499294.getContext().get(G10663294199982376259.c) == null ? f4096073349764486348.invoke(r4833348786910499294) : b0(r4833348786910499294, f4096073349764486348, j196785984016436306);
    }

    public static final Object B(L12639328004344855510 l12639328004344855510, R4833348786910499294 r4833348786910499294) {
        O11762812214053478134 o11762812214053478134 = new O11762812214053478134(r4833348786910499294, r4833348786910499294.getContext());
        return M14643676963617488237.t(o11762812214053478134, o11762812214053478134, l12639328004344855510);
    }

    public static final native B279403213063110388 C(J15344204527961023255 j15344204527961023255);

    public static final void D(W5797197595347441198 w5797197595347441198) {
        J8045362843799184672.K(w5797197595347441198.h());
    }

    public static D14731132657808549702 E(Y7386946880990094255 y7386946880990094255) throws GeneralSecurityException {
        int iOrdinal = y7386946880990094255.ordinal();
        if (iOrdinal == 0) {
            return D14731132657808549702.e0;
        }
        if (iOrdinal == 1) {
            return D14731132657808549702.f0;
        }
        if (iOrdinal == 2) {
            return D14731132657808549702.g0;
        }
        if (iOrdinal == 3) {
            return D14731132657808549702.h0;
        }
        if (iOrdinal == 4) {
            return D14731132657808549702.i0;
        }
        if (iOrdinal != 5) {
            throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(String.valueOf(y7386946880990094255)));
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(String.valueOf(y7386946880990094255)));
    }

    public static D14731132657808549702 F(D16925706105132416423 d16925706105132416423) throws GeneralSecurityException {
        switch (d16925706105132416423.ordinal()) {
            case 0:
                return D14731132657808549702.j0;
            case 1:
                return D14731132657808549702.k0;
            case 2:
                return D14731132657808549702.l0;
            case 3:
                return D14731132657808549702.m0;
            case 4:
                return D14731132657808549702.n0;
            case 5:
                return D14731132657808549702.o0;
            case 6:
                throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(d16925706105132416423)));
            default:
                throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(d16925706105132416423)));
        }
    }

    public static final Z7022156542152740569 G() {
        Z7022156542152740569 z7022156542152740569 = m;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Cancel", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545D = G11450220448113054352.d(12.0f, 2.0f);
        v14323974914327418545D.d(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        v14323974914327418545D.o(4.47f, 10.0f, 10.0f, 10.0f);
        v14323974914327418545D.o(10.0f, -4.47f, 10.0f, -10.0f);
        v14323974914327418545D.n(17.53f, 2.0f, 12.0f, 2.0f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(12.0f, 20.0f);
        v14323974914327418545D.e(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        v14323974914327418545D.o(3.59f, -8.0f, 8.0f, -8.0f);
        v14323974914327418545D.o(8.0f, 3.59f, 8.0f, 8.0f);
        v14323974914327418545D.o(-3.59f, 8.0f, -8.0f, 8.0f);
        G11450220448113054352.w(v14323974914327418545D, 15.59f, 7.0f, 12.0f, 10.59f);
        v14323974914327418545D.h(8.41f, 7.0f);
        v14323974914327418545D.h(7.0f, 8.41f);
        v14323974914327418545D.h(10.59f, 12.0f);
        v14323974914327418545D.h(7.0f, 15.59f);
        v14323974914327418545D.h(8.41f, 17.0f);
        v14323974914327418545D.h(12.0f, 13.41f);
        v14323974914327418545D.h(15.59f, 17.0f);
        v14323974914327418545D.h(17.0f, 15.59f);
        G11450220448113054352.p(v14323974914327418545D, 13.41f, 12.0f, 17.0f, 8.41f);
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        m = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static J3745674191043464657 H(M3727281027331139839 m3727281027331139839) {
        return (J3745674191043464657) m3727281027331139839.j(J5654975781851244064.a);
    }

    public static final View I(R15896830329318850690 r15896830329318850690) {
        E3889562084885881810 e3889562084885881810 = R7033599853981556291.R(r15896830329318850690.a).f262o;
        View interopView = e3889562084885881810 != null ? e3889562084885881810.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        S10973172697741180971.m("Could not fetch interop view");
        return null;
    }

    public static J4250663911053539605 J(D14731132657808549702 d14731132657808549702, Integer num) throws GeneralSecurityException {
        if (d14731132657808549702 == D14731132657808549702.m0) {
            if (num == null) {
                return H3219070247167520574.a;
            }
            W4415201450379021245.c("RAW output prefix type cannot have an id requirement");
            return null;
        }
        if (num == null) {
            throw new GeneralSecurityException(G6547577305291411977.s("idRequirement must be non-null for ", String.valueOf(d14731132657808549702), " type"));
        }
        if (d14731132657808549702 == D14731132657808549702.k0) {
            return H3219070247167520574.b(num.intValue());
        }
        if (d14731132657808549702 == D14731132657808549702.l0 || d14731132657808549702 == D14731132657808549702.n0) {
            return H3219070247167520574.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(d14731132657808549702)));
    }

    public static L10797789142392276788 K(M3727281027331139839 m3727281027331139839) {
        return (L10797789142392276788) m3727281027331139839.j(V6937487778750555249.a);
    }

    public static final native long L(M189546347662651217 m189546347662651217, M3727281027331139839 m3727281027331139839);

    public static final boolean M(W5797197595347441198 w5797197595347441198) {
        Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) w5797197595347441198.h().get(P2382941533350862833.p);
        if (q15035754882231748864 != null) {
            return q15035754882231748864.b();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(java.util.Collection r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof dev.epro.r0.U1478927435872068919
            if (r0 == 0) goto L13
            r0 = r5
            dev.epro.r0.U1478927435872068919 r0 = (dev.epro.r0.U1478927435872068919) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.U1478927435872068919 r0 = new dev.epro.r0.U1478927435872068919
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.u
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.Iterator r4 = r0.t
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L37
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2e:
            dev.epro.r0.E17665849472693074628.k(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L37:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            dev.epro.r0.Q15035754882231748864 r5 = (dev.epro.r0.Q15035754882231748864) r5
            r0.t = r4
            r0.v = r2
            java.lang.Object r5 = r5.v(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r1) goto L37
            return r1
        L50:
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O8620973563946607355.N(java.util.Collection, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static final native Object O(L12602321637077960189 l12602321637077960189, K14749510448791472029 k14749510448791472029);

    public static final native Object P(Exception exc);

    public static final L10855672692117722047 Q(B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2) {
        View view = (View) m3727281027331139839.j(T15795698139970521497.f);
        boolean zF = m3727281027331139839.f(view);
        Object objM = m3727281027331139839.M();
        Object obj = O9023047933786425027.a;
        if (zF || objM == obj) {
            objM = new L10855672692117722047(view, null, b13729205492206812220);
            m3727281027331139839.k0(objM);
        }
        L10855672692117722047 l10855672692117722047 = (L10855672692117722047) objM;
        boolean zH = m3727281027331139839.h(l10855672692117722047);
        Object objM2 = m3727281027331139839.M();
        if (zH || objM2 == obj) {
            objM2 = new L12136615074090416221(l10855672692117722047, (byte) 3);
            m3727281027331139839.k0(objM2);
        }
        Q13169198992966610970.c(l10855672692117722047, (F4096073349764486348) objM2, m3727281027331139839);
        return l10855672692117722047;
    }

    public static final Object R(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static Y7386946880990094255 U(D14731132657808549702 d14731132657808549702) throws GeneralSecurityException {
        if (d14731132657808549702 == D14731132657808549702.e0) {
            return Y7386946880990094255.UNKNOWN_KEYMATERIAL;
        }
        if (d14731132657808549702 == D14731132657808549702.f0) {
            return Y7386946880990094255.SYMMETRIC;
        }
        if (d14731132657808549702 == D14731132657808549702.g0) {
            return Y7386946880990094255.ASYMMETRIC_PRIVATE;
        }
        if (d14731132657808549702 == D14731132657808549702.h0) {
            return Y7386946880990094255.ASYMMETRIC_PUBLIC;
        }
        if (d14731132657808549702 == D14731132657808549702.i0) {
            return Y7386946880990094255.REMOTE;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(String.valueOf(d14731132657808549702)));
    }

    public static D16925706105132416423 V(D14731132657808549702 d14731132657808549702) {
        if (d14731132657808549702 == D14731132657808549702.j0) {
            return D16925706105132416423.UNKNOWN_PREFIX;
        }
        if (d14731132657808549702 == D14731132657808549702.k0) {
            return D16925706105132416423.TINK;
        }
        if (d14731132657808549702 == D14731132657808549702.l0) {
            return D16925706105132416423.LEGACY;
        }
        if (d14731132657808549702 == D14731132657808549702.m0) {
            return D16925706105132416423.RAW;
        }
        if (d14731132657808549702 == D14731132657808549702.n0) {
            return D16925706105132416423.CRUNCHY;
        }
        if (d14731132657808549702 == D14731132657808549702.o0) {
            return D16925706105132416423.WITH_ID_REQUIREMENT;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(d14731132657808549702)));
    }

    public static final I1722681268793429505 W(boolean z, S9385204271696540760 s9385204271696540760, boolean z2, H10924029057425269323 h10924029057425269323, F4096073349764486348 f4096073349764486348) {
        return D15216840398887440549.a.Q0(new Q8216478324247158223(z, s9385204271696540760, false, z2, h10924029057425269323, f4096073349764486348));
    }

    public static I1722681268793429505 X(I1722681268793429505 i1722681268793429505, boolean z, boolean z2, H10924029057425269323 h10924029057425269323, F4096073349764486348 f4096073349764486348, int i2) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return i1722681268793429505.Q0(new Q8216478324247158223(z, null, true, z2, h10924029057425269323, f4096073349764486348));
    }

    public static final I1722681268793429505 Y(Y16443381041276641359 y16443381041276641359, T10404628478956475064 t10404628478956475064, boolean z, H10924029057425269323 h10924029057425269323, B13729205492206812220 b13729205492206812220) {
        if (t10404628478956475064 != null) {
            return new L156927438899644353(y16443381041276641359, null, t10404628478956475064, z, h10924029057425269323, b13729205492206812220);
        }
        if (t10404628478956475064 == null) {
            return new L156927438899644353(y16443381041276641359, null, null, z, h10924029057425269323, b13729205492206812220);
        }
        return V12319504402545346730.w(V10993962107938880611.a, new N6281864809880248749(t10404628478956475064, y16443381041276641359, z, h10924029057425269323, b13729205492206812220));
    }

    public static final boolean Z(Throwable th, B13729205492206812220 b13729205492206812220) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = F7685908104226599925.a;
        W2884870215307995160 w2884870215307995160 = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = A16760084530060701231.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = O2161699089510411363.a;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) listAsList.get(i2)) instanceof W2884870215307995160) {
                return false;
            }
        }
        try {
            A8944194597127240917 a8944194597127240917 = (A8944194597127240917) b13729205492206812220.invoke();
            if (a8944194597127240917 != null) {
                boolean z2 = a8944194597127240917.b;
                List list = a8944194597127240917.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((M5991154792349372656) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                a8944194597127240917.getClass();
                w2884870215307995160 = new W2884870215307995160(a8944194597127240917);
            }
        } catch (Throwable th2) {
            w2884870215307995160 = th2;
        }
        if (w2884870215307995160 != null) {
            m(th, w2884870215307995160);
        }
        return z;
    }

    public static final A2789795882633926065 a(G8001132634698687269 g8001132634698687269) {
        if (g8001132634698687269.get(P2382941533350862833.p) == null) {
            g8001132634698687269 = g8001132634698687269.plus(J8045362843799184672.k());
        }
        return new A2789795882633926065(g8001132634698687269);
    }

    public static final native boolean a0(byte[] bArr, byte[] bArr2);

    public static final native void b(List list, M3727281027331139839 m3727281027331139839, int i2);

    public static final Object b0(R4833348786910499294 r4833348786910499294, F4096073349764486348 f4096073349764486348, J196785984016436306 j196785984016436306) {
        V15499216873564893116 v15499216873564893116;
        J14057654040986470873 j14057654040986470873 = new J14057654040986470873(f4096073349764486348, null);
        B8553891759473824940 b8553891759473824940 = (B8553891759473824940) r4833348786910499294.getContext().get(B8553891759473824940.b);
        D11883231851729262595 d11883231851729262595 = b8553891759473824940 != null ? b8553891759473824940.a : null;
        if (d11883231851729262595 != null) {
            return R7033599853981556291.d0(d11883231851729262595, j14057654040986470873, r4833348786910499294);
        }
        H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(r4833348786910499294));
        h7219028874700587498.t();
        try {
            v15499216873564893116 = j196785984016436306.d;
        } catch (RejectedExecutionException e2) {
            h7219028874700587498.k(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        if (v15499216873564893116 != null) {
            v15499216873564893116.execute(new F16393152783805540385(h7219028874700587498, j196785984016436306, j14057654040986470873, (byte) 2));
            return h7219028874700587498.r();
        }
        S10823041268949770285.b0("internalTransactionExecutor");
        throw null;
    }

    public static final native void c(String str, M189546347662651217 m189546347662651217, I1722681268793429505 i1722681268793429505, String str2, int i2, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static final native void d(M189546347662651217 m189546347662651217, long j2, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void e(String str, int i2, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static final native void f(String str, M189546347662651217 m189546347662651217, I1722681268793429505 i1722681268793429505, int i2, M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static final native void g(String str, F4096073349764486348 f4096073349764486348, int i2, int i3, boolean z, I1722681268793429505 i1722681268793429505, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i4);

    public static final native void h(L5257209402530789314 l5257209402530789314, String str, String str2, String str3, String str4, boolean z, Object obj, boolean z2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, B13729205492206812220 b13729205492206812220, float f2, M3727281027331139839 m3727281027331139839, int i2, int i3, int i4);

    public static final void i(I1722681268793429505 i1722681268793429505, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 32 : 16;
        }
        byte b2 = 0;
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            j(i1722681268793429505, t15443218846549482730, m3727281027331139839, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new S4441727196080009540(i1722681268793429505, t15443218846549482730, i2, b2);
        }
    }

    public static final void j(I1722681268793429505 i1722681268793429505, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(771959668);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 256 : 128;
        }
        byte b3 = 1;
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            Object objM = m3727281027331139839.M();
            E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
            if (objM == e17149812035295265804) {
                V697849047308847220 v697849047308847220 = new V697849047308847220(null, B14824868959299866349.k);
                m3727281027331139839.k0(v697849047308847220);
                objM = v697849047308847220;
            }
            W1972671267364756056 w1972671267364756056 = (W1972671267364756056) objM;
            Object objM2 = m3727281027331139839.M();
            if (objM2 == e17149812035295265804) {
                objM2 = new C13964068377165850232(w1972671267364756056, (byte) 0);
                m3727281027331139839.k0(objM2);
            }
            D1286559660607336098.a(M6666571459626975107.b.a(Q((B13729205492206812220) objM2, m3727281027331139839, 0)), S10823041268949770285.T(-291176396, new B7025542336834056064(i1722681268793429505, w1972671267364756056, t15443218846549482730, b2), m3727281027331139839), m3727281027331139839, 56);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new S4441727196080009540(i1722681268793429505, t15443218846549482730, i2, b3);
        }
    }

    public static final native void k(L10130686243380236857 l10130686243380236857, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(String str, S16571168858015125610 s16571168858015125610, long j2, Z7022156542152740569 z7022156542152740569, long j3, float f2, String str2, M3727281027331139839 m3727281027331139839, int i2);

    public static void m(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = F7685908104226599925.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = A16760084530060701231.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final native String n(B13442171441690898973 b13442171441690898973);

    public static final I1722681268793429505 o(I1722681268793429505 i1722681268793429505, A10693687560045094360 a10693687560045094360, L12639328004344855510 l12639328004344855510) {
        return R7033599853981556291.q(i1722681268793429505).Q0(new V8438650866938272755(a10693687560045094360, l12639328004344855510));
    }

    public static /* synthetic */ I1722681268793429505 p(I1722681268793429505 i1722681268793429505, M7102034154292440921 m7102034154292440921, int i2) {
        if ((i2 & 1) != 0) {
            Map map = I12271177246410047083.a;
            m7102034154292440921 = O4077903568229246.Q(0.0f, 400.0f, new Q13254524308163418711(4294967297L), 1);
        }
        return o(i1722681268793429505, m7102034154292440921, null);
    }

    public static final native B279403213063110388 q(U11798597014466982259 u11798597014466982259);

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object r(List list, K14749510448791472029 k14749510448791472029) {
        if (list.isEmpty()) {
            return O2161699089510411363.a;
        }
        X11644140690951955496[] x11644140690951955496Arr = (X11644140690951955496[]) list.toArray(new X11644140690951955496[0]);
        G8347049719017974902 g8347049719017974902 = new G8347049719017974902(x11644140690951955496Arr);
        H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(k14749510448791472029));
        h7219028874700587498.t();
        int length = x11644140690951955496Arr.length;
        H7980640351404152884[] h7980640351404152884Arr = new H7980640351404152884[length];
        for (int i2 = 0; i2 < length; i2++) {
            P9515452679798920290 p9515452679798920290 = x11644140690951955496Arr[i2];
            p9515452679798920290.start();
            H7980640351404152884 h7980640351404152884 = new H7980640351404152884(g8347049719017974902, h7219028874700587498);
            h7980640351404152884.f = J8045362843799184672.c0(p9515452679798920290, true, h7980640351404152884);
            h7980640351404152884Arr[i2] = h7980640351404152884;
        }
        A7414163841582707909 a7414163841582707909 = new A7414163841582707909(h7980640351404152884Arr);
        for (int i3 = 0; i3 < length; i3++) {
            H7980640351404152884 h79806403514041528842 = h7980640351404152884Arr[i3];
            h79806403514041528842.getClass();
            T5284056093300834442.a.putObjectVolatile(h79806403514041528842, H7980640351404152884.h, a7414163841582707909);
        }
        if (h7219028874700587498.s() instanceof B9271643986061518267) {
            h7219028874700587498.w(a7414163841582707909);
        } else {
            a7414163841582707909.a();
        }
        return h7219028874700587498.r();
    }

    public static final void s(W5797197595347441198 w5797197595347441198, CancellationException cancellationException) {
        Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) w5797197595347441198.h().get(P2382941533350862833.p);
        if (q15035754882231748864 != null) {
            q15035754882231748864.c(cancellationException);
        } else {
            Q11088980322693754445.i("Scope cannot be cancelled because it does not have a job: ", w5797197595347441198);
        }
    }

    public static final native void w(Q3068353973448734122 q3068353973448734122, boolean z);

    public static final void x(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i2, i3, ", size: "));
        }
    }

    public static final void y(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i2, i3, ", size: "));
        }
    }

    public static final void z(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            D11988991656201568495.i(i4, E12098517352909843120.p(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            S10973172697741180971.j(E12098517352909843120.l("fromIndex: ", i2, i3, " > toIndex: "));
        }
    }

    public void S(G10471708993481961957 g10471708993481961957, G10471708993481961957 g104717089934819619572) {
        g10471708993481961957.b = g104717089934819619572;
    }

    public void T(G10471708993481961957 g10471708993481961957, Thread thread) {
        g10471708993481961957.a = thread;
    }

    public boolean t(P16078978668947144669 p16078978668947144669, H3067108644890218695 h3067108644890218695, H3067108644890218695 h30671086448902186952) {
        synchronized (p16078978668947144669) {
            try {
                if (p16078978668947144669.b != h3067108644890218695) {
                    return false;
                }
                p16078978668947144669.b = h30671086448902186952;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean u(P16078978668947144669 p16078978668947144669, Object obj, Object obj2) {
        synchronized (p16078978668947144669) {
            try {
                if (p16078978668947144669.a != obj) {
                    return false;
                }
                p16078978668947144669.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean v(P16078978668947144669 p16078978668947144669, G10471708993481961957 g10471708993481961957, G10471708993481961957 g104717089934819619572) {
        synchronized (p16078978668947144669) {
            try {
                if (p16078978668947144669.c != g10471708993481961957) {
                    return false;
                }
                p16078978668947144669.c = g104717089934819619572;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static {
        izmyclvb.dpqpjfpoanwt1(1294);
        a = new T15443218846549482730(636288403, false, new N8996292563264153518((byte) 0));
        b = new T15443218846549482730(-1357803046, false, new N8996292563264153518((byte) 1));
        c = V10933700885381486763.f;
        d = D4961612090878789022.h;
        e = new B9178969769697472001((byte) 6);
        f = Y4261039727803185691.v;
        g = V10933700885381486763.b;
        h = Y4261039727803185691.i;
        i = 4.0f;
        j = 32.0f;
        k = 1.0f;
        l = new Z14997871575210439922((byte) 15);
    }
}
