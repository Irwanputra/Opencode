package p034.p050.p053;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p034.p035.p043.p044.AbstractC1059;
import p034.p035.p043.p044.C1056;
import p034.p050.p055.p056.C1266;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぺづげぺが, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1260 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final TypedArray f6162;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public TypedValue f6163;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f6164;

    public C1260(Context context, TypedArray typedArray) {
        this.f6164 = context;
        this.f6162 = typedArray;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static C1260 m2909(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1260(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static C1260 m2910(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C1260(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Drawable m2911(int i) {
        int resourceId;
        Drawable m2855;
        if (!this.f6162.hasValue(i) || (resourceId = this.f6162.getResourceId(i, 0)) == 0) {
            return null;
        }
        C1242 m2867 = C1242.m2867();
        Context context = this.f6164;
        synchronized (m2867) {
            m2855 = m2867.f6097.m2855(context, resourceId, true);
        }
        return m2855;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int m2912(int i, int i2) {
        return this.f6162.getColor(i, i2);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Drawable m2913(int i) {
        int resourceId;
        return (!this.f6162.hasValue(i) || (resourceId = this.f6162.getResourceId(i, 0)) == 0) ? this.f6162.getDrawable(i) : C1266.m2928(this.f6164, resourceId);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int m2914(int i, int i2) {
        return this.f6162.getInt(i, i2);
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean m2915(int i) {
        return this.f6162.hasValue(i);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public CharSequence m2916(int i) {
        return this.f6162.getText(i);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ColorStateList m2917(int i) {
        int resourceId;
        ColorStateList m2929;
        return (!this.f6162.hasValue(i) || (resourceId = this.f6162.getResourceId(i, 0)) == 0 || (m2929 = C1266.m2929(this.f6164, resourceId)) == null) ? this.f6162.getColorStateList(i) : m2929;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m2918(int i, boolean z) {
        return this.f6162.getBoolean(i, z);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int m2919(int i, int i2) {
        return this.f6162.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int m2920(int i, int i2) {
        return this.f6162.getLayoutDimension(i, i2);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int m2921(int i, int i2) {
        return this.f6162.getDimensionPixelSize(i, i2);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int m2922(int i, int i2) {
        return this.f6162.getResourceId(i, i2);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float m2923(int i, float f) {
        return this.f6162.getDimension(i, f);
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public String m2924(int i) {
        return this.f6162.getString(i);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Typeface m2925(int i, int i2, AbstractC1059 abstractC1059) {
        int resourceId = this.f6162.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f6163 == null) {
            this.f6163 = new TypedValue();
        }
        Context context = this.f6164;
        TypedValue typedValue = this.f6163;
        if (context.isRestricted()) {
            return null;
        }
        return C1056.m2388(context, resourceId, typedValue, i2, abstractC1059, null, true);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int m2926(int i, int i2) {
        return this.f6162.getInteger(i, i2);
    }
}
