package p034.p050.p055.p056;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p034.p035.p043.C1067;
import p034.p050.p053.C1234;
import p237.p238.p239.p241.p242.C2786;

@SuppressLint({"RestrictedAPI"})
/* renamed from: づざかべべ.〺つふすそ.てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1266 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final ThreadLocal<TypedValue> f6170 = new ThreadLocal<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final WeakHashMap<Context, SparseArray<C1267>> f6168 = new WeakHashMap<>(0);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final Object f6169 = new Object();

    /* renamed from: づざかべべ.〺つふすそ.てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1267 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Configuration f6171;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final ColorStateList f6172;

        public C1267(ColorStateList colorStateList, Configuration configuration) {
            this.f6172 = colorStateList;
            this.f6171 = configuration;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Drawable m2928(Context context, int i) {
        return C1234.m2853().m2861(context, i);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static ColorStateList m2929(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1267 c1267;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        synchronized (f6169) {
            SparseArray<C1267> sparseArray = f6168.get(context);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (c1267 = sparseArray.get(i)) != null) {
                if (c1267.f6171.equals(context.getResources().getConfiguration())) {
                    colorStateList2 = c1267.f6172;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = f6170;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (!(i2 >= 28 && i2 <= 31)) {
            Resources resources2 = context.getResources();
            try {
                colorStateList = C2786.m4798(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception unused) {
            }
        }
        if (colorStateList == null) {
            Object obj = C1067.f5528;
            return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
        }
        synchronized (f6169) {
            WeakHashMap<Context, SparseArray<C1267>> weakHashMap = f6168;
            SparseArray<C1267> sparseArray2 = weakHashMap.get(context);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(context, sparseArray2);
            }
            sparseArray2.append(i, new C1267(colorStateList, context.getResources().getConfiguration()));
        }
        return colorStateList;
    }
}
