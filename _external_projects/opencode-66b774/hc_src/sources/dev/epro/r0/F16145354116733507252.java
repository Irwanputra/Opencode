package dev.epro.r0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F16145354116733507252 extends K10678596132709730734 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ K10678596132709730734 b;

    public /* synthetic */ F16145354116733507252(K10678596132709730734 k10678596132709730734, byte b) {
        this.a = b;
        this.b = k10678596132709730734;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        byte b = this.a;
        K10678596132709730734 k10678596132709730734 = this.b;
        switch (b) {
            case 0:
                return new AtomicLong(((Number) k10678596132709730734.b(d13396727227989475489)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                d13396727227989475489.b();
                while (d13396727227989475489.p()) {
                    arrayList.add(Long.valueOf(((Number) k10678596132709730734.b(d13396727227989475489)).longValue()));
                }
                d13396727227989475489.g();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        byte b = this.a;
        K10678596132709730734 k10678596132709730734 = this.b;
        switch (b) {
            case 0:
                k10678596132709730734.c(y14132333989764804283, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                y14132333989764804283.c();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    k10678596132709730734.c(y14132333989764804283, Long.valueOf(atomicLongArray.get(i)));
                }
                y14132333989764804283.g();
                break;
        }
    }
}
