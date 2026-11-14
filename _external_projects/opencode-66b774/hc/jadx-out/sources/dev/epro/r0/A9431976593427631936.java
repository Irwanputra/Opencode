package dev.epro.r0;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A9431976593427631936 extends FrameLayout implements T939033232728923374 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public A9431976593427631936(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }
}
