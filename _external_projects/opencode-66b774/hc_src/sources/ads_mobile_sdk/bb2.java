package ads_mobile_sdk;

import dev.epro.r0.B16024634506412482045;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.M18282718993909554674;
import dev.epro.r0.N4024785987441166868;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P8646985343900033725;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.W7808703833045379622;
import dev.epro.r0.Z115818233709597990;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class bb2 extends R14062301455140331524 implements L12639328004344855510 {
    public /* synthetic */ Object a;
    public final /* synthetic */ fb2 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb2(fb2 fb2Var, int i, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = fb2Var;
        this.c = i;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        bb2 bb2Var = new bb2(this.b, this.c, r4833348786910499294);
        bb2Var.a = obj;
        return bb2Var;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        bb2 bb2Var = (bb2) create((R4833348786910499294) obj2, (W5797197595347441198) obj);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        bb2Var.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
        P8646985343900033725 N = W7808703833045379622.N(0, this.c);
        ArrayList arrayList = new ArrayList(Z115818233709597990.k0(N, 10));
        Iterator it = N.iterator();
        while (true) {
            boolean z = ((M18282718993909554674) it).c;
            fb2 fb2Var = this.b;
            if (!z) {
                fb2Var.g = arrayList;
                return O9245300239821758723.a;
            }
            ((B16024634506412482045) it).nextInt();
            arrayList.add(R7033599853981556291.E(w5797197595347441198, fb2Var.b, null, new N4024785987441166868(fb2Var, null, (byte) 1), 2));
        }
    }
}
