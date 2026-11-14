package dev.epro.r0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M17822984967589214345 extends ViewGroup {
    public final HashMap a;
    public final HashMap b;

    public M17822984967589214345(Context context) {
        super(context);
        setClipChildren(false);
        this.a = new HashMap();
        this.b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<N5230833122018532994, H11725168162114556860> getHolderToLayoutNode() {
        return this.a;
    }

    public final HashMap<H11725168162114556860, N5230833122018532994> getLayoutNodeToHolder() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (N5230833122018532994 n5230833122018532994 : this.a.keySet()) {
            n5230833122018532994.layout(n5230833122018532994.getLeft(), n5230833122018532994.getTop(), n5230833122018532994.getRight(), n5230833122018532994.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            P753981624812481271.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            P753981624812481271.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (N5230833122018532994 n5230833122018532994 : this.a.keySet()) {
            int i4 = n5230833122018532994.v;
            if (i4 != Integer.MIN_VALUE && (i3 = n5230833122018532994.w) != Integer.MIN_VALUE) {
                n5230833122018532994.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            H11725168162114556860 h11725168162114556860 = (H11725168162114556860) this.a.get(childAt);
            if (childAt.isLayoutRequested() && h11725168162114556860 != null) {
                H11725168162114556860.W(h11725168162114556860, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
