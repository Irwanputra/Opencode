package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y14161449526678499798 implements O13595511762861117873 {
    public final X13205888428499400927 a = new X13205888428499400927(0);

    public final boolean e(int i) {
        return (this.a.get() & i) != 0;
    }

    public final void f(int i) {
        X13205888428499400927 x13205888428499400927;
        int i2;
        do {
            x13205888428499400927 = this.a;
            i2 = x13205888428499400927.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!x13205888428499400927.compareAndSet(i2, i2 | i));
    }
}
