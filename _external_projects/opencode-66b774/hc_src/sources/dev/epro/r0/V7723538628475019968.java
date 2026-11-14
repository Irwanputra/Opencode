package dev.epro.r0;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class V7723538628475019968 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public R4640732916975281784 e;
    public R4640732916975281784 f;
    public boolean g;
    public int h;
    public final int[] i = new int[2];

    public V7723538628475019968(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        R4640732916975281784 r4640732916975281784 = this.f;
        View view = this.d;
        if (r4640732916975281784 != null) {
            view.removeCallbacks(r4640732916975281784);
        }
        R4640732916975281784 r46407329169752817842 = this.e;
        if (r46407329169752817842 != null) {
            view.removeCallbacks(r46407329169752817842);
        }
    }

    public abstract Y1226494281320458288 b();

    public abstract boolean c();

    public boolean d() {
        Y1226494281320458288 b = b();
        if (b == null || !b.b()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V7723538628475019968.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.h = -1;
        R4640732916975281784 r4640732916975281784 = this.e;
        if (r4640732916975281784 != null) {
            this.d.removeCallbacks(r4640732916975281784);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
