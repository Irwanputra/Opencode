package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E9613915805164983796 {
    public static final java.lang.reflect.Method a;

    static {
        if (android.os.Build.VERSION.SDK_INT == 25) {
            try {
                a = android.view.ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static float a(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        java.lang.reflect.Method method;
        if (android.os.Build.VERSION.SDK_INT >= 25 && (method = a) != null) {
            try {
                return ((java.lang.Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (java.lang.Exception unused) {
            }
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
