package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F4024064984899821542 implements Iterator, D14639766352081121636 {
    public int a = -1;
    public boolean b;
    public final /* synthetic */ G5793569464912558238 c;

    public F4024064984899821542(G5793569464912558238 g5793569464912558238) {
        this.c = g5793569464912558238;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < ((E8321115364184429049) this.c.e).d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            Z3383101362411723454.u();
            return null;
        }
        this.b = true;
        E8321115364184429049 e8321115364184429049 = (E8321115364184429049) this.c.e;
        int i = this.a + 1;
        this.a = i;
        return (V7801742040189616406) e8321115364184429049.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            S10973172697741180971.m("You must call next() before you can remove an element");
            return;
        }
        E8321115364184429049 e8321115364184429049 = (E8321115364184429049) this.c.e;
        ((V7801742040189616406) e8321115364184429049.e(this.a)).c = null;
        int i = this.a;
        Object[] objArr = e8321115364184429049.c;
        Object obj = objArr[i];
        Object obj2 = V1475975160983963926.m;
        if (obj != obj2) {
            objArr[i] = obj2;
            e8321115364184429049.a = true;
        }
        this.a = i - 1;
        this.b = false;
    }
}
