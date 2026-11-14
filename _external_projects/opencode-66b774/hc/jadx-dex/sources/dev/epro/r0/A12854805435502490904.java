package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A12854805435502490904 implements dev.epro.r0.I2388620560486547149 {
    public final /* synthetic */ dev.epro.r0.P72364327365747079 a;
    public final /* synthetic */ dev.epro.r0.A7209497065939201693 b;
    public final /* synthetic */ dev.epro.r0.W5797197595347441198 c;
    public final /* synthetic */ dev.epro.r0.P72364327365747079 d;
    public final /* synthetic */ dev.epro.r0.H7219028874700587498 e;
    public final /* synthetic */ dev.epro.r0.H15186625828076266306 f;
    public final /* synthetic */ dev.epro.r0.L12639328004344855510 g;

    public A12854805435502490904(dev.epro.r0.P72364327365747079 p72364327365747079, dev.epro.r0.A7209497065939201693 a7209497065939201693, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.P72364327365747079 p723643273657470792, dev.epro.r0.H7219028874700587498 h7219028874700587498, dev.epro.r0.H15186625828076266306 h15186625828076266306, dev.epro.r0.L12639328004344855510 l12639328004344855510) {
        this.a = p72364327365747079;
        this.b = a7209497065939201693;
        this.c = w5797197595347441198;
        this.d = p723643273657470792;
        this.e = h7219028874700587498;
        this.f = h15186625828076266306;
        this.g = l12639328004344855510;
    }

    public final void d(dev.epro.r0.I4293432593871965076 i4293432593871965076, dev.epro.r0.P72364327365747079 p72364327365747079) {
        dev.epro.r0.P72364327365747079 p723643273657470792 = this.a;
        dev.epro.r0.A7209497065939201693 a7209497065939201693 = this.b;
        if (p72364327365747079 == p723643273657470792) {
            a7209497065939201693.a = dev.epro.r0.R7033599853981556291.E(this.c, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.J13979756969328643311(this.f, this.g, (dev.epro.r0.R4833348786910499294) null, (byte) 9), 3);
            return;
        }
        if (p72364327365747079 == this.d) {
            dev.epro.r0.Q15035754882231748864 q15035754882231748864 = (dev.epro.r0.Q15035754882231748864) a7209497065939201693.a;
            if (q15035754882231748864 != null) {
                q15035754882231748864.c((java.util.concurrent.CancellationException) null);
            }
            a7209497065939201693.a = null;
        }
        if (p72364327365747079 == dev.epro.r0.P72364327365747079.ON_DESTROY) {
            this.e.resumeWith(dev.epro.r0.O9245300239821758723.a);
        }
    }
}
