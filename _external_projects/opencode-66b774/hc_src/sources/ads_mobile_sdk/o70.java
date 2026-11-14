package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.H9465056496122534476;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class o70 extends H9465056496122534476 {
    public final String a;
    public final String b;

    public o70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o70)) {
            return false;
        }
        o70 o70Var = (o70) obj;
        return this.a.equals(o70Var.a) && this.b.equals(o70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return E12098517352909843120.m("StringCustomAsset(key=", this.a, ", stringValue=", this.b, ")");
    }
}
