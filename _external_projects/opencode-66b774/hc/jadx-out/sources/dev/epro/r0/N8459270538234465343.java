package dev.epro.r0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N8459270538234465343 implements L469992840463392687 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ N8459270538234465343(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.L469992840463392687
    public final Bundle a() {
        H9390398899829886498[] h9390398899829886498Arr;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                J6160233934771378283 j6160233934771378283 = ((T17336508261397230716) obj).h;
                j6160233934771378283.getClass();
                LinkedHashMap linkedHashMap = j6160233934771378283.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(j6160233934771378283.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(j6160233934771378283.g));
                return bundle;
            case 1:
                Map mapD = ((L6644189956008555542) obj).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapD.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                R13227154569034155950 r13227154569034155950 = (R13227154569034155950) obj;
                while (R13227154569034155950.o(((C10994625127000459680) r13227154569034155950.u.b).t)) {
                }
                r13227154569034155950.v.e(P72364327365747079.ON_STOP);
                return new Bundle();
            case 3:
                return ((P14575954172000745949) obj).O();
            default:
                I1581330382723795749 i1581330382723795749 = (I1581330382723795749) obj;
                for (Map.Entry entry2 : E4951175994894594588.z0((LinkedHashMap) i1581330382723795749.d).entrySet()) {
                    i1581330382723795749.o((String) entry2.getKey(), ((S17255966974483065294) ((C23081225378374139) entry2.getValue())).getValue());
                }
                for (Map.Entry entry3 : E4951175994894594588.z0((LinkedHashMap) i1581330382723795749.b).entrySet()) {
                    i1581330382723795749.o((String) entry3.getKey(), ((L469992840463392687) entry3.getValue()).a());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) i1581330382723795749.a;
                if (linkedHashMap2.isEmpty()) {
                    h9390398899829886498Arr = new H9390398899829886498[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new H9390398899829886498((String) entry4.getKey(), entry4.getValue()));
                    }
                    h9390398899829886498Arr = (H9390398899829886498[]) arrayList.toArray(new H9390398899829886498[0]);
                }
                return O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(h9390398899829886498Arr, h9390398899829886498Arr.length));
        }
    }
}
