package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class B12575609279310534815 {
    public static final java.lang.reflect.Method a;
    public static final java.lang.reflect.Method b;
    public static final java.lang.reflect.Method c;
    public static final boolean d;

    static {
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            java.lang.Class cls2 = java.lang.Boolean.TYPE;
            java.lang.Class cls3 = java.lang.Float.TYPE;
            java.lang.reflect.Method declaredMethod = android.widget.AbsListView.class.getDeclaredMethod("positionSelector", cls, android.view.View.class, cls2, cls3, cls3);
            a = declaredMethod;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Method declaredMethod2 = android.widget.AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            java.lang.reflect.Method declaredMethod3 = android.widget.AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            d = true;
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }
}
