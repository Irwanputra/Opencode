package dev.epro.r0;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract class C468629748621011703 {
    static {
        izmyclvb.oeynnivvrnts0(526);
    }

    public static int A(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static Intent B(String str, String str2, String str3, Map map) {
        Intent intent = new Intent("android.intent.action.VIEW", C(str, str2, map));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    public static Uri C(String str, String str2, Map map) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("d").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            if (!str3.equals("id") && !str3.equals("referrer")) {
                builderAppendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
            }
        }
        return builderAppendQueryParameter.build();
    }

    public static void D(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final void a(final String str, final F4096073349764486348 f4096073349764486348, final I1722681268793429505 i1722681268793429505, boolean z, final S16571168858015125610 s16571168858015125610, final L12639328004344855510 l12639328004344855510, H14763425654620554740 h14763425654620554740, W17015830374102496917 w17015830374102496917, O12013896688000893502 o12013896688000893502, final boolean z2, int i, int i2, I5573661370475160895 i5573661370475160895, final M15706644554150934798 m15706644554150934798, M3727281027331139839 m3727281027331139839, final int i3) {
        final boolean z3;
        final H14763425654620554740 h147634256546205547402;
        final W17015830374102496917 w170158303741024969172;
        final O12013896688000893502 o120138966880008935022;
        final int i4;
        final int i5;
        final I5573661370475160895 i55736613704751608952;
        H14763425654620554740 h147634256546205547403;
        W17015830374102496917 w170158303741024969173;
        O12013896688000893502 o120138966880008935023;
        int i6;
        int i7;
        I5573661370475160895 i5573661370475160895B;
        m3727281027331139839.b0(-154966360);
        int i8 = i3 | (m3727281027331139839.f(str) ? 4 : 2) | (m3727281027331139839.h(f4096073349764486348) ? 32 : 16) | (m3727281027331139839.f(i1722681268793429505) ? 256 : 128) | 27648 | (m3727281027331139839.f(s16571168858015125610) ? 131072 : 65536) | 907542528;
        boolean z4 = true;
        if (m3727281027331139839.R(i8 & 1, ((306783379 & i8) == 306783378 && ((22 | (m3727281027331139839.f(m15706644554150934798) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            m3727281027331139839.W();
            if ((i3 & 1) == 0 || m3727281027331139839.z()) {
                Z3383101362411723454 z3383101362411723454 = P2382941533350862833.y;
                h147634256546205547403 = z3383101362411723454;
                w170158303741024969173 = W17015830374102496917.g;
                o120138966880008935023 = O12013896688000893502.c;
                i6 = z2 ? 1 : Integer.MAX_VALUE;
                i7 = 1;
                i5573661370475160895B = N13258083306148085703.b(M2066880349381062048.f, m3727281027331139839);
            } else {
                m3727281027331139839.U();
                z4 = z;
                h147634256546205547403 = h14763425654620554740;
                w170158303741024969173 = w17015830374102496917;
                o120138966880008935023 = o12013896688000893502;
                i6 = i;
                i7 = i2;
                i5573661370475160895B = i5573661370475160895;
            }
            m3727281027331139839.r();
            m3727281027331139839.a0(488210003);
            Object objM = m3727281027331139839.M();
            if (objM == O9023047933786425027.a) {
                objM = L11610354117192841236.m(m3727281027331139839);
            }
            S9385204271696540760 s9385204271696540760 = (S9385204271696540760) objM;
            m3727281027331139839.q(false);
            m3727281027331139839.a0(1401227490);
            long jB = s16571168858015125610.b();
            if (jB == 16) {
                jB = m15706644554150934798.d(z4, false, ((Boolean) V933048422416352811.h(s9385204271696540760, m3727281027331139839, 0).getValue()).booleanValue());
            }
            long j = jB;
            m3727281027331139839.q(false);
            D1286559660607336098.a(L9437793152864500530.a.a(m15706644554150934798.k), S10823041268949770285.T(1459735400, new J15832103478856926005(i1722681268793429505, m15706644554150934798, str, f4096073349764486348, z4, s16571168858015125610.d(new S16571168858015125610(j, 0L, null, 0L, 0, 0, 0L, 16777214)), w170158303741024969173, o120138966880008935023, z2, i6, i7, h147634256546205547403, s9385204271696540760, l12639328004344855510, i5573661370475160895B), m3727281027331139839), m3727281027331139839, 56);
            z3 = z4;
            w170158303741024969172 = w170158303741024969173;
            o120138966880008935022 = o120138966880008935023;
            i4 = i6;
            i5 = i7;
            h147634256546205547402 = h147634256546205547403;
            i55736613704751608952 = i5573661370475160895B;
        } else {
            m3727281027331139839.U();
            z3 = z;
            h147634256546205547402 = h14763425654620554740;
            w170158303741024969172 = w17015830374102496917;
            o120138966880008935022 = o12013896688000893502;
            i4 = i;
            i5 = i2;
            i55736613704751608952 = i5573661370475160895;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L12639328004344855510(str, f4096073349764486348, i1722681268793429505, z3, s16571168858015125610, l12639328004344855510, h147634256546205547402, w170158303741024969172, o120138966880008935022, z2, i4, i5, i55736613704751608952, m15706644554150934798, i3) { // from class: dev.epro.r0.E4492470697927889032
                public final /* synthetic */ String a;
                public final /* synthetic */ F4096073349764486348 b;
                public final /* synthetic */ I1722681268793429505 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ S16571168858015125610 e;
                public final /* synthetic */ L12639328004344855510 f;
                public final /* synthetic */ H14763425654620554740 g;
                public final /* synthetic */ W17015830374102496917 h;
                public final /* synthetic */ O12013896688000893502 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ int k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ I5573661370475160895 m;
                public final /* synthetic */ M15706644554150934798 n;

                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = V16504496955554646429.p(12582913);
                    String str2 = this.a;
                    F4096073349764486348 f40960733497644863482 = this.b;
                    I1722681268793429505 i17226812687934295052 = this.c;
                    boolean z5 = this.d;
                    S16571168858015125610 s165711688580151256102 = this.e;
                    L12639328004344855510 l126393280043448555102 = this.f;
                    H14763425654620554740 h147634256546205547404 = this.g;
                    W17015830374102496917 w170158303741024969174 = this.h;
                    O12013896688000893502 o120138966880008935024 = this.i;
                    boolean z6 = this.j;
                    int i9 = this.k;
                    boolean z7 = this.l;
                    I5573661370475160895 i55736613704751608953 = this.m;
                    M15706644554150934798 m157066445541509347982 = this.n;
                    C468629748621011703.a(str2, f40960733497644863482, i17226812687934295052, z5, s165711688580151256102, l126393280043448555102, h147634256546205547404, w170158303741024969174, o120138966880008935024, z6, i9, z7 ? 1 : 0, i55736613704751608953, m157066445541509347982, (M3727281027331139839) obj, iP);
                    return O9245300239821758723.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x062b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(dev.epro.r0.L12639328004344855510 r41, final dev.epro.r0.L12639328004344855510 r42, dev.epro.r0.J12078565427869724451 r43, final dev.epro.r0.L12639328004344855510 r44, final dev.epro.r0.L12639328004344855510 r45, dev.epro.r0.L12639328004344855510 r46, final dev.epro.r0.L12639328004344855510 r47, final boolean r48, final dev.epro.r0.O8448855611469183895 r49, final dev.epro.r0.V1146169337721842405 r50, final dev.epro.r0.T15443218846549482730 r51, dev.epro.r0.L12639328004344855510 r52, dev.epro.r0.T1241271073913685060 r53, dev.epro.r0.M3727281027331139839 r54, final int r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 1646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C468629748621011703.b(dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.J12078565427869724451, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, boolean, dev.epro.r0.O8448855611469183895, dev.epro.r0.V1146169337721842405, dev.epro.r0.T15443218846549482730, dev.epro.r0.L12639328004344855510, dev.epro.r0.T1241271073913685060, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final native void c(List list, List list2, long j, long j2, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i);

    public static int d(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) + i4;
    }

    public static String e(int i, String str) {
        return G6547577305291411977.n(i, str);
    }

    public static final native B1061516154492673368 f(List list, float f, float f2, float f3);

    public static final String g(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final F18341548724281518495 h(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            F18341548724281518495 f18341548724281518495 = tag instanceof F18341548724281518495 ? (F18341548724281518495) tag : null;
            if (f18341548724281518495 != null) {
                return f18341548724281518495;
            }
            Object objG = P13747563277035175218.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return null;
    }

    public static final Object i(E10198359844879945462 e10198359844879945462, P14992748401341948828 p14992748401341948828) {
        Object objG = e10198359844879945462.a.g(p14992748401341948828);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final W1972671267364756056 j(Object[] objArr, Z8888095354249304160 z8888095354249304160, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        z8888095354249304160.getClass();
        byte b = 20;
        return (W1972671267364756056) l(objArrCopyOf, new V10300877997588547986(new Q15027034467569330017(z8888095354249304160, (byte) 14), new H8734584053421516944(z8888095354249304160, b), b), b13729205492206812220, m3727281027331139839, ((i << 3) & 7168) | 384);
    }

    public static final Object k(Object[] objArr, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i) {
        return l(Arrays.copyOf(objArr, objArr.length), I3887072968740112330.a0, b13729205492206812220, m3727281027331139839, ((i << 6) & 7168) | 384);
    }

    public static final Object l(Object[] objArr, Z8888095354249304160 z8888095354249304160, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i) {
        Object[] objArr2;
        Z8888095354249304160 z88880953542493041602;
        Object obj;
        Object objE;
        long j = m3727281027331139839.T;
        M9216324016624295870.q(36);
        String string = Long.toString(j, 36);
        string.getClass();
        z8888095354249304160.getClass();
        P14826151584039718691 p14826151584039718691 = (P14826151584039718691) m3727281027331139839.j(T1414416723643307303.a);
        Object objM = m3727281027331139839.M();
        Object obj2 = O9023047933786425027.a;
        if (objM == obj2) {
            Object objF = (p14826151584039718691 == null || (objE = p14826151584039718691.e(string)) == null) ? null : z8888095354249304160.f(objE);
            if (objF == null) {
                objF = b13729205492206812220.invoke();
            }
            objArr2 = objArr;
            z88880953542493041602 = z8888095354249304160;
            Object e13808449687169887804 = new E13808449687169887804(z88880953542493041602, p14826151584039718691, string, objF, objArr2);
            m3727281027331139839.k0(e13808449687169887804);
            objM = e13808449687169887804;
        } else {
            objArr2 = objArr;
            z88880953542493041602 = z8888095354249304160;
        }
        E13808449687169887804 e138084496871698878042 = (E13808449687169887804) objM;
        Object objInvoke = Arrays.equals(objArr2, e138084496871698878042.e) ? e138084496871698878042.d : null;
        if (objInvoke == null) {
            objInvoke = b13729205492206812220.invoke();
        }
        boolean zH = m3727281027331139839.h(e138084496871698878042) | ((((i & 112) ^ 48) > 32 && m3727281027331139839.h(z88880953542493041602)) || (i & 48) == 32) | m3727281027331139839.h(p14826151584039718691) | m3727281027331139839.f(string) | m3727281027331139839.h(objInvoke) | m3727281027331139839.h(objArr2);
        Object objM2 = m3727281027331139839.M();
        if (zH || objM2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object h5218391517692938989 = new H5218391517692938989((Object) e138084496871698878042, (Object) z88880953542493041602, (Object) p14826151584039718691, (Object) string, obj, (Object) objArr3, (byte) 2);
            m3727281027331139839.k0(h5218391517692938989);
            objM2 = h5218391517692938989;
        } else {
            obj = objInvoke;
        }
        Q13169198992966610970.B((B13729205492206812220) objM2, m3727281027331139839);
        return obj;
    }

    public static final Object m(Object[] objArr, Z8888095354249304160 z8888095354249304160, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i) {
        return l(Arrays.copyOf(objArr, objArr.length), z8888095354249304160, b13729205492206812220, m3727281027331139839, ((i << 3) & 7168) | (i & 112) | 384);
    }

    public static final native String n(String str);

    public static final native void o(L13135072960070674001 l13135072960070674001, H9594781759364688001 h9594781759364688001, boolean z);

    public static final native int p(X7961873132089763176 x7961873132089763176);

    public static final native String q(int i, String str, String str2);

    public static final native Q7430090668634766253 r(Q7430090668634766253 q7430090668634766253, Q7430090668634766253 q74300906686347662532);

    public static final native Q7430090668634766253 s(Q7430090668634766253 q7430090668634766253);

    public static final native Q7430090668634766253 t(Q7430090668634766253 q7430090668634766253, String str);

    public static void u(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iA = A(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        D(parcel, iA);
    }

    public static void v(Parcel parcel, String str, int i) {
        if (str == null) {
            return;
        }
        int iA = A(parcel, i);
        parcel.writeString(str);
        D(parcel, iA);
    }

    public static void w(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iA = A(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        D(parcel, iA);
    }

    public static void x(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iA = A(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        D(parcel, iA);
    }

    public static Intent y(String str, String str2, Map map) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    builderAppendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    public static void z(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }
}
