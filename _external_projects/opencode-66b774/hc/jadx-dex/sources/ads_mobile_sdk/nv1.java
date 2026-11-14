package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class nv1 implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.Integer a;
    public final java.util.List b;
    public final java.util.List c;
    public final java.lang.Boolean d;
    public final java.lang.String e;
    public final java.lang.Boolean f;
    public final java.lang.Integer g;
    public final java.lang.Boolean h;
    public final dev.epro.r0.L17551298460506453774 i;
    public final java.lang.Boolean j;
    public final java.lang.Integer k;
    public final java.lang.Boolean l;
    public final java.lang.Integer m;

    public nv1(java.lang.Integer num, java.util.ArrayList arrayList, java.util.List list, java.lang.Boolean bool, java.lang.String str, java.lang.Boolean bool2, java.lang.Integer num2, java.lang.Boolean bool3, dev.epro.r0.L17551298460506453774 l17551298460506453774, java.lang.Boolean bool4, java.lang.Integer num3, java.lang.Boolean bool5, java.lang.Integer num4) {
        this.a = num;
        this.b = arrayList;
        this.c = list;
        this.d = bool;
        this.e = str;
        this.f = bool2;
        this.g = num2;
        this.h = bool3;
        this.i = l17551298460506453774;
        this.j = bool4;
        this.k = num3;
        this.l = bool5;
        this.m = num4;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        dev.epro.r0.W8584012123181847202 w8584012123181847202;
        p3477296814990354048.getClass();
        p3477296814990354048.p1 = this.a;
        java.util.List list = this.b;
        if (list != null) {
            p3477296814990354048.q1 = list;
        }
        p3477296814990354048.r1 = this.c;
        p3477296814990354048.s1 = this.d;
        p3477296814990354048.t1 = this.e;
        p3477296814990354048.u1 = this.f;
        p3477296814990354048.w1 = this.g;
        p3477296814990354048.x1 = this.h;
        dev.epro.r0.L17551298460506453774 l17551298460506453774 = this.i;
        if (l17551298460506453774 != null) {
            w8584012123181847202 = new dev.epro.r0.W8584012123181847202(l17551298460506453774.a, l17551298460506453774.c, l17551298460506453774.b);
        } else {
            w8584012123181847202 = null;
        }
        p3477296814990354048.y1 = w8584012123181847202;
        p3477296814990354048.z1 = this.j;
        p3477296814990354048.A1 = this.k;
        p3477296814990354048.H1 = this.l;
        p3477296814990354048.U1 = this.m;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.nv1)) {
            return false;
        }
        ads_mobile_sdk.nv1 nv1Var = (ads_mobile_sdk.nv1) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, nv1Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, nv1Var.b) && dev.epro.r0.S10823041268949770285.t(this.c, nv1Var.c) && dev.epro.r0.S10823041268949770285.t(this.d, nv1Var.d) && dev.epro.r0.S10823041268949770285.t(this.e, nv1Var.e) && dev.epro.r0.S10823041268949770285.t(this.f, nv1Var.f) && dev.epro.r0.S10823041268949770285.t(this.g, nv1Var.g) && dev.epro.r0.S10823041268949770285.t(this.h, nv1Var.h) && dev.epro.r0.S10823041268949770285.t(this.i, nv1Var.i) && dev.epro.r0.S10823041268949770285.t(this.j, nv1Var.j) && dev.epro.r0.S10823041268949770285.t(this.k, nv1Var.k) && dev.epro.r0.S10823041268949770285.t(this.l, nv1Var.l) && dev.epro.r0.S10823041268949770285.t(this.m, nv1Var.m);
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.util.List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        java.util.List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        java.lang.Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Boolean bool3 = this.h;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        dev.epro.r0.L17551298460506453774 l17551298460506453774 = this.i;
        int iHashCode9 = (iHashCode8 + (l17551298460506453774 == null ? 0 : l17551298460506453774.hashCode())) * 31;
        java.lang.Boolean bool4 = this.j;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        java.lang.Integer num3 = this.k;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.Boolean bool5 = this.l;
        int iHashCode12 = (iHashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        java.lang.Integer num4 = this.m;
        return iHashCode12 + (num4 != null ? num4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "NativeAdSignal(nativeVersion=" + this.a + ", nativeTemplateIds=" + this.b + ", nativeCustomTemplates=" + this.c + ", enableNativeMediaOrientation=" + this.d + ", nativeMediaOrientation=" + this.e + ", customMuteThisAdRequested=" + this.f + ", customClickGestureDirection=" + this.g + ", customClickGestureAllowTaps=" + this.h + ", videoOptions=" + this.i + ", isImageLoadingDisabled=" + this.j + ", adChoicesPlacement=" + this.k + ", usesMediaView=" + this.l + ", numberOfAdsRequested=" + this.m + ")";
    }
}
