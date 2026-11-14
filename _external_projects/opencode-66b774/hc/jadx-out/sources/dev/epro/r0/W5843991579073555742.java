package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W5843991579073555742 extends T7441316690157960089 implements L12639328004344855510 {
    public boolean A;
    public /* synthetic */ Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte t;
    public long[] u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W5843991579073555742(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(r4833348786910499294);
        this.t = b;
        this.D = obj;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.D;
        switch (b) {
            case 0:
                W5843991579073555742 w5843991579073555742 = new W5843991579073555742((M14345366659885436266) obj2, r4833348786910499294, (byte) 0);
                w5843991579073555742.B = obj;
                return w5843991579073555742;
            case 1:
                W5843991579073555742 w58439915790735557422 = new W5843991579073555742((M14345366659885436266) obj2, r4833348786910499294, (byte) 1);
                w58439915790735557422.B = obj;
                return w58439915790735557422;
            case 2:
                W5843991579073555742 w58439915790735557423 = new W5843991579073555742((Q16533201950876191546) obj2, r4833348786910499294, (byte) 2);
                w58439915790735557423.B = obj;
                return w58439915790735557423;
            default:
                W5843991579073555742 w58439915790735557424 = new W5843991579073555742((R4355002902395871978) obj2, r4833348786910499294, (byte) 3);
                w58439915790735557424.B = obj;
                return w58439915790735557424;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        N3180492300688416475 n3180492300688416475 = (N3180492300688416475) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((W5843991579073555742) create(r4833348786910499294, n3180492300688416475)).invokeSuspend(o9245300239821758723);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0272  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006d -> B:22:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006f -> B:15:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:19:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fe -> B:43:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0100 -> B:36:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0117 -> B:40:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0190 -> B:64:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0192 -> B:57:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01a9 -> B:61:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0221 -> B:85:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0223 -> B:78:0x0235). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x023b -> B:82:0x0266). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W5843991579073555742.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
