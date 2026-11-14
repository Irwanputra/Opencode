package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D11460893557152340610 implements android.widget.PopupWindow.OnDismissListener {
    public final /* synthetic */ dev.epro.r0.O1776232730137214479 a;
    public final /* synthetic */ dev.epro.r0.H13521189488363841561 b;

    public D11460893557152340610(dev.epro.r0.H13521189488363841561 h13521189488363841561, dev.epro.r0.O1776232730137214479 o1776232730137214479) {
        this.b = h13521189488363841561;
        this.a = o1776232730137214479;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        android.view.ViewTreeObserver viewTreeObserver = this.b.G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
