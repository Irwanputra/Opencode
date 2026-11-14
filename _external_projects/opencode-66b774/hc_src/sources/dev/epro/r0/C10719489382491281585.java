package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C10719489382491281585 extends H5215540118431973524 implements O4419647127671709492, D15596191924284547207 {
    public C10719489382491281585(Class cls, String str, String str2, int i) {
        super(Q5110743215583504520.a, cls, str, str2, i);
    }

    @Override // dev.epro.r0.N18027129999013161219
    public final D11026297070180776487 b() {
        J17975719213314763068.a.getClass();
        return this;
    }

    public final void g() {
        if (this.g) {
            D11988991656201568495.j("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return;
        }
        D11026297070180776487 f = f();
        if (f == this) {
            throw new K744780780574399899("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((C10719489382491281585) ((D15596191924284547207) f)).g();
    }

    @Override // dev.epro.r0.O4419647127671709492
    public final Object get(Object obj) {
        throw null;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        g();
        throw null;
    }
}
