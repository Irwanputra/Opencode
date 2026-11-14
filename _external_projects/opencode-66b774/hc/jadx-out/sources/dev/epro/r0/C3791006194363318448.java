package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C3791006194363318448 extends W7378377772343420238 implements S7370861580758580261 {
    public final A459791877761184370 b;
    public final long c;

    public C3791006194363318448(A459791877761184370 a459791877761184370, long j) {
        this.b = a459791877761184370;
        this.c = j;
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final O12329764647113144543 a() {
        return O12329764647113144543.d;
    }

    @Override // dev.epro.r0.W7378377772343420238
    public final long c() {
        return this.c;
    }

    @Override // dev.epro.r0.W7378377772343420238
    public final A459791877761184370 d() {
        return this.b;
    }

    @Override // dev.epro.r0.W7378377772343420238
    public final J6206369225411265287 e() {
        return new T13344602445187831655(this);
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) {
        p5176232750190581838.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // dev.epro.r0.W7378377772343420238, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
