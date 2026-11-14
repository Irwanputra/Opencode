package ads_mobile_sdk;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.j;
import ads_mobile_sdk.jb1;
import ads_mobile_sdk.mm2;
import ads_mobile_sdk.nl0;
import ads_mobile_sdk.r92;
import ads_mobile_sdk.rm2;
import ads_mobile_sdk.sq;
import ads_mobile_sdk.vi3;
import ads_mobile_sdk.w7;
import ads_mobile_sdk.yk0;
import ads_mobile_sdk.yl0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import dev.epro.r0.B11509606741455062017;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.I13152720973475179368;
import dev.epro.r0.J8856184873186011997;
import dev.epro.r0.L7743116545240101509;
import dev.epro.r0.Q6203700555324584864;
import dev.epro.r0.T7468265282056741718;
import dev.epro.r0.V4416135141588678913;
import dev.epro.r0.W11349799793478038591;
import dev.epro.r0.W6764693637816104089;
import dev.epro.r0.X2485016533998461232;
import dev.epro.r0.X8174393611044482612;
import dev.epro.r0.Z886113521968091188;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.RandomAccess;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class mm2 implements W11349799793478038591 {
    public final Context a;
    public final ExecutorService b;
    public final j11 c;
    public final String d;
    public final int e;
    public final String f;
    public final vi3 g;
    public final ym2 h;

    public mm2(Context context, ExecutorService executorService, j7 j7Var, j11 j11Var, vi3 vi3Var, ym2 ym2Var) {
        int i;
        this.a = context;
        this.b = executorService;
        this.c = j11Var;
        this.g = vi3Var;
        this.h = ym2Var;
        this.d = j7Var.F();
        switch (E12098517352909843120._getNumber$1(j7Var.E())) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        this.e = i != 0 ? i : 1;
        this.f = j7Var.L().t();
    }

    @Override // dev.epro.r0.W11349799793478038591
    public final D16915945238461757356 a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        yk0 yk0Var = yk0.EVENT_ID_ORCAS_FETCHER_FETCH_PROGRAM;
        X8174393611044482612 o2 = u7.o();
        byte[] b = Q6203700555324584864.b();
        final byte b2 = 0;
        qq a = sq.a(0, b, b.length);
        o2.b();
        ((u7) o2.b).a(a);
        long j = Build.VERSION.SDK_INT;
        o2.b();
        u7 u7Var = (u7) o2.b;
        i = u7Var.bitField0_;
        final byte b3 = 2;
        u7Var.bitField0_ = i | 2;
        u7Var.apiLevel_ = j;
        String str = Build.MODEL;
        o2.b();
        ((u7) o2.b).d(str);
        Context context = this.a;
        String packageName = context.getPackageName();
        o2.b();
        ((u7) o2.b).b(packageName);
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i2 = -1;
        }
        o2.b();
        u7 u7Var2 = (u7) o2.b;
        i3 = u7Var2.bitField0_;
        u7Var2.bitField0_ = i3 | 16;
        u7Var2.appVersionCode_ = i2;
        o2.b();
        ((u7) o2.b).c(this.d);
        o2.b();
        u7 u7Var3 = (u7) o2.b;
        u7Var3.getClass();
        u7Var3.osType_ = X2485016533998461232.b(2);
        i4 = u7Var3.bitField0_;
        u7Var3.bitField0_ = i4 | 64;
        o2.b();
        u7 u7Var4 = (u7) o2.b;
        u7Var4.getClass();
        u7Var4.hostType_ = E12098517352909843120._getNumber(this.e);
        i5 = u7Var4.bitField0_;
        u7Var4.bitField0_ = i5 | 128;
        final byte b4 = 1;
        T7468265282056741718 s = B11509606741455062017.s(I13152720973475179368.q(this.c.a(Uri.parse(this.f).buildUpon().appendQueryParameter("aspq", V4416135141588678913.d(true).c(((u7) o2.a()).a())).build().toString(), null, false, new byte[0])), new W6764693637816104089(this) { // from class: dev.epro.r0.F11332740110010766311
            public final /* synthetic */ mm2 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.W6764693637816104089
            public final Object apply(Object obj) {
                RandomAccess randomAccess;
                R17185427375111049466 r17185427375111049466;
                byte b5 = b2;
                mm2 mm2Var = this.b;
                switch (b5) {
                    case 0:
                        i11 i11Var = (i11) obj;
                        vi3 vi3Var = mm2Var.g;
                        if (i11Var.a != 200) {
                            yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20002, -1L, null, new String(Q6203700555324584864.b(), StandardCharsets.UTF_8));
                            Z13283891527057128406 s2 = yl0.s();
                            s2.c(7);
                            return (yl0) s2.a();
                        }
                        try {
                            String str2 = new String(i11Var.b);
                            if (TextUtils.isEmpty(str2)) {
                                vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                Z13283891527057128406 s3 = yl0.s();
                                s3.c(8);
                                return (yl0) s3.a();
                            }
                            w7 a2 = w7.a(V4416135141588678913.f(str2, true), nl0.b());
                            if (a2.p().r() && a2.p().s()) {
                                if (!mm2Var.h.a(a2)) {
                                    vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                    Z13283891527057128406 s4 = yl0.s();
                                    s4.c(12);
                                    return (yl0) s4.a();
                                }
                                Z13283891527057128406 s5 = yl0.s();
                                X7577837190169583211 t = rm2.t();
                                r92 q = a2.p().q();
                                t.b();
                                ((rm2) t.b).a(q);
                                R17185427375111049466 o3 = a2.o();
                                t.b();
                                rm2 rm2Var = (rm2) t.b;
                                randomAccess = rm2Var.activeExperimentIds_;
                                if (!((j) randomAccess).a) {
                                    jb1 jb1Var = (jb1) randomAccess;
                                    rm2Var.activeExperimentIds_ = jb1Var.a(jb1Var.c * 2);
                                }
                                r17185427375111049466 = rm2Var.activeExperimentIds_;
                                au0.a(o3, r17185427375111049466);
                                rm2 rm2Var2 = (rm2) t.a();
                                s5.b();
                                ((yl0) s5.b).a(rm2Var2);
                                sq p = a2.p().p();
                                s5.b();
                                ((yl0) s5.b).a(p);
                                s5.c(2);
                                return (yl0) s5.a();
                            }
                            vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                            Z13283891527057128406 s6 = yl0.s();
                            s6.c(8);
                            return (yl0) s6.a();
                        } catch (Throwable th) {
                            yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20004, -1L, th, null);
                            Z13283891527057128406 s7 = yl0.s();
                            s7.c(6);
                            return (yl0) s7.a();
                        }
                    case 1:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_UNKNOWN_HOST_EXCEPTION);
                        Z13283891527057128406 s8 = yl0.s();
                        s8.c(13);
                        return (yl0) s8.a();
                    default:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SOCKET_EXCEPTION);
                        Z13283891527057128406 s9 = yl0.s();
                        s9.c(13);
                        return (yl0) s9.a();
                }
            }
        }, this.b);
        W6764693637816104089 w6764693637816104089 = new W6764693637816104089(this) { // from class: dev.epro.r0.F11332740110010766311
            public final /* synthetic */ mm2 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.W6764693637816104089
            public final Object apply(Object obj) {
                RandomAccess randomAccess;
                R17185427375111049466 r17185427375111049466;
                byte b5 = b4;
                mm2 mm2Var = this.b;
                switch (b5) {
                    case 0:
                        i11 i11Var = (i11) obj;
                        vi3 vi3Var = mm2Var.g;
                        if (i11Var.a != 200) {
                            yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20002, -1L, null, new String(Q6203700555324584864.b(), StandardCharsets.UTF_8));
                            Z13283891527057128406 s2 = yl0.s();
                            s2.c(7);
                            return (yl0) s2.a();
                        }
                        try {
                            String str2 = new String(i11Var.b);
                            if (TextUtils.isEmpty(str2)) {
                                vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                Z13283891527057128406 s3 = yl0.s();
                                s3.c(8);
                                return (yl0) s3.a();
                            }
                            w7 a2 = w7.a(V4416135141588678913.f(str2, true), nl0.b());
                            if (a2.p().r() && a2.p().s()) {
                                if (!mm2Var.h.a(a2)) {
                                    vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                    Z13283891527057128406 s4 = yl0.s();
                                    s4.c(12);
                                    return (yl0) s4.a();
                                }
                                Z13283891527057128406 s5 = yl0.s();
                                X7577837190169583211 t = rm2.t();
                                r92 q = a2.p().q();
                                t.b();
                                ((rm2) t.b).a(q);
                                R17185427375111049466 o3 = a2.o();
                                t.b();
                                rm2 rm2Var = (rm2) t.b;
                                randomAccess = rm2Var.activeExperimentIds_;
                                if (!((j) randomAccess).a) {
                                    jb1 jb1Var = (jb1) randomAccess;
                                    rm2Var.activeExperimentIds_ = jb1Var.a(jb1Var.c * 2);
                                }
                                r17185427375111049466 = rm2Var.activeExperimentIds_;
                                au0.a(o3, r17185427375111049466);
                                rm2 rm2Var2 = (rm2) t.a();
                                s5.b();
                                ((yl0) s5.b).a(rm2Var2);
                                sq p = a2.p().p();
                                s5.b();
                                ((yl0) s5.b).a(p);
                                s5.c(2);
                                return (yl0) s5.a();
                            }
                            vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                            Z13283891527057128406 s6 = yl0.s();
                            s6.c(8);
                            return (yl0) s6.a();
                        } catch (Throwable th) {
                            yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20004, -1L, th, null);
                            Z13283891527057128406 s7 = yl0.s();
                            s7.c(6);
                            return (yl0) s7.a();
                        }
                    case 1:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_UNKNOWN_HOST_EXCEPTION);
                        Z13283891527057128406 s8 = yl0.s();
                        s8.c(13);
                        return (yl0) s8.a();
                    default:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SOCKET_EXCEPTION);
                        Z13283891527057128406 s9 = yl0.s();
                        s9.c(13);
                        return (yl0) s9.a();
                }
            }
        };
        Z886113521968091188 z886113521968091188 = Z886113521968091188.a;
        J8856184873186011997 p = s.p(UnknownHostException.class, w6764693637816104089, z886113521968091188).p(SocketException.class, new W6764693637816104089(this) { // from class: dev.epro.r0.F11332740110010766311
            public final /* synthetic */ mm2 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.W6764693637816104089
            public final Object apply(Object obj) {
                RandomAccess randomAccess;
                R17185427375111049466 r17185427375111049466;
                byte b5 = b3;
                mm2 mm2Var = this.b;
                switch (b5) {
                    case 0:
                        i11 i11Var = (i11) obj;
                        vi3 vi3Var = mm2Var.g;
                        if (i11Var.a != 200) {
                            yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20002, -1L, null, new String(Q6203700555324584864.b(), StandardCharsets.UTF_8));
                            Z13283891527057128406 s2 = yl0.s();
                            s2.c(7);
                            return (yl0) s2.a();
                        }
                        try {
                            String str2 = new String(i11Var.b);
                            if (TextUtils.isEmpty(str2)) {
                                vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                Z13283891527057128406 s3 = yl0.s();
                                s3.c(8);
                                return (yl0) s3.a();
                            }
                            w7 a2 = w7.a(V4416135141588678913.f(str2, true), nl0.b());
                            if (a2.p().r() && a2.p().s()) {
                                if (!mm2Var.h.a(a2)) {
                                    vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                    Z13283891527057128406 s4 = yl0.s();
                                    s4.c(12);
                                    return (yl0) s4.a();
                                }
                                Z13283891527057128406 s5 = yl0.s();
                                X7577837190169583211 t = rm2.t();
                                r92 q = a2.p().q();
                                t.b();
                                ((rm2) t.b).a(q);
                                R17185427375111049466 o3 = a2.o();
                                t.b();
                                rm2 rm2Var = (rm2) t.b;
                                randomAccess = rm2Var.activeExperimentIds_;
                                if (!((j) randomAccess).a) {
                                    jb1 jb1Var = (jb1) randomAccess;
                                    rm2Var.activeExperimentIds_ = jb1Var.a(jb1Var.c * 2);
                                }
                                r17185427375111049466 = rm2Var.activeExperimentIds_;
                                au0.a(o3, r17185427375111049466);
                                rm2 rm2Var2 = (rm2) t.a();
                                s5.b();
                                ((yl0) s5.b).a(rm2Var2);
                                sq p2 = a2.p().p();
                                s5.b();
                                ((yl0) s5.b).a(p2);
                                s5.c(2);
                                return (yl0) s5.a();
                            }
                            vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                            Z13283891527057128406 s6 = yl0.s();
                            s6.c(8);
                            return (yl0) s6.a();
                        } catch (Throwable th) {
                            yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20004, -1L, th, null);
                            Z13283891527057128406 s7 = yl0.s();
                            s7.c(6);
                            return (yl0) s7.a();
                        }
                    case 1:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_UNKNOWN_HOST_EXCEPTION);
                        Z13283891527057128406 s8 = yl0.s();
                        s8.c(13);
                        return (yl0) s8.a();
                    default:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SOCKET_EXCEPTION);
                        Z13283891527057128406 s9 = yl0.s();
                        s9.c(13);
                        return (yl0) s9.a();
                }
            }
        }, z886113521968091188);
        this.g.a(yk0Var, (L7743116545240101509) p);
        return p;
    }
}
