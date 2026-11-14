package dev.epro.r0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A8071589514042632396 extends S9853624340567802176 {
    public final M17133811648581684718 b;

    public A8071589514042632396(M17133811648581684718 m17133811648581684718) {
        super(4);
        this.b = m17133811648581684718;
    }

    @Override // dev.epro.r0.S9853624340567802176
    public final void c(Status status) {
        this.b.a(new X4906216915227203322(status));
    }

    @Override // dev.epro.r0.S9853624340567802176
    public final void d(Exception exc) {
        this.b.a(exc);
    }

    @Override // dev.epro.r0.S9853624340567802176
    public final void e(Z102412548944701279 z102412548944701279) throws DeadObjectException {
        try {
            h(z102412548944701279);
        } catch (DeadObjectException e) {
            c(S9853624340567802176.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(S9853624340567802176.g(e2));
        } catch (RuntimeException e3) {
            this.b.a(e3);
        }
    }

    public final void h(Z102412548944701279 z102412548944701279) {
        if (z102412548944701279.f.remove(null) == null) {
            this.b.b(Boolean.FALSE);
        } else {
            Z3383101362411723454.s();
        }
    }
}
