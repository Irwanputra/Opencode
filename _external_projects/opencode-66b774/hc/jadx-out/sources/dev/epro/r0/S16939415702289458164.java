package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S16939415702289458164 extends RuntimeException {
    public final L17978943920422105913 a;
    public final Throwable b;

    public S16939415702289458164(L17978943920422105913 l17978943920422105913, Throwable th) {
        super(th);
        this.a = l17978943920422105913;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
