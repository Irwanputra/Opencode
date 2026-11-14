package dev.epro.r0;

import ads_mobile_sdk.ni2;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K17935692801815850892 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t = 1;
    public byte u;
    public /* synthetic */ Object v;
    public final /* synthetic */ long w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K17935692801815850892(H16689892403409870979 h16689892403409870979, D2717688760023469083 d2717688760023469083, long j, S9385204271696540760 s9385204271696540760, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.x = h16689892403409870979;
        this.y = d2717688760023469083;
        this.w = j;
        this.z = s9385204271696540760;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                K17935692801815850892 k17935692801815850892 = new K17935692801815850892((H16689892403409870979) this.x, (D2717688760023469083) this.y, this.w, (S9385204271696540760) obj2, r4833348786910499294);
                k17935692801815850892.v = obj;
                return k17935692801815850892;
            default:
                K17935692801815850892 k179356928018158508922 = new K17935692801815850892(this.w, (ni2) obj2, r4833348786910499294);
                k179356928018158508922.v = obj;
                return k179356928018158508922;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((K17935692801815850892) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((K17935692801815850892) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #0 {all -> 0x009e, blocks: (B:28:0x0089, B:30:0x009b), top: B:59:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K17935692801815850892.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K17935692801815850892(long j, ni2 ni2Var, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = j;
        this.z = ni2Var;
    }
}
