package dev.epro.r0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H1116075490871970444 extends MultiAutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};
    public final G6575252167976303972 a;
    public final L11832743611999248019 b;
    public final W8455343525638953052 c;

    public H1116075490871970444(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, net.zetetic.database.R.attr.autoCompleteTextViewStyle);
        X170853990943489827.a(this, getContext());
        I1632105416032993715 i1632105416032993715T = I1632105416032993715.t(getContext(), attributeSet, d, net.zetetic.database.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) i1632105416032993715T.c).hasValue(0)) {
            setDropDownBackgroundDrawable(i1632105416032993715T.g(0));
        }
        i1632105416032993715T.v();
        G6575252167976303972 g6575252167976303972 = new G6575252167976303972(this);
        this.a = g6575252167976303972;
        g6575252167976303972.f(attributeSet, net.zetetic.database.R.attr.autoCompleteTextViewStyle);
        L11832743611999248019 l11832743611999248019 = new L11832743611999248019(this);
        this.b = l11832743611999248019;
        l11832743611999248019.h(attributeSet, net.zetetic.database.R.attr.autoCompleteTextViewStyle);
        l11832743611999248019.b();
        W8455343525638953052 w8455343525638953052 = new W8455343525638953052((EditText) this, (byte) 8);
        this.c = w8455343525638953052;
        w8455343525638953052.E(attributeSet, net.zetetic.database.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerC = w8455343525638953052.C(keyListener);
        if (keyListenerC == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerC);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.b();
        }
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.g();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        I3887072968740112330.F(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.c.H(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.i(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(M9216324016624295870.G(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.M(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.C(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.m(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        L11832743611999248019 l11832743611999248019 = this.b;
        l11832743611999248019.m(colorStateList);
        l11832743611999248019.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        L11832743611999248019 l11832743611999248019 = this.b;
        l11832743611999248019.n(mode);
        l11832743611999248019.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.i(context, i);
        }
    }
}
