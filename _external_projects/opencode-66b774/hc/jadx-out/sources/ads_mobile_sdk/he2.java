package ads_mobile_sdk;

import dev.epro.r0.B7506245556754967052;
import dev.epro.r0.C7584963549263810245;
import dev.epro.r0.D18298016311120566919;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.P17571903987102865660;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.P9893650590651797888;
import dev.epro.r0.S2322588539201815831;
import dev.epro.r0.W17538889179347911592;
import dev.epro.r0.Y12531765857967015337;
import dev.epro.r0.Y2677586711477821327;
import dev.epro.r0.Z115818233709597990;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class he2 extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ pe2 b;
    public final /* synthetic */ qw2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he2(ArrayList arrayList, pe2 pe2Var, qw2 qw2Var, long j, String str, String str2, String str3) {
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
    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) throws IOException {
        qw2 qw2Var;
        boolean z;
        int i;
        Object next;
        g6 g6Var;
        th3 th3VarA;
        qw2 qw2Var2;
        int i2;
        boolean z2;
        vr0 vr0Var;
        Object objRemove;
        Object next2;
        Object next3;
        ue2 ue2Var;
        g1 g1Var = (g1) obj;
        g1Var.getClass();
        ArrayList arrayList = this.a;
        arrayList.clear();
        qw2 qw2Var3 = this.c;
        String strName = qw2Var3.name();
        vr0 vr0VarP = (vr0) g1Var.u().get(strName);
        if (vr0VarP == null) {
            vr0VarP = vr0.p();
        }
        Map mapO = vr0VarP.o();
        mapO.getClass();
        pe2 pe2Var = this.b;
        long j = this.d;
        LinkedHashMap linkedHashMapA = pe2Var.a(mapO, j, arrayList);
        S2322588539201815831 s2322588539201815831 = (S2322588539201815831) g1Var.n();
        if (linkedHashMapA.isEmpty()) {
            s2322588539201815831.e().getClass();
            strName.getClass();
            s2322588539201815831.c(strName);
        } else {
            s2322588539201815831.e().getClass();
            C7584963549263810245 c7584963549263810245R = vr0.r();
            c7584963549263810245R.getClass();
            c7584963549263810245R.e().getClass();
            c7584963549263810245R.b();
            ((vr0) c7584963549263810245R.b).q().putAll(linkedHashMapA);
            vr0 vr0Var2 = (vr0) c7584963549263810245R.a();
            strName.getClass();
            s2322588539201815831.d(strName, vr0Var2);
        }
        g1 g1VarA = (g1) s2322588539201815831.a();
        boolean z3 = true;
        int iA = pe2Var.a(qw2Var3) - 1;
        String strName2 = qw2Var3.name();
        vr0 vr0Var3 = (vr0) g1VarA.u().get(strName2);
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        wv0 wv0Var = wv0.CUI_NAME_PERSISTENT_CACHE_EVICT;
        if (vr0Var3 == null) {
            qw2Var = qw2Var3;
            z = true;
            i = 0;
        } else {
            Map mapO2 = vr0Var3.o();
            mapO2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapO2);
            while (true) {
                Iterator it = linkedHashMap.values().iterator();
                int iQ = 0;
                while (it.hasNext()) {
                    iQ = ((g6) it.next()).q() + iQ;
                }
                if (iQ <= iA || linkedHashMap.isEmpty()) {
                    break;
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long jP = ((g6) ((Map.Entry) next).getValue()).p();
                        do {
                            Object next4 = it2.next();
                            long jP2 = ((g6) ((Map.Entry) next4).getValue()).p();
                            if (jP > jP2) {
                                next = next4;
                                jP = jP2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry = (Map.Entry) next;
                String str = entry != null ? (String) entry.getKey() : null;
                if (str == null || (g6Var = (g6) linkedHashMap.get(str)) == null) {
                    break;
                }
                g1 g1Var2 = g1VarA;
                th3VarA = ji3.a(wv0Var, o2161699089510411363, z3);
                try {
                    if (g6Var.q() > 0) {
                        O6641393078261985068 o6641393078261985068R = g6Var.r();
                        o6641393078261985068R.getClass();
                        Iterator<E> it3 = o6641393078261985068R.iterator();
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (it3.hasNext()) {
                                long jP3 = ((b6) next2).p();
                                do {
                                    Object next5 = it3.next();
                                    long jP4 = ((b6) next5).p();
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
                        b6 b6Var = (b6) next2;
                        O6641393078261985068 o6641393078261985068R2 = g6Var.r();
                        o6641393078261985068R2.getClass();
                        qw2Var2 = qw2Var3;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : o6641393078261985068R2) {
                            int i3 = iA;
                            vr0 vr0Var4 = vr0Var3;
                            if (((b6) obj2) != b6Var) {
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
                            Y12531765857967015337 y12531765857967015337 = (Y12531765857967015337) g6Var.n();
                            y12531765857967015337.f().getClass();
                            y12531765857967015337.e();
                            y12531765857967015337.f().getClass();
                            y12531765857967015337.d(arrayList2);
                            linkedHashMap.put(str, (g6) y12531765857967015337.a());
                        }
                        if (b6Var != null) {
                            String strQ = b6Var.q();
                            strQ.getClass();
                            objRemove = Boolean.valueOf(arrayList.add(strQ));
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
                    if (objRemove instanceof pu0) {
                        zi3.a((pu0) objRemove, false);
                    }
                    th3VarA.close();
                    g1VarA = g1Var2;
                    z3 = z2;
                    qw2Var3 = qw2Var2;
                    iA = i2;
                    vr0Var3 = vr0Var;
                } catch (Throwable th) {
                    try {
                        th3VarA.b(th);
                        if (th instanceof N340633841638932414) {
                            throw th;
                        }
                        if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                            th3VarA.a(th);
                        }
                        if (th instanceof P2480554073835519965) {
                            throw new lw0(th);
                        }
                        if (th instanceof CancellationException) {
                            throw new du0(th);
                        }
                        if (th instanceof dv0) {
                            throw th;
                        }
                        throw new iu0(th);
                    } finally {
                    }
                }
            }
            qw2Var = qw2Var3;
            z = z3;
            vr0 vr0Var5 = vr0Var3;
            i = 0;
            S2322588539201815831 s23225885392018158312 = (S2322588539201815831) g1VarA.n();
            if (linkedHashMap.isEmpty()) {
                s23225885392018158312.e().getClass();
                strName2.getClass();
                s23225885392018158312.c(strName2);
            } else {
                s23225885392018158312.e().getClass();
                C7584963549263810245 c7584963549263810245 = (C7584963549263810245) vr0Var5.n();
                c7584963549263810245.e().getClass();
                c7584963549263810245.b();
                ((vr0) c7584963549263810245.b).q().clear();
                c7584963549263810245.e().getClass();
                c7584963549263810245.b();
                ((vr0) c7584963549263810245.b).q().putAll(linkedHashMap);
                vr0 vr0Var6 = (vr0) c7584963549263810245.a();
                strName2.getClass();
                s23225885392018158312.d(strName2, vr0Var6);
            }
            g1VarA = (g1) s23225885392018158312.a();
        }
        B7506245556754967052 b7506245556754967052 = pe2Var.c;
        b7506245556754967052.getClass();
        int i4 = 10;
        int iIntValue = ((Number) b7506245556754967052.a("gads:pc:max_total_cached_ads", (Object) 10, (F4096073349764486348) ao.a$18)).intValue() - 1;
        while (true) {
            Iterator it4 = g1VarA.u().values().iterator();
            int i5 = i;
            while (it4.hasNext()) {
                Iterator it5 = ((vr0) it4.next()).o().values().iterator();
                int iQ2 = i;
                while (it5.hasNext()) {
                    iQ2 += ((g6) it5.next()).q();
                }
                i5 += iQ2;
            }
            if (i5 <= iIntValue) {
                break;
            }
            Set setEntrySet = g1VarA.u().entrySet();
            ArrayList arrayList3 = new ArrayList();
            Iterator it6 = setEntrySet.iterator();
            while (it6.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it6.next();
                String str2 = (String) entry2.getKey();
                Set<Map.Entry> setEntrySet2 = ((vr0) entry2.getValue()).o().entrySet();
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry3 : setEntrySet2) {
                    String str3 = (String) entry3.getKey();
                    O6641393078261985068 o6641393078261985068R3 = ((g6) entry3.getValue()).r();
                    o6641393078261985068R3.getClass();
                    int i6 = iIntValue;
                    Iterator it7 = it6;
                    ArrayList arrayList5 = new ArrayList(Z115818233709597990.k0(o6641393078261985068R3, i4));
                    Iterator<E> it8 = o6641393078261985068R3.iterator();
                    while (it8.hasNext()) {
                        arrayList5.add(new D18298016311120566919(str2, str3, (b6) it8.next()));
                    }
                    P17571903987102865660.n0(arrayList4, arrayList5);
                    iIntValue = i6;
                    it6 = it7;
                    i4 = 10;
                }
                P17571903987102865660.n0(arrayList3, arrayList4);
                i4 = 10;
            }
            int i7 = iIntValue;
            Iterator it9 = arrayList3.iterator();
            if (it9.hasNext()) {
                next3 = it9.next();
                if (it9.hasNext()) {
                    long jP5 = ((b6) ((D18298016311120566919) next3).c).p();
                    do {
                        Object next6 = it9.next();
                        long jP6 = ((b6) ((D18298016311120566919) next6).c).p();
                        if (jP5 > jP6) {
                            next3 = next6;
                            jP5 = jP6;
                        }
                    } while (it9.hasNext());
                }
            } else {
                next3 = null;
            }
            D18298016311120566919 d18298016311120566919 = (D18298016311120566919) next3;
            if (d18298016311120566919 == null) {
                ue2Var = null;
            } else {
                String strQ2 = ((b6) d18298016311120566919.c).q();
                strQ2.getClass();
                Object obj3 = d18298016311120566919.a;
                obj3.getClass();
                Y2677586711477821327 y2677586711477821327 = qw2.b;
                qw2 qw2Var4 = (qw2) Enum.valueOf(qw2.class, (String) obj3);
                Object obj4 = d18298016311120566919.b;
                obj4.getClass();
                ue2Var = new ue2(strQ2, qw2Var4, (String) obj4);
            }
            if (ue2Var == null) {
                break;
            }
            String str4 = ue2Var.a;
            boolean z4 = z;
            th3VarA = ji3.a(wv0Var, o2161699089510411363, z4);
            try {
                g1VarA = pe2.a(g1VarA, ue2Var.b.name(), ue2Var.c, str4);
                arrayList.add(str4);
                th3VarA.close();
                z = z4;
                iIntValue = i7;
                i = 0;
                i4 = 10;
            } catch (Throwable th2) {
                try {
                    th3VarA.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        th3VarA.a(th2);
                    }
                    if (th2 instanceof P2480554073835519965) {
                        throw new lw0(th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new du0(th2);
                    }
                    if (th2 instanceof dv0) {
                        throw th2;
                    }
                    throw new iu0(th2);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } finally {
                    }
                }
            }
        }
        String strName3 = qw2Var.name();
        vr0 vr0VarP2 = (vr0) g1VarA.u().get(strName3);
        if (vr0VarP2 == null) {
            vr0VarP2 = vr0.p();
        }
        W17538889179347911592 w17538889179347911592S = b6.s();
        w17538889179347911592S.getClass();
        w17538889179347911592S.b();
        ((b6) w17538889179347911592S.b).c(this.f);
        w17538889179347911592S.b();
        b6 b6Var2 = (b6) w17538889179347911592S.b;
        b6Var2.bitField0_ |= 2;
        b6Var2.createTimeMs_ = j;
        String str5 = this.g;
        str5.getClass();
        w17538889179347911592S.b();
        ((b6) w17538889179347911592S.b).b(str5);
        w17538889179347911592S.c(2);
        b6 b6Var3 = (b6) w17538889179347911592S.a();
        S2322588539201815831 s23225885392018158313 = (S2322588539201815831) g1VarA.n();
        s23225885392018158313.e().getClass();
        vr0VarP2.getClass();
        C7584963549263810245 c75849635492638102452 = (C7584963549263810245) vr0VarP2.n();
        Map mapE = c75849635492638102452.e();
        mapE.getClass();
        String str6 = this.e;
        g6 g6VarO = (g6) mapE.get(str6);
        if (g6VarO == null) {
            g6VarO = g6.o();
        }
        c75849635492638102452.e().getClass();
        g6VarO.getClass();
        Y12531765857967015337 y125317658579670153372 = (Y12531765857967015337) g6VarO.n();
        y125317658579670153372.f().getClass();
        y125317658579670153372.b();
        ((g6) y125317658579670153372.b).a(b6Var3);
        y125317658579670153372.c(j);
        g6 g6Var2 = (g6) y125317658579670153372.a();
        str6.getClass();
        c75849635492638102452.d(str6, g6Var2);
        vr0 vr0Var7 = (vr0) c75849635492638102452.a();
        strName3.getClass();
        s23225885392018158313.d(strName3, vr0Var7);
        return (g1) s23225885392018158313.a();
    }
}
