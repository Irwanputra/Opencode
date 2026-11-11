package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import p034.p086.p087.p088.C1544;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public float f666;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f667;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f668;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public float f669;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public float f670;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public float f671;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public float f672;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public float f673;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public float f674;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public float f675;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f676;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f677;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public ConstraintLayout f678;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float f679;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f680;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public View[] f681;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f682;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f683;

    public Layer(Context context) {
        super(context);
        this.f667 = Float.NaN;
        this.f683 = Float.NaN;
        this.f676 = Float.NaN;
        this.f682 = 1.0f;
        this.f672 = 1.0f;
        this.f669 = Float.NaN;
        this.f671 = Float.NaN;
        this.f675 = Float.NaN;
        this.f679 = Float.NaN;
        this.f673 = Float.NaN;
        this.f674 = Float.NaN;
        this.f677 = true;
        this.f681 = null;
        this.f666 = 0.0f;
        this.f670 = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f667 = Float.NaN;
        this.f683 = Float.NaN;
        this.f676 = Float.NaN;
        this.f682 = 1.0f;
        this.f672 = 1.0f;
        this.f669 = Float.NaN;
        this.f671 = Float.NaN;
        this.f675 = Float.NaN;
        this.f679 = Float.NaN;
        this.f673 = Float.NaN;
        this.f674 = Float.NaN;
        this.f677 = true;
        this.f681 = null;
        this.f666 = 0.0f;
        this.f670 = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f667 = Float.NaN;
        this.f683 = Float.NaN;
        this.f676 = Float.NaN;
        this.f682 = 1.0f;
        this.f672 = 1.0f;
        this.f669 = Float.NaN;
        this.f671 = Float.NaN;
        this.f675 = Float.NaN;
        this.f679 = Float.NaN;
        this.f673 = Float.NaN;
        this.f674 = Float.NaN;
        this.f677 = true;
        this.f681 = null;
        this.f666 = 0.0f;
        this.f670 = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f678 = (ConstraintLayout) getParent();
        if (this.f668 || this.f680) {
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f843; i++) {
                View m315 = this.f678.m315(this.f841[i]);
                if (m315 != null) {
                    if (this.f668) {
                        m315.setVisibility(visibility);
                    }
                    if (this.f680 && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        m315.setTranslationZ(m315.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m298();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.f667 = f;
        m259();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f683 = f;
        m259();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f676 = f;
        m259();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f682 = f;
        m259();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f672 = f;
        m259();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.f666 = f;
        m259();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.f670 = f;
        m259();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m298();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void mo255(ConstraintLayout constraintLayout) {
        this.f678 = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f && Float.isNaN(this.f676)) {
            return;
        }
        this.f676 = rotation;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void mo256(ConstraintLayout constraintLayout) {
        m258();
        this.f669 = Float.NaN;
        this.f671 = Float.NaN;
        C1544 c1544 = ((ConstraintLayout.LayoutParams) getLayoutParams()).f923;
        c1544.m3416(0);
        c1544.m3421(0);
        m257();
        layout(((int) this.f673) - getPaddingLeft(), ((int) this.f674) - getPaddingTop(), getPaddingRight() + ((int) this.f675), getPaddingBottom() + ((int) this.f679));
        m259();
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m257() {
        if (this.f678 == null) {
            return;
        }
        if (this.f677 || Float.isNaN(this.f669) || Float.isNaN(this.f671)) {
            if (!Float.isNaN(this.f667) && !Float.isNaN(this.f683)) {
                this.f671 = this.f683;
                this.f669 = this.f667;
                return;
            }
            View[] m307 = m307(this.f678);
            int left = m307[0].getLeft();
            int top = m307[0].getTop();
            int right = m307[0].getRight();
            int bottom = m307[0].getBottom();
            for (int i = 0; i < this.f843; i++) {
                View view = m307[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f675 = right;
            this.f679 = bottom;
            this.f673 = left;
            this.f674 = top;
            this.f669 = Float.isNaN(this.f667) ? (left + right) / 2 : this.f667;
            this.f671 = Float.isNaN(this.f683) ? (top + bottom) / 2 : this.f683;
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final void m258() {
        int i;
        if (this.f678 == null || (i = this.f843) == 0) {
            return;
        }
        View[] viewArr = this.f681;
        if (viewArr == null || viewArr.length != i) {
            this.f681 = new View[i];
        }
        for (int i2 = 0; i2 < this.f843; i2++) {
            this.f681[i2] = this.f678.m315(this.f841[i2]);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: てぜきぽく */
    public void mo252(AttributeSet attributeSet) {
        super.mo252(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1575.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.ConstraintLayout_Layout_android_visibility) {
                    this.f668 = true;
                } else if (index == C1575.ConstraintLayout_Layout_android_elevation) {
                    this.f680 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final void m259() {
        if (this.f678 == null) {
            return;
        }
        if (this.f681 == null) {
            m258();
        }
        m257();
        double radians = Float.isNaN(this.f676) ? 0.0d : Math.toRadians(this.f676);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f = this.f682;
        float f2 = f * cos;
        float f3 = this.f672;
        float f4 = (-f3) * sin;
        float f5 = f * sin;
        float f6 = f3 * cos;
        for (int i = 0; i < this.f843; i++) {
            View view = this.f681[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.f669;
            float f8 = bottom - this.f671;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.f666;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.f670;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f672);
            view.setScaleX(this.f682);
            if (!Float.isNaN(this.f676)) {
                view.setRotation(this.f676);
            }
        }
    }
}
