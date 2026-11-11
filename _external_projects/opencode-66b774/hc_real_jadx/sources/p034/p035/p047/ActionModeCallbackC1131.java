package p034.p035.p047;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* renamed from: づざかべべ.〳ぜぞぜべっ.へぬ〴づぞ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ActionModeCallbackC1131 implements ActionMode.Callback {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final TextView f5649;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Class<?> f5650;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ActionMode.Callback f5651;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f5652;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f5653 = false;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Method f5654;

    public ActionModeCallbackC1131(ActionMode.Callback callback, TextView textView) {
        this.f5651 = callback;
        this.f5649 = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f5651.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f5651.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f5651.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p035.p047.ActionModeCallbackC1131.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
