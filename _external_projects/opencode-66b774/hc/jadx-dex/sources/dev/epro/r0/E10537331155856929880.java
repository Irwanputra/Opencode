package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E10537331155856929880 implements dev.epro.r0.U16840712152025914198 {
    public final dev.epro.r0.B18437066071346442440 a;
    public final long b;
    public final java.lang.Object c;
    public final dev.epro.r0.H7219028874700587498 d;

    public E10537331155856929880(dev.epro.r0.B18437066071346442440 b18437066071346442440, long j, java.lang.Object obj, dev.epro.r0.H7219028874700587498 h7219028874700587498) {
        this.a = b18437066071346442440;
        this.b = j;
        this.c = obj;
        this.d = h7219028874700587498;
    }

    public final void a() {
        dev.epro.r0.B18437066071346442440 b18437066071346442440 = this.a;
        synchronized (b18437066071346442440) {
            if (this.b < b18437066071346442440.o()) {
                return;
            }
            java.lang.Object[] objArr = b18437066071346442440.h;
            objArr.getClass();
            long j = this.b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            dev.epro.r0.C9869900372345142877.R(objArr, j, dev.epro.r0.C9869900372345142877.h);
            b18437066071346442440.j();
        }
    }
}
