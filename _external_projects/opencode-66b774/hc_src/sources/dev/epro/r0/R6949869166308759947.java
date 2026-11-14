package dev.epro.r0;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R6949869166308759947 {
    public final AtomicInteger a;

    public R6949869166308759947(byte b) {
        switch (b) {
            case 1:
                this.a = new AtomicInteger(0);
                break;
            default:
                this.a = new AtomicInteger(0);
                break;
        }
    }

    public boolean a() {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.a;
            i = atomicInteger.get();
            if ((1073741824 & i) != 0) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return true;
    }

    public boolean b() {
        return this.a.decrementAndGet() == 1073741824;
    }
}
