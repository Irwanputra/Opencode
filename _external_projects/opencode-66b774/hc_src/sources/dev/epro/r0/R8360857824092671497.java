package dev.epro.r0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R8360857824092671497 {
    public final D417720124633959953 a;
    public final int b;
    public final long c;
    public final I18150855591218230259 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public R8360857824092671497(dev.epro.r0.D417720124633959953 r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R8360857824092671497.<init>(dev.epro.r0.D417720124633959953, int, int, long):void");
    }

    public final I18150855591218230259 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        M3397403720270972864 m3397403720270972864;
        float c = c();
        D417720124633959953 d417720124633959953 = this.a;
        N18010182420439191546 n18010182420439191546 = d417720124633959953.g;
        int i8 = d417720124633959953.l;
        M3219114150495442389 m3219114150495442389 = d417720124633959953.i;
        S16571168858015125610 s16571168858015125610 = d417720124633959953.b;
        F15297604062325019215 f15297604062325019215 = D3804951668228973856.a;
        G15798799497496144130 g15798799497496144130 = s16571168858015125610.c;
        return new I18150855591218230259(charSequence, c, n18010182420439191546, i, truncateAt, i8, (g15798799497496144130 == null || (m3397403720270972864 = g15798799497496144130.b) == null) ? false : m3397403720270972864.a, i3, i5, i6, i7, i4, i2, m3219114150495442389);
    }

    public final long b(S6349823729575121924 s6349823729575121924, int i, K2042933864045806308 k2042933864045806308) {
        T16404477825665144123 d8146466896439970546;
        int i2;
        int[] iArr;
        RectF v = X7410747940286448830.v(s6349823729575121924);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        K5271540294206541871 k5271540294206541871 = new K5271540294206541871(k2042933864045806308, (byte) 3);
        I18150855591218230259 i18150855591218230259 = this.d;
        Layout layout = i18150855591218230259.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArr = H3737085483209546534.f(i18150855591218230259, v, i3, k5271540294206541871);
        } else {
            I1581330382723795749 c = i18150855591218230259.c();
            if (i3 == 1) {
                d8146466896439970546 = new F6353700998356592239(layout.getText(), i18150855591218230259.k(), (byte) 0);
            } else {
                CharSequence text = layout.getText();
                d8146466896439970546 = i4 >= 29 ? new D8146466896439970546(text, i18150855591218230259.a) : new O15443097357394408174(text);
            }
            T16404477825665144123 t16404477825665144123 = d8146466896439970546;
            int lineForVertical = layout.getLineForVertical((int) v.top);
            if (v.top <= i18150855591218230259.d(lineForVertical) || (lineForVertical = lineForVertical + 1) < i18150855591218230259.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) v.bottom);
                if (lineForVertical2 != 0 || v.bottom >= i18150855591218230259.h(0)) {
                    int o2 = Y14426093132713118191.o(i18150855591218230259, layout, c, i5, v, t16404477825665144123, k5271540294206541871, true);
                    while (true) {
                        i2 = i5;
                        if (o2 != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        o2 = Y14426093132713118191.o(i18150855591218230259, layout, c, i5, v, t16404477825665144123, k5271540294206541871, true);
                    }
                    if (o2 != -1) {
                        int i6 = lineForVertical2;
                        int o3 = Y14426093132713118191.o(i18150855591218230259, layout, c, i6, v, t16404477825665144123, k5271540294206541871, false);
                        while (o3 == -1 && i2 < i6) {
                            i6--;
                            o3 = Y14426093132713118191.o(i18150855591218230259, layout, c, i6, v, t16404477825665144123, k5271540294206541871, false);
                        }
                        if (o3 != -1) {
                            iArr = new int[]{t16404477825665144123.a(o2 + 1), t16404477825665144123.b(o3 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? F12478849263529740365.b : T1335862270807194835.d(iArr[0], iArr[1]);
    }

    public final float c() {
        return I16980768508151520658.i(this.c);
    }

    public final void d(V1715405128288489768 v1715405128288489768) {
        Canvas a = R14166932666867597588.a(v1715405128288489768);
        I18150855591218230259 i18150855591218230259 = this.d;
        if (i18150855591218230259.d) {
            a.save();
            a.clipRect(0.0f, 0.0f, c(), this.f);
        }
        int i = i18150855591218230259.h;
        if (a.getClipBounds(i18150855591218230259.f289o)) {
            if (i != 0) {
                a.translate(0.0f, i);
            }
            ThreadLocal threadLocal = Y3398285834625198673.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new L6835497148491564867();
                threadLocal.set(obj);
            }
            L6835497148491564867 l6835497148491564867 = (L6835497148491564867) obj;
            l6835497148491564867.a = a;
            try {
                i18150855591218230259.f.draw(l6835497148491564867);
                if (i != 0) {
                    a.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                l6835497148491564867.a = null;
            }
        }
        if (i18150855591218230259.d) {
            a.restore();
        }
    }

    public final void e(V1715405128288489768 v1715405128288489768, long j, H7281108764511748709 h7281108764511748709, W7621125212597703960 w7621125212597703960, Q15653065705375360223 q15653065705375360223) {
        N18010182420439191546 n18010182420439191546 = this.a.g;
        byte b = n18010182420439191546.c;
        n18010182420439191546.d(j);
        n18010182420439191546.f(h7281108764511748709);
        n18010182420439191546.g(w7621125212597703960);
        n18010182420439191546.e(q15653065705375360223);
        n18010182420439191546.b(3);
        d(v1715405128288489768);
        n18010182420439191546.b(b);
    }

    public final void f(V1715405128288489768 v1715405128288489768, D14208870094104617988 d14208870094104617988, float f, H7281108764511748709 h7281108764511748709, W7621125212597703960 w7621125212597703960, Q15653065705375360223 q15653065705375360223) {
        N18010182420439191546 n18010182420439191546 = this.a.g;
        byte b = n18010182420439191546.c;
        n18010182420439191546.c(d14208870094104617988, (Float.floatToRawIntBits(c()) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L), f);
        n18010182420439191546.f(h7281108764511748709);
        n18010182420439191546.g(w7621125212597703960);
        n18010182420439191546.e(q15653065705375360223);
        n18010182420439191546.b(3);
        d(v1715405128288489768);
        n18010182420439191546.b(b);
    }
}
