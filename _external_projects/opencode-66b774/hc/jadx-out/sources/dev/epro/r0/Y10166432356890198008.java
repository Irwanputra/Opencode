package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y10166432356890198008 {
    public O8620973563946607355 a;
    public List b;
    public List c;
    public boolean d;
    public J15730374346044043770 e;

    public Y10166432356890198008(O8620973563946607355 o8620973563946607355, boolean z) {
        this.a = o8620973563946607355;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        this.b = o2161699089510411363;
        this.c = o2161699089510411363;
        this.d = z;
    }

    public abstract void b();

    public void d(F17048500263560432125 f17048500263560432125) {
        f17048500263560432125.getClass();
    }

    public final void e() {
        J15730374346044043770 j15730374346044043770 = this.e;
        if (j15730374346044043770 == null || !((K18075763046227786881) j15730374346044043770.e).h(this)) {
            return;
        }
        X3172131531941125810 x3172131531941125810 = (X3172131531941125810) j15730374346044043770.d;
        if (equals(x3172131531941125810.f)) {
            if (x3172131531941125810.g == -1) {
                a();
            }
            x3172131531941125810.f = null;
            x3172131531941125810.g = 0;
            x3172131531941125810.h = null;
        }
        x3172131531941125810.d.remove(this);
        x3172131531941125810.e.remove(this);
        this.e = null;
        x3172131531941125810.b();
    }

    public final void f(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        J15730374346044043770 j15730374346044043770 = this.e;
        if (j15730374346044043770 != null) {
            ((X3172131531941125810) j15730374346044043770.d).b();
        }
    }

    public void a() {
    }

    public void c(F17048500263560432125 f17048500263560432125) {
    }
}
