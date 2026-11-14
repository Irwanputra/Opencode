package dev.epro.r0;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D3626849491593542492 extends N3901745123707141715 {
    public final /* synthetic */ byte b = 1;
    public final /* synthetic */ Object c;

    public D3626849491593542492(K12238100791927223227 k12238100791927223227) {
        Objects.requireNonNull(k12238100791927223227);
        this.c = k12238100791927223227;
    }

    @Override // dev.epro.r0.N3901745123707141715
    public final void b() {
        switch (this.b) {
            case 0:
                K12238100791927223227 k12238100791927223227 = (K12238100791927223227) ((P16318072974459194610) this.c).b;
                k12238100791927223227.b.getClass();
                ((J16132835055968791970) k12238100791927223227.n).a.unlinkToDeath(k12238100791927223227.k, 0);
                k12238100791927223227.n = null;
                k12238100791927223227.g = false;
                return;
            default:
                K12238100791927223227 k122381007919272232272 = (K12238100791927223227) this.c;
                synchronized (k122381007919272232272.f) {
                    try {
                        if (k122381007919272232272.l.get() > 0 && k122381007919272232272.l.decrementAndGet() > 0) {
                            k122381007919272232272.b.getClass();
                            return;
                        }
                        if (k122381007919272232272.n != null) {
                            k122381007919272232272.b.getClass();
                            k122381007919272232272.a.unbindService(k122381007919272232272.m);
                            k122381007919272232272.g = false;
                            k122381007919272232272.n = null;
                            k122381007919272232272.m = null;
                        }
                        HashSet hashSet = k122381007919272232272.e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((M17133811648581684718) it.next()).a(new RemoteException(String.valueOf(k122381007919272232272.c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } finally {
                    }
                }
        }
    }

    public D3626849491593542492(P16318072974459194610 p16318072974459194610) {
        this.c = p16318072974459194610;
    }
}
