package dev.epro.r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F6507052717076293065 implements View.OnApplyWindowInsetsListener {
    public final F3160751278268780235 a;
    public N3121440022506799205 b;

    public F6507052717076293065(View view, F3160751278268780235 f3160751278268780235) {
        N3121440022506799205 n3121440022506799205;
        this.a = f3160751278268780235;
        WeakHashMap weakHashMap = W10240872260424387225.a;
        N3121440022506799205 a = K10428636177324322555.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            n3121440022506799205 = (i >= 36 ? new B6446223468909275612(a) : i >= 35 ? new O17126913626849052802(a) : i >= 34 ? new Q10879412431158002632(a) : i >= 31 ? new Q3455882957094431299(a) : i >= 30 ? new V18164520886680827197(a) : i >= 29 ? new D9305770446274769439(a) : new G16448537019021176841(a)).b();
        } else {
            n3121440022506799205 = null;
        }
        this.b = n3121440022506799205;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = N3121440022506799205.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        N3121440022506799205 c = N3121440022506799205.c(windowInsets, view);
        J11937375245988738237 j11937375245988738237 = c.a;
        N3121440022506799205 n3121440022506799205 = this.b;
        if (n3121440022506799205 == null) {
            WeakHashMap weakHashMap = W10240872260424387225.a;
            n3121440022506799205 = K10428636177324322555.a(view);
            this.b = n3121440022506799205;
        }
        if (n3121440022506799205 == null) {
            this.b = c;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            F3160751278268780235 j = V7994488537893142047.j(view);
            if (j == null || !Objects.equals((N3121440022506799205) j.b, c)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                N3121440022506799205 n31214400225067992052 = this.b;
                int i = 1;
                while (i <= 512) {
                    Z1975157152518754667 i2 = j11937375245988738237.i(i);
                    Z1975157152518754667 i3 = n31214400225067992052.a.i(i);
                    int i4 = i2.a;
                    int i5 = i2.d;
                    int i6 = i2.c;
                    int i7 = i2.b;
                    int i8 = i3.a;
                    int i9 = i3.d;
                    int[] iArr4 = iArr2;
                    int i10 = i3.c;
                    int i11 = i3.b;
                    if (i4 > i8 || i7 > i11 || i6 > i10 || i5 > i9) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i4 < i8 || i7 < i11 || i6 < i10 || i5 < i9)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i;
                        } else {
                            iArr[0] = iArr[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i12 = iArr2[0];
                int i13 = iArr3[0];
                int i14 = i12 | i13;
                if (i14 == 0) {
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    N3121440022506799205 n31214400225067992053 = this.b;
                    Q12598757537405990809 q12598757537405990809 = new Q12598757537405990809(i14, (i12 & 8) != 0 ? V7994488537893142047.e : (i13 & 8) != 0 ? V7994488537893142047.f : (i12 & 519) != 0 ? V7994488537893142047.g : (i13 & 519) != 0 ? V7994488537893142047.h : null, (i14 & 8) != 0 ? 160L : 250L);
                    q12598757537405990809.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(q12598757537405990809.a.b());
                    Z1975157152518754667 i15 = j11937375245988738237.i(i14);
                    Z1975157152518754667 i16 = n31214400225067992053.a.i(i14);
                    int min = Math.min(i15.a, i16.a);
                    int i17 = i15.b;
                    int i18 = i16.b;
                    int min2 = Math.min(i17, i18);
                    int i19 = i15.c;
                    int i20 = i16.c;
                    int min3 = Math.min(i19, i20);
                    int i21 = i15.d;
                    int i22 = i16.d;
                    V10300877997588547986 v10300877997588547986 = new V10300877997588547986((Object) Z1975157152518754667.b(min, min2, min3, Math.min(i21, i22)), (Object) Z1975157152518754667.b(Math.max(i15.a, i16.a), Math.max(i17, i18), Math.max(i19, i20), Math.max(i21, i22)), (byte) 29);
                    V7994488537893142047.g(view, q12598757537405990809, c, false);
                    duration.addUpdateListener(new B13711562814518287862(q12598757537405990809, c, n31214400225067992053, i14, view));
                    duration.addListener(new T1061085999498712957(view, q12598757537405990809));
                    I3522225526927885074 i3522225526927885074 = new I3522225526927885074(view, q12598757537405990809, v10300877997588547986, duration, (byte) 2);
                    if (view != null) {
                        V13503071179908527127 v13503071179908527127 = new V13503071179908527127(view, i3522225526927885074);
                        view.getViewTreeObserver().addOnPreDrawListener(v13503071179908527127);
                        view.addOnAttachStateChangeListener(v13503071179908527127);
                    } else {
                        Z3383101362411723454.k("view == null");
                    }
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
