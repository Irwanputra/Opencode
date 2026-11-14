package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class T14046620238259530379 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ G16768067413993841943 b;
    public final /* synthetic */ W5797197595347441198 c;

    public /* synthetic */ T14046620238259530379(G16768067413993841943 g16768067413993841943, W5797197595347441198 w5797197595347441198, byte b) {
        this.a = b;
        this.b = g16768067413993841943;
        this.c = w5797197595347441198;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        W5797197595347441198 w5797197595347441198 = this.c;
        G16768067413993841943 g16768067413993841943 = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                if (g16768067413993841943.a()) {
                    R7033599853981556291.E(w5797197595347441198, null, null, new P1131999806128745656(g16768067413993841943, null, (byte) 0), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                if (g16768067413993841943.c()) {
                    R7033599853981556291.E(w5797197595347441198, null, null, new P1131999806128745656(g16768067413993841943, null, (byte) 1), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (g16768067413993841943.a()) {
                    R7033599853981556291.E(w5797197595347441198, null, null, new P1131999806128745656(g16768067413993841943, null, (byte) 0), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (g16768067413993841943.c()) {
                    R7033599853981556291.E(w5797197595347441198, null, null, new P1131999806128745656(g16768067413993841943, null, (byte) 1), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
