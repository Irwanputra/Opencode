package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class mi3 {
    public final ur2 a;
    public fh1 b;
    public tu2 c;
    public s8 d;

    public mi3(ur2 ur2Var, fh1 fh1Var, tu2 tu2Var, s8 s8Var) {
        ur2Var.getClass();
        fh1Var.getClass();
        tu2Var.getClass();
        s8Var.getClass();
        this.a = ur2Var;
        this.b = fh1Var;
        this.c = tu2Var;
        this.d = s8Var;
    }

    public final void a(mi3 mi3Var) {
        mi3Var.getClass();
        fh1 fh1Var = mi3Var.b;
        fh1 fh1Var2 = this.b;
        fh1Var2.b = fh1Var.b;
        fh1Var2.a = fh1Var.a;
        fh1Var2.e = fh1Var.e;
        fh1Var2.d = fh1Var.d;
        fh1Var2.c = fh1Var.c;
        fh1Var2.f = fh1Var.f;
        tu2 tu2Var = mi3Var.c;
        tu2 tu2Var2 = this.c;
        tu2Var2.b = tu2Var.b;
        tu2Var2.d = tu2Var.d;
        tu2Var2.a = tu2Var.a;
        tu2Var2.c = tu2Var.c;
        tu2Var2.f = tu2Var.f;
        tu2Var2.h = tu2Var.h;
        s8 s8Var = mi3Var.d;
        s8 s8Var2 = this.d;
        s8Var2.b = s8Var.b;
        s8Var2.c = s8Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi3)) {
            return false;
        }
        mi3 mi3Var = (mi3) obj;
        return S10823041268949770285.t(this.a, mi3Var.a) && S10823041268949770285.t(this.b, mi3Var.b) && S10823041268949770285.t(this.c, mi3Var.c) && S10823041268949770285.t(this.d, mi3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TraceMetaSet(publisherRequestTraceMeta=" + this.a + ", internalRequestTraceMeta=" + this.b + ", renderTraceMeta=" + this.c + ", adTraceMeta=" + this.d + ")";
    }
}
