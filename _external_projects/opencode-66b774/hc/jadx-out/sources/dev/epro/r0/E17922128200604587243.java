package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E17922128200604587243 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ H16689892403409870979 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E17922128200604587243(H16689892403409870979 h16689892403409870979, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.u = h16689892403409870979;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        H16689892403409870979 h16689892403409870979 = this.u;
        switch (b) {
            case 0:
                return new E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 0);
            case 1:
                return new E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 1);
            case 2:
                return new E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 2);
            case 3:
                return new E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 3);
            case 4:
                return new E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 4);
            case 5:
                return new E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 5);
            case 6:
                return new E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 6);
            default:
                return new E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 7);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
            case 0:
                ((E17922128200604587243) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                ((E17922128200604587243) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
                break;
            case 2:
                ((E17922128200604587243) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
                break;
            case 3:
                ((E17922128200604587243) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
                break;
            case 4:
                ((E17922128200604587243) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
                break;
            case 5:
                ((E17922128200604587243) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
                break;
            case 6:
                ((E17922128200604587243) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
                break;
            default:
                ((E17922128200604587243) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        H16689892403409870979 h16689892403409870979 = this.u;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                h16689892403409870979.a();
                break;
            case 1:
                E17665849472693074628.k(obj);
                h16689892403409870979.b();
                break;
            case 2:
                E17665849472693074628.k(obj);
                h16689892403409870979.b();
                break;
            case 3:
                E17665849472693074628.k(obj);
                h16689892403409870979.a();
                break;
            case 4:
                E17665849472693074628.k(obj);
                h16689892403409870979.b();
                break;
            case 5:
                E17665849472693074628.k(obj);
                h16689892403409870979.b();
                break;
            case 6:
                E17665849472693074628.k(obj);
                h16689892403409870979.a();
                break;
            default:
                E17665849472693074628.k(obj);
                h16689892403409870979.b();
                break;
        }
        return o9245300239821758723;
    }
}
