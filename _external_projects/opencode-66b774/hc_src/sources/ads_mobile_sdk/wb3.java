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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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

    /* renamed from: o, reason: collision with root package name */
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        if (dev.epro.r0.M8927913404651150384.L(r11, "Hant", true) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0193  */
    @Override // dev.epro.r0.R16693852608535438299
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(dev.epro.r0.P3477296814990354048 r13) {
        /*
            Method dump skipped, instructions count: 410
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
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        ?? r3 = this.b;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        int h = E12098517352909843120.h((i + i2) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (h + (str == null ? 0 : str.hashCode())) * 31;
        ?? r4 = this.e;
        int i3 = r4;
        if (r4 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode + i3) * 31;
        ?? r42 = this.f;
        int i5 = r42;
        if (r42 != 0) {
            i5 = 1;
        }
        int h2 = G6547577305291411977.h(E12098517352909843120.h((i4 + i5) * 31, 31, this.g), 31, this.h);
        String str2 = this.i;
        int hashCode2 = (h2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int j = G6547577305291411977.j(H4776669175763245653.c(H4776669175763245653.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, Build.MODEL), Build.FINGERPRINT), this.m, 31);
        ?? r43 = this.n;
        int i6 = r43;
        if (r43 != 0) {
            i6 = 1;
        }
        int i7 = (j + i6) * 31;
        String str4 = this.f122o;
        int hashCode3 = (i7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ?? r32 = this.p;
        int i8 = r32;
        if (r32 != 0) {
            i8 = 1;
        }
        int h3 = U1554499319261669842.h(this.q, (hashCode3 + i8) * 31);
        ?? r33 = this.r;
        int i9 = r33;
        if (r33 != 0) {
            i9 = 1;
        }
        int i10 = (h3 + i9) * 31;
        boolean z2 = this.s;
        return i10 + (z2 ? 1 : z2 ? 1 : 0);
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
