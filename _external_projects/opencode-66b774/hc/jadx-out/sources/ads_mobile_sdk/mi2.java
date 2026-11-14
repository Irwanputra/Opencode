package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class mi2 extends R14062301455140331524 implements L12639328004344855510 {
    public H15186625828076266306 a;
    public ni2 b;
    public long c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ni2 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi2(long j, ni2 ni2Var, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.f = ni2Var;
        this.g = j;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        mi2 mi2Var = new mi2(this.g, this.f, r4833348786910499294);
        mi2Var.e = obj;
        return mi2Var;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((mi2) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:20:0x005d, B:22:0x0065, B:24:0x0069, B:27:0x006f), top: B:32:0x005d }] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            byte r0 = r9.d
            dev.epro.r0.O9245300239821758723 r1 = dev.epro.r0.O9245300239821758723.a
            ads_mobile_sdk.ni2 r2 = r9.f
            r3 = 2
            r4 = 1
            r5 = 0
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r0 == 0) goto L2e
            if (r0 == r4) goto L25
            if (r0 != r3) goto L1f
            long r6 = r9.c
            ads_mobile_sdk.ni2 r2 = r9.b
            dev.epro.r0.H15186625828076266306 r0 = r9.a
            java.lang.Object r9 = r9.e
            dev.epro.r0.W5797197595347441198 r9 = (dev.epro.r0.W5797197595347441198) r9
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L5d
        L1f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r5
        L25:
            java.lang.Object r0 = r9.e
            dev.epro.r0.W5797197595347441198 r0 = (dev.epro.r0.W5797197595347441198) r0
            dev.epro.r0.E17665849472693074628.k(r10)
            r10 = r0
            goto L46
        L2e:
            dev.epro.r0.E17665849472693074628.k(r10)
            java.lang.Object r10 = r9.e
            dev.epro.r0.W5797197595347441198 r10 = (dev.epro.r0.W5797197595347441198) r10
            ads_mobile_sdk.fl2 r0 = r2.a
            r9.e = r10
            r9.d = r4
            java.lang.Object r0 = r0.r(r9)
            if (r0 != r6) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 != r6) goto L46
            goto L5a
        L46:
            dev.epro.r0.H15186625828076266306 r0 = r2.f
            r9.e = r10
            r9.a = r0
            r9.b = r2
            long r7 = r9.g
            r9.c = r7
            r9.d = r3
            java.lang.Object r9 = r0.c(r9)
            if (r9 != r6) goto L5b
        L5a:
            return r6
        L5b:
            r9 = r10
            r6 = r7
        L5d:
            java.util.concurrent.atomic.AtomicBoolean r10 = r2.e     // Catch: java.lang.Throwable -> L6d
            boolean r10 = r10.get()     // Catch: java.lang.Throwable -> L6d
            if (r10 != 0) goto L84
            dev.epro.r0.X7175349259954592591 r10 = r2.g     // Catch: java.lang.Throwable -> L6d
            if (r10 == 0) goto L6f
            r10.c(r5)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r9 = move-exception
            goto L88
        L6f:
            dev.epro.r0.K17935692801815850892 r10 = new dev.epro.r0.K17935692801815850892     // Catch: java.lang.Throwable -> L6d
            r10.<init>(r6, r2, r5)     // Catch: java.lang.Throwable -> L6d
            dev.epro.r0.I3826119971291161142 r6 = dev.epro.r0.I3826119971291161142.a     // Catch: java.lang.Throwable -> L6d
            r9.getClass()     // Catch: java.lang.Throwable -> L6d
            dev.epro.r0.P7598478828797568949 r7 = new dev.epro.r0.P7598478828797568949     // Catch: java.lang.Throwable -> L6d
            r7.<init>(r10, r5, r4)     // Catch: java.lang.Throwable -> L6d
            dev.epro.r0.X7175349259954592591 r9 = dev.epro.r0.R7033599853981556291.E(r9, r6, r5, r7, r3)     // Catch: java.lang.Throwable -> L6d
            r2.g = r9     // Catch: java.lang.Throwable -> L6d
        L84:
            r0.b(r5)
            return r1
        L88:
            r0.b(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mi2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
