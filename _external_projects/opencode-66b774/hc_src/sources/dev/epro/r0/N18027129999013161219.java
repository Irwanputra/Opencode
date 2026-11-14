package dev.epro.r0;

import java.io.Serializable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class N18027129999013161219 implements D11026297070180776487, Serializable {
    public transient D11026297070180776487 a;
    public final Object b;
    public final Class c;
    public final String d;
    public final String e;
    public final boolean f;

    public N18027129999013161219(Object obj, Class cls, String str, String str2, boolean z) {
        this.b = obj;
        this.c = cls;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    public D11026297070180776487 b() {
        J17975719213314763068.a.getClass();
        return this;
    }

    public final R14538352738342298516 d() {
        boolean z = this.f;
        Class cls = this.c;
        if (!z) {
            return J17975719213314763068.a(cls);
        }
        J17975719213314763068.a.getClass();
        return new B2951530365337152898(cls);
    }
}
