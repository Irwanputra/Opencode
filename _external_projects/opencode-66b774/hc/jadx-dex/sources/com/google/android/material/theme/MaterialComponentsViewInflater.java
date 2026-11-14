package com.google.android.material.theme;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class MaterialComponentsViewInflater extends dev.epro.r0.U5561144831620908833 {
    public final dev.epro.r0.S15286651319405213936 a(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new dev.epro.r0.E13336915040001677500(context, attributeSet);
    }

    public final dev.epro.r0.R2997011295864497150 b(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new dev.epro.r0.Y5360590127176187529(context, attributeSet);
    }

    public final dev.epro.r0.Y14832840975702795122 c(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new dev.epro.r0.Y16323135829722613314(context, attributeSet);
    }

    public final dev.epro.r0.O4306341475499457020 d(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new dev.epro.r0.M12325674226273290887(context, attributeSet);
    }

    public final dev.epro.r0.Q6854864344654328121 e(android.content.Context context, android.util.AttributeSet attributeSet) {
        dev.epro.r0.M12604644317053022061 m12604644317053022061 = new dev.epro.r0.M12604644317053022061(dev.epro.r0.Q3181834110876746778.V(context, attributeSet, android.R.attr.textViewStyle, 0, new int[0]), attributeSet, android.R.attr.textViewStyle);
        android.content.Context context2 = m12604644317053022061.getContext();
        if (dev.epro.r0.S10823041268949770285.W(context2.getTheme(), 2130969904, true)) {
            android.content.res.Resources.Theme theme = context2.getTheme();
            int[] iArr = dev.epro.r0.Q9005017131391967988.m;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iH = dev.epro.r0.M12604644317053022061.h(context2, typedArrayObtainStyledAttributes, new int[]{1, 2});
            typedArrayObtainStyledAttributes.recycle();
            if (iH == -1) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    android.content.res.TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, dev.epro.r0.Q9005017131391967988.l);
                    int iH2 = dev.epro.r0.M12604644317053022061.h(m12604644317053022061.getContext(), typedArrayObtainStyledAttributes3, new int[]{2, 4});
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
