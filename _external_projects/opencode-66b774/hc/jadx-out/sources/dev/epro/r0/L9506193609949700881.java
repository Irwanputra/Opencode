package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L9506193609949700881 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ B13729205492206812220 A;
    public final /* synthetic */ J12078565427869724451 B;
    public final /* synthetic */ S7864201625552763331 C;
    public E5386183571211952538 t;
    public byte[] u;
    public int v;
    public int w;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ J12043550928838212009[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L9506193609949700881(R4833348786910499294 r4833348786910499294, S7864201625552763331 s7864201625552763331, B13729205492206812220 b13729205492206812220, J12078565427869724451 j12078565427869724451, J12043550928838212009[] j12043550928838212009Arr) {
        super(2, r4833348786910499294);
        this.z = j12043550928838212009Arr;
        this.A = b13729205492206812220;
        this.B = j12078565427869724451;
        this.C = s7864201625552763331;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        L9506193609949700881 l9506193609949700881 = new L9506193609949700881(r4833348786910499294, this.C, this.A, this.B, this.z);
        l9506193609949700881.y = obj;
        return l9506193609949700881;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((L9506193609949700881) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        if (r6 != 0) goto L19;
     */
    /* JADX WARN: Path cross not found for [B:33:0x00c5, B:31:0x00b6], limit reached: 42 */
    /* JADX WARN: Path cross not found for [B:34:0x00c7, B:19:0x0086], limit reached: 42 */
    /* JADX WARN: Path cross not found for [B:36:0x00d5, B:39:0x00e8], limit reached: 42 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[LOOP:0: B:26:0x00a6->B:44:?, LOOP_START, PHI: r6 r12
      0x00a6: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:23:0x00a1, B:44:?] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r12v4 dev.epro.r0.B8690326337663253179) = (r12v3 dev.epro.r0.B8690326337663253179), (r12v10 dev.epro.r0.B8690326337663253179) binds: [B:23:0x00a1, B:44:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e5 -> B:19:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fd -> B:19:0x0086). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L9506193609949700881.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
