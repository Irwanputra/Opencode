package dev.epro.r0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S790996689653940400 {
    public final /* synthetic */ byte a = 1;
    public final List b;
    public final Map c;

    public S790996689653940400(Map map, List list) {
        this.c = map;
        this.b = list;
    }

    public static void a(D10561744321209513073 d10561744321209513073) throws GeneralSecurityException {
        for (X7969147725001179512 x7969147725001179512 : d10561744321209513073.y()) {
            if (x7969147725001179512.w().x() == Y7386946880990094255.UNKNOWN_KEYMATERIAL || x7969147725001179512.w().x() == Y7386946880990094255.SYMMETRIC || x7969147725001179512.w().x() == Y7386946880990094255.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(G6547577305291411977.t("keyset contains key material of type ", x7969147725001179512.w().x().name(), " for type url ", x7969147725001179512.w().y()));
            }
        }
    }

    public static String b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#r8-abstract-class";
    }

    public static final S790996689653940400 c(D10561744321209513073 d10561744321209513073) throws GeneralSecurityException {
        Z1953481206310471956 u2157586126377853843;
        boolean z;
        if (d10561744321209513073.x() <= 0) {
            W4415201450379021245.c("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(d10561744321209513073.x());
        Iterator it = d10561744321209513073.y().iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                List<Y8831258500803408458> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                if (J3301701597851028733.w(N5158094851646208854.class) == null) {
                    HashSet hashSet = new HashSet();
                    for (Y8831258500803408458 y8831258500803408458 : listUnmodifiableList) {
                        int i = y8831258500803408458.d;
                        if (hashSet.contains(Integer.valueOf(i))) {
                            throw new GeneralSecurityException(G6547577305291411977.o(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                        }
                        hashSet.add(Integer.valueOf(i));
                        if (y8831258500803408458.e) {
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        W4415201450379021245.c("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                        return null;
                    }
                }
                return new S790996689653940400(listUnmodifiableList, new HashMap());
            }
            X7969147725001179512 x7969147725001179512 = (X7969147725001179512) it.next();
            int iX = x7969147725001179512.x();
            try {
                I1581330382723795749 i1581330382723795749K = k(x7969147725001179512);
                S15709944382977446712 s15709944382977446712 = (S15709944382977446712) J3301701597851028733.w(S15709944382977446712.class);
                if (s15709944382977446712 == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to serialize into proto keyset format.");
                }
                u2157586126377853843 = s15709944382977446712.b(i1581330382723795749K);
                z = false;
            } catch (GeneralSecurityException e) {
                if (J3301701597851028733.w(N5158094851646208854.class) == null) {
                    throw e;
                }
                u2157586126377853843 = new U2157586126377853843(k(x7969147725001179512));
                z = true;
            }
            Z1953481206310471956 z1953481206310471956 = u2157586126377853843;
            if (J3301701597851028733.w(N5158094851646208854.class) == null && !i(x7969147725001179512.z())) {
                W4415201450379021245.c("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            arrayList.add(new Y8831258500803408458(z1953481206310471956, x7969147725001179512.z(), iX, iX == d10561744321209513073.z(), z));
        }
    }

    public static boolean i(D12150776842870782007 d12150776842870782007) {
        int iOrdinal = d12150776842870782007.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }

    public static final S790996689653940400 j(J6579077889109668233 j6579077889109668233) throws GeneralSecurityException, IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = j6579077889109668233.a;
            try {
                try {
                    D10561744321209513073 d10561744321209513073B = J6579077889109668233.b(P1853490117004660039.b(new String(J4219316148152617991.a(byteArrayInputStream), J6579077889109668233.b)).l());
                    byteArrayInputStream.close();
                    try {
                        D10561744321209513073 d10561744321209513073B2 = D10561744321209513073.B(d10561744321209513073B.e(), R4931231174251890987.a());
                        a(d10561744321209513073B2);
                        return c(d10561744321209513073B2);
                    } catch (N11355818201711573941 unused) {
                        W4415201450379021245.c("invalid keyset");
                        return null;
                    }
                } catch (Throwable th) {
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (J18177443637724208589 | IllegalStateException e) {
                throw new IOException(e);
            }
        } catch (N11355818201711573941 unused2) {
            W4415201450379021245.c("invalid keyset");
            return null;
        }
    }

    public static I1581330382723795749 k(X7969147725001179512 x7969147725001179512) {
        return I1581330382723795749.f(x7969147725001179512.w().y(), x7969147725001179512.w().z(), O8620973563946607355.E(x7969147725001179512.w().x()), O8620973563946607355.F(x7969147725001179512.y()), x7969147725001179512.y() == D16925706105132416423.RAW ? null : Integer.valueOf(x7969147725001179512.x()));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dev.epro.r0.H4563649114871566866 d(dev.epro.r0.K11898134656129953686 r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S790996689653940400.d(dev.epro.r0.K11898134656129953686, boolean):dev.epro.r0.H4563649114871566866");
    }

    public Y8831258500803408458 e(int i) {
        List list = this.b;
        if (i < 0 || i >= list.size()) {
            W4415201450379021245.a(E12098517352909843120.l("Invalid index ", i, list.size(), " for keyset of size "));
            return null;
        }
        Y8831258500803408458 y8831258500803408458 = (Y8831258500803408458) list.get(i);
        if (!i(y8831258500803408458.b)) {
            S10973172697741180971.m(G6547577305291411977.o(i, "Keyset-Entry at position ", " has wrong status"));
            return null;
        }
        if (!y8831258500803408458.f) {
            return (Y8831258500803408458) list.get(i);
        }
        S10973172697741180971.m(G6547577305291411977.o(i, "Keyset-Entry at position ", " didn't parse correctly"));
        return null;
    }

    public B11497446003819824585 f() throws GeneralSecurityException {
        D10561744321209513073 d10561744321209513073;
        J17709767831594123196 j17709767831594123196A = D10561744321209513073.A();
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                d10561744321209513073 = (D10561744321209513073) j17709767831594123196A.b();
                break;
            }
            Y8831258500803408458 y8831258500803408458 = (Y8831258500803408458) it.next();
            Z1953481206310471956 z1953481206310471956 = y8831258500803408458.a;
            int i = y8831258500803408458.d;
            D12150776842870782007 d12150776842870782007 = y8831258500803408458.b;
            S15709944382977446712 s15709944382977446712 = (S15709944382977446712) J3301701597851028733.w(S15709944382977446712.class);
            d10561744321209513073 = null;
            if (s15709944382977446712 == null) {
                W4415201450379021245.c("Passed in configuration cannot be used to parse and serialize proto keysets.");
                break;
            }
            I1581330382723795749 i1581330382723795749A = s15709944382977446712.a(z1953481206310471956);
            Integer numI = z1953481206310471956.I();
            if (numI != null && numI.intValue() != i) {
                W4415201450379021245.c("Wrong ID set for key with ID requirement");
                break;
            }
            X5323160068642314661 x5323160068642314661A = X7969147725001179512.A();
            T7743375851574038581 t7743375851574038581A = V817572303467081827.A();
            String str = (String) i1581330382723795749A.a;
            t7743375851574038581A.e();
            ((V817572303467081827) t7743375851574038581A.b).C(str);
            N17666688112968464504 n17666688112968464504 = (N17666688112968464504) i1581330382723795749A.b;
            t7743375851574038581A.e();
            ((V817572303467081827) t7743375851574038581A.b).D(n17666688112968464504);
            Y7386946880990094255 y7386946880990094255U = O8620973563946607355.U((D14731132657808549702) i1581330382723795749A.c);
            t7743375851574038581A.e();
            ((V817572303467081827) t7743375851574038581A.b).B(y7386946880990094255U);
            x5323160068642314661A.e();
            ((X7969147725001179512) x5323160068642314661A.b).B((V817572303467081827) t7743375851574038581A.b());
            x5323160068642314661A.e();
            ((X7969147725001179512) x5323160068642314661A.b).E(d12150776842870782007);
            x5323160068642314661A.e();
            ((X7969147725001179512) x5323160068642314661A.b).C(i);
            D16925706105132416423 d16925706105132416423V = O8620973563946607355.V((D14731132657808549702) i1581330382723795749A.d);
            x5323160068642314661A.e();
            ((X7969147725001179512) x5323160068642314661A.b).D(d16925706105132416423V);
            X7969147725001179512 x7969147725001179512 = (X7969147725001179512) x5323160068642314661A.b();
            j17709767831594123196A.e();
            ((D10561744321209513073) j17709767831594123196A.b).w(x7969147725001179512);
            if (y8831258500803408458.e) {
                j17709767831594123196A.e();
                ((D10561744321209513073) j17709767831594123196A.b).C(i);
            }
        }
        int i2 = J4219316148152617991.a;
        R11359628841234317791 r11359628841234317791X = B11497446003819824585.x();
        int iZ = d10561744321209513073.z();
        r11359628841234317791X.e();
        ((B11497446003819824585) r11359628841234317791X.b).y(iZ);
        for (X7969147725001179512 x79691477250011795122 : d10561744321209513073.y()) {
            T3006616024322943342 t3006616024322943342W = V2461605201390006818.w();
            String strY = x79691477250011795122.w().y();
            t3006616024322943342W.e();
            ((V2461605201390006818) t3006616024322943342W.b).A(strY);
            D12150776842870782007 d12150776842870782007Z = x79691477250011795122.z();
            t3006616024322943342W.e();
            ((V2461605201390006818) t3006616024322943342W.b).z(d12150776842870782007Z);
            D16925706105132416423 d16925706105132416423Y = x79691477250011795122.y();
            t3006616024322943342W.e();
            ((V2461605201390006818) t3006616024322943342W.b).y(d16925706105132416423Y);
            int iX = x79691477250011795122.x();
            t3006616024322943342W.e();
            ((V2461605201390006818) t3006616024322943342W.b).x(iX);
            V2461605201390006818 v2461605201390006818 = (V2461605201390006818) t3006616024322943342W.b();
            r11359628841234317791X.e();
            ((B11497446003819824585) r11359628841234317791X.b).w(v2461605201390006818);
        }
        return (B11497446003819824585) r11359628841234317791X.b();
    }

    public Y8831258500803408458 g() {
        for (Y8831258500803408458 y8831258500803408458 : this.b) {
            if (y8831258500803408458 != null && y8831258500803408458.e) {
                if (y8831258500803408458.c == D14731132657808549702.R) {
                    return y8831258500803408458;
                }
                S10973172697741180971.m("Keyset has primary which isn't enabled");
                return null;
            }
        }
        S10973172697741180971.m("Keyset has no valid primary");
        return null;
    }

    public Object h() throws GeneralSecurityException {
        Object obj;
        J4250663911053539605 j4250663911053539605D0;
        List arrayList;
        J4250663911053539605 j4250663911053539605D02;
        List list;
        J4250663911053539605 j4250663911053539605D03;
        List arrayList2;
        J4250663911053539605 j4250663911053539605D04;
        List arrayList3;
        D14731132657808549702 d14731132657808549702 = D14731132657808549702.R;
        int i = 0;
        int i2 = 0;
        while (true) {
            List list2 = this.b;
            Object obj2 = null;
            if (i2 >= list2.size()) {
                W4415201450379021245.c("keyset must contain at least one ENABLED key");
                return null;
            }
            if (((Y8831258500803408458) list2.get(i2)).c == d14731132657808549702) {
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    if (((Y8831258500803408458) list2.get(i3)).f || !i(((Y8831258500803408458) list2.get(i3)).b)) {
                        Z1953481206310471956 z1953481206310471956 = ((Y8831258500803408458) list2.get(i3)).a;
                        throw new GeneralSecurityException("Key parsing of key with index " + i3 + " and type_url " + (z1953481206310471956 instanceof U2157586126377853843 ? (String) ((U2157586126377853843) z1953481206310471956).j.a : "(unknown)") + " failed, unable to get primitive");
                    }
                }
                int i4 = J4219316148152617991.a;
                boolean z = false;
                for (int i5 = 0; i5 < list2.size(); i5++) {
                    Y8831258500803408458 y8831258500803408458E = e(i5);
                    if (y8831258500803408458E.c == d14731132657808549702 && y8831258500803408458E.e) {
                        if (z) {
                            W4415201450379021245.c("keyset contains multiple primary keys");
                            return null;
                        }
                        z = true;
                    }
                }
                C3286149729114985901 c3286149729114985901 = (C3286149729114985901) N3927999612950865786.b.a.get();
                HashMap map = c3286149729114985901.b;
                if (!map.containsKey(A8947685337014270457.class)) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(A8947685337014270457.class)));
                }
                G153318823017092791 g153318823017092791 = (G153318823017092791) map.get(A8947685337014270457.class);
                A12732730042960812466 a12732730042960812466 = new A12732730042960812466(c3286149729114985901, g153318823017092791, (byte) 5);
                byte b = g153318823017092791.a;
                byte b2 = 6;
                Map map2 = this.c;
                switch (b) {
                    case 0:
                        obj = null;
                        if (!Z12670897225348479586.a(this)) {
                            W4415201450379021245.c("keyset doesn't contain a valid primary key");
                        } else {
                            HashMap map3 = new HashMap();
                            while (true) {
                                if (i < list2.size()) {
                                    Y8831258500803408458 y8831258500803408458E2 = e(i);
                                    if (y8831258500803408458E2.c == D14731132657808549702.R) {
                                        Z1953481206310471956 z19534812063104719562 = y8831258500803408458E2.a;
                                        if (z19534812063104719562 instanceof L15643109466764766419) {
                                            j4250663911053539605D0 = ((L15643109466764766419) z19534812063104719562).d0();
                                        } else {
                                            if (!(z19534812063104719562 instanceof U2157586126377853843)) {
                                                throw new GeneralSecurityException(G6547577305291411977.t("Cannot get output prefix for key of class ", z19534812063104719562.getClass().getName(), " with parameters ", String.valueOf(z19534812063104719562.N())));
                                            }
                                            j4250663911053539605D0 = ((U2157586126377853843) z19534812063104719562).d0();
                                        }
                                        O12545633033254628644 o12545633033254628644 = new O12545633033254628644(b2);
                                        byte[] bArr = j4250663911053539605D0.a;
                                        if (bArr.length == 0 || bArr.length == 5) {
                                            if (map3.containsKey(j4250663911053539605D0)) {
                                                arrayList = (List) map3.get(j4250663911053539605D0);
                                            } else {
                                                arrayList = new ArrayList();
                                                map3.put(j4250663911053539605D0, arrayList);
                                            }
                                            arrayList.add(o12545633033254628644);
                                        } else {
                                            W4415201450379021245.c("PrefixMap only supports 0 and 5 byte prefixes");
                                        }
                                        break;
                                    }
                                    i++;
                                } else {
                                    if (map2.get(C9869900372345142877.class) == null) {
                                        g();
                                        return new C12886615544961773984();
                                    }
                                    Z3383101362411723454.s();
                                }
                            }
                        }
                        break;
                    case 1:
                        obj = null;
                        if (Z12670897225348479586.a(this)) {
                            Y8831258500803408458 y8831258500803408458G = g();
                            HashMap map4 = new HashMap();
                            while (i < list2.size()) {
                                Y8831258500803408458 y8831258500803408458E3 = e(i);
                                if (y8831258500803408458E3.c == D14731132657808549702.R) {
                                    Y7661440305297242229 y7661440305297242229 = (Y7661440305297242229) a12732730042960812466.b(y8831258500803408458E3);
                                    Z1953481206310471956 z19534812063104719563 = y8831258500803408458E3.a;
                                    if (z19534812063104719563 instanceof Q7504102977495567709) {
                                        j4250663911053539605D02 = ((Q7504102977495567709) z19534812063104719563).d0();
                                    } else {
                                        if (!(z19534812063104719563 instanceof U2157586126377853843)) {
                                            throw new GeneralSecurityException(G6547577305291411977.t("Cannot get output prefix for key of class ", z19534812063104719563.getClass().getName(), " with parameters ", String.valueOf(z19534812063104719563.N())));
                                        }
                                        j4250663911053539605D02 = ((U2157586126377853843) z19534812063104719563).d0();
                                    }
                                    byte[] bArr2 = j4250663911053539605D02.a;
                                    if (bArr2.length == 0 || bArr2.length == 5) {
                                        if (map4.containsKey(j4250663911053539605D02)) {
                                            list = (List) map4.get(j4250663911053539605D02);
                                        } else {
                                            ArrayList arrayList4 = new ArrayList();
                                            map4.put(j4250663911053539605D02, arrayList4);
                                            list = arrayList4;
                                        }
                                        list.add(y7661440305297242229);
                                    } else {
                                        W4415201450379021245.c("PrefixMap only supports 0 and 5 byte prefixes");
                                    }
                                    break;
                                }
                                i++;
                            }
                            return new Y7661440305297242229();
                        }
                        W4415201450379021245.c("keyset doesn't contain a valid primary key");
                        break;
                        break;
                    case 2:
                        if (!Z12670897225348479586.a(this)) {
                            W4415201450379021245.c("keyset doesn't contain a valid primary key");
                            return null;
                        }
                        HashMap map5 = new HashMap();
                        while (true) {
                            if (i >= list2.size()) {
                                obj = obj2;
                                if (map2.get(C9869900372345142877.class) == null) {
                                    g();
                                    return new B5876679728636531530();
                                }
                                Z3383101362411723454.s();
                            } else {
                                Y8831258500803408458 y8831258500803408458E4 = e(i);
                                if (y8831258500803408458E4.c == D14731132657808549702.R) {
                                    Z1953481206310471956 z19534812063104719564 = y8831258500803408458E4.a;
                                    if (z19534812063104719564 instanceof Q7504102977495567709) {
                                        j4250663911053539605D03 = ((Q7504102977495567709) z19534812063104719564).d0();
                                    } else {
                                        if (!(z19534812063104719564 instanceof U2157586126377853843)) {
                                            throw new GeneralSecurityException(G6547577305291411977.t("Cannot get output prefix for key of class ", z19534812063104719564.getClass().getName(), " with parameters ", String.valueOf(z19534812063104719564.N())));
                                        }
                                        j4250663911053539605D03 = ((U2157586126377853843) z19534812063104719564).d0();
                                    }
                                    U11450443558875589191 u11450443558875589191 = new U11450443558875589191((byte) 6);
                                    byte[] bArr3 = j4250663911053539605D03.a;
                                    obj = obj2;
                                    if (bArr3.length == 0 || bArr3.length == 5) {
                                        if (map5.containsKey(j4250663911053539605D03)) {
                                            arrayList2 = (List) map5.get(j4250663911053539605D03);
                                        } else {
                                            arrayList2 = new ArrayList();
                                            map5.put(j4250663911053539605D03, arrayList2);
                                        }
                                        arrayList2.add(u11450443558875589191);
                                    } else {
                                        W4415201450379021245.c("PrefixMap only supports 0 and 5 byte prefixes");
                                    }
                                } else {
                                    obj = obj2;
                                }
                                i++;
                                obj2 = obj;
                            }
                            break;
                        }
                        break;
                    case 3:
                        if (!Z12670897225348479586.a(this)) {
                            W4415201450379021245.c("keyset doesn't contain a valid primary key");
                            return null;
                        }
                        if (map2.get(C9869900372345142877.class) == null) {
                            new Y2677586711477821327((W5605385477019102368) a12732730042960812466.b(g()), g().d);
                            return new E16404348017745658067();
                        }
                        Z3383101362411723454.s();
                        return null;
                    default:
                        HashMap map6 = new HashMap();
                        while (i < list2.size()) {
                            Y8831258500803408458 y8831258500803408458E5 = e(i);
                            if (y8831258500803408458E5.c == D14731132657808549702.R) {
                                A8947685337014270457 a8947685337014270457 = (A8947685337014270457) a12732730042960812466.b(y8831258500803408458E5);
                                Z1953481206310471956 z19534812063104719565 = y8831258500803408458E5.a;
                                if (z19534812063104719565 instanceof M13516036924505351271) {
                                    j4250663911053539605D04 = ((M13516036924505351271) z19534812063104719565).d0();
                                } else {
                                    if (!(z19534812063104719565 instanceof U2157586126377853843)) {
                                        throw new GeneralSecurityException(G6547577305291411977.t("Cannot get output prefix for key of class ", z19534812063104719565.getClass().getName(), " with parameters ", String.valueOf(z19534812063104719565.N())));
                                    }
                                    j4250663911053539605D04 = ((U2157586126377853843) z19534812063104719565).d0();
                                }
                                H4081320665893287884 h4081320665893287884 = new H4081320665893287884(a8947685337014270457, y8831258500803408458E5.d);
                                byte[] bArr4 = j4250663911053539605D04.a;
                                if (bArr4.length != 0 && bArr4.length != 5) {
                                    W4415201450379021245.c("PrefixMap only supports 0 and 5 byte prefixes");
                                    return null;
                                }
                                if (map6.containsKey(j4250663911053539605D04)) {
                                    arrayList3 = (List) map6.get(j4250663911053539605D04);
                                } else {
                                    arrayList3 = new ArrayList();
                                    map6.put(j4250663911053539605D04, arrayList3);
                                }
                                arrayList3.add(h4081320665893287884);
                            }
                            i++;
                        }
                        if (map2.get(C9869900372345142877.class) == null) {
                            return new C7647034763947667805(new A3690406679562215731(map6));
                        }
                        Z3383101362411723454.s();
                        return null;
                }
                return obj;
            }
            i2++;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return this.c.toString();
            default:
                try {
                    return f().toString();
                } catch (GeneralSecurityException e) {
                    throw new IllegalArgumentException("Cannot get keyset info: key cannot be serialized", e);
                }
        }
    }

    public S790996689653940400(List list, Map map) {
        this.b = list;
        this.c = map;
    }
}
