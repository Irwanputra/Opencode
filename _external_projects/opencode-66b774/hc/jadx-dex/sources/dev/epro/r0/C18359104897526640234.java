package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C18359104897526640234 extends dev.epro.r0.D11883231851729262595 {
    public static final dev.epro.r0.O12494175665883759871 m = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.G5865513469313204166((byte) 11));
    public static final dev.epro.r0.H10984080903272140752 n = new dev.epro.r0.H10984080903272140752((byte) 4);
    public final android.view.Choreographer c;
    public final android.os.Handler d;
    public boolean i;
    public boolean j;
    public final dev.epro.r0.X13682529397961211704 l;
    public final java.lang.Object e = new java.lang.Object();
    public final dev.epro.r0.N11678082982039175888 f = new dev.epro.r0.N11678082982039175888();
    public java.util.ArrayList g = new java.util.ArrayList();
    public java.util.ArrayList h = new java.util.ArrayList();
    public final dev.epro.r0.P15195429501092761164 k = new dev.epro.r0.P15195429501092761164(this);

    public C18359104897526640234(android.view.Choreographer choreographer, android.os.Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.l = new dev.epro.r0.X13682529397961211704(choreographer, this);
    }

    public final void D() {
        java.lang.Runnable runnable;
        boolean z;
        do {
            synchronized (this.e) {
                dev.epro.r0.N11678082982039175888 n11678082982039175888 = this.f;
                runnable = (java.lang.Runnable) (n11678082982039175888.isEmpty() ? null : n11678082982039175888.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.e) {
                    dev.epro.r0.N11678082982039175888 n116780829820391758882 = this.f;
                    runnable = (java.lang.Runnable) (n116780829820391758882.isEmpty() ? null : n116780829820391758882.removeFirst());
                }
            }
            synchronized (this.e) {
                if (this.f.isEmpty()) {
                    z = false;
                    this.i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void z(dev.epro.r0.G8001132634698687269 g8001132634698687269, java.lang.Runnable runnable) {
        synchronized (this.e) {
            this.f.addLast(runnable);
            if (!this.i) {
                this.i = true;
                this.d.post(this.k);
                if (!this.j) {
                    this.j = true;
                    this.c.postFrameCallback(this.k);
                }
            }
        }
    }
}
