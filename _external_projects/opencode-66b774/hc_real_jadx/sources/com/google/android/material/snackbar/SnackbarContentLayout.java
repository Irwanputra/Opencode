package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2248;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public TextView f3431;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Button f3432;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f3433;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f3434;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2243.SnackbarLayout);
        this.f3434 = obtainStyledAttributes.getDimensionPixelSize(C2243.SnackbarLayout_android_maxWidth, -1);
        this.f3433 = obtainStyledAttributes.getDimensionPixelSize(C2243.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    public Button getActionView() {
        return this.f3432;
    }

    public TextView getMessageView() {
        return this.f3431;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3431 = (TextView) findViewById(C2248.snackbar_text);
        this.f3432 = (Button) findViewById(C2248.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (m1470(1, r0, r0 - r1) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (m1470(0, r0, r0) != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f3434
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f3434
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p131.p161.p162.p163.C2324.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p131.p161.p162.p163.C2324.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f3431
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f3433
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f3432
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f3433
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.m1470(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.m1470(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f3433 = i;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean m1470(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f3431.getPaddingTop() == i2 && this.f3431.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f3431;
        AtomicInteger atomicInteger = C1096.f5578;
        int i4 = Build.VERSION.SDK_INT;
        if (!(i4 >= 17 ? textView.isPaddingRelative() : false)) {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
            return true;
        }
        int m2513 = C1096.m2513(textView);
        int m2500 = C1096.m2500(textView);
        if (i4 >= 17) {
            textView.setPaddingRelative(m2513, i2, m2500, i3);
            return true;
        }
        textView.setPadding(m2513, i2, m2500, i3);
        return true;
    }
}
