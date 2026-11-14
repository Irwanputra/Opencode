package ads_mobile_sdk;

import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ff0 extends R14062301455140331524 implements L12639328004344855510 {
    public byte a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ rf0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff0(AtomicInteger atomicInteger, int i, int i2, rf0 rf0Var, int i3, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = atomicInteger;
        this.c = i;
        this.d = i2;
        this.e = rf0Var;
        this.f = i3;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new ff0(this.b, this.c, this.d, this.e, this.f, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((ff0) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r6.a((android.app.Activity) null, r9) == r7) goto L29;
     */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.a
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            ads_mobile_sdk.rf0 r6 = r9.e
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r0 == 0) goto L23
            if (r0 == r5) goto L1f
            if (r0 == r4) goto L1f
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L19
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L71
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r1
        L1f:
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L66
        L23:
            dev.epro.r0.E17665849472693074628.k(r10)
            java.util.concurrent.atomic.AtomicInteger r10 = r9.b
            int r0 = r10.get()
            int r8 = r9.c
            if (r0 == r8) goto L66
            int r10 = r10.get()
            int r0 = r9.d
            if (r10 != r0) goto L46
            ads_mobile_sdk.w81 r10 = r6.j
            r9.a = r5
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.w81.a(r10, r3, r9)
            if (r10 != r7) goto L66
            goto L70
        L46:
            int r0 = r9.f
            if (r10 != r0) goto L58
            ads_mobile_sdk.w81 r10 = r6.j
            r9.a = r4
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.w81.a(r10, r4, r9)
            if (r10 != r7) goto L66
            goto L70
        L58:
            ads_mobile_sdk.w81 r10 = r6.j
            r9.a = r3
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.w81.a(r10, r5, r9)
            if (r10 != r7) goto L66
            goto L70
        L66:
            r9.a = r2
            android.net.Uri r10 = ads_mobile_sdk.rf0.q
            java.lang.Object r9 = r6.a(r1, r9)
            if (r9 != r7) goto L71
        L70:
            return r7
        L71:
            dev.epro.r0.O9245300239821758723 r9 = dev.epro.r0.O9245300239821758723.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ff0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
