package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class AlertDialogLayout extends dev.epro.r0.W17553834374836380220 {
    public AlertDialogLayout(android.content.Context context) {
        super(context, (android.util.AttributeSet) null);
    }

    public static int i(android.view.View view) {
        java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return i(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r12 = r9.getPaddingTop()
            goto L43
        L30:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L43
        L39:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L43:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L4c
            r14 = r0
            goto L50
        L4c:
            int r14 = r14.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Lb0
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto Lad
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto Lad
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            dev.epro.r0.L2038580209622790010 r6 = (dev.epro.r0.L2038580209622790010) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L73
            r7 = r2
        L73:
            int r8 = r9.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L8d
            r8 = 5
            if (r7 == r8) goto L87
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L98
        L87:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
        L8b:
            int r7 = r7 - r8
            goto L98
        L8d:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
            goto L8b
        L98:
            boolean r8 = r9.h(r0)
            if (r8 == 0) goto L9f
            int r12 = r12 + r14
        L9f:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        Lad:
            int r0 = r0 + 1
            goto L50
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int i3;
        int measuredHeight;
        int measuredHeight2;
        ?? r0 = this;
        int childCount = r0.getChildCount();
        android.view.View view = null;
        android.view.View view2 = null;
        android.view.View view3 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View childAt = r0.getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == 2131296791) {
                    view = childAt;
                } else if (id == 2131296376) {
                    view2 = childAt;
                } else {
                    if ((id != 2131296407 && id != 2131296417) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i);
        int paddingBottom = r0.getPaddingBottom() + r0.getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i3 = i(view2);
            measuredHeight = view2.getMeasuredHeight() - i3;
            paddingBottom += i3;
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            i3 = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i5 = size - paddingBottom;
        if (view2 != null) {
            int i6 = paddingBottom - i3;
            int iMin = java.lang.Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                i3 += iMin;
            }
            view2.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            paddingBottom = i6 + view2.getMeasuredHeight();
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i5 > 0) {
            view3.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i5, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt2 = r0.getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                iMax = java.lang.Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i8 = i2;
        r0.setMeasuredDimension(android.view.View.resolveSizeAndState(r0.getPaddingRight() + r0.getPaddingLeft() + iMax, i, iCombineMeasuredStates), android.view.View.resolveSizeAndState(paddingBottom, i8, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(r0.getMeasuredWidth(), 1073741824);
            int i9 = 0;
            ?? r02 = r0;
            while (i9 < childCount) {
                android.view.View childAt3 = r02.getChildAt(i9);
                if (childAt3.getVisibility() != 8) {
                    dev.epro.r0.L2038580209622790010 layoutParams = childAt3.getLayoutParams();
                    if (((android.widget.LinearLayout.LayoutParams) layoutParams).width == -1) {
                        int i10 = ((android.widget.LinearLayout.LayoutParams) layoutParams).height;
                        ((android.widget.LinearLayout.LayoutParams) layoutParams).height = childAt3.getMeasuredHeight();
                        r02.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i8, 0);
                        ((android.widget.LinearLayout.LayoutParams) layoutParams).height = i10;
                    }
                }
                i9++;
                r02 = this;
                i8 = i2;
            }
        }
    }

    public AlertDialogLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
