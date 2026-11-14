package dev.epro.r0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P536697688222291964 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public P536697688222291964(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        R14609119592937689706 r14609119592937689706 = new R14609119592937689706();
        r14609119592937689706.a = (VectorDrawable) this.a.newDrawable();
        return r14609119592937689706;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        R14609119592937689706 r14609119592937689706 = new R14609119592937689706();
        r14609119592937689706.a = (VectorDrawable) this.a.newDrawable(resources);
        return r14609119592937689706;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        R14609119592937689706 r14609119592937689706 = new R14609119592937689706();
        r14609119592937689706.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return r14609119592937689706;
    }
}
