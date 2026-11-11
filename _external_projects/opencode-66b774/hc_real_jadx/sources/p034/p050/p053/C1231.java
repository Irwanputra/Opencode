package p034.p050.p053;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1231 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final CompoundButton f6061;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f6063;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ColorStateList f6059 = null;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public PorterDuff.Mode f6060 = null;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f6064 = false;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f6062 = false;

    public C1231(CompoundButton compoundButton) {
        this.f6061 = compoundButton;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int m2837(int i) {
        Drawable m4804;
        return (Build.VERSION.SDK_INT >= 17 || (m4804 = C2786.m4804(this.f6061)) == null) ? i : i + m4804.getIntrinsicWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[Catch: all -> 0x008f, TRY_ENTER, TryCatch #1 {all -> 0x008f, blocks: (B:3:0x001b, B:5:0x0023, B:8:0x0029, B:11:0x003b, B:13:0x0043, B:15:0x0049, B:16:0x0056, B:18:0x005e, B:19:0x0067, B:21:0x006f, B:23:0x0081, B:24:0x0085, B:26:0x0089), top: B:2:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:3:0x001b, B:5:0x0023, B:8:0x0029, B:11:0x003b, B:13:0x0043, B:15:0x0049, B:16:0x0056, B:18:0x005e, B:19:0x0067, B:21:0x006f, B:23:0x0081, B:24:0x0085, B:26:0x0089), top: B:2:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:3:0x001b, B:5:0x0023, B:8:0x0029, B:11:0x003b, B:13:0x0043, B:15:0x0049, B:16:0x0056, B:18:0x005e, B:19:0x0067, B:21:0x006f, B:23:0x0081, B:24:0x0085, B:26:0x0089), top: B:2:0x001b }] */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2838(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f6061
            android.content.Context r0 = r0.getContext()
            int[] r3 = p034.p050.C1148.CompoundButton
            r8 = 0
            づざかべべ.〺つふすそ.ぉざぅち〻.ぺづげぺが r0 = p034.p050.p053.C1260.m2910(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f6061
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f6162
            r7 = 0
            r4 = r10
            r6 = r11
            p034.p035.p045.C1096.m2493(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p034.p050.C1148.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.m2915(r10)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L38
            int r10 = r0.m2922(r10, r8)     // Catch: java.lang.Throwable -> L8f
            if (r10 == 0) goto L38
            android.widget.CompoundButton r11 = r9.f6061     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L8f
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L8f
            android.graphics.drawable.Drawable r10 = p034.p050.p055.p056.C1266.m2928(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L8f
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L8f
            r10 = 1
            goto L39
        L38:
            r10 = 0
        L39:
            if (r10 != 0) goto L56
            int r10 = p034.p050.C1148.CompoundButton_android_button     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.m2915(r10)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L56
            int r10 = r0.m2922(r10, r8)     // Catch: java.lang.Throwable -> L8f
            if (r10 == 0) goto L56
            android.widget.CompoundButton r11 = r9.f6061     // Catch: java.lang.Throwable -> L8f
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L8f
            android.graphics.drawable.Drawable r10 = p034.p050.p055.p056.C1266.m2928(r1, r10)     // Catch: java.lang.Throwable -> L8f
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L8f
        L56:
            int r10 = p034.p050.C1148.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.m2915(r10)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L67
            android.widget.CompoundButton r11 = r9.f6061     // Catch: java.lang.Throwable -> L8f
            android.content.res.ColorStateList r10 = r0.m2917(r10)     // Catch: java.lang.Throwable -> L8f
            p237.p238.p239.p241.p242.C2786.m4760(r11, r10)     // Catch: java.lang.Throwable -> L8f
        L67:
            int r10 = p034.p050.C1148.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.m2915(r10)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L91
            android.widget.CompoundButton r11 = r9.f6061     // Catch: java.lang.Throwable -> L8f
            r1 = -1
            int r10 = r0.m2914(r10, r1)     // Catch: java.lang.Throwable -> L8f
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = p034.p050.p053.C1210.m2697(r10, r1)     // Catch: java.lang.Throwable -> L8f
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L8f
            r2 = 21
            if (r1 < r2) goto L85
            r11.setButtonTintMode(r10)     // Catch: java.lang.Throwable -> L8f
            goto L91
        L85:
            boolean r1 = r11 instanceof p034.p035.p047.InterfaceC1129     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L91
            づざかべべ.〳ぜぞぜべっ.へぬ〴づぞ.づざかべべ r11 = (p034.p035.p047.InterfaceC1129) r11     // Catch: java.lang.Throwable -> L8f
            r11.setSupportButtonTintMode(r10)     // Catch: java.lang.Throwable -> L8f
            goto L91
        L8f:
            r10 = move-exception
            goto L97
        L91:
            android.content.res.TypedArray r10 = r0.f6162
            r10.recycle()
            return
        L97:
            android.content.res.TypedArray r11 = r0.f6162
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1231.m2838(android.util.AttributeSet, int):void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2839() {
        Drawable m4804 = C2786.m4804(this.f6061);
        if (m4804 != null) {
            if (this.f6064 || this.f6062) {
                Drawable mutate = C2786.m4758(m4804).mutate();
                if (this.f6064) {
                    C2786.m4788(mutate, this.f6059);
                }
                if (this.f6062) {
                    C2786.m4802(mutate, this.f6060);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f6061.getDrawableState());
                }
                this.f6061.setButtonDrawable(mutate);
            }
        }
    }
}
