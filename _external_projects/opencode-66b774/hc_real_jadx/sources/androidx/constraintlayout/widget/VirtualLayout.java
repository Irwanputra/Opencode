package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p034.p086.p087.p088.C1547;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f957;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f958;

    public VirtualLayout(Context context) {
        super(context);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f957 || this.f958) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f843; i++) {
                View m315 = constraintLayout.m315(this.f841[i]);
                if (m315 != null) {
                    if (this.f957) {
                        m315.setVisibility(visibility);
                    }
                    if (this.f958 && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
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
    public void setVisibility(int i) {
        super.setVisibility(i);
        m298();
    }

    /* renamed from: ごづごきえ */
    public void mo251(C1547 c1547, int i, int i2) {
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
                    this.f957 = true;
                } else if (index == C1575.ConstraintLayout_Layout_android_elevation) {
                    this.f958 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
