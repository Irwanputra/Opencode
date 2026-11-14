package dev.epro.r0;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E18040702136674415662 extends A1090523267393268132 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public E18040702136674415662(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // dev.epro.r0.A1090523267393268132
    public final Object a(Class cls) {
        String b = S790996689653940400.b(cls);
        if (b != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(b));
        }
        return this.b.invoke(this.c, cls);
    }
}
