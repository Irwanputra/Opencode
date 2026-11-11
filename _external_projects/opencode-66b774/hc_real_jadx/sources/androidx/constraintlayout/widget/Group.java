package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m298();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m298();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m298();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: おぐぴう〸ず */
    public void mo256(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f923.m3416(0);
        layoutParams.f923.m3421(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: てぜきぽく */
    public void mo252(AttributeSet attributeSet) {
        super.mo252(attributeSet);
    }
}
