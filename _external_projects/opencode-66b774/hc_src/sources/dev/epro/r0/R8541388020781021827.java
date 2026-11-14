package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class R8541388020781021827 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ E10177778682618078576 b;

    public /* synthetic */ R8541388020781021827(E10177778682618078576 e10177778682618078576, byte b) {
        this.a = b;
        this.b = e10177778682618078576;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        R16749699847173633337 r16749699847173633337;
        byte b = this.a;
        E10177778682618078576 e10177778682618078576 = this.b;
        switch (b) {
            case 0:
                H15322912479122270765 h15322912479122270765 = (H15322912479122270765) B11964701839924937722.o(e10177778682618078576, U16590549108690726338.a);
                if (h15322912479122270765 == null) {
                    Y16081827717826519461.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + h15322912479122270765);
                }
                H15322912479122270765 h153229124791222707652 = e10177778682618078576.y;
                e10177778682618078576.y = h15322912479122270765;
                if (h153229124791222707652 != null && !S10823041268949770285.t(h15322912479122270765, h153229124791222707652) && ((r16749699847173633337 = e10177778682618078576.B) != null || !e10177778682618078576.I)) {
                    if (r16749699847173633337 != null) {
                        e10177778682618078576.i1(r16749699847173633337);
                    }
                    e10177778682618078576.B = null;
                    e10177778682618078576.s1();
                }
                return O9245300239821758723.a;
            default:
                e10177778682618078576.w1();
                return Boolean.TRUE;
        }
    }
}
