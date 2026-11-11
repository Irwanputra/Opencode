package p034.p050.p053;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p034.p050.p051.p052.InterfaceC1173;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractViewOnTouchListenerC1249 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f6118;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final float f6119;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Runnable f6120;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int[] f6121 = new int[2];

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f6122;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final View f6123;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Runnable f6124;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f6125;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f6126;

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.は〲ぱなで$〺つふすそ, reason: contains not printable characters */
    public class RunnableC1250 implements Runnable {
        public RunnableC1250() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC1249 abstractViewOnTouchListenerC1249 = AbstractViewOnTouchListenerC1249.this;
            abstractViewOnTouchListenerC1249.m2889();
            View view = abstractViewOnTouchListenerC1249.f6123;
            if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1249.mo90()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                abstractViewOnTouchListenerC1249.f6118 = true;
            }
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.は〲ぱなで$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1251 implements Runnable {
        public RunnableC1251() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC1249.this.f6123.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public AbstractViewOnTouchListenerC1249(View view) {
        this.f6123 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f6119 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f6122 = tapTimeout;
        this.f6125 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r4 != 3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.AbstractViewOnTouchListenerC1249.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f6118 = false;
        this.f6126 = -1;
        Runnable runnable = this.f6124;
        if (runnable != null) {
            this.f6123.removeCallbacks(runnable);
        }
    }

    /* renamed from: 〺つふすそ */
    public abstract InterfaceC1173 mo89();

    /* renamed from: くし〴〺ぅ */
    public abstract boolean mo90();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2889() {
        Runnable runnable = this.f6120;
        if (runnable != null) {
            this.f6123.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f6124;
        if (runnable2 != null) {
            this.f6123.removeCallbacks(runnable2);
        }
    }

    /* renamed from: びぐびあび */
    public boolean mo133() {
        InterfaceC1173 mo89 = mo89();
        if (mo89 == null || !mo89.mo176()) {
            return true;
        }
        mo89.dismiss();
        return true;
    }
}
