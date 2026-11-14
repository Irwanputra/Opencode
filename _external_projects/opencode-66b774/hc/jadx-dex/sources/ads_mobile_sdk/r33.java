package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class r33 implements dev.epro.r0.B8427392651679410143 {
    public static final /* synthetic */ int c = 0;
    public final java.util.List a;
    public final java.util.List b;

    static {
        ads_mobile_sdk.hb1.a(java.util.Collections.EMPTY_SET);
    }

    public r33(java.util.List list, java.util.List list2) {
        this.a = list;
        this.b = list2;
    }

    public final java.lang.Object get() {
        java.util.List list = this.a;
        int size = list.size();
        java.util.List list2 = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            java.util.Collection collection = (java.util.Collection) ((dev.epro.r0.V2597580950516131749) list2.get(i)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        java.util.HashSet hashSet = new java.util.HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            java.lang.Object obj = ((dev.epro.r0.V2597580950516131749) list.get(i2)).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (java.lang.Object obj2 : (java.util.Collection) arrayList.get(i3)) {
                obj2.getClass();
                hashSet.add(obj2);
            }
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }
}
