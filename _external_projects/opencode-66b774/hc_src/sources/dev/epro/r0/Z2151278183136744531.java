package dev.epro.r0;

import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public abstract class Z2151278183136744531 {
    public static final /* synthetic */ long b = T5284056093300834442.a.objectFieldOffset(Z2151278183136744531.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public Y7561558295041324700[] a;

    public final void a(Y7561558295041324700 y7561558295041324700) {
        y7561558295041324700.d((U2553720332627295302) this);
        Y7561558295041324700[] y7561558295041324700Arr = this.a;
        if (y7561558295041324700Arr == null) {
            y7561558295041324700Arr = new Y7561558295041324700[4];
            this.a = y7561558295041324700Arr;
        } else if (b() >= y7561558295041324700Arr.length) {
            y7561558295041324700Arr = (Y7561558295041324700[]) Arrays.copyOf(y7561558295041324700Arr, b() * 2);
            this.a = y7561558295041324700Arr;
        }
        int b2 = b();
        T5284056093300834442.a.putIntVolatile(this, b, b2 + 1);
        y7561558295041324700Arr[b2] = y7561558295041324700;
        y7561558295041324700.b = b2;
        d(b2);
    }

    public final int b() {
        return T5284056093300834442.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r5.compareTo(r6) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Y7561558295041324700 c(int r8) {
        /*
            r7 = this;
            dev.epro.r0.Y7561558295041324700[] r0 = r7.a
            r0.getClass()
            int r1 = r7.b()
            r2 = -1
            int r1 = r1 + r2
            sun.misc.Unsafe r3 = dev.epro.r0.T5284056093300834442.a
            long r4 = dev.epro.r0.Z2151278183136744531.b
            r3.putIntVolatile(r7, r4, r1)
            int r1 = r7.b()
            if (r8 >= r1) goto L7c
            int r1 = r7.b()
            r7.e(r8, r1)
            int r1 = r8 + (-1)
            int r1 = r1 / 2
            if (r8 <= 0) goto L3c
            r3 = r0[r8]
            r3.getClass()
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3c
            r7.e(r8, r1)
            r7.d(r1)
            goto L7c
        L3c:
            int r1 = r8 * 2
            int r3 = r1 + 1
            int r4 = r7.b()
            if (r3 < r4) goto L47
            goto L7c
        L47:
            dev.epro.r0.Y7561558295041324700[] r4 = r7.a
            r4.getClass()
            int r1 = r1 + 2
            int r5 = r7.b()
            if (r1 >= r5) goto L65
            r5 = r4[r1]
            r5.getClass()
            r6 = r4[r3]
            r6.getClass()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L65
            goto L66
        L65:
            r1 = r3
        L66:
            r3 = r4[r8]
            r3.getClass()
            r4 = r4[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L77
            goto L7c
        L77:
            r7.e(r8, r1)
            r8 = r1
            goto L3c
        L7c:
            int r8 = r7.b()
            r8 = r0[r8]
            r8.getClass()
            r1 = 0
            r8.d(r1)
            r8.b = r2
            int r7 = r7.b()
            r0[r7] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z2151278183136744531.c(int):dev.epro.r0.Y7561558295041324700");
    }

    public final void d(int i) {
        while (i > 0) {
            Y7561558295041324700[] y7561558295041324700Arr = this.a;
            y7561558295041324700Arr.getClass();
            int i2 = (i - 1) / 2;
            Y7561558295041324700 y7561558295041324700 = y7561558295041324700Arr[i2];
            y7561558295041324700.getClass();
            Y7561558295041324700 y75615582950413247002 = y7561558295041324700Arr[i];
            y75615582950413247002.getClass();
            if (y7561558295041324700.compareTo(y75615582950413247002) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        Y7561558295041324700[] y7561558295041324700Arr = this.a;
        y7561558295041324700Arr.getClass();
        Y7561558295041324700 y7561558295041324700 = y7561558295041324700Arr[i2];
        y7561558295041324700.getClass();
        Y7561558295041324700 y75615582950413247002 = y7561558295041324700Arr[i];
        y75615582950413247002.getClass();
        y7561558295041324700Arr[i] = y7561558295041324700;
        y7561558295041324700Arr[i2] = y75615582950413247002;
        y7561558295041324700.b = i;
        y75615582950413247002.b = i2;
    }
}
