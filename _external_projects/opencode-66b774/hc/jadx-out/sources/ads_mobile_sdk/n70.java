package ads_mobile_sdk;

import dev.epro.r0.H9465056496122534476;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class n70 extends H9465056496122534476 {
    public final String a;
    public final wf1 b;

    public n70(String str, wf1 wf1Var) {
        str.getClass();
        this.a = str;
        this.b = wf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n70)) {
            return false;
        }
        n70 n70Var = (n70) obj;
        return S10823041268949770285.t(this.a, n70Var.a) && this.b.equals(n70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageCustomAsset(key=" + this.a + ", imageValue=" + this.b + ")";
    }
}
