package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B15877192428055666180 extends dev.epro.r0.L9795988420227776294 {
    public static final dev.epro.r0.B15877192428055666180 d;
    public static final dev.epro.r0.B15877192428055666180 e;
    public static final dev.epro.r0.B15877192428055666180 f;
    public static final dev.epro.r0.B15877192428055666180 g;
    public final /* synthetic */ byte c;

    static {
        int i = 1;
        d = new dev.epro.r0.B15877192428055666180(i, 2, (byte) 0);
        int i2 = 1;
        e = new dev.epro.r0.B15877192428055666180(i2, i2, (byte) 1);
        f = new dev.epro.r0.B15877192428055666180(i, 2, (byte) 2);
        int i3 = 1;
        g = new dev.epro.r0.B15877192428055666180(i3, i3, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B15877192428055666180(int i, int i2, byte b) {
        super(i, i2);
        this.c = b;
    }

    public final void a(dev.epro.r0.E17564419012940707302 e17564419012940707302, dev.epro.r0.E9133045636215945243 e9133045636215945243, dev.epro.r0.K15438463641018513946 k15438463641018513946, dev.epro.r0.E1005111105761972824 e1005111105761972824, dev.epro.r0.J10190266792694782308 j10190266792694782308) {
        switch (this.c) {
            case 0:
                java.lang.Object objInvoke = ((dev.epro.r0.B13729205492206812220) e17564419012940707302.j(0)).invoke();
                dev.epro.r0.M7798980774515057476 m7798980774515057476 = (dev.epro.r0.M7798980774515057476) e17564419012940707302.j(1);
                int i = e17564419012940707302.i(0);
                m7798980774515057476.getClass();
                k15438463641018513946.W(k15438463641018513946.c(m7798980774515057476), objInvoke);
                e9133045636215945243.j(i, objInvoke);
                e9133045636215945243.h(objInvoke);
                break;
            case 1:
                dev.epro.r0.M7798980774515057476 m77989807745150574762 = (dev.epro.r0.M7798980774515057476) e17564419012940707302.j(0);
                int i2 = e17564419012940707302.i(0);
                e9133045636215945243.t();
                m77989807745150574762.getClass();
                e9133045636215945243.g(i2, k15438463641018513946.D(k15438463641018513946.c(m77989807745150574762)));
                break;
            case 2:
                java.lang.Object objJ = e17564419012940707302.j(0);
                dev.epro.r0.M7798980774515057476 m77989807745150574763 = (dev.epro.r0.M7798980774515057476) e17564419012940707302.j(1);
                int i3 = e17564419012940707302.i(0);
                if (objJ instanceof dev.epro.r0.F819643558874997944) {
                    dev.epro.r0.F819643558874997944 f819643558874997944 = (dev.epro.r0.F819643558874997944) objJ;
                    ((dev.epro.r0.D389890677992184566) e1005111105761972824.d).b(f819643558874997944);
                    ((dev.epro.r0.E13273723708836014930) e1005111105761972824.g).a(f819643558874997944);
                }
                java.lang.Object objL = k15438463641018513946.L(k15438463641018513946.c(m77989807745150574763), i3, objJ);
                if (objL instanceof dev.epro.r0.F819643558874997944) {
                    e1005111105761972824.f((dev.epro.r0.F819643558874997944) objL);
                } else if (objL instanceof dev.epro.r0.V4878375136513573151) {
                    ((dev.epro.r0.V4878375136513573151) objL).c();
                }
                break;
            default:
                java.lang.Object objJ2 = e17564419012940707302.j(0);
                int i4 = e17564419012940707302.i(0);
                if (objJ2 instanceof dev.epro.r0.F819643558874997944) {
                    dev.epro.r0.F819643558874997944 f8196435588749979442 = (dev.epro.r0.F819643558874997944) objJ2;
                    ((dev.epro.r0.D389890677992184566) e1005111105761972824.d).b(f8196435588749979442);
                    ((dev.epro.r0.E13273723708836014930) e1005111105761972824.g).a(f8196435588749979442);
                }
                java.lang.Object objL2 = k15438463641018513946.L(k15438463641018513946.t, i4, objJ2);
                if (objL2 instanceof dev.epro.r0.F819643558874997944) {
                    e1005111105761972824.f((dev.epro.r0.F819643558874997944) objL2);
                } else if (objL2 instanceof dev.epro.r0.V4878375136513573151) {
                    ((dev.epro.r0.V4878375136513573151) objL2).c();
                }
                break;
        }
    }

    public dev.epro.r0.M7798980774515057476 b(dev.epro.r0.E17564419012940707302 e17564419012940707302) {
        switch (this.c) {
            case 0:
                return (dev.epro.r0.M7798980774515057476) e17564419012940707302.j(1);
            case 1:
                return (dev.epro.r0.M7798980774515057476) e17564419012940707302.j(0);
            default:
                return super.b(e17564419012940707302);
        }
    }
}
