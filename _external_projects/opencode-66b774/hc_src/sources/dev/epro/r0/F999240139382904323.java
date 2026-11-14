package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F999240139382904323 implements U15014152283416496379, J1083986568308928281 {
    public final H7219028874700587498 a;
    public final /* synthetic */ H15186625828076266306 b;

    public F999240139382904323(H15186625828076266306 h15186625828076266306, H7219028874700587498 h7219028874700587498) {
        this.b = h15186625828076266306;
        this.a = h7219028874700587498;
    }

    @Override // dev.epro.r0.J1083986568308928281
    public final void a(X17453750288186724334 x17453750288186724334, int i) {
        this.a.a(x17453750288186724334, i);
    }

    @Override // dev.epro.r0.U15014152283416496379
    public final boolean b() {
        return this.a.s() instanceof B9271643986061518267;
    }

    @Override // dev.epro.r0.U15014152283416496379
    public final void d(Object obj, J12078565427869724451 j12078565427869724451) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H15186625828076266306.i;
        H15186625828076266306 h15186625828076266306 = this.b;
        atomicReferenceFieldUpdater.set(h15186625828076266306, null);
        S16262227471297796850 s16262227471297796850 = new S16262227471297796850(h15186625828076266306, this, (byte) 25);
        H7219028874700587498 h7219028874700587498 = this.a;
        h7219028874700587498.C((O9245300239821758723) obj, h7219028874700587498.c, new Q2768324090487661247(s16262227471297796850, (byte) 3));
    }

    @Override // dev.epro.r0.U15014152283416496379
    public final D14731132657808549702 f(Object obj, J12078565427869724451 j12078565427869724451) {
        H15186625828076266306 h15186625828076266306 = this.b;
        Q2768324090487661247 q2768324090487661247 = new Q2768324090487661247(h15186625828076266306, this, (byte) 15);
        D14731132657808549702 F = this.a.F((O9245300239821758723) obj, q2768324090487661247);
        if (F != null) {
            H15186625828076266306.i.set(h15186625828076266306, null);
        }
        return F;
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final G8001132634698687269 getContext() {
        return this.a.e;
    }

    @Override // dev.epro.r0.U15014152283416496379
    public final boolean k(Throwable th) {
        return this.a.k(th);
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }

    @Override // dev.epro.r0.U15014152283416496379
    public final void x(Object obj) {
        this.a.x(obj);
    }
}
