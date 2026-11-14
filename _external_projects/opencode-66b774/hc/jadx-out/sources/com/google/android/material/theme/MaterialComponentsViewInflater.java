package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import dev.epro.r0.E13336915040001677500;
import dev.epro.r0.M12325674226273290887;
import dev.epro.r0.M12604644317053022061;
import dev.epro.r0.O4306341475499457020;
import dev.epro.r0.Q3181834110876746778;
import dev.epro.r0.Q6854864344654328121;
import dev.epro.r0.Q9005017131391967988;
import dev.epro.r0.R2997011295864497150;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S15286651319405213936;
import dev.epro.r0.U5561144831620908833;
import dev.epro.r0.Y14832840975702795122;
import dev.epro.r0.Y16323135829722613314;
import dev.epro.r0.Y5360590127176187529;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends U5561144831620908833 {
    @Override // dev.epro.r0.U5561144831620908833
    public final S15286651319405213936 a(Context context, AttributeSet attributeSet) {
        return new E13336915040001677500(context, attributeSet);
    }

    @Override // dev.epro.r0.U5561144831620908833
    public final R2997011295864497150 b(Context context, AttributeSet attributeSet) {
        return new Y5360590127176187529(context, attributeSet);
    }

    @Override // dev.epro.r0.U5561144831620908833
    public final Y14832840975702795122 c(Context context, AttributeSet attributeSet) {
        return new Y16323135829722613314(context, attributeSet);
    }

    @Override // dev.epro.r0.U5561144831620908833
    public final O4306341475499457020 d(Context context, AttributeSet attributeSet) {
        return new M12325674226273290887(context, attributeSet);
    }

    @Override // dev.epro.r0.U5561144831620908833
    public final Q6854864344654328121 e(Context context, AttributeSet attributeSet) {
        M12604644317053022061 m12604644317053022061 = new M12604644317053022061(Q3181834110876746778.V(context, attributeSet, R.attr.textViewStyle, 0, new int[0]), attributeSet, R.attr.textViewStyle);
        Context context2 = m12604644317053022061.getContext();
        if (S10823041268949770285.W(context2.getTheme(), net.zetetic.database.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = Q9005017131391967988.m;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iH = M12604644317053022061.h(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iH == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, Q9005017131391967988.l);
                    int iH2 = M12604644317053022061.h(m12604644317053022061.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iH2 >= 0) {
                        m12604644317053022061.setLineHeight(iH2);
                    }
                }
            }
        }
        return m12604644317053022061;
    }
}
