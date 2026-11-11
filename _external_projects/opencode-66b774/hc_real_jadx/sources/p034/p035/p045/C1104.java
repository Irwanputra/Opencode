package p034.p035.p045;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;
import p034.p050.p060.C1295;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1104 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f5596 = -1;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public WeakReference<View> f5597;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ごづごきえ$〺つふすそ, reason: contains not printable characters */
    public class C1105 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ View f5598;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC1118 f5599;

        public C1105(C1104 c1104, InterfaceC1118 interfaceC1118, View view) {
            this.f5599 = interfaceC1118;
            this.f5598 = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) C1295.this.f6291.getParent()).invalidate();
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ごづごきえ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1106 implements InterfaceC1108 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f5600;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1104 f5601;

        public C1106(C1104 c1104) {
            this.f5601 = c1104;
        }

        @Override // p034.p035.p045.InterfaceC1108
        @SuppressLint({"WrongConstant"})
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo2539(View view) {
            int i = this.f5601.f5596;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f5601.f5596 = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f5600) {
                this.f5601.getClass();
                Object tag = view.getTag(2113929216);
                InterfaceC1108 interfaceC1108 = tag instanceof InterfaceC1108 ? (InterfaceC1108) tag : null;
                if (interfaceC1108 != null) {
                    interfaceC1108.mo2539(view);
                }
                this.f5600 = true;
            }
        }

        @Override // p034.p035.p045.InterfaceC1108
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo2540(View view) {
            this.f5600 = false;
            if (this.f5601.f5596 > -1) {
                view.setLayerType(2, null);
            }
            this.f5601.getClass();
            Object tag = view.getTag(2113929216);
            InterfaceC1108 interfaceC1108 = tag instanceof InterfaceC1108 ? (InterfaceC1108) tag : null;
            if (interfaceC1108 != null) {
                interfaceC1108.mo2540(view);
            }
        }

        @Override // p034.p035.p045.InterfaceC1108
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo2541(View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC1108 interfaceC1108 = tag instanceof InterfaceC1108 ? (InterfaceC1108) tag : null;
            if (interfaceC1108 != null) {
                interfaceC1108.mo2541(view);
            }
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ごづごきえ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1107 extends AnimatorListenerAdapter {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ View f5602;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC1108 f5603;

        public C1107(C1104 c1104, InterfaceC1108 interfaceC1108, View view) {
            this.f5603 = interfaceC1108;
            this.f5602 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5603.mo2541(this.f5602);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5603.mo2539(this.f5602);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f5603.mo2540(this.f5602);
        }
    }

    public C1104(View view) {
        this.f5597 = new WeakReference<>(view);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2532() {
        View view = this.f5597.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1104 m2533(float f) {
        View view = this.f5597.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1104 m2534(long j) {
        View view = this.f5597.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1104 m2535(float f) {
        View view = this.f5597.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m2536(View view, InterfaceC1108 interfaceC1108) {
        if (interfaceC1108 != null) {
            view.animate().setListener(new C1107(this, interfaceC1108, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1104 m2537(InterfaceC1118 interfaceC1118) {
        View view = this.f5597.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(interfaceC1118 != null ? new C1105(this, interfaceC1118, view) : null);
        }
        return this;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1104 m2538(InterfaceC1108 interfaceC1108) {
        View view = this.f5597.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, interfaceC1108);
                interfaceC1108 = new C1106(this);
            }
            m2536(view, interfaceC1108);
        }
        return this;
    }
}
