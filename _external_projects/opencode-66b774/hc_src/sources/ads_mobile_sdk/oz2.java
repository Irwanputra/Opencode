package ads_mobile_sdk;

import dev.epro.r0.L8361547894089146393;
import dev.epro.r0.Z3383101362411723454;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class oz2 implements Iterator {
    public final ArrayDeque a;
    public L8361547894089146393 b;

    public oz2(sq sqVar) {
        if (!(sqVar instanceof pz2)) {
            this.a = null;
            this.b = (L8361547894089146393) sqVar;
            return;
        }
        pz2 pz2Var = (pz2) sqVar;
        ArrayDeque arrayDeque = new ArrayDeque(pz2Var.h);
        this.a = arrayDeque;
        arrayDeque.push(pz2Var);
        sq sqVar2 = pz2Var.e;
        while (sqVar2 instanceof pz2) {
            pz2 pz2Var2 = (pz2) sqVar2;
            this.a.push(pz2Var2);
            sqVar2 = pz2Var2.e;
        }
        this.b = (L8361547894089146393) sqVar2;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final L8361547894089146393 next() {
        L8361547894089146393 l8361547894089146393 = this.b;
        L8361547894089146393 l83615478940891463932 = null;
        if (l8361547894089146393 == null) {
            Z3383101362411723454.u();
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                sq sqVar = ((pz2) arrayDeque.pop()).f;
                while (sqVar instanceof pz2) {
                    pz2 pz2Var = (pz2) sqVar;
                    arrayDeque.push(pz2Var);
                    sqVar = pz2Var.e;
                }
                L8361547894089146393 l83615478940891463933 = (L8361547894089146393) sqVar;
                if (l83615478940891463933.size() != 0) {
                    l83615478940891463932 = l83615478940891463933;
                    break;
                }
            } else {
                break;
            }
        }
        this.b = l83615478940891463932;
        return l8361547894089146393;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
