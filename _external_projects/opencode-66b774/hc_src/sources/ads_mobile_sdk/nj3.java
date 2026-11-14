package ads_mobile_sdk;

import android.net.Uri;
import android.os.SystemClock;
import dev.epro.r0.D15596191924284547207;
import dev.epro.r0.E1738554508920355622;
import dev.epro.r0.K3615309688696506893;
import dev.epro.r0.N2475062157440797164;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R12517428114166698439;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.Z115818233709597990;
import dev.epro.r0.Z13168519540281190457;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class nj3 implements E1738554508920355622, K3615309688696506893 {
    public final kz2 a;
    public final zm1 b;
    public final k8 c;
    public final kx2 d;
    public final Optional e;
    public final d33 f;
    public final z1 g;
    public final mi3 h;
    public final int i;
    public final O16637889491137121389 j;
    public final a33 k;
    public final zm0 l;
    public final eg2 m;
    public final V2597580950516131749 n;

    /* renamed from: o, reason: collision with root package name */
    public final ck f82o;
    public final Set p;
    public final jr0 q;
    public final m31 r;
    public final ft1 s;

    public nj3(kz2 kz2Var, zm1 zm1Var, k8 k8Var, kx2 kx2Var, Optional optional, d33 d33Var, z1 z1Var, mi3 mi3Var, int i, O16637889491137121389 o16637889491137121389, a33 a33Var, zm0 zm0Var, eg2 eg2Var, V2597580950516131749 v2597580950516131749, ck ckVar, Set set, jr0 jr0Var, m31 m31Var) {
        kz2Var.getClass();
        zm1Var.getClass();
        k8Var.getClass();
        kx2Var.getClass();
        optional.getClass();
        d33Var.getClass();
        z1Var.getClass();
        mi3Var.getClass();
        o16637889491137121389.getClass();
        a33Var.getClass();
        zm0Var.getClass();
        eg2Var.getClass();
        v2597580950516131749.getClass();
        ckVar.getClass();
        set.getClass();
        jr0Var.getClass();
        m31Var.getClass();
        this.a = kz2Var;
        this.b = zm1Var;
        this.c = k8Var;
        this.d = kx2Var;
        this.e = optional;
        this.f = d33Var;
        this.g = z1Var;
        this.h = mi3Var;
        this.i = i;
        this.j = o16637889491137121389;
        this.k = a33Var;
        this.l = zm0Var;
        this.m = eg2Var;
        this.n = v2597580950516131749;
        this.f82o = ckVar;
        this.p = set;
        this.q = jr0Var;
        this.r = m31Var;
        this.s = new ft1(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // dev.epro.r0.E1738554508920355622
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.T913357428039952817 r17, dev.epro.r0.R4833348786910499294 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof ads_mobile_sdk.hj3
            if (r2 == 0) goto L18
            r2 = r1
            ads_mobile_sdk.hj3 r2 = (ads_mobile_sdk.hj3) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.d = r3
        L16:
            r14 = r2
            goto L20
        L18:
            ads_mobile_sdk.hj3 r2 = new ads_mobile_sdk.hj3
            dev.epro.r0.K14749510448791472029 r1 = (dev.epro.r0.K14749510448791472029) r1
            r2.<init>(r0, r1)
            goto L16
        L20:
            java.lang.Object r1 = r14.b
            int r2 = r14.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L31
            ads_mobile_sdk.nj3 r0 = r14.a
            dev.epro.r0.E17665849472693074628.k(r1)
            goto Lb9
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r3
        L37:
            dev.epro.r0.E17665849472693074628.k(r1)
            r17.getClass()
            r1 = r17
            int r1 = r1.n
            r2 = 0
            if (r1 == r4) goto L54
            r5 = 2
            if (r1 == r5) goto L52
            r5 = 3
            if (r1 == r5) goto L55
            r5 = 4
            if (r1 == r5) goto L55
            r5 = 5
            if (r1 != r5) goto L51
            goto L55
        L51:
            throw r3
        L52:
            r5 = r4
            goto L55
        L54:
            r5 = r2
        L55:
            ads_mobile_sdk.z1 r1 = r0.g
            java.util.ArrayList r1 = r1.W
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = dev.epro.r0.Z115818233709597990.k0(r1, r6)
            r3.<init>(r6)
            int r6 = r1.size()
            r7 = r2
        L69:
            if (r7 >= r6) goto L96
            java.lang.Object r8 = r1.get(r7)
            int r7 = r7 + 1
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.String r8 = r8.toString()
            r8.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "2."
            r9.<init>(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "@gw_mpe@"
            java.lang.String r8 = dev.epro.r0.Z13168519540281190457.D(r2, r8, r10, r9)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r3.add(r8)
            goto L69
        L96:
            java.lang.Integer r7 = new java.lang.Integer
            int r1 = r0.i
            r7.<init>(r1)
            r14.a = r0
            r14.d = r4
            r13 = 0
            r15 = 1008(0x3f0, float:1.413E-42)
            r4 = r3
            ads_mobile_sdk.zm1 r3 = r0.b
            ads_mobile_sdk.d33 r5 = r0.f
            ads_mobile_sdk.z1 r6 = r0.g
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.Object r1 = ads_mobile_sdk.zm1.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            if (r1 != r2) goto Lb9
            return r2
        Lb9:
            java.util.List r1 = (java.util.List) r1
            a(r0, r1)
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nj3.a(dev.epro.r0.T913357428039952817, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // dev.epro.r0.K3615309688696506893
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(dev.epro.r0.R4833348786910499294 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof ads_mobile_sdk.lj3
            if (r0 == 0) goto L14
            r0 = r15
            ads_mobile_sdk.lj3 r0 = (ads_mobile_sdk.lj3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r12 = r0
            goto L1c
        L14:
            ads_mobile_sdk.lj3 r0 = new ads_mobile_sdk.lj3
            dev.epro.r0.K14749510448791472029 r15 = (dev.epro.r0.K14749510448791472029) r15
            r0.<init>(r14, r15)
            goto L12
        L1c:
            java.lang.Object r15 = r12.b
            int r0 = r12.d
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            ads_mobile_sdk.nj3 r14 = r12.a
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L59
        L2b:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r14)
            r14 = 0
            return r14
        L32:
            dev.epro.r0.E17665849472693074628.k(r15)
            ads_mobile_sdk.z1 r4 = r14.g
            java.util.ArrayList r2 = r4.i0
            java.lang.Integer r5 = new java.lang.Integer
            int r15 = r14.i
            r5.<init>(r15)
            r12.a = r14
            r12.d = r1
            r11 = 0
            r13 = 1008(0x3f0, float:1.413E-42)
            ads_mobile_sdk.zm1 r1 = r14.b
            ads_mobile_sdk.d33 r3 = r14.f
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.Object r15 = ads_mobile_sdk.zm1.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r15 != r0) goto L59
            return r0
        L59:
            java.util.List r15 = (java.util.List) r15
            a(r14, r15)
            dev.epro.r0.O9245300239821758723 r14 = dev.epro.r0.O9245300239821758723.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nj3.f(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0152 A[Catch: all -> 0x015e, TryCatch #10 {all -> 0x015e, blocks: (B:24:0x014b, B:26:0x0152, B:28:0x0156, B:30:0x015a, B:31:0x0161, B:33:0x0165, B:35:0x0169, B:37:0x016d, B:38:0x016e, B:39:0x0173, B:40:0x0174, B:41:0x017b, B:42:0x017c, B:43:0x0183, B:44:0x0184), top: B:23:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0184 A[Catch: all -> 0x015e, TRY_LEAVE, TryCatch #10 {all -> 0x015e, blocks: (B:24:0x014b, B:26:0x0152, B:28:0x0156, B:30:0x015a, B:31:0x0161, B:33:0x0165, B:35:0x0169, B:37:0x016d, B:38:0x016e, B:39:0x0173, B:40:0x0174, B:41:0x017b, B:42:0x017c, B:43:0x0183, B:44:0x0184), top: B:23:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:70:0x00bd, B:72:0x00c4, B:74:0x00c8, B:76:0x00cc, B:77:0x00d3, B:79:0x00d7, B:81:0x00db, B:83:0x00df, B:84:0x00e0, B:85:0x00e5, B:86:0x00e6, B:87:0x00ed, B:88:0x00ee, B:89:0x00f5, B:90:0x00f6), top: B:69:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:70:0x00bd, B:72:0x00c4, B:74:0x00c8, B:76:0x00cc, B:77:0x00d3, B:79:0x00d7, B:81:0x00db, B:83:0x00df, B:84:0x00e0, B:85:0x00e5, B:86:0x00e6, B:87:0x00ed, B:88:0x00ee, B:89:0x00f5, B:90:0x00f6), top: B:69:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v16, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // dev.epro.r0.E1738554508920355622
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(dev.epro.r0.R4833348786910499294 r19) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nj3.j(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // dev.epro.r0.K3615309688696506893
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(dev.epro.r0.R4833348786910499294 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof ads_mobile_sdk.mj3
            if (r0 == 0) goto L14
            r0 = r15
            ads_mobile_sdk.mj3 r0 = (ads_mobile_sdk.mj3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r12 = r0
            goto L1c
        L14:
            ads_mobile_sdk.mj3 r0 = new ads_mobile_sdk.mj3
            dev.epro.r0.K14749510448791472029 r15 = (dev.epro.r0.K14749510448791472029) r15
            r0.<init>(r14, r15)
            goto L12
        L1c:
            java.lang.Object r15 = r12.b
            int r0 = r12.d
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            ads_mobile_sdk.nj3 r14 = r12.a
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L59
        L2b:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r14)
            r14 = 0
            return r14
        L32:
            dev.epro.r0.E17665849472693074628.k(r15)
            ads_mobile_sdk.z1 r4 = r14.g
            java.util.ArrayList r2 = r4.j0
            java.lang.Integer r5 = new java.lang.Integer
            int r15 = r14.i
            r5.<init>(r15)
            r12.a = r14
            r12.d = r1
            r11 = 0
            r13 = 1008(0x3f0, float:1.413E-42)
            ads_mobile_sdk.zm1 r1 = r14.b
            ads_mobile_sdk.d33 r3 = r14.f
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.Object r15 = ads_mobile_sdk.zm1.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r15 != r0) goto L59
            return r0
        L59:
            java.util.List r15 = (java.util.List) r15
            a(r14, r15)
            dev.epro.r0.O9245300239821758723 r14 = dev.epro.r0.O9245300239821758723.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nj3.k(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0141, code lost:
    
        if (r1 == r3) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x010a -> B:17:0x010c). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.E1738554508920355622
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(dev.epro.r0.R4833348786910499294 r23) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nj3.n(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01c7, code lost:
    
        if (r1 != r3) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x013e -> B:23:0x0143). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.E1738554508920355622
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(dev.epro.r0.R4833348786910499294 r24) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nj3.q(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.K3615309688696506893
    public final O9245300239821758723 a(R12517428114166698439 r12517428114166698439, R4833348786910499294 r4833348786910499294) {
        ArrayList arrayList = this.g.f0;
        this.j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a33 a33Var = this.k;
        ii iiVar = a33Var.a;
        D15596191924284547207[] d15596191924284547207Arr = a33.b;
        N2475062157440797164 n2475062157440797164 = (N2475062157440797164) iiVar.getValue(a33Var, d15596191924284547207Arr[0]);
        String str = n2475062157440797164 != null ? n2475062157440797164.a : null;
        N2475062157440797164 n24750621574407971642 = (N2475062157440797164) a33Var.a.getValue(a33Var, d15596191924284547207Arr[0]);
        String str2 = n24750621574407971642 != null ? n24750621574407971642.b : null;
        zm1 zm1Var = this.b;
        zm1Var.getClass();
        r12517428114166698439.getClass();
        ArrayList arrayList2 = new ArrayList(Z115818233709597990.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String uri = ((Uri) obj).toString();
            uri.getClass();
            String str3 = "";
            String encode = Uri.encode(str == null ? "" : str);
            encode.getClass();
            String D = Z13168519540281190457.D(false, uri, "@gw_rwd_userid@", encode);
            if (str2 != null) {
                str3 = str2;
            }
            String encode2 = Uri.encode(str3);
            encode2.getClass();
            String D2 = Z13168519540281190457.D(false, Z13168519540281190457.D(false, D, "@gw_rwd_custom_data@", encode2), "@gw_tmstmp@", String.valueOf(elapsedRealtime));
            String encode3 = Uri.encode(r12517428114166698439.getType());
            encode3.getClass();
            arrayList2.add(Uri.parse(Z13168519540281190457.D(false, Z13168519540281190457.D(false, Z13168519540281190457.D(false, D2, "@gw_rwd_itm@", encode3), "@gw_rwd_amt@", String.valueOf(r12517428114166698439.getAmount())), "@gw_sdkver@", zm1Var.b)));
        }
        a(this, arrayList2);
        return O9245300239821758723.a;
    }

    public static void a(nj3 nj3Var, List list) {
        Boolean bool = Boolean.FALSE;
        kx2 kx2Var = nj3Var.d;
        kx2Var.getClass();
        list.getClass();
        jx2.a(kx2Var.c, list, kx2Var.a, kx2Var.b, null, bool, 32);
    }
}
