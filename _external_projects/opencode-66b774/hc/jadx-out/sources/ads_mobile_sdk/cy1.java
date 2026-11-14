package ads_mobile_sdk;

import dev.epro.r0.C1290752467339106930;
import dev.epro.r0.F3881178375678455036;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.J17975719213314763068;
import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.P16188089657974175786;
import dev.epro.r0.P961994945566507465;
import dev.epro.r0.Q1304841290039450495;
import dev.epro.r0.S4967920478913205567;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.V4315948343555247178;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class cy1 implements P961994945566507465 {
    public final V2597580950516131749 a;
    public final c71 b;
    public final Q1304841290039450495 c;
    public final jr0 d;

    public cy1(bb0 bb0Var, c71 c71Var, Q1304841290039450495 q1304841290039450495, jr0 jr0Var) {
        bb0Var.getClass();
        c71Var.getClass();
        q1304841290039450495.getClass();
        jr0Var.getClass();
        this.a = bb0Var;
        this.b = c71Var;
        this.c = q1304841290039450495;
        this.d = jr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.P961994945566507465
    public final M16184408391440927034 a(S4967920478913205567 s4967920478913205567, int i) {
        s4967920478913205567.getClass();
        P16188089657974175786 p16188089657974175786 = s4967920478913205567 instanceof P16188089657974175786 ? (P16188089657974175786) s4967920478913205567 : null;
        if (p16188089657974175786 == null) {
            return new tu0(G6547577305291411977.C("Expected NativeRequest but received ", J17975719213314763068.a(s4967920478913205567.getClass()).c()), 1);
        }
        this.c.getClass();
        String strValueOf = String.valueOf(C1290752467339106930.b.k(Integer.MAX_VALUE));
        Object obj = this.a.get();
        obj.getClass();
        F3881178375678455036 f3881178375678455036 = (F3881178375678455036) obj;
        qw2 qw2Var = qw2.i;
        strValueOf.getClass();
        c71 c71Var = this.b;
        c71Var.getClass();
        jr0 jr0Var = this.d;
        jr0Var.getClass();
        Optional optionalOf = Optional.of(s4967920478913205567);
        optionalOf.getClass();
        Optional optionalEmpty = Optional.empty();
        optionalEmpty.getClass();
        cc0 cc0Var = (cc0) ((F3881178375678455036) ((F3881178375678455036) ((F3881178375678455036) ((F3881178375678455036) ((F3881178375678455036) ((F3881178375678455036) ((F3881178375678455036) ((F3881178375678455036) ((F3881178375678455036) ((F3881178375678455036) f3881178375678455036.a(s4967920478913205567)).a(qw2Var)).a(new ur2())).a(new fh1())).a(new b71(c71Var.a, qw2Var, optionalOf, strValueOf, false, c71Var.b, c71Var.c, c71Var.d, optionalEmpty))).a(false)).a(new ts2())).b()).c(true)).a(new i8(jr0Var)));
        cc0Var.m = p16188089657974175786;
        cc0Var.l = Integer.valueOf(i);
        cc0Var.n = Boolean.FALSE;
        cc0Var.f17o = new V4315948343555247178();
        return new xu0(cc0Var.a());
    }
}
