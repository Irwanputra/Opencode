package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public enum Y4733161976867834422 {
    CHUNKED_SHA256(1, "SHA-256", 32),
    CHUNKED_SHA512(2, "SHA-512", 64),
    VERITY_CHUNKED_SHA256(3, "SHA-256", 32),
    SHA256(4, "SHA-256", 32);

    public final byte a;
    public final String b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    Y4733161976867834422(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }
}
