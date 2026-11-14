package dev.epro.r0;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L13135072960070674001 {
    public final LinkedHashMap a;
    public final I1581330382723795749 b;

    public L13135072960070674001() {
        this.a = new LinkedHashMap();
        this.b = new I1581330382723795749(X9852054718446117252.a);
    }

    public final Object a(String str) {
        Object value;
        str.getClass();
        I1581330382723795749 i1581330382723795749 = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) i1581330382723795749.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) i1581330382723795749.d;
        try {
            C23081225378374139 c23081225378374139 = (C23081225378374139) linkedHashMap2.get(str);
            if (c23081225378374139 != null && (value = ((S17255966974483065294) c23081225378374139).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) i1581330382723795749.c).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final void b(String str) {
        str.getClass();
        I1581330382723795749 i1581330382723795749 = this.b;
        ((LinkedHashMap) i1581330382723795749.a).remove(str);
        ((LinkedHashMap) i1581330382723795749.c).remove(str);
        ((LinkedHashMap) i1581330382723795749.d).remove(str);
        if (this.a.remove(str) == null) {
            return;
        }
        Z3383101362411723454.s();
    }

    public final void c(String str, Object obj) {
        str.getClass();
        if (obj != null) {
            ArrayList arrayList = M13104451165648698919.a;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((Class) obj2).isInstance(obj)) {
                    }
                }
            }
            K2042933864045806308.l("Can't put value with type ", obj.getClass(), " into saved state");
            return;
        }
        ArrayList arrayList2 = M13104451165648698919.a;
        Object obj3 = this.a.get(str);
        I1378617920849948703 i1378617920849948703 = obj3 instanceof I1378617920849948703 ? (I1378617920849948703) obj3 : null;
        if (i1378617920849948703 != null) {
            i1378617920849948703.e(obj);
        }
        this.b.o(str, obj);
    }

    public L13135072960070674001(H6457936572911484476 h6457936572911484476) {
        this.a = new LinkedHashMap();
        this.b = new I1581330382723795749(h6457936572911484476);
    }
}
