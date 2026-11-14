package dev.epro.r0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O18193234200241516073 extends ActionMode.Callback2 implements ActionMode.Callback {
    public final A18371761705606051847 a;

    public O18193234200241516073(A18371761705606051847 a18371761705606051847) {
        this.a = a18371761705606051847;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.a.a(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.a.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        S6349823729575121924 s6349823729575121924 = (S6349823729575121924) this.a.c.invoke();
        rect.set(Math.round(s6349823729575121924.a), Math.round(s6349823729575121924.b), Math.round(s6349823729575121924.c), Math.round(s6349823729575121924.d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.a(menu);
    }
}
