package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A7414163841582707909 implements N8760694116812456657 {
    public final H7980640351404152884[] a;

    public A7414163841582707909(H7980640351404152884[] h7980640351404152884Arr) {
        this.a = h7980640351404152884Arr;
    }

    public final void a() {
        for (H7980640351404152884 h7980640351404152884 : this.a) {
            U16840712152025914198 u16840712152025914198 = h7980640351404152884.f;
            if (u16840712152025914198 == null) {
                S10823041268949770285.b0("handle");
                throw null;
            }
            u16840712152025914198.a();
        }
    }

    @Override // dev.epro.r0.N8760694116812456657
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
