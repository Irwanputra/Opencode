package dev.epro.r0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L8747532038827245841 implements Iterator {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ L8747532038827245841(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return ((Iterator) this.b).hasNext();
            case 1:
                return ((U1644378183406225904) ((J15730374346044043770) this.b).e).d.a();
            default:
                return ((W14208766909380660198) this.b).a();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return (String) ((Iterator) this.b).next();
            case 1:
                U1644378183406225904 u1644378183406225904 = (U1644378183406225904) ((J15730374346044043770) this.b).e;
                if (!u1644378183406225904.d.a()) {
                    K2042933864045806308.n("No document is available.");
                    return null;
                }
                J9761478802862050991 j9761478802862050991C = u1644378183406225904.d.c();
                HashSet hashSet = u1644378183406225904.f;
                HashMap map = u1644378183406225904.e;
                try {
                    try {
                        Object objA = u1644378183406225904.a(j9761478802862050991C);
                        u1644378183406225904.b();
                        return objA;
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } finally {
                    map.clear();
                    hashSet.clear();
                }
            default:
                J9761478802862050991 j9761478802862050991C2 = ((W14208766909380660198) this.b).c();
                if (j9761478802862050991C2 != null) {
                    return j9761478802862050991C2;
                }
                K2042933864045806308.n("No Node is available.");
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
