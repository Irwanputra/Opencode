package dev.epro.r0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q7493219842314740732 extends T8605657386197958581 implements SubMenu {
    public final I4217019646703278835 A;
    public final T8605657386197958581 z;

    public Q7493219842314740732(Context context, T8605657386197958581 t8605657386197958581, I4217019646703278835 i4217019646703278835) {
        super(context);
        this.z = t8605657386197958581;
        this.A = i4217019646703278835;
    }

    @Override // dev.epro.r0.T8605657386197958581
    public final boolean d(I4217019646703278835 i4217019646703278835) {
        return this.z.d(i4217019646703278835);
    }

    @Override // dev.epro.r0.T8605657386197958581
    public final boolean e(T8605657386197958581 t8605657386197958581, MenuItem menuItem) {
        return super.e(t8605657386197958581, menuItem) || this.z.e(t8605657386197958581, menuItem);
    }

    @Override // dev.epro.r0.T8605657386197958581
    public final boolean f(I4217019646703278835 i4217019646703278835) {
        return this.z.f(i4217019646703278835);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // dev.epro.r0.T8605657386197958581
    public final String j() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return G6547577305291411977.n(i, "android:menu:actionviewstates:");
    }

    @Override // dev.epro.r0.T8605657386197958581
    public final T8605657386197958581 k() {
        return this.z.k();
    }

    @Override // dev.epro.r0.T8605657386197958581
    public final boolean m() {
        return this.z.m();
    }

    @Override // dev.epro.r0.T8605657386197958581
    public final boolean n() {
        return this.z.n();
    }

    @Override // dev.epro.r0.T8605657386197958581
    public final boolean o() {
        return this.z.o();
    }

    @Override // dev.epro.r0.T8605657386197958581, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // dev.epro.r0.T8605657386197958581, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
