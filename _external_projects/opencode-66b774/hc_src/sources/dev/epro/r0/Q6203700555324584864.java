package dev.epro.r0;

import ads_mobile_sdk.au3;
import ads_mobile_sdk.mu3;
import ads_mobile_sdk.qu3;
import ads_mobile_sdk.st3;
import ads_mobile_sdk.tt3;
import ads_mobile_sdk.ut3;
import ads_mobile_sdk.vo3;
import ads_mobile_sdk.vu3;
import ads_mobile_sdk.wt3;
import ads_mobile_sdk.xt3;
import ads_mobile_sdk.zt3;
import android.content.Context;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q6203700555324584864 implements H3430986877638506198 {
    public boolean a;
    public Object b;

    public Q6203700555324584864(byte b) {
        switch (b) {
            case 2:
                this.a = true;
                this.b = Collections.singletonList(null);
                break;
            default:
                int[] iArr = {530498338, 909437126, 1273894288, 894494823, 1232015929, -100152071, 858712529, 970925433, 309198987};
                int i = iArr[7] % iArr[8];
                mu3 mu3Var = new mu3();
                O12545633033254628644 o12545633033254628644 = new O12545633033254628644((byte) 12);
                O3228356295430981133 o3228356295430981133 = new O3228356295430981133(zt3.b, 0, new U11450443558875589191((byte) 11));
                o3228356295430981133.d = o12545633033254628644;
                this.b = new qu3(mu3Var, o3228356295430981133);
                this.a = false;
                break;
        }
    }

    public static byte[] b() {
        short d = (short) (C468629748621011703.d(((~1529195746) & 118097808) | 3345166, (1529195746 & 656934035) | 821390159, 1125361885, 184839124) ^ (1037127828 % 1034949299));
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        ByteBuffer allocate = ByteBuffer.allocate(C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort(d);
        allocate.putInt(1182321202);
        return allocate.array();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x043d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03fe A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.util.Optional r25) {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q6203700555324584864.a(java.util.Optional):java.lang.Object");
    }

    public void c() {
        int d = C468629748621011703.d(1393976626, 1274658619, 1944425977, 41268864) ^ 765508363;
        try {
            int c = ((qu3) this.b).c.c();
            int i = ((c & d) << 16) >> 16;
            int i2 = (((c >> 16) & d) << 16) >> 16;
            if (i != -14426) {
                throw new X11759594239978599137(xt3.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo").concat(String.format(xt3.a("e1Hk+x0="), Short.valueOf((short) i))));
            }
            if (i2 == 5) {
                return;
            }
            throw new X11759594239978599137(xt3.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=").concat(String.format(xt3.a("e1Hk+x0="), Short.valueOf((short) i2))));
        } catch (U10904789608794664935 e) {
            throw new X11759594239978599137(xt3.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e);
        }
    }

    public void d() {
        int[] iArr = {171029949, 1356422403, 1913211838, 215266853, 506454572, 1309457854, 56236614, 1696779465, 30245415};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int d = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        try {
            int c = ((qu3) this.b).c.c();
            if (c == d) {
                return;
            }
            throw new X11759594239978599137(xt3.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1").concat(String.format(xt3.a("e1Hk9x0="), Integer.valueOf(c))));
        } catch (U10904789608794664935 e) {
            throw new X11759594239978599137(xt3.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e);
        }
    }

    public void e() {
        try {
            O3228356295430981133 o3228356295430981133 = ((qu3) this.b).c;
            int c = o3228356295430981133.c();
            int[] iArr = N6439517694723614773.a;
            ((O12545633033254628644) o3228356295430981133.d).getClass();
            o3228356295430981133.c = new N12245111110189169079(new mu3(iArr, c));
        } catch (U10904789608794664935 e) {
            throw new I10296188574218802332(vo3.e, e);
        }
    }

    @Override // dev.epro.r0.H3430986877638506198
    public Object f() {
        return HsdpDeepLinkServiceFactory.lambda$createInternal$0((Context) this.b, this.a);
    }

    public /* synthetic */ Q6203700555324584864(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q6203700555324584864(B14108412273878533248 b14108412273878533248, int i) {
        this.b = b14108412273878533248;
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r12, java.util.Optional r14) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q6203700555324584864.a(long, java.util.Optional):java.lang.Object");
    }

    public void a() {
        mu3 mu3Var = ((qu3) this.b).a;
        boolean z = this.a;
        String a = xt3.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z) {
            return;
        }
        try {
            HashMap hashMap = L1547307052898864898.a;
            N12245111110189169079 n12245111110189169079 = new N12245111110189169079(4);
            n12245111110189169079.n(au3.a, vu3.a((M15281894020734075014) tt3.s));
            n12245111110189169079.n(au3.b, vu3.a((M15281894020734075014) new ut3(0L)));
            n12245111110189169079.n(au3.c, vu3.a((M15281894020734075014) new ut3(1L)));
            n12245111110189169079.n(au3.d, vu3.a((M15281894020734075014) new ut3(2L)));
            n12245111110189169079.n(au3.e, vu3.a((M15281894020734075014) new ut3(3L)));
            n12245111110189169079.n(au3.f, vu3.a((M15281894020734075014) new ut3(4L)));
            n12245111110189169079.n(au3.g, vu3.a((M15281894020734075014) new ut3(7L)));
            n12245111110189169079.n(au3.h, vu3.a((M15281894020734075014) new ut3(-1L)));
            n12245111110189169079.n(au3.i, vu3.a((M15281894020734075014) new ut3(-2L)));
            n12245111110189169079.n(au3.j, vu3.a((M15281894020734075014) st3.b));
            n12245111110189169079.n(au3.k, vu3.a((M15281894020734075014) st3.d));
            n12245111110189169079.n(au3.l, vu3.a((M15281894020734075014) st3.j));
            n12245111110189169079.n(au3.m, vu3.a((M15281894020734075014) st3.k));
            n12245111110189169079.n(au3.n, vu3.a((M15281894020734075014) st3.n));
            n12245111110189169079.n(au3.f9o, vu3.a((M15281894020734075014) tt3.n));
            n12245111110189169079.n(au3.p, vu3.a((M15281894020734075014) st3.f));
            n12245111110189169079.n(au3.q, vu3.a((M15281894020734075014) st3.g));
            n12245111110189169079.n(au3.r, vu3.a((M15281894020734075014) st3.h));
            n12245111110189169079.n(au3.s, vu3.a((M15281894020734075014) st3.i));
            n12245111110189169079.n(au3.t, vu3.a((M15281894020734075014) tt3.h));
            n12245111110189169079.n(au3.u, vu3.a((M15281894020734075014) tt3.j));
            n12245111110189169079.n(au3.w, vu3.a((M15281894020734075014) st3.f108o));
            n12245111110189169079.n(au3.x, vu3.a((M15281894020734075014) st3.p));
            n12245111110189169079.n(au3.y, vu3.a((M15281894020734075014) st3.s));
            n12245111110189169079.n(au3.z, vu3.a((M15281894020734075014) st3.t));
            n12245111110189169079.n(au3.A, vu3.a((M15281894020734075014) st3.u));
            n12245111110189169079.n(au3.B, vu3.a((M15281894020734075014) st3.v));
            n12245111110189169079.n(au3.C, vu3.a((M15281894020734075014) tt3.b));
            n12245111110189169079.n(au3.D, vu3.a((M15281894020734075014) tt3.d));
            n12245111110189169079.n(au3.E, vu3.a((M15281894020734075014) tt3.e));
            n12245111110189169079.n(au3.F, vu3.a((M15281894020734075014) tt3.f));
            n12245111110189169079.n(au3.G, vu3.a((M15281894020734075014) tt3.k));
            n12245111110189169079.n(au3.H, vu3.a((M15281894020734075014) tt3.l));
            n12245111110189169079.n(au3.I, vu3.a((M15281894020734075014) tt3.p));
            n12245111110189169079.n(au3.J, vu3.a((M15281894020734075014) tt3.q));
            n12245111110189169079.n(au3.K, vu3.a((M15281894020734075014) tt3.u));
            n12245111110189169079.n(au3.L, vu3.a((M15281894020734075014) tt3.v));
            n12245111110189169079.n(au3.M, vu3.a((M15281894020734075014) wt3.b));
            n12245111110189169079.n(au3.N, vu3.a((M15281894020734075014) wt3.d));
            n12245111110189169079.n(au3.U, vu3.a((M15281894020734075014) wt3.e));
            n12245111110189169079.n(au3.O, vu3.a((M15281894020734075014) wt3.j));
            n12245111110189169079.n(au3.P, vu3.a((M15281894020734075014) wt3.k));
            n12245111110189169079.n(au3.Q, vu3.a((M15281894020734075014) wt3.n));
            n12245111110189169079.n(au3.R, vu3.a((M15281894020734075014) wt3.q));
            n12245111110189169079.n(au3.S, vu3.a((M15281894020734075014) st3.q));
            n12245111110189169079.n(au3.T, vu3.a((M15281894020734075014) wt3.l));
            n12245111110189169079.n(au3.V, vu3.a((M15281894020734075014) st3.l));
            n12245111110189169079.n(au3.W, vu3.a((M15281894020734075014) wt3.g));
            n12245111110189169079.n(au3.X, vu3.a((M15281894020734075014) wt3.h));
            n12245111110189169079.n(au3.v, vu3.a((M15281894020734075014) tt3.i));
            n12245111110189169079.n(au3.Y, vu3.a((M15281894020734075014) wt3.p));
            n12245111110189169079.n(au3.Z, vu3.a((M15281894020734075014) tt3.m));
            n12245111110189169079.n(au3.a0, vu3.a((M15281894020734075014) wt3.f125o));
            n12245111110189169079.n(au3.b0, vu3.a((M15281894020734075014) tt3.c));
            n12245111110189169079.n(au3.c0, vu3.a((M15281894020734075014) wt3.c));
            n12245111110189169079.n(au3.d0, vu3.a((M15281894020734075014) st3.r));
            n12245111110189169079.n(au3.e0, vu3.a((M15281894020734075014) wt3.m));
            n12245111110189169079.n(au3.f0, vu3.a((M15281894020734075014) st3.e));
            n12245111110189169079.n(au3.g0, vu3.a((M15281894020734075014) wt3.f));
            n12245111110189169079.n(au3.h0, vu3.a((M15281894020734075014) tt3.t));
            n12245111110189169079.n(au3.i0, vu3.a((M15281894020734075014) st3.c));
            n12245111110189169079.n(au3.j0, vu3.a((M15281894020734075014) wt3.i));
            n12245111110189169079.n(au3.k0, vu3.a((M15281894020734075014) tt3.f111o));
            n12245111110189169079.n(au3.l0, vu3.a((M15281894020734075014) st3.m));
            n12245111110189169079.n(au3.m0, vu3.a((M15281894020734075014) tt3.r));
            n12245111110189169079.n(au3.n0, vu3.a((M15281894020734075014) tt3.g));
            A13981518004556070623 d = n12245111110189169079.d();
            for (long j = -1; j >= -82; j--) {
                au3 au3Var = (au3) hashMap.get(Long.valueOf(j));
                if (au3Var == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 36);
                    sb.append(a);
                    sb.append(j);
                    throw new M8821877208104636290(sb.toString());
                }
                mu3Var.a((vu3) d.get(au3Var));
            }
            for (int d2 = C468629748621011703.d(2138952001, 664592093, -868790359, 1108537283) ^ 485904490; d2 < 1159; d2++) {
                mu3Var.a(vu3.a((Object) null));
            }
            this.a = true;
        } catch (N2553658702658867020 e) {
            throw new I10296188574218802332(vo3.b, e);
        }
    }
}
