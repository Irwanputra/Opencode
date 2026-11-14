package dev.epro.r0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T17817572153526645469 {
    public final AtomicReference a = new AtomicReference(null);
    public final H15186625828076266306 b = new H15186625828076266306();

    public final Object a(D6414970586266598845 d6414970586266598845, F4096073349764486348 f4096073349764486348, K14749510448791472029 k14749510448791472029) {
        return O8620973563946607355.B(new X14700554270388218583(d6414970586266598845, this, f4096073349764486348, null, (byte) 2), k14749510448791472029);
    }

    public final void b(D14571609076401178903 d14571609076401178903) {
        while (true) {
            AtomicReference atomicReference = this.a;
            D14571609076401178903 d145716090764011789032 = (D14571609076401178903) atomicReference.get();
            if (d145716090764011789032 != null && d14571609076401178903.a.compareTo(d145716090764011789032.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(d145716090764011789032, d14571609076401178903)) {
                if (atomicReference.get() != d145716090764011789032) {
                    break;
                }
            }
            if (d145716090764011789032 != null) {
                d145716090764011789032.b.c(new M9997906910517833636("Mutation interrupted", (byte) 0));
                return;
            }
            return;
        }
    }
}
