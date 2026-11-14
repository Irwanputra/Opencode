package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.F6942723054099263096;
import dev.epro.r0.G17481180015085314196;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.Q6344330807969154194;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class jr3 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ bs3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr3(bs3 bs3Var, String str, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = bs3Var;
        this.b = str;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        String str = this.b;
        bs3 bs3Var = this.a;
        switch (b) {
            case 0:
                return new jr3(bs3Var, str, r4833348786910499294, (byte) 0);
            default:
                return new jr3(bs3Var, str, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        String str = this.b;
        bs3 bs3Var = this.a;
        switch (b) {
            case 0:
                return new jr3(bs3Var, str, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                new jr3(bs3Var, str, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        String str = this.b;
        bs3 bs3Var = this.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                bs3Var.j.getClass();
                if (!Q6344330807969154194.f456o.b()) {
                    throw Q6344330807969154194.a();
                }
                F6942723054099263096 f6942723054099263096 = F6942723054099263096.c;
                if (f6942723054099263096 == null) {
                    f6942723054099263096 = new F6942723054099263096(G17481180015085314196.a.getProfileStore(), (byte) 29);
                    F6942723054099263096.c = f6942723054099263096;
                }
                return f6942723054099263096.h(str);
            default:
                E17665849472693074628.k(obj);
                try {
                    bs3Var.j.getClass();
                    str.getClass();
                } catch (Throwable unused) {
                }
                if (!Q6344330807969154194.f456o.b()) {
                    throw Q6344330807969154194.a();
                }
                F6942723054099263096 f69427230540992630962 = F6942723054099263096.c;
                if (f69427230540992630962 == null) {
                    f69427230540992630962 = new F6942723054099263096(G17481180015085314196.a.getProfileStore(), (byte) 29);
                    F6942723054099263096.c = f69427230540992630962;
                }
                bs3Var.m = f69427230540992630962.h(str);
                return O9245300239821758723.a;
        }
    }
}
