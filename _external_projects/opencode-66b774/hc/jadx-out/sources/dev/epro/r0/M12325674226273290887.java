package dev.epro.r0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M12325674226273290887 extends O4306341475499457020 {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public M12325674226273290887(Context context, AttributeSet attributeSet) {
        super(Q3181834110876746778.V(context, attributeSet, net.zetetic.database.R.attr.radioButtonStyle, net.zetetic.database.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]), attributeSet);
        Context context2 = getContext();
        Q13169198992966610970.M(context2, attributeSet, net.zetetic.database.R.attr.radioButtonStyle, net.zetetic.database.R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        int[] iArr = Q9005017131391967988.i;
        Q13169198992966610970.N(context2, attributeSet, iArr, net.zetetic.database.R.attr.radioButtonStyle, net.zetetic.database.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, net.zetetic.database.R.attr.radioButtonStyle, net.zetetic.database.R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setButtonTintList(T18016951143603335921.G(context2, typedArrayObtainStyledAttributes, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setRippleColor(T18016951143603335921.G(context2, typedArrayObtainStyledAttributes, 1));
        }
        this.f = typedArrayObtainStyledAttributes.getBoolean(2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iZ = E12775674050813925581.z(this, net.zetetic.database.R.attr.colorControlActivated);
        int iZ2 = E12775674050813925581.z(this, net.zetetic.database.R.attr.colorOnSurface);
        int iZ3 = E12775674050813925581.z(this, net.zetetic.database.R.attr.colorSurface);
        ColorStateList colorStateList2 = new ColorStateList(g, new int[]{E12775674050813925581.F(1.0f, iZ3, iZ), E12775674050813925581.F(0.54f, iZ3, iZ2), E12775674050813925581.F(0.38f, iZ3, iZ2), E12775674050813925581.F(0.38f, iZ3, iZ2)});
        this.e = colorStateList2;
        return colorStateList2;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
