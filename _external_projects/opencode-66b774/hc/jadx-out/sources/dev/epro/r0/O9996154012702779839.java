package dev.epro.r0;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O9996154012702779839 extends F3205875925450835131 implements S17787728937930228535 {
    public final Context c;
    public final T8605657386197958581 d;
    public W8455343525638953052 e;
    public WeakReference f;
    public final /* synthetic */ I6301446377683660838 g;

    public O9996154012702779839(I6301446377683660838 i6301446377683660838, Context context, W8455343525638953052 w8455343525638953052) {
        this.g = i6301446377683660838;
        this.c = context;
        this.e = w8455343525638953052;
        T8605657386197958581 t8605657386197958581 = new T8605657386197958581(context);
        t8605657386197958581.l = true;
        this.d = t8605657386197958581;
        t8605657386197958581.e = this;
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void a() {
        I6301446377683660838 i6301446377683660838 = this.g;
        if (i6301446377683660838.i != this) {
            return;
        }
        if (i6301446377683660838.p) {
            i6301446377683660838.j = this;
            i6301446377683660838.k = this.e;
        } else {
            this.e.I(this);
        }
        this.e = null;
        i6301446377683660838.a(false);
        ActionBarContextView actionBarContextView = i6301446377683660838.f;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        i6301446377683660838.c.setHideOnContentScrollEnabled(i6301446377683660838.u);
        i6301446377683660838.i = null;
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final T8605657386197958581 c() {
        return this.d;
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final MenuInflater d() {
        return new C8081513896840795204(this.c);
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final CharSequence e() {
        return this.g.f.getSubtitle();
    }

    @Override // dev.epro.r0.S17787728937930228535
    public final void f(T8605657386197958581 t8605657386197958581) {
        if (this.e == null) {
            return;
        }
        h();
        T1878852318042345820 t1878852318042345820 = this.g.f.d;
        if (t1878852318042345820 != null) {
            t1878852318042345820.l();
        }
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final CharSequence g() {
        return this.g.f.getTitle();
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void h() {
        if (this.g.i != this) {
            return;
        }
        T8605657386197958581 t8605657386197958581 = this.d;
        t8605657386197958581.w();
        try {
            this.e.J(this, t8605657386197958581);
        } finally {
            t8605657386197958581.v();
        }
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final boolean i() {
        return this.g.f.s;
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void j(View view) {
        this.g.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void k(int i) {
        m(this.g.a.getResources().getString(i));
    }

    @Override // dev.epro.r0.S17787728937930228535
    public final boolean l(T8605657386197958581 t8605657386197958581, MenuItem menuItem) {
        W8455343525638953052 w8455343525638953052 = this.e;
        if (w8455343525638953052 != null) {
            return ((J15730374346044043770) w8455343525638953052.b).P(this, menuItem);
        }
        return false;
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void m(CharSequence charSequence) {
        this.g.f.setSubtitle(charSequence);
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void n(int i) {
        o(this.g.a.getResources().getString(i));
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void o(CharSequence charSequence) {
        this.g.f.setTitle(charSequence);
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void p(boolean z) {
        this.b = z;
        this.g.f.setTitleOptional(z);
    }
}
