package dev.epro.r0;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M16625233827921399826 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ M16625233827921399826(ActionBarOverlayLayout actionBarOverlayLayout, byte b) {
        this.a = b;
        this.b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        switch (b) {
            case 0:
                actionBarOverlayLayout.f();
                actionBarOverlayLayout.z = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.A);
                break;
            default:
                actionBarOverlayLayout.f();
                actionBarOverlayLayout.z = actionBarOverlayLayout.d.animate().translationY(-actionBarOverlayLayout.d.getHeight()).setListener(actionBarOverlayLayout.A);
                break;
        }
    }
}
