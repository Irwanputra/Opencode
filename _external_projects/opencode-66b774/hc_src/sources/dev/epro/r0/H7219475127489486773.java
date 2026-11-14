package dev.epro.r0;

import java.io.Serializable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class H7219475127489486773 implements T1167221497807669151, Serializable {
    public final Object a;
    public final Class b;
    public final String c;
    public final String d;
    public final boolean e = false;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public H7219475127489486773(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.f = i;
        this.g = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H7219475127489486773)) {
            return false;
        }
        H7219475127489486773 h7219475127489486773 = (H7219475127489486773) obj;
        return this.e == h7219475127489486773.e && this.f == h7219475127489486773.f && this.g == h7219475127489486773.g && S10823041268949770285.t(this.a, h7219475127489486773.a) && this.b.equals(h7219475127489486773.b) && this.c.equals(h7219475127489486773.c) && this.d.equals(h7219475127489486773.d);
    }

    @Override // dev.epro.r0.T1167221497807669151
    public final int getArity() {
        return this.f;
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((((E12098517352909843120.h(E12098517352909843120.h((this.b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        J17975719213314763068.a.getClass();
        return K17660872976528163763.a(this);
    }
}
