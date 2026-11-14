package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A15099318540142210187 extends org.chromium.net.UrlResponseInfo.HeaderBlock {
    public final java.util.List a;
    public java.util.Map b;

    public A15099318540142210187(java.util.List list) {
        this.a = list;
    }

    public final java.util.List getAsList() {
        return this.a;
    }

    public final java.util.Map getAsMap() {
        java.util.Map map = this.b;
        if (map != null) {
            return map;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (java.util.Map.Entry entry : this.a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((java.util.Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((java.lang.String) entry.getValue());
            treeMap.put((java.lang.String) entry.getKey(), java.util.Collections.unmodifiableList(arrayList));
        }
        java.util.Map mapUnmodifiableMap = java.util.Collections.unmodifiableMap(treeMap);
        this.b = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }
}
