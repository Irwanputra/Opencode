package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q16819637563808121756 extends T7441316690157960089 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public Object u;
    public byte v;
    public /* synthetic */ Object w;
    public Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q16819637563808121756(N12245111110189169079 n12245111110189169079, H3685497765029482167 h3685497765029482167, N235339945877347053 n235339945877347053, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.t = (byte) 2;
        this.u = n12245111110189169079;
        this.x = h3685497765029482167;
        this.y = n235339945877347053;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                Q16819637563808121756 q16819637563808121756 = new Q16819637563808121756(obj2, r4833348786910499294, (byte) 0);
                q16819637563808121756.w = obj;
                return q16819637563808121756;
            case 1:
                Q16819637563808121756 q168196375638081217562 = new Q16819637563808121756((Q6203700555324584864) this.x, (J14087722038307951427) obj2, r4833348786910499294);
                q168196375638081217562.w = obj;
                return q168196375638081217562;
            case 2:
                Q16819637563808121756 q168196375638081217563 = new Q16819637563808121756((N12245111110189169079) this.u, (H3685497765029482167) this.x, (N235339945877347053) obj2, r4833348786910499294);
                q168196375638081217563.w = obj;
                return q168196375638081217563;
            default:
                Q16819637563808121756 q168196375638081217564 = new Q16819637563808121756(obj2, r4833348786910499294, (byte) 3);
                q168196375638081217564.w = obj;
                return q168196375638081217564;
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
        return ((Q16819637563808121756) create(r4833348786910499294, z7637734454282223795)).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Code restructure failed: missing block: B:297:0x01c6, code lost:
    
        continue;
     */
    /* JADX WARN: Path cross not found for [B:29:0x00ba, B:24:0x0099], limit reached: 310 */
    /* JADX WARN: Path cross not found for [B:32:0x00bf, B:35:0x00c5], limit reached: 310 */
    /* JADX WARN: Path cross not found for [B:60:0x0134, B:55:0x011d], limit reached: 310 */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0249 -> B:140:0x024c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:231:0x03f6 -> B:233:0x03f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:258:0x0486 -> B:260:0x0489). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d4 -> B:40:0x00d8). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q16819637563808121756.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q16819637563808121756(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(r4833348786910499294);
        this.t = b;
        this.y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q16819637563808121756(Q6203700555324584864 q6203700555324584864, J14087722038307951427 j14087722038307951427, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.t = (byte) 1;
        this.x = q6203700555324584864;
        this.y = j14087722038307951427;
    }
}
