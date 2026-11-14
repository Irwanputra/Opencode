package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M9304039166107187473 extends Y7561558295041324700 {
    public final Runnable c;

    public M9304039166107187473(Runnable runnable, long j) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // dev.epro.r0.Y7561558295041324700
    public final String toString() {
        return super.toString() + this.c;
    }
}
