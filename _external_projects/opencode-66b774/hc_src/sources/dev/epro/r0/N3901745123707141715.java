package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class N3901745123707141715 implements Runnable {
    public final M17133811648581684718 a;

    public N3901745123707141715() {
        this.a = null;
    }

    public void a(Exception exc) {
        M17133811648581684718 m17133811648581684718 = this.a;
        if (m17133811648581684718 != null) {
            m17133811648581684718.a(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public N3901745123707141715(M17133811648581684718 m17133811648581684718) {
        this.a = m17133811648581684718;
    }
}
