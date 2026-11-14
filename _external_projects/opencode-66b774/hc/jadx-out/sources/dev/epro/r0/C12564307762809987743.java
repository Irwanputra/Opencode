package dev.epro.r0;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C12564307762809987743 implements P5210161598916505319 {
    public boolean a = false;
    public byte b;
    public final /* synthetic */ ActionBarContextView c;

    public C12564307762809987743(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // dev.epro.r0.P5210161598916505319
    public final void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.f = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // dev.epro.r0.P5210161598916505319
    public final void d() {
        this.a = true;
    }

    @Override // dev.epro.r0.P5210161598916505319
    public final void f() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }
}
