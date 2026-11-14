package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S17255966974483065294 extends T8224077743602349830 implements C23081225378374139, J12043550928838212009, N5372082901916183419 {
    public static final /* synthetic */ long f = T5284056093300834442.a.objectFieldOffset(S17255966974483065294.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public S17255966974483065294(Object obj) {
        this._state$volatile = obj;
    }

    @Override // dev.epro.r0.N5372082901916183419
    public final J12043550928838212009 a(G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064) {
        return (((i < 0 || i >= 2) && i != -2) || t1542296375665870064 != T1542296375665870064.b) ? C9869900372345142877.D(this, g8001132634698687269, i, t1542296375665870064) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        if (r13.equals(r15) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:40:0x0093, B:42:0x0099], limit reached: 72 */
    /* JADX WARN: Path cross not found for [B:42:0x0099, B:50:0x00b4], limit reached: 72 */
    /* JADX WARN: Path cross not found for [B:62:0x00f6, B:63:0x00f7], limit reached: 72 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:32:0x007b, B:34:0x0085, B:37:0x008c, B:38:0x0090, B:40:0x0093, B:50:0x00b4, B:53:0x00c4, B:54:0x00e0, B:60:0x00f0, B:57:0x00e7, B:59:0x00ed, B:42:0x0099, B:46:0x00a0, B:65:0x00fa, B:66:0x00ff, B:21:0x004b), top: B:69:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:32:0x007b, B:34:0x0085, B:37:0x008c, B:38:0x0090, B:40:0x0093, B:50:0x00b4, B:53:0x00c4, B:54:0x00e0, B:60:0x00f0, B:57:0x00e7, B:59:0x00ed, B:42:0x0099, B:46:0x00a0, B:65:0x00fa, B:66:0x00ff, B:21:0x004b), top: B:69:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:32:0x007b, B:34:0x0085, B:37:0x008c, B:38:0x0090, B:40:0x0093, B:50:0x00b4, B:53:0x00c4, B:54:0x00e0, B:60:0x00f0, B:57:0x00e7, B:59:0x00ed, B:42:0x0099, B:46:0x00a0, B:65:0x00fa, B:66:0x00ff, B:21:0x004b), top: B:69:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dev.epro.r0.A314510841421691141] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [dev.epro.r0.R8171059466006247269] */
    /* JADX WARN: Type inference failed for: r1v6, types: [dev.epro.r0.R8171059466006247269] */
    /* JADX WARN: Type inference failed for: r1v7, types: [dev.epro.r0.R8171059466006247269] */
    /* JADX WARN: Type inference failed for: r1v9, types: [dev.epro.r0.R8171059466006247269] */
    /* JADX WARN: Type inference failed for: r8v1, types: [dev.epro.r0.T8224077743602349830] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00c3 -> B:31:0x0079). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.J12043550928838212009
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(dev.epro.r0.S7864201625552763331 r14, dev.epro.r0.R4833348786910499294 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S17255966974483065294.collect(dev.epro.r0.S7864201625552763331, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.Q2423450198286343102, dev.epro.r0.S7864201625552763331
    public final Object emit(Object obj, R4833348786910499294 r4833348786910499294) {
        j(obj);
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Q2423450198286343102
    public final void g() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // dev.epro.r0.T10320069907180517450
    public final Object getValue() {
        D14731132657808549702 d14731132657808549702 = V12319504402545346730.g;
        Object objectVolatile = T5284056093300834442.a.getObjectVolatile(this, f);
        if (objectVolatile == d14731132657808549702) {
            return null;
        }
        return objectVolatile;
    }

    @Override // dev.epro.r0.Q2423450198286343102
    public final boolean h(Object obj) {
        j(obj);
        return true;
    }

    public final boolean i(Object obj, Object obj2) {
        D14731132657808549702 d14731132657808549702 = V12319504402545346730.g;
        if (obj == null) {
            obj = d14731132657808549702;
        }
        if (obj2 == null) {
            obj2 = d14731132657808549702;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = V12319504402545346730.g;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i;
        A314510841421691141[] a314510841421691141Arr;
        D14731132657808549702 d14731132657808549702;
        synchronized (this) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !S10823041268949770285.t(objectVolatile, obj)) {
                return false;
            }
            if (S10823041268949770285.t(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            A314510841421691141[] a314510841421691141Arr2 = this.a;
            while (true) {
                R8171059466006247269[] r8171059466006247269Arr = (R8171059466006247269[]) a314510841421691141Arr2;
                if (r8171059466006247269Arr != null) {
                    for (R8171059466006247269 r8171059466006247269 : r8171059466006247269Arr) {
                        if (r8171059466006247269 != null) {
                            AtomicReference atomicReference = r8171059466006247269.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 != null && obj3 != (d14731132657808549702 = D15913187640519482289.g)) {
                                    D14731132657808549702 d147311326578085497022 = D15913187640519482289.f;
                                    if (obj3 != d147311326578085497022) {
                                        while (!atomicReference.compareAndSet(obj3, d147311326578085497022)) {
                                            if (atomicReference.get() != obj3) {
                                                break;
                                            }
                                        }
                                        ((H7219028874700587498) obj3).resumeWith(O9245300239821758723.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj3, d14731132657808549702)) {
                                        if (atomicReference.get() != obj3) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    a314510841421691141Arr = this.a;
                }
                a314510841421691141Arr2 = a314510841421691141Arr;
                i3 = i;
            }
        }
    }
}
