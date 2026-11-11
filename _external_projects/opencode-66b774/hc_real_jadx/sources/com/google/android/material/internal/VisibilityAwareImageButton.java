package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: /tmp/opencode/hc_real.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f3348;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3348 = getVisibility();
    }

    public final int getUserSetVisibility() {
        return this.f3348;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f3348 = i;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1445(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f3348 = i;
        }
    }
}
