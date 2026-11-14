package dev.epro.r0;

import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V6940622119999241486 extends T6475866889761571877 {
    public final X9690969695403731552 e;
    public final N968209583691202713 f;
    public final AtomicReference g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6940622119999241486(M10634075818626712574 m10634075818626712574, X9690969695403731552 x9690969695403731552, N968209583691202713 n968209583691202713) {
        super(G6547577305291411977.u(new StringBuilder(), n968209583691202713.a, " dns"), false);
        m10634075818626712574.getClass();
        this.e = x9690969695403731552;
        this.f = n968209583691202713;
        this.g = new AtomicReference(U10808870055674987200.b);
    }

    @Override // dev.epro.r0.T6475866889761571877
    public final long a() {
        Object obj;
        U10808870055674987200 u10808870055674987200 = U10808870055674987200.a;
        AtomicReference atomicReference = this.g;
        try {
            this.e.lookup(this.f.a);
            loop0: while (true) {
                obj = atomicReference.get();
                E5864355198660739705 e5864355198660739705 = (E5864355198660739705) obj;
                e5864355198660739705.getClass();
                if (!(e5864355198660739705 instanceof S1385984129191800602)) {
                    break;
                }
                while (!atomicReference.compareAndSet(obj, u10808870055674987200)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                break loop0;
            }
            return -1L;
        } catch (UnknownHostException unused) {
            while (true) {
                Object obj2 = atomicReference.get();
                E5864355198660739705 e58643551986607397052 = (E5864355198660739705) obj2;
                e58643551986607397052.getClass();
                if (!(e58643551986607397052 instanceof S1385984129191800602)) {
                    return -1L;
                }
                while (!atomicReference.compareAndSet(obj2, u10808870055674987200)) {
                    if (atomicReference.get() != obj2) {
                        break;
                    }
                }
                return -1L;
            }
        }
    }
}
