package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C12564307762809987743 implements dev.epro.r0.P5210161598916505319 {
    public boolean a = false;
    public byte b;
    public final /* synthetic */ androidx.appcompat.widget.ActionBarContextView c;

    public C12564307762809987743(androidx.appcompat.widget.ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.f = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    public final void d() {
        this.a = true;
    }

    public final void f() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }
}
