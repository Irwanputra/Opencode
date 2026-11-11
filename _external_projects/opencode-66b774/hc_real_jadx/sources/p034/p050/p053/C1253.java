package p034.p050.p053;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p034.p035.p045.C1096;
import p034.p035.p045.InterfaceC1119;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1253 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final View f6138;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C1206 f6139;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1206 f6140;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1206 f6141;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f6137 = -1;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1242 f6136 = C1242.m2867();

    public C1253(View view) {
        this.f6138 = view;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m2894(ColorStateList colorStateList) {
        if (this.f6139 == null) {
            this.f6139 = new C1206();
        }
        C1206 c1206 = this.f6139;
        c1206.f5962 = colorStateList;
        c1206.f5963 = true;
        m2898();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ColorStateList m2895() {
        C1206 c1206 = this.f6139;
        if (c1206 != null) {
            return c1206.f5962;
        }
        return null;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m2896(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f6141 == null) {
                this.f6141 = new C1206();
            }
            C1206 c1206 = this.f6141;
            c1206.f5962 = colorStateList;
            c1206.f5963 = true;
        } else {
            this.f6141 = null;
        }
        m2898();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public PorterDuff.Mode m2897() {
        C1206 c1206 = this.f6139;
        if (c1206 != null) {
            return c1206.f5960;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2898() {
        Drawable background = this.f6138.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.f6141 != null) {
                if (this.f6140 == null) {
                    this.f6140 = new C1206();
                }
                C1206 c1206 = this.f6140;
                PorterDuff.Mode mode = null;
                c1206.f5962 = null;
                c1206.f5963 = false;
                c1206.f5960 = null;
                c1206.f5961 = false;
                ColorStateList m2520 = C1096.m2520(this.f6138);
                if (m2520 != null) {
                    c1206.f5963 = true;
                    c1206.f5962 = m2520;
                }
                View view = this.f6138;
                if (i >= 21) {
                    mode = view.getBackgroundTintMode();
                } else if (view instanceof InterfaceC1119) {
                    mode = ((InterfaceC1119) view).getSupportBackgroundTintMode();
                }
                if (mode != null) {
                    c1206.f5961 = true;
                    c1206.f5960 = mode;
                }
                if (c1206.f5963 || c1206.f5961) {
                    C1242.m2869(background, c1206, this.f6138.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C1206 c12062 = this.f6139;
            if (c12062 != null) {
                C1242.m2869(background, c12062, this.f6138.getDrawableState());
                return;
            }
            C1206 c12063 = this.f6141;
            if (c12063 != null) {
                C1242.m2869(background, c12063, this.f6138.getDrawableState());
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m2899() {
        this.f6137 = -1;
        m2896(null);
        m2898();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m2900(int i) {
        this.f6137 = i;
        C1242 c1242 = this.f6136;
        m2896(c1242 != null ? c1242.m2871(this.f6138.getContext(), i) : null);
        m2898();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:3:0x001b, B:5:0x0024, B:7:0x003a, B:8:0x003d, B:10:0x0048, B:12:0x0052, B:14:0x0057, B:16:0x0061, B:22:0x006f, B:24:0x0075, B:25:0x007f, B:27:0x0083, B:29:0x0087, B:30:0x008c, B:32:0x0094, B:34:0x00a3, B:36:0x00a8, B:38:0x00b2, B:42:0x00bd, B:44:0x00c3, B:45:0x00ca, B:47:0x00ce, B:49:0x00d2), top: B:2:0x001b }] */
    /* renamed from: びぐびあび, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2901(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.view.View r0 = r9.f6138
            android.content.Context r0 = r0.getContext()
            int[] r3 = p034.p050.C1148.ViewBackgroundHelper
            r8 = 0
            づざかべべ.〺つふすそ.ぉざぅち〻.ぺづげぺが r0 = p034.p050.p053.C1260.m2910(r0, r10, r3, r11, r8)
            android.view.View r1 = r9.f6138
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f6162
            r7 = 0
            r4 = r10
            r6 = r11
            p034.p035.p045.C1096.m2493(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p034.p050.C1148.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L7d
            boolean r11 = r0.m2915(r10)     // Catch: java.lang.Throwable -> L7d
            r1 = -1
            if (r11 == 0) goto L3d
            int r10 = r0.m2922(r10, r1)     // Catch: java.lang.Throwable -> L7d
            r9.f6137 = r10     // Catch: java.lang.Throwable -> L7d
            づざかべべ.〺つふすそ.ぉざぅち〻.なぎぱいぢぎ r10 = r9.f6136     // Catch: java.lang.Throwable -> L7d
            android.view.View r11 = r9.f6138     // Catch: java.lang.Throwable -> L7d
            android.content.Context r11 = r11.getContext()     // Catch: java.lang.Throwable -> L7d
            int r2 = r9.f6137     // Catch: java.lang.Throwable -> L7d
            android.content.res.ColorStateList r10 = r10.m2871(r11, r2)     // Catch: java.lang.Throwable -> L7d
            if (r10 == 0) goto L3d
            r9.m2896(r10)     // Catch: java.lang.Throwable -> L7d
        L3d:
            int r10 = p034.p050.C1148.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L7d
            boolean r11 = r0.m2915(r10)     // Catch: java.lang.Throwable -> L7d
            r2 = 1
            r3 = 21
            if (r11 == 0) goto L8c
            android.view.View r11 = r9.f6138     // Catch: java.lang.Throwable -> L7d
            android.content.res.ColorStateList r10 = r0.m2917(r10)     // Catch: java.lang.Throwable -> L7d
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7d
            if (r4 < r3) goto L83
            r11.setBackgroundTintList(r10)     // Catch: java.lang.Throwable -> L7d
            if (r4 != r3) goto L8c
            android.graphics.drawable.Drawable r10 = r11.getBackground()     // Catch: java.lang.Throwable -> L7d
            android.content.res.ColorStateList r4 = r11.getBackgroundTintList()     // Catch: java.lang.Throwable -> L7d
            if (r4 != 0) goto L6a
            android.graphics.PorterDuff$Mode r4 = r11.getBackgroundTintMode()     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L68
            goto L6a
        L68:
            r4 = 0
            goto L6b
        L6a:
            r4 = 1
        L6b:
            if (r10 == 0) goto L8c
            if (r4 == 0) goto L8c
            boolean r4 = r10.isStateful()     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L7f
            int[] r4 = r11.getDrawableState()     // Catch: java.lang.Throwable -> L7d
            r10.setState(r4)     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r10 = move-exception
            goto Ldd
        L7f:
            r11.setBackground(r10)     // Catch: java.lang.Throwable -> L7d
            goto L8c
        L83:
            boolean r4 = r11 instanceof p034.p035.p045.InterfaceC1119     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L8c
            づざかべべ.〳ぜぞぜべっ.のぷのちつ.へぬ〴づぞ r11 = (p034.p035.p045.InterfaceC1119) r11     // Catch: java.lang.Throwable -> L7d
            r11.setSupportBackgroundTintList(r10)     // Catch: java.lang.Throwable -> L7d
        L8c:
            int r10 = p034.p050.C1148.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L7d
            boolean r11 = r0.m2915(r10)     // Catch: java.lang.Throwable -> L7d
            if (r11 == 0) goto Ld7
            android.view.View r11 = r9.f6138     // Catch: java.lang.Throwable -> L7d
            int r10 = r0.m2914(r10, r1)     // Catch: java.lang.Throwable -> L7d
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = p034.p050.p053.C1210.m2697(r10, r1)     // Catch: java.lang.Throwable -> L7d
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7d
            if (r1 < r3) goto Lce
            r11.setBackgroundTintMode(r10)     // Catch: java.lang.Throwable -> L7d
            if (r1 != r3) goto Ld7
            android.graphics.drawable.Drawable r10 = r11.getBackground()     // Catch: java.lang.Throwable -> L7d
            android.content.res.ColorStateList r1 = r11.getBackgroundTintList()     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto Lb8
            android.graphics.PorterDuff$Mode r1 = r11.getBackgroundTintMode()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto Lb9
        Lb8:
            r8 = 1
        Lb9:
            if (r10 == 0) goto Ld7
            if (r8 == 0) goto Ld7
            boolean r1 = r10.isStateful()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto Lca
            int[] r1 = r11.getDrawableState()     // Catch: java.lang.Throwable -> L7d
            r10.setState(r1)     // Catch: java.lang.Throwable -> L7d
        Lca:
            r11.setBackground(r10)     // Catch: java.lang.Throwable -> L7d
            goto Ld7
        Lce:
            boolean r1 = r11 instanceof p034.p035.p045.InterfaceC1119     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto Ld7
            づざかべべ.〳ぜぞぜべっ.のぷのちつ.へぬ〴づぞ r11 = (p034.p035.p045.InterfaceC1119) r11     // Catch: java.lang.Throwable -> L7d
            r11.setSupportBackgroundTintMode(r10)     // Catch: java.lang.Throwable -> L7d
        Ld7:
            android.content.res.TypedArray r10 = r0.f6162
            r10.recycle()
            return
        Ldd:
            android.content.res.TypedArray r11 = r0.f6162
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1253.m2901(android.util.AttributeSet, int):void");
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m2902(PorterDuff.Mode mode) {
        if (this.f6139 == null) {
            this.f6139 = new C1206();
        }
        C1206 c1206 = this.f6139;
        c1206.f5960 = mode;
        c1206.f5961 = true;
        m2898();
    }
}
