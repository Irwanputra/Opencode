package p034.p035.p045;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ViewTreeObserverOnPreDrawListenerC1111 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final View f5604;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ViewTreeObserver f5605;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Runnable f5606;

    public ViewTreeObserverOnPreDrawListenerC1111(View view, Runnable runnable) {
        this.f5604 = view;
        this.f5605 = view.getViewTreeObserver();
        this.f5606 = runnable;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static ViewTreeObserverOnPreDrawListenerC1111 m2544(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC1111 viewTreeObserverOnPreDrawListenerC1111 = new ViewTreeObserverOnPreDrawListenerC1111(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1111);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1111);
        return viewTreeObserverOnPreDrawListenerC1111;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m2545();
        this.f5606.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f5605 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2545();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2545() {
        (this.f5605.isAlive() ? this.f5605 : this.f5604.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f5604.removeOnAttachStateChangeListener(this);
    }
}
