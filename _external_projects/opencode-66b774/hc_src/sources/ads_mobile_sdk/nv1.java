package ads_mobile_sdk;

import dev.epro.r0.L17551298460506453774;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.W8584012123181847202;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class nv1 implements R16693852608535438299 {
    public final Integer a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final String e;
    public final Boolean f;
    public final Integer g;
    public final Boolean h;
    public final L17551298460506453774 i;
    public final Boolean j;
    public final Integer k;
    public final Boolean l;
    public final Integer m;

    public nv1(Integer num, ArrayList arrayList, List list, Boolean bool, String str, Boolean bool2, Integer num2, Boolean bool3, L17551298460506453774 l17551298460506453774, Boolean bool4, Integer num3, Boolean bool5, Integer num4) {
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

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        W8584012123181847202 w8584012123181847202;
        p3477296814990354048.getClass();
        p3477296814990354048.p1 = this.a;
        List<String> list = this.b;
        if (list != null) {
            p3477296814990354048.q1 = list;
        }
        p3477296814990354048.r1 = this.c;
        p3477296814990354048.s1 = this.d;
        p3477296814990354048.t1 = this.e;
        p3477296814990354048.u1 = this.f;
        p3477296814990354048.w1 = this.g;
        p3477296814990354048.x1 = this.h;
        L17551298460506453774 l17551298460506453774 = this.i;
        if (l17551298460506453774 != null) {
            w8584012123181847202 = new W8584012123181847202(l17551298460506453774.a, l17551298460506453774.c, l17551298460506453774.b);
        } else {
            w8584012123181847202 = null;
        }
        p3477296814990354048.y1 = w8584012123181847202;
        p3477296814990354048.z1 = this.j;
        p3477296814990354048.A1 = this.k;
        p3477296814990354048.H1 = this.l;
        p3477296814990354048.U1 = this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv1)) {
            return false;
        }
        nv1 nv1Var = (nv1) obj;
        return S10823041268949770285.t(this.a, nv1Var.a) && S10823041268949770285.t(this.b, nv1Var.b) && S10823041268949770285.t(this.c, nv1Var.c) && S10823041268949770285.t(this.d, nv1Var.d) && S10823041268949770285.t(this.e, nv1Var.e) && S10823041268949770285.t(this.f, nv1Var.f) && S10823041268949770285.t(this.g, nv1Var.g) && S10823041268949770285.t(this.h, nv1Var.h) && S10823041268949770285.t(this.i, nv1Var.i) && S10823041268949770285.t(this.j, nv1Var.j) && S10823041268949770285.t(this.k, nv1Var.k) && S10823041268949770285.t(this.l, nv1Var.l) && S10823041268949770285.t(this.m, nv1Var.m);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.g;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.h;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        L17551298460506453774 l17551298460506453774 = this.i;
        int hashCode9 = (hashCode8 + (l17551298460506453774 == null ? 0 : l17551298460506453774.hashCode())) * 31;
        Boolean bool4 = this.j;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num3 = this.k;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool5 = this.l;
        int hashCode12 = (hashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num4 = this.m;
        return hashCode12 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdSignal(nativeVersion=" + this.a + ", nativeTemplateIds=" + this.b + ", nativeCustomTemplates=" + this.c + ", enableNativeMediaOrientation=" + this.d + ", nativeMediaOrientation=" + this.e + ", customMuteThisAdRequested=" + this.f + ", customClickGestureDirection=" + this.g + ", customClickGestureAllowTaps=" + this.h + ", videoOptions=" + this.i + ", isImageLoadingDisabled=" + this.j + ", adChoicesPlacement=" + this.k + ", usesMediaView=" + this.l + ", numberOfAdsRequested=" + this.m + ")";
    }
}
