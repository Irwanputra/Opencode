package ads_mobile_sdk;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class wf1 {
    public final Drawable a;
    public final Uri b;
    public final double c;
    public final int d;
    public final int e;

    public wf1(BitmapDrawable bitmapDrawable, Uri uri, double d, int i, int i2) {
        this.a = bitmapDrawable;
        this.b = uri;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf1)) {
            return false;
        }
        wf1 wf1Var = (wf1) obj;
        return S10823041268949770285.t(this.a, wf1Var.a) && this.b.equals(wf1Var.b) && Double.compare(this.c, wf1Var.c) == 0 && this.d == wf1Var.d && this.e == wf1Var.e;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        return Integer.hashCode(this.e) + U1554499319261669842.h(this.d, (Double.hashCode(this.c) + ((this.b.hashCode() + ((drawable == null ? 0 : drawable.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "InternalNativeAdImage(drawable=" + this.a + ", uri=" + this.b + ", scale=" + this.c + ", width=" + this.d + ", height=" + this.e + ")";
    }
}
