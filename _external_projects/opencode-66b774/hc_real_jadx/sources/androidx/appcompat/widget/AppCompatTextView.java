package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p034.p035.p045.InterfaceC1119;
import p034.p035.p047.InterfaceC1123;
import p034.p035.p047.InterfaceC1130;
import p034.p035.p049.C1134;
import p034.p050.p053.C1206;
import p034.p050.p053.C1232;
import p034.p050.p053.C1241;
import p034.p050.p053.C1252;
import p034.p050.p053.C1253;
import p034.p050.p053.C1261;
import p034.p050.p055.p056.C1266;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatTextView extends TextView implements InterfaceC1119, InterfaceC1130, InterfaceC1123 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1253 f391;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1232 f392;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Future<C1134> f393;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C1261 f394;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C1241.m2865(context), attributeSet, i);
        C1252.m2892(this, getContext());
        C1253 c1253 = new C1253(this);
        this.f391 = c1253;
        c1253.m2901(attributeSet, i);
        C1232 c1232 = new C1232(this);
        this.f392 = c1232;
        c1232.m2846(attributeSet, i);
        c1232.m2842();
        this.f394 = new C1261(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1253 c1253 = this.f391;
        if (c1253 != null) {
            c1253.m2898();
        }
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC1123.f5618) {
            return super.getAutoSizeMaxTextSize();
        }
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            return Math.round(c1232.f6076.f6113);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC1123.f5618) {
            return super.getAutoSizeMinTextSize();
        }
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            return Math.round(c1232.f6076.f6115);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC1123.f5618) {
            return super.getAutoSizeStepGranularity();
        }
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            return Math.round(c1232.f6076.f6111);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC1123.f5618) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1232 c1232 = this.f392;
        return c1232 != null ? c1232.f6076.f6114 : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC1123.f5618) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            return c1232.f6076.f6112;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // p034.p035.p045.InterfaceC1119
    public ColorStateList getSupportBackgroundTintList() {
        C1253 c1253 = this.f391;
        if (c1253 != null) {
            return c1253.m2895();
        }
        return null;
    }

    @Override // p034.p035.p045.InterfaceC1119
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1253 c1253 = this.f391;
        if (c1253 != null) {
            return c1253.m2897();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C1206 c1206 = this.f392.f6065;
        if (c1206 != null) {
            return c1206.f5962;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C1206 c1206 = this.f392.f6065;
        if (c1206 != null) {
            return c1206.f5960;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<C1134> future = this.f393;
        if (future != null) {
            try {
                this.f393 = null;
                C2786.m4833(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1261 c1261;
        return (Build.VERSION.SDK_INT >= 28 || (c1261 = this.f394) == null) ? super.getTextClassifier() : c1261.m2927();
    }

    public C1134.C1135 getTextMetricsParamsCompat() {
        return C2786.m4825(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C2786.m4791(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1232 c1232 = this.f392;
        if (c1232 == null || InterfaceC1123.f5618) {
            return;
        }
        c1232.f6076.m2880();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<C1134> future = this.f393;
        if (future != null) {
            try {
                this.f393 = null;
                C2786.m4833(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1232 c1232 = this.f392;
        if (c1232 == null || InterfaceC1123.f5618 || !c1232.m2849()) {
            return;
        }
        this.f392.f6076.m2880();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC1123.f5618) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2843(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC1123.f5618) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2841(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC1123.f5618) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2850(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1253 c1253 = this.f391;
        if (c1253 != null) {
            c1253.m2899();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1253 c1253 = this.f391;
        if (c1253 != null) {
            c1253.m2900(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C1266.m2928(context, i) : null, i2 != 0 ? C1266.m2928(context, i2) : null, i3 != 0 ? C1266.m2928(context, i3) : null, i4 != 0 ? C1266.m2928(context, i4) : null);
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C1266.m2928(context, i) : null, i2 != 0 ? C1266.m2928(context, i2) : null, i3 != 0 ? C1266.m2928(context, i3) : null, i4 != 0 ? C1266.m2928(context, i4) : null);
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2786.m4773(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C2786.m4789(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C2786.m4829(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C2786.m4819(this, i);
    }

    public void setPrecomputedText(C1134 c1134) {
        C2786.m4833(this, c1134);
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1253 c1253 = this.f391;
        if (c1253 != null) {
            c1253.m2894(colorStateList);
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1253 c1253 = this.f391;
        if (c1253 != null) {
            c1253.m2902(mode);
        }
    }

    @Override // p034.p035.p047.InterfaceC1130
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f392.m2844(colorStateList);
        this.f392.m2842();
    }

    @Override // p034.p035.p047.InterfaceC1130
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f392.m2851(mode);
        this.f392.m2842();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2848(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1261 c1261;
        if (Build.VERSION.SDK_INT >= 28 || (c1261 = this.f394) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1261.f6165 = textClassifier;
        }
    }

    public void setTextFuture(Future<C1134> future) {
        this.f393 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1134.C1135 c1135) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            TextDirectionHeuristic textDirectionHeuristic = c1135.f5657;
            int i2 = 1;
            if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                    i2 = 2;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                    i2 = 3;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                    i2 = 4;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                    i2 = 5;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    i2 = 6;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    i2 = 7;
                }
            }
            setTextDirection(i2);
        }
        if (i >= 23) {
            getPaint().set(c1135.f5659);
            setBreakStrategy(c1135.f5658);
            setHyphenationFrequency(c1135.f5660);
        } else {
            float textScaleX = c1135.f5659.getTextScaleX();
            getPaint().set(c1135.f5659);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = InterfaceC1123.f5618;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C1232 c1232 = this.f392;
        if (c1232 == null || z || c1232.m2849()) {
            return;
        }
        c1232.f6076.m2881(i, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r0 != null) goto L21;
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTypeface(android.graphics.Typeface r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L4b
            if (r10 <= 0) goto L4b
            android.content.Context r1 = r8.getContext()
            づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.いいにぽつ r2 = p034.p035.p038.C1019.f5409
            if (r1 == 0) goto L43
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 >= r3) goto L3e
            づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.いいにぽつ r2 = p034.p035.p038.C1019.f5409
            r2.getClass()
            long r3 = p034.p035.p038.C1007.m2342(r9)
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            r3 = r0
            goto L30
        L24:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.〺つふすそ.くし〴〺ぅ> r5 = r2.f5384
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r5.get(r3)
            づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.〺つふすそ.くし〴〺ぅ r3 = (p034.p035.p043.p044.C1062) r3
        L30:
            if (r3 != 0) goto L33
            goto L3b
        L33:
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.Typeface r0 = r2.mo2336(r1, r3, r0, r10)
        L3b:
            if (r0 == 0) goto L3e
            goto L4b
        L3e:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r9, r10)
            goto L4b
        L43:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Context cannot be null"
            r9.<init>(r10)
            throw r9
        L4b:
            if (r0 == 0) goto L4e
            r9 = r0
        L4e:
            super.setTypeface(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.setTypeface(android.graphics.Typeface, int):void");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1232 c1232 = this.f392;
        if (c1232 != null) {
            c1232.m2842();
        }
    }
}
