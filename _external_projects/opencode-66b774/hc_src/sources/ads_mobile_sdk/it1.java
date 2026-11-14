package ads_mobile_sdk;

import android.os.Bundle;
import android.view.View;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.W6853231930366344609;
import dev.epro.r0.X11644140690951955496;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class it1 {
    public int a;
    public int b;
    public String c;
    public final LinkedHashMap d;
    public Double e;
    public wf1 f;
    public wf1 g;
    public md1 h;
    public final LinkedHashMap i;
    public tx0 j;
    public View k;
    public sy0 l;
    public sy0 m;
    public q82 n;

    /* renamed from: o, reason: collision with root package name */
    public X11644140690951955496 f55o;
    public final ArrayList p;
    public tf1 q;
    public final Bundle r;
    public final float s;
    public final View t;
    public W6853231930366344609 u;
    public String v;
    public I16631908410500040363 w;

    public it1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it1)) {
            return false;
        }
        it1 it1Var = (it1) obj;
        return this.a == it1Var.a && this.b == it1Var.b && S10823041268949770285.t(this.c, it1Var.c) && this.d.equals(it1Var.d) && S10823041268949770285.t(this.e, it1Var.e) && S10823041268949770285.t(this.f, it1Var.f) && S10823041268949770285.t(this.g, it1Var.g) && S10823041268949770285.t(this.h, it1Var.h) && this.i.equals(it1Var.i) && S10823041268949770285.t(this.j, it1Var.j) && S10823041268949770285.t(this.k, it1Var.k) && S10823041268949770285.t(this.l, it1Var.l) && S10823041268949770285.t(this.m, it1Var.m) && S10823041268949770285.t(this.n, it1Var.n) && S10823041268949770285.t(this.f55o, it1Var.f55o) && this.p.equals(it1Var.p) && S10823041268949770285.t(this.q, it1Var.q) && S10823041268949770285.t(this.r, it1Var.r) && Float.compare(this.s, it1Var.s) == 0 && S10823041268949770285.t(this.t, it1Var.t) && this.u == it1Var.u && S10823041268949770285.t(this.v, it1Var.v) && S10823041268949770285.t(this.w, it1Var.w);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        int i = this.b;
        int A = (hashCode + (i == 0 ? 0 : L11610354117192841236.A(i))) * 31;
        String str = this.c;
        int hashCode2 = (this.d.hashCode() + ((A + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Double d = this.e;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        wf1 wf1Var = this.f;
        int hashCode4 = (hashCode3 + (wf1Var == null ? 0 : wf1Var.hashCode())) * 31;
        wf1 wf1Var2 = this.g;
        int hashCode5 = (hashCode4 + (wf1Var2 == null ? 0 : wf1Var2.hashCode())) * 31;
        md1 md1Var = this.h;
        int hashCode6 = (this.i.hashCode() + ((hashCode5 + (md1Var == null ? 0 : md1Var.hashCode())) * 31)) * 31;
        tx0 tx0Var = this.j;
        int hashCode7 = (hashCode6 + (tx0Var == null ? 0 : tx0Var.hashCode())) * 31;
        View view = this.k;
        int hashCode8 = (hashCode7 + (view == null ? 0 : view.hashCode())) * 31;
        sy0 sy0Var = this.l;
        int hashCode9 = (hashCode8 + (sy0Var == null ? 0 : sy0Var.hashCode())) * 31;
        sy0 sy0Var2 = this.m;
        int hashCode10 = (hashCode9 + (sy0Var2 == null ? 0 : sy0Var2.hashCode())) * 31;
        q82 q82Var = this.n;
        int hashCode11 = (hashCode10 + (q82Var == null ? 0 : q82Var.hashCode())) * 31;
        X11644140690951955496 x11644140690951955496 = this.f55o;
        int k = G6547577305291411977.k(this.p, (hashCode11 + (x11644140690951955496 == null ? 0 : x11644140690951955496.hashCode())) * 31, 31);
        tf1 tf1Var = this.q;
        int e = E12098517352909843120.e(this.s, (this.r.hashCode() + ((k + (tf1Var == null ? 0 : tf1Var.hashCode())) * 31)) * 31, 31);
        View view2 = this.t;
        int hashCode12 = (e + (view2 == null ? 0 : view2.hashCode())) * 31;
        W6853231930366344609 w6853231930366344609 = this.u;
        int hashCode13 = (hashCode12 + (w6853231930366344609 == null ? 0 : w6853231930366344609.hashCode())) * 31;
        String str2 = this.v;
        int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        I16631908410500040363 i16631908410500040363 = this.w;
        return hashCode14 + (i16631908410500040363 != null ? i16631908410500040363.a.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c;
        Double d = this.e;
        wf1 wf1Var = this.f;
        wf1 wf1Var2 = this.g;
        md1 md1Var = this.h;
        tx0 tx0Var = this.j;
        View view = this.k;
        sy0 sy0Var = this.l;
        sy0 sy0Var2 = this.m;
        q82 q82Var = this.n;
        X11644140690951955496 x11644140690951955496 = this.f55o;
        tf1 tf1Var = this.q;
        W6853231930366344609 w6853231930366344609 = this.u;
        String str2 = this.v;
        I16631908410500040363 i16631908410500040363 = this.w;
        StringBuilder q = E12098517352909843120.q(i, "NativeAdAssets(templateId=", ", nativeAdType=");
        q.append(i2 != 1 ? i2 != 2 ? "null" : "CUSTOM_NATIVE" : "NATIVE");
        q.append(", customTemplateId=");
        q.append(str);
        q.append(", stringAssets=");
        q.append(this.d);
        q.append(", starRating=");
        q.append(d);
        q.append(", image=");
        q.append(wf1Var);
        q.append(", icon=");
        q.append(wf1Var2);
        q.append(", attributionInfo=");
        q.append(md1Var);
        q.append(", customImageAssets=");
        q.append(this.i);
        q.append(", mediaWebView=");
        q.append(tx0Var);
        q.append(", mediaView=");
        q.append(view);
        q.append(", gmaWebViewVideoController=");
        q.append(sy0Var);
        q.append(", videoController=");
        q.append(sy0Var2);
        q.append(", omidSettings=");
        q.append(q82Var);
        q.append(", omidDisplayWebView=");
        q.append(x11644140690951955496);
        q.append(", muteThisAdReasons=");
        q.append(this.p);
        q.append(", defaultMuteThisAdReason=");
        q.append(tf1Var);
        q.append(", extras=");
        q.append(this.r);
        q.append(", mediaContentAspectRatio=");
        q.append(this.s);
        q.append(", adChoicesContent=");
        q.append(this.t);
        q.append(", pubProvidedAttributionInfoPlacement=");
        q.append(w6853231930366344609);
        q.append(", watermark=");
        q.append(str2);
        q.append(", adSpecificResponseInfoExtras=");
        q.append(i16631908410500040363);
        q.append(")");
        return q.toString();
    }
}
