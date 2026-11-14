package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.N4024785987441166868;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class hf2 extends c61 {
    public final W5797197595347441198 c;
    public final jr0 d;
    public boolean e;
    public final H15186625828076266306 f;
    public final LinkedHashMap g;
    public final ReferenceQueue h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf2(W5797197595347441198 w5797197595347441198, jr0 jr0Var) {
        super((wv0) null, 3);
        w5797197595347441198.getClass();
        jr0Var.getClass();
        this.c = w5797197595347441198;
        this.d = jr0Var;
        this.f = new H15186625828076266306();
        this.g = new LinkedHashMap();
        this.h = new ReferenceQueue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008d -> B:21:0x004c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0090 -> B:22:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c1 -> B:17:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ads_mobile_sdk.hf2 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.df2
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.df2 r0 = (ads_mobile_sdk.df2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.df2 r0 = new ads_mobile_sdk.df2
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L27
            if (r1 == r2) goto L31
            if (r1 != r3) goto L2b
            ads_mobile_sdk.hf2 r9 = r0.a
        L27:
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L3e
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return
        L31:
            dev.epro.r0.H15186625828076266306 r9 = r0.c
            ads_mobile_sdk.nu0 r1 = r0.b
            ads_mobile_sdk.hf2 r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            r8 = r5
            r5 = r9
            r9 = r8
            goto L62
        L3e:
            java.lang.ref.ReferenceQueue r10 = r9.h
            java.lang.ref.Reference r10 = r10.poll()
            boolean r1 = r10 instanceof ads_mobile_sdk.nu0
            if (r1 == 0) goto L4b
            ads_mobile_sdk.nu0 r10 = (ads_mobile_sdk.nu0) r10
            goto L4c
        L4b:
            r10 = r4
        L4c:
            r1 = r10
        L4d:
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L97
            dev.epro.r0.H15186625828076266306 r5 = r9.f
            r0.a = r9
            r0.b = r1
            r0.c = r5
            r0.f = r2
            java.lang.Object r6 = r5.c(r0)
            if (r6 != r10) goto L62
            goto Lc3
        L62:
            java.util.LinkedHashMap r10 = r9.g     // Catch: java.lang.Throwable -> L92
            java.lang.Object r10 = r10.remove(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L92
            r5.b(r4)
            dev.epro.r0.W5797197595347441198 r10 = r9.c
            dev.epro.r0.N4024785987441166868 r5 = new dev.epro.r0.N4024785987441166868
            r6 = 8
            r5.<init>(r1, r4, r6)
            r10.getClass()
            dev.epro.r0.P7598478828797568949 r1 = new dev.epro.r0.P7598478828797568949
            r1.<init>(r5, r4, r2)
            dev.epro.r0.I3826119971291161142 r5 = dev.epro.r0.I3826119971291161142.a
            dev.epro.r0.R7033599853981556291.E(r10, r5, r4, r1, r3)
            java.lang.ref.ReferenceQueue r10 = r9.h
            java.lang.ref.Reference r10 = r10.poll()
            boolean r1 = r10 instanceof ads_mobile_sdk.nu0
            if (r1 == 0) goto L90
            ads_mobile_sdk.nu0 r10 = (ads_mobile_sdk.nu0) r10
            goto L4c
        L90:
            r1 = r4
            goto L4d
        L92:
            r9 = move-exception
            r5.b(r4)
            throw r9
        L97:
            ads_mobile_sdk.jr0 r1 = r9.d
            r1.getClass()
            dev.epro.r0.E17149812035295265804 r5 = dev.epro.r0.E17093345031926825464.b
            dev.epro.r0.N13798149404328803870 r5 = dev.epro.r0.N13798149404328803870.MINUTES
            long r5 = dev.epro.r0.M9216324016624295870.Z(r3, r5)
            dev.epro.r0.E17093345031926825464 r7 = new dev.epro.r0.E17093345031926825464
            r7.<init>(r5)
            ads_mobile_sdk.ao r5 = ads_mobile_sdk.ao.a$2
            java.lang.String r6 = "gads:phantom_reference_interval:seconds"
            java.lang.Object r1 = r1.a(r6, r7, r5)
            dev.epro.r0.E17093345031926825464 r1 = (dev.epro.r0.E17093345031926825464) r1
            long r5 = r1.a
            r0.a = r9
            r0.b = r4
            r0.c = r4
            r0.f = r3
            java.lang.Object r1 = dev.epro.r0.J8045362843799184672.J(r5, r0)
            if (r1 != r10) goto L3e
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hf2.a(ads_mobile_sdk.hf2, dev.epro.r0.K14749510448791472029):void");
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        jr0 jr0Var = this.d;
        jr0Var.getClass();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        byte b = 1;
        boolean z = E17093345031926825464.c(((E17093345031926825464) jr0Var.a("gads:phantom_reference_interval:seconds", new E17093345031926825464(M9216324016624295870.Z(2, N13798149404328803870.MINUTES)), ao.a$2)).a, 0L) > 0;
        this.e = z;
        if (z) {
            R4833348786910499294 r48333487869104992942 = null;
            N4024785987441166868 n4024785987441166868 = new N4024785987441166868(this, r48333487869104992942, (byte) 12);
            W5797197595347441198 w5797197595347441198 = this.c;
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(n4024785987441166868, r48333487869104992942, b), 2);
        }
        return new xu0(O9245300239821758723.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.hf2 r5, java.lang.Object r6, dev.epro.r0.K3711868874634114208 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.ff2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ff2 r0 = (ads_mobile_sdk.ff2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.ff2 r0 = new ads_mobile_sdk.ff2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L38
            if (r1 != r3) goto L32
            dev.epro.r0.H15186625828076266306 r5 = r0.d
            dev.epro.r0.K3711868874634114208 r7 = r0.c
            java.lang.Object r6 = r0.b
            ads_mobile_sdk.hf2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r5
            r5 = r0
            goto L55
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r4
        L38:
            dev.epro.r0.E17665849472693074628.k(r8)
            boolean r8 = r5.e
            if (r8 != 0) goto L40
            return r2
        L40:
            dev.epro.r0.H15186625828076266306 r8 = r5.f
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.d = r8
            r0.g = r3
            java.lang.Object r0 = r8.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L55
            return r1
        L55:
            java.util.LinkedHashMap r0 = r5.g     // Catch: java.lang.Throwable -> L67
            ads_mobile_sdk.nu0 r1 = new ads_mobile_sdk.nu0     // Catch: java.lang.Throwable -> L67
            java.lang.ref.ReferenceQueue r5 = r5.h     // Catch: java.lang.Throwable -> L67
            r1.<init>(r7, r6, r5)     // Catch: java.lang.Throwable -> L67
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L67
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L67
            r8.b(r4)
            return r2
        L67:
            r5 = move-exception
            r8.b(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hf2.a(ads_mobile_sdk.hf2, java.lang.Object, dev.epro.r0.K3711868874634114208, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
