package ads_mobile_sdk;

import dev.epro.r0.A18119328133183277592;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class co3 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ sy0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co3(Map map, sy0 sy0Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = map;
        this.b = sy0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        sy0 sy0Var = this.b;
        Map map = this.a;
        switch (b) {
            case 0:
                return new co3(map, sy0Var, r4833348786910499294, (byte) 0);
            default:
                return new co3(map, sy0Var, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        sy0 sy0Var = this.b;
        Map map = this.a;
        switch (b) {
            case 0:
                return new co3(map, sy0Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                new co3(map, sy0Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                E17665849472693074628.k(obj);
                String str = (String) this.a.get("currentTime");
                if (str == null) {
                    zi3.a(6, "CurrentTime parameter missing from timeupdate video GMSG: " + this.a, null);
                    return O9245300239821758723.a;
                }
                try {
                    sy0 sy0Var = this.b;
                    Float.parseFloat(str);
                    synchronized (sy0Var.f) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    zi3.a(4, "Could not parse currentTime from timeupdate video GMSG: ".concat(str), e);
                }
                return O9245300239821758723.a;
            default:
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                A18119328133183277592 a18119328133183277592 = this.b.e;
                E17665849472693074628.k(obj);
                Map map = this.a;
                String str2 = (String) map.get("src");
                if (str2 == null || M8927913404651150384.Y(str2)) {
                    zi3.a(6, "Src parameter missing from video GMSG: " + map, null);
                    a18119328133183277592.S(null);
                } else {
                    a18119328133183277592.S(str2);
                }
                return o9245300239821758723;
        }
    }
}
