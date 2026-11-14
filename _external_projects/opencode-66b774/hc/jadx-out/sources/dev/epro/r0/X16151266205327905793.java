package dev.epro.r0;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X16151266205327905793 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ H2233650693096395599 b;

    public X16151266205327905793(H2233650693096395599 h2233650693096395599, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = h2233650693096395599;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.k(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.k(menuItem));
    }
}
