package dev.epro.r0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class K1092360987973605088 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        ArrayList arrayList = new ArrayList();
        d13396727227989475489.b();
        while (d13396727227989475489.p()) {
            try {
                arrayList.add(Integer.valueOf(d13396727227989475489.z()));
            } catch (NumberFormatException e) {
                throw new X13554947934760653097(e);
            }
        }
        d13396727227989475489.g();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        y14132333989764804283.c();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            y14132333989764804283.A(r5.get(i));
        }
        y14132333989764804283.g();
    }
}
