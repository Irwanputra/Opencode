package ads_mobile_sdk;

import android.os.Build;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.G9506192477171422664;
import dev.epro.r0.H4776669175763245653;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class wb3 implements R16693852608535438299 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final List h;
    public final String i;
    public final String j;
    public final long m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f122o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final boolean s;

    public wb3(boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, String str3, G9506192477171422664 g9506192477171422664, String str4, String str5, long j, boolean z5, String str6, boolean z6, int i, boolean z7, boolean z8) {
        String str7 = Build.MODEL;
        String str8 = Build.FINGERPRINT;
        g9506192477171422664.getClass();
        str7.getClass();
        str8.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = z4;
        this.g = str3;
        this.h = g9506192477171422664;
        this.i = str4;
        this.j = str5;
        this.m = j;
        this.n = z5;
        this.f122o = str6;
        this.p = z6;
        this.q = i;
        this.r = z7;
        this.s = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[PHI: r7
      0x0085: PHI (r7v2 java.lang.String) = 
      (r7v0 java.lang.String)
      (r7v0 java.lang.String)
      (r7v1 java.lang.String)
      (r7v0 java.lang.String)
      (r7v0 java.lang.String)
     binds: [B:22:0x0094, B:24:0x009c, B:38:0x00d0, B:10:0x0069, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    @Override // dev.epro.r0.R16693852608535438299
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(dev.epro.r0.P3477296814990354048 r13) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wb3.a(dev.epro.r0.P3477296814990354048):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb3)) {
            return false;
        }
        wb3 wb3Var = (wb3) obj;
        if (this.a != wb3Var.a || this.b != wb3Var.b || !this.c.equals(wb3Var.c) || !S10823041268949770285.t(this.d, wb3Var.d) || this.e != wb3Var.e || this.f != wb3Var.f || !this.g.equals(wb3Var.g) || !this.h.equals(wb3Var.h) || !S10823041268949770285.t(this.i, wb3Var.i) || !S10823041268949770285.t(this.j, wb3Var.j)) {
            return false;
        }
        String str = Build.MODEL;
        if (!S10823041268949770285.t(str, str)) {
            return false;
        }
        String str2 = Build.FINGERPRINT;
        return S10823041268949770285.t(str2, str2) && this.m == wb3Var.m && this.n == wb3Var.n && S10823041268949770285.t(this.f122o, wb3Var.f122o) && this.p == wb3Var.p && this.q == wb3Var.q && this.r == wb3Var.r && this.s == wb3Var.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.b;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int iH = E12098517352909843120.h((i + r3) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iH + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.e;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        int i2 = (iHashCode + r4) * 31;
        boolean z4 = this.f;
        ?? r42 = z4;
        if (z4) {
            r42 = 1;
        }
        int iH2 = G6547577305291411977.h(E12098517352909843120.h((i2 + r42) * 31, 31, this.g), 31, this.h);
        String str2 = this.i;
        int iHashCode2 = (iH2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iJ = G6547577305291411977.j(H4776669175763245653.c(H4776669175763245653.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, Build.MODEL), Build.FINGERPRINT), this.m, 31);
        boolean z5 = this.n;
        ?? r43 = z5;
        if (z5) {
            r43 = 1;
        }
        int i3 = (iJ + r43) * 31;
        String str4 = this.f122o;
        int iHashCode3 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z6 = this.p;
        ?? r32 = z6;
        if (z6) {
            r32 = 1;
        }
        int iH3 = U1554499319261669842.h(this.q, (iHashCode3 + r32) * 31);
        boolean z7 = this.r;
        ?? r33 = z7;
        if (z7) {
            r33 = 1;
        }
        int i4 = (iH3 + r33) * 31;
        boolean z8 = this.s;
        return i4 + (z8 ? 1 : z8);
    }

    public final String toString() {
        String str = Build.MODEL;
        String str2 = Build.FINGERPRINT;
        StringBuilder sb = new StringBuilder("StaticDeviceSignal(canOpenGeo=");
        sb.append(this.a);
        sb.append(", canOpenHttp=");
        sb.append(this.b);
        sb.append(", countryCode=");
        G6547577305291411977.B(sb, this.c, ", deviceCountryCode=", this.d, ", isEmulator=");
        E12098517352909843120.u(sb, this.e, ", isLatchskyDevice=", this.f, ", languageCode=");
        sb.append(this.g);
        sb.append(", languageCodeList=");
        sb.append(this.h);
        sb.append(", deviceLanguageCode=");
        G6547577305291411977.B(sb, this.i, ", marketVersion=", this.j, ", submodel=");
        G6547577305291411977.B(sb, str, ", buildName=", str2, ", remainingDataPartitionSpaceKilobytes=");
        sb.append(this.m);
        sb.append(", isDefaultBrowserCustomTabsCapable=");
        sb.append(this.n);
        sb.append(", playStoreVersion=");
        sb.append(this.f122o);
        sb.append(", isBattlestarDevice=");
        sb.append(this.p);
        sb.append(", buildApiLevel=");
        sb.append(this.q);
        sb.append(", isTransparentBackgroundSupported=");
        sb.append(this.r);
        sb.append(", isHsdpSupported=");
        sb.append(this.s);
        sb.append(")");
        return sb.toString();
    }
}
