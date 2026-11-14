package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R5155493920167969557 extends W8455343525638953052 {
    public final O16724885495886488743 e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;

    public R5155493920167969557(O16724885495886488743 o16724885495886488743) {
        super((Object) o16724885495886488743, (byte) 1);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.e = o16724885495886488743;
    }

    @Override // dev.epro.r0.W8455343525638953052
    public final void E(AttributeSet attributeSet, int i) {
        super.E(attributeSet, R.attr.seekBarStyle);
        O16724885495886488743 o16724885495886488743 = this.e;
        Context context = o16724885495886488743.getContext();
        int[] iArr = Y17304307076558258116.g;
        I1632105416032993715 i1632105416032993715T = I1632105416032993715.t(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) i1632105416032993715T.c;
        W10240872260424387225.i(o16724885495886488743, o16724885495886488743.getContext(), iArr, attributeSet, (TypedArray) i1632105416032993715T.c, R.attr.seekBarStyle);
        Drawable drawableI = i1632105416032993715T.i(0);
        if (drawableI != null) {
            o16724885495886488743.setThumb(drawableI);
        }
        Drawable drawableG = i1632105416032993715T.g(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(o16724885495886488743);
            drawableG.setLayoutDirection(o16724885495886488743.getLayoutDirection());
            if (drawableG.isStateful()) {
                drawableG.setState(o16724885495886488743.getDrawableState());
            }
            Q();
        }
        o16724885495886488743.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = T11496100853119631009.b(typedArray.getInt(3, -1), this.h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = i1632105416032993715T.f(2);
            this.i = true;
        }
        i1632105416032993715T.v();
        Q();
    }

    public final void Q() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.i) {
                    drawableMutate.setTintList(this.g);
                }
                if (this.j) {
                    this.f.setTintMode(this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void R(Canvas canvas) {
        if (this.f != null) {
            int max = this.e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f.getIntrinsicWidth();
                int intrinsicHeight = this.f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
