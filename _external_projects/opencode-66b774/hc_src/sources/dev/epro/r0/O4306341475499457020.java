package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class O4306341475499457020 extends RadioButton implements Q2076630746492886922 {
    public final C3036442763540539737 a;
    public final G6575252167976303972 b;
    public final L11832743611999248019 c;
    public S8418098248327900568 d;

    public O4306341475499457020(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        X170853990943489827.a(this, getContext());
        C3036442763540539737 c3036442763540539737 = new C3036442763540539737(this);
        this.a = c3036442763540539737;
        c3036442763540539737.c(attributeSet, R.attr.radioButtonStyle);
        G6575252167976303972 g6575252167976303972 = new G6575252167976303972(this);
        this.b = g6575252167976303972;
        g6575252167976303972.f(attributeSet, R.attr.radioButtonStyle);
        L11832743611999248019 l11832743611999248019 = new L11832743611999248019(this);
        this.c = l11832743611999248019;
        l11832743611999248019.h(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private S8418098248327900568 getEmojiTextViewHelper() {
        S8418098248327900568 s8418098248327900568 = this.d;
        if (s8418098248327900568 != null) {
            return s8418098248327900568;
        }
        S8418098248327900568 s84180982483279005682 = new S8418098248327900568(this);
        this.d = s84180982483279005682;
        return s84180982483279005682;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            g6575252167976303972.b();
        }
        L11832743611999248019 l11832743611999248019 = this.c;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.e();
        }
        return null;
    }

    @Override // dev.epro.r0.Q2076630746492886922
    public ColorStateList getSupportButtonTintList() {
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            return c3036442763540539737.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            return c3036442763540539737.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.g();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            g6575252167976303972.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            g6575252167976303972.i(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            if (c3036442763540539737.e) {
                c3036442763540539737.e = false;
            } else {
                c3036442763540539737.e = true;
                c3036442763540539737.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        L11832743611999248019 l11832743611999248019 = this.c;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        L11832743611999248019 l11832743611999248019 = this.c;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((U16229988784104357932) getEmojiTextViewHelper().b.b).G(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            g6575252167976303972.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            g6575252167976303972.m(mode);
        }
    }

    @Override // dev.epro.r0.Q2076630746492886922
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            c3036442763540539737.a = colorStateList;
            c3036442763540539737.c = true;
            c3036442763540539737.a();
        }
    }

    @Override // dev.epro.r0.Q2076630746492886922
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            c3036442763540539737.b = mode;
            c3036442763540539737.d = true;
            c3036442763540539737.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        L11832743611999248019 l11832743611999248019 = this.c;
        l11832743611999248019.m(colorStateList);
        l11832743611999248019.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        L11832743611999248019 l11832743611999248019 = this.c;
        l11832743611999248019.n(mode);
        l11832743611999248019.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(M9216324016624295870.G(getContext(), i));
    }
}
