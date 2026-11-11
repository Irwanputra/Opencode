package p034.p035.p049;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1134 implements Spannable {

    /* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C1135 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final TextDirectionHeuristic f5657;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int f5658;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final TextPaint f5659;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final int f5660;

        public C1135(PrecomputedText.Params params) {
            this.f5659 = params.getTextPaint();
            this.f5657 = params.getTextDirection();
            this.f5658 = params.getBreakStrategy();
            this.f5660 = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        public C1135(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f5659 = textPaint;
            this.f5657 = textDirectionHeuristic;
            this.f5658 = i;
            this.f5660 = i2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1135)) {
                return false;
            }
            C1135 c1135 = (C1135) obj;
            if (m2569(c1135)) {
                return Build.VERSION.SDK_INT < 18 || this.f5657 == c1135.f5657;
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C2786.m4799(Float.valueOf(this.f5659.getTextSize()), Float.valueOf(this.f5659.getTextScaleX()), Float.valueOf(this.f5659.getTextSkewX()), Float.valueOf(this.f5659.getLetterSpacing()), Integer.valueOf(this.f5659.getFlags()), this.f5659.getTextLocales(), this.f5659.getTypeface(), Boolean.valueOf(this.f5659.isElegantTextHeight()), this.f5657, Integer.valueOf(this.f5658), Integer.valueOf(this.f5660));
            }
            if (i >= 21) {
                return C2786.m4799(Float.valueOf(this.f5659.getTextSize()), Float.valueOf(this.f5659.getTextScaleX()), Float.valueOf(this.f5659.getTextSkewX()), Float.valueOf(this.f5659.getLetterSpacing()), Integer.valueOf(this.f5659.getFlags()), this.f5659.getTextLocale(), this.f5659.getTypeface(), Boolean.valueOf(this.f5659.isElegantTextHeight()), this.f5657, Integer.valueOf(this.f5658), Integer.valueOf(this.f5660));
            }
            if (i < 18 && i < 17) {
                return C2786.m4799(Float.valueOf(this.f5659.getTextSize()), Float.valueOf(this.f5659.getTextScaleX()), Float.valueOf(this.f5659.getTextSkewX()), Integer.valueOf(this.f5659.getFlags()), this.f5659.getTypeface(), this.f5657, Integer.valueOf(this.f5658), Integer.valueOf(this.f5660));
            }
            return C2786.m4799(Float.valueOf(this.f5659.getTextSize()), Float.valueOf(this.f5659.getTextScaleX()), Float.valueOf(this.f5659.getTextSkewX()), Integer.valueOf(this.f5659.getFlags()), this.f5659.getTextLocale(), this.f5659.getTypeface(), this.f5657, Integer.valueOf(this.f5658), Integer.valueOf(this.f5660));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00ca  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p034.p035.p049.C1134.C1135.toString():java.lang.String");
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m2569(C1135 c1135) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f5658 != c1135.f5658 || this.f5660 != c1135.f5660)) || this.f5659.getTextSize() != c1135.f5659.getTextSize() || this.f5659.getTextScaleX() != c1135.f5659.getTextScaleX() || this.f5659.getTextSkewX() != c1135.f5659.getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f5659.getLetterSpacing() != c1135.f5659.getLetterSpacing() || !TextUtils.equals(this.f5659.getFontFeatureSettings(), c1135.f5659.getFontFeatureSettings()))) || this.f5659.getFlags() != c1135.f5659.getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f5659.getTextLocales().equals(c1135.f5659.getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f5659.getTextLocale().equals(c1135.f5659.getTextLocale())) {
                return false;
            }
            return this.f5659.getTypeface() == null ? c1135.f5659.getTypeface() == null : this.f5659.getTypeface().equals(c1135.f5659.getTypeface());
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        int i = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        int i4 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }
}
