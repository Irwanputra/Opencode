package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B13570233856821118719 implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, dev.epro.r0.C546526958440023066 {
    public dev.epro.r0.T8605657386197958581 a;
    public dev.epro.r0.B9683044498301182575 b;
    public dev.epro.r0.E4608116865152724952 c;

    @Override // dev.epro.r0.C546526958440023066
    public final void a(dev.epro.r0.T8605657386197958581 t8605657386197958581, boolean z) {
        dev.epro.r0.B9683044498301182575 b9683044498301182575;
        if ((z || t8605657386197958581 == this.a) && (b9683044498301182575 = this.b) != null) {
            b9683044498301182575.dismiss();
        }
    }

    @Override // dev.epro.r0.C546526958440023066
    public final boolean b(dev.epro.r0.T8605657386197958581 t8605657386197958581) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        dev.epro.r0.T8605657386197958581 t8605657386197958581 = this.a;
        dev.epro.r0.E4608116865152724952 e4608116865152724952 = this.c;
        dev.epro.r0.M11787204309148171275 m11787204309148171275 = e4608116865152724952.f;
        if (m11787204309148171275 == null) {
            m11787204309148171275 = new dev.epro.r0.M11787204309148171275(e4608116865152724952);
            e4608116865152724952.f = m11787204309148171275;
        }
        t8605657386197958581.q(m11787204309148171275.b(i), (dev.epro.r0.U13539487668147601899) null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.c.a(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        android.view.Window window;
        android.view.View decorView;
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        android.view.View decorView2;
        android.view.KeyEvent.DispatcherState keyDispatcherState2;
        dev.epro.r0.T8605657386197958581 t8605657386197958581 = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.Window window2 = this.b.getWindow();
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
