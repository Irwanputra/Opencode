package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E4951175994894594588 extends dev.epro.r0.Q13169198992966610970 {
    public static java.util.LinkedHashMap A0(java.util.Map map) {
        map.getClass();
        return new java.util.LinkedHashMap(map);
    }

    public static java.lang.Object t0(java.lang.Object obj, java.util.Map map) {
        map.getClass();
        java.lang.Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new java.util.NoSuchElementException("Key " + obj + " is missing in the map.");
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

    public static java.util.Map v0(dev.epro.r0.H9390398899829886498... h9390398899829886498Arr) {
        if (h9390398899829886498Arr.length <= 0) {
            return dev.epro.r0.X9852054718446117252.a;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(u0(h9390398899829886498Arr.length));
        x0(linkedHashMap, h9390398899829886498Arr);
        return linkedHashMap;
    }

    public static java.util.LinkedHashMap w0(dev.epro.r0.H9390398899829886498... h9390398899829886498Arr) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(u0(h9390398899829886498Arr.length));
        x0(linkedHashMap, h9390398899829886498Arr);
        return linkedHashMap;
    }

    public static final void x0(java.util.HashMap map, dev.epro.r0.H9390398899829886498[] h9390398899829886498Arr) {
        for (dev.epro.r0.H9390398899829886498 h9390398899829886498 : h9390398899829886498Arr) {
            map.put(h9390398899829886498.a, h9390398899829886498.b);
        }
    }

    public static java.util.Map y0(java.lang.Iterable iterable) {
        boolean z = iterable instanceof java.util.Collection;
        dev.epro.r0.X9852054718446117252 x9852054718446117252 = dev.epro.r0.X9852054718446117252.a;
        if (!z) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                dev.epro.r0.H9390398899829886498 h9390398899829886498 = (dev.epro.r0.H9390398899829886498) it.next();
                linkedHashMap.put(h9390398899829886498.a, h9390398899829886498.b);
            }
            int size = linkedHashMap.size();
            if (size == 0) {
                return x9852054718446117252;
            }
            if (size != 1) {
                return linkedHashMap;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) linkedHashMap.entrySet().iterator().next();
            java.util.Map mapSingletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return x9852054718446117252;
        }
        if (size2 == 1) {
            dev.epro.r0.H9390398899829886498 h93903988998298864982 = (dev.epro.r0.H9390398899829886498) (iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
            h93903988998298864982.getClass();
            java.util.Map mapSingletonMap2 = java.util.Collections.singletonMap(h93903988998298864982.a, h93903988998298864982.b);
            mapSingletonMap2.getClass();
            return mapSingletonMap2;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(u0(collection.size()));
        java.util.Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            dev.epro.r0.H9390398899829886498 h93903988998298864983 = (dev.epro.r0.H9390398899829886498) it2.next();
            linkedHashMap2.put(h93903988998298864983.a, h93903988998298864983.b);
        }
        return linkedHashMap2;
    }

    public static java.util.Map z0(java.util.Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return dev.epro.r0.X9852054718446117252.a;
        }
        if (size != 1) {
            return new java.util.LinkedHashMap(map);
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) map.entrySet().iterator().next();
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
