package ads_mobile_sdk;

import dev.epro.r0.B7506245556754967052;
import dev.epro.r0.E10962847735889454927;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.J8812673740297114457;
import dev.epro.r0.P14363171583196137821;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;
import dev.epro.r0.U4857089234315512256;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class w5 implements R16693852608535438299 {
    public final U4857089234315512256 a;
    public final long b;
    public final P14363171583196137821 f;
    public final boolean g;
    public final qw2 h;
    public final byte i;
    public final boolean j;
    public final boolean k;
    public final jr0 l;
    public final long m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f120o;

    /* JADX WARN: Multi-variable type inference failed */
    public w5(U4857089234315512256 u4857089234315512256, long j, P14363171583196137821 p14363171583196137821, boolean z, qw2 qw2Var, int i, boolean z2, boolean z3, jr0 jr0Var, long j2, boolean z4, boolean z5) {
        u4857089234315512256.getClass();
        qw2Var.getClass();
        jr0Var.getClass();
        this.a = u4857089234315512256;
        this.b = j;
        this.f = p14363171583196137821;
        this.g = z;
        this.h = qw2Var;
        this.i = i;
        this.j = z2;
        this.k = z3;
        this.l = jr0Var;
        this.m = j2;
        this.n = z4;
        this.f120o = z5;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        String str = this.f.a;
        p3477296814990354048.getClass();
        p3477296814990354048.r = this.b;
        U4857089234315512256 u4857089234315512256 = this.a;
        String e = u4857089234315512256.e();
        HashSet hashSet = u4857089234315512256.f;
        HashSet hashSet2 = u4857089234315512256.e;
        LinkedHashSet linkedHashSet = u4857089234315512256.a;
        p3477296814990354048.f429o = e;
        p3477296814990354048.H = u4857089234315512256.b;
        LinkedHashMap linkedHashMap = u4857089234315512256.c;
        if (!linkedHashMap.isEmpty() || !linkedHashSet.isEmpty()) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(linkedHashMap);
            if (!linkedHashSet.isEmpty()) {
                linkedHashMap2.put("excl_cat", R9411874267597469228.J0(linkedHashSet, ",", null, null, 0, null, 62));
            }
            p3477296814990354048.J = linkedHashMap2;
        }
        p3477296814990354048.o1 = u4857089234315512256.d;
        if (!hashSet2.isEmpty()) {
            p3477296814990354048.s = new ArrayList<>(hashSet2);
        }
        if (!hashSet.isEmpty()) {
            p3477296814990354048.I = R9411874267597469228.h1(hashSet);
        }
        p3477296814990354048.G = u4857089234315512256.h;
        p3477296814990354048.K = null;
        p3477296814990354048.B = 0;
        p3477296814990354048.L = 0;
        if (str.length() > 0) {
            p3477296814990354048.M = str;
        }
        p3477296814990354048.E = this.g;
        p3477296814990354048.M1 = Integer.valueOf(this.i);
        qw2 qw2Var = qw2.j;
        qw2 qw2Var2 = this.h;
        if (qw2Var2 == qw2Var) {
            p3477296814990354048.p = Boolean.TRUE;
        }
        if (qw2Var2 == qw2.k) {
            p3477296814990354048.q = Boolean.TRUE;
        }
        p3477296814990354048.F = this.j;
        if (this.k) {
            p3477296814990354048.P1 = Boolean.TRUE;
        }
        jr0 jr0Var = this.l;
        jr0Var.getClass();
        Boolean bool = Boolean.FALSE;
        ao aoVar = ao.a$11;
        if (((Boolean) jr0Var.a("gads:enable_time_since_sdk_init:enabled", bool, aoVar)).booleanValue()) {
            p3477296814990354048.a(Long.valueOf(this.m));
        }
        if (this.n) {
            p3477296814990354048.b();
        }
        if (this.f120o) {
            B7506245556754967052 b7506245556754967052 = jr0Var.v;
            b7506245556754967052.getClass();
            Boolean bool2 = Boolean.TRUE;
            if (((Boolean) b7506245556754967052.a("gads:pc:enabled", bool2, aoVar)).booleanValue()) {
                p3477296814990354048.e2 = bool2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj;
        return S10823041268949770285.t(this.a, w5Var.a) && this.b == w5Var.b && this.f == w5Var.f && this.g == w5Var.g && this.h == w5Var.h && this.i == w5Var.i && this.j == w5Var.j && this.k == w5Var.k && S10823041268949770285.t(this.l, w5Var.l) && this.m == w5Var.m && this.n == w5Var.n && this.f120o == w5Var.f120o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((E10962847735889454927.TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED.hashCode() + ((J8812673740297114457.TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED.hashCode() + G6547577305291411977.j(this.a.hashCode() * 31, this.b, 31)) * 31)) * 961)) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int h = U1554499319261669842.h(this.i, (this.h.hashCode() + ((hashCode + i) * 31)) * 31);
        boolean z2 = this.j;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (h + i2) * 31;
        boolean z3 = this.k;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int j = G6547577305291411977.j((this.l.hashCode() + ((i3 + i4) * 31)) * 31, this.m, 31);
        boolean z4 = this.n;
        int i5 = z4;
        if (z4 != 0) {
            i5 = 1;
        }
        int i6 = (j + i5) * 31;
        boolean z5 = this.f120o;
        return i6 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final String toString() {
        return "AdRequestSignal(adRequest=" + this.a + ", timestamp=" + this.b + ", tfcd=" + J8812673740297114457.TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED + ", tfuac=" + E10962847735889454927.TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED + ", ageRestrictedTreatment=null, maxAdContentRating=" + this.f + ", isTestRequest=" + this.g + ", requestType=" + this.h + ", publisherPrivacyPersonalizationState=" + ((int) this.i) + ", manualImpressionsRequested=" + this.j + ", isPrefetchRequest=" + this.k + ", flags=" + this.l + ", timeSinceSdkInitMs=" + this.m + ", isS2SRecursiveRequest=" + this.n + ", isPersistentCacheFillRequest=" + this.f120o + ")";
    }
}
