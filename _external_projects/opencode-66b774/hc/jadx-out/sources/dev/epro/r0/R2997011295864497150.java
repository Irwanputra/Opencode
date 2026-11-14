package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class R2997011295864497150 extends Button {
    public final G6575252167976303972 a;
    public final L11832743611999248019 b;
    public S8418098248327900568 c;
    public Q3692367166080252660 d;

    public R2997011295864497150(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        X170853990943489827.a(this, getContext());
        G6575252167976303972 g6575252167976303972 = new G6575252167976303972(this);
        this.a = g6575252167976303972;
        g6575252167976303972.f(attributeSet, i);
        L11832743611999248019 l11832743611999248019 = new L11832743611999248019(this);
        this.b = l11832743611999248019;
        l11832743611999248019.h(attributeSet, i);
        l11832743611999248019.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private S8418098248327900568 getEmojiTextViewHelper() {
        S8418098248327900568 s8418098248327900568 = this.c;
        if (s8418098248327900568 != null) {
            return s8418098248327900568;
        }
        S8418098248327900568 s84180982483279005682 = new S8418098248327900568(this);
        this.c = s84180982483279005682;
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
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public Q3692367166080252660 getFontVariationSettingsManager() {
        Q3692367166080252660 q3692367166080252660 = this.d;
        if (q3692367166080252660 != null) {
            return q3692367166080252660;
        }
        Q3692367166080252660 q36923671660802526602 = new Q3692367166080252660(this, new L11392556274289219196(this, (byte) 0));
        this.d = q36923671660802526602;
        return q36923671660802526602;
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
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 == null || G17670069693736004358.c) {
            return;
        }
        l11832743611999248019.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    public void setSupportAllCaps(boolean z) {
        L11832743611999248019 l11832743611999248019 = this.b;
        if (l11832743611999248019 != null) {
            l11832743611999248019.a.setAllCaps(z);
        }
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
    public void setTextSize(int i, float f) {
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
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 26) {
            super.setTypeface(typeface);
            return;
        }
        Q3692367166080252660 fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.c = typeface;
        fontVariationSettingsManager.d = typeface;
        fontVariationSettingsManager.b.accept(typeface);
    }
}
