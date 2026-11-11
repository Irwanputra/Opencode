package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p034.p035.p045.C1096;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2939;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2940;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Runnable f2941;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f2942;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f2943;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public OverScroller f2944;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public VelocityTracker f2945;

    /* JADX WARN: Field signature parse error: くし〴〺ぅ
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TV at position 1 ('V'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:160)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    /* renamed from: com.google.android.material.appbar.HeaderBehavior$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0392 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final CoordinatorLayout f2946;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final View f2947;

        public RunnableC0392(CoordinatorLayout coordinatorLayout, V v) {
            this.f2946 = coordinatorLayout;
            this.f2947 = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f2947 == null || (overScroller = HeaderBehavior.this.f2944) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.mo1278(this.f2946, this.f2947);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.m1291(this.f2946, this.f2947, headerBehavior.f2944.getCurrY());
            C1096.m2482(this.f2947, this);
        }
    }

    public HeaderBehavior() {
        this.f2943 = -1;
        this.f2939 = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2943 = -1;
        this.f2939 = -1;
    }

    /* renamed from: 〺でおいここ */
    public int mo1266(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int m4812;
        int m1296 = m1296();
        if (i2 == 0 || m1296 < i2 || m1296 > i3 || m1296 == (m4812 = C2786.m4812(i, i2, i3))) {
            return 0;
        }
        m1295(m4812);
        return m1296 - m4812;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: いいにぽつ */
    public boolean mo347(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f2939 < 0) {
            this.f2939 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2942) {
            int i = this.f2943;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f2940) > this.f2939) {
                this.f2940 = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f2943 = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo1272(v) && coordinatorLayout.m333(v, x, y2);
            this.f2942 = z;
            if (z) {
                this.f2940 = y2;
                this.f2943 = motionEvent.getPointerId(0);
                if (this.f2945 == null) {
                    this.f2945 = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f2944;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f2944.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f2945;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* renamed from: ぉひのべい */
    public int mo1270(V v) {
        return v.getHeight();
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public int m1291(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo1266(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public final int m1292(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo1266(coordinatorLayout, v, mo1273() - i, i2, i3);
    }

    /* renamed from: じぜこほぱ */
    public boolean mo1272(V v) {
        return false;
    }

    /* renamed from: せづっ〸ちね */
    public int mo1273() {
        return m1296();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: びえぁぜい */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo364(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.mo364(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: ぷぞてのほき */
    public void mo1278(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: ぺづげぺが */
    public int mo1279(V v) {
        return -v.getHeight();
    }
}
