package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A8443250024445789105 extends android.view.ActionMode {
    public final android.content.Context a;
    public final dev.epro.r0.F3205875925450835131 b;

    public A8443250024445789105(android.content.Context context, dev.epro.r0.F3205875925450835131 f3205875925450835131) {
        this.a = context;
        this.b = f3205875925450835131;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.a();
    }

    @Override // android.view.ActionMode
    public final android.view.View getCustomView() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public final android.view.Menu getMenu() {
        return new dev.epro.r0.C2329263103474904727(this.a, this.b.c());
    }

    @Override // android.view.ActionMode
    public final android.view.MenuInflater getMenuInflater() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getSubtitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final java.lang.Object getTag() {
        return this.b.a;
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getTitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(android.view.View view) {
        this.b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(java.lang.CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(java.lang.Object obj) {
        this.b.a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(java.lang.CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.n(i);
    }
}
