package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p034.p035.p045.C1096;
import p034.p035.p045.p046.C1084;
import p034.p063.p064.C1357;
import p131.p161.p162.p163.p170.C2155;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f2990;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1357 f2993;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2992 = 2;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float f2996 = 0.5f;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f2994 = 0.0f;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f2995 = 0.5f;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C1357.AbstractC1359 f2991 = new C0396();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0395 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final View f2997;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final boolean f2998;

        public RunnableC0395(View view, boolean z) {
            this.f2997 = view;
            this.f2998 = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1357 c1357 = SwipeDismissBehavior.this.f2993;
            if (c1357 != null && c1357.m3054(true)) {
                C1096.m2482(this.f2997, this);
            } else if (this.f2998) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0396 extends C1357.AbstractC1359 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f3000 = -1;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f3002;

        public C0396() {
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: 〳ぜぞぜべっ */
        public void mo458(View view, int i) {
            this.f3000 = i;
            this.f3002 = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: 〺つふすそ */
        public int mo459(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: いいにぽつ */
        public void mo461(View view, int i, int i2, int i3, int i4) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f2994) + this.f3002;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f2995) + this.f3002;
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m1309(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: くし〴〺ぅ */
        public int mo462(View view) {
            return view.getWidth();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        
            r5 = r2.f3002;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            if (r5 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        
            if (r5 != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        
            r5 = r2.f3002 - r3.getWidth();
            r3 = r2.f3002;
         */
        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: げつ〴ぬぐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo463(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p034.p035.p045.C1096.m2491(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f2992
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f3002
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f3002
                goto L37
            L1c:
                int r5 = r2.f3002
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f3002
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f3002
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0396.mo463(android.view.View, int, int):int");
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: てぜきぽく */
        public boolean mo465(View view, int i) {
            int i2 = this.f3000;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo1310(view);
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: ぺぁあねじ */
        public void mo469(int i) {
            SwipeDismissBehavior.this.getClass();
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
        
            if (java.lang.Math.abs(r7.getLeft() - r6.f3002) >= java.lang.Math.round(r7.getWidth() * r6.f3001.f2996)) goto L18;
         */
        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: ぺふねづ〺 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo470(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r9 = -1
                r6.f3000 = r9
                int r9 = r7.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L3e
                int r3 = p034.p035.p045.C1096.m2491(r7)
                if (r3 != r2) goto L16
                r3 = 1
                goto L17
            L16:
                r3 = 0
            L17:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f2992
                r5 = 2
                if (r4 != r5) goto L1f
                goto L2c
            L1f:
                if (r4 != 0) goto L30
                if (r3 == 0) goto L28
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L2e
                goto L2c
            L28:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L2e
            L2c:
                r8 = 1
                goto L5b
            L2e:
                r8 = 0
                goto L5b
            L30:
                if (r4 != r2) goto L2e
                if (r3 == 0) goto L39
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L2e
                goto L3d
            L39:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L2e
            L3d:
                goto L2c
            L3e:
                int r8 = r7.getLeft()
                int r0 = r6.f3002
                int r8 = r8 - r0
                int r0 = r7.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f2996
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r0) goto L2e
                goto L2c
            L5b:
                if (r8 == 0) goto L6a
                int r8 = r7.getLeft()
                int r0 = r6.f3002
                if (r8 >= r0) goto L67
                int r0 = r0 - r9
                goto L68
            L67:
                int r0 = r0 + r9
            L68:
                r1 = 1
                goto L6c
            L6a:
                int r0 = r6.f3002
            L6c:
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ r8 = r8.f2993
                int r9 = r7.getTop()
                boolean r8 = r8.m3052(r0, r9)
                if (r8 == 0) goto L85
                com.google.android.material.behavior.SwipeDismissBehavior$〺つふすそ r8 = new com.google.android.material.behavior.SwipeDismissBehavior$〺つふすそ
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r8.<init>(r7, r1)
                p034.p035.p045.C1096.m2482(r7, r8)
                goto L8c
            L85:
                if (r1 == 0) goto L8c
                com.google.android.material.behavior.SwipeDismissBehavior r7 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r7.getClass()
            L8c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0396.mo470(android.view.View, float, float):void");
        }
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static float m1309(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: いいにぽつ */
    public boolean mo347(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f2990;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m333(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2990 = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2990 = false;
        }
        if (!z) {
            return false;
        }
        if (this.f2993 == null) {
            this.f2993 = new C1357(coordinatorLayout.getContext(), coordinatorLayout, this.f2991);
        }
        return this.f2993.m3057(motionEvent);
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean mo1310(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: びえぁぜい */
    public boolean mo364(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C1357 c1357 = this.f2993;
        if (c1357 == null) {
            return false;
        }
        c1357.m3064(motionEvent);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ぺふねづ〺 */
    public boolean mo369(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C1096.m2519(v) != 0) {
            return false;
        }
        C1096.m2505(v, 1);
        C1096.m2521(v, 1048576);
        if (!mo1310(v)) {
            return false;
        }
        C1096.m2502(v, C1084.C1087.f5558, null, new C2155(this));
        return false;
    }
}
