package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class he2 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ java.util.ArrayList a;
    public final /* synthetic */ ads_mobile_sdk.pe2 b;
    public final /* synthetic */ ads_mobile_sdk.qw2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ java.lang.String f;
    public final /* synthetic */ java.lang.String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he2(java.util.ArrayList arrayList, ads_mobile_sdk.pe2 pe2Var, ads_mobile_sdk.qw2 qw2Var, long j, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(1);
        this.a = arrayList;
        this.b = pe2Var;
        this.c = qw2Var;
        this.d = j;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    /* JADX WARN: Finally extract failed */
    public final java.lang.Object invoke(java.lang.Object obj) {
        ads_mobile_sdk.qw2 qw2Var;
        boolean z;
        int i;
        java.lang.Object next;
        ads_mobile_sdk.g6 g6Var;
        ads_mobile_sdk.th3 th3VarA;
        ads_mobile_sdk.qw2 qw2Var2;
        int i2;
        boolean z2;
        ads_mobile_sdk.vr0 vr0Var;
        java.lang.Object objRemove;
        java.lang.Object next2;
        java.lang.Object next3;
        ads_mobile_sdk.ue2 ue2Var;
        ads_mobile_sdk.g1 g1Var = (ads_mobile_sdk.g1) obj;
        g1Var.getClass();
        java.util.ArrayList arrayList = this.a;
        arrayList.clear();
        ads_mobile_sdk.qw2 qw2Var3 = this.c;
        java.lang.String strName = qw2Var3.name();
        ads_mobile_sdk.vr0 vr0VarP = (ads_mobile_sdk.vr0) g1Var.u().get(strName);
        if (vr0VarP == null) {
            vr0VarP = ads_mobile_sdk.vr0.p();
        }
        java.util.Map mapO = vr0VarP.o();
        mapO.getClass();
        ads_mobile_sdk.pe2 pe2Var = this.b;
        long j = this.d;
        java.util.LinkedHashMap linkedHashMapA = pe2Var.a(mapO, j, arrayList);
        dev.epro.r0.S2322588539201815831 s2322588539201815831N = g1Var.n();
        if (linkedHashMapA.isEmpty()) {
            s2322588539201815831N.e().getClass();
            strName.getClass();
            s2322588539201815831N.c(strName);
        } else {
            s2322588539201815831N.e().getClass();
            dev.epro.r0.C7584963549263810245 c7584963549263810245R = ads_mobile_sdk.vr0.r();
            c7584963549263810245R.getClass();
            c7584963549263810245R.e().getClass();
            c7584963549263810245R.b();
            ((ads_mobile_sdk.vr0) c7584963549263810245R.b).q().putAll(linkedHashMapA);
            ads_mobile_sdk.vr0 vr0Var2 = (ads_mobile_sdk.vr0) c7584963549263810245R.a();
            strName.getClass();
            s2322588539201815831N.d(strName, vr0Var2);
        }
        ads_mobile_sdk.g1 g1VarA = (ads_mobile_sdk.g1) s2322588539201815831N.a();
        boolean z3 = true;
        int iA = pe2Var.a(qw2Var3) - 1;
        java.lang.String strName2 = qw2Var3.name();
        ads_mobile_sdk.vr0 vr0Var3 = (ads_mobile_sdk.vr0) g1VarA.u().get(strName2);
        dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_PERSISTENT_CACHE_EVICT;
        if (vr0Var3 == null) {
            qw2Var = qw2Var3;
            z = true;
            i = 0;
        } else {
            java.util.Map mapO2 = vr0Var3.o();
            mapO2.getClass();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(mapO2);
            while (true) {
                java.util.Iterator it = linkedHashMap.values().iterator();
                int iQ = 0;
                while (it.hasNext()) {
                    iQ = ((ads_mobile_sdk.g6) it.next()).q() + iQ;
                }
                if (iQ <= iA || linkedHashMap.isEmpty()) {
                    break;
                }
                java.util.Iterator it2 = linkedHashMap.entrySet().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long jP = ((ads_mobile_sdk.g6) ((java.util.Map.Entry) next).getValue()).p();
                        do {
                            java.lang.Object next4 = it2.next();
                            long jP2 = ((ads_mobile_sdk.g6) ((java.util.Map.Entry) next4).getValue()).p();
                            if (jP > jP2) {
                                next = next4;
                                jP = jP2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) next;
                java.lang.String str = entry != null ? (java.lang.String) entry.getKey() : null;
                if (str == null || (g6Var = (ads_mobile_sdk.g6) linkedHashMap.get(str)) == null) {
                    break;
                }
                ads_mobile_sdk.g1 g1Var2 = g1VarA;
                th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, z3);
                try {
                    if (g6Var.q() > 0) {
                        dev.epro.r0.O6641393078261985068 o6641393078261985068R = g6Var.r();
                        o6641393078261985068R.getClass();
                        java.util.Iterator it3 = o6641393078261985068R.iterator();
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (it3.hasNext()) {
                                long jP3 = ((ads_mobile_sdk.b6) next2).p();
                                do {
                                    java.lang.Object next5 = it3.next();
                                    long jP4 = ((ads_mobile_sdk.b6) next5).p();
                                    if (jP3 > jP4) {
                                        next2 = next5;
                                        jP3 = jP4;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        z2 = z3;
                        ads_mobile_sdk.b6 b6Var = (ads_mobile_sdk.b6) next2;
                        dev.epro.r0.O6641393078261985068 o6641393078261985068R2 = g6Var.r();
                        o6641393078261985068R2.getClass();
                        qw2Var2 = qw2Var3;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : o6641393078261985068R2) {
                            int i3 = iA;
                            ads_mobile_sdk.vr0 vr0Var4 = vr0Var3;
                            if (((ads_mobile_sdk.b6) obj2) != b6Var) {
                                arrayList2.add(obj2);
                            }
                            iA = i3;
                            vr0Var3 = vr0Var4;
                        }
                        i2 = iA;
                        vr0Var = vr0Var3;
                        if (arrayList2.isEmpty()) {
                            linkedHashMap.remove(str);
                        } else {
                            dev.epro.r0.Y12531765857967015337 y12531765857967015337N = g6Var.n();
                            y12531765857967015337N.f().getClass();
                            y12531765857967015337N.e();
                            y12531765857967015337N.f().getClass();
                            y12531765857967015337N.d(arrayList2);
                            linkedHashMap.put(str, (ads_mobile_sdk.g6) y12531765857967015337N.a());
                        }
                        if (b6Var != null) {
                            java.lang.String strQ = b6Var.q();
                            strQ.getClass();
                            objRemove = java.lang.Boolean.valueOf(arrayList.add(strQ));
                        } else {
                            objRemove = null;
                        }
                    } else {
                        qw2Var2 = qw2Var3;
                        i2 = iA;
                        z2 = z3;
                        vr0Var = vr0Var3;
                        objRemove = linkedHashMap.remove(str);
                    }
                    if (objRemove instanceof ads_mobile_sdk.pu0) {
                        ads_mobile_sdk.zi3.a((ads_mobile_sdk.pu0) objRemove, false);
                    }
                    th3VarA.close();
                    g1VarA = g1Var2;
                    z3 = z2;
                    qw2Var3 = qw2Var2;
                    iA = i2;
                    vr0Var3 = vr0Var;
                } catch (java.lang.Throwable th) {
                    try {
                        th3VarA.b(th);
                        if (th instanceof dev.epro.r0.N340633841638932414) {
                            throw th;
                        }
                        if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                            th3VarA.a(th);
                        }
                        if (th instanceof dev.epro.r0.P2480554073835519965) {
                            throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                        }
                        if (th instanceof java.util.concurrent.CancellationException) {
                            throw new ads_mobile_sdk.du0(th);
                        }
                        if (th instanceof ads_mobile_sdk.dv0) {
                            throw th;
                        }
                        throw new ads_mobile_sdk.iu0(th);
                    } finally {
                    }
                }
            }
            qw2Var = qw2Var3;
            z = z3;
            ads_mobile_sdk.vr0 vr0Var5 = vr0Var3;
            i = 0;
            dev.epro.r0.S2322588539201815831 s2322588539201815831N2 = g1VarA.n();
            if (linkedHashMap.isEmpty()) {
                s2322588539201815831N2.e().getClass();
                strName2.getClass();
                s2322588539201815831N2.c(strName2);
            } else {
                s2322588539201815831N2.e().getClass();
                dev.epro.r0.C7584963549263810245 c7584963549263810245 = (dev.epro.r0.C7584963549263810245) vr0Var5.n();
                c7584963549263810245.e().getClass();
                c7584963549263810245.b();
                ((ads_mobile_sdk.vr0) c7584963549263810245.b).q().clear();
                c7584963549263810245.e().getClass();
                c7584963549263810245.b();
                ((ads_mobile_sdk.vr0) c7584963549263810245.b).q().putAll(linkedHashMap);
                ads_mobile_sdk.vr0 vr0Var6 = (ads_mobile_sdk.vr0) c7584963549263810245.a();
                strName2.getClass();
                s2322588539201815831N2.d(strName2, vr0Var6);
            }
            g1VarA = (ads_mobile_sdk.g1) s2322588539201815831N2.a();
        }
        dev.epro.r0.B7506245556754967052 b7506245556754967052 = pe2Var.c;
        b7506245556754967052.getClass();
        int i4 = 10;
        int iIntValue = ((java.lang.Number) b7506245556754967052.a("gads:pc:max_total_cached_ads", (java.lang.Object) 10, (dev.epro.r0.F4096073349764486348) ads_mobile_sdk.ao.a$18)).intValue() - 1;
        while (true) {
            java.util.Iterator it4 = g1VarA.u().values().iterator();
            int i5 = i;
            while (it4.hasNext()) {
                java.util.Iterator it5 = ((ads_mobile_sdk.vr0) it4.next()).o().values().iterator();
                int iQ2 = i;
                while (it5.hasNext()) {
                    iQ2 += ((ads_mobile_sdk.g6) it5.next()).q();
                }
                i5 += iQ2;
            }
            if (i5 <= iIntValue) {
                break;
            }
            java.util.Set setEntrySet = g1VarA.u().entrySet();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = setEntrySet.iterator();
            while (it6.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it6.next();
                java.lang.String str2 = (java.lang.String) entry2.getKey();
                java.util.Set<java.util.Map.Entry> setEntrySet2 = ((ads_mobile_sdk.vr0) entry2.getValue()).o().entrySet();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.util.Map.Entry entry3 : setEntrySet2) {
                    java.lang.String str3 = (java.lang.String) entry3.getKey();
                    dev.epro.r0.O6641393078261985068 o6641393078261985068R3 = ((ads_mobile_sdk.g6) entry3.getValue()).r();
                    o6641393078261985068R3.getClass();
                    int i6 = iIntValue;
                    java.util.Iterator it7 = it6;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(o6641393078261985068R3, i4));
                    java.util.Iterator it8 = o6641393078261985068R3.iterator();
                    while (it8.hasNext()) {
                        arrayList5.add(new dev.epro.r0.D18298016311120566919(str2, str3, (ads_mobile_sdk.b6) it8.next()));
                    }
                    dev.epro.r0.P17571903987102865660.n0(arrayList4, arrayList5);
                    iIntValue = i6;
                    it6 = it7;
                    i4 = 10;
                }
                dev.epro.r0.P17571903987102865660.n0(arrayList3, arrayList4);
                i4 = 10;
            }
            int i7 = iIntValue;
            java.util.Iterator it9 = arrayList3.iterator();
            if (it9.hasNext()) {
                next3 = it9.next();
                if (it9.hasNext()) {
                    long jP5 = ((ads_mobile_sdk.b6) ((dev.epro.r0.D18298016311120566919) next3).c).p();
                    do {
                        java.lang.Object next6 = it9.next();
                        long jP6 = ((ads_mobile_sdk.b6) ((dev.epro.r0.D18298016311120566919) next6).c).p();
                        if (jP5 > jP6) {
                            next3 = next6;
                            jP5 = jP6;
                        }
                    } while (it9.hasNext());
                }
            } else {
                next3 = null;
            }
            dev.epro.r0.D18298016311120566919 d18298016311120566919 = (dev.epro.r0.D18298016311120566919) next3;
            if (d18298016311120566919 == null) {
                ue2Var = null;
            } else {
                java.lang.String strQ2 = ((ads_mobile_sdk.b6) d18298016311120566919.c).q();
                strQ2.getClass();
                java.lang.Object obj3 = d18298016311120566919.a;
                obj3.getClass();
                dev.epro.r0.Y2677586711477821327 y2677586711477821327 = ads_mobile_sdk.qw2.b;
                ads_mobile_sdk.qw2 qw2Var4 = (ads_mobile_sdk.qw2) java.lang.Enum.valueOf(ads_mobile_sdk.qw2.class, (java.lang.String) obj3);
                java.lang.Object obj4 = d18298016311120566919.b;
                obj4.getClass();
                ue2Var = new ads_mobile_sdk.ue2(strQ2, qw2Var4, (java.lang.String) obj4);
            }
            if (ue2Var == null) {
                break;
            }
            java.lang.String str4 = ue2Var.a;
            boolean z4 = z;
            th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, z4);
            try {
                g1VarA = ads_mobile_sdk.pe2.a(g1VarA, ue2Var.b.name(), ue2Var.c, str4);
                arrayList.add(str4);
                th3VarA.close();
                z = z4;
                iIntValue = i7;
                i = 0;
                i4 = 10;
            } catch (java.lang.Throwable th2) {
                try {
                    th3VarA.b(th2);
                    if (th2 instanceof dev.epro.r0.N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof dev.epro.r0.P2480554073835519965) && !(th2 instanceof java.util.concurrent.CancellationException)) {
                        th3VarA.a(th2);
                    }
                    if (th2 instanceof dev.epro.r0.P2480554073835519965) {
                        throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th2);
                    }
                    if (th2 instanceof java.util.concurrent.CancellationException) {
                        throw new ads_mobile_sdk.du0(th2);
                    }
                    if (th2 instanceof ads_mobile_sdk.dv0) {
                        throw th2;
                    }
                    throw new ads_mobile_sdk.iu0(th2);
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } finally {
                    }
                }
            }
        }
        java.lang.String strName3 = qw2Var.name();
        ads_mobile_sdk.vr0 vr0VarP2 = (ads_mobile_sdk.vr0) g1VarA.u().get(strName3);
        if (vr0VarP2 == null) {
            vr0VarP2 = ads_mobile_sdk.vr0.p();
        }
        dev.epro.r0.W17538889179347911592 w17538889179347911592S = ads_mobile_sdk.b6.s();
        w17538889179347911592S.getClass();
        w17538889179347911592S.b();
        ((ads_mobile_sdk.b6) w17538889179347911592S.b).c(this.f);
        w17538889179347911592S.b();
        ads_mobile_sdk.b6 b6Var2 = (ads_mobile_sdk.b6) w17538889179347911592S.b;
        b6Var2.bitField0_ |= 2;
        b6Var2.createTimeMs_ = j;
        java.lang.String str5 = this.g;
        str5.getClass();
        w17538889179347911592S.b();
        ((ads_mobile_sdk.b6) w17538889179347911592S.b).b(str5);
        w17538889179347911592S.c(2);
        ads_mobile_sdk.b6 b6Var3 = (ads_mobile_sdk.b6) w17538889179347911592S.a();
        dev.epro.r0.S2322588539201815831 s2322588539201815831N3 = g1VarA.n();
        s2322588539201815831N3.e().getClass();
        vr0VarP2.getClass();
        dev.epro.r0.C7584963549263810245 c75849635492638102452 = (dev.epro.r0.C7584963549263810245) vr0VarP2.n();
        java.util.Map mapE = c75849635492638102452.e();
        mapE.getClass();
        java.lang.String str6 = this.e;
        ads_mobile_sdk.g6 g6VarO = (ads_mobile_sdk.g6) mapE.get(str6);
        if (g6VarO == null) {
            g6VarO = ads_mobile_sdk.g6.o();
        }
        c75849635492638102452.e().getClass();
        g6VarO.getClass();
        dev.epro.r0.Y12531765857967015337 y12531765857967015337N2 = g6VarO.n();
        y12531765857967015337N2.f().getClass();
        y12531765857967015337N2.b();
        ((ads_mobile_sdk.g6) y12531765857967015337N2.b).a(b6Var3);
        y12531765857967015337N2.c(j);
        ads_mobile_sdk.g6 g6Var2 = (ads_mobile_sdk.g6) y12531765857967015337N2.a();
        str6.getClass();
        c75849635492638102452.d(str6, g6Var2);
        ads_mobile_sdk.vr0 vr0Var7 = (ads_mobile_sdk.vr0) c75849635492638102452.a();
        strName3.getClass();
        s2322588539201815831N3.d(strName3, vr0Var7);
        return (ads_mobile_sdk.g1) s2322588539201815831N3.a();
    }
}
