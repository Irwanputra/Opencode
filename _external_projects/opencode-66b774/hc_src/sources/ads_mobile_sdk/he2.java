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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
    public final Object invoke(Object obj) {
        qw2 qw2Var;
        boolean z;
        int i;
        Object next;
        g6 g6Var;
        th3 a;
        qw2 qw2Var2;
        int i2;
        boolean z2;
        vr0 vr0Var;
        Object remove;
        Object next2;
        int i3;
        Object next3;
        ue2 ue2Var;
        g1 g1Var = (g1) obj;
        g1Var.getClass();
        ArrayList arrayList = this.a;
        arrayList.clear();
        qw2 qw2Var3 = this.c;
        String name = qw2Var3.name();
        vr0 vr0Var2 = (vr0) g1Var.u().get(name);
        if (vr0Var2 == null) {
            vr0Var2 = vr0.p();
        }
        Map o2 = vr0Var2.o();
        o2.getClass();
        pe2 pe2Var = this.b;
        long j = this.d;
        LinkedHashMap a2 = pe2Var.a(o2, j, arrayList);
        S2322588539201815831 s2322588539201815831 = (S2322588539201815831) g1Var.n();
        if (a2.isEmpty()) {
            s2322588539201815831.e().getClass();
            name.getClass();
            s2322588539201815831.c(name);
        } else {
            s2322588539201815831.e().getClass();
            C7584963549263810245 r = vr0.r();
            r.getClass();
            r.e().getClass();
            r.b();
            ((vr0) r.b).q().putAll(a2);
            vr0 vr0Var3 = (vr0) r.a();
            name.getClass();
            s2322588539201815831.d(name, vr0Var3);
        }
        g1 g1Var2 = (g1) s2322588539201815831.a();
        boolean z3 = true;
        int a3 = pe2Var.a(qw2Var3) - 1;
        String name2 = qw2Var3.name();
        vr0 vr0Var4 = (vr0) g1Var2.u().get(name2);
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        wv0 wv0Var = wv0.CUI_NAME_PERSISTENT_CACHE_EVICT;
        if (vr0Var4 == null) {
            qw2Var = qw2Var3;
            z = true;
            i = 0;
        } else {
            Map o3 = vr0Var4.o();
            o3.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(o3);
            while (true) {
                Iterator it = linkedHashMap.values().iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    i4 = ((g6) it.next()).q() + i4;
                }
                if (i4 <= a3 || linkedHashMap.isEmpty()) {
                    break;
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long p = ((g6) ((Map.Entry) next).getValue()).p();
                        do {
                            Object next4 = it2.next();
                            long p2 = ((g6) ((Map.Entry) next4).getValue()).p();
                            if (p > p2) {
                                next = next4;
                                p = p2;
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
                g1 g1Var3 = g1Var2;
                a = ji3.a(wv0Var, o2161699089510411363, z3);
                try {
                    if (g6Var.q() > 0) {
                        O6641393078261985068 r2 = g6Var.r();
                        r2.getClass();
                        Iterator<E> it3 = r2.iterator();
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (it3.hasNext()) {
                                long p3 = ((b6) next2).p();
                                do {
                                    Object next5 = it3.next();
                                    long p4 = ((b6) next5).p();
                                    if (p3 > p4) {
                                        next2 = next5;
                                        p3 = p4;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        z2 = z3;
                        b6 b6Var = (b6) next2;
                        O6641393078261985068 r3 = g6Var.r();
                        r3.getClass();
                        qw2Var2 = qw2Var3;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : r3) {
                            int i5 = a3;
                            vr0 vr0Var5 = vr0Var4;
                            if (((b6) obj2) != b6Var) {
                                arrayList2.add(obj2);
                            }
                            a3 = i5;
                            vr0Var4 = vr0Var5;
                        }
                        i2 = a3;
                        vr0Var = vr0Var4;
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
                            String q = b6Var.q();
                            q.getClass();
                            remove = Boolean.valueOf(arrayList.add(q));
                        } else {
                            remove = null;
                        }
                    } else {
                        qw2Var2 = qw2Var3;
                        i2 = a3;
                        z2 = z3;
                        vr0Var = vr0Var4;
                        remove = linkedHashMap.remove(str);
                    }
                    if (remove instanceof pu0) {
                        zi3.a((pu0) remove, false);
                    }
                    a.close();
                    g1Var2 = g1Var3;
                    z3 = z2;
                    qw2Var3 = qw2Var2;
                    a3 = i2;
                    vr0Var4 = vr0Var;
                } catch (Throwable th) {
                    try {
                        a.b(th);
                        if (th instanceof N340633841638932414) {
                            throw th;
                        }
                        if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                            a.a(th);
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
            vr0 vr0Var6 = vr0Var4;
            i = 0;
            S2322588539201815831 s23225885392018158312 = (S2322588539201815831) g1Var2.n();
            if (linkedHashMap.isEmpty()) {
                s23225885392018158312.e().getClass();
                name2.getClass();
                s23225885392018158312.c(name2);
            } else {
                s23225885392018158312.e().getClass();
                C7584963549263810245 c7584963549263810245 = (C7584963549263810245) vr0Var6.n();
                c7584963549263810245.e().getClass();
                c7584963549263810245.b();
                ((vr0) c7584963549263810245.b).q().clear();
                c7584963549263810245.e().getClass();
                c7584963549263810245.b();
                ((vr0) c7584963549263810245.b).q().putAll(linkedHashMap);
                vr0 vr0Var7 = (vr0) c7584963549263810245.a();
                name2.getClass();
                s23225885392018158312.d(name2, vr0Var7);
            }
            g1Var2 = (g1) s23225885392018158312.a();
        }
        B7506245556754967052 b7506245556754967052 = pe2Var.c;
        b7506245556754967052.getClass();
        int i6 = 10;
        int intValue = ((Number) b7506245556754967052.a("gads:pc:max_total_cached_ads", (Object) 10, (F4096073349764486348) ao.a$18)).intValue() - 1;
        while (true) {
            Iterator it4 = g1Var2.u().values().iterator();
            int i7 = i;
            while (it4.hasNext()) {
                Iterator it5 = ((vr0) it4.next()).o().values().iterator();
                int i8 = i;
                while (it5.hasNext()) {
                    i8 += ((g6) it5.next()).q();
                }
                i7 += i8;
            }
            if (i7 <= intValue) {
                break;
            }
            Set entrySet = g1Var2.u().entrySet();
            ArrayList arrayList3 = new ArrayList();
            Iterator it6 = entrySet.iterator();
            while (it6.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it6.next();
                String str2 = (String) entry2.getKey();
                Set<Map.Entry> entrySet2 = ((vr0) entry2.getValue()).o().entrySet();
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry3 : entrySet2) {
                    String str3 = (String) entry3.getKey();
                    O6641393078261985068 r4 = ((g6) entry3.getValue()).r();
                    r4.getClass();
                    int i9 = intValue;
                    Iterator it7 = it6;
                    ArrayList arrayList5 = new ArrayList(Z115818233709597990.k0(r4, i6));
                    Iterator<E> it8 = r4.iterator();
                    while (it8.hasNext()) {
                        arrayList5.add(new D18298016311120566919(str2, str3, (b6) it8.next()));
                    }
                    P17571903987102865660.n0(arrayList4, arrayList5);
                    intValue = i9;
                    it6 = it7;
                    i6 = 10;
                }
                P17571903987102865660.n0(arrayList3, arrayList4);
                i6 = 10;
            }
            int i10 = intValue;
            Iterator it9 = arrayList3.iterator();
            if (it9.hasNext()) {
                next3 = it9.next();
                if (it9.hasNext()) {
                    long p5 = ((b6) ((D18298016311120566919) next3).c).p();
                    do {
                        Object next6 = it9.next();
                        long p6 = ((b6) ((D18298016311120566919) next6).c).p();
                        if (p5 > p6) {
                            next3 = next6;
                            p5 = p6;
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
                String q2 = ((b6) d18298016311120566919.c).q();
                q2.getClass();
                Object obj3 = d18298016311120566919.a;
                obj3.getClass();
                Y2677586711477821327 y2677586711477821327 = qw2.b;
                qw2 qw2Var4 = (qw2) Enum.valueOf(qw2.class, (String) obj3);
                Object obj4 = d18298016311120566919.b;
                obj4.getClass();
                ue2Var = new ue2(q2, qw2Var4, (String) obj4);
            }
            if (ue2Var == null) {
                break;
            }
            String str4 = ue2Var.a;
            boolean z4 = z;
            a = ji3.a(wv0Var, o2161699089510411363, z4);
            try {
                g1Var2 = pe2.a(g1Var2, ue2Var.b.name(), ue2Var.c, str4);
                arrayList.add(str4);
                a.close();
                z = z4;
                intValue = i10;
                i = 0;
                i6 = 10;
            } catch (Throwable th2) {
                try {
                    a.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        a.a(th2);
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
        String name3 = qw2Var.name();
        vr0 vr0Var8 = (vr0) g1Var2.u().get(name3);
        if (vr0Var8 == null) {
            vr0Var8 = vr0.p();
        }
        W17538889179347911592 s = b6.s();
        s.getClass();
        s.b();
        ((b6) s.b).c(this.f);
        s.b();
        b6 b6Var2 = (b6) s.b;
        i3 = b6Var2.bitField0_;
        b6Var2.bitField0_ = i3 | 2;
        b6Var2.createTimeMs_ = j;
        String str5 = this.g;
        str5.getClass();
        s.b();
        ((b6) s.b).b(str5);
        s.c(2);
        b6 b6Var3 = (b6) s.a();
        S2322588539201815831 s23225885392018158313 = (S2322588539201815831) g1Var2.n();
        s23225885392018158313.e().getClass();
        vr0Var8.getClass();
        C7584963549263810245 c75849635492638102452 = (C7584963549263810245) vr0Var8.n();
        Map e = c75849635492638102452.e();
        e.getClass();
        String str6 = this.e;
        g6 g6Var2 = (g6) e.get(str6);
        if (g6Var2 == null) {
            g6Var2 = g6.o();
        }
        c75849635492638102452.e().getClass();
        g6Var2.getClass();
        Y12531765857967015337 y125317658579670153372 = (Y12531765857967015337) g6Var2.n();
        y125317658579670153372.f().getClass();
        y125317658579670153372.b();
        ((g6) y125317658579670153372.b).a(b6Var3);
        y125317658579670153372.c(j);
        g6 g6Var3 = (g6) y125317658579670153372.a();
        str6.getClass();
        c75849635492638102452.d(str6, g6Var3);
        vr0 vr0Var9 = (vr0) c75849635492638102452.a();
        name3.getClass();
        s23225885392018158313.d(name3, vr0Var9);
        return (g1) s23225885392018158313.a();
    }
}
