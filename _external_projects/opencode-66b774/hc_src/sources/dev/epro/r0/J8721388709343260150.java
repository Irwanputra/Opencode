package dev.epro.r0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J8721388709343260150 implements I13705844976240322740, X7832484086864227495 {
    public static final J8721388709343260150 a = new J8721388709343260150();
    public static final J8721388709343260150 b = new J8721388709343260150();

    @Override // dev.epro.r0.X7832484086864227495
    public B10711566638970406496 b(Context context, X956326825917583670 x956326825917583670) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new B10711566638970406496(bounds, f);
    }

    @Override // dev.epro.r0.I13705844976240322740
    public Rect d(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
