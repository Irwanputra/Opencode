package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P12773055964240635680 {
    public final E10198359844879945462 a;
    public final P12475571966978616537 b;

    public P12773055964240635680(R6653624393204003746 r6653624393204003746, W13131470296662841006 w13131470296662841006) {
        List i;
        this.a = r6653624393204003746.d;
        i = r6653624393204003746.i((r3 & 1) != 0 ? !r6653624393204003746.b : false, (r3 & 2) == 0);
        this.b = new P12475571966978616537(i.size());
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            R6653624393204003746 r66536243932040037462 = (R6653624393204003746) i.get(i2);
            if (w13131470296662841006.a(r66536243932040037462.f)) {
                this.b.a(r66536243932040037462.f);
            }
        }
    }
}
