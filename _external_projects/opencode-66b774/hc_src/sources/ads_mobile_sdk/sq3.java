package ads_mobile_sdk;

import android.content.Context;
import android.view.ViewGroup;
import dev.epro.r0.U1554499319261669842;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class sq3 {
    public final ViewGroup.LayoutParams a;
    public final int b;
    public final ViewGroup c;
    public final Context d;

    public sq3(ViewGroup.LayoutParams layoutParams, int i, ViewGroup viewGroup, Context context) {
        this.a = layoutParams;
        this.b = i;
        this.c = viewGroup;
        this.d = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq3)) {
            return false;
        }
        sq3 sq3Var = (sq3) obj;
        return this.a.equals(sq3Var.a) && this.b == sq3Var.b && this.c.equals(sq3Var.c) && this.d.equals(sq3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + U1554499319261669842.h(this.b, this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WebViewParentLayoutInfo(layoutParams=" + this.a + ", index=" + this.b + ", parent=" + this.c + ", originalContext=" + this.d + ")";
    }
}
