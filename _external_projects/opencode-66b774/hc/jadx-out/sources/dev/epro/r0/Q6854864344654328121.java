package dev.epro.r0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class Q6854864344654328121 extends TextView {
    public final G6575252167976303972 a;
    public final L11832743611999248019 b;
    public final W8455343525638953052 c;
    public S8418098248327900568 d;
    public boolean e;
    public H12843822278061842084 f;
    public Future g;
    public Q3692367166080252660 h;

    public Q6854864344654328121(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        this.f = null;
        X170853990943489827.a(this, getContext());
        G6575252167976303972 g6575252167976303972 = new G6575252167976303972(this);
        this.a = g6575252167976303972;
        g6575252167976303972.f(attributeSet, i);
        L11832743611999248019 l11832743611999248019 = new L11832743611999248019(this);
        this.b = l11832743611999248019;
        l11832743611999248019.h(attributeSet, i);
        l11832743611999248019.b();
        W8455343525638953052 w8455343525638953052 = new W8455343525638953052((byte) 9, false);
        w8455343525638953052.b = this;
        this.c = w8455343525638953052;
        getEmojiTextViewHelper().a(attributeSet, i);
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (G17670069693736004358.c) {
            return super.getAutoSizeMaxTextSize();
        }
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            return Math.round(l11832743611999248019.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (G17670069693736004358.c) {
            return super.getAutoSizeMinTextSize();
        }
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            return Math.round(l11832743611999248019.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (G17670069693736004358.c) {
            return super.getAutoSizeStepGranularity();
        }
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            return Math.round(l11832743611999248019.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (G17670069693736004358.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        L11832743611999248019 l11832743611999248019 = this.b;
        return l11832743611999248019 != null ? l11832743611999248019.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (G17670069693736004358.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            return l11832743611999248019.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return M17147082063200071302.O(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public Q3692367166080252660 getFontVariationSettingsManager() {
        Q3692367166080252660 q3692367166080252660 = this.h;
        if (q3692367166080252660 != null) {
            return q3692367166080252660;
        }
        Q3692367166080252660 q36923671660802526602 = new Q3692367166080252660(this, new L11392556274289219196(this, (byte) 2));
        this.h = q36923671660802526602;
        return q36923671660802526602;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public D10104483913663276389 getSuperCaller() {
        H12843822278061842084 h12843822278061842084 = this.f;
        if (h12843822278061842084 != null) {
            return h12843822278061842084;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            I12956685757346171289 i12956685757346171289 = new I12956685757346171289(this);
            this.f = i12956685757346171289;
            return i12956685757346171289;
        }
        if (i >= 28) {
            T18313239189447113529 t18313239189447113529 = new T18313239189447113529(this);
            this.f = t18313239189447113529;
            return t18313239189447113529;
        }
        if (i < 26) {
            return h12843822278061842084;
        }
        H12843822278061842084 h128438222780618420842 = new H12843822278061842084((Object) this, (byte) 12);
        this.f = h128438222780618420842;
        return h128438222780618420842;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                M17147082063200071302.E(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        W8455343525638953052 w8455343525638953052;
        if (Build.VERSION.SDK_INT >= 28 || (w8455343525638953052 = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) w8455343525638953052.c;
        return textClassifier == null ? F18342544821595307642.h((TextView) w8455343525638953052.b) : textClassifier;
    }

    public H8867200589542945034 getTextMetricsParamsCompat() {
        return M17147082063200071302.E(this);
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            S2941385686793915703.a0(editorInfo, getText());
        }
        I3887072968740112330.F(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 == null || G17670069693736004358.c) {
            return;
        }
        l11832743611999248019.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                M17147082063200071302.E(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            L12059551958302064907 l12059551958302064907 = l11832743611999248019.i;
            if (G17670069693736004358.c || !l12059551958302064907.e()) {
                return;
            }
            l12059551958302064907.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (G17670069693736004358.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.j(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (G17670069693736004358.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.k(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (G17670069693736004358.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.l(i);
        }
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

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? M9216324016624295870.G(context, i) : null, i2 != 0 ? M9216324016624295870.G(context, i2) : null, i3 != 0 ? M9216324016624295870.G(context, i3) : null, i4 != 0 ? M9216324016624295870.G(context, i4) : null);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? M9216324016624295870.G(context, i) : null, i2 != 0 ? M9216324016624295870.G(context, i2) : null, i3 != 0 ? M9216324016624295870.G(context, i3) : null, i4 != 0 ? M9216324016624295870.G(context, i4) : null);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(M17147082063200071302.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((U16229988784104357932) getEmojiTextViewHelper().b.b).G(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i);
        } else {
            M17147082063200071302.J(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i);
        } else {
            M17147082063200071302.K(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().u(i, f);
        } else if (i2 >= 34) {
            H3737085483209546534.m(this, i, f);
        } else {
            M17147082063200071302.L(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(K13152373436320414464 k13152373436320414464) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        M17147082063200071302.E(this);
        throw null;
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        W8455343525638953052 w8455343525638953052;
        if (Build.VERSION.SDK_INT >= 28 || (w8455343525638953052 = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            w8455343525638953052.c = textClassifier;
        }
    }

    public void setTextFuture(Future<K13152373436320414464> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(H8867200589542945034 h8867200589542945034) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = h8867200589542945034.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(h8867200589542945034.a);
        setBreakStrategy(h8867200589542945034.c);
        setHyphenationFrequency(h8867200589542945034.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = G17670069693736004358.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            L12059551958302064907 l12059551958302064907 = l11832743611999248019.i;
            if (z || l12059551958302064907.e()) {
                return;
            }
            l12059551958302064907.f(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            Z14316276734425062790 z14316276734425062790 = K4066258037408482587.a;
            if (context == null) {
                S10973172697741180971.j("Context cannot be null");
                return;
            }
            typeface = Typeface.create(typeface, i);
        }
        this.e = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        M17147082063200071302.L(this, i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 26) {
            Q3692367166080252660 fontVariationSettingsManager = getFontVariationSettingsManager();
            fontVariationSettingsManager.c = typeface;
            fontVariationSettingsManager.d = typeface;
            fontVariationSettingsManager.b.accept(typeface);
            return;
        }
        super.setTypeface(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    public Q6854864344654328121(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
