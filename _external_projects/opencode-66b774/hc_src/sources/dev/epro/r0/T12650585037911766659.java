package dev.epro.r0;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T12650585037911766659 extends F3205875925450835131 implements S17787728937930228535 {
    public Context c;
    public ActionBarContextView d;
    public W8455343525638953052 e;
    public WeakReference f;
    public boolean g;
    public T8605657386197958581 h;

    @Override // dev.epro.r0.F3205875925450835131
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.I(this);
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
        return this.h;
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final MenuInflater d() {
        return new C8081513896840795204(this.d.getContext());
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // dev.epro.r0.S17787728937930228535
    public final void f(T8605657386197958581 t8605657386197958581) {
        h();
        T1878852318042345820 t1878852318042345820 = this.d.d;
        if (t1878852318042345820 != null) {
            t1878852318042345820.l();
        }
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final CharSequence g() {
        return this.d.getTitle();
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void h() {
        this.e.J(this, this.h);
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final boolean i() {
        return this.d.s;
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void j(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void k(int i) {
        m(this.c.getString(i));
    }

    @Override // dev.epro.r0.S17787728937930228535
    public final boolean l(T8605657386197958581 t8605657386197958581, MenuItem menuItem) {
        return ((J15730374346044043770) this.e.b).P(this, menuItem);
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void n(int i) {
        o(this.c.getString(i));
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // dev.epro.r0.F3205875925450835131
    public final void p(boolean z) {
        this.b = z;
        this.d.setTitleOptional(z);
    }
}
