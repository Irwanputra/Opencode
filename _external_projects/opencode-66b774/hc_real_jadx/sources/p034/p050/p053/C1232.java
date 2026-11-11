package p034.p050.p053;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p034.p035.p043.p044.AbstractC1059;
import p034.p050.C1148;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1232 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C1206 f6065;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1206 f6066;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1206 f6067;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1206 f6069;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final TextView f6070;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C1206 f6071;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Typeface f6072;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1206 f6073;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f6074;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1206 f6075;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final C1245 f6076;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f6068 = 0;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f6077 = -1;

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.てぜきぽく$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1233 extends AbstractC1059 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ int f6078;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ WeakReference f6079;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ int f6080;

        public C1233(int i, int i2, WeakReference weakReference) {
            this.f6080 = i;
            this.f6078 = i2;
            this.f6079 = weakReference;
        }

        @Override // p034.p035.p043.p044.AbstractC1059
        /* renamed from: くし〴〺ぅ */
        public void mo2398(int i) {
        }

        @Override // p034.p035.p043.p044.AbstractC1059
        /* renamed from: びぐびあび */
        public void mo2400(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f6080) != -1) {
                typeface = Typeface.create(typeface, i, (this.f6078 & 2) != 0);
            }
            C1232 c1232 = C1232.this;
            WeakReference weakReference = this.f6079;
            if (c1232.f6074) {
                c1232.f6072 = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    textView.setTypeface(typeface, c1232.f6068);
                }
            }
        }
    }

    public C1232(TextView textView) {
        this.f6070 = textView;
        this.f6076 = new C1245(textView);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C1206 m2840(Context context, C1242 c1242, int i) {
        ColorStateList m2871 = c1242.m2871(context, i);
        if (m2871 == null) {
            return null;
        }
        C1206 c1206 = new C1206();
        c1206.f5963 = true;
        c1206.f5962 = m2871;
        return c1206;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m2841(int[] iArr, int i) {
        C1245 c1245 = this.f6076;
        if (c1245.m2882()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1245.f6110.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c1245.f6114 = c1245.m2883(iArr2);
                if (!c1245.m2885()) {
                    StringBuilder m4207 = C2098.m4207("None of the preset sizes is valid: ");
                    m4207.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(m4207.toString());
                }
            } else {
                c1245.f6109 = false;
            }
            if (c1245.m2879()) {
                c1245.m2880();
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2842() {
        if (this.f6066 != null || this.f6069 != null || this.f6075 != null || this.f6071 != null) {
            Drawable[] compoundDrawables = this.f6070.getCompoundDrawables();
            m2845(compoundDrawables[0], this.f6066);
            m2845(compoundDrawables[1], this.f6069);
            m2845(compoundDrawables[2], this.f6075);
            m2845(compoundDrawables[3], this.f6071);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f6073 == null && this.f6067 == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f6070.getCompoundDrawablesRelative();
            m2845(compoundDrawablesRelative[0], this.f6073);
            m2845(compoundDrawablesRelative[2], this.f6067);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m2843(int i, int i2, int i3, int i4) {
        C1245 c1245 = this.f6076;
        if (c1245.m2882()) {
            DisplayMetrics displayMetrics = c1245.f6110.getResources().getDisplayMetrics();
            c1245.m2886(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c1245.m2879()) {
                c1245.m2880();
            }
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m2844(ColorStateList colorStateList) {
        if (this.f6065 == null) {
            this.f6065 = new C1206();
        }
        C1206 c1206 = this.f6065;
        c1206.f5962 = colorStateList;
        c1206.f5963 = colorStateList != null;
        this.f6066 = c1206;
        this.f6069 = c1206;
        this.f6075 = c1206;
        this.f6071 = c1206;
        this.f6073 = c1206;
        this.f6067 = c1206;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2845(Drawable drawable, C1206 c1206) {
        if (drawable == null || c1206 == null) {
            return;
        }
        C1242.m2869(drawable, c1206, this.f6070.getDrawableState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f8  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: づざかべべ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2846(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1232.m2846(android.util.AttributeSet, int):void");
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final void m2847(Context context, C1260 c1260) {
        String m2924;
        Typeface create;
        Typeface typeface;
        this.f6068 = c1260.m2914(C1148.TextAppearance_android_textStyle, this.f6068);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int m2914 = c1260.m2914(C1148.TextAppearance_android_textFontWeight, -1);
            this.f6077 = m2914;
            if (m2914 != -1) {
                this.f6068 = (this.f6068 & 2) | 0;
            }
        }
        int i2 = C1148.TextAppearance_android_fontFamily;
        if (!c1260.m2915(i2) && !c1260.m2915(C1148.TextAppearance_fontFamily)) {
            int i3 = C1148.TextAppearance_android_typeface;
            if (c1260.m2915(i3)) {
                this.f6074 = false;
                int m29142 = c1260.m2914(i3, 1);
                if (m29142 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (m29142 == 2) {
                    typeface = Typeface.SERIF;
                } else if (m29142 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f6072 = typeface;
                return;
            }
            return;
        }
        this.f6072 = null;
        int i4 = C1148.TextAppearance_fontFamily;
        if (c1260.m2915(i4)) {
            i2 = i4;
        }
        int i5 = this.f6077;
        int i6 = this.f6068;
        if (!context.isRestricted()) {
            try {
                Typeface m2925 = c1260.m2925(i2, this.f6068, new C1233(i5, i6, new WeakReference(this.f6070)));
                if (m2925 != null) {
                    if (i >= 28 && this.f6077 != -1) {
                        m2925 = Typeface.create(Typeface.create(m2925, 0), this.f6077, (this.f6068 & 2) != 0);
                    }
                    this.f6072 = m2925;
                }
                this.f6074 = this.f6072 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f6072 != null || (m2924 = c1260.m2924(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f6077 == -1) {
            create = Typeface.create(m2924, this.f6068);
        } else {
            create = Typeface.create(Typeface.create(m2924, 0), this.f6077, (this.f6068 & 2) != 0);
        }
        this.f6072 = create;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m2848(Context context, int i) {
        String m2924;
        ColorStateList m2917;
        C1260 c1260 = new C1260(context, context.obtainStyledAttributes(i, C1148.TextAppearance));
        int i2 = C1148.TextAppearance_textAllCaps;
        if (c1260.m2915(i2)) {
            this.f6070.setAllCaps(c1260.m2918(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C1148.TextAppearance_android_textColor;
            if (c1260.m2915(i4) && (m2917 = c1260.m2917(i4)) != null) {
                this.f6070.setTextColor(m2917);
            }
        }
        int i5 = C1148.TextAppearance_android_textSize;
        if (c1260.m2915(i5) && c1260.m2921(i5, -1) == 0) {
            this.f6070.setTextSize(0, 0.0f);
        }
        m2847(context, c1260);
        if (i3 >= 26) {
            int i6 = C1148.TextAppearance_fontVariationSettings;
            if (c1260.m2915(i6) && (m2924 = c1260.m2924(i6)) != null) {
                this.f6070.setFontVariationSettings(m2924);
            }
        }
        c1260.f6162.recycle();
        Typeface typeface = this.f6072;
        if (typeface != null) {
            this.f6070.setTypeface(typeface, this.f6068);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean m2849() {
        C1245 c1245 = this.f6076;
        return c1245.m2882() && c1245.f6112 != 0;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m2850(int i) {
        C1245 c1245 = this.f6076;
        if (c1245.m2882()) {
            if (i == 0) {
                c1245.f6112 = 0;
                c1245.f6115 = -1.0f;
                c1245.f6113 = -1.0f;
                c1245.f6111 = -1.0f;
                c1245.f6114 = new int[0];
                c1245.f6108 = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(C2098.m4208("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = c1245.f6110.getResources().getDisplayMetrics();
            c1245.m2886(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1245.m2879()) {
                c1245.m2880();
            }
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m2851(PorterDuff.Mode mode) {
        if (this.f6065 == null) {
            this.f6065 = new C1206();
        }
        C1206 c1206 = this.f6065;
        c1206.f5960 = mode;
        c1206.f5961 = mode != null;
        this.f6066 = c1206;
        this.f6069 = c1206;
        this.f6075 = c1206;
        this.f6071 = c1206;
        this.f6073 = c1206;
        this.f6067 = c1206;
    }
}
