package ads_mobile_sdk;

import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ic2 extends R14062301455140331524 implements L12639328004344855510 {
    public byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ mc2 c;
    public final /* synthetic */ sk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic2(long j, mc2 mc2Var, sk skVar, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = j;
        this.c = mc2Var;
        this.d = skVar;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new ic2(this.b, this.c, this.d, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((ic2) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (ads_mobile_sdk.mc2.a(r13, r12) == r1) goto L20;
     */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ic2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
