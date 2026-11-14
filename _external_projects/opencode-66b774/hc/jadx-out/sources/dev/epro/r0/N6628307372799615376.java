package dev.epro.r0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N6628307372799615376 extends P9893650590651797888 implements L12639328004344855510 {
    public static final N6628307372799615376 j;
    public static final N6628307372799615376 k;
    public final /* synthetic */ byte i;

    static {
        int i = 2;
        j = new N6628307372799615376(i, (byte) 0);
        k = new N6628307372799615376(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N6628307372799615376(int i, byte b) {
        super(i);
        this.i = b;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                long j2 = ((Q13254524308163418711) obj).a;
                long j3 = ((Q13254524308163418711) obj2).a;
                Map map = I12271177246410047083.a;
                return O4077903568229246.Q(0.0f, 400.0f, new Q13254524308163418711(4294967297L), 1);
            default:
                E2931101495752331306 e2931101495752331306 = (E2931101495752331306) obj2;
                return Boolean.valueOf(((E2931101495752331306) obj) == e2931101495752331306 && e2931101495752331306 == E2931101495752331306.c);
        }
    }
}
