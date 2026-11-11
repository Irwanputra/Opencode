package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p034.p035.p045.C1096;
import p131.p161.p162.p163.C2229;
import p131.p161.p162.p163.p186.C2291;
import p131.p161.p162.p163.p186.C2298;

@Deprecated
/* loaded from: /tmp/opencode/hc_real.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Map<View, Integer> f3650;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: どぇぞほだ */
    public boolean mo1552(View view, View view2, boolean z, boolean z2) {
        int intValue;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f3650 = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0133) && (((CoordinatorLayout.C0133) childAt.getLayoutParams()).f994 instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.f3650;
                        intValue = (map != null && map.containsKey(childAt)) ? this.f3650.get(childAt).intValue() : 4;
                    } else if (Build.VERSION.SDK_INT >= 16) {
                        this.f3650.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    C1096.m2505(childAt, intValue);
                }
            }
            if (!z) {
                this.f3650 = null;
            }
        }
        super.mo1552(view, view2, z, z2);
        return true;
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: ながふずは */
    public FabTransformationBehavior.C0485 mo1564(Context context, boolean z) {
        int i = z ? C2229.mtrl_fab_transformation_sheet_expand_spec : C2229.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C0485 c0485 = new FabTransformationBehavior.C0485();
        c0485.f3642 = C2291.m4449(context, i);
        c0485.f3641 = new C2298(17, 0.0f, 0.0f);
        return c0485;
    }
}
