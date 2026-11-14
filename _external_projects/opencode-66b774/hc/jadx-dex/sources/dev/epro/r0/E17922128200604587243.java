package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E17922128200604587243 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ dev.epro.r0.H16689892403409870979 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E17922128200604587243(dev.epro.r0.H16689892403409870979 h16689892403409870979, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.u = h16689892403409870979;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.H16689892403409870979 h16689892403409870979 = this.u;
        switch (b) {
            case 0:
                return new dev.epro.r0.E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 0);
            case 1:
                return new dev.epro.r0.E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 1);
            case 2:
                return new dev.epro.r0.E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 2);
            case 3:
                return new dev.epro.r0.E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 3);
            case 4:
                return new dev.epro.r0.E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 4);
            case 5:
                return new dev.epro.r0.E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 5);
            case 6:
                return new dev.epro.r0.E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 6);
            default:
                return new dev.epro.r0.E17922128200604587243(h16689892403409870979, r4833348786910499294, (byte) 7);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) obj;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = (dev.epro.r0.R4833348786910499294) obj2;
        switch (b) {
            case 0:
                create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
                break;
            case 2:
                create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
                break;
            case 3:
                create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
                break;
            case 4:
                create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
                break;
            case 5:
                create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
                break;
            case 6:
                create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
                break;
            default:
                create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.H16689892403409870979 h16689892403409870979 = this.u;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                h16689892403409870979.a();
                break;
            case 1:
                dev.epro.r0.E17665849472693074628.k(obj);
                h16689892403409870979.b();
                break;
            case 2:
                dev.epro.r0.E17665849472693074628.k(obj);
                h16689892403409870979.b();
                break;
            case 3:
                dev.epro.r0.E17665849472693074628.k(obj);
                h16689892403409870979.a();
                break;
            case 4:
                dev.epro.r0.E17665849472693074628.k(obj);
                h16689892403409870979.b();
                break;
            case 5:
                dev.epro.r0.E17665849472693074628.k(obj);
                h16689892403409870979.b();
                break;
            case 6:
                dev.epro.r0.E17665849472693074628.k(obj);
                h16689892403409870979.a();
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                h16689892403409870979.b();
                break;
        }
        return o9245300239821758723;
    }
}
