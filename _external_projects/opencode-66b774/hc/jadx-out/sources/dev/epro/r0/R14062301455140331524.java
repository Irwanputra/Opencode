package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class R14062301455140331524 extends K14749510448791472029 implements T1167221497807669151 {
    private final byte arity;

    /* JADX WARN: Multi-variable type inference failed */
    public R14062301455140331524(int i, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.arity = i;
    }

    @Override // dev.epro.r0.T1167221497807669151
    public final int getArity() {
        return this.arity;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        J17975719213314763068.a.getClass();
        return K17660872976528163763.a(this);
    }
}
