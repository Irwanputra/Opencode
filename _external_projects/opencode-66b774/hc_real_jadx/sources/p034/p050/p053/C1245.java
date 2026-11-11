package p034.p050.p053;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1245 {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final RectF f6104 = new RectF();

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static ConcurrentHashMap<String, Method> f6105 = new ConcurrentHashMap<>();

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static ConcurrentHashMap<String, Field> f6106 = new ConcurrentHashMap<>();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public TextPaint f6107;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final Context f6110;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final TextView f6116;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final C1247 f6117;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f6112 = 0;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f6108 = false;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f6111 = -1.0f;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float f6115 = -1.0f;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f6113 = -1.0f;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int[] f6114 = new int[0];

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f6109 = false;

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.のぷのちつ$〺つふすそ, reason: contains not printable characters */
    public static class C1246 extends C1248 {
        @Override // p034.p050.p053.C1245.C1247
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean mo2887(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        @Override // p034.p050.p053.C1245.C1248, p034.p050.p053.C1245.C1247
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo2888(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.のぷのちつ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1247 {
        /* renamed from: 〺つふすそ */
        public boolean mo2887(TextView textView) {
            return ((Boolean) C1245.m2878(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }

        /* renamed from: げつ〴ぬぐ */
        public void mo2888(StaticLayout.Builder builder, TextView textView) {
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.のぷのちつ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1248 extends C1247 {
        @Override // p034.p050.p053.C1245.C1247
        /* renamed from: げつ〴ぬぐ */
        public void mo2888(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C1245.m2878(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public C1245(TextView textView) {
        this.f6116 = textView;
        this.f6110 = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        this.f6117 = i >= 29 ? new C1246() : i >= 23 ? new C1248() : new C1247();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static <T> T m2876(Object obj, String str, T t) {
        Field field;
        try {
            try {
                field = f6106.get(str);
                if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                    field.setAccessible(true);
                    f6106.put(str, field);
                }
            } catch (IllegalAccessException unused) {
                return t;
            }
        } catch (NoSuchFieldException unused2) {
            field = null;
        }
        return field == null ? t : (T) field.get(obj);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Method m2877(String str) {
        try {
            Method method = f6105.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f6105.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static <T> T m2878(Object obj, String str, T t) {
        try {
            return (T) m2877(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return t;
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final boolean m2879() {
        if (m2882() && this.f6112 == 1) {
            if (!this.f6109 || this.f6114.length == 0) {
                int floor = ((int) Math.floor((this.f6113 - this.f6115) / this.f6111)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f6111) + this.f6115);
                }
                this.f6114 = m2883(iArr);
            }
            this.f6108 = true;
        } else {
            this.f6108 = false;
        }
        return this.f6108;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2880() {
        if (m2882() && this.f6112 != 0) {
            if (this.f6108) {
                if (this.f6116.getMeasuredHeight() <= 0 || this.f6116.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f6117.mo2887(this.f6116) ? 1048576 : (this.f6116.getMeasuredWidth() - this.f6116.getTotalPaddingLeft()) - this.f6116.getTotalPaddingRight();
                int height = (this.f6116.getHeight() - this.f6116.getCompoundPaddingBottom()) - this.f6116.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f6104;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m2884 = m2884(rectF);
                    if (m2884 != this.f6116.getTextSize()) {
                        m2881(0, m2884);
                    }
                }
            }
            this.f6108 = true;
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m2881(int i, float f) {
        Context context = this.f6110;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f6116.getPaint().getTextSize()) {
            this.f6116.getPaint().setTextSize(applyDimension);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f6116.isInLayout() : false;
            if (this.f6116.getLayout() != null) {
                this.f6108 = false;
                try {
                    Method m2877 = m2877("nullLayouts");
                    if (m2877 != null) {
                        m2877.invoke(this.f6116, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (isInLayout) {
                    this.f6116.forceLayout();
                } else {
                    this.f6116.requestLayout();
                }
                this.f6116.invalidate();
            }
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final boolean m2882() {
        return !(this.f6116 instanceof AppCompatEditText);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int[] m2883(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015c A[SYNTHETIC] */
    /* renamed from: びぐびあび, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m2884(android.graphics.RectF r21) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1245.m2884(android.graphics.RectF):int");
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final boolean m2885() {
        boolean z = this.f6114.length > 0;
        this.f6109 = z;
        if (z) {
            this.f6112 = 1;
            this.f6115 = r0[0];
            this.f6113 = r0[r1 - 1];
            this.f6111 = -1.0f;
        }
        return z;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m2886(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f6112 = 1;
        this.f6115 = f;
        this.f6113 = f2;
        this.f6111 = f3;
        this.f6109 = false;
    }
}
