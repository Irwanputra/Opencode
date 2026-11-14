package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class I17129535152515035455 extends D11883231851729262595 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public N11678082982039175888 e;

    @Override // dev.epro.r0.D11883231851729262595
    public final D11883231851729262595 C(int i, String str) {
        E12775674050813925581.u(i);
        return str != null ? new O1128333822239684917(this, str) : this;
    }

    public final void D(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void E(H14047115090875094711 h14047115090875094711) {
        N11678082982039175888 n11678082982039175888 = this.e;
        if (n11678082982039175888 == null) {
            n11678082982039175888 = new N11678082982039175888();
            this.e = n11678082982039175888;
        }
        n11678082982039175888.addLast(h14047115090875094711);
    }

    public final void F(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long G();

    public final boolean H() {
        N11678082982039175888 n11678082982039175888 = this.e;
        if (n11678082982039175888 == null) {
            return false;
        }
        H14047115090875094711 h14047115090875094711 = (H14047115090875094711) (n11678082982039175888.isEmpty() ? null : n11678082982039175888.removeFirst());
        if (h14047115090875094711 == null) {
            return false;
        }
        h14047115090875094711.run();
        return true;
    }

    public abstract void shutdown();
}
