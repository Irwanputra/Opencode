package dev.epro.r0;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G16448537019021176841 extends F3837300029271916472 {
    public static Field g;
    public static boolean h;
    public static Constructor i;
    public static boolean j;
    public WindowInsets e;
    public Z1975157152518754667 f;

    public G16448537019021176841() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // dev.epro.r0.F3837300029271916472
    public N3121440022506799205 b() {
        a();
        N3121440022506799205 c = N3121440022506799205.c(this.e, null);
        Z1975157152518754667[] z1975157152518754667Arr = this.b;
        J11937375245988738237 j11937375245988738237 = c.a;
        j11937375245988738237.w(z1975157152518754667Arr);
        j11937375245988738237.z(this.f);
        j11937375245988738237.v(null);
        j11937375245988738237.B(this.c);
        j11937375245988738237.C(this.d);
        return c;
    }

    @Override // dev.epro.r0.F3837300029271916472
    public void f(Z1975157152518754667 z1975157152518754667) {
        this.f = z1975157152518754667;
    }

    @Override // dev.epro.r0.F3837300029271916472
    public void h(Z1975157152518754667 z1975157152518754667) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(z1975157152518754667.a, z1975157152518754667.b, z1975157152518754667.c, z1975157152518754667.d);
        }
    }

    public G16448537019021176841(N3121440022506799205 n3121440022506799205) {
        super(n3121440022506799205);
        this.e = n3121440022506799205.b();
    }
}
