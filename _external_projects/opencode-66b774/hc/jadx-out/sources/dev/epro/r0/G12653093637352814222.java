package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G12653093637352814222 implements Iterator, D14639766352081121636 {
    public int a = -1;
    public int b;
    public int c;
    public P8646985343900033725 d;
    public int e;
    public final /* synthetic */ Y10296912117440622376 f;

    public G12653093637352814222(Y10296912117440622376 y10296912117440622376) {
        this.f = y10296912117440622376;
        int iQ = W7808703833045379622.q(0, 0, y10296912117440622376.a.length());
        this.b = iQ;
        this.c = iQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            dev.epro.r0.Y10296912117440622376 r0 = r8.f
            java.lang.CharSequence r1 = r0.a
            int r2 = r8.c
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.a = r3
            r0 = 0
            r8.d = r0
            return
        Lf:
            int r4 = r0.b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.e
            int r7 = r7 + r6
            r8.e = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L32
        L22:
            dev.epro.r0.P8646985343900033725 r0 = new dev.epro.r0.P8646985343900033725
            int r2 = r8.b
            int r1 = dev.epro.r0.M8927913404651150384.R(r1)
            r0.<init>(r2, r1, r6)
            r8.d = r0
            r8.c = r5
            goto L73
        L32:
            dev.epro.r0.L12639328004344855510 r0 = r0.c
            int r2 = r8.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            dev.epro.r0.H9390398899829886498 r0 = (dev.epro.r0.H9390398899829886498) r0
            if (r0 != 0) goto L52
            dev.epro.r0.P8646985343900033725 r0 = new dev.epro.r0.P8646985343900033725
            int r2 = r8.b
            int r1 = dev.epro.r0.M8927913404651150384.R(r1)
            r0.<init>(r2, r1, r6)
            r8.d = r0
            r8.c = r5
            goto L73
        L52:
            java.lang.Object r1 = r0.a
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.b
            dev.epro.r0.P8646985343900033725 r2 = dev.epro.r0.W7808703833045379622.N(r2, r1)
            r8.d = r2
            int r1 = r1 + r0
            r8.b = r1
            if (r0 != 0) goto L70
            r3 = r6
        L70:
            int r1 = r1 + r3
            r8.c = r1
        L73:
            r8.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G12653093637352814222.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            Z3383101362411723454.u();
            return null;
        }
        P8646985343900033725 p8646985343900033725 = this.d;
        p8646985343900033725.getClass();
        this.d = null;
        this.a = -1;
        return p8646985343900033725;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
