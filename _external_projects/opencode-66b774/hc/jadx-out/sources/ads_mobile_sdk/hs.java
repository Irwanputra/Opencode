package ads_mobile_sdk;

import android.util.Base64;
import androidx.webkit.WebViewCompat;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O11899788901879362309;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.R18140250564721702687;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class hs extends R18140250564721702687 {
    public final W5797197595347441198 c;
    public final op3 d;
    public final kz2 e;
    public final jr0 f;
    public final rw0 g;
    public final H15186625828076266306 h;
    public O11899788901879362309 i;
    public r6 j;
    public X7175349259954592591 k;

    public hs(W5797197595347441198 w5797197595347441198, op3 op3Var, kz2 kz2Var, jr0 jr0Var, rw0 rw0Var) {
        w5797197595347441198.getClass();
        op3Var.getClass();
        kz2Var.getClass();
        jr0Var.getClass();
        rw0Var.getClass();
        this.c = w5797197595347441198;
        this.d = op3Var;
        this.e = kz2Var;
        this.f = jr0Var;
        this.g = rw0Var;
        this.h = new H15186625828076266306();
    }

    public static final r6 a(hs hsVar) throws IOException {
        ao aoVar = ao.a$11;
        kz2 kz2Var = hsVar.e;
        wv0 wv0Var = wv0.CUI_NAME_GET_WEBVIEW_VARIATIONS;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
        if (ji3.b().a == null) {
            em2 em2VarA = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                try {
                    hsVar.d.getClass();
                    String variationsHeader = WebViewCompat.getVariationsHeader();
                    variationsHeader.getClass();
                    if (M8927913404651150384.Y(variationsHeader)) {
                        em2VarA.close();
                        return null;
                    }
                    try {
                        yr yrVarA = yr.a(Base64.decode(variationsHeader, 0));
                        jr0 jr0Var = hsVar.f;
                        jr0Var.getClass();
                        ht htVarA = ((Boolean) jr0Var.a("gads:parse_chrome_variations_client_header", Boolean.TRUE, aoVar)).booleanValue() ? ht.a(Base64.decode(variationsHeader, 2), nl0.b()) : null;
                        yrVarA.getClass();
                        r6 r6Var = new r6(variationsHeader, yrVarA, htVarA);
                        hsVar.j = r6Var;
                        em2VarA.close();
                        return r6Var;
                    } catch (Throwable th) {
                        th3 th3VarA = ji3.a();
                        th3VarA.e().m = false;
                        th3VarA.a(th);
                        em2VarA.close();
                    }
                } catch (Throwable th2) {
                    try {
                        em2VarA.b(th2);
                        if (th2 instanceof N340633841638932414) {
                            throw th2;
                        }
                        if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                            em2VarA.a(th2);
                        }
                        if (th2 instanceof P2480554073835519965) {
                            throw new lw0(th2);
                        }
                        if (th2 instanceof CancellationException) {
                            throw new du0(th2);
                        }
                        if (th2 instanceof dv0) {
                            throw th2;
                        }
                        throw new iu0(th2);
                    } finally {
                    }
                }
            } catch (Exception e) {
                th3 th3VarA2 = ji3.a();
                th3VarA2.e().m = false;
                th3VarA2.a(e);
                em2VarA.close();
            }
        } else {
            th3 th3VarA3 = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                try {
                    hsVar.d.getClass();
                    String variationsHeader2 = WebViewCompat.getVariationsHeader();
                    variationsHeader2.getClass();
                    if (M8927913404651150384.Y(variationsHeader2)) {
                        th3VarA3.close();
                        return null;
                    }
                    try {
                        yr yrVarA2 = yr.a(Base64.decode(variationsHeader2, 0));
                        jr0 jr0Var2 = hsVar.f;
                        jr0Var2.getClass();
                        ht htVarA2 = ((Boolean) jr0Var2.a("gads:parse_chrome_variations_client_header", Boolean.TRUE, aoVar)).booleanValue() ? ht.a(Base64.decode(variationsHeader2, 2), nl0.b()) : null;
                        yrVarA2.getClass();
                        r6 r6Var2 = new r6(variationsHeader2, yrVarA2, htVarA2);
                        hsVar.j = r6Var2;
                        th3VarA3.close();
                        return r6Var2;
                    } catch (Throwable th3) {
                        th3 th3VarA4 = ji3.a();
                        th3VarA4.e().m = false;
                        th3VarA4.a(th3);
                        th3VarA3.close();
                    }
                } catch (Exception e2) {
                    th3 th3VarA5 = ji3.a();
                    th3VarA5.e().m = false;
                    th3VarA5.a(e2);
                    th3VarA3.close();
                }
            } catch (Throwable th4) {
                try {
                    th3VarA3.b(th4);
                    if (th4 instanceof N340633841638932414) {
                        throw th4;
                    }
                    if (!(th4 instanceof P2480554073835519965) && !(th4 instanceof CancellationException)) {
                        th3VarA3.a(th4);
                    }
                    if (th4 instanceof P2480554073835519965) {
                        throw new lw0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new du0(th4);
                    }
                    if (th4 instanceof dv0) {
                        throw th4;
                    }
                    throw new iu0(th4);
                } finally {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.hs r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.gs
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.gs r0 = (ads_mobile_sdk.gs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.gs r0 = new ads_mobile_sdk.gs
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L51
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L2c:
            dev.epro.r0.E17665849472693074628.k(r6)
            ads_mobile_sdk.jr0 r6 = r5.f
            r6.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            ads_mobile_sdk.ao r3 = ads_mobile_sdk.ao.a$11
            java.lang.String r4 = "gads:chrome_variations_initialization_task_enabled"
            java.lang.Object r6 = r6.a(r4, r1, r3)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L51
            r0.c = r2
            java.lang.Object r5 = a(r5, r0)
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r6) goto L51
            return r6
        L51:
            ads_mobile_sdk.xu0 r5 = new ads_mobile_sdk.xu0
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hs.b(ads_mobile_sdk.hs, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        return b(this, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map a(android.net.Uri r7) {
        /*
            r6 = this;
            r7.getClass()
            ads_mobile_sdk.jr0 r0 = r6.f
            r0.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            ads_mobile_sdk.ao r2 = ads_mobile_sdk.ao.a$11
            java.lang.String r3 = "gads:parse_chrome_variations_client_header"
            java.lang.Object r1 = r0.a(r3, r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 != 0) goto L1d
            goto Lb2
        L1d:
            ads_mobile_sdk.rw0 r1 = r6.g
            boolean r3 = r1.c(r7)
            if (r3 != 0) goto L78
            boolean r3 = r1.a(r7)
            if (r3 != 0) goto L78
            boolean r3 = r1.b(r7)
            if (r3 == 0) goto Lb2
            java.lang.String r7 = r7.toString()
            ads_mobile_sdk.jr0 r1 = r1.c
            r1.getClass()
            java.lang.String r3 = "^[^?]*(/mads/gma|/gampad/ads|/pagead/ads).*"
            java.util.List r3 = dev.epro.r0.K5751602218013079365.U(r3)
            ads_mobile_sdk.ao r4 = ads_mobile_sdk.ao.a$23
            java.lang.String r5 = "gads:ad_request_url_pattern_match"
            java.lang.Object r1 = r1.a(r5, r3, r4)
            java.util.List r1 = (java.util.List) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L51
            goto Lb2
        L51:
            java.util.Iterator r1 = r1.iterator()
        L55:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            r3.getClass()
            r7.getClass()
            java.util.regex.Matcher r3 = r3.matcher(r7)
            boolean r3 = r3.find()
            if (r3 == 0) goto L55
        L78:
            ads_mobile_sdk.r6 r7 = r6.j
            if (r7 != 0) goto L88
            ads_mobile_sdk.ds r1 = new ads_mobile_sdk.ds
            r3 = 1
            r1.<init>(r6, r2, r3)
            r3 = 3
            dev.epro.r0.W5797197595347441198 r6 = r6.c
            dev.epro.r0.R7033599853981556291.E(r6, r2, r2, r1, r3)
        L88:
            if (r7 == 0) goto Lb2
            java.lang.Object r6 = r7.c
            ads_mobile_sdk.ht r6 = (ads_mobile_sdk.ht) r6
            if (r6 == 0) goto L9b
            byte[] r6 = r6.a()
            r7 = 10
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r7)
            goto L9c
        L9b:
            r6 = r2
        L9c:
            if (r6 == 0) goto Lb2
            java.lang.String r7 = "x-client-data"
            ads_mobile_sdk.ao r1 = ads_mobile_sdk.ao.a$6
            java.lang.String r2 = "gads:client_data_header"
            java.lang.Object r7 = r0.a(r2, r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map r6 = java.util.Collections.singletonMap(r7, r6)
            r6.getClass()
            return r6
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hs.a(android.net.Uri):java.util.Map");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.hs r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            boolean r0 = r12 instanceof ads_mobile_sdk.cs
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.cs r0 = (ads_mobile_sdk.cs) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.cs r0 = new ads_mobile_sdk.cs
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            dev.epro.r0.E17665849472693074628.k(r12)
            return r12
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            return r4
        L31:
            dev.epro.r0.H15186625828076266306 r11 = r0.b
            ads_mobile_sdk.hs r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r12)
            r12 = r11
            r11 = r1
            goto L5b
        L3b:
            dev.epro.r0.E17665849472693074628.k(r12)
            ads_mobile_sdk.op3 r12 = r11.d
            r12.getClass()
            java.lang.String r12 = "GET_VARIATIONS_HEADER"
            boolean r12 = dev.epro.r0.Q6344330807969154194.b(r12)
            if (r12 != 0) goto L4c
            return r4
        L4c:
            dev.epro.r0.H15186625828076266306 r12 = r11.h
            r0.a = r11
            r0.b = r12
            r0.e = r3
            java.lang.Object r1 = r12.c(r0)
            if (r1 != r5) goto L5b
            goto Lbb
        L5b:
            ads_mobile_sdk.r6 r1 = r11.j     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.W5797197595347441198 r6 = r11.c
            if (r1 == 0) goto L68
            dev.epro.r0.A18119328133183277592 r11 = dev.epro.r0.S2941385686793915703.b(r1)     // Catch: java.lang.Throwable -> L66
            goto Lac
        L66:
            r11 = move-exception
            goto Lbd
        L68:
            dev.epro.r0.O11899788901879362309 r1 = r11.i     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L6e
        L6c:
            r11 = r1
            goto Lac
        L6e:
            dev.epro.r0.G3171588458824956926 r1 = new dev.epro.r0.G3171588458824956926     // Catch: java.lang.Throwable -> L66
            r1.<init>(r11, r4, r3)     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.I3826119971291161142 r3 = dev.epro.r0.I3826119971291161142.a     // Catch: java.lang.Throwable -> L66
            r6.getClass()     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.X15965119713728731855 r7 = new dev.epro.r0.X15965119713728731855     // Catch: java.lang.Throwable -> L66
            r8 = 3
            r7.<init>(r1, r4, r8)     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.O11899788901879362309 r1 = dev.epro.r0.R7033599853981556291.l(r6, r3, r7, r2)     // Catch: java.lang.Throwable -> L66
            r11.i = r1     // Catch: java.lang.Throwable -> L66
            ads_mobile_sdk.jr0 r3 = r11.f     // Catch: java.lang.Throwable -> L66
            r3.getClass()     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = "gads:chrome_variations_refresh_enabled"
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L66
            ads_mobile_sdk.ao r10 = ads_mobile_sdk.ao.a$11     // Catch: java.lang.Throwable -> L66
            java.lang.Object r3 = r3.a(r7, r9, r10)     // Catch: java.lang.Throwable -> L66
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L66
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L6c
            dev.epro.r0.X7175349259954592591 r3 = r11.k     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L6c
            ads_mobile_sdk.ds r3 = new ads_mobile_sdk.ds     // Catch: java.lang.Throwable -> L66
            r7 = 0
            r3.<init>(r11, r4, r7)     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.X7175349259954592591 r3 = dev.epro.r0.R7033599853981556291.E(r6, r4, r4, r3, r8)     // Catch: java.lang.Throwable -> L66
            r11.k = r3     // Catch: java.lang.Throwable -> L66
            goto L6c
        Lac:
            r12.b(r4)
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r11 = r11.s(r0)
            if (r11 != r5) goto Lbc
        Lbb:
            return r5
        Lbc:
            return r11
        Lbd:
            r12.b(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hs.a(ads_mobile_sdk.hs, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
