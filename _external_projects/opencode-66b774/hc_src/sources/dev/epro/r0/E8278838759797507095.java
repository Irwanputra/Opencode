package dev.epro.r0;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E8278838759797507095 implements X956326825917583670, X7832484086864227495 {
    public static final E8278838759797507095 a = new E8278838759797507095();
    public static final E8278838759797507095 b = new E8278838759797507095();

    @Override // dev.epro.r0.X7832484086864227495
    public B10711566638970406496 b(Context context, X956326825917583670 x956326825917583670) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new B10711566638970406496(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // dev.epro.r0.X956326825917583670
    public float c(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
