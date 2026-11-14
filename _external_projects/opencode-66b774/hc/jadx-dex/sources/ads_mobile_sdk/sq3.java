package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class sq3 {
    public final android.view.ViewGroup.LayoutParams a;
    public final int b;
    public final android.view.ViewGroup c;
    public final android.content.Context d;

    public sq3(android.view.ViewGroup.LayoutParams layoutParams, int i, android.view.ViewGroup viewGroup, android.content.Context context) {
        this.a = layoutParams;
        this.b = i;
        this.c = viewGroup;
        this.d = context;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.sq3)) {
            return false;
        }
        ads_mobile_sdk.sq3 sq3Var = (ads_mobile_sdk.sq3) obj;
        return this.a.equals(sq3Var.a) && this.b == sq3Var.b && this.c.equals(sq3Var.c) && this.d.equals(sq3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + dev.epro.r0.U1554499319261669842.h(this.b, this.a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "WebViewParentLayoutInfo(layoutParams=" + this.a + ", index=" + this.b + ", parent=" + this.c + ", originalContext=" + this.d + ")";
    }
}
