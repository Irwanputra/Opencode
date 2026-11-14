package dev.epro.r0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O11248608044091861502 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public O11248608044091861502(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        I5811816837469502949 i5811816837469502949 = new I5811816837469502949(null);
        Drawable newDrawable = this.a.newDrawable();
        i5811816837469502949.a = newDrawable;
        newDrawable.setCallback(i5811816837469502949.f);
        return i5811816837469502949;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        I5811816837469502949 i5811816837469502949 = new I5811816837469502949(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        i5811816837469502949.a = newDrawable;
        newDrawable.setCallback(i5811816837469502949.f);
        return i5811816837469502949;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        I5811816837469502949 i5811816837469502949 = new I5811816837469502949(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        i5811816837469502949.a = newDrawable;
        newDrawable.setCallback(i5811816837469502949.f);
        return i5811816837469502949;
    }
}
