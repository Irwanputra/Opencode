package dev.epro.r0;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B13570233856821118719 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C546526958440023066 {
    public T8605657386197958581 a;
    public B9683044498301182575 b;
    public E4608116865152724952 c;

    @Override // dev.epro.r0.C546526958440023066
    public final void a(T8605657386197958581 t8605657386197958581, boolean z) {
        B9683044498301182575 b9683044498301182575;
        if ((z || t8605657386197958581 == this.a) && (b9683044498301182575 = this.b) != null) {
            b9683044498301182575.dismiss();
        }
    }

    @Override // dev.epro.r0.C546526958440023066
    public final boolean b(T8605657386197958581 t8605657386197958581) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        T8605657386197958581 t8605657386197958581 = this.a;
        E4608116865152724952 e4608116865152724952 = this.c;
        M11787204309148171275 m11787204309148171275 = e4608116865152724952.f;
        if (m11787204309148171275 == null) {
            m11787204309148171275 = new M11787204309148171275(e4608116865152724952);
            e4608116865152724952.f = m11787204309148171275;
        }
        t8605657386197958581.q(m11787204309148171275.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.a(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        T8605657386197958581 t8605657386197958581 = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                t8605657386197958581.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return t8605657386197958581.performShortcut(i, keyEvent, 0);
    }
}
