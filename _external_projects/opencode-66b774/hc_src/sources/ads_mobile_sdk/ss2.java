package ads_mobile_sdk;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import dev.epro.r0.B6740141578304212918;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O5354877807466160604;
import dev.epro.r0.R12571380001039363943;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S4967920478913205567;
import dev.epro.r0.U15853425786981391261;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.Z115818233709597990;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class ss2 extends e2 {
    public String l;
    public final ts2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss2(mi3 mi3Var, U4857089234315512256 u4857089234315512256, qw2 qw2Var, long j, int i, z1 z1Var, hv hvVar, d33 d33Var, String str, eg2 eg2Var) {
        super(mi3Var, u4857089234315512256, qw2Var, j, i, z1Var, hvVar, d33Var, str, eg2Var);
        mi3Var.getClass();
        u4857089234315512256.getClass();
        qw2Var.getClass();
        z1Var.getClass();
        hvVar.getClass();
        d33Var.getClass();
        str.getClass();
        eg2Var.getClass();
        this.m = new ts2();
    }

    public final S4967920478913205567 a(Bundle bundle, LinkedHashMap linkedHashMap) {
        String str = this.l;
        if (str == null) {
            S10823041268949770285.b0("innerAdUnitId");
            throw null;
        }
        U4857089234315512256 u4857089234315512256 = this.b;
        u4857089234315512256.getClass();
        return new S4967920478913205567(str, u4857089234315512256.a, u4857089234315512256.b, u4857089234315512256.c, bundle, u4857089234315512256.e, u4857089234315512256.f, linkedHashMap, u4857089234315512256.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f A[ORIG_RETURN, RETURN] */
    @Override // dev.epro.r0.U10184268024341301528
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r1 = this;
            ads_mobile_sdk.z1 r1 = r1.f
            dev.epro.r0.I16631908410500040363 r1 = r1.c
            java.lang.String r0 = "pubid"
            if (r1 != 0) goto L9
            goto L15
        L9:
            dev.epro.r0.K15572083692188606544 r1 = r1.w(r0)     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = r1.p()     // Catch: java.lang.Exception -> L15
            r1.getClass()     // Catch: java.lang.Exception -> L15
            goto L17
        L15:
            java.lang.String r1 = ""
        L17:
            int r1 = r1.length()
            if (r1 <= 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ss2.b():boolean");
    }

    public final Bundle g() {
        Bundle bundle;
        U4857089234315512256 u4857089234315512256 = this.b;
        u4857089234315512256.getClass();
        Bundle bundle2 = U15853425786981391261.class.equals(U15853425786981391261.class) ? u4857089234315512256.d : (Bundle) u4857089234315512256.g.get(U15853425786981391261.class.getName());
        Bundle b = d62.b(this.f.c);
        if (Build.VERSION.SDK_INT >= 26) {
            bundle = bundle2 != null ? bundle2.deepCopy() : null;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } else {
            bundle = new Bundle(bundle2);
        }
        if (bundle.getBoolean("_newBundle")) {
            bundle = new Bundle(bundle);
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", b.getString("mad_hac"));
        if (!TextUtils.isEmpty(b.getString("adJson"))) {
            bundle.putString("_ad", b.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }

    public final void h() {
        String str = this.l;
        if (str == null) {
            S10823041268949770285.b0("innerAdUnitId");
            throw null;
        }
        z1 z1Var = this.f;
        String str2 = z1Var.h;
        ArrayList arrayList = z1Var.v;
        ArrayList arrayList2 = new ArrayList(Z115818233709597990.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String uri = ((Uri) obj).toString();
            uri.getClass();
            arrayList2.add(uri);
        }
        ArrayList arrayList3 = z1Var.H;
        ArrayList arrayList4 = new ArrayList(Z115818233709597990.k0(arrayList3, 10));
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            String uri2 = ((Uri) obj2).toString();
            uri2.getClass();
            arrayList4.add(uri2);
        }
        ArrayList arrayList5 = z1Var.Q;
        ArrayList arrayList6 = new ArrayList(Z115818233709597990.k0(arrayList5, 10));
        int size3 = arrayList5.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList5.get(i3);
            i3++;
            String uri3 = ((Uri) obj3).toString();
            uri3.getClass();
            arrayList6.add(uri3);
        }
        ArrayList arrayList7 = z1Var.D;
        ArrayList arrayList8 = new ArrayList(Z115818233709597990.k0(arrayList7, 10));
        int size4 = arrayList7.size();
        int i4 = 0;
        while (i4 < size4) {
            Object obj4 = arrayList7.get(i4);
            i4++;
            String uri4 = ((Uri) obj4).toString();
            uri4.getClass();
            arrayList8.add(uri4);
        }
        ArrayList arrayList9 = z1Var.j0;
        ArrayList arrayList10 = new ArrayList(Z115818233709597990.k0(arrayList9, 10));
        int size5 = arrayList9.size();
        int i5 = 0;
        while (i5 < size5) {
            Object obj5 = arrayList9.get(i5);
            i5++;
            String uri5 = ((Uri) obj5).toString();
            uri5.getClass();
            arrayList10.add(uri5);
        }
        ArrayList arrayList11 = z1Var.f0;
        ArrayList arrayList12 = new ArrayList(Z115818233709597990.k0(arrayList11, 10));
        int size6 = arrayList11.size();
        int i6 = 0;
        while (i6 < size6) {
            Object obj6 = arrayList11.get(i6);
            i6++;
            String uri6 = ((Uri) obj6).toString();
            uri6.getClass();
            arrayList12.add(uri6);
        }
        ArrayList arrayList13 = z1Var.i0;
        ArrayList arrayList14 = new ArrayList(Z115818233709597990.k0(arrayList13, 10));
        int size7 = arrayList13.size();
        int i7 = 0;
        while (i7 < size7) {
            Object obj7 = arrayList13.get(i7);
            i7++;
            String uri7 = ((Uri) obj7).toString();
            uri7.getClass();
            arrayList14.add(uri7);
        }
        B6740141578304212918 b6740141578304212918 = new B6740141578304212918(str, str2, arrayList2, arrayList4, arrayList6, arrayList8, arrayList10, arrayList12, arrayList14, z1Var.L, z1Var.Y, z1Var.o0, z1Var.Z);
        sx2 sx2Var = z1Var.k0;
        if (sx2Var != null) {
            b6740141578304212918.m = K5751602218013079365.U(O5354877807466160604.z(new H9390398899829886498("rb_amount", Integer.valueOf(sx2Var.a)), new H9390398899829886498("rb_type", sx2Var.b)));
        }
        ts2 ts2Var = this.m;
        ts2Var.a = b6740141578304212918;
        hv hvVar = this.g;
        ArrayList arrayList15 = hvVar.m;
        ArrayList arrayList16 = new ArrayList(Z115818233709597990.k0(arrayList15, 10));
        int size8 = arrayList15.size();
        int i8 = 0;
        while (i8 < size8) {
            Object obj8 = arrayList15.get(i8);
            i8++;
            String uri8 = ((Uri) obj8).toString();
            uri8.getClass();
            arrayList16.add(uri8);
        }
        long j = hvVar.n;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        ts2Var.b = new R12571380001039363943(arrayList16, E17093345031926825464.k(j, N13798149404328803870.SECONDS), hvVar.h, hvVar.q);
    }
}
