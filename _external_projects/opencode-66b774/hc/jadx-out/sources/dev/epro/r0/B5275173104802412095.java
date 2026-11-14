package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.util.Arrays;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B5275173104802412095 {
    public static B5275173104802412095 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public B16853324304735504143 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final J3666911460850185240 h = new J3666911460850185240(6);

    public static synchronized B5275173104802412095 c() {
        B5275173104802412095 b5275173104802412095;
        b5275173104802412095 = g;
        if (b5275173104802412095 == null) {
            b5275173104802412095 = new B5275173104802412095();
            g = b5275173104802412095;
        }
        return b5275173104802412095;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        J3666911460850185240 j3666911460850185240 = h;
        j3666911460850185240.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) j3666911460850185240.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void i(Drawable drawable, L11462694090053902638 l11462694090053902638, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = l11462694090053902638.b;
            if (!z && !l11462694090053902638.a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterF = null;
            ColorStateList colorStateList = z ? (ColorStateList) l11462694090053902638.c : null;
            PorterDuff.Mode mode = l11462694090053902638.a ? (PorterDuff.Mode) l11462694090053902638.d : f;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterF = f(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterF);
        }
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.a = weakHashMap;
        }
        E8321115364184429049 e8321115364184429049 = (E8321115364184429049) weakHashMap.get(context);
        if (e8321115364184429049 == null) {
            e8321115364184429049 = new E8321115364184429049(0);
            this.a.put(context, e8321115364184429049);
        }
        int i2 = e8321115364184429049.d;
        if (i2 != 0 && i <= e8321115364184429049.b[i2 - 1]) {
            e8321115364184429049.c(i, colorStateList);
            return;
        }
        if (e8321115364184429049.a && i2 >= e8321115364184429049.b.length) {
            V1475975160983963926.v(e8321115364184429049);
        }
        int i3 = e8321115364184429049.d;
        if (i3 >= e8321115364184429049.b.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            e8321115364184429049.b = Arrays.copyOf(e8321115364184429049.b, i7);
            e8321115364184429049.c = Arrays.copyOf(e8321115364184429049.c, i7);
        }
        e8321115364184429049.b[i3] = i;
        e8321115364184429049.c[i3] = colorStateList;
        e8321115364184429049.d = i3 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(android.content.Context r7, int r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5275173104802412095.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || (!(drawableD instanceof R14609119592937689706) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                T11496100853119631009.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        E8321115364184429049 e8321115364184429049;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListE = null;
        colorStateList = (weakHashMap == null || (e8321115364184429049 = (E8321115364184429049) weakHashMap.get(context)) == null) ? null : (ColorStateList) V1475975160983963926.p(e8321115364184429049, i);
        if (colorStateList == null) {
            B16853324304735504143 b16853324304735504143 = this.e;
            if (b16853324304735504143 != null) {
                colorStateListE = b16853324304735504143.e(context, i);
            }
            if (colorStateListE != null) {
                a(context, i, colorStateListE);
            }
            colorStateList = colorStateListE;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable h(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5275173104802412095.h(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
