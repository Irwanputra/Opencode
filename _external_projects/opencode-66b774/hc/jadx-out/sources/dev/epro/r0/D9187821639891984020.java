package dev.epro.r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D9187821639891984020 implements View.OnApplyWindowInsetsListener {
    public N3121440022506799205 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ S15634377979812012213 c;

    public D9187821639891984020(View view, S15634377979812012213 s15634377979812012213) {
        this.b = view;
        this.c = s15634377979812012213;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        N3121440022506799205 n3121440022506799205C = N3121440022506799205.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        S15634377979812012213 s15634377979812012213 = this.c;
        if (i < 30) {
            Q5747078841744593420.a(windowInsets, this.b);
            if (n3121440022506799205C.equals(this.a)) {
                return s15634377979812012213.h(view, n3121440022506799205C).b();
            }
        }
        this.a = n3121440022506799205C;
        N3121440022506799205 n3121440022506799205H = s15634377979812012213.h(view, n3121440022506799205C);
        if (i >= 30) {
            return n3121440022506799205H.b();
        }
        WeakHashMap weakHashMap = W10240872260424387225.a;
        view.requestApplyInsets();
        return n3121440022506799205H.b();
    }
}
