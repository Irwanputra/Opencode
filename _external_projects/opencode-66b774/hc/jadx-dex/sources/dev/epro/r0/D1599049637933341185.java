package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D1599049637933341185 {
    public static final java.util.ArrayList d = new java.util.ArrayList();
    public java.util.WeakHashMap a;
    public android.util.SparseArray b;
    public java.lang.ref.WeakReference c;

    public final android.view.View a(android.view.View view) {
        int size;
        java.util.WeakHashMap weakHashMap = this.a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    android.view.View viewA = a(viewGroup.getChildAt(childCount));
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(2131296767);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                dev.epro.r0.Z3383101362411723454.s();
            }
        }
        return null;
    }
}
