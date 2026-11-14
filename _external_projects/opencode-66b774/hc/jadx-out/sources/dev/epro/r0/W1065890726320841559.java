package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W1065890726320841559 implements Runnable {
    public final I1283052979100930176 a;
    public final P72364327365747079 b;
    public boolean c;

    public W1065890726320841559(I1283052979100930176 i1283052979100930176, P72364327365747079 p72364327365747079) {
        p72364327365747079.getClass();
        this.a = i1283052979100930176;
        this.b = p72364327365747079;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.e(this.b);
        this.c = true;
    }
}
