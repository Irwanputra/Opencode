package dev.epro.r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F6507052717076293065 implements View.OnApplyWindowInsetsListener {
    public final F3160751278268780235 a;
    public N3121440022506799205 b;

    public F6507052717076293065(View view, F3160751278268780235 f3160751278268780235) {
        N3121440022506799205 n3121440022506799205B;
        this.a = f3160751278268780235;
        WeakHashMap weakHashMap = W10240872260424387225.a;
        N3121440022506799205 n3121440022506799205A = K10428636177324322555.a(view);
        if (n3121440022506799205A != null) {
            int i = Build.VERSION.SDK_INT;
            n3121440022506799205B = (i >= 36 ? new B6446223468909275612(n3121440022506799205A) : i >= 35 ? new O17126913626849052802(n3121440022506799205A) : i >= 34 ? new Q10879412431158002632(n3121440022506799205A) : i >= 31 ? new Q3455882957094431299(n3121440022506799205A) : i >= 30 ? new V18164520886680827197(n3121440022506799205A) : i >= 29 ? new D9305770446274769439(n3121440022506799205A) : new G16448537019021176841(n3121440022506799205A)).b();
        } else {
            n3121440022506799205B = null;
        }
        this.b = n3121440022506799205B;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = N3121440022506799205.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        N3121440022506799205 n3121440022506799205C = N3121440022506799205.c(windowInsets, view);
        J11937375245988738237 j11937375245988738237 = n3121440022506799205C.a;
        N3121440022506799205 n3121440022506799205A = this.b;
        if (n3121440022506799205A == null) {
            WeakHashMap weakHashMap = W10240872260424387225.a;
            n3121440022506799205A = K10428636177324322555.a(view);
            this.b = n3121440022506799205A;
        }
        if (n3121440022506799205A == null) {
            this.b = n3121440022506799205C;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            F3160751278268780235 f3160751278268780235J = V7994488537893142047.j(view);
            if (f3160751278268780235J == null || !Objects.equals((N3121440022506799205) f3160751278268780235J.b, n3121440022506799205C)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                N3121440022506799205 n3121440022506799205 = this.b;
                int i = 1;
                while (i <= 512) {
                    Z1975157152518754667 z1975157152518754667I = j11937375245988738237.i(i);
                    Z1975157152518754667 z1975157152518754667I2 = n3121440022506799205.a.i(i);
                    int i2 = z1975157152518754667I.a;
                    int i3 = z1975157152518754667I.d;
                    int i4 = z1975157152518754667I.c;
                    int i5 = z1975157152518754667I.b;
                    int i6 = z1975157152518754667I2.a;
                    int i7 = z1975157152518754667I2.d;
                    int[] iArr4 = iArr2;
                    int i8 = z1975157152518754667I2.c;
                    int i9 = z1975157152518754667I2.b;
                    if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
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
                int i10 = iArr2[0];
                int i11 = iArr3[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = n3121440022506799205C;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    N3121440022506799205 n31214400225067992052 = this.b;
                    Q12598757537405990809 q12598757537405990809 = new Q12598757537405990809(i12, (i10 & 8) != 0 ? V7994488537893142047.e : (i11 & 8) != 0 ? V7994488537893142047.f : (i10 & 519) != 0 ? V7994488537893142047.g : (i11 & 519) != 0 ? V7994488537893142047.h : null, (i12 & 8) != 0 ? 160L : 250L);
                    q12598757537405990809.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(q12598757537405990809.a.b());
                    Z1975157152518754667 z1975157152518754667I3 = j11937375245988738237.i(i12);
                    Z1975157152518754667 z1975157152518754667I4 = n31214400225067992052.a.i(i12);
                    int iMin = Math.min(z1975157152518754667I3.a, z1975157152518754667I4.a);
                    int i13 = z1975157152518754667I3.b;
                    int i14 = z1975157152518754667I4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = z1975157152518754667I3.c;
                    int i16 = z1975157152518754667I4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = z1975157152518754667I3.d;
                    int i18 = z1975157152518754667I4.d;
                    V10300877997588547986 v10300877997588547986 = new V10300877997588547986((Object) Z1975157152518754667.b(iMin, iMin2, iMin3, Math.min(i17, i18)), (Object) Z1975157152518754667.b(Math.max(z1975157152518754667I3.a, z1975157152518754667I4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), (byte) 29);
                    V7994488537893142047.g(view, q12598757537405990809, n3121440022506799205C, false);
                    duration.addUpdateListener(new B13711562814518287862(q12598757537405990809, n3121440022506799205C, n31214400225067992052, i12, view));
                    duration.addListener(new T1061085999498712957(view, q12598757537405990809));
                    I3522225526927885074 i3522225526927885074 = new I3522225526927885074(view, q12598757537405990809, v10300877997588547986, duration, (byte) 2);
                    if (view != null) {
                        V13503071179908527127 v13503071179908527127 = new V13503071179908527127(view, i3522225526927885074);
                        view.getViewTreeObserver().addOnPreDrawListener(v13503071179908527127);
                        view.addOnAttachStateChangeListener(v13503071179908527127);
                    } else {
                        Z3383101362411723454.k("view == null");
                    }
                    this.b = n3121440022506799205C;
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
