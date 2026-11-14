package dev.epro.r0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F2536022593991472888 extends Animatable2.AnimationCallback {
    public final /* synthetic */ Q8205248782310272441 a;

    public F2536022593991472888(Q8205248782310272441 q8205248782310272441) {
        this.a = q8205248782310272441;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.b.f584o;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        Y16323135829722613314 y16323135829722613314 = this.a.b;
        ColorStateList colorStateList = y16323135829722613314.f584o;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(y16323135829722613314.s, colorStateList.getDefaultColor()));
        }
    }
}
