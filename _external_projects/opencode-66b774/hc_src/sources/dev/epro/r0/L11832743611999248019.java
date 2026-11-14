package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L11832743611999248019 {
    public final TextView a;
    public L11462694090053902638 b;
    public L11462694090053902638 c;
    public L11462694090053902638 d;
    public L11462694090053902638 e;
    public L11462694090053902638 f;
    public L11462694090053902638 g;
    public L11462694090053902638 h;
    public final L12059551958302064907 i;
    public Typeface l;
    public boolean n;
    public int j = 0;
    public int k = -1;
    public String m = null;

    public L11832743611999248019(TextView textView) {
        this.a = textView;
        this.i = new L12059551958302064907(textView);
    }

    public static void d(TextView textView, Typeface typeface, int i) {
        int i2 = Build.VERSION.SDK_INT;
        String str = null;
        if (i2 >= 26) {
            String c = L996168756143250597.c(textView);
            if (!TextUtils.isEmpty(c)) {
                L996168756143250597.f(textView, null);
            }
            str = c;
        }
        textView.setTypeface(typeface, i);
        if (i2 < 26 || TextUtils.isEmpty(str)) {
            return;
        }
        L996168756143250597.f(textView, str);
    }

    public static L11462694090053902638 e(Context context, D6070089955350435999 d6070089955350435999, int i) {
        ColorStateList g;
        synchronized (d6070089955350435999) {
            g = d6070089955350435999.a.g(context, i);
        }
        if (g == null) {
            return null;
        }
        L11462694090053902638 l11462694090053902638 = new L11462694090053902638();
        l11462694090053902638.b = true;
        l11462694090053902638.c = g;
        return l11462694090053902638;
    }

    public final void a(Drawable drawable, L11462694090053902638 l11462694090053902638) {
        if (drawable == null || l11462694090053902638 == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        PorterDuff.Mode mode = D6070089955350435999.b;
        B5275173104802412095.i(drawable, l11462694090053902638, drawableState);
    }

    public final void b() {
        L11462694090053902638 l11462694090053902638 = this.b;
        TextView textView = this.a;
        if (l11462694090053902638 != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final void c(boolean z) {
        Typeface typeface = this.l;
        TextView textView = this.a;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            textView.setTypeface(null);
        }
        String str = this.m;
        if (str == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        L996168756143250597.f(textView, str);
    }

    public final ColorStateList f() {
        L11462694090053902638 l11462694090053902638 = this.h;
        if (l11462694090053902638 != null) {
            return (ColorStateList) l11462694090053902638.c;
        }
        return null;
    }

    public final PorterDuff.Mode g() {
        L11462694090053902638 l11462694090053902638 = this.h;
        if (l11462694090053902638 != null) {
            return (PorterDuff.Mode) l11462694090053902638.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L11832743611999248019.h(android.util.AttributeSet, int):void");
    }

    public final void i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, Y17304307076558258116.v);
        I1632105416032993715 i1632105416032993715 = new I1632105416032993715(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        boolean o2 = o(context, i1632105416032993715);
        i1632105416032993715.v();
        c(o2);
    }

    public final void j(int i, int i2, int i3, int i4) {
        L12059551958302064907 l12059551958302064907 = this.i;
        if (l12059551958302064907.i()) {
            DisplayMetrics displayMetrics = l12059551958302064907.j.getResources().getDisplayMetrics();
            l12059551958302064907.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (l12059551958302064907.g()) {
                l12059551958302064907.a();
            }
        }
    }

    public final void k(int[] iArr, int i) {
        L12059551958302064907 l12059551958302064907 = this.i;
        if (l12059551958302064907.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = l12059551958302064907.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                l12059551958302064907.f = L12059551958302064907.b(iArr2);
                if (!l12059551958302064907.h()) {
                    Z3383101362411723454.p("None of the preset sizes is valid: ", Arrays.toString(iArr));
                    return;
                }
            } else {
                l12059551958302064907.g = false;
            }
            if (l12059551958302064907.g()) {
                l12059551958302064907.a();
            }
        }
    }

    public final void l(int i) {
        L12059551958302064907 l12059551958302064907 = this.i;
        if (l12059551958302064907.i()) {
            if (i == 0) {
                l12059551958302064907.a = 0;
                l12059551958302064907.d = -1.0f;
                l12059551958302064907.e = -1.0f;
                l12059551958302064907.c = -1.0f;
                l12059551958302064907.f = new int[0];
                l12059551958302064907.b = false;
                return;
            }
            if (i != 1) {
                S10973172697741180971.j(G6547577305291411977.n(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = l12059551958302064907.j.getResources().getDisplayMetrics();
            l12059551958302064907.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (l12059551958302064907.g()) {
                l12059551958302064907.a();
            }
        }
    }

    public final void m(ColorStateList colorStateList) {
        L11462694090053902638 l11462694090053902638 = this.h;
        if (l11462694090053902638 == null) {
            l11462694090053902638 = new L11462694090053902638();
            this.h = l11462694090053902638;
        }
        L11462694090053902638 l114626940900539026382 = l11462694090053902638;
        l11462694090053902638.c = colorStateList;
        l11462694090053902638.b = colorStateList != null;
        this.b = l114626940900539026382;
        this.c = l114626940900539026382;
        this.d = l114626940900539026382;
        this.e = l114626940900539026382;
        this.f = l114626940900539026382;
        this.g = l114626940900539026382;
    }

    public final void n(PorterDuff.Mode mode) {
        L11462694090053902638 l11462694090053902638 = this.h;
        if (l11462694090053902638 == null) {
            l11462694090053902638 = new L11462694090053902638();
            this.h = l11462694090053902638;
        }
        L11462694090053902638 l114626940900539026382 = l11462694090053902638;
        l11462694090053902638.d = mode;
        l11462694090053902638.a = mode != null;
        this.b = l114626940900539026382;
        this.c = l114626940900539026382;
        this.d = l114626940900539026382;
        this.e = l114626940900539026382;
        this.f = l114626940900539026382;
        this.g = l114626940900539026382;
    }

    public final boolean o(Context context, I1632105416032993715 i1632105416032993715) {
        String string;
        int i;
        Typeface typeface;
        int i2 = this.j;
        TypedArray typedArray = (TypedArray) i1632105416032993715.c;
        this.j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.k = i4;
            if (i4 != -1) {
                this.j &= 2;
            }
        }
        if (i3 >= 26 && typedArray.hasValue(13)) {
            this.m = typedArray.getString(13);
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.l = null;
            int i5 = typedArray.hasValue(12) ? 12 : 10;
            int i6 = this.k;
            int i7 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface k = i1632105416032993715.k(i5, this.j, new I15162792415829416729(this, i6, i7, new WeakReference(this.a)));
                    if (k != null) {
                        if (i3 < 28 || this.k == -1) {
                            this.l = k;
                        } else {
                            this.l = C15025379344307230271.a(Typeface.create(k, 0), this.k, (this.j & 2) != 0);
                        }
                    }
                    this.n = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (string = typedArray.getString(i5)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.l = Typeface.create(string, this.j);
                } else {
                    this.l = C15025379344307230271.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
                }
            }
        } else {
            if (!typedArray.hasValue(1)) {
                if (i3 < 28 || (i = this.k) == -1 || (typeface = this.l) == null) {
                    return false;
                }
                this.l = C15025379344307230271.a(typeface, i, (this.j & 2) != 0);
                return true;
            }
            this.n = false;
            int i8 = typedArray.getInt(1, 1);
            if (i8 == 1) {
                this.l = Typeface.SANS_SERIF;
                return true;
            }
            if (i8 == 2) {
                this.l = Typeface.SERIF;
                return true;
            }
            if (i8 == 3) {
                this.l = Typeface.MONOSPACE;
                return true;
            }
        }
        return true;
    }
}
