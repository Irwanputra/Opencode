package dev.epro.r0;

import ads_mobile_sdk.pd;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I11105136999178551542 implements S15634377979812012213, G14484913861726137649, C546526958440023066 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ L9687083612725928934 b;

    public /* synthetic */ I11105136999178551542(L9687083612725928934 l9687083612725928934, byte b) {
        this.a = b;
        this.b = l9687083612725928934;
    }

    @Override // dev.epro.r0.C546526958440023066
    public void a(T8605657386197958581 t8605657386197958581, boolean z) {
        Z6779776290352300882 z6779776290352300882;
        byte b = this.a;
        L9687083612725928934 l9687083612725928934 = this.b;
        switch (b) {
            case 2:
                l9687083612725928934.p(t8605657386197958581);
                break;
            default:
                T8605657386197958581 t8605657386197958581K = t8605657386197958581.k();
                int i = 0;
                boolean z2 = t8605657386197958581K != t8605657386197958581;
                if (z2) {
                    t8605657386197958581 = t8605657386197958581K;
                }
                Z6779776290352300882[] z6779776290352300882Arr = l9687083612725928934.J;
                int length = z6779776290352300882Arr != null ? z6779776290352300882Arr.length : 0;
                while (true) {
                    if (i >= length) {
                        z6779776290352300882 = null;
                    } else {
                        z6779776290352300882 = z6779776290352300882Arr[i];
                        if (z6779776290352300882 == null || z6779776290352300882.h != t8605657386197958581) {
                            i++;
                        }
                    }
                }
                if (z6779776290352300882 != null) {
                    if (!z2) {
                        l9687083612725928934.q(z6779776290352300882, z);
                    } else {
                        l9687083612725928934.o(z6779776290352300882.a, z6779776290352300882, t8605657386197958581K);
                        l9687083612725928934.q(z6779776290352300882, true);
                    }
                }
                break;
        }
    }

    @Override // dev.epro.r0.C546526958440023066
    public boolean b(T8605657386197958581 t8605657386197958581) {
        Window.Callback callback;
        byte b = this.a;
        L9687083612725928934 l9687083612725928934 = this.b;
        switch (b) {
            case 2:
                Window.Callback callback2 = l9687083612725928934.l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(pd.i1, t8605657386197958581);
                }
                break;
            default:
                if (t8605657386197958581 == t8605657386197958581.k() && l9687083612725928934.D && (callback = l9687083612725928934.l.getCallback()) != null && !l9687083612725928934.O) {
                    callback.onMenuOpened(pd.i1, t8605657386197958581);
                }
                break;
        }
        return true;
    }

    @Override // dev.epro.r0.S15634377979812012213
    public N3121440022506799205 h(View view, N3121440022506799205 n3121440022506799205) {
        N3121440022506799205 n3121440022506799205B = n3121440022506799205;
        J11937375245988738237 j11937375245988738237 = n3121440022506799205B.a;
        int i = j11937375245988738237.n().b;
        int i2 = j11937375245988738237.n().b;
        L9687083612725928934 l9687083612725928934 = this.b;
        ActionBarContextView actionBarContextView = l9687083612725928934.u;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l9687083612725928934.u.getLayoutParams();
            boolean z = false;
            if (l9687083612725928934.u.isShown()) {
                if (l9687083612725928934.a0 == null) {
                    l9687083612725928934.a0 = new Rect();
                    l9687083612725928934.b0 = new Rect();
                }
                Rect rect = l9687083612725928934.a0;
                Rect rect2 = l9687083612725928934.b0;
                rect.set(j11937375245988738237.n().a, j11937375245988738237.n().b, j11937375245988738237.n().c, j11937375245988738237.n().d);
                Z1975157152518754667 z1975157152518754667I = j11937375245988738237.i(2);
                ViewGroup viewGroup = l9687083612725928934.z;
                boolean z2 = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = G17670069693736004358.a;
                    N13459929895848246258.a(viewGroup, rect, rect2);
                } else {
                    if (!G17670069693736004358.a) {
                        G17670069693736004358.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            G17670069693736004358.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                G17670069693736004358.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = G17670069693736004358.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                Z1975157152518754667 z1975157152518754667B = Z1975157152518754667.b(Math.max(0, z1975157152518754667I.a - rect2.left), Math.max(0, z1975157152518754667I.b - rect2.top), Math.max(0, z1975157152518754667I.c - rect2.right), Math.max(0, z1975157152518754667I.d - rect2.bottom));
                int i3 = z1975157152518754667B.c;
                int i4 = marginLayoutParams.leftMargin;
                int i5 = z1975157152518754667B.a;
                if (i4 == i5 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i3;
                }
                ActionBarContextView actionBarContextView2 = l9687083612725928934.u;
                int i6 = rect.left - i5;
                int i7 = rect.top;
                int i8 = rect.right - i3;
                actionBarContextView2.u = i6;
                actionBarContextView2.v = i7;
                actionBarContextView2.w = i8;
                actionBarContextView2.k();
                if (!l9687083612725928934.F && rect.top > 0) {
                    i2 = 0;
                }
                z = z2;
            }
            if (z) {
                l9687083612725928934.u.setLayoutParams(marginLayoutParams);
            }
        }
        if (i != i2) {
            int i9 = j11937375245988738237.n().a;
            int i10 = j11937375245988738237.n().c;
            int i11 = j11937375245988738237.n().d;
            int i12 = Build.VERSION.SDK_INT;
            F3837300029271916472 b6446223468909275612 = i12 >= 36 ? new B6446223468909275612(n3121440022506799205B) : i12 >= 35 ? new O17126913626849052802(n3121440022506799205B) : i12 >= 34 ? new Q10879412431158002632(n3121440022506799205B) : i12 >= 31 ? new Q3455882957094431299(n3121440022506799205B) : i12 >= 30 ? new V18164520886680827197(n3121440022506799205B) : i12 >= 29 ? new D9305770446274769439(n3121440022506799205B) : new G16448537019021176841(n3121440022506799205B);
            b6446223468909275612.h(Z1975157152518754667.b(i9, i2, i10, i11));
            n3121440022506799205B = b6446223468909275612.b();
        }
        WeakHashMap weakHashMap = W10240872260424387225.a;
        WindowInsets windowInsetsB = n3121440022506799205B.b();
        if (windowInsetsB == null) {
            return n3121440022506799205B;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsB);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsB) ? N3121440022506799205.c(windowInsetsOnApplyWindowInsets, view) : n3121440022506799205B;
    }
}
