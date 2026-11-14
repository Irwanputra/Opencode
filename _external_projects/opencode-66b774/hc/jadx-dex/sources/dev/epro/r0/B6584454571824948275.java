package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B6584454571824948275 extends android.widget.EditText {
    public final dev.epro.r0.G6575252167976303972 a;
    public final dev.epro.r0.L11832743611999248019 b;
    public final dev.epro.r0.W8455343525638953052 c;
    public final dev.epro.r0.E10092413133274766026 d;
    public final dev.epro.r0.W8455343525638953052 e;
    public dev.epro.r0.B3791064085091226287 f;
    public dev.epro.r0.Q3692367166080252660 g;

    public B6584454571824948275(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130969040);
        dev.epro.r0.X170853990943489827.a(this, getContext());
        dev.epro.r0.G6575252167976303972 g6575252167976303972 = new dev.epro.r0.G6575252167976303972(this);
        this.a = g6575252167976303972;
        g6575252167976303972.f(attributeSet, 2130969040);
        dev.epro.r0.L11832743611999248019 l11832743611999248019 = new dev.epro.r0.L11832743611999248019(this);
        this.b = l11832743611999248019;
        l11832743611999248019.h(attributeSet, 2130969040);
        l11832743611999248019.b();
        dev.epro.r0.W8455343525638953052 w8455343525638953052 = new dev.epro.r0.W8455343525638953052((byte) 9, false);
        w8455343525638953052.b = this;
        this.c = w8455343525638953052;
        this.d = new dev.epro.r0.E10092413133274766026();
        dev.epro.r0.W8455343525638953052 w84553435256389530522 = new dev.epro.r0.W8455343525638953052(this, (byte) 8);
        this.e = w84553435256389530522;
        w84553435256389530522.E(attributeSet, 2130969040);
        android.text.method.KeyListener keyListener = getKeyListener();
        if (keyListener instanceof android.text.method.NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        android.text.method.KeyListener keyListenerC = w84553435256389530522.C(keyListener);
        if (keyListenerC == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerC);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private dev.epro.r0.B3791064085091226287 getSuperCaller() {
        dev.epro.r0.B3791064085091226287 b3791064085091226287 = this.f;
        if (b3791064085091226287 != null) {
            return b3791064085091226287;
        }
        dev.epro.r0.B3791064085091226287 b37910640850912262872 = new dev.epro.r0.B3791064085091226287(this);
        this.f = b37910640850912262872;
        return b37910640850912262872;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        dev.epro.r0.G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.b();
        }
        dev.epro.r0.L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return dev.epro.r0.M17147082063200071302.O(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public java.lang.String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public dev.epro.r0.Q3692367166080252660 getFontVariationSettingsManager() {
        dev.epro.r0.Q3692367166080252660 q3692367166080252660 = this.g;
        if (q3692367166080252660 != null) {
            return q3692367166080252660;
        }
        dev.epro.r0.Q3692367166080252660 q36923671660802526602 = new dev.epro.r0.Q3692367166080252660(this, new dev.epro.r0.L11392556274289219196(this, (byte) 1));
        this.g = q36923671660802526602;
        return q36923671660802526602;
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        dev.epro.r0.G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        dev.epro.r0.G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.e();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.f();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.g();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
        return android.os.Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        dev.epro.r0.W8455343525638953052 w8455343525638953052;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (w8455343525638953052 = this.c) == null) {
            return super.getTextClassifier();
        }
        android.view.textclassifier.TextClassifier textClassifier = (android.view.textclassifier.TextClassifier) w8455343525638953052.c;
        return textClassifier == null ? dev.epro.r0.F18342544821595307642.h((android.widget.TextView) w8455343525638953052.b) : textClassifier;
    }

    @Override // android.widget.TextView
    public android.graphics.Typeface getTypeface() {
        return android.os.Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        java.lang.String[] strArrF;
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            dev.epro.r0.S2941385686793915703.a0(editorInfo, getText());
        }
        dev.epro.r0.I3887072968740112330.F(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrF = dev.epro.r0.W10240872260424387225.f(this)) != null) {
            dev.epro.r0.S2941385686793915703.Z(editorInfo, strArrF);
            inputConnectionOnCreateInputConnection = dev.epro.r0.V12319504402545346730.x(inputConnectionOnCreateInputConnection, editorInfo, new dev.epro.r0.L4980660535418402690(this, (byte) 3));
        }
        return this.e.H(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(android.view.DragEvent dragEvent) {
        android.app.Activity activity;
        dev.epro.r0.H12843822278061842084 e11375389548855090952;
        if (android.os.Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && dev.epro.r0.W10240872260424387225.f(this) != null) {
            android.content.Context context = getContext();
            while (true) {
                if (!(context instanceof android.content.ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof android.app.Activity) {
                    activity = (android.app.Activity) context;
                    break;
                }
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    android.text.Selection.setSelection((android.text.Spannable) getText(), offsetForPosition);
                    android.content.ClipData clipData = dragEvent.getClipData();
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        e11375389548855090952 = new dev.epro.r0.H12843822278061842084(clipData, 3);
                    } else {
                        e11375389548855090952 = new dev.epro.r0.E11375389548855090952();
                        e11375389548855090952.b = clipData;
                        e11375389548855090952.c = (byte) 3;
                    }
                    dev.epro.r0.W10240872260424387225.h(this, e11375389548855090952.build());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        dev.epro.r0.H12843822278061842084 e11375389548855090952;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31 || dev.epro.r0.W10240872260424387225.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) getContext().getSystemService("clipboard");
        android.content.ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                e11375389548855090952 = new dev.epro.r0.H12843822278061842084(primaryClip, 1);
            } else {
                e11375389548855090952 = new dev.epro.r0.E11375389548855090952();
                e11375389548855090952.b = primaryClip;
                e11375389548855090952.c = (byte) 1;
            }
            e11375389548855090952.w(i == 16908322 ? 0 : 1);
            dev.epro.r0.W10240872260424387225.h(this, e11375389548855090952.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        dev.epro.r0.G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        dev.epro.r0.G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.i(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        dev.epro.r0.L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        dev.epro.r0.L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(dev.epro.r0.M17147082063200071302.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.M(z);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(java.lang.String str) {
        return getFontVariationSettingsManager().a(str);
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(this.e.C(keyListener));
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        dev.epro.r0.G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        dev.epro.r0.G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.m(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        dev.epro.r0.L11832743611999248019 l11832743611999248019 = this.b;
        l11832743611999248019.m(colorStateList);
        l11832743611999248019.b();
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        dev.epro.r0.L11832743611999248019 l11832743611999248019 = this.b;
        l11832743611999248019.n(mode);
        l11832743611999248019.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        dev.epro.r0.L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        dev.epro.r0.W8455343525638953052 w8455343525638953052;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (w8455343525638953052 = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            w8455343525638953052.c = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(android.graphics.Typeface typeface) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            super.setTypeface(typeface);
            return;
        }
        dev.epro.r0.Q3692367166080252660 fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.c = typeface;
        fontVariationSettingsManager.d = typeface;
        fontVariationSettingsManager.b.accept(typeface);
    }
}
