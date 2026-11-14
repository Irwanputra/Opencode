package ads_mobile_sdk;

import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R5692663580087387669;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class l20 extends R14062301455140331524 implements F4096073349764486348 {
    public byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ w20 c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ AtomicReference e;
    public final /* synthetic */ R5692663580087387669 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l20(boolean z, w20 w20Var, Long l, AtomicReference atomicReference, R5692663580087387669 r5692663580087387669, R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.b = z;
        this.c = w20Var;
        this.d = l;
        this.e = atomicReference;
        this.f = r5692663580087387669;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        AtomicReference atomicReference = this.e;
        R5692663580087387669 r5692663580087387669 = this.f;
        return new l20(this.b, this.c, this.d, atomicReference, r5692663580087387669, (R4833348786910499294) obj).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007a, code lost:
    
        if (r14 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r1 = "Cronet was unable to be initialized and the SDK will not be able to make network requests: "
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            byte r2 = r13.a
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L17
            dev.epro.r0.E17665849472693074628.k(r14)     // Catch: java.lang.Throwable -> L13
            goto L7d
        L13:
            r0 = move-exception
            r14 = r0
            goto L9e
        L17:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r13)
            r13 = 0
            return r13
        L1e:
            dev.epro.r0.E17665849472693074628.k(r14)     // Catch: java.lang.Throwable -> L65
            goto Lb1
        L23:
            dev.epro.r0.E17665849472693074628.k(r14)
            boolean r14 = r13.b     // Catch: java.lang.Throwable -> L65
            if (r14 != 0) goto L5d
            ads_mobile_sdk.w20 r14 = r13.c     // Catch: java.lang.Throwable -> L65
            ads_mobile_sdk.jr0 r14 = r14.b     // Catch: java.lang.Throwable -> L65
            if (r14 == 0) goto L45
            java.lang.String r2 = "gads:cronet_init_timeout:seconds"
            long r5 = ads_mobile_sdk.jr0.A     // Catch: java.lang.Throwable -> L65
            dev.epro.r0.E17093345031926825464 r7 = new dev.epro.r0.E17093345031926825464     // Catch: java.lang.Throwable -> L65
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L65
            ads_mobile_sdk.ao r5 = ads_mobile_sdk.ao.a$2     // Catch: java.lang.Throwable -> L65
            java.lang.Object r14 = r14.a(r2, r7, r5)     // Catch: java.lang.Throwable -> L65
            dev.epro.r0.E17093345031926825464 r14 = (dev.epro.r0.E17093345031926825464) r14     // Catch: java.lang.Throwable -> L65
            long r5 = r14.a     // Catch: java.lang.Throwable -> L65
        L43:
            r11 = r5
            goto L48
        L45:
            long r5 = ads_mobile_sdk.jr0.A     // Catch: java.lang.Throwable -> L65
            goto L43
        L48:
            dev.epro.r0.G6169168210557100605 r5 = new dev.epro.r0.G6169168210557100605     // Catch: java.lang.Throwable -> L65
            ads_mobile_sdk.w20 r6 = r13.c     // Catch: java.lang.Throwable -> L65
            java.util.concurrent.atomic.AtomicReference r7 = r13.e     // Catch: java.lang.Throwable -> L65
            java.lang.Long r8 = r13.d     // Catch: java.lang.Throwable -> L65
            r10 = 2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L65
            r13.a = r4     // Catch: java.lang.Throwable -> L65
            java.lang.Object r14 = dev.epro.r0.V16504496955554646429.r(r11, r5, r13)     // Catch: java.lang.Throwable -> L65
            if (r14 != r0) goto Lb1
            goto L7c
        L5d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = "Cronet fallback provider forced to use."
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L65
            throw r14     // Catch: java.lang.Throwable -> L65
        L65:
            ads_mobile_sdk.w20 r14 = r13.c     // Catch: java.lang.Throwable -> L13
            org.chromium.net.impl.JavaCronetProvider r2 = new org.chromium.net.impl.JavaCronetProvider     // Catch: java.lang.Throwable -> L13
            android.content.Context r4 = r14.d     // Catch: java.lang.Throwable -> L13
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L13
            org.chromium.net.CronetEngine$Builder r2 = r2.createBuilder()     // Catch: java.lang.Throwable -> L13
            java.lang.Long r4 = r13.d     // Catch: java.lang.Throwable -> L13
            r13.a = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r14 = ads_mobile_sdk.w20.a(r14, r2, r4, r13)     // Catch: java.lang.Throwable -> L13
            if (r14 != r0) goto L7d
        L7c:
            return r0
        L7d:
            org.chromium.net.CronetEngine$Builder r14 = (org.chromium.net.CronetEngine.Builder) r14     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.atomic.AtomicReference r0 = r13.e     // Catch: java.lang.Throwable -> L13
            org.chromium.net.CronetEngine r14 = r14.build()     // Catch: java.lang.Throwable -> L13
            r0.set(r14)     // Catch: java.lang.Throwable -> L13
            ads_mobile_sdk.ii3 r14 = ads_mobile_sdk.ji3.b()     // Catch: java.lang.Throwable -> L13
            ads_mobile_sdk.th3 r14 = r14.a     // Catch: java.lang.Throwable -> L13
            if (r14 == 0) goto L95
            ads_mobile_sdk.cc2 r14 = r14.e()     // Catch: java.lang.Throwable -> L13
            goto L96
        L95:
            r14 = r9
        L96:
            if (r14 != 0) goto L99
            goto Lb1
        L99:
            java.lang.String r0 = "Fallback-Cronet-Provider"
            r14.z = r0     // Catch: java.lang.Throwable -> L13
            goto Lb1
        L9e:
            java.lang.String r14 = r14.getMessage()     // Catch: java.lang.Throwable -> Lb9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb9
            r0.append(r14)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r14 = r0.toString()     // Catch: java.lang.Throwable -> Lb9
            ads_mobile_sdk.xv.c(r14, r9)     // Catch: java.lang.Throwable -> Lb9
        Lb1:
            dev.epro.r0.R5692663580087387669 r13 = r13.f
            r13.f0()
            dev.epro.r0.O9245300239821758723 r13 = dev.epro.r0.O9245300239821758723.a
            return r13
        Lb9:
            r0 = move-exception
            r14 = r0
            dev.epro.r0.R5692663580087387669 r13 = r13.f
            r13.f0()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.l20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
