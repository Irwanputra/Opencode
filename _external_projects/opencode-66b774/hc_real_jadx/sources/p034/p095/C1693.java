package p034.p095;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import p034.p035.p045.C1096;

@SuppressLint({"ViewConstructor"})
/* renamed from: づざかべべ.は〲ぱなで.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1693 extends ViewGroup implements InterfaceC1691 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final /* synthetic */ int f7826 = 0;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ViewGroup f7827;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final ViewTreeObserver.OnPreDrawListener f7828;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public View f7829;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f7830;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Matrix f7831;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final View f7832;

    /* renamed from: づざかべべ.は〲ぱなで.いいにぽつ$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewTreeObserverOnPreDrawListenerC1694 implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC1694() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            C1096.m2508(C1693.this);
            C1693 c1693 = C1693.this;
            ViewGroup viewGroup = c1693.f7827;
            if (viewGroup == null || (view = c1693.f7829) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C1096.m2508(C1693.this.f7827);
            C1693 c16932 = C1693.this;
            c16932.f7827 = null;
            c16932.f7829 = null;
            return true;
        }
    }

    public C1693(View view) {
        super(view.getContext());
        this.f7828 = new ViewTreeObserverOnPreDrawListenerC1694();
        this.f7832 = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m3743(View view, View view2) {
        C1714.m3761(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C1693 m3744(View view) {
        return (C1693) view.getTag(C1740.ghost_view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7832.setTag(C1740.ghost_view, this);
        this.f7832.getViewTreeObserver().addOnPreDrawListener(this.f7828);
        C1714.f7881.mo3738(this.f7832, 4);
        if (this.f7832.getParent() != null) {
            ((View) this.f7832.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f7832.getViewTreeObserver().removeOnPreDrawListener(this.f7828);
        C1714.f7881.mo3738(this.f7832, 0);
        this.f7832.setTag(C1740.ghost_view, null);
        if (this.f7832.getParent() != null) {
            ((View) this.f7832.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C1687.m3720(canvas, true);
        canvas.setMatrix(this.f7831);
        View view = this.f7832;
        C1708 c1708 = C1714.f7881;
        c1708.mo3738(view, 0);
        this.f7832.invalidate();
        c1708.mo3738(this.f7832, 4);
        drawChild(canvas, this.f7832, getDrawingTime());
        C1687.m3720(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, p034.p095.InterfaceC1691
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m3744(this.f7832) == this) {
            C1714.f7881.mo3738(this.f7832, i == 0 ? 4 : 0);
        }
    }

    @Override // p034.p095.InterfaceC1691
    /* renamed from: げつ〴ぬぐ */
    public void mo3740(ViewGroup viewGroup, View view) {
        this.f7827 = viewGroup;
        this.f7829 = view;
    }
}
