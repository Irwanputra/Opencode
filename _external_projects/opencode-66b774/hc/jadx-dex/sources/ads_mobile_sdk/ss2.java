package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class ss2 extends ads_mobile_sdk.e2 {
    public java.lang.String l;
    public final ads_mobile_sdk.ts2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss2(ads_mobile_sdk.mi3 mi3Var, dev.epro.r0.U4857089234315512256 u4857089234315512256, ads_mobile_sdk.qw2 qw2Var, long j, int i, ads_mobile_sdk.z1 z1Var, ads_mobile_sdk.hv hvVar, ads_mobile_sdk.d33 d33Var, java.lang.String str, ads_mobile_sdk.eg2 eg2Var) {
        super(mi3Var, u4857089234315512256, qw2Var, j, i, z1Var, hvVar, d33Var, str, eg2Var);
        mi3Var.getClass();
        u4857089234315512256.getClass();
        qw2Var.getClass();
        z1Var.getClass();
        hvVar.getClass();
        d33Var.getClass();
        str.getClass();
        eg2Var.getClass();
        this.m = new ads_mobile_sdk.ts2();
    }

    public final dev.epro.r0.S4967920478913205567 a(android.os.Bundle bundle, java.util.LinkedHashMap linkedHashMap) {
        java.lang.String str = this.l;
        if (str == null) {
            dev.epro.r0.S10823041268949770285.b0("innerAdUnitId");
            throw null;
        }
        dev.epro.r0.U4857089234315512256 u4857089234315512256 = this.b;
        u4857089234315512256.getClass();
        return new dev.epro.r0.S4967920478913205567(str, u4857089234315512256.a, u4857089234315512256.b, u4857089234315512256.c, bundle, u4857089234315512256.e, u4857089234315512256.f, linkedHashMap, u4857089234315512256.h);
    }

    public final boolean b() {
        java.lang.String strP;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.f.c;
        if (i16631908410500040363 == null) {
            strP = "";
        } else {
            try {
                strP = i16631908410500040363.w("pubid").p();
                strP.getClass();
            } catch (java.lang.Exception unused) {
                strP = "";
            }
        }
        return strP.length() > 0;
    }

    public final android.os.Bundle g() {
        android.os.Bundle bundle;
        dev.epro.r0.U4857089234315512256 u4857089234315512256 = this.b;
        u4857089234315512256.getClass();
        android.os.Bundle bundle2 = dev.epro.r0.U15853425786981391261.class.equals(dev.epro.r0.U15853425786981391261.class) ? u4857089234315512256.d : (android.os.Bundle) u4857089234315512256.g.get(dev.epro.r0.U15853425786981391261.class.getName());
        android.os.Bundle bundleB = ads_mobile_sdk.d62.b(this.f.c);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            bundle = bundle2 != null ? dev.epro.r0.J16238531192459137453.e(bundle2) : null;
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
        } else {
            bundle = new android.os.Bundle(bundle2);
        }
        if (bundle.getBoolean("_newBundle")) {
            bundle = new android.os.Bundle(bundle);
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundleB.getString("mad_hac"));
        if (!android.text.TextUtils.isEmpty(bundleB.getString("adJson"))) {
            bundle.putString("_ad", bundleB.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }

    public final void h() {
        java.lang.String str = this.l;
        if (str == null) {
            dev.epro.r0.S10823041268949770285.b0("innerAdUnitId");
            throw null;
        }
        ads_mobile_sdk.z1 z1Var = this.f;
        java.lang.String str2 = z1Var.h;
        java.util.ArrayList arrayList = z1Var.v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            java.lang.String string = ((android.net.Uri) obj).toString();
            string.getClass();
            arrayList2.add(string);
        }
        java.util.ArrayList arrayList3 = z1Var.H;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(arrayList3, 10));
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            java.lang.Object obj2 = arrayList3.get(i2);
            i2++;
            java.lang.String string2 = ((android.net.Uri) obj2).toString();
            string2.getClass();
            arrayList4.add(string2);
        }
        java.util.ArrayList arrayList5 = z1Var.Q;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(arrayList5, 10));
        int size3 = arrayList5.size();
        int i3 = 0;
        while (i3 < size3) {
            java.lang.Object obj3 = arrayList5.get(i3);
            i3++;
            java.lang.String string3 = ((android.net.Uri) obj3).toString();
            string3.getClass();
            arrayList6.add(string3);
        }
        java.util.ArrayList arrayList7 = z1Var.D;
        java.util.ArrayList arrayList8 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(arrayList7, 10));
        int size4 = arrayList7.size();
        int i4 = 0;
        while (i4 < size4) {
            java.lang.Object obj4 = arrayList7.get(i4);
            i4++;
            java.lang.String string4 = ((android.net.Uri) obj4).toString();
            string4.getClass();
            arrayList8.add(string4);
        }
        java.util.ArrayList arrayList9 = z1Var.j0;
        java.util.ArrayList arrayList10 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(arrayList9, 10));
        int size5 = arrayList9.size();
        int i5 = 0;
        while (i5 < size5) {
            java.lang.Object obj5 = arrayList9.get(i5);
            i5++;
            java.lang.String string5 = ((android.net.Uri) obj5).toString();
            string5.getClass();
            arrayList10.add(string5);
        }
        java.util.ArrayList arrayList11 = z1Var.f0;
        java.util.ArrayList arrayList12 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(arrayList11, 10));
        int size6 = arrayList11.size();
        int i6 = 0;
        while (i6 < size6) {
            java.lang.Object obj6 = arrayList11.get(i6);
            i6++;
            java.lang.String string6 = ((android.net.Uri) obj6).toString();
            string6.getClass();
            arrayList12.add(string6);
        }
        java.util.ArrayList arrayList13 = z1Var.i0;
        java.util.ArrayList arrayList14 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(arrayList13, 10));
        int size7 = arrayList13.size();
        int i7 = 0;
        while (i7 < size7) {
            java.lang.Object obj7 = arrayList13.get(i7);
            i7++;
            java.lang.String string7 = ((android.net.Uri) obj7).toString();
            string7.getClass();
            arrayList14.add(string7);
        }
        dev.epro.r0.B6740141578304212918 b6740141578304212918 = new dev.epro.r0.B6740141578304212918(str, str2, arrayList2, arrayList4, arrayList6, arrayList8, arrayList10, arrayList12, arrayList14, z1Var.L, z1Var.Y, z1Var.o0, z1Var.Z);
        ads_mobile_sdk.sx2 sx2Var = z1Var.k0;
        if (sx2Var != null) {
            b6740141578304212918.m = dev.epro.r0.K5751602218013079365.U(dev.epro.r0.O5354877807466160604.z(new dev.epro.r0.H9390398899829886498[]{new dev.epro.r0.H9390398899829886498("rb_amount", java.lang.Integer.valueOf(sx2Var.a)), new dev.epro.r0.H9390398899829886498("rb_type", sx2Var.b)}));
        }
        ads_mobile_sdk.ts2 ts2Var = this.m;
        ts2Var.a = b6740141578304212918;
        ads_mobile_sdk.hv hvVar = this.g;
        java.util.ArrayList arrayList15 = hvVar.m;
        java.util.ArrayList arrayList16 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(arrayList15, 10));
        int size8 = arrayList15.size();
        int i8 = 0;
        while (i8 < size8) {
            java.lang.Object obj8 = arrayList15.get(i8);
            i8++;
            java.lang.String string8 = ((android.net.Uri) obj8).toString();
            string8.getClass();
            arrayList16.add(string8);
        }
        long j = hvVar.n;
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        ts2Var.b = new dev.epro.r0.R12571380001039363943(arrayList16, dev.epro.r0.E17093345031926825464.k(j, dev.epro.r0.N13798149404328803870.e), hvVar.h, hvVar.q);
    }
}
