package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p131.p161.p162.p163.p191.C2345;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2954;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2345 f2955;

    public ViewOffsetBehavior() {
        this.f2954 = 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2954 = 0;
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean m1295(int i) {
        C2345 c2345 = this.f2955;
        if (c2345 != null) {
            return c2345.m4499(i);
        }
        this.f2954 = i;
        return false;
    }

    /* renamed from: どぇぞほだ */
    public void mo1293(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m340(v, i);
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int m1296() {
        C2345 c2345 = this.f2955;
        if (c2345 != null) {
            return c2345.f9640;
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ぺふねづ〺 */
    public boolean mo369(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo1293(coordinatorLayout, v, i);
        if (this.f2955 == null) {
            this.f2955 = new C2345(v);
        }
        C2345 c2345 = this.f2955;
        c2345.f9636 = c2345.f9638.getTop();
        c2345.f9637 = c2345.f9638.getLeft();
        this.f2955.m4500();
        int i2 = this.f2954;
        if (i2 == 0) {
            return true;
        }
        this.f2955.m4499(i2);
        this.f2954 = 0;
        return true;
    }
}
