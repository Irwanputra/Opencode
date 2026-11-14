package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C3036442763540539737 {
    public android.content.res.ColorStateList a = null;
    public android.graphics.PorterDuff.Mode b = null;
    public boolean c = false;
    public boolean d = false;
    public boolean e;
    public final android.widget.TextView f;

    public void a() {
        android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) this.f;
        android.graphics.drawable.Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                android.graphics.drawable.Drawable drawableMutate = buttonDrawable.mutate();
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
        dev.epro.r0.Q4556812619972923007 q4556812619972923007 = this.f;
        android.graphics.drawable.Drawable checkMarkDrawable = q4556812619972923007.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                android.graphics.drawable.Drawable drawableMutate = checkMarkDrawable.mutate();
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

    public void c(android.util.AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) this.f;
        android.content.Context context = compoundButton.getContext();
        int[] iArr = dev.epro.r0.Y17304307076558258116.m;
        dev.epro.r0.I1632105416032993715 i1632105416032993715T = dev.epro.r0.I1632105416032993715.t(context, attributeSet, iArr, i);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) i1632105416032993715T.c;
        dev.epro.r0.W10240872260424387225.i(compoundButton, compoundButton.getContext(), iArr, attributeSet, (android.content.res.TypedArray) i1632105416032993715T.c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(dev.epro.r0.M9216324016624295870.G(compoundButton.getContext(), resourceId2));
                } catch (android.content.res.Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(dev.epro.r0.M9216324016624295870.G(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(dev.epro.r0.M9216324016624295870.G(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(i1632105416032993715T.f(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(dev.epro.r0.T11496100853119631009.b(typedArray.getInt(3, -1), (android.graphics.PorterDuff.Mode) null));
            }
            i1632105416032993715T.v();
        } catch (java.lang.Throwable th) {
            i1632105416032993715T.v();
            throw th;
        }
    }
}
