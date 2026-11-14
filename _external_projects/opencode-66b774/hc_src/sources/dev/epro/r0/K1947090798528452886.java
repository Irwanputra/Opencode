package dev.epro.r0;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K1947090798528452886 extends K10678596132709730734 {
    public static final T12364098917726235379 c = new T12364098917726235379();
    public final Class a;
    public final O16849885747999394079 b;

    public K1947090798528452886(F14240031463097426304 f14240031463097426304, K10678596132709730734 k10678596132709730734, Class cls) {
        this.b = new O16849885747999394079(f14240031463097426304, k10678596132709730734, cls);
        this.a = cls;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        d13396727227989475489.b();
        while (d13396727227989475489.p()) {
            arrayList.add(this.b.c.b(d13396727227989475489));
        }
        d13396727227989475489.g();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        if (obj == null) {
            y14132333989764804283.p();
            return;
        }
        y14132333989764804283.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(y14132333989764804283, Array.get(obj, i));
        }
        y14132333989764804283.g();
    }
}
