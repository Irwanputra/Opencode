package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C3791006194363318448 extends dev.epro.r0.W7378377772343420238 implements dev.epro.r0.S7370861580758580261 {
    public final dev.epro.r0.A459791877761184370 b;
    public final long c;

    public C3791006194363318448(dev.epro.r0.A459791877761184370 a459791877761184370, long j) {
        this.b = a459791877761184370;
        this.c = j;
    }

    public final dev.epro.r0.O12329764647113144543 a() {
        return dev.epro.r0.O12329764647113144543.d;
    }

    public final long c() {
        return this.c;
    }

    public final dev.epro.r0.A459791877761184370 d() {
        return this.b;
    }

    public final dev.epro.r0.J6206369225411265287 e() {
        return new dev.epro.r0.T13344602445187831655(this);
    }

    public final long m(dev.epro.r0.P5176232750190581838 p5176232750190581838, long j) {
        p5176232750190581838.getClass();
        throw new java.lang.IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    public final void close() {
    }
}
