package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A8071589514042632396 extends dev.epro.r0.S9853624340567802176 {
    public final dev.epro.r0.M17133811648581684718 b;

    public A8071589514042632396(dev.epro.r0.M17133811648581684718 m17133811648581684718) {
        super(4);
        this.b = m17133811648581684718;
    }

    public final void c(com.google.android.gms.common.api.Status status) {
        this.b.a(new dev.epro.r0.X4906216915227203322(status));
    }

    public final void d(java.lang.Exception exc) {
        this.b.a(exc);
    }

    public final void e(dev.epro.r0.Z102412548944701279 z102412548944701279) throws android.os.DeadObjectException {
        try {
            h(z102412548944701279);
        } catch (android.os.DeadObjectException e) {
            c(dev.epro.r0.S9853624340567802176.g(e));
            throw e;
        } catch (android.os.RemoteException e2) {
            c(dev.epro.r0.S9853624340567802176.g(e2));
        } catch (java.lang.RuntimeException e3) {
            this.b.a(e3);
        }
    }

    public final void h(dev.epro.r0.Z102412548944701279 z102412548944701279) {
        if (z102412548944701279.f.remove(null) == null) {
            this.b.b(java.lang.Boolean.FALSE);
        } else {
            dev.epro.r0.Z3383101362411723454.s();
        }
    }
}
