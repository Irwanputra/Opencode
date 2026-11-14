package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B2550074485188857304 implements java.lang.Runnable {
    public final java.util.ArrayList a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public B2550074485188857304(java.util.List list, int i, java.lang.Throwable th) {
        dev.epro.r0.K5751602218013079365.x("initCallbacks cannot be null", list);
        this.a = new java.util.ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        if (this.b != 1) {
            while (i < size) {
                ((dev.epro.r0.N2001496495389762459) arrayList.get(i)).a();
                i++;
            }
        } else {
            while (i < size) {
                ((dev.epro.r0.N2001496495389762459) arrayList.get(i)).b();
                i++;
            }
        }
    }
}
