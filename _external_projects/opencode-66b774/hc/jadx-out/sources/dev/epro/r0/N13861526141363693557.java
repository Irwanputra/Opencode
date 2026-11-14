package dev.epro.r0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N13861526141363693557 implements Q9935855302591369244 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ U1644378183406225904 b;

    public /* synthetic */ N13861526141363693557(U1644378183406225904 u1644378183406225904, byte b) {
        this.a = b;
        this.b = u1644378183406225904;
    }

    @Override // dev.epro.r0.Q9935855302591369244
    public final Object a(J9761478802862050991 j9761478802862050991) {
        List arrayList;
        byte b = this.a;
        Object obj = Z7808710623398649085.f607o;
        U1644378183406225904 u1644378183406225904 = this.b;
        switch (b) {
            case 0:
                A12478465957355731346 a12478465957355731346 = (A12478465957355731346) j9761478802862050991;
                if (j9761478802862050991.e) {
                    return new LinkedHashMap(a12478465957355731346.h.size());
                }
                Object objC = u1644378183406225904.c(Map.class, a12478465957355731346);
                Map linkedHashMap = objC != obj ? (Map) objC : new LinkedHashMap(a12478465957355731346.h.size());
                u1644378183406225904.d(a12478465957355731346, linkedHashMap);
                return linkedHashMap;
            case 1:
                X4173267666364425010 x4173267666364425010 = (X4173267666364425010) j9761478802862050991;
                ArrayList arrayList2 = x4173267666364425010.h;
                if (j9761478802862050991.e) {
                    Object objC2 = u1644378183406225904.c(List.class, x4173267666364425010);
                    if (objC2 != obj) {
                        return (List) objC2;
                    }
                    arrayList = new ArrayList(arrayList2.size());
                } else {
                    Object objC3 = u1644378183406225904.c(List.class, x4173267666364425010);
                    arrayList = objC3 != obj ? (List) objC3 : new ArrayList(arrayList2.size());
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        arrayList.add(u1644378183406225904.a((J9761478802862050991) obj2));
                    }
                }
                return arrayList;
            default:
                boolean z = j9761478802862050991.e;
                HashMap map = u1644378183406225904.e;
                if (z) {
                    return map.containsKey(j9761478802862050991) ? map.get(j9761478802862050991) : new LinkedHashSet(((A12478465957355731346) j9761478802862050991).h.size());
                }
                A12478465957355731346 a124784659573557313462 = (A12478465957355731346) j9761478802862050991;
                Object objC4 = u1644378183406225904.c(Set.class, a124784659573557313462);
                Set linkedHashSet = objC4 != obj ? (Set) objC4 : new LinkedHashSet(a124784659573557313462.h.size());
                u1644378183406225904.e(a124784659573557313462, linkedHashSet);
                return linkedHashSet;
        }
    }

    @Override // dev.epro.r0.Q9935855302591369244
    public final void b(J9761478802862050991 j9761478802862050991, Object obj) {
        byte b = this.a;
        U1644378183406225904 u1644378183406225904 = this.b;
        switch (b) {
            case 0:
                if (!j9761478802862050991.e) {
                    S10973172697741180971.n("Unexpected recursive mapping structure. Node: ", j9761478802862050991);
                } else {
                    u1644378183406225904.d((A12478465957355731346) j9761478802862050991, (Map) obj);
                }
                break;
            case 1:
                if (!j9761478802862050991.e) {
                    S10973172697741180971.n("Unexpected recursive sequence structure. Node: ", j9761478802862050991);
                } else {
                    List list = (List) obj;
                    ArrayList arrayList = ((X4173267666364425010) j9761478802862050991).h;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        list.add(u1644378183406225904.a((J9761478802862050991) obj2));
                    }
                }
                break;
            default:
                if (!j9761478802862050991.e) {
                    S10973172697741180971.n("Unexpected recursive set structure. Node: ", j9761478802862050991);
                } else {
                    u1644378183406225904.e((A12478465957355731346) j9761478802862050991, (Set) obj);
                }
                break;
        }
    }
}
