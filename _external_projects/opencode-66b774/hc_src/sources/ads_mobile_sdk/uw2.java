package ads_mobile_sdk;

import android.graphics.Point;
import android.graphics.Rect;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.U1554499319261669842;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class uw2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final lu f;
    public final Rect g;
    public final H9390398899829886498 h;
    public final H9390398899829886498 i;

    public uw2(int i, int i2, int i3, int i4, boolean z, lu luVar, Rect rect, H9390398899829886498 h9390398899829886498, H9390398899829886498 h93903988998298864982) {
        luVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = luVar;
        this.g = rect;
        this.h = h9390398899829886498;
        this.i = h93903988998298864982;
    }

    public final Point a() {
        Rect rect = this.g;
        int i = rect.left + this.c;
        int i2 = rect.top + this.d;
        if (!this.e) {
            H9390398899829886498 h9390398899829886498 = this.i;
            int intValue = ((Number) h9390398899829886498.a).intValue();
            int intValue2 = ((Number) h9390398899829886498.b).intValue();
            int intValue3 = ((Number) this.h.a).intValue();
            if (i < 0) {
                i = 0;
            } else {
                int i3 = this.a;
                if (i + i3 > intValue3) {
                    i = intValue3 - i3;
                }
            }
            if (i2 < intValue) {
                i2 = intValue;
            } else {
                int i4 = this.b;
                if (i2 + i4 > intValue2) {
                    i2 = intValue2 - i4;
                }
            }
        }
        return new Point(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw2)) {
            return false;
        }
        uw2 uw2Var = (uw2) obj;
        return this.a == uw2Var.a && this.b == uw2Var.b && this.c == uw2Var.c && this.d == uw2Var.d && this.e == uw2Var.e && this.f == uw2Var.f && this.g.equals(uw2Var.g) && this.h.equals(uw2Var.h) && this.i.equals(uw2Var.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int h = U1554499319261669842.h(this.d, U1554499319261669842.h(this.c, U1554499319261669842.h(this.b, Integer.hashCode(this.a) * 31)));
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((h + i) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder p = E12098517352909843120.p(this.a, this.b, "ResizeParams(widthDips=", ", heightDips=", ", offsetXDips=");
        G6547577305291411977.A(p, this.c, ", offsetYDips=", this.d, ", allowOffScreen=");
        p.append(this.e);
        p.append(", closeButtonPosition=");
        p.append(this.f);
        p.append(", originalAdPosition=");
        p.append(this.g);
        p.append(", activityWindowDimensions=");
        p.append(this.h);
        p.append(", activityVerticalLimits=");
        p.append(this.i);
        p.append(")");
        return p.toString();
    }
}
