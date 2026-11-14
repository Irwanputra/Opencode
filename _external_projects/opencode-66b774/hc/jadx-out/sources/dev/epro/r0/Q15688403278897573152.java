package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q15688403278897573152 implements G17379711782311227394 {
    public final Object a;
    public final ThreadLocal b;
    public final X760326919357900564 c;

    public Q15688403278897573152(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new X760326919357900564(threadLocal);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final Object fold(L12639328004344855510 l12639328004344855510, Object obj) {
        return l12639328004344855510.invoke(obj, this);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final H7323971265464188398 get(R12081023847482212386 r12081023847482212386) {
        if (this.c.equals(r12081023847482212386)) {
            return this;
        }
        return null;
    }

    @Override // dev.epro.r0.H7323971265464188398
    public final R12081023847482212386 getKey() {
        return this.c;
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 minusKey(R12081023847482212386 r12081023847482212386) {
        return this.c.equals(r12081023847482212386) ? I3826119971291161142.a : this;
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 plus(G8001132634698687269 g8001132634698687269) {
        return S10823041268949770285.O(this, g8001132634698687269);
    }

    @Override // dev.epro.r0.G17379711782311227394
    public final void restoreThreadContext(G8001132634698687269 g8001132634698687269, Object obj) {
        this.b.set(obj);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }

    @Override // dev.epro.r0.G17379711782311227394
    public final Object updateThreadContext(G8001132634698687269 g8001132634698687269) {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }
}
