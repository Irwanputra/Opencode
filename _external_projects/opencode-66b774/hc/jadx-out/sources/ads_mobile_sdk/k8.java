package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import dev.epro.r0.A14169635274474290551;
import dev.epro.r0.B11509606741455062017;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.F7878618420024429111;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.L17385865533161060024;
import dev.epro.r0.L7743116545240101509;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.N6751852577264376817;
import dev.epro.r0.N7756202525712935399;
import dev.epro.r0.O12545633033254628644;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.Q4869062626651831947;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R735986421272980610;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.T7468265282056741718;
import dev.epro.r0.U11450443558875589191;
import dev.epro.r0.W10763134803956330397;
import dev.epro.r0.X13739385577301502566;
import dev.epro.r0.Z1953481206310471956;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class k8 extends c61 {
    public final Context c;
    public final jr0 d;
    public final rw0 e;
    public final g0 f;
    public final aw g;
    public final String h;
    public final kz2 i;
    public c7 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(Context context, jr0 jr0Var, rw0 rw0Var, g0 g0Var, aw awVar, String str, kz2 kz2Var) {
        super(wv0.CUI_NAME_SDKINIT_INIT_SPAM, 2);
        context.getClass();
        jr0Var.getClass();
        rw0Var.getClass();
        g0Var.getClass();
        awVar.getClass();
        str.getClass();
        kz2Var.getClass();
        this.c = context;
        this.d = jr0Var;
        this.e = rw0Var;
        this.f = g0Var;
        this.g = awVar;
        this.h = str;
        this.i = kz2Var;
    }

    public final String a(List list, View view) throws IOException {
        String queryParameter;
        String strA;
        if (list.isEmpty()) {
            return "";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            rw0 rw0Var = this.e;
            rw0Var.getClass();
            uri.getClass();
            if (rw0Var.b(uri) && rw0Var.a(uri) && ((queryParameter = uri.getQueryParameter("ms")) == null || M8927913404651150384.Y(queryParameter))) {
                kz2 kz2Var = this.i;
                wv0 wv0Var = wv0.CUI_NAME_CLICK_SIGNALS;
                O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
                mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
                if (ji3.b().a == null) {
                    em2 em2VarA = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                    try {
                        strA = ((f7) b().a).a(c(), a(list), view, this.f.b());
                        em2VarA.close();
                    } catch (Throwable th) {
                        try {
                            em2VarA.b(th);
                            if (th instanceof N340633841638932414) {
                                throw th;
                            }
                            if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                                em2VarA.a(th);
                            }
                            if (th instanceof P2480554073835519965) {
                                throw new lw0(th);
                            }
                            if (th instanceof CancellationException) {
                                throw new du0(th);
                            }
                            if (th instanceof dv0) {
                                throw th;
                            }
                            throw new iu0(th);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                Z1953481206310471956.z(em2VarA, th2);
                                throw th3;
                            }
                        }
                    }
                } else {
                    th3 th3VarA = ji3.a(wv0Var, o2161699089510411363, true);
                    try {
                        strA = ((f7) b().a).a(c(), a(list), view, this.f.b());
                        th3VarA.close();
                    } catch (Throwable th4) {
                        try {
                            th3VarA.b(th4);
                            if (th4 instanceof N340633841638932414) {
                                throw th4;
                            }
                            if (!(th4 instanceof P2480554073835519965) && !(th4 instanceof CancellationException)) {
                                th3VarA.a(th4);
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
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                Z1953481206310471956.z(th3VarA, th5);
                                throw th6;
                            }
                        }
                    }
                }
                strA.getClass();
                return strA;
            }
        }
        return "";
    }

    public final String b(ArrayList arrayList, View view) throws IOException {
        String strB;
        if (arrayList.isEmpty()) {
            return "";
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (this.e.b((Uri) obj)) {
                kz2 kz2Var = this.i;
                wv0 wv0Var = wv0.CUI_NAME_VIEW_SIGNALS;
                O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
                mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
                if (ji3.b().a == null) {
                    em2 em2VarA = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                    try {
                        c7 c7VarB = b();
                        strB = ((f7) c7VarB.a).b(c(), a(arrayList), view, this.f.b());
                        em2VarA.close();
                    } catch (Throwable th) {
                        try {
                            em2VarA.b(th);
                            if (th instanceof N340633841638932414) {
                                throw th;
                            }
                            if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                                em2VarA.a(th);
                            }
                            if (th instanceof P2480554073835519965) {
                                throw new lw0(th);
                            }
                            if (th instanceof CancellationException) {
                                throw new du0(th);
                            }
                            if (th instanceof dv0) {
                                throw th;
                            }
                            throw new iu0(th);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                Z1953481206310471956.z(em2VarA, th2);
                                throw th3;
                            }
                        }
                    }
                } else {
                    th3 th3VarA = ji3.a(wv0Var, o2161699089510411363, true);
                    try {
                        c7 c7VarB2 = b();
                        strB = ((f7) c7VarB2.a).b(c(), a(arrayList), view, this.f.b());
                        th3VarA.close();
                    } catch (Throwable th4) {
                        try {
                            th3VarA.b(th4);
                            if (th4 instanceof N340633841638932414) {
                                throw th4;
                            }
                            if (!(th4 instanceof P2480554073835519965) && !(th4 instanceof CancellationException)) {
                                th3VarA.a(th4);
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
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                Z1953481206310471956.z(th3VarA, th5);
                                throw th6;
                            }
                        }
                    }
                }
                strB.getClass();
                return strB;
            }
        }
        return "";
    }

    public final Context c() {
        Activity activityB = this.f.b();
        return activityB != null ? activityB : this.c;
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        c7 c7Var;
        Context context = this.c;
        F7878618420024429111 f7878618420024429111 = this.g.d;
        Q4869062626651831947 q4869062626651831947 = this.d.u;
        q4869062626651831947.getClass();
        R735986421272980610 r735986421272980610P = j7.P();
        r735986421272980610P.getClass();
        r735986421272980610P.b();
        j7 j7Var = (j7) r735986421272980610P.b;
        j7Var.getClass();
        j7Var.hostType_ = E12098517352909843120.d(2);
        j7Var.bitField0_ |= 64;
        Boolean bool = Boolean.TRUE;
        ao aoVar = ao.a$11;
        boolean zBooleanValue = ((Boolean) q4869062626651831947.a("gads:ad_spam_gass_call:enabled", bool, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var2 = (j7) r735986421272980610P.b;
        j7Var2.bitField0_ |= 128;
        j7Var2.enableGassClient_ = zBooleanValue;
        boolean zBooleanValue2 = ((Boolean) q4869062626651831947.a("gads:as_af:enabled", bool, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var3 = (j7) r735986421272980610P.b;
        j7Var3.bitField0_ |= 4;
        j7Var3.allowFallback_ = zBooleanValue2;
        Boolean bool2 = Boolean.FALSE;
        boolean zBooleanValue3 = ((Boolean) q4869062626651831947.a("gads:as_afsp:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var4 = (j7) r735986421272980610P.b;
        j7Var4.bitField0_ |= 8;
        j7Var4.allowFallbackToStaticProgram_ = zBooleanValue3;
        boolean zBooleanValue4 = ((Boolean) q4869062626651831947.a("gads:as_fisp:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var5 = (j7) r735986421272980610P.b;
        j7Var5.bitField0_ |= 16;
        j7Var5.forceInitializeWithStaticProgram_ = zBooleanValue4;
        boolean zBooleanValue5 = ((Boolean) q4869062626651831947.a("gads:as_spuwsp:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var6 = (j7) r735986421272980610P.b;
        j7Var6.bitField0_ |= 33554432;
        j7Var6.skipProgramUpdateWithStaticProgram_ = zBooleanValue5;
        ao aoVar2 = ao.a$18;
        int i_a$2 = G6547577305291411977._a$2(((Number) q4869062626651831947.a("gads:as_rav", (Object) 2, (F4096073349764486348) aoVar2)).intValue());
        if (i_a$2 == 0) {
            i_a$2 = 2;
        }
        r735986421272980610P.b();
        j7 j7Var7 = (j7) r735986421272980610P.b;
        j7Var7.getClass();
        j7Var7.requestedAdshieldVersion_ = G6547577305291411977.g(i_a$2);
        j7Var7.bitField0_ |= 1;
        int i_a$22 = G6547577305291411977._a$2(((Number) q4869062626651831947.a("gads:as_fav", (Object) 1, (F4096073349764486348) aoVar2)).intValue());
        if (i_a$22 == 0) {
            i_a$22 = 2;
        }
        r735986421272980610P.b();
        j7 j7Var8 = (j7) r735986421272980610P.b;
        j7Var8.getClass();
        j7Var8.fallbackAdshieldVersion_ = G6547577305291411977.g(i_a$22);
        j7Var8.bitField0_ |= 2;
        boolean zBooleanValue6 = ((Boolean) q4869062626651831947.a("gads:as_emcs:enabled", bool, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var9 = (j7) r735986421272980610P.b;
        j7Var9.bitField0_ |= 16777216;
        j7Var9.enableMinimalCerSignal_ = zBooleanValue6;
        X13739385577301502566 x13739385577301502566T = tm1.t();
        x13739385577301502566T.getClass();
        ao aoVar3 = ao.a$6;
        String str = (String) q4869062626651831947.a("gads:as_rcs", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1", aoVar3);
        x13739385577301502566T.b();
        ((tm1) x13739385577301502566T.b).b(str);
        float fFloatValue = ((Number) q4869062626651831947.a("gads:as_lsr", Float.valueOf(0.01f), ao.a$17)).floatValue();
        x13739385577301502566T.b();
        tm1 tm1Var = (tm1) x13739385577301502566T.b;
        tm1Var.bitField0_ |= 2;
        tm1Var.logSampleRate_ = fFloatValue;
        ao aoVar4 = ao.a$26;
        long jLongValue = ((Number) q4869062626651831947.a("gads:as_lbs", (Object) 1000L, (F4096073349764486348) aoVar4)).longValue();
        x13739385577301502566T.b();
        tm1 tm1Var2 = (tm1) x13739385577301502566T.b;
        tm1Var2.bitField0_ |= 4;
        tm1Var2.logBufferSize_ = jLongValue;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MINUTES;
        long jLongValue2 = ((Number) q4869062626651831947.a("gads:as_li_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(1, n13798149404328803870))), aoVar4)).longValue();
        x13739385577301502566T.b();
        tm1 tm1Var3 = (tm1) x13739385577301502566T.b;
        tm1Var3.bitField0_ |= 8;
        tm1Var3.logIntervalMs_ = jLongValue2;
        tm1 tm1Var4 = (tm1) x13739385577301502566T.a();
        r735986421272980610P.b();
        ((j7) r735986421272980610P.b).a(tm1Var4);
        boolean zBooleanValue7 = ((Boolean) q4869062626651831947.a("gads:as_vsb:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var10 = (j7) r735986421272980610P.b;
        j7Var10.bitField0_ |= 512;
        j7Var10.enableViewstringBinding_ = zBooleanValue7;
        N13798149404328803870 n137981494043288038702 = N13798149404328803870.SECONDS;
        long jLongValue3 = ((Number) q4869062626651831947.a("gads:as_st_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(1, n137981494043288038702))), aoVar4)).longValue();
        r735986421272980610P.b();
        j7 j7Var11 = (j7) r735986421272980610P.b;
        j7Var11.bitField0_ |= 2048;
        j7Var11.signalsTimeoutMs_ = jLongValue3;
        long jLongValue4 = ((Number) q4869062626651831947.a("gads:as_asqs_ms", (Object) 100L, (F4096073349764486348) aoVar4)).longValue();
        r735986421272980610P.b();
        j7 j7Var12 = (j7) r735986421272980610P.b;
        j7Var12.bitField0_ |= 1024;
        j7Var12.appStartQuerySignalsTimeoutMs_ = jLongValue4;
        long jLongValue5 = ((Number) q4869062626651831947.a("gads:as_asw_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(5, n137981494043288038702))), aoVar4)).longValue();
        r735986421272980610P.b();
        j7 j7Var13 = (j7) r735986421272980610P.b;
        j7Var13.bitField0_ |= 524288;
        j7Var13.appStartWindowMs_ = jLongValue5;
        boolean zBooleanValue8 = ((Boolean) q4869062626651831947.a("gads:as_emassqs:enabled", bool, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var14 = (j7) r735986421272980610P.b;
        j7Var14.bitField0_ |= 1048576;
        j7Var14.enableMinimalAppStartQuerySignals_ = zBooleanValue8;
        long jLongValue6 = ((Number) q4869062626651831947.a("gads:as_gst_ms", (Object) 200L, (F4096073349764486348) aoVar4)).longValue();
        r735986421272980610P.b();
        j7 j7Var15 = (j7) r735986421272980610P.b;
        j7Var15.bitField0_ |= 8192;
        j7Var15.gassSignalTimeoutMs_ = jLongValue6;
        long jLongValue7 = ((Number) q4869062626651831947.a("gads:as_list_ms", (Object) 200L, (F4096073349764486348) aoVar4)).longValue();
        r735986421272980610P.b();
        j7 j7Var16 = (j7) r735986421272980610P.b;
        j7Var16.bitField0_ |= CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
        j7Var16.localIntSignalTimeoutMs_ = jLongValue7;
        long jLongValue8 = ((Number) q4869062626651831947.a("gads:as_hrt_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(10, n13798149404328803870))), aoVar4)).longValue();
        r735986421272980610P.b();
        j7 j7Var17 = (j7) r735986421272980610P.b;
        j7Var17.bitField0_ |= 32768;
        j7Var17.httpRequestTimeoutMs_ = jLongValue8;
        String str2 = (String) q4869062626651831947.a("gads:as_pic", "", aoVar3);
        r735986421272980610P.b();
        ((j7) r735986421272980610P.b).d(str2);
        String str3 = (String) q4869062626651831947.a("gads:as_dic", "", aoVar3);
        r735986421272980610P.b();
        ((j7) r735986421272980610P.b).b(str3);
        long jLongValue9 = ((Number) q4869062626651831947.a("gads:as_mt_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(500, N13798149404328803870.MILLISECONDS))), aoVar4)).longValue();
        r735986421272980610P.b();
        j7 j7Var18 = (j7) r735986421272980610P.b;
        j7Var18.bitField0_ |= 262144;
        j7Var18.methodTimeoutMs_ = jLongValue9;
        boolean zBooleanValue9 = ((Boolean) q4869062626651831947.a("gads:as_caau:enabled", bool, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var19 = (j7) r735986421272980610P.b;
        j7Var19.bitField0_ |= 2097152;
        j7Var19.clearDgArgsAfterUse_ = zBooleanValue9;
        boolean zBooleanValue10 = ((Boolean) q4869062626651831947.a("gads:as_ls:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var20 = (j7) r735986421272980610P.b;
        j7Var20.bitField0_ |= 8388608;
        j7Var20.enableLazyScheduler_ = zBooleanValue10;
        boolean zBooleanValue11 = ((Boolean) q4869062626651831947.a("gads:as_eaiep:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        j7 j7Var21 = (j7) r735986421272980610P.b;
        j7Var21.bitField0_ |= 67108864;
        j7Var21.enableAsyncInputEventProcessing_ = zBooleanValue11;
        N6751852577264376817 n6751852577264376817W = cn2.w();
        n6751852577264376817W.getClass();
        boolean zBooleanValue12 = ((Boolean) q4869062626651831947.a("gads:as_ubi:enabled", bool2, aoVar)).booleanValue();
        n6751852577264376817W.b();
        cn2 cn2Var = (cn2) n6751852577264376817W.b;
        cn2Var.bitField0_ |= 4;
        cn2Var.updateBeforeInitialization_ = zBooleanValue12;
        long jLongValue10 = ((Number) q4869062626651831947.a("gads:as_aspud_ms", (Object) 0L, (F4096073349764486348) aoVar4)).longValue();
        n6751852577264376817W.b();
        cn2 cn2Var2 = (cn2) n6751852577264376817W.b;
        cn2Var2.bitField0_ |= 64;
        cn2Var2.appStartProgramUpdateDelayMs_ = jLongValue10;
        long jLongValue11 = ((Number) q4869062626651831947.a("gads:as_pae_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(1, N13798149404328803870.HOURS))), aoVar4)).longValue();
        n6751852577264376817W.b();
        cn2 cn2Var3 = (cn2) n6751852577264376817W.b;
        cn2Var3.bitField0_ |= 16;
        cn2Var3.programAlmostExpiredMs_ = jLongValue11;
        String str4 = (String) q4869062626651831947.a("gads:as_pru", "https://pagead2.googlesyndication.com/mads/asp", aoVar3);
        n6751852577264376817W.b();
        ((cn2) n6751852577264376817W.b).b(str4);
        boolean zBooleanValue13 = ((Boolean) q4869062626651831947.a("gads:as_rpd:enabled", bool2, aoVar)).booleanValue();
        n6751852577264376817W.b();
        cn2 cn2Var4 = (cn2) n6751852577264376817W.b;
        cn2Var4.bitField0_ |= 128;
        cn2Var4.enableRetryDownload_ = zBooleanValue13;
        long jLongValue12 = ((Number) q4869062626651831947.a("gads:as_mrpda", (Object) 5L, (F4096073349764486348) aoVar4)).longValue();
        n6751852577264376817W.b();
        cn2 cn2Var5 = (cn2) n6751852577264376817W.b;
        cn2Var5.bitField0_ |= 256;
        cn2Var5.maxRetryCount_ = jLongValue12;
        long jLongValue13 = ((Number) q4869062626651831947.a("gads:as_rbi_ms", (Object) 60000L, (F4096073349764486348) aoVar4)).longValue();
        n6751852577264376817W.b();
        cn2 cn2Var6 = (cn2) n6751852577264376817W.b;
        cn2Var6.bitField0_ |= 512;
        cn2Var6.retryBaseIntervalMs_ = jLongValue13;
        cn2 cn2Var7 = (cn2) n6751852577264376817W.a();
        r735986421272980610P.b();
        ((j7) r735986421272980610P.b).a(cn2Var7);
        R735986421272980610 r735986421272980610 = (R735986421272980610) ((j7) r735986421272980610P.a()).n();
        String str5 = this.h;
        r735986421272980610.b();
        ((j7) r735986421272980610.b).c(str5);
        j7 j7Var22 = (j7) r735986421272980610.a();
        synchronized (c7.b) {
            try {
                c7Var = c7.c;
                if (c7Var == null) {
                    context.getClass();
                    c7 c7Var2 = new c7(new r80(new P5733283974459951585((byte) 12), new U11450443558875589191((byte) 15), new P5733283974459951585((byte) 15), new O12545633033254628644((byte) 7), f7878618420024429111, context, j7Var22));
                    c7.c = c7Var2;
                    c7Var = c7Var2;
                }
            } finally {
            }
        }
        this.j = c7Var;
        f61 f61Var = ((f7) b().a).a;
        synchronized (f61Var) {
            try {
                if (f61Var.e == null) {
                    Set set = (Set) f61Var.b.get();
                    ArrayList arrayList = new ArrayList(set.size());
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((L17385865533161060024) it.next()).a());
                    }
                    vi3 vi3Var = (vi3) f61Var.d.get();
                    yk0 yk0Var = yk0.EVENT_ID_INITIALIZATION;
                    T7468265282056741718 t7468265282056741718S = B11509606741455062017.s(new W10763134803956330397(N7756202525712935399.n(arrayList)), new A14169635274474290551((byte) 2), f61Var.c);
                    vi3Var.a(yk0Var, (L7743116545240101509) t7468265282056741718S);
                    f61Var.e = t7468265282056741718S;
                    Iterator it2 = ((Set) f61Var.a.get()).iterator();
                    while (it2.hasNext()) {
                        ((L17385865533161060024) it2.next()).a();
                    }
                    f61Var.e.getClass();
                }
            } finally {
            }
        }
        return new xu0(O9245300239821758723.a);
    }

    public final c7 b() {
        c7 c7Var = this.j;
        if (c7Var != null) {
            return c7Var;
        }
        S10823041268949770285.b0("adShieldClient");
        throw null;
    }

    public final void b(List list) {
        pb3 pb3Var = ((f7) b().a).c.b;
        synchronized (pb3Var) {
            pb3Var.a.clear();
            pb3Var.a.addAll(list);
        }
    }

    public final String a(ViewGroup viewGroup) {
        c7 c7VarB = b();
        String strB = ((f7) c7VarB.a).b(c(), null, viewGroup, this.f.b());
        strB.getClass();
        return strB;
    }

    public final String a(tx0 tx0Var, eg2 eg2Var, m31 m31Var) {
        String strA = a(tx0Var);
        long j = eg2Var != null ? eg2Var.a.get() : 0L;
        String strA2 = m31Var != null ? m31Var.a() : null;
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.t("ms", strA);
        if (j > 0) {
            i16631908410500040363.s("plcmtid", Long.valueOf(j));
        }
        jr0 jr0Var = this.d;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:enable_impression_data:enabled", Boolean.TRUE, ao.a$11)).booleanValue() && strA2 != null && strA2.length() != 0) {
            i16631908410500040363.t("subpn", strA2);
        }
        return i16631908410500040363.toString();
    }

    public final Uri a(Uri uri, View view) throws IOException {
        uri.getClass();
        view.getClass();
        String strA = a(K5751602218013079365.U(uri), view);
        if (M8927913404651150384.Y(strA)) {
            return uri;
        }
        P5733283974459951585 p5733283974459951585 = rw0.f;
        return P5733283974459951585.b(uri, strA);
    }

    public final String a(View view, String str) {
        c7 c7VarB = b();
        String strA = ((f7) c7VarB.a).a(c(), str, view, this.f.b());
        strA.getClass();
        return strA;
    }

    public final String a(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Uri uri = (Uri) next;
            if (this.e.b(uri) && uri.getQueryParameter("ai") != null) {
                break;
            }
        }
        Uri uri2 = (Uri) next;
        if (uri2 == null) {
            return null;
        }
        return uri2.getQueryParameter("ai");
    }
}
