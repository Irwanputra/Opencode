package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import p034.p086.p087.p088.C1522;
import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.C1546;
import p034.p086.p087.p088.C1547;
import p034.p086.p090.C1566;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Flow extends VirtualLayout {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1522 f665;

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo251(this.f665, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f665.f7052 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f665.f7043 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f665.f7038 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f665.f7056 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f665.f7041 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f665.f7040 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f665.f7045 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f665.f7055 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f665.f7044 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f665.f7057 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C1522 c1522 = this.f665;
        c1522.f7246 = i;
        c1522.f7251 = i;
        c1522.f7247 = i;
        c1522.f7250 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f665.f7251 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f665.f7253 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f665.f7248 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f665.f7246 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f665.f7054 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f665.f7046 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f665.f7037 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f665.f7058 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f665.f7049 = i;
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void mo251(C1547 c1547, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c1547 == null) {
            setMeasuredDimension(0, 0);
        } else {
            c1547.mo3356(mode, size, mode2, size2);
            setMeasuredDimension(c1547.f7252, c1547.f7254);
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void mo252(AttributeSet attributeSet) {
        super.mo252(attributeSet);
        this.f665 = new C1522();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1575.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.ConstraintLayout_Layout_android_orientation) {
                    this.f665.f7057 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_android_padding) {
                    C1522 c1522 = this.f665;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1522.f7246 = dimensionPixelSize;
                    c1522.f7251 = dimensionPixelSize;
                    c1522.f7247 = dimensionPixelSize;
                    c1522.f7250 = dimensionPixelSize;
                } else if (index == C1575.ConstraintLayout_Layout_android_paddingStart) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        C1522 c15222 = this.f665;
                        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        c15222.f7247 = dimensionPixelSize2;
                        c15222.f7253 = dimensionPixelSize2;
                        c15222.f7248 = dimensionPixelSize2;
                    }
                } else if (index == C1575.ConstraintLayout_Layout_android_paddingEnd) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.f665.f7250 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    }
                } else if (index == C1575.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f665.f7253 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_android_paddingTop) {
                    this.f665.f7246 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_android_paddingRight) {
                    this.f665.f7248 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f665.f7251 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f665.f7049 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f665.f7055 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f665.f7058 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f665.f7043 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f665.f7042 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f665.f7056 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f665.f7036 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f665.f7040 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1575.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f665.f7052 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1575.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f665.f7053 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1575.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f665.f7038 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1575.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f665.f7059 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1575.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f665.f7046 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1575.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f665.f7041 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == C1575.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f665.f7054 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == C1575.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f665.f7045 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f665.f7037 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1575.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f665.f7044 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f844 = this.f665;
        m305();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void mo253(C1566.C1569 c1569, C1546 c1546, ConstraintLayout.LayoutParams layoutParams, SparseArray<C1544> sparseArray) {
        super.mo253(c1569, c1546, layoutParams, sparseArray);
        if (c1546 instanceof C1522) {
            C1522 c1522 = (C1522) c1546;
            int i = layoutParams.f905;
            if (i != -1) {
                c1522.f7057 = i;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void mo254(C1544 c1544, boolean z) {
        C1522 c1522 = this.f665;
        int i = c1522.f7247;
        if (i > 0 || c1522.f7250 > 0) {
            if (z) {
                c1522.f7253 = c1522.f7250;
                c1522.f7248 = i;
            } else {
                c1522.f7253 = i;
                c1522.f7248 = c1522.f7250;
            }
        }
    }
}
