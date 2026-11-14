package dev.epro.r0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K10428636177324322555 {
    public static N3121440022506799205 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        N3121440022506799205 n3121440022506799205C = N3121440022506799205.c(rootWindowInsets, null);
        J11937375245988738237 j11937375245988738237 = n3121440022506799205C.a;
        j11937375245988738237.y(n3121440022506799205C);
        View rootView = view.getRootView();
        j11937375245988738237.d(rootView);
        j11937375245988738237.p(rootView);
        j11937375245988738237.q();
        return n3121440022506799205C;
    }
}
