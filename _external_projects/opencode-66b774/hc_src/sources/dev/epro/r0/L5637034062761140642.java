package dev.epro.r0;

import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L5637034062761140642 {

    @O7462376509978667369("appInfo")
    public final I16631908410500040363 a;

    @O7462376509978667369("sdkVersion")
    public final String b;

    @O7462376509978667369("gesture")
    public final String c;

    @O7462376509978667369("isGamRegisteredTestDevice")
    public final boolean d;

    @O7462376509978667369("isSimulator")
    public final boolean e;

    @O7462376509978667369("adapters")
    public final P16422848101170923038 f;

    @O7462376509978667369("networkExtras")
    public final String g;

    @O7462376509978667369("serverData")
    public final I16631908410500040363 h;

    @O7462376509978667369("cld")
    public final I16631908410500040363 i;

    @O7462376509978667369("uiStorage")
    public final I16631908410500040363 j;

    @O7462376509978667369("userDisk")
    public final I16631908410500040363 k;

    @O7462376509978667369("openAction")
    public final String l;

    @O7462376509978667369("adSlots")
    public final I16631908410500040363 m;

    @O7462376509978667369("applicationVolume")
    public final float n;

    /* renamed from: o, reason: collision with root package name */
    @O7462376509978667369("applicationMuted")
    public final boolean f348o;

    @O7462376509978667369("maxAdContentRating")
    public final String p;

    @O7462376509978667369("publisherFirstPartyIdEnabled")
    public final int q;

    @O7462376509978667369("privacy")
    public final I16631908410500040363 r;

    @O7462376509978667369("plugin")
    public final String s;

    @O7462376509978667369("internalSdkVersion")
    public final String t;

    @O7462376509978667369("decagonVersion")
    public final String u;

    @O7462376509978667369("platform")
    public final String v;

    @O7462376509978667369("osVersion")
    public final String w;

    public L5637034062761140642(I16631908410500040363 i16631908410500040363, String str, String str2, boolean z, boolean z2, P16422848101170923038 p16422848101170923038, String str3, I16631908410500040363 i166319084105000403632, I16631908410500040363 i166319084105000403633, I16631908410500040363 i166319084105000403634, I16631908410500040363 i166319084105000403635, String str4, I16631908410500040363 i166319084105000403636, float f, boolean z3, String str5, int i, I16631908410500040363 i166319084105000403637) {
        i16631908410500040363.getClass();
        str.getClass();
        str2.getClass();
        p16422848101170923038.getClass();
        str3.getClass();
        i166319084105000403632.getClass();
        i166319084105000403635.getClass();
        str4.getClass();
        i166319084105000403636.getClass();
        i166319084105000403637.getClass();
        this.a = i16631908410500040363;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = p16422848101170923038;
        this.g = str3;
        this.h = i166319084105000403632;
        this.i = i166319084105000403633;
        this.j = i166319084105000403634;
        this.k = i166319084105000403635;
        this.l = str4;
        this.m = i166319084105000403636;
        this.n = f;
        this.f348o = z3;
        this.p = str5;
        this.q = i;
        this.r = i166319084105000403637;
        this.s = "";
        this.t = str;
        this.u = str;
        this.v = "ANDROID";
        String str6 = Build.VERSION.RELEASE;
        str6.getClass();
        this.w = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L5637034062761140642)) {
            return false;
        }
        L5637034062761140642 l5637034062761140642 = (L5637034062761140642) obj;
        return S10823041268949770285.t(this.a, l5637034062761140642.a) && S10823041268949770285.t(this.b, l5637034062761140642.b) && S10823041268949770285.t(this.c, l5637034062761140642.c) && this.d == l5637034062761140642.d && this.e == l5637034062761140642.e && S10823041268949770285.t(this.f, l5637034062761140642.f) && S10823041268949770285.t(this.g, l5637034062761140642.g) && S10823041268949770285.t(this.h, l5637034062761140642.h) && S10823041268949770285.t(this.i, l5637034062761140642.i) && S10823041268949770285.t(this.j, l5637034062761140642.j) && S10823041268949770285.t(this.k, l5637034062761140642.k) && S10823041268949770285.t(this.l, l5637034062761140642.l) && S10823041268949770285.t(this.m, l5637034062761140642.m) && Float.compare(this.n, l5637034062761140642.n) == 0 && this.f348o == l5637034062761140642.f348o && S10823041268949770285.t(this.p, l5637034062761140642.p) && this.q == l5637034062761140642.q && S10823041268949770285.t(this.r, l5637034062761140642.r) && S10823041268949770285.t(this.s, l5637034062761140642.s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int c = H4776669175763245653.c(H4776669175763245653.c(this.a.a.hashCode() * 31, this.b), this.c);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (c + i) * 31;
        boolean z2 = this.e;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int e = E12098517352909843120.e(this.n, (this.m.a.hashCode() + H4776669175763245653.c((this.k.a.hashCode() + ((this.j.a.hashCode() + ((this.i.a.hashCode() + ((this.h.a.hashCode() + H4776669175763245653.c((this.f.a.hashCode() + ((i2 + i3) * 31)) * 31, this.g)) * 31)) * 31)) * 31)) * 31, this.l)) * 31, 31);
        boolean z3 = this.f348o;
        return this.s.hashCode() + ((this.r.a.hashCode() + U1554499319261669842.h(this.q, H4776669175763245653.c((e + (z3 ? 1 : z3 ? 1 : 0)) * 31, this.p))) * 31);
    }

    public final String toString() {
        I16631908410500040363 i16631908410500040363 = this.a;
        String str = this.b;
        String str2 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        P16422848101170923038 p16422848101170923038 = this.f;
        String str3 = this.g;
        I16631908410500040363 i166319084105000403632 = this.h;
        I16631908410500040363 i166319084105000403633 = this.i;
        I16631908410500040363 i166319084105000403634 = this.j;
        I16631908410500040363 i166319084105000403635 = this.k;
        String str4 = this.l;
        I16631908410500040363 i166319084105000403636 = this.m;
        float f = this.n;
        boolean z3 = this.f348o;
        String str5 = this.p;
        int i = this.q;
        I16631908410500040363 i166319084105000403637 = this.r;
        String str6 = this.s;
        StringBuilder sb = new StringBuilder("InspectorData(appInfo=");
        sb.append(i16631908410500040363);
        sb.append(", sdkVersion=");
        sb.append(str);
        sb.append(", gesture=");
        E12098517352909843120.s(str2, ", isGamRegisteredTestDevice=", ", isSimulator=", sb, z);
        sb.append(z2);
        sb.append(", adapterData=");
        sb.append(p16422848101170923038);
        sb.append(", networkExtras=");
        sb.append(str3);
        sb.append(", serverData=");
        sb.append(i166319084105000403632);
        sb.append(", cldData=");
        sb.append(i166319084105000403633);
        sb.append(", uiStorage=");
        sb.append(i166319084105000403634);
        sb.append(", userStorage=");
        sb.append(i166319084105000403635);
        sb.append(", openAction=");
        sb.append(str4);
        sb.append(", adSlotData=");
        sb.append(i166319084105000403636);
        sb.append(", applicationVolume=");
        sb.append(f);
        sb.append(", applicationMuted=");
        X2485016533998461232.j(", maxAdContentRating=", str5, ", publisherFirstPartyIdEnabled=", sb, z3);
        sb.append(i);
        sb.append(", privacy=");
        sb.append(i166319084105000403637);
        sb.append(", plugin=");
        return G6547577305291411977.u(sb, str6, ")");
    }
}
