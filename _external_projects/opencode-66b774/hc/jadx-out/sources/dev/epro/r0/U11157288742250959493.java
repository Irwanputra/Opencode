package dev.epro.r0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U11157288742250959493 extends S9853624340567802176 {
    public final V14477269137702253517 b;
    public final M17133811648581684718 c;
    public final T15504973625601650233 d;

    public U11157288742250959493(int i, V14477269137702253517 v14477269137702253517, M17133811648581684718 m17133811648581684718, T15504973625601650233 t15504973625601650233) {
        super(i);
        this.c = m17133811648581684718;
        this.b = v14477269137702253517;
        this.d = t15504973625601650233;
        if (i == 2 && v14477269137702253517.b) {
            S10973172697741180971.j("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // dev.epro.r0.S9853624340567802176
    public final boolean a(Z102412548944701279 z102412548944701279) {
        return this.b.b;
    }

    @Override // dev.epro.r0.S9853624340567802176
    public final J18325703078859211263[] b(Z102412548944701279 z102412548944701279) {
        return this.b.a;
    }

    @Override // dev.epro.r0.S9853624340567802176
    public final void c(Status status) {
        this.d.getClass();
        this.c.a(status.f != null ? new S9029560008713775126(status) : new X4906216915227203322(status));
    }

    @Override // dev.epro.r0.S9853624340567802176
    public final void d(Exception exc) {
        this.c.a(exc);
    }

    @Override // dev.epro.r0.S9853624340567802176
    public final void e(Z102412548944701279 z102412548944701279) throws DeadObjectException {
        M17133811648581684718 m17133811648581684718 = this.c;
        try {
            V14477269137702253517 v14477269137702253517 = this.b;
            ((P14073887229229024046) v14477269137702253517.d.b).accept(z102412548944701279.b, m17133811648581684718);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(S9853624340567802176.g(e2));
        } catch (RuntimeException e3) {
            m17133811648581684718.a(e3);
        }
    }

    @Override // dev.epro.r0.S9853624340567802176
    public final void f(K12477491117444883648 k12477491117444883648, boolean z) {
        Map map = k12477491117444883648.b;
        Boolean boolValueOf = Boolean.valueOf(z);
        M17133811648581684718 m17133811648581684718 = this.c;
        map.put(m17133811648581684718, boolValueOf);
        m17133811648581684718.a.a(new F6353700998356592239(k12477491117444883648, m17133811648581684718, false, (byte) 6));
    }
}
