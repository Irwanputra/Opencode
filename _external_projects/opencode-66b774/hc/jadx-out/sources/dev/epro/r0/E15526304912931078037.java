package dev.epro.r0;

import ads_mobile_sdk.p32;
import ads_mobile_sdk.z23;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E15526304912931078037 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E15526304912931078037(byte b, R4833348786910499294 r4833348786910499294, Object obj, Object obj2, boolean z) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.x = obj2;
        this.v = z;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                return new E15526304912931078037((byte) 0, r4833348786910499294, (T10370494902461206356) obj3, (N17102349568798422850) obj2, this.v);
            default:
                return new E15526304912931078037((byte) 1, r4833348786910499294, (z23) obj3, (p32) obj2, this.v);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((E15526304912931078037) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((E15526304912931078037) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E15526304912931078037.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
