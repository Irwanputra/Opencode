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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
        synchronized (B5275173104802412095.class) {
            b5275173104802412095 = g;
            if (b5275173104802412095 == null) {
                b5275173104802412095 = new B5275173104802412095();
                g = b5275173104802412095;
            }
        }
        return b5275173104802412095;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (B5275173104802412095.class) {
            J3666911460850185240 j3666911460850185240 = h;
            j3666911460850185240.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) j3666911460850185240.c(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
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
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? (ColorStateList) l11462694090053902638.c : null;
            PorterDuff.Mode mode = l11462694090053902638.a ? (PorterDuff.Mode) l11462694090053902638.d : f;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = f(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(android.content.Context r7, int r8) {
        /*
            r6 = this;
            android.util.TypedValue r0 = r6.c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r6.c = r0
        Lb:
            android.content.res.Resources r1 = r7.getResources()
            r2 = 1
            r1.getValue(r8, r0, r2)
            int r1 = r0.assetCookie
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            int r3 = r0.data
            long r3 = (long) r3
            long r1 = r1 | r3
            monitor-enter(r6)
            java.util.WeakHashMap r3 = r6.b     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L46
            dev.epro.r0.A18377563779865231301 r3 = (dev.epro.r0.A18377563779865231301) r3     // Catch: java.lang.Throwable -> L46
            r4 = 0
            if (r3 != 0) goto L2c
            monitor-exit(r6)
        L2a:
            r3 = r4
            goto L4e
        L2c:
            java.lang.Object r5 = r3.b(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L46
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L49
            android.content.res.Resources r3 = r7.getResources()     // Catch: java.lang.Throwable -> L46
            android.graphics.drawable.Drawable r3 = r5.newDrawable(r3)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r6)
            goto L4e
        L46:
            r7 = move-exception
            goto Lce
        L49:
            r3.e(r1)     // Catch: java.lang.Throwable -> L46
        L4c:
            monitor-exit(r6)
            goto L2a
        L4e:
            if (r3 == 0) goto L51
            return r3
        L51:
            dev.epro.r0.B16853324304735504143 r3 = r6.e
            if (r3 != 0) goto L57
        L55:
            r8 = r4
            goto L9a
        L57:
            r3 = 2131230776(0x7f080038, float:1.8077614E38)
            if (r8 != r3) goto L74
            android.graphics.drawable.LayerDrawable r8 = new android.graphics.drawable.LayerDrawable
            r3 = 2131230775(0x7f080037, float:1.8077612E38)
            android.graphics.drawable.Drawable r3 = r6.d(r7, r3)
            r5 = 2131230777(0x7f080039, float:1.8077616E38)
            android.graphics.drawable.Drawable r5 = r6.d(r7, r5)
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[]{r3, r5}
            r8.<init>(r3)
            goto L9a
        L74:
            r3 = 2131230811(0x7f08005b, float:1.8077685E38)
            if (r8 != r3) goto L81
            r8 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r8 = dev.epro.r0.B16853324304735504143.d(r6, r7, r8)
            goto L9a
        L81:
            r3 = 2131230810(0x7f08005a, float:1.8077683E38)
            if (r8 != r3) goto L8e
            r8 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r8 = dev.epro.r0.B16853324304735504143.d(r6, r7, r8)
            goto L9a
        L8e:
            r3 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r8 != r3) goto L55
            r8 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r8 = dev.epro.r0.B16853324304735504143.d(r6, r7, r8)
        L9a:
            if (r8 == 0) goto Lcd
            int r0 = r0.changingConfigurations
            r8.setChangingConfigurations(r0)
            monitor-enter(r6)
            android.graphics.drawable.Drawable$ConstantState r0 = r8.getConstantState()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lc9
            java.util.WeakHashMap r3 = r6.b     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> Lbd
            dev.epro.r0.A18377563779865231301 r3 = (dev.epro.r0.A18377563779865231301) r3     // Catch: java.lang.Throwable -> Lbd
            if (r3 != 0) goto Lbf
            dev.epro.r0.A18377563779865231301 r3 = new dev.epro.r0.A18377563779865231301     // Catch: java.lang.Throwable -> Lbd
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lbd
            java.util.WeakHashMap r4 = r6.b     // Catch: java.lang.Throwable -> Lbd
            r4.put(r7, r3)     // Catch: java.lang.Throwable -> Lbd
            goto Lbf
        Lbd:
            r7 = move-exception
            goto Lcb
        Lbf:
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lbd
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lbd
            r3.d(r1, r7)     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r6)
            return r8
        Lc9:
            monitor-exit(r6)
            return r8
        Lcb:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbd
            throw r7
        Lcd:
            return r8
        Lce:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L46
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5275173104802412095.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable b;
        try {
            if (!this.d) {
                this.d = true;
                Drawable d = d(context, R.drawable.abc_vector_test);
                if (d == null || (!(d instanceof R14609119592937689706) && !"android.graphics.drawable.VectorDrawable".equals(d.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            b = b(context, i);
            if (b == null) {
                b = context.getDrawable(i);
            }
            if (b != null) {
                b = h(context, i, z, b);
            }
            if (b != null) {
                T11496100853119631009.a(b);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        E8321115364184429049 e8321115364184429049;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (e8321115364184429049 = (E8321115364184429049) weakHashMap.get(context)) == null) ? null : (ColorStateList) V1475975160983963926.p(e8321115364184429049, i);
        if (colorStateList == null) {
            B16853324304735504143 b16853324304735504143 = this.e;
            if (b16853324304735504143 != null) {
                colorStateList2 = b16853324304735504143.e(context, i);
            }
            if (colorStateList2 != null) {
                a(context, i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable h(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5275173104802412095.h(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
