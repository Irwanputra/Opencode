package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O7793501798836965517 implements Runnable {
    public I3863025946240164840 a;
    public volatile boolean b;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.a.run();
    }
}
