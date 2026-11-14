package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M4874962628954682344 extends T7441316690157960089 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public /* synthetic */ Object v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M4874962628954682344(Object obj, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.x = obj2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                M4874962628954682344 m4874962628954682344 = new M4874962628954682344((String) this.w, (K2023750379864020554) obj2, r4833348786910499294, (byte) 0);
                m4874962628954682344.v = obj;
                return m4874962628954682344;
            case 1:
                M4874962628954682344 m48749626289546823442 = new M4874962628954682344((G8001132634698687269) this.w, (L12639328004344855510) obj2, r4833348786910499294, (byte) 1);
                m48749626289546823442.v = obj;
                return m48749626289546823442;
            case 2:
                M4874962628954682344 m48749626289546823443 = new M4874962628954682344((N235339945877347053) obj2, r4833348786910499294);
                m48749626289546823443.v = obj;
                return m48749626289546823443;
            case 3:
                M4874962628954682344 m48749626289546823444 = new M4874962628954682344((A15234621907337682254) this.w, (V10383417447826362791) obj2, r4833348786910499294, (byte) 3);
                m48749626289546823444.v = obj;
                return m48749626289546823444;
            default:
                M4874962628954682344 m48749626289546823445 = new M4874962628954682344((J17191566391535857141) this.w, (A7209497065939201693) obj2, r4833348786910499294, (byte) 4);
                m48749626289546823445.v = obj;
                return m48749626289546823445;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z7637734454282223795 z7637734454282223795 = (Z7637734454282223795) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((M4874962628954682344) create(r4833348786910499294, z7637734454282223795)).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x020b A[Catch: CancellationException -> 0x01f2, TRY_ENTER, TryCatch #0 {CancellationException -> 0x01f2, blocks: (B:110:0x020b, B:113:0x0219, B:99:0x01ee, B:104:0x01f9), top: B:145:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0237  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0221 -> B:108:0x0205). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x0232 -> B:108:0x0205). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b2 -> B:35:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x019d -> B:81:0x01a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M4874962628954682344.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4874962628954682344(N235339945877347053 n235339945877347053, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.t = (byte) 2;
        this.x = n235339945877347053;
    }
}
