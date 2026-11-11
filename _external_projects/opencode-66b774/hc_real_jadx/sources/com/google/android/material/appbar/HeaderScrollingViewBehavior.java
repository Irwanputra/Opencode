package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p034.p035.p045.C1072;
import p034.p035.p045.C1096;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Rect f2949;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2950;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f2951;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Rect f2952;

    public HeaderScrollingViewBehavior() {
        this.f2949 = new Rect();
        this.f2952 = new Rect();
        this.f2950 = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2949 = new Rect();
        this.f2952 = new Rect();
        this.f2950 = 0;
    }

    /* renamed from: ぉひのべい */
    public float mo1280(View view) {
        return 1.0f;
    }

    /* renamed from: じぜこほぱ */
    public abstract View mo1281(List<View> list);

    /* renamed from: せづっ〸ちね */
    public int mo1282(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: てぜきぽく */
    public boolean mo359(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo1281;
        C1072 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (mo1281 = mo1281(coordinatorLayout.m331(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C1096.m2512(mo1281) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m2420() + lastWindowInsets.m2424();
        }
        coordinatorLayout.m324(view, i, i2, View.MeasureSpec.makeMeasureSpec((mo1282(mo1281) + size) - mo1281.getMeasuredHeight(), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public void mo1293(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View mo1281 = mo1281(coordinatorLayout.m331(view));
        if (mo1281 != null) {
            CoordinatorLayout.C0133 c0133 = (CoordinatorLayout.C0133) view.getLayoutParams();
            Rect rect = this.f2949;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0133).leftMargin, mo1281.getBottom() + ((ViewGroup.MarginLayoutParams) c0133).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0133).rightMargin, ((mo1281.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0133).bottomMargin);
            C1072 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C1096.m2512(coordinatorLayout) && !C1096.m2512(view)) {
                rect.left = lastWindowInsets.m2422() + rect.left;
                rect.right -= lastWindowInsets.m2426();
            }
            Rect rect2 = this.f2952;
            int i3 = c0133.f993;
            int i4 = i3 == 0 ? 8388659 : i3;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (Build.VERSION.SDK_INT >= 17) {
                Gravity.apply(i4, measuredWidth, measuredHeight, rect, rect2, i);
            } else {
                Gravity.apply(i4, measuredWidth, measuredHeight, rect, rect2);
            }
            int m1294 = m1294(mo1281);
            view.layout(rect2.left, rect2.top - m1294, rect2.right, rect2.bottom - m1294);
            i2 = rect2.top - mo1281.getBottom();
        } else {
            coordinatorLayout.m340(view, i);
            i2 = 0;
        }
        this.f2950 = i2;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final int m1294(View view) {
        if (this.f2951 == 0) {
            return 0;
        }
        float mo1280 = mo1280(view);
        int i = this.f2951;
        return C2786.m4812((int) (mo1280 * i), 0, i);
    }
}
