package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class wf1 {
    public final android.graphics.drawable.Drawable a;
    public final android.net.Uri b;
    public final double c;
    public final int d;
    public final int e;

    public wf1(android.graphics.drawable.BitmapDrawable bitmapDrawable, android.net.Uri uri, double d, int i, int i2) {
        this.a = bitmapDrawable;
        this.b = uri;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.wf1)) {
            return false;
        }
        ads_mobile_sdk.wf1 wf1Var = (ads_mobile_sdk.wf1) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, wf1Var.a) && this.b.equals(wf1Var.b) && java.lang.Double.compare(this.c, wf1Var.c) == 0 && this.d == wf1Var.d && this.e == wf1Var.e;
    }

    public final int hashCode() {
        android.graphics.drawable.Drawable drawable = this.a;
        return java.lang.Integer.hashCode(this.e) + dev.epro.r0.U1554499319261669842.h(this.d, (java.lang.Double.hashCode(this.c) + ((this.b.hashCode() + ((drawable == null ? 0 : drawable.hashCode()) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "InternalNativeAdImage(drawable=" + this.a + ", uri=" + this.b + ", scale=" + this.c + ", width=" + this.d + ", height=" + this.e + ")";
    }
}
