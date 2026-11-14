package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E8278838759797507095 implements dev.epro.r0.X956326825917583670, dev.epro.r0.X7832484086864227495 {
    public static final dev.epro.r0.E8278838759797507095 a = new dev.epro.r0.E8278838759797507095();
    public static final dev.epro.r0.E8278838759797507095 b = new dev.epro.r0.E8278838759797507095();

    public dev.epro.r0.B10711566638970406496 b(android.content.Context context, dev.epro.r0.X956326825917583670 x956326825917583670) {
        android.view.WindowManager windowManager = context.isUiContext() ? (android.view.WindowManager) context.getSystemService(android.view.WindowManager.class) : (android.view.WindowManager) context.getApplicationContext().getSystemService(android.view.WindowManager.class);
        android.graphics.Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new dev.epro.r0.B10711566638970406496(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    public float c(android.content.Context context) {
        return ((android.view.WindowManager) context.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
