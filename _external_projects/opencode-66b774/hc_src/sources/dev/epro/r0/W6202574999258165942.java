package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W6202574999258165942 extends O4077903568229246 {
    public final /* synthetic */ byte y;

    public W6202574999258165942(byte[] bArr, byte b) {
        this.y = b;
        if (!G6547577305291411977.c(1)) {
            W4415201450379021245.c("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        F(1, bArr);
        F(0, bArr);
    }

    @Override // dev.epro.r0.O4077903568229246
    public final D1286559660607336098 F(int i, byte[] bArr) {
        switch (this.y) {
        }
        return new D1286559660607336098(bArr);
    }
}
