package dev.epro.r0;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C18359104897526640234 extends D11883231851729262595 {
    public static final O12494175665883759871 m = new O12494175665883759871(new G5865513469313204166((byte) 11));
    public static final H10984080903272140752 n = new H10984080903272140752(4);
    public final Choreographer c;
    public final Handler d;
    public boolean i;
    public boolean j;
    public final X13682529397961211704 l;
    public final Object e = new Object();
    public final N11678082982039175888 f = new N11678082982039175888();
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();
    public final P15195429501092761164 k = new P15195429501092761164(this);

    public C18359104897526640234(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.l = new X13682529397961211704(choreographer, this);
    }

    public final void D() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.e) {
                N11678082982039175888 n11678082982039175888 = this.f;
                runnable = (Runnable) (n11678082982039175888.isEmpty() ? null : n11678082982039175888.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.e) {
                    N11678082982039175888 n116780829820391758882 = this.f;
                    runnable = (Runnable) (n116780829820391758882.isEmpty() ? null : n116780829820391758882.removeFirst());
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
    public final void z(G8001132634698687269 g8001132634698687269, Runnable runnable) {
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
