package dev.epro.r0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U2622488099009331968 extends Drawable.ConstantState {
    public int a;
    public E10821722077969840898 b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new R14609119592937689706(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new R14609119592937689706(this);
    }
}
