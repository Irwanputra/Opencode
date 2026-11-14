package dev.epro.r0;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class E4951175994894594588 extends Q13169198992966610970 {
    public static LinkedHashMap A0(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static Object t0(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int u0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map v0(H9390398899829886498... h9390398899829886498Arr) {
        if (h9390398899829886498Arr.length <= 0) {
            return X9852054718446117252.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u0(h9390398899829886498Arr.length));
        x0(linkedHashMap, h9390398899829886498Arr);
        return linkedHashMap;
    }

    public static LinkedHashMap w0(H9390398899829886498... h9390398899829886498Arr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(u0(h9390398899829886498Arr.length));
        x0(linkedHashMap, h9390398899829886498Arr);
        return linkedHashMap;
    }

    public static final void x0(HashMap map, H9390398899829886498[] h9390398899829886498Arr) {
        for (H9390398899829886498 h9390398899829886498 : h9390398899829886498Arr) {
            map.put(h9390398899829886498.a, h9390398899829886498.b);
        }
    }

    public static Map y0(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        X9852054718446117252 x9852054718446117252 = X9852054718446117252.a;
        if (!z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                H9390398899829886498 h9390398899829886498 = (H9390398899829886498) it.next();
                linkedHashMap.put(h9390398899829886498.a, h9390398899829886498.b);
            }
            int size = linkedHashMap.size();
            if (size == 0) {
                return x9852054718446117252;
            }
            if (size != 1) {
                return linkedHashMap;
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return x9852054718446117252;
        }
        if (size2 == 1) {
            H9390398899829886498 h93903988998298864982 = (H9390398899829886498) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
            h93903988998298864982.getClass();
            Map mapSingletonMap2 = Collections.singletonMap(h93903988998298864982.a, h93903988998298864982.b);
            mapSingletonMap2.getClass();
            return mapSingletonMap2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(u0(collection.size()));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            H9390398899829886498 h93903988998298864983 = (H9390398899829886498) it2.next();
            linkedHashMap2.put(h93903988998298864983.a, h93903988998298864983.b);
        }
        return linkedHashMap2;
    }

    public static Map z0(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return X9852054718446117252.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
