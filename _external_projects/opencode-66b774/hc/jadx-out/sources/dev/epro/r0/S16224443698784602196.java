package dev.epro.r0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S16224443698784602196 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ B13729205492206812220 c;

    public S16224443698784602196(View view, B13729205492206812220 b13729205492206812220) {
        this.b = view;
        this.c = b13729205492206812220;
        view.addOnAttachStateChangeListener(this);
        if (this.a || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.a = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a) {
            return;
        }
        View view2 = this.b;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.a = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.a) {
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a = false;
        }
    }
}
