package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.InterfaceC0112 {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f684;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f685;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public View[] f686;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f687;

    public MotionHelper(Context context) {
        super(context);
        this.f684 = false;
        this.f687 = false;
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f684 = false;
        this.f687 = false;
        mo252(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f684 = false;
        this.f687 = false;
        mo252(attributeSet);
    }

    public float getProgress() {
        return this.f685;
    }

    public void setProgress(float f) {
        this.f685 = f;
        int i = 0;
        if (this.f843 > 0) {
            this.f686 = m307((ConstraintLayout) getParent());
            while (i < this.f843) {
                setProgress(this.f686[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }

    public void setProgress(View view, float f) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0112
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo260(MotionLayout motionLayout, int i, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0112
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo261(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0112
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo262(MotionLayout motionLayout, int i, int i2, float f) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: てぜきぽく */
    public void mo252(AttributeSet attributeSet) {
        super.mo252(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1575.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.MotionHelper_onShow) {
                    this.f684 = obtainStyledAttributes.getBoolean(index, this.f684);
                } else if (index == C1575.MotionHelper_onHide) {
                    this.f687 = obtainStyledAttributes.getBoolean(index, this.f687);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0112
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo263(MotionLayout motionLayout, int i) {
    }
}
