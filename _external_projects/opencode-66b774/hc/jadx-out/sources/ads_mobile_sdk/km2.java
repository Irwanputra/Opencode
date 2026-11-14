package ads_mobile_sdk;

import ads_mobile_sdk.fk;
import ads_mobile_sdk.gk;
import ads_mobile_sdk.km2;
import ads_mobile_sdk.nl0;
import ads_mobile_sdk.rm2;
import ads_mobile_sdk.sh3;
import ads_mobile_sdk.sm2;
import ads_mobile_sdk.sq;
import ads_mobile_sdk.tt0;
import ads_mobile_sdk.uo3;
import ads_mobile_sdk.vi3;
import ads_mobile_sdk.vm2;
import ads_mobile_sdk.xm2;
import ads_mobile_sdk.yi1;
import ads_mobile_sdk.yk0;
import ads_mobile_sdk.yl0;
import android.content.Context;
import android.text.TextUtils;
import dev.epro.r0.A14169635274474290551;
import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.B11509606741455062017;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.G17826342324976703097;
import dev.epro.r0.I13152720973475179368;
import dev.epro.r0.J5800360223679855765;
import dev.epro.r0.J8856184873186011997;
import dev.epro.r0.L7743116545240101509;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.V9308799180227606465;
import dev.epro.r0.W11349799793478038591;
import dev.epro.r0.W6764693637816104089;
import dev.epro.r0.Z15337348271744322997;
import dev.epro.r0.Z886113521968091188;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class km2 implements W11349799793478038591 {
    public final Context a;
    public final A8094652504661216977 b;
    public final Z15337348271744322997 c;
    public final vi3 d;
    public final ExecutorService e;
    public final xm2 f;
    public final v6 g;

    public km2(Context context, A8094652504661216977 a8094652504661216977, Z15337348271744322997 z15337348271744322997, vi3 vi3Var, ExecutorService executorService, xm2 xm2Var, v6 v6Var) {
        this.a = context;
        this.b = a8094652504661216977;
        this.c = z15337348271744322997;
        this.d = vi3Var;
        this.e = executorService;
        this.f = xm2Var;
        this.g = v6Var;
    }

    @Override // dev.epro.r0.W11349799793478038591
    public final D16915945238461757356 a() {
        yk0 yk0Var = yk0.EVENT_ID_DG_FETCHER_FETCH_PROGRAM;
        A8094652504661216977 a8094652504661216977 = this.b;
        Objects.requireNonNull(a8094652504661216977);
        J5800360223679855765 j5800360223679855765 = new J5800360223679855765(a8094652504661216977, (byte) 6);
        ExecutorService executorService = this.e;
        I13152720973475179368 i13152720973475179368Q = I13152720973475179368.q(M9216324016624295870.X(j5800360223679855765, executorService));
        final byte b = 0;
        W6764693637816104089 w6764693637816104089 = new W6764693637816104089(this) { // from class: dev.epro.r0.O12123424249380946449
            public final /* synthetic */ km2 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.W6764693637816104089
            public final Object apply(Object obj) {
                sh3 sh3Var;
                sh3 sh3Var2;
                A8094652504661216977 a80946525046612169772;
                vm2 vm2Var;
                boolean zA;
                byte b2 = b;
                int i = 5;
                km2 km2Var = this.b;
                switch (b2) {
                    case 0:
                        fk fkVar = (fk) obj;
                        Pattern pattern = gk.c;
                        int iOrdinal = fkVar.ordinal();
                        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                            return 0;
                        }
                        vi3 vi3Var = km2Var.d;
                        yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                        vi3Var.a.a(15203, -1L, null, fkVar.name());
                        throw new G17826342324976703097();
                    default:
                        rm2 rm2Var = (rm2) obj;
                        A8094652504661216977 a80946525046612169773 = km2Var.b;
                        String strR = rm2Var.r().r();
                        String strO = rm2Var.r().o();
                        vi3 vi3Var2 = km2Var.d;
                        sh3 sh3Var3 = new sh3(yk0.EVENT_ID_DG_FETCHER_GASS_CLIENT_INVOCATION, vi3Var2.b, vi3Var2.a);
                        try {
                            sh3Var3.b();
                            sh3Var2 = sh3Var3;
                        } catch (Throwable th) {
                            th = th;
                            sh3Var = sh3Var3;
                        }
                        try {
                            sh3Var = sh3Var2;
                            try {
                                G6335814235041277479 g6335814235041277479 = new G6335814235041277479(km2Var.a, (fk) a80946525046612169773.get(), strR, strO, km2Var.g);
                                long j = g6335814235041277479.a;
                                try {
                                    a80946525046612169772 = a80946525046612169773;
                                    try {
                                        vm2Var = (vm2) ((LinkedBlockingQueue) g6335814235041277479.f).poll(50000L, TimeUnit.MILLISECONDS);
                                    } catch (InterruptedException e) {
                                        e = e;
                                        g6335814235041277479.a(2009, j, e);
                                        vm2Var = null;
                                    }
                                } catch (InterruptedException e2) {
                                    e = e2;
                                    a80946525046612169772 = a80946525046612169773;
                                }
                                g6335814235041277479.a(3004, j, null);
                                if (vm2Var == null) {
                                    vm2Var = new vm2(null, 1, 1);
                                }
                                int i2 = vm2Var.c;
                                sh3Var.a();
                                if (i2 == 2) {
                                    vi3Var2.b(yk0.EVENT_ID_DG_FETCHER_PROGRAM_NO_UPDATE);
                                    Z13283891527057128406 z13283891527057128406S = yl0.s();
                                    z13283891527057128406S.c(4);
                                    return (yl0) z13283891527057128406S.a();
                                }
                                byte[] bArr = vm2Var.b;
                                if (bArr == null || bArr.length == 0) {
                                    vi3Var2.b(yk0.EVENT_ID_GET_EMPTY_PROGRAM_FROM_GASS);
                                    Z13283891527057128406 z13283891527057128406S2 = yl0.s();
                                    z13283891527057128406S2.c(8);
                                    return (yl0) z13283891527057128406S2.a();
                                }
                                try {
                                    tt0 tt0VarA = tt0.a(bArr, nl0.b());
                                    if (tt0VarA.p().r().isEmpty() || tt0VarA.p().o().isEmpty() || tt0VarA.o().c().length == 0) {
                                        vi3Var2.b(yk0.EVENT_ID_DG_FETCHER_PROGRAM_EMPTY_BYTECODE);
                                    } else {
                                        if (rm2Var.equals(rm2.q()) || !TextUtils.equals(rm2Var.r().r(), tt0VarA.p().r()) || !TextUtils.equals(rm2Var.r().o(), tt0VarA.p().o())) {
                                            if (i2 == 4) {
                                                xm2 xm2Var = km2Var.f;
                                                byte[] bArrC = tt0VarA.q().c();
                                                xm2Var.getClass();
                                                File file = xm2Var.a;
                                                try {
                                                    E686369837194379706.p(file);
                                                    E686369837194379706.T(file, bArrC);
                                                    xm2Var.b.getClass();
                                                    zA = uo3.a(file);
                                                } catch (IOException | GeneralSecurityException e3) {
                                                    vi3 vi3Var3 = xm2Var.c;
                                                    yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                                                    vi3Var3.a.a(2026, -1L, e3, null);
                                                    zA = false;
                                                }
                                                try {
                                                    file.delete();
                                                    break;
                                                } catch (SecurityException unused) {
                                                }
                                                if (!zA) {
                                                    vi3Var2.b(yk0.EVENT_ID_DG_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                                    Z13283891527057128406 z13283891527057128406S3 = yl0.s();
                                                    z13283891527057128406S3.c(12);
                                                    return (yl0) z13283891527057128406S3.a();
                                                }
                                                break;
                                            }
                                            Z13283891527057128406 z13283891527057128406S4 = yl0.s();
                                            if (i2 == 2) {
                                                i = 4;
                                            } else if (i2 == 3) {
                                                i = 2;
                                            } else if (i2 == 4) {
                                                i = 3;
                                            } else if (i2 != 6) {
                                                i = 1;
                                            }
                                            z13283891527057128406S4.c(i);
                                            X7577837190169583211 x7577837190169583211T = rm2.t();
                                            sm2 sm2VarP = tt0VarA.p();
                                            x7577837190169583211T.b();
                                            ((rm2) x7577837190169583211T.b).a(sm2VarP);
                                            fk fkVar2 = (fk) a80946525046612169772.get();
                                            x7577837190169583211T.b();
                                            rm2 rm2Var2 = (rm2) x7577837190169583211T.b;
                                            rm2Var2.getClass();
                                            rm2Var2.architecture_ = fkVar2.a;
                                            rm2Var2.bitField0_ |= 1;
                                            rm2 rm2Var3 = (rm2) x7577837190169583211T.a();
                                            z13283891527057128406S4.b();
                                            ((yl0) z13283891527057128406S4.b).a(rm2Var3);
                                            sq sqVarQ = tt0VarA.q();
                                            z13283891527057128406S4.b();
                                            ((yl0) z13283891527057128406S4.b).b(sqVarQ);
                                            sq sqVarO = tt0VarA.o();
                                            z13283891527057128406S4.b();
                                            ((yl0) z13283891527057128406S4.b).a(sqVarO);
                                            return (yl0) z13283891527057128406S4.a();
                                        }
                                        vi3Var2.b(yk0.EVENT_ID_DG_FETCHER_PROGRAM_SAME_CHECKSUM);
                                    }
                                    Z13283891527057128406 z13283891527057128406S5 = yl0.s();
                                    z13283891527057128406S5.c(11);
                                    return (yl0) z13283891527057128406S5.a();
                                } catch (yi1 e4) {
                                    yk0 yk0Var4 = yk0.EVENT_ID_UNSPECIFIED;
                                    vi3Var2.a.a(15204, -1L, e4, null);
                                    Z13283891527057128406 z13283891527057128406S6 = yl0.s();
                                    z13283891527057128406S6.c(9);
                                    return (yl0) z13283891527057128406S6.a();
                                } catch (NullPointerException unused2) {
                                    vi3Var2.b(yk0.EVENT_ID_DG_FETCHER_NPE_PARSING_GASS_PROGRAM);
                                    Z13283891527057128406 z13283891527057128406S7 = yl0.s();
                                    z13283891527057128406S7.c(10);
                                    return (yl0) z13283891527057128406S7.a();
                                }
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                sh3Var2 = sh3Var;
                                try {
                                    sh3Var2.a(th);
                                    throw th;
                                } catch (Throwable th3) {
                                    sh3Var2.a();
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sh3Var2.a(th);
                            throw th;
                        }
                }
            }
        };
        Z886113521968091188 z886113521968091188 = Z886113521968091188.a;
        final byte b2 = 1;
        J8856184873186011997 j8856184873186011997P = B11509606741455062017.s(B11509606741455062017.r(B11509606741455062017.s(i13152720973475179368Q, w6764693637816104089, z886113521968091188), new V9308799180227606465(this, (byte) 0), z886113521968091188), new W6764693637816104089(this) { // from class: dev.epro.r0.O12123424249380946449
            public final /* synthetic */ km2 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.W6764693637816104089
            public final Object apply(Object obj) {
                sh3 sh3Var;
                sh3 sh3Var2;
                A8094652504661216977 a80946525046612169772;
                vm2 vm2Var;
                boolean zA;
                byte b22 = b2;
                int i = 5;
                km2 km2Var = this.b;
                switch (b22) {
                    case 0:
                        fk fkVar = (fk) obj;
                        Pattern pattern = gk.c;
                        int iOrdinal = fkVar.ordinal();
                        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                            return 0;
                        }
                        vi3 vi3Var = km2Var.d;
                        yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                        vi3Var.a.a(15203, -1L, null, fkVar.name());
                        throw new G17826342324976703097();
                    default:
                        rm2 rm2Var = (rm2) obj;
                        A8094652504661216977 a80946525046612169773 = km2Var.b;
                        String strR = rm2Var.r().r();
                        String strO = rm2Var.r().o();
                        vi3 vi3Var2 = km2Var.d;
                        sh3 sh3Var3 = new sh3(yk0.EVENT_ID_DG_FETCHER_GASS_CLIENT_INVOCATION, vi3Var2.b, vi3Var2.a);
                        try {
                            sh3Var3.b();
                            sh3Var2 = sh3Var3;
                        } catch (Throwable th) {
                            th = th;
                            sh3Var = sh3Var3;
                        }
                        try {
                            sh3Var = sh3Var2;
                            try {
                                G6335814235041277479 g6335814235041277479 = new G6335814235041277479(km2Var.a, (fk) a80946525046612169773.get(), strR, strO, km2Var.g);
                                long j = g6335814235041277479.a;
                                try {
                                    a80946525046612169772 = a80946525046612169773;
                                    try {
                                        vm2Var = (vm2) ((LinkedBlockingQueue) g6335814235041277479.f).poll(50000L, TimeUnit.MILLISECONDS);
                                    } catch (InterruptedException e) {
                                        e = e;
                                        g6335814235041277479.a(2009, j, e);
                                        vm2Var = null;
                                    }
                                } catch (InterruptedException e2) {
                                    e = e2;
                                    a80946525046612169772 = a80946525046612169773;
                                }
                                g6335814235041277479.a(3004, j, null);
                                if (vm2Var == null) {
                                    vm2Var = new vm2(null, 1, 1);
                                }
                                int i2 = vm2Var.c;
                                sh3Var.a();
                                if (i2 == 2) {
                                    vi3Var2.b(yk0.EVENT_ID_DG_FETCHER_PROGRAM_NO_UPDATE);
                                    Z13283891527057128406 z13283891527057128406S = yl0.s();
                                    z13283891527057128406S.c(4);
                                    return (yl0) z13283891527057128406S.a();
                                }
                                byte[] bArr = vm2Var.b;
                                if (bArr == null || bArr.length == 0) {
                                    vi3Var2.b(yk0.EVENT_ID_GET_EMPTY_PROGRAM_FROM_GASS);
                                    Z13283891527057128406 z13283891527057128406S2 = yl0.s();
                                    z13283891527057128406S2.c(8);
                                    return (yl0) z13283891527057128406S2.a();
                                }
                                try {
                                    tt0 tt0VarA = tt0.a(bArr, nl0.b());
                                    if (tt0VarA.p().r().isEmpty() || tt0VarA.p().o().isEmpty() || tt0VarA.o().c().length == 0) {
                                        vi3Var2.b(yk0.EVENT_ID_DG_FETCHER_PROGRAM_EMPTY_BYTECODE);
                                    } else {
                                        if (rm2Var.equals(rm2.q()) || !TextUtils.equals(rm2Var.r().r(), tt0VarA.p().r()) || !TextUtils.equals(rm2Var.r().o(), tt0VarA.p().o())) {
                                            if (i2 == 4) {
                                                xm2 xm2Var = km2Var.f;
                                                byte[] bArrC = tt0VarA.q().c();
                                                xm2Var.getClass();
                                                File file = xm2Var.a;
                                                try {
                                                    E686369837194379706.p(file);
                                                    E686369837194379706.T(file, bArrC);
                                                    xm2Var.b.getClass();
                                                    zA = uo3.a(file);
                                                } catch (IOException | GeneralSecurityException e3) {
                                                    vi3 vi3Var3 = xm2Var.c;
                                                    yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                                                    vi3Var3.a.a(2026, -1L, e3, null);
                                                    zA = false;
                                                }
                                                try {
                                                    file.delete();
                                                    break;
                                                } catch (SecurityException unused) {
                                                }
                                                if (!zA) {
                                                    vi3Var2.b(yk0.EVENT_ID_DG_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                                    Z13283891527057128406 z13283891527057128406S3 = yl0.s();
                                                    z13283891527057128406S3.c(12);
                                                    return (yl0) z13283891527057128406S3.a();
                                                }
                                                break;
                                            }
                                            Z13283891527057128406 z13283891527057128406S4 = yl0.s();
                                            if (i2 == 2) {
                                                i = 4;
                                            } else if (i2 == 3) {
                                                i = 2;
                                            } else if (i2 == 4) {
                                                i = 3;
                                            } else if (i2 != 6) {
                                                i = 1;
                                            }
                                            z13283891527057128406S4.c(i);
                                            X7577837190169583211 x7577837190169583211T = rm2.t();
                                            sm2 sm2VarP = tt0VarA.p();
                                            x7577837190169583211T.b();
                                            ((rm2) x7577837190169583211T.b).a(sm2VarP);
                                            fk fkVar2 = (fk) a80946525046612169772.get();
                                            x7577837190169583211T.b();
                                            rm2 rm2Var2 = (rm2) x7577837190169583211T.b;
                                            rm2Var2.getClass();
                                            rm2Var2.architecture_ = fkVar2.a;
                                            rm2Var2.bitField0_ |= 1;
                                            rm2 rm2Var3 = (rm2) x7577837190169583211T.a();
                                            z13283891527057128406S4.b();
                                            ((yl0) z13283891527057128406S4.b).a(rm2Var3);
                                            sq sqVarQ = tt0VarA.q();
                                            z13283891527057128406S4.b();
                                            ((yl0) z13283891527057128406S4.b).b(sqVarQ);
                                            sq sqVarO = tt0VarA.o();
                                            z13283891527057128406S4.b();
                                            ((yl0) z13283891527057128406S4.b).a(sqVarO);
                                            return (yl0) z13283891527057128406S4.a();
                                        }
                                        vi3Var2.b(yk0.EVENT_ID_DG_FETCHER_PROGRAM_SAME_CHECKSUM);
                                    }
                                    Z13283891527057128406 z13283891527057128406S5 = yl0.s();
                                    z13283891527057128406S5.c(11);
                                    return (yl0) z13283891527057128406S5.a();
                                } catch (yi1 e4) {
                                    yk0 yk0Var4 = yk0.EVENT_ID_UNSPECIFIED;
                                    vi3Var2.a.a(15204, -1L, e4, null);
                                    Z13283891527057128406 z13283891527057128406S6 = yl0.s();
                                    z13283891527057128406S6.c(9);
                                    return (yl0) z13283891527057128406S6.a();
                                } catch (NullPointerException unused2) {
                                    vi3Var2.b(yk0.EVENT_ID_DG_FETCHER_NPE_PARSING_GASS_PROGRAM);
                                    Z13283891527057128406 z13283891527057128406S7 = yl0.s();
                                    z13283891527057128406S7.c(10);
                                    return (yl0) z13283891527057128406S7.a();
                                }
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                sh3Var2 = sh3Var;
                                try {
                                    sh3Var2.a(th);
                                    throw th;
                                } catch (Throwable th3) {
                                    sh3Var2.a();
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sh3Var2.a(th);
                            throw th;
                        }
                }
            }
        }, executorService).p(G17826342324976703097.class, new A14169635274474290551((byte) 3), z886113521968091188);
        this.d.a(yk0Var, (L7743116545240101509) j8856184873186011997P);
        return j8856184873186011997P;
    }
}
