package dev.epro.r0;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class H960234695227575304 extends J11937375245988738237 {
    public static boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Method f280o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public Z1975157152518754667[] d;
    public Z1975157152518754667 e;
    public N3121440022506799205 f;
    public Z1975157152518754667 g;
    public int h;
    public D14723526890230738817 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public H960234695227575304(N3121440022506799205 n3121440022506799205, WindowInsets windowInsets) {
        super(n3121440022506799205);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    private D14723526890230738817 D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return D14723526890230738817.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        Y11834541914804214684 y11834541914804214684Q = T18016951143603335921.Q(display, 0);
        Y11834541914804214684 y11834541914804214684Q2 = T18016951143603335921.Q(display, 1);
        Y11834541914804214684 y11834541914804214684Q3 = T18016951143603335921.Q(display, 2);
        Y11834541914804214684 y11834541914804214684Q4 = T18016951143603335921.Q(display, 3);
        return D14723526890230738817.a(point.x, point.y, false, y11834541914804214684Q != null ? y11834541914804214684Q.b : 0, y11834541914804214684Q2 != null ? y11834541914804214684Q2.b : 0, y11834541914804214684Q3 != null ? y11834541914804214684Q3.b : 0, y11834541914804214684Q4 != null ? y11834541914804214684Q4.b : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[B6030175592171028728.l(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(Z1975157152518754667 z1975157152518754667) {
        ArrayList arrayList = new ArrayList();
        int i = z1975157152518754667.a;
        int i2 = z1975157152518754667.d;
        int i3 = z1975157152518754667.c;
        int i4 = z1975157152518754667.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, z1975157152518754667.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private Z1975157152518754667 G(int i, boolean z) {
        Z1975157152518754667 z1975157152518754667A = Z1975157152518754667.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                z1975157152518754667A = Z1975157152518754667.a(z1975157152518754667A, H(i2, z));
            }
        }
        return z1975157152518754667A;
    }

    private Z1975157152518754667 I() {
        N3121440022506799205 n3121440022506799205 = this.f;
        return n3121440022506799205 != null ? n3121440022506799205.a.l() : Z1975157152518754667.e;
    }

    private Z1975157152518754667 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            D11988991656201568495.j("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            L();
        }
        Method method = f280o;
        if (method != null && p != null && q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    return null;
                }
                Rect rect = (Rect) q.get(r.get(objInvoke));
                if (rect != null) {
                    return Z1975157152518754667.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    private static void L() {
        try {
            f280o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void A(int i) {
        this.h = i;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public Z1975157152518754667 H(int i, boolean z) {
        Z1975157152518754667 z1975157152518754667L;
        int i2;
        Z1975157152518754667 z1975157152518754667 = Z1975157152518754667.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    Z1975157152518754667[] z1975157152518754667Arr = this.d;
                    z1975157152518754667L = z1975157152518754667Arr != null ? z1975157152518754667Arr[B6030175592171028728.l(8)] : null;
                    if (z1975157152518754667L != null) {
                        return z1975157152518754667L;
                    }
                    Z1975157152518754667 z1975157152518754667N = n();
                    Z1975157152518754667 z1975157152518754667I = I();
                    int i3 = z1975157152518754667N.d;
                    if (i3 > z1975157152518754667I.d) {
                        return Z1975157152518754667.b(0, 0, 0, i3);
                    }
                    Z1975157152518754667 z19751571525187546672 = this.g;
                    if (z19751571525187546672 != null && !z19751571525187546672.equals(z1975157152518754667) && (i2 = this.g.d) > z1975157152518754667I.d) {
                        return Z1975157152518754667.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        N3121440022506799205 n3121440022506799205 = this.f;
                        R825017289975842005 r825017289975842005H = n3121440022506799205 != null ? n3121440022506799205.a.h() : h();
                        if (r825017289975842005H != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return Z1975157152518754667.b(i4 >= 28 ? C15025379344307230271.m(r825017289975842005H.a) : 0, i4 >= 28 ? C15025379344307230271.o(r825017289975842005H.a) : 0, i4 >= 28 ? C15025379344307230271.n(r825017289975842005H.a) : 0, i4 >= 28 ? C15025379344307230271.l(r825017289975842005H.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    Z1975157152518754667 z1975157152518754667I2 = I();
                    Z1975157152518754667 z1975157152518754667L2 = l();
                    return Z1975157152518754667.b(Math.max(z1975157152518754667I2.a, z1975157152518754667L2.a), 0, Math.max(z1975157152518754667I2.c, z1975157152518754667L2.c), Math.max(z1975157152518754667I2.d, z1975157152518754667L2.d));
                }
                if ((this.h & 2) == 0) {
                    Z1975157152518754667 z1975157152518754667N2 = n();
                    N3121440022506799205 n31214400225067992052 = this.f;
                    z1975157152518754667L = n31214400225067992052 != null ? n31214400225067992052.a.l() : null;
                    int iMin = z1975157152518754667N2.d;
                    if (z1975157152518754667L != null) {
                        iMin = Math.min(iMin, z1975157152518754667L.d);
                    }
                    return Z1975157152518754667.b(z1975157152518754667N2.a, 0, z1975157152518754667N2.c, iMin);
                }
            }
        } else {
            if (z) {
                return Z1975157152518754667.b(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return Z1975157152518754667.b(0, n().b, 0, 0);
            }
        }
        return z1975157152518754667;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(Z1975157152518754667.e);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        Z1975157152518754667 z1975157152518754667J = J(view);
        if (z1975157152518754667J == null) {
            z1975157152518754667J = Z1975157152518754667.e;
        }
        x(z1975157152518754667J);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void e(N3121440022506799205 n3121440022506799205) {
        n3121440022506799205.a.y(this.f);
        Z1975157152518754667 z1975157152518754667 = this.g;
        J11937375245988738237 j11937375245988738237 = n3121440022506799205.a;
        j11937375245988738237.x(z1975157152518754667);
        j11937375245988738237.A(this.h);
        j11937375245988738237.v(this.i);
        j11937375245988738237.B(this.l);
        j11937375245988738237.C(this.m);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        H960234695227575304 h960234695227575304 = (H960234695227575304) obj;
        return Objects.equals(this.g, h960234695227575304.g) && M(this.h, h960234695227575304.h);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public Z1975157152518754667 i(int i) {
        return G(i, false);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public Z1975157152518754667 j(int i) {
        return G(i, true);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public final Z1975157152518754667 n() {
        Z1975157152518754667 z1975157152518754667 = this.e;
        if (z1975157152518754667 != null) {
            return z1975157152518754667;
        }
        WindowInsets windowInsets = this.c;
        Z1975157152518754667 z1975157152518754667B = Z1975157152518754667.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = z1975157152518754667B;
        return z1975157152518754667B;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void p(View view) {
        this.i = D(view);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iL = B6030175592171028728.l(i);
            this.l[iL] = F(i(i));
            if (i != 8) {
                this.m[iL] = F(j(i));
            }
        }
    }

    @Override // dev.epro.r0.J11937375245988738237
    public N3121440022506799205 r(int i, int i2, int i3, int i4) {
        N3121440022506799205 n3121440022506799205C = N3121440022506799205.c(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        F3837300029271916472 b6446223468909275612 = i5 >= 36 ? new B6446223468909275612(n3121440022506799205C) : i5 >= 35 ? new O17126913626849052802(n3121440022506799205C) : i5 >= 34 ? new Q10879412431158002632(n3121440022506799205C) : i5 >= 31 ? new Q3455882957094431299(n3121440022506799205C) : i5 >= 30 ? new V18164520886680827197(n3121440022506799205C) : i5 >= 29 ? new D9305770446274769439(n3121440022506799205C) : new G16448537019021176841(n3121440022506799205C);
        b6446223468909275612.h(N3121440022506799205.a(n(), i, i2, i3, i4));
        b6446223468909275612.f(N3121440022506799205.a(l(), i, i2, i3, i4));
        return b6446223468909275612.b();
    }

    @Override // dev.epro.r0.J11937375245988738237
    public boolean t() {
        return this.c.isRound();
    }

    @Override // dev.epro.r0.J11937375245988738237
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void v(D14723526890230738817 d14723526890230738817) {
        this.i = d14723526890230738817;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void w(Z1975157152518754667[] z1975157152518754667Arr) {
        this.d = z1975157152518754667Arr;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void x(Z1975157152518754667 z1975157152518754667) {
        this.g = z1975157152518754667;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void y(N3121440022506799205 n3121440022506799205) {
        this.f = n3121440022506799205;
    }

    public H960234695227575304(N3121440022506799205 n3121440022506799205, H960234695227575304 h960234695227575304) {
        this(n3121440022506799205, new WindowInsets(h960234695227575304.c));
    }
}
