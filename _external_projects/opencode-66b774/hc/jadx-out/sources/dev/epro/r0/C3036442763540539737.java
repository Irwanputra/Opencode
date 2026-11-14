package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C3036442763540539737 {
    public ColorStateList a = null;
    public PorterDuff.Mode b = null;
    public boolean c = false;
    public boolean d = false;
    public boolean e;
    public final TextView f;

    public /* synthetic */ C3036442763540539737(TextView textView) {
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.c) {
                    drawableMutate.setTintList(this.a);
                }
                if (this.d) {
                    drawableMutate.setTintMode(this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        Q4556812619972923007 q4556812619972923007 = (Q4556812619972923007) this.f;
        Drawable checkMarkDrawable = q4556812619972923007.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.c) {
                    drawableMutate.setTintList(this.a);
                }
                if (this.d) {
                    drawableMutate.setTintMode(this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(q4556812619972923007.getDrawableState());
                }
                q4556812619972923007.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = Y17304307076558258116.m;
        I1632105416032993715 i1632105416032993715T = I1632105416032993715.t(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i1632105416032993715T.c;
        W10240872260424387225.i(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) i1632105416032993715T.c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(M9216324016624295870.G(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(M9216324016624295870.G(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(M9216324016624295870.G(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(i1632105416032993715T.f(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(T11496100853119631009.b(typedArray.getInt(3, -1), null));
            }
            i1632105416032993715T.v();
        } catch (Throwable th) {
            i1632105416032993715T.v();
            throw th;
        }
    }
}
