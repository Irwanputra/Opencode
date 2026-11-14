package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J8657988952378915026 implements AutoCloseable, W5797197595347441198 {
    public final G8001132634698687269 a;

    public J8657988952378915026(G8001132634698687269 g8001132634698687269) {
        g8001132634698687269.getClass();
        this.a = g8001132634698687269;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        J8045362843799184672.v(this.a, null);
    }

    @Override // dev.epro.r0.W5797197595347441198
    public final G8001132634698687269 h() {
        return this.a;
    }
}
