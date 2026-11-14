package ads_mobile_sdk;

import android.net.Uri;
import android.util.Base64;
import androidx.webkit.WebViewCompat;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O11899788901879362309;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.R18140250564721702687;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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

    public static final r6 a(hs hsVar) {
        ao aoVar = ao.a$11;
        kz2 kz2Var = hsVar.e;
        wv0 wv0Var = wv0.CUI_NAME_GET_WEBVIEW_VARIATIONS;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                try {
                    hsVar.d.getClass();
                    String variationsHeader = WebViewCompat.getVariationsHeader();
                    variationsHeader.getClass();
                    if (M8927913404651150384.Y(variationsHeader)) {
                        a.close();
                        return null;
                    }
                    try {
                        yr a2 = yr.a(Base64.decode(variationsHeader, 0));
                        jr0 jr0Var = hsVar.f;
                        jr0Var.getClass();
                        ht a3 = ((Boolean) jr0Var.a("gads:parse_chrome_variations_client_header", Boolean.TRUE, aoVar)).booleanValue() ? ht.a(Base64.decode(variationsHeader, 2), nl0.b()) : null;
                        a2.getClass();
                        r6 r6Var = new r6(variationsHeader, a2, a3);
                        hsVar.j = r6Var;
                        a.close();
                        return r6Var;
                    } catch (Throwable th) {
                        th3 a4 = ji3.a();
                        a4.e().m = false;
                        a4.a(th);
                        a.close();
                    }
                } catch (Throwable th2) {
                    try {
                        a.b(th2);
                        if (th2 instanceof N340633841638932414) {
                            throw th2;
                        }
                        if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                            a.a(th2);
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
                th3 a5 = ji3.a();
                a5.e().m = false;
                a5.a(e);
                a.close();
            }
        } else {
            th3 a6 = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                try {
                    hsVar.d.getClass();
                    String variationsHeader2 = WebViewCompat.getVariationsHeader();
                    variationsHeader2.getClass();
                    if (M8927913404651150384.Y(variationsHeader2)) {
                        a6.close();
                        return null;
                    }
                    try {
                        yr a7 = yr.a(Base64.decode(variationsHeader2, 0));
                        jr0 jr0Var2 = hsVar.f;
                        jr0Var2.getClass();
                        ht a8 = ((Boolean) jr0Var2.a("gads:parse_chrome_variations_client_header", Boolean.TRUE, aoVar)).booleanValue() ? ht.a(Base64.decode(variationsHeader2, 2), nl0.b()) : null;
                        a7.getClass();
                        r6 r6Var2 = new r6(variationsHeader2, a7, a8);
                        hsVar.j = r6Var2;
                        a6.close();
                        return r6Var2;
                    } catch (Throwable th3) {
                        th3 a9 = ji3.a();
                        a9.e().m = false;
                        a9.a(th3);
                        a6.close();
                    }
                } catch (Exception e2) {
                    th3 a10 = ji3.a();
                    a10.e().m = false;
                    a10.a(e2);
                    a6.close();
                }
            } catch (Throwable th4) {
                try {
                    a6.b(th4);
                    if (th4 instanceof N340633841638932414) {
                        throw th4;
                    }
                    if (!(th4 instanceof P2480554073835519965) && !(th4 instanceof CancellationException)) {
                        a6.a(th4);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
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

    public final Map a(Uri uri) {
        uri.getClass();
        jr0 jr0Var = this.f;
        jr0Var.getClass();
        R4833348786910499294 r4833348786910499294 = null;
        if (((Boolean) jr0Var.a("gads:parse_chrome_variations_client_header", Boolean.TRUE, ao.a$11)).booleanValue()) {
            rw0 rw0Var = this.g;
            if (!rw0Var.c(uri) && !rw0Var.a(uri)) {
                if (rw0Var.b(uri)) {
                    String uri2 = uri.toString();
                    jr0 jr0Var2 = rw0Var.c;
                    jr0Var2.getClass();
                    List<String> list = (List) jr0Var2.a("gads:ad_request_url_pattern_match", K5751602218013079365.U("^[^?]*(/mads/gma|/gampad/ads|/pagead/ads).*"), ao.a$23);
                    if (!list.isEmpty()) {
                        for (String str : list) {
                            str.getClass();
                            Pattern compile = Pattern.compile(str);
                            compile.getClass();
                            uri2.getClass();
                            if (compile.matcher(uri2).find()) {
                            }
                        }
                    }
                }
            }
            r6 r6Var = this.j;
            if (r6Var == null) {
                R7033599853981556291.E(this.c, null, null, new ds(this, r4833348786910499294, (byte) 1), 3);
            }
            if (r6Var != null) {
                ht htVar = (ht) r6Var.c;
                String encodeToString = htVar != null ? Base64.encodeToString(htVar.a(), 10) : null;
                if (encodeToString != null) {
                    Map singletonMap = Collections.singletonMap((String) jr0Var.a("gads:client_data_header", "x-client-data", ao.a$6), encodeToString);
                    singletonMap.getClass();
                    return singletonMap;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0058, code lost:
    
        if (r12.c(r0) == r5) goto L40;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #0 {all -> 0x0066, blocks: (B:17:0x005b, B:20:0x0061, B:25:0x0068, B:28:0x006e, B:30:0x009b, B:32:0x009f), top: B:16:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:17:0x005b, B:20:0x0061, B:25:0x0068, B:28:0x006e, B:30:0x009b, B:32:0x009f), top: B:16:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
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
