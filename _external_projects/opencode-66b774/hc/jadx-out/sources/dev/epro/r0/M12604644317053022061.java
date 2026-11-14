package dev.epro.r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M12604644317053022061 extends Q6854864344654328121 {
    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // dev.epro.r0.Q6854864344654328121, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (S10823041268949770285.W(context.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, Q9005017131391967988.l);
            int iH = h(getContext(), typedArrayObtainStyledAttributes, 2, 4);
            typedArrayObtainStyledAttributes.recycle();
            if (iH >= 0) {
                setLineHeight(iH);
            }
        }
    }
}
