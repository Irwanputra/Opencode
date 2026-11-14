package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mi3 {
    public final ads_mobile_sdk.ur2 a;
    public ads_mobile_sdk.fh1 b;
    public ads_mobile_sdk.tu2 c;
    public ads_mobile_sdk.s8 d;

    public mi3(ads_mobile_sdk.ur2 ur2Var, ads_mobile_sdk.fh1 fh1Var, ads_mobile_sdk.tu2 tu2Var, ads_mobile_sdk.s8 s8Var) {
        ur2Var.getClass();
        fh1Var.getClass();
        tu2Var.getClass();
        s8Var.getClass();
        this.a = ur2Var;
        this.b = fh1Var;
        this.c = tu2Var;
        this.d = s8Var;
    }

    public final void a(ads_mobile_sdk.mi3 mi3Var) {
        mi3Var.getClass();
        ads_mobile_sdk.fh1 fh1Var = mi3Var.b;
        ads_mobile_sdk.fh1 fh1Var2 = this.b;
        fh1Var2.b = fh1Var.b;
        fh1Var2.a = fh1Var.a;
        fh1Var2.e = fh1Var.e;
        fh1Var2.d = fh1Var.d;
        fh1Var2.c = fh1Var.c;
        fh1Var2.f = fh1Var.f;
        ads_mobile_sdk.tu2 tu2Var = mi3Var.c;
        ads_mobile_sdk.tu2 tu2Var2 = this.c;
        tu2Var2.b = tu2Var.b;
        tu2Var2.d = tu2Var.d;
        tu2Var2.a = tu2Var.a;
        tu2Var2.c = tu2Var.c;
        tu2Var2.f = tu2Var.f;
        tu2Var2.h = tu2Var.h;
        ads_mobile_sdk.s8 s8Var = mi3Var.d;
        ads_mobile_sdk.s8 s8Var2 = this.d;
        s8Var2.b = s8Var.b;
        s8Var2.c = s8Var.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.mi3)) {
            return false;
        }
        ads_mobile_sdk.mi3 mi3Var = (ads_mobile_sdk.mi3) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, mi3Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, mi3Var.b) && dev.epro.r0.S10823041268949770285.t(this.c, mi3Var.c) && dev.epro.r0.S10823041268949770285.t(this.d, mi3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TraceMetaSet(publisherRequestTraceMeta=" + this.a + ", internalRequestTraceMeta=" + this.b + ", renderTraceMeta=" + this.c + ", adTraceMeta=" + this.d + ")";
    }
}
