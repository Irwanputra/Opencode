package dev.epro.r0;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T10865398146470277742 extends A1090523267393268132 {
    public final /* synthetic */ Method b;

    public T10865398146470277742(Method method) {
        this.b = method;
    }

    @Override // dev.epro.r0.A1090523267393268132
    public final Object a(Class cls) {
        String b = S790996689653940400.b(cls);
        if (b != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(b));
        }
        return this.b.invoke(null, cls, Object.class);
    }
}
