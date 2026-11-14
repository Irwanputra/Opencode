package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class it1 {
    public int a;
    public int b;
    public java.lang.String c;
    public final java.util.LinkedHashMap d;
    public java.lang.Double e;
    public ads_mobile_sdk.wf1 f;
    public ads_mobile_sdk.wf1 g;
    public ads_mobile_sdk.md1 h;
    public final java.util.LinkedHashMap i;
    public ads_mobile_sdk.tx0 j;
    public android.view.View k;
    public ads_mobile_sdk.sy0 l;
    public ads_mobile_sdk.sy0 m;
    public ads_mobile_sdk.q82 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dev.epro.r0.X11644140690951955496 f55o;
    public final java.util.ArrayList p;
    public ads_mobile_sdk.tf1 q;
    public final android.os.Bundle r;
    public final float s;
    public final android.view.View t;
    public dev.epro.r0.W6853231930366344609 u;
    public java.lang.String v;
    public dev.epro.r0.I16631908410500040363 w;

    public it1() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle bundle = new android.os.Bundle();
        this.a = -1;
        this.b = 0;
        this.c = null;
        this.d = linkedHashMap;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = linkedHashMap2;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.f55o = null;
        this.p = arrayList;
        this.q = null;
        this.r = bundle;
        this.s = 0.0f;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.it1)) {
            return false;
        }
        ads_mobile_sdk.it1 it1Var = (ads_mobile_sdk.it1) obj;
        return this.a == it1Var.a && this.b == it1Var.b && dev.epro.r0.S10823041268949770285.t(this.c, it1Var.c) && this.d.equals(it1Var.d) && dev.epro.r0.S10823041268949770285.t(this.e, it1Var.e) && dev.epro.r0.S10823041268949770285.t(this.f, it1Var.f) && dev.epro.r0.S10823041268949770285.t(this.g, it1Var.g) && dev.epro.r0.S10823041268949770285.t(this.h, it1Var.h) && this.i.equals(it1Var.i) && dev.epro.r0.S10823041268949770285.t(this.j, it1Var.j) && dev.epro.r0.S10823041268949770285.t(this.k, it1Var.k) && dev.epro.r0.S10823041268949770285.t(this.l, it1Var.l) && dev.epro.r0.S10823041268949770285.t(this.m, it1Var.m) && dev.epro.r0.S10823041268949770285.t(this.n, it1Var.n) && dev.epro.r0.S10823041268949770285.t(this.f55o, it1Var.f55o) && this.p.equals(it1Var.p) && dev.epro.r0.S10823041268949770285.t(this.q, it1Var.q) && dev.epro.r0.S10823041268949770285.t(this.r, it1Var.r) && java.lang.Float.compare(this.s, it1Var.s) == 0 && dev.epro.r0.S10823041268949770285.t(this.t, it1Var.t) && this.u == it1Var.u && dev.epro.r0.S10823041268949770285.t(this.v, it1Var.v) && dev.epro.r0.S10823041268949770285.t(this.w, it1Var.w);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.a) * 31;
        int i = this.b;
        int iA = (iHashCode + (i == 0 ? 0 : dev.epro.r0.L11610354117192841236.A(i))) * 31;
        java.lang.String str = this.c;
        int iHashCode2 = (this.d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        java.lang.Double d = this.e;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        ads_mobile_sdk.wf1 wf1Var = this.f;
        int iHashCode4 = (iHashCode3 + (wf1Var == null ? 0 : wf1Var.hashCode())) * 31;
        ads_mobile_sdk.wf1 wf1Var2 = this.g;
        int iHashCode5 = (iHashCode4 + (wf1Var2 == null ? 0 : wf1Var2.hashCode())) * 31;
        ads_mobile_sdk.md1 md1Var = this.h;
        int iHashCode6 = (this.i.hashCode() + ((iHashCode5 + (md1Var == null ? 0 : md1Var.hashCode())) * 31)) * 31;
        ads_mobile_sdk.tx0 tx0Var = this.j;
        int iHashCode7 = (iHashCode6 + (tx0Var == null ? 0 : tx0Var.hashCode())) * 31;
        android.view.View view = this.k;
        int iHashCode8 = (iHashCode7 + (view == null ? 0 : view.hashCode())) * 31;
        ads_mobile_sdk.sy0 sy0Var = this.l;
        int iHashCode9 = (iHashCode8 + (sy0Var == null ? 0 : sy0Var.hashCode())) * 31;
        ads_mobile_sdk.sy0 sy0Var2 = this.m;
        int iHashCode10 = (iHashCode9 + (sy0Var2 == null ? 0 : sy0Var2.hashCode())) * 31;
        ads_mobile_sdk.q82 q82Var = this.n;
        int iHashCode11 = (iHashCode10 + (q82Var == null ? 0 : q82Var.hashCode())) * 31;
        dev.epro.r0.X11644140690951955496 x11644140690951955496 = this.f55o;
        int iK = dev.epro.r0.G6547577305291411977.k(this.p, (iHashCode11 + (x11644140690951955496 == null ? 0 : x11644140690951955496.hashCode())) * 31, 31);
        ads_mobile_sdk.tf1 tf1Var = this.q;
        int iE = dev.epro.r0.E12098517352909843120.e(this.s, (this.r.hashCode() + ((iK + (tf1Var == null ? 0 : tf1Var.hashCode())) * 31)) * 31, 31);
        android.view.View view2 = this.t;
        int iHashCode12 = (iE + (view2 == null ? 0 : view2.hashCode())) * 31;
        dev.epro.r0.W6853231930366344609 w6853231930366344609 = this.u;
        int iHashCode13 = (iHashCode12 + (w6853231930366344609 == null ? 0 : w6853231930366344609.hashCode())) * 31;
        java.lang.String str2 = this.v;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.w;
        return iHashCode14 + (i16631908410500040363 != null ? i16631908410500040363.a.hashCode() : 0);
    }

    public final java.lang.String toString() {
        int i = this.a;
        int i2 = this.b;
        java.lang.String str = this.c;
        java.lang.Double d = this.e;
        ads_mobile_sdk.wf1 wf1Var = this.f;
        ads_mobile_sdk.wf1 wf1Var2 = this.g;
        ads_mobile_sdk.md1 md1Var = this.h;
        ads_mobile_sdk.tx0 tx0Var = this.j;
        android.view.View view = this.k;
        ads_mobile_sdk.sy0 sy0Var = this.l;
        ads_mobile_sdk.sy0 sy0Var2 = this.m;
        ads_mobile_sdk.q82 q82Var = this.n;
        dev.epro.r0.X11644140690951955496 x11644140690951955496 = this.f55o;
        ads_mobile_sdk.tf1 tf1Var = this.q;
        dev.epro.r0.W6853231930366344609 w6853231930366344609 = this.u;
        java.lang.String str2 = this.v;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.w;
        java.lang.StringBuilder sbQ = dev.epro.r0.E12098517352909843120.q(i, "NativeAdAssets(templateId=", ", nativeAdType=");
        sbQ.append(i2 != 1 ? i2 != 2 ? "null" : "CUSTOM_NATIVE" : "NATIVE");
        sbQ.append(", customTemplateId=");
        sbQ.append(str);
        sbQ.append(", stringAssets=");
        sbQ.append(this.d);
        sbQ.append(", starRating=");
        sbQ.append(d);
        sbQ.append(", image=");
        sbQ.append(wf1Var);
        sbQ.append(", icon=");
        sbQ.append(wf1Var2);
        sbQ.append(", attributionInfo=");
        sbQ.append(md1Var);
        sbQ.append(", customImageAssets=");
        sbQ.append(this.i);
        sbQ.append(", mediaWebView=");
        sbQ.append(tx0Var);
        sbQ.append(", mediaView=");
        sbQ.append(view);
        sbQ.append(", gmaWebViewVideoController=");
        sbQ.append(sy0Var);
        sbQ.append(", videoController=");
        sbQ.append(sy0Var2);
        sbQ.append(", omidSettings=");
        sbQ.append(q82Var);
        sbQ.append(", omidDisplayWebView=");
        sbQ.append(x11644140690951955496);
        sbQ.append(", muteThisAdReasons=");
        sbQ.append(this.p);
        sbQ.append(", defaultMuteThisAdReason=");
        sbQ.append(tf1Var);
        sbQ.append(", extras=");
        sbQ.append(this.r);
        sbQ.append(", mediaContentAspectRatio=");
        sbQ.append(this.s);
        sbQ.append(", adChoicesContent=");
        sbQ.append(this.t);
        sbQ.append(", pubProvidedAttributionInfoPlacement=");
        sbQ.append(w6853231930366344609);
        sbQ.append(", watermark=");
        sbQ.append(str2);
        sbQ.append(", adSpecificResponseInfoExtras=");
        sbQ.append(i16631908410500040363);
        sbQ.append(")");
        return sbQ.toString();
    }
}
