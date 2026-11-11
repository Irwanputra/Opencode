package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import p034.p086.p087.p088.C1519;
import p034.p086.p087.p088.C1520;
import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.C1546;
import p034.p086.p090.C1566;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f837;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1519 f838;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f839;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public int getMargin() {
        return this.f838.f7013;
    }

    public int getType() {
        return this.f837;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f838.f7015 = z;
    }

    public void setDpMargin(int i) {
        this.f838.f7013 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f838.f7013 = i;
    }

    public void setType(int i) {
        this.f837 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0013, code lost:
    
        if (r7 == 6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001f, code lost:
    
        if (r7 == 6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
    
        if (r7 == 6) goto L12;
     */
    /* renamed from: ごづごきえ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m297(p034.p086.p087.p088.C1544 r6, int r7, boolean r8) {
        /*
            r5 = this;
            r5.f839 = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            r4 = 17
            if (r7 >= r4) goto L16
            int r7 = r5.f837
            if (r7 != r3) goto L13
        L10:
            r5.f839 = r1
            goto L28
        L13:
            if (r7 != r2) goto L28
        L15:
            goto L1c
        L16:
            int r7 = r5.f837
            if (r8 == 0) goto L22
            if (r7 != r3) goto L1f
        L1c:
            r5.f839 = r0
            goto L28
        L1f:
            if (r7 != r2) goto L28
            goto L10
        L22:
            if (r7 != r3) goto L25
            goto L10
        L25:
            if (r7 != r2) goto L28
            goto L15
        L28:
            boolean r7 = r6 instanceof p034.p086.p087.p088.C1519
            if (r7 == 0) goto L32
            づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.げつ〴ぬぐ r6 = (p034.p086.p087.p088.C1519) r6
            int r7 = r5.f839
            r6.f7012 = r7
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.m297(づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.びぐびあび, int, boolean):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: てぜきぽく */
    public void mo252(AttributeSet attributeSet) {
        super.mo252(attributeSet);
        this.f838 = new C1519();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1575.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C1575.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f838.f7015 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == C1575.ConstraintLayout_Layout_barrierMargin) {
                    this.f838.f7013 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f844 = this.f838;
        m305();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: のぷのちつ */
    public void mo253(C1566.C1569 c1569, C1546 c1546, ConstraintLayout.LayoutParams layoutParams, SparseArray<C1544> sparseArray) {
        super.mo253(c1569, c1546, layoutParams, sparseArray);
        if (c1546 instanceof C1519) {
            C1519 c1519 = (C1519) c1546;
            m297(c1519, c1569.f7427.f7387, ((C1520) c1546.f7203).f7024);
            C1566.C1567 c1567 = c1569.f7427;
            c1519.f7015 = c1567.f7400;
            c1519.f7013 = c1567.f7372;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: へぬ〴づぞ */
    public void mo254(C1544 c1544, boolean z) {
        m297(c1544, this.f837, z);
    }
}
