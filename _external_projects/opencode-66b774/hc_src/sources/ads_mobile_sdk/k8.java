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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import net.zetetic.database.CursorWindow;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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

    public final String a(List list, View view) {
        String queryParameter;
        String a;
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
                    em2 a2 = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                    try {
                        a = ((f7) b().a).a(c(), a(list), view, this.f.b());
                        a2.close();
                    } catch (Throwable th) {
                        try {
                            a2.b(th);
                            if (th instanceof N340633841638932414) {
                                throw th;
                            }
                            if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                                a2.a(th);
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
                                Z1953481206310471956.z(a2, th2);
                                throw th3;
                            }
                        }
                    }
                } else {
                    th3 a3 = ji3.a(wv0Var, o2161699089510411363, true);
                    try {
                        a = ((f7) b().a).a(c(), a(list), view, this.f.b());
                        a3.close();
                    } catch (Throwable th4) {
                        try {
                            a3.b(th4);
                            if (th4 instanceof N340633841638932414) {
                                throw th4;
                            }
                            if (!(th4 instanceof P2480554073835519965) && !(th4 instanceof CancellationException)) {
                                a3.a(th4);
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
                                Z1953481206310471956.z(a3, th5);
                                throw th6;
                            }
                        }
                    }
                }
                a.getClass();
                return a;
            }
        }
        return "";
    }

    public final String b(ArrayList arrayList, View view) {
        String b;
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
                    em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                    try {
                        c7 b2 = b();
                        b = ((f7) b2.a).b(c(), a(arrayList), view, this.f.b());
                        a.close();
                    } catch (Throwable th) {
                        try {
                            a.b(th);
                            if (th instanceof N340633841638932414) {
                                throw th;
                            }
                            if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                                a.a(th);
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
                                Z1953481206310471956.z(a, th2);
                                throw th3;
                            }
                        }
                    }
                } else {
                    th3 a2 = ji3.a(wv0Var, o2161699089510411363, true);
                    try {
                        c7 b3 = b();
                        b = ((f7) b3.a).b(c(), a(arrayList), view, this.f.b());
                        a2.close();
                    } catch (Throwable th4) {
                        try {
                            a2.b(th4);
                            if (th4 instanceof N340633841638932414) {
                                throw th4;
                            }
                            if (!(th4 instanceof P2480554073835519965) && !(th4 instanceof CancellationException)) {
                                a2.a(th4);
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
                                Z1953481206310471956.z(a2, th5);
                                throw th6;
                            }
                        }
                    }
                }
                b.getClass();
                return b;
            }
        }
        return "";
    }

    public final Context c() {
        Activity b = this.f.b();
        return b != null ? b : this.c;
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        c7 c7Var;
        Context context = this.c;
        F7878618420024429111 f7878618420024429111 = this.g.d;
        Q4869062626651831947 q4869062626651831947 = this.d.u;
        q4869062626651831947.getClass();
        R735986421272980610 P = j7.P();
        P.getClass();
        P.b();
        j7 j7Var = (j7) P.b;
        j7Var.getClass();
        j7Var.hostType_ = E12098517352909843120.d(2);
        i = j7Var.bitField0_;
        j7Var.bitField0_ = i | 64;
        Boolean bool = Boolean.TRUE;
        ao aoVar = ao.a$11;
        boolean booleanValue = ((Boolean) q4869062626651831947.a("gads:ad_spam_gass_call:enabled", bool, aoVar)).booleanValue();
        P.b();
        j7 j7Var2 = (j7) P.b;
        i2 = j7Var2.bitField0_;
        j7Var2.bitField0_ = i2 | 128;
        j7Var2.enableGassClient_ = booleanValue;
        boolean booleanValue2 = ((Boolean) q4869062626651831947.a("gads:as_af:enabled", bool, aoVar)).booleanValue();
        P.b();
        j7 j7Var3 = (j7) P.b;
        i3 = j7Var3.bitField0_;
        j7Var3.bitField0_ = i3 | 4;
        j7Var3.allowFallback_ = booleanValue2;
        Boolean bool2 = Boolean.FALSE;
        boolean booleanValue3 = ((Boolean) q4869062626651831947.a("gads:as_afsp:enabled", bool2, aoVar)).booleanValue();
        P.b();
        j7 j7Var4 = (j7) P.b;
        i4 = j7Var4.bitField0_;
        j7Var4.bitField0_ = i4 | 8;
        j7Var4.allowFallbackToStaticProgram_ = booleanValue3;
        boolean booleanValue4 = ((Boolean) q4869062626651831947.a("gads:as_fisp:enabled", bool2, aoVar)).booleanValue();
        P.b();
        j7 j7Var5 = (j7) P.b;
        i5 = j7Var5.bitField0_;
        j7Var5.bitField0_ = i5 | 16;
        j7Var5.forceInitializeWithStaticProgram_ = booleanValue4;
        boolean booleanValue5 = ((Boolean) q4869062626651831947.a("gads:as_spuwsp:enabled", bool2, aoVar)).booleanValue();
        P.b();
        j7 j7Var6 = (j7) P.b;
        i6 = j7Var6.bitField0_;
        j7Var6.bitField0_ = i6 | 33554432;
        j7Var6.skipProgramUpdateWithStaticProgram_ = booleanValue5;
        ao aoVar2 = ao.a$18;
        int _a$2 = G6547577305291411977._a$2(((Number) q4869062626651831947.a("gads:as_rav", (Object) 2, (F4096073349764486348) aoVar2)).intValue());
        if (_a$2 == 0) {
            _a$2 = 2;
        }
        P.b();
        j7 j7Var7 = (j7) P.b;
        j7Var7.getClass();
        j7Var7.requestedAdshieldVersion_ = G6547577305291411977.g(_a$2);
        i7 = j7Var7.bitField0_;
        j7Var7.bitField0_ = i7 | 1;
        int _a$22 = G6547577305291411977._a$2(((Number) q4869062626651831947.a("gads:as_fav", (Object) 1, (F4096073349764486348) aoVar2)).intValue());
        if (_a$22 == 0) {
            _a$22 = 2;
        }
        P.b();
        j7 j7Var8 = (j7) P.b;
        j7Var8.getClass();
        j7Var8.fallbackAdshieldVersion_ = G6547577305291411977.g(_a$22);
        i8 = j7Var8.bitField0_;
        j7Var8.bitField0_ = i8 | 2;
        boolean booleanValue6 = ((Boolean) q4869062626651831947.a("gads:as_emcs:enabled", bool, aoVar)).booleanValue();
        P.b();
        j7 j7Var9 = (j7) P.b;
        i9 = j7Var9.bitField0_;
        j7Var9.bitField0_ = i9 | 16777216;
        j7Var9.enableMinimalCerSignal_ = booleanValue6;
        X13739385577301502566 t = tm1.t();
        t.getClass();
        ao aoVar3 = ao.a$6;
        String str = (String) q4869062626651831947.a("gads:as_rcs", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1", aoVar3);
        t.b();
        ((tm1) t.b).b(str);
        float floatValue = ((Number) q4869062626651831947.a("gads:as_lsr", Float.valueOf(0.01f), ao.a$17)).floatValue();
        t.b();
        tm1 tm1Var = (tm1) t.b;
        i10 = tm1Var.bitField0_;
        tm1Var.bitField0_ = i10 | 2;
        tm1Var.logSampleRate_ = floatValue;
        ao aoVar4 = ao.a$26;
        long longValue = ((Number) q4869062626651831947.a("gads:as_lbs", (Object) 1000L, (F4096073349764486348) aoVar4)).longValue();
        t.b();
        tm1 tm1Var2 = (tm1) t.b;
        i11 = tm1Var2.bitField0_;
        tm1Var2.bitField0_ = i11 | 4;
        tm1Var2.logBufferSize_ = longValue;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MINUTES;
        long longValue2 = ((Number) q4869062626651831947.a("gads:as_li_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(1, n13798149404328803870))), aoVar4)).longValue();
        t.b();
        tm1 tm1Var3 = (tm1) t.b;
        i12 = tm1Var3.bitField0_;
        tm1Var3.bitField0_ = i12 | 8;
        tm1Var3.logIntervalMs_ = longValue2;
        tm1 tm1Var4 = (tm1) t.a();
        P.b();
        ((j7) P.b).a(tm1Var4);
        boolean booleanValue7 = ((Boolean) q4869062626651831947.a("gads:as_vsb:enabled", bool2, aoVar)).booleanValue();
        P.b();
        j7 j7Var10 = (j7) P.b;
        i13 = j7Var10.bitField0_;
        j7Var10.bitField0_ = i13 | 512;
        j7Var10.enableViewstringBinding_ = booleanValue7;
        N13798149404328803870 n137981494043288038702 = N13798149404328803870.SECONDS;
        long longValue3 = ((Number) q4869062626651831947.a("gads:as_st_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(1, n137981494043288038702))), aoVar4)).longValue();
        P.b();
        j7 j7Var11 = (j7) P.b;
        i14 = j7Var11.bitField0_;
        j7Var11.bitField0_ = i14 | 2048;
        j7Var11.signalsTimeoutMs_ = longValue3;
        long longValue4 = ((Number) q4869062626651831947.a("gads:as_asqs_ms", (Object) 100L, (F4096073349764486348) aoVar4)).longValue();
        P.b();
        j7 j7Var12 = (j7) P.b;
        i15 = j7Var12.bitField0_;
        j7Var12.bitField0_ = i15 | 1024;
        j7Var12.appStartQuerySignalsTimeoutMs_ = longValue4;
        long longValue5 = ((Number) q4869062626651831947.a("gads:as_asw_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(5, n137981494043288038702))), aoVar4)).longValue();
        P.b();
        j7 j7Var13 = (j7) P.b;
        i16 = j7Var13.bitField0_;
        j7Var13.bitField0_ = i16 | 524288;
        j7Var13.appStartWindowMs_ = longValue5;
        boolean booleanValue8 = ((Boolean) q4869062626651831947.a("gads:as_emassqs:enabled", bool, aoVar)).booleanValue();
        P.b();
        j7 j7Var14 = (j7) P.b;
        i17 = j7Var14.bitField0_;
        j7Var14.bitField0_ = i17 | 1048576;
        j7Var14.enableMinimalAppStartQuerySignals_ = booleanValue8;
        long longValue6 = ((Number) q4869062626651831947.a("gads:as_gst_ms", (Object) 200L, (F4096073349764486348) aoVar4)).longValue();
        P.b();
        j7 j7Var15 = (j7) P.b;
        i18 = j7Var15.bitField0_;
        j7Var15.bitField0_ = i18 | 8192;
        j7Var15.gassSignalTimeoutMs_ = longValue6;
        long longValue7 = ((Number) q4869062626651831947.a("gads:as_list_ms", (Object) 200L, (F4096073349764486348) aoVar4)).longValue();
        P.b();
        j7 j7Var16 = (j7) P.b;
        i19 = j7Var16.bitField0_;
        j7Var16.bitField0_ = i19 | CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
        j7Var16.localIntSignalTimeoutMs_ = longValue7;
        long longValue8 = ((Number) q4869062626651831947.a("gads:as_hrt_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(10, n13798149404328803870))), aoVar4)).longValue();
        P.b();
        j7 j7Var17 = (j7) P.b;
        i20 = j7Var17.bitField0_;
        j7Var17.bitField0_ = i20 | 32768;
        j7Var17.httpRequestTimeoutMs_ = longValue8;
        String str2 = (String) q4869062626651831947.a("gads:as_pic", "", aoVar3);
        P.b();
        ((j7) P.b).d(str2);
        String str3 = (String) q4869062626651831947.a("gads:as_dic", "", aoVar3);
        P.b();
        ((j7) P.b).b(str3);
        long longValue9 = ((Number) q4869062626651831947.a("gads:as_mt_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(500, N13798149404328803870.MILLISECONDS))), aoVar4)).longValue();
        P.b();
        j7 j7Var18 = (j7) P.b;
        i21 = j7Var18.bitField0_;
        j7Var18.bitField0_ = i21 | 262144;
        j7Var18.methodTimeoutMs_ = longValue9;
        boolean booleanValue9 = ((Boolean) q4869062626651831947.a("gads:as_caau:enabled", bool, aoVar)).booleanValue();
        P.b();
        j7 j7Var19 = (j7) P.b;
        i22 = j7Var19.bitField0_;
        j7Var19.bitField0_ = i22 | 2097152;
        j7Var19.clearDgArgsAfterUse_ = booleanValue9;
        boolean booleanValue10 = ((Boolean) q4869062626651831947.a("gads:as_ls:enabled", bool2, aoVar)).booleanValue();
        P.b();
        j7 j7Var20 = (j7) P.b;
        i23 = j7Var20.bitField0_;
        j7Var20.bitField0_ = i23 | 8388608;
        j7Var20.enableLazyScheduler_ = booleanValue10;
        boolean booleanValue11 = ((Boolean) q4869062626651831947.a("gads:as_eaiep:enabled", bool2, aoVar)).booleanValue();
        P.b();
        j7 j7Var21 = (j7) P.b;
        i24 = j7Var21.bitField0_;
        j7Var21.bitField0_ = i24 | 67108864;
        j7Var21.enableAsyncInputEventProcessing_ = booleanValue11;
        N6751852577264376817 w = cn2.w();
        w.getClass();
        boolean booleanValue12 = ((Boolean) q4869062626651831947.a("gads:as_ubi:enabled", bool2, aoVar)).booleanValue();
        w.b();
        cn2 cn2Var = (cn2) w.b;
        i25 = cn2Var.bitField0_;
        cn2Var.bitField0_ = i25 | 4;
        cn2Var.updateBeforeInitialization_ = booleanValue12;
        long longValue10 = ((Number) q4869062626651831947.a("gads:as_aspud_ms", (Object) 0L, (F4096073349764486348) aoVar4)).longValue();
        w.b();
        cn2 cn2Var2 = (cn2) w.b;
        i26 = cn2Var2.bitField0_;
        cn2Var2.bitField0_ = i26 | 64;
        cn2Var2.appStartProgramUpdateDelayMs_ = longValue10;
        long longValue11 = ((Number) q4869062626651831947.a("gads:as_pae_ms", Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(1, N13798149404328803870.HOURS))), aoVar4)).longValue();
        w.b();
        cn2 cn2Var3 = (cn2) w.b;
        i27 = cn2Var3.bitField0_;
        cn2Var3.bitField0_ = i27 | 16;
        cn2Var3.programAlmostExpiredMs_ = longValue11;
        String str4 = (String) q4869062626651831947.a("gads:as_pru", "https://pagead2.googlesyndication.com/mads/asp", aoVar3);
        w.b();
        ((cn2) w.b).b(str4);
        boolean booleanValue13 = ((Boolean) q4869062626651831947.a("gads:as_rpd:enabled", bool2, aoVar)).booleanValue();
        w.b();
        cn2 cn2Var4 = (cn2) w.b;
        i28 = cn2Var4.bitField0_;
        cn2Var4.bitField0_ = i28 | 128;
        cn2Var4.enableRetryDownload_ = booleanValue13;
        long longValue12 = ((Number) q4869062626651831947.a("gads:as_mrpda", (Object) 5L, (F4096073349764486348) aoVar4)).longValue();
        w.b();
        cn2 cn2Var5 = (cn2) w.b;
        i29 = cn2Var5.bitField0_;
        cn2Var5.bitField0_ = i29 | 256;
        cn2Var5.maxRetryCount_ = longValue12;
        long longValue13 = ((Number) q4869062626651831947.a("gads:as_rbi_ms", (Object) 60000L, (F4096073349764486348) aoVar4)).longValue();
        w.b();
        cn2 cn2Var6 = (cn2) w.b;
        i30 = cn2Var6.bitField0_;
        cn2Var6.bitField0_ = i30 | 512;
        cn2Var6.retryBaseIntervalMs_ = longValue13;
        cn2 cn2Var7 = (cn2) w.a();
        P.b();
        ((j7) P.b).a(cn2Var7);
        R735986421272980610 r735986421272980610 = (R735986421272980610) ((j7) P.a()).n();
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
                    T7468265282056741718 s = B11509606741455062017.s(new W10763134803956330397(N7756202525712935399.n(arrayList)), new A14169635274474290551((byte) 2), f61Var.c);
                    vi3Var.a(yk0Var, (L7743116545240101509) s);
                    f61Var.e = s;
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
        c7 b = b();
        String b2 = ((f7) b.a).b(c(), null, viewGroup, this.f.b());
        b2.getClass();
        return b2;
    }

    public final String a(tx0 tx0Var, eg2 eg2Var, m31 m31Var) {
        String a = a(tx0Var);
        long j = eg2Var != null ? eg2Var.a.get() : 0L;
        String a2 = m31Var != null ? m31Var.a() : null;
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.t("ms", a);
        if (j > 0) {
            i16631908410500040363.s("plcmtid", Long.valueOf(j));
        }
        jr0 jr0Var = this.d;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:enable_impression_data:enabled", Boolean.TRUE, ao.a$11)).booleanValue() && a2 != null && a2.length() != 0) {
            i16631908410500040363.t("subpn", a2);
        }
        return i16631908410500040363.toString();
    }

    public final Uri a(Uri uri, View view) {
        uri.getClass();
        view.getClass();
        String a = a(K5751602218013079365.U(uri), view);
        if (M8927913404651150384.Y(a)) {
            return uri;
        }
        P5733283974459951585 p5733283974459951585 = rw0.f;
        return P5733283974459951585.b(uri, a);
    }

    public final String a(View view, String str) {
        c7 b = b();
        String a = ((f7) b.a).a(c(), str, view, this.f.b());
        a.getClass();
        return a;
    }

    public final String a(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Uri uri = (Uri) obj;
            if (this.e.b(uri) && uri.getQueryParameter("ai") != null) {
                break;
            }
        }
        Uri uri2 = (Uri) obj;
        if (uri2 == null) {
            return null;
        }
        return uri2.getQueryParameter("ai");
    }
}
