package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V1385751101624195996 extends R14062301455140331524 implements J12078565427869724451 {
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V1385751101624195996(int i, R4833348786910499294 r4833348786910499294, byte b) {
        super(i, r4833348786910499294);
        this.t = b;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        int i = 3;
        switch (b) {
            case 0:
                long j = ((L2216691091636065972) obj2).a;
                new V1385751101624195996(i, (R4833348786910499294) obj3, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new V1385751101624195996(i, (R4833348786910499294) obj3, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            default:
                long j2 = ((L2216691091636065972) obj2).a;
                new V1385751101624195996(i, (R4833348786910499294) obj3, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                break;
            case 1:
                E17665849472693074628.k(obj);
                break;
            default:
                E17665849472693074628.k(obj);
                break;
        }
        return o9245300239821758723;
    }
}
