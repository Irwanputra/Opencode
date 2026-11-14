package dev.epro.r0;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B6436937335542174498 extends A1090523267393268132 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public B6436937335542174498(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // dev.epro.r0.A1090523267393268132
    public final Object a(Class cls) {
        String strB = S790996689653940400.b(cls);
        if (strB != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
        }
        return this.b.invoke(null, cls, Integer.valueOf(this.c));
    }
}
