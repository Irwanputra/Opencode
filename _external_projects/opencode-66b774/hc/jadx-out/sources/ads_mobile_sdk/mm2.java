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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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
        yk0 yk0Var = yk0.EVENT_ID_ORCAS_FETCHER_FETCH_PROGRAM;
        X8174393611044482612 x8174393611044482612O = u7.o();
        byte[] bArrB = Q6203700555324584864.b();
        final byte b = 0;
        qq qqVarA = sq.a(0, bArrB, bArrB.length);
        x8174393611044482612O.b();
        ((u7) x8174393611044482612O.b).a(qqVarA);
        long j = Build.VERSION.SDK_INT;
        x8174393611044482612O.b();
        u7 u7Var = (u7) x8174393611044482612O.b;
        final byte b2 = 2;
        u7Var.bitField0_ |= 2;
        u7Var.apiLevel_ = j;
        String str = Build.MODEL;
        x8174393611044482612O.b();
        ((u7) x8174393611044482612O.b).d(str);
        Context context = this.a;
        String packageName = context.getPackageName();
        x8174393611044482612O.b();
        ((u7) x8174393611044482612O.b).b(packageName);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        x8174393611044482612O.b();
        u7 u7Var2 = (u7) x8174393611044482612O.b;
        u7Var2.bitField0_ |= 16;
        u7Var2.appVersionCode_ = i;
        x8174393611044482612O.b();
        ((u7) x8174393611044482612O.b).c(this.d);
        x8174393611044482612O.b();
        u7 u7Var3 = (u7) x8174393611044482612O.b;
        u7Var3.getClass();
        u7Var3.osType_ = X2485016533998461232.b(2);
        u7Var3.bitField0_ |= 64;
        x8174393611044482612O.b();
        u7 u7Var4 = (u7) x8174393611044482612O.b;
        u7Var4.getClass();
        u7Var4.hostType_ = E12098517352909843120._getNumber(this.e);
        u7Var4.bitField0_ |= 128;
        final byte b3 = 1;
        T7468265282056741718 t7468265282056741718S = B11509606741455062017.s(I13152720973475179368.q(this.c.a(Uri.parse(this.f).buildUpon().appendQueryParameter("aspq", V4416135141588678913.d(true).c(((u7) x8174393611044482612O.a()).a())).build().toString(), null, false, new byte[0])), new W6764693637816104089(this) { // from class: dev.epro.r0.F11332740110010766311
            public final /* synthetic */ mm2 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.W6764693637816104089
            public final Object apply(Object obj) {
                byte b4 = b;
                mm2 mm2Var = this.b;
                switch (b4) {
                    case 0:
                        i11 i11Var = (i11) obj;
                        vi3 vi3Var = mm2Var.g;
                        if (i11Var.a != 200) {
                            yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20002, -1L, null, new String(Q6203700555324584864.b(), StandardCharsets.UTF_8));
                            Z13283891527057128406 z13283891527057128406S = yl0.s();
                            z13283891527057128406S.c(7);
                            return (yl0) z13283891527057128406S.a();
                        }
                        try {
                            String str2 = new String(i11Var.b);
                            if (TextUtils.isEmpty(str2)) {
                                vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                Z13283891527057128406 z13283891527057128406S2 = yl0.s();
                                z13283891527057128406S2.c(8);
                                return (yl0) z13283891527057128406S2.a();
                            }
                            w7 w7VarA = w7.a(V4416135141588678913.f(str2, true), nl0.b());
                            if (w7VarA.p().r() && w7VarA.p().s()) {
                                if (!mm2Var.h.a(w7VarA)) {
                                    vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                    Z13283891527057128406 z13283891527057128406S3 = yl0.s();
                                    z13283891527057128406S3.c(12);
                                    return (yl0) z13283891527057128406S3.a();
                                }
                                Z13283891527057128406 z13283891527057128406S4 = yl0.s();
                                X7577837190169583211 x7577837190169583211T = rm2.t();
                                r92 r92VarQ = w7VarA.p().q();
                                x7577837190169583211T.b();
                                ((rm2) x7577837190169583211T.b).a(r92VarQ);
                                R17185427375111049466 r17185427375111049466O = w7VarA.o();
                                x7577837190169583211T.b();
                                rm2 rm2Var = (rm2) x7577837190169583211T.b;
                                RandomAccess randomAccess = rm2Var.activeExperimentIds_;
                                if (!((j) randomAccess).a) {
                                    jb1 jb1Var = (jb1) randomAccess;
                                    rm2Var.activeExperimentIds_ = jb1Var.a(jb1Var.c * 2);
                                }
                                au0.a(r17185427375111049466O, rm2Var.activeExperimentIds_);
                                rm2 rm2Var2 = (rm2) x7577837190169583211T.a();
                                z13283891527057128406S4.b();
                                ((yl0) z13283891527057128406S4.b).a(rm2Var2);
                                sq sqVarP = w7VarA.p().p();
                                z13283891527057128406S4.b();
                                ((yl0) z13283891527057128406S4.b).a(sqVarP);
                                z13283891527057128406S4.c(2);
                                return (yl0) z13283891527057128406S4.a();
                            }
                            vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                            Z13283891527057128406 z13283891527057128406S5 = yl0.s();
                            z13283891527057128406S5.c(8);
                            return (yl0) z13283891527057128406S5.a();
                        } catch (Throwable th) {
                            yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20004, -1L, th, null);
                            Z13283891527057128406 z13283891527057128406S6 = yl0.s();
                            z13283891527057128406S6.c(6);
                            return (yl0) z13283891527057128406S6.a();
                        }
                    case 1:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_UNKNOWN_HOST_EXCEPTION);
                        Z13283891527057128406 z13283891527057128406S7 = yl0.s();
                        z13283891527057128406S7.c(13);
                        return (yl0) z13283891527057128406S7.a();
                    default:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SOCKET_EXCEPTION);
                        Z13283891527057128406 z13283891527057128406S8 = yl0.s();
                        z13283891527057128406S8.c(13);
                        return (yl0) z13283891527057128406S8.a();
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
                byte b4 = b3;
                mm2 mm2Var = this.b;
                switch (b4) {
                    case 0:
                        i11 i11Var = (i11) obj;
                        vi3 vi3Var = mm2Var.g;
                        if (i11Var.a != 200) {
                            yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20002, -1L, null, new String(Q6203700555324584864.b(), StandardCharsets.UTF_8));
                            Z13283891527057128406 z13283891527057128406S = yl0.s();
                            z13283891527057128406S.c(7);
                            return (yl0) z13283891527057128406S.a();
                        }
                        try {
                            String str2 = new String(i11Var.b);
                            if (TextUtils.isEmpty(str2)) {
                                vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                Z13283891527057128406 z13283891527057128406S2 = yl0.s();
                                z13283891527057128406S2.c(8);
                                return (yl0) z13283891527057128406S2.a();
                            }
                            w7 w7VarA = w7.a(V4416135141588678913.f(str2, true), nl0.b());
                            if (w7VarA.p().r() && w7VarA.p().s()) {
                                if (!mm2Var.h.a(w7VarA)) {
                                    vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                    Z13283891527057128406 z13283891527057128406S3 = yl0.s();
                                    z13283891527057128406S3.c(12);
                                    return (yl0) z13283891527057128406S3.a();
                                }
                                Z13283891527057128406 z13283891527057128406S4 = yl0.s();
                                X7577837190169583211 x7577837190169583211T = rm2.t();
                                r92 r92VarQ = w7VarA.p().q();
                                x7577837190169583211T.b();
                                ((rm2) x7577837190169583211T.b).a(r92VarQ);
                                R17185427375111049466 r17185427375111049466O = w7VarA.o();
                                x7577837190169583211T.b();
                                rm2 rm2Var = (rm2) x7577837190169583211T.b;
                                RandomAccess randomAccess = rm2Var.activeExperimentIds_;
                                if (!((j) randomAccess).a) {
                                    jb1 jb1Var = (jb1) randomAccess;
                                    rm2Var.activeExperimentIds_ = jb1Var.a(jb1Var.c * 2);
                                }
                                au0.a(r17185427375111049466O, rm2Var.activeExperimentIds_);
                                rm2 rm2Var2 = (rm2) x7577837190169583211T.a();
                                z13283891527057128406S4.b();
                                ((yl0) z13283891527057128406S4.b).a(rm2Var2);
                                sq sqVarP = w7VarA.p().p();
                                z13283891527057128406S4.b();
                                ((yl0) z13283891527057128406S4.b).a(sqVarP);
                                z13283891527057128406S4.c(2);
                                return (yl0) z13283891527057128406S4.a();
                            }
                            vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                            Z13283891527057128406 z13283891527057128406S5 = yl0.s();
                            z13283891527057128406S5.c(8);
                            return (yl0) z13283891527057128406S5.a();
                        } catch (Throwable th) {
                            yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20004, -1L, th, null);
                            Z13283891527057128406 z13283891527057128406S6 = yl0.s();
                            z13283891527057128406S6.c(6);
                            return (yl0) z13283891527057128406S6.a();
                        }
                    case 1:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_UNKNOWN_HOST_EXCEPTION);
                        Z13283891527057128406 z13283891527057128406S7 = yl0.s();
                        z13283891527057128406S7.c(13);
                        return (yl0) z13283891527057128406S7.a();
                    default:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SOCKET_EXCEPTION);
                        Z13283891527057128406 z13283891527057128406S8 = yl0.s();
                        z13283891527057128406S8.c(13);
                        return (yl0) z13283891527057128406S8.a();
                }
            }
        };
        Z886113521968091188 z886113521968091188 = Z886113521968091188.a;
        J8856184873186011997 j8856184873186011997P = t7468265282056741718S.p(UnknownHostException.class, w6764693637816104089, z886113521968091188).p(SocketException.class, new W6764693637816104089(this) { // from class: dev.epro.r0.F11332740110010766311
            public final /* synthetic */ mm2 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.W6764693637816104089
            public final Object apply(Object obj) {
                byte b4 = b2;
                mm2 mm2Var = this.b;
                switch (b4) {
                    case 0:
                        i11 i11Var = (i11) obj;
                        vi3 vi3Var = mm2Var.g;
                        if (i11Var.a != 200) {
                            yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20002, -1L, null, new String(Q6203700555324584864.b(), StandardCharsets.UTF_8));
                            Z13283891527057128406 z13283891527057128406S = yl0.s();
                            z13283891527057128406S.c(7);
                            return (yl0) z13283891527057128406S.a();
                        }
                        try {
                            String str2 = new String(i11Var.b);
                            if (TextUtils.isEmpty(str2)) {
                                vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                Z13283891527057128406 z13283891527057128406S2 = yl0.s();
                                z13283891527057128406S2.c(8);
                                return (yl0) z13283891527057128406S2.a();
                            }
                            w7 w7VarA = w7.a(V4416135141588678913.f(str2, true), nl0.b());
                            if (w7VarA.p().r() && w7VarA.p().s()) {
                                if (!mm2Var.h.a(w7VarA)) {
                                    vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                    Z13283891527057128406 z13283891527057128406S3 = yl0.s();
                                    z13283891527057128406S3.c(12);
                                    return (yl0) z13283891527057128406S3.a();
                                }
                                Z13283891527057128406 z13283891527057128406S4 = yl0.s();
                                X7577837190169583211 x7577837190169583211T = rm2.t();
                                r92 r92VarQ = w7VarA.p().q();
                                x7577837190169583211T.b();
                                ((rm2) x7577837190169583211T.b).a(r92VarQ);
                                R17185427375111049466 r17185427375111049466O = w7VarA.o();
                                x7577837190169583211T.b();
                                rm2 rm2Var = (rm2) x7577837190169583211T.b;
                                RandomAccess randomAccess = rm2Var.activeExperimentIds_;
                                if (!((j) randomAccess).a) {
                                    jb1 jb1Var = (jb1) randomAccess;
                                    rm2Var.activeExperimentIds_ = jb1Var.a(jb1Var.c * 2);
                                }
                                au0.a(r17185427375111049466O, rm2Var.activeExperimentIds_);
                                rm2 rm2Var2 = (rm2) x7577837190169583211T.a();
                                z13283891527057128406S4.b();
                                ((yl0) z13283891527057128406S4.b).a(rm2Var2);
                                sq sqVarP = w7VarA.p().p();
                                z13283891527057128406S4.b();
                                ((yl0) z13283891527057128406S4.b).a(sqVarP);
                                z13283891527057128406S4.c(2);
                                return (yl0) z13283891527057128406S4.a();
                            }
                            vi3Var.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                            Z13283891527057128406 z13283891527057128406S5 = yl0.s();
                            z13283891527057128406S5.c(8);
                            return (yl0) z13283891527057128406S5.a();
                        } catch (Throwable th) {
                            yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                            vi3Var.a.a(20004, -1L, th, null);
                            Z13283891527057128406 z13283891527057128406S6 = yl0.s();
                            z13283891527057128406S6.c(6);
                            return (yl0) z13283891527057128406S6.a();
                        }
                    case 1:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_UNKNOWN_HOST_EXCEPTION);
                        Z13283891527057128406 z13283891527057128406S7 = yl0.s();
                        z13283891527057128406S7.c(13);
                        return (yl0) z13283891527057128406S7.a();
                    default:
                        mm2Var.g.b(yk0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SOCKET_EXCEPTION);
                        Z13283891527057128406 z13283891527057128406S8 = yl0.s();
                        z13283891527057128406S8.c(13);
                        return (yl0) z13283891527057128406S8.a();
                }
            }
        }, z886113521968091188);
        this.g.a(yk0Var, (L7743116545240101509) j8856184873186011997P);
        return j8856184873186011997P;
    }
}
