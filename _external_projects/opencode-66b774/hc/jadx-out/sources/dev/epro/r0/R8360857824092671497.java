package dev.epro.r0;

import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R8360857824092671497 {
    public final D417720124633959953 a;
    public final int b;
    public final long c;
    public final I18150855591218230259 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Removed duplicated region for block: B:102:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public R8360857824092671497(dev.epro.r0.D417720124633959953 r22, int r23, int r24, long r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R8360857824092671497.<init>(dev.epro.r0.D417720124633959953, int, int, long):void");
    }

    public final I18150855591218230259 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        M3397403720270972864 m3397403720270972864;
        float fC = c();
        D417720124633959953 d417720124633959953 = this.a;
        N18010182420439191546 n18010182420439191546 = d417720124633959953.g;
        int i8 = d417720124633959953.l;
        M3219114150495442389 m3219114150495442389 = d417720124633959953.i;
        S16571168858015125610 s16571168858015125610 = d417720124633959953.b;
        F15297604062325019215 f15297604062325019215 = D3804951668228973856.a;
        G15798799497496144130 g15798799497496144130 = s16571168858015125610.c;
        return new I18150855591218230259(charSequence, fC, n18010182420439191546, i, truncateAt, i8, (g15798799497496144130 == null || (m3397403720270972864 = g15798799497496144130.b) == null) ? false : m3397403720270972864.a, i3, i5, i6, i7, i4, i2, m3219114150495442389);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(dev.epro.r0.S6349823729575121924 r11, int r12, dev.epro.r0.K2042933864045806308 r13) {
        /*
            r10 = this;
            android.graphics.RectF r4 = dev.epro.r0.X7410747940286448830.v(r11)
            r11 = 1
            r8 = 0
            if (r12 != 0) goto La
        L8:
            r12 = r8
            goto Ld
        La:
            if (r12 != r11) goto L8
            r12 = r11
        Ld:
            dev.epro.r0.K5271540294206541871 r6 = new dev.epro.r0.K5271540294206541871
            r0 = 3
            r6.<init>(r13, r0)
            dev.epro.r0.I18150855591218230259 r0 = r10.d
            android.text.Layout r1 = r0.f
            int r10 = android.os.Build.VERSION.SDK_INT
            r13 = 34
            if (r10 < r13) goto L23
            int[] r10 = dev.epro.r0.H3737085483209546534.f(r0, r4, r12, r6)
            goto Lb5
        L23:
            dev.epro.r0.I1581330382723795749 r2 = r0.c()
            if (r12 != r11) goto L38
            dev.epro.r0.F6353700998356592239 r10 = new dev.epro.r0.F6353700998356592239
            java.lang.CharSequence r12 = r1.getText()
            dev.epro.r0.I15162792415829416729 r13 = r0.k()
            r10.<init>(r12, r13, r8)
        L36:
            r5 = r10
            goto L4e
        L38:
            java.lang.CharSequence r12 = r1.getText()
            android.text.TextPaint r13 = r0.a
            r3 = 29
            if (r10 < r3) goto L48
            dev.epro.r0.D8146466896439970546 r10 = new dev.epro.r0.D8146466896439970546
            r10.<init>(r12, r13)
            goto L36
        L48:
            dev.epro.r0.O15443097357394408174 r10 = new dev.epro.r0.O15443097357394408174
            r10.<init>(r12)
            goto L36
        L4e:
            float r10 = r4.top
            int r10 = (int) r10
            int r10 = r1.getLineForVertical(r10)
            float r12 = r4.top
            float r13 = r0.d(r10)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L66
            int r10 = r10 + 1
            int r12 = r0.g
            if (r10 < r12) goto L66
            goto La5
        L66:
            r3 = r10
            float r10 = r4.bottom
            int r10 = (int) r10
            int r10 = r1.getLineForVertical(r10)
            if (r10 != 0) goto L7b
            float r12 = r4.bottom
            float r13 = r0.h(r8)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L7b
            goto La5
        L7b:
            r7 = 1
            int r12 = dev.epro.r0.Y14426093132713118191.o(r0, r1, r2, r3, r4, r5, r6, r7)
        L80:
            r13 = r3
            r9 = -1
            if (r12 != r9) goto L8e
            if (r13 >= r10) goto L8e
            int r3 = r13 + 1
            r7 = 1
            int r12 = dev.epro.r0.Y14426093132713118191.o(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L80
        L8e:
            if (r12 != r9) goto L91
            goto La5
        L91:
            r7 = 0
            r3 = r10
            int r10 = dev.epro.r0.Y14426093132713118191.o(r0, r1, r2, r3, r4, r5, r6, r7)
        L97:
            if (r10 != r9) goto La3
            if (r13 >= r3) goto La3
            int r3 = r3 + (-1)
            r7 = 0
            int r10 = dev.epro.r0.Y14426093132713118191.o(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L97
        La3:
            if (r10 != r9) goto La7
        La5:
            r10 = 0
            goto Lb5
        La7:
            int r12 = r12 + r11
            int r12 = r5.a(r12)
            int r10 = r10 - r11
            int r10 = r5.b(r10)
            int[] r10 = new int[]{r12, r10}
        Lb5:
            if (r10 != 0) goto Lba
            long r10 = dev.epro.r0.F12478849263529740365.b
            return r10
        Lba:
            r12 = r10[r8]
            r10 = r10[r11]
            long r10 = dev.epro.r0.T1335862270807194835.d(r12, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R8360857824092671497.b(dev.epro.r0.S6349823729575121924, int, dev.epro.r0.K2042933864045806308):long");
    }

    public final float c() {
        return I16980768508151520658.i(this.c);
    }

    public final void d(V1715405128288489768 v1715405128288489768) {
        Canvas canvasA = R14166932666867597588.a(v1715405128288489768);
        I18150855591218230259 i18150855591218230259 = this.d;
        if (i18150855591218230259.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, c(), this.f);
        }
        int i = i18150855591218230259.h;
        if (canvasA.getClipBounds(i18150855591218230259.f289o)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = Y3398285834625198673.a;
            Object l6835497148491564867 = threadLocal.get();
            if (l6835497148491564867 == null) {
                l6835497148491564867 = new L6835497148491564867();
                threadLocal.set(l6835497148491564867);
            }
            L6835497148491564867 l68354971484915648672 = (L6835497148491564867) l6835497148491564867;
            l68354971484915648672.a = canvasA;
            try {
                i18150855591218230259.f.draw(l68354971484915648672);
                if (i != 0) {
                    canvasA.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                l68354971484915648672.a = null;
            }
        }
        if (i18150855591218230259.d) {
            canvasA.restore();
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
        n18010182420439191546.c(d14208870094104617988, (((long) Float.floatToRawIntBits(c())) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), f);
        n18010182420439191546.f(h7281108764511748709);
        n18010182420439191546.g(w7621125212597703960);
        n18010182420439191546.e(q15653065705375360223);
        n18010182420439191546.b(3);
        d(v1715405128288489768);
        n18010182420439191546.b(b);
    }
}
