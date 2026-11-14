package ads_mobile_sdk;

import android.graphics.Insets;
import android.os.Build;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class e8 implements R16693852608535438299 {
    public final String a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Insets g;
    public final String h;
    public final Boolean i;
    public final String j;
    public final String k;
    public final ArrayList l;
    public final qz2 m;
    public final boolean n;

    public e8(String str, float f, int i, int i2, int i3, int i4, Insets insets, String str2, Boolean bool, String str3, String str4, ArrayList arrayList, qz2 qz2Var, boolean z) {
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = insets;
        this.h = str2;
        this.i = bool;
        this.j = str3;
        this.k = str4;
        this.l = arrayList;
        this.m = qz2Var;
        this.n = z;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        Insets insets;
        int i;
        int i2;
        int i3;
        int i4;
        p3477296814990354048.getClass();
        p3477296814990354048.f = this.a;
        p3477296814990354048.i = this.b;
        p3477296814990354048.k = this.d;
        p3477296814990354048.j = this.c;
        p3477296814990354048.m = this.f;
        p3477296814990354048.l = this.e;
        if (Build.VERSION.SDK_INT >= 30 && (insets = this.g) != null) {
            i = insets.left;
            p3477296814990354048.t = Integer.valueOf(i);
            i2 = this.g.top;
            p3477296814990354048.u = Integer.valueOf(i2);
            i3 = this.g.right;
            p3477296814990354048.v = Integer.valueOf(i3);
            i4 = this.g.bottom;
            p3477296814990354048.w = Integer.valueOf(i4);
        }
        p3477296814990354048.d = this.h;
        p3477296814990354048.e = this.i;
        p3477296814990354048.g = this.j;
        p3477296814990354048.h = this.k;
        p3477296814990354048.b.addAll(this.l);
        qz2 qz2Var = this.m;
        if (qz2Var != null) {
            p3477296814990354048.x = Integer.valueOf(qz2Var.a);
            p3477296814990354048.y = Integer.valueOf(qz2Var.b);
            p3477296814990354048.z = Integer.valueOf(qz2Var.d);
            p3477296814990354048.A = Integer.valueOf(qz2Var.c);
        }
        p3477296814990354048.c = this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return this.a.equals(e8Var.a) && Float.compare(this.b, e8Var.b) == 0 && this.c == e8Var.c && this.d == e8Var.d && this.e == e8Var.e && this.f == e8Var.f && S10823041268949770285.t(this.g, e8Var.g) && S10823041268949770285.t(this.h, e8Var.h) && S10823041268949770285.t(this.i, e8Var.i) && S10823041268949770285.t(this.j, e8Var.j) && S10823041268949770285.t(this.k, e8Var.k) && this.l.equals(e8Var.l) && S10823041268949770285.t(this.m, e8Var.m) && this.n == e8Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int h = U1554499319261669842.h(this.f, U1554499319261669842.h(this.e, U1554499319261669842.h(this.d, U1554499319261669842.h(this.c, E12098517352909843120.e(this.b, this.a.hashCode() * 31, 31)))));
        Insets insets = this.g;
        int hashCode = (h + (insets == null ? 0 : insets.hashCode())) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.i;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.j;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int k = G6547577305291411977.k(this.l, (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        qz2 qz2Var = this.m;
        int hashCode5 = (k + (qz2Var != null ? qz2Var.hashCode() : 0)) * 31;
        boolean z = this.n;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (hashCode5 + i) * 961;
    }

    public final String toString() {
        Insets insets = this.g;
        StringBuilder sb = new StringBuilder("AdSizeSignal(formatString=");
        sb.append(this.a);
        sb.append(", screenDensity=");
        sb.append(this.b);
        sb.append(", screenWidth=");
        G6547577305291411977.A(sb, this.c, ", screenHeight=", this.d, ", screenWidthDip=");
        G6547577305291411977.A(sb, this.e, ", screenHeightDip=", this.f, ", safeAreaMarginsDip=");
        sb.append(insets);
        sb.append(", responsiveAutoFormat=");
        sb.append(this.h);
        sb.append(", isInlineAdaptive=");
        sb.append(this.i);
        sb.append(", fluidType=");
        sb.append(this.j);
        sb.append(", multipleAdSizeString=");
        sb.append(this.k);
        sb.append(", supportedAdSizes=");
        sb.append(this.l);
        sb.append(", roundedCornerRadii=");
        sb.append(this.m);
        sb.append(", isGreaterThanMaxAllowedBannerSize=");
        sb.append(this.n);
        sb.append(", maxSlotWidth=null, maxSlotHeight=null)");
        return sb.toString();
    }
}
