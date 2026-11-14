package dev.epro.r0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q5747078841744593420 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static N3121440022506799205 b(View view, N3121440022506799205 n3121440022506799205, Rect rect) {
        WindowInsets windowInsetsB = n3121440022506799205.b();
        if (windowInsetsB != null) {
            return N3121440022506799205.c(view.computeSystemWindowInsets(windowInsetsB, rect), view);
        }
        rect.setEmpty();
        return n3121440022506799205;
    }

    public static void c(View view, S15634377979812012213 s15634377979812012213) {
        D9187821639891984020 d9187821639891984020 = s15634377979812012213 != null ? new D9187821639891984020(view, s15634377979812012213) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, d9187821639891984020);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (d9187821639891984020 != null) {
            view.setOnApplyWindowInsetsListener(d9187821639891984020);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
