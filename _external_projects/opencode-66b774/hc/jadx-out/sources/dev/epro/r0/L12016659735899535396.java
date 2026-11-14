package dev.epro.r0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L12016659735899535396 extends F7158831569686551304 {
    public final Object a;
    public int b;
    public final /* synthetic */ T5910761665012682387 c;

    public L12016659735899535396(T5910761665012682387 t5910761665012682387, int i) {
        this.c = t5910761665012682387;
        Object obj = T5910761665012682387.j;
        this.a = t5910761665012682387.i()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        T5910761665012682387 t5910761665012682387 = this.c;
        if (i != -1 && i < t5910761665012682387.size()) {
            if (M2066880349381062048.A(obj, t5910761665012682387.i()[this.b])) {
                return;
            }
        }
        Object obj2 = T5910761665012682387.j;
        this.b = t5910761665012682387.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        T5910761665012682387 t5910761665012682387 = this.c;
        Map mapB = t5910761665012682387.b();
        if (mapB != null) {
            return mapB.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return t5910761665012682387.j()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        T5910761665012682387 t5910761665012682387 = this.c;
        Map mapB = t5910761665012682387.b();
        Object obj2 = this.a;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            t5910761665012682387.put(obj2, obj);
            return null;
        }
        Object obj3 = t5910761665012682387.j()[i];
        t5910761665012682387.j()[this.b] = obj;
        return obj3;
    }
}
