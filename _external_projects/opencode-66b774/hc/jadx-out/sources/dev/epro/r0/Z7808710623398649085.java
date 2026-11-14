package dev.epro.r0;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Z7808710623398649085 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f607o = new Object();
    public W14208766909380660198 d;
    public E17149812035295265804 i;
    public boolean j;
    public final HashMap m;
    public final J7183379813836568005 n;
    public final EnumMap a = new EnumMap(Q2936994053173258289.class);
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public boolean k = true;
    public boolean l = false;
    public final HashMap e = new HashMap();
    public final HashSet f = new HashSet();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public Z7808710623398649085(J7183379813836568005 j7183379813836568005) {
        HashMap map = new HashMap();
        this.m = map;
        new HashMap();
        this.j = false;
        map.put(SortedMap.class, new C9513563470267509397(SortedMap.class, Q3622318280241842965.g, TreeMap.class));
        map.put(SortedSet.class, new C9513563470267509397(SortedSet.class, Q3622318280241842965.e, TreeSet.class));
        this.n = j7183379813836568005;
    }

    public final Object a(J9761478802862050991 j9761478802862050991) {
        boolean zContains;
        Q9935855302591369244 q9935855302591369244;
        HashMap map = this.e;
        if (map.containsKey(j9761478802862050991)) {
            return map.get(j9761478802862050991);
        }
        HashSet hashSet = this.f;
        if (hashSet.contains(j9761478802862050991)) {
            throw new P13193549499509261669(null, null, "found unconstructable recursive node", j9761478802862050991.b);
        }
        hashSet.add(j9761478802862050991);
        if (j9761478802862050991.a.b || !j9761478802862050991.g || Object.class.equals(j9761478802862050991.d) || j9761478802862050991.a.equals(Q3622318280241842965.m)) {
            Q3622318280241842965 q3622318280241842965 = j9761478802862050991.a;
            Class cls = j9761478802862050991.d;
            q3622318280241842965.getClass();
            Set set = (Set) Q3622318280241842965.s.get(q3622318280241842965);
            zContains = set != null ? set.contains(cls) : false;
        } else {
            zContains = true;
        }
        if (zContains) {
            q9935855302591369244 = (Q9935855302591369244) this.a.get(j9761478802862050991.a());
        } else {
            Q3622318280241842965 q36223182802418429652 = j9761478802862050991.a;
            HashMap map2 = this.b;
            Q9935855302591369244 q99358553025913692442 = (Q9935855302591369244) map2.get(q36223182802418429652);
            if (q99358553025913692442 == null) {
                HashMap map3 = this.c;
                Iterator it = map3.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        q9935855302591369244 = (Q9935855302591369244) map2.get(null);
                        break;
                    }
                    String str = (String) it.next();
                    if (q36223182802418429652.a.startsWith(str)) {
                        q9935855302591369244 = (Q9935855302591369244) map3.get(str);
                        break;
                    }
                }
            } else {
                q9935855302591369244 = q99358553025913692442;
            }
        }
        Object objA = map.containsKey(j9761478802862050991) ? map.get(j9761478802862050991) : q9935855302591369244.a(j9761478802862050991);
        Class cls2 = j9761478802862050991.d;
        HashMap map4 = this.m;
        if (map4.containsKey(cls2)) {
            ((C9513563470267509397) map4.get(cls2)).getClass();
        }
        map.put(j9761478802862050991, objA);
        hashSet.remove(j9761478802862050991);
        if (j9761478802862050991.e) {
            q9935855302591369244.b(j9761478802862050991, objA);
        }
        return objA;
    }

    public final void b() {
        ArrayList arrayList = this.g;
        int i = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Q9019895912264550339 q9019895912264550339 = (Q9019895912264550339) obj;
                Q9019895912264550339 q90198959122645503392 = (Q9019895912264550339) q9019895912264550339.b;
                ((Map) q9019895912264550339.a).put(q90198959122645503392.a, q90198959122645503392.b);
            }
            arrayList.clear();
        }
        ArrayList arrayList2 = this.h;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            Q9019895912264550339 q90198959122645503393 = (Q9019895912264550339) obj2;
            ((Set) q90198959122645503393.a).add(q90198959122645503393.b);
        }
        arrayList2.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Class r5, dev.epro.r0.H677490115963445910 r6) {
        /*
            r4 = this;
            java.util.HashMap r4 = r4.m
            java.lang.Class r6 = r6.d     // Catch: java.lang.Exception -> L58
            boolean r0 = r4.containsKey(r6)     // Catch: java.lang.Exception -> L58
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L39
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Exception -> L58
            dev.epro.r0.C9513563470267509397 r4 = (dev.epro.r0.C9513563470267509397) r4     // Catch: java.lang.Exception -> L58
            java.lang.Class r0 = r4.b     // Catch: java.lang.Exception -> L58
            if (r0 == 0) goto L35
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L22
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L22
            java.lang.Object r4 = r0.newInstance(r2)     // Catch: java.lang.Exception -> L22
            goto L36
        L22:
            r0 = move-exception
            dev.epro.r0.F6942723054099263096 r3 = dev.epro.r0.C9513563470267509397.d     // Catch: java.lang.Exception -> L58
            r0.getLocalizedMessage()     // Catch: java.lang.Exception -> L58
            java.lang.Object r0 = r3.b     // Catch: java.lang.Exception -> L58
            java.util.logging.Logger r0 = (java.util.logging.Logger) r0     // Catch: java.lang.Exception -> L58
            dev.epro.r0.Z9049209052836541437 r3 = dev.epro.r0.Z9049209052836541437.WARNING     // Catch: java.lang.Exception -> L58
            java.util.logging.Level r3 = r3.a     // Catch: java.lang.Exception -> L58
            r0.getClass()     // Catch: java.lang.Exception -> L58
            r4.b = r2     // Catch: java.lang.Exception -> L58
        L35:
            r4 = r2
        L36:
            if (r4 == 0) goto L39
            goto L57
        L39:
            boolean r4 = r5.isAssignableFrom(r6)     // Catch: java.lang.Exception -> L58
            if (r4 == 0) goto L55
            int r4 = r6.getModifiers()     // Catch: java.lang.Exception -> L58
            boolean r4 = java.lang.reflect.Modifier.isAbstract(r4)     // Catch: java.lang.Exception -> L58
            if (r4 != 0) goto L55
            java.lang.reflect.Constructor r4 = r6.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L58
            r4.setAccessible(r1)     // Catch: java.lang.Exception -> L58
            java.lang.Object r4 = r4.newInstance(r2)     // Catch: java.lang.Exception -> L58
            goto L57
        L55:
            java.lang.Object r4 = dev.epro.r0.Z7808710623398649085.f607o
        L57:
            return r4
        L58:
            r4 = move-exception
            dev.epro.r0.M8821877208104636290 r5 = new dev.epro.r0.M8821877208104636290
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z7808710623398649085.c(java.lang.Class, dev.epro.r0.H677490115963445910):java.lang.Object");
    }
}
