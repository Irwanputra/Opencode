package dev.epro.r0;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T12670249092619324354 extends X12075480239981509252 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f493o = Logger.getLogger(T12670249092619324354.class.getName());
    public H9330595680939527366 l;
    public final boolean m;
    public final boolean n;

    public T12670249092619324354(H9330595680939527366 h9330595680939527366, boolean z, boolean z2) {
        int size = h9330595680939527366.size();
        this.h = null;
        this.i = size;
        this.l = h9330595680939527366;
        this.m = z;
        this.n = z2;
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final void c() {
        H9330595680939527366 h9330595680939527366 = this.l;
        v(1);
        if ((h9330595680939527366 != null) && (this.a instanceof P421411870588928118)) {
            boolean zO = o();
            U1864172318023436692 it = h9330595680939527366.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zO);
            }
        }
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final String i() {
        H9330595680939527366 h9330595680939527366 = this.l;
        if (h9330595680939527366 == null) {
            return super.i();
        }
        return "futures=" + h9330595680939527366;
    }

    public final void q(int i, Future future) {
        try {
            p(i, M9216324016624295870.F(future));
        } catch (Error e) {
            e = e;
            t(e);
        } catch (RuntimeException e2) {
            e = e2;
            t(e);
        } catch (ExecutionException e3) {
            t(e3.getCause());
        }
    }

    public final void r(H9330595680939527366 h9330595680939527366) {
        int iY = X12075480239981509252.j.y(this);
        int i = 0;
        U15853425786981391261.C("Less than 0 remaining futures", iY >= 0);
        if (iY == 0) {
            if (h9330595680939527366 != null) {
                U1864172318023436692 it = h9330595680939527366.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        q(i, future);
                    }
                    i++;
                }
            }
            this.h = null;
            s();
            v(2);
        }
    }

    public abstract void s();

    public final void t(Throwable th) {
        th.getClass();
        if (this.m && !l(th)) {
            Set set = this.h;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.a instanceof P421411870588928118)) {
                    Throwable thN = n();
                    Objects.requireNonNull(thN);
                    while (thN != null && setNewSetFromMap.add(thN)) {
                        thN = thN.getCause();
                    }
                }
                X12075480239981509252.j.w(this, setNewSetFromMap);
                Set set2 = this.h;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            Logger logger = f493o;
            Level level = Level.SEVERE;
            logger.getClass();
            return;
        }
        if (th instanceof Error) {
            Logger logger2 = f493o;
            Level level2 = Level.SEVERE;
            logger2.getClass();
        }
    }

    public final void u() {
        Objects.requireNonNull(this.l);
        if (this.l.isEmpty()) {
            s();
            return;
        }
        boolean z = this.m;
        Z886113521968091188 z886113521968091188 = Z886113521968091188.a;
        if (!z) {
            Q9622116641457785369 q9622116641457785369 = new Q9622116641457785369(this, this.n ? this.l : null, (byte) 0);
            U1864172318023436692 it = this.l.iterator();
            while (it.hasNext()) {
                ((D16915945238461757356) it.next()).a(q9622116641457785369, z886113521968091188);
            }
            return;
        }
        U1864172318023436692 it2 = this.l.iterator();
        int i = 0;
        while (it2.hasNext()) {
            D16915945238461757356 d16915945238461757356 = (D16915945238461757356) it2.next();
            d16915945238461757356.a(new A14411185669882056569(this, d16915945238461757356, i, (byte) 0), z886113521968091188);
            i++;
        }
    }

    public abstract void v(int i);

    public void p(int i, Object obj) {
    }
}
