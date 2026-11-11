package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p045.C1096;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2144;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2347;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p167.C2145;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p175.C2223;
import p131.p161.p162.p163.p185.C2249;
import p131.p161.p162.p163.p185.C2255;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BadgeDrawable extends Drawable implements C2249.InterfaceC2250 {

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final int f2956 = C2350.Widget_MaterialComponents_Badge;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static final int f2957 = C2111.badgeStyle;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final float f2958;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final WeakReference<Context> f2959;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final float f2960;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f2961;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public WeakReference<View> f2962;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public WeakReference<ViewGroup> f2963;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public float f2964;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C2163 f2965;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Rect f2966;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f2967;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final float f2968;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public float f2969;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2249 f2970;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f2971;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final SavedState f2972;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f2973;

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0393();

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f2974;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f2975;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public CharSequence f2976;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public int f2977;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f2978;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f2979;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public int f2980;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f2981;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f2982;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public int f2983;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public int f2984;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0393 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Context context) {
            this.f2982 = Base64.BASELENGTH;
            this.f2979 = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C2350.TextAppearance_MaterialComponents_Badge, C2243.TextAppearance);
            obtainStyledAttributes.getDimension(C2243.TextAppearance_android_textSize, 0.0f);
            ColorStateList m3662 = C1687.m3662(context, obtainStyledAttributes, C2243.TextAppearance_android_textColor);
            C1687.m3662(context, obtainStyledAttributes, C2243.TextAppearance_android_textColorHint);
            C1687.m3662(context, obtainStyledAttributes, C2243.TextAppearance_android_textColorLink);
            obtainStyledAttributes.getInt(C2243.TextAppearance_android_textStyle, 0);
            obtainStyledAttributes.getInt(C2243.TextAppearance_android_typeface, 1);
            int i = C2243.TextAppearance_fontFamily;
            i = obtainStyledAttributes.hasValue(i) ? i : C2243.TextAppearance_android_fontFamily;
            obtainStyledAttributes.getResourceId(i, 0);
            obtainStyledAttributes.getString(i);
            obtainStyledAttributes.getBoolean(C2243.TextAppearance_textAllCaps, false);
            C1687.m3662(context, obtainStyledAttributes, C2243.TextAppearance_android_shadowColor);
            obtainStyledAttributes.getFloat(C2243.TextAppearance_android_shadowDx, 0.0f);
            obtainStyledAttributes.getFloat(C2243.TextAppearance_android_shadowDy, 0.0f);
            obtainStyledAttributes.getFloat(C2243.TextAppearance_android_shadowRadius, 0.0f);
            obtainStyledAttributes.recycle();
            this.f2978 = m3662.getDefaultColor();
            this.f2976 = context.getString(C2144.mtrl_badge_numberless_content_description);
            this.f2974 = C2347.mtrl_badge_content_description;
            this.f2983 = C2144.mtrl_exceed_max_badge_number_content_description;
        }

        public SavedState(Parcel parcel) {
            this.f2982 = Base64.BASELENGTH;
            this.f2979 = -1;
            this.f2975 = parcel.readInt();
            this.f2978 = parcel.readInt();
            this.f2982 = parcel.readInt();
            this.f2979 = parcel.readInt();
            this.f2981 = parcel.readInt();
            this.f2976 = parcel.readString();
            this.f2974 = parcel.readInt();
            this.f2977 = parcel.readInt();
            this.f2984 = parcel.readInt();
            this.f2980 = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2975);
            parcel.writeInt(this.f2978);
            parcel.writeInt(this.f2982);
            parcel.writeInt(this.f2979);
            parcel.writeInt(this.f2981);
            parcel.writeString(this.f2976.toString());
            parcel.writeInt(this.f2974);
            parcel.writeInt(this.f2977);
            parcel.writeInt(this.f2984);
            parcel.writeInt(this.f2980);
        }
    }

    public BadgeDrawable(Context context) {
        C2145 c2145;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f2959 = weakReference;
        C2255.m4405(context, C2255.f9386, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.f2966 = new Rect();
        this.f2965 = new C2163();
        this.f2968 = resources.getDimensionPixelSize(C2324.mtrl_badge_radius);
        this.f2958 = resources.getDimensionPixelSize(C2324.mtrl_badge_long_text_horizontal_padding);
        this.f2960 = resources.getDimensionPixelSize(C2324.mtrl_badge_with_text_radius);
        C2249 c2249 = new C2249(this);
        this.f2970 = c2249;
        c2249.f9367.setTextAlign(Paint.Align.CENTER);
        this.f2972 = new SavedState(context);
        int i = C2350.TextAppearance_MaterialComponents_Badge;
        Context context3 = weakReference.get();
        if (context3 == null || c2249.f9369 == (c2145 = new C2145(context3, i)) || (context2 = weakReference.get()) == null) {
            return;
        }
        c2249.m4398(c2145, context2);
        m1307();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || this.f2972.f2982 == 0 || !isVisible()) {
            return;
        }
        this.f2965.draw(canvas);
        if (m1303()) {
            Rect rect = new Rect();
            String m1298 = m1298();
            this.f2970.f9367.getTextBounds(m1298, 0, m1298.length(), rect);
            canvas.drawText(m1298, this.f2961, this.f2973 + (rect.height() / 2), this.f2970.f9367);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2972.f2982;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2966.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2966.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, p131.p161.p162.p163.p185.C2249.InterfaceC2250
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2972.f2982 = i;
        this.f2970.f9367.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m1297(int i) {
        this.f2972.f2978 = i;
        if (this.f2970.f9367.getColor() != i) {
            this.f2970.f9367.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String m1298() {
        if (m1305() <= this.f2967) {
            return Integer.toString(m1305());
        }
        Context context = this.f2959.get();
        return context == null ? "" : context.getString(C2144.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.f2967), "+");
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m1299(int i) {
        SavedState savedState = this.f2972;
        if (savedState.f2977 != i) {
            savedState.f2977 = i;
            WeakReference<View> weakReference = this.f2962;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.f2962.get();
            WeakReference<ViewGroup> weakReference2 = this.f2963;
            ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
            this.f2962 = new WeakReference<>(view);
            this.f2963 = new WeakReference<>(viewGroup);
            m1307();
            invalidateSelf();
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m1300(int i) {
        int max = Math.max(0, i);
        SavedState savedState = this.f2972;
        if (savedState.f2979 != max) {
            savedState.f2979 = max;
            this.f2970.f9370 = true;
            m1307();
            invalidateSelf();
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public CharSequence m1301() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!m1303()) {
            return this.f2972.f2976;
        }
        if (this.f2972.f2974 <= 0 || (context = this.f2959.get()) == null) {
            return null;
        }
        int m1305 = m1305();
        int i = this.f2967;
        return m1305 <= i ? context.getResources().getQuantityString(this.f2972.f2974, m1305(), Integer.valueOf(m1305())) : context.getString(this.f2972.f2983, Integer.valueOf(i));
    }

    @Override // p131.p161.p162.p163.p185.C2249.InterfaceC2250
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1302() {
        invalidateSelf();
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean m1303() {
        return this.f2972.f2979 != -1;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m1304(int i) {
        this.f2972.f2975 = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C2163 c2163 = this.f2965;
        if (c2163.f9045.f9084 != valueOf) {
            c2163.m4252(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m1305() {
        if (m1303()) {
            return this.f2972.f2979;
        }
        return 0;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m1306(int i) {
        SavedState savedState = this.f2972;
        if (savedState.f2981 != i) {
            savedState.f2981 = i;
            double d = i;
            Double.isNaN(d);
            Double.isNaN(d);
            this.f2967 = ((int) Math.pow(10.0d, d - 1.0d)) - 1;
            this.f2970.f9370 = true;
            m1307();
            invalidateSelf();
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m1307() {
        float m4399;
        Context context = this.f2959.get();
        WeakReference<View> weakReference = this.f2962;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f2966);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<ViewGroup> weakReference2 = this.f2963;
        ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
        if (viewGroup != null || C2223.f9238) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        int i = this.f2972.f2977;
        this.f2973 = (i == 8388691 || i == 8388693) ? rect2.bottom - r2.f2980 : rect2.top + r2.f2980;
        if (m1305() <= 9) {
            m4399 = !m1303() ? this.f2968 : this.f2960;
            this.f2969 = m4399;
            this.f2964 = m4399;
        } else {
            float f = this.f2960;
            this.f2969 = f;
            this.f2964 = f;
            m4399 = (this.f2970.m4399(m1298()) / 2.0f) + this.f2958;
        }
        this.f2971 = m4399;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m1303() ? C2324.mtrl_badge_text_horizontal_edge_offset : C2324.mtrl_badge_horizontal_edge_offset);
        int i2 = this.f2972.f2977;
        float f2 = (i2 == 8388659 || i2 == 8388691 ? C1096.m2491(view) != 0 : C1096.m2491(view) == 0) ? ((rect2.right + this.f2971) - dimensionPixelSize) - this.f2972.f2984 : (rect2.left - this.f2971) + dimensionPixelSize + this.f2972.f2984;
        this.f2961 = f2;
        Rect rect3 = this.f2966;
        float f3 = this.f2973;
        float f4 = this.f2971;
        float f5 = this.f2964;
        boolean z = C2223.f9238;
        rect3.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
        C2163 c2163 = this.f2965;
        c2163.f9045.f9074 = c2163.f9045.f9074.m4286(this.f2969);
        c2163.invalidateSelf();
        if (rect.equals(this.f2966)) {
            return;
        }
        this.f2965.setBounds(this.f2966);
    }
}
