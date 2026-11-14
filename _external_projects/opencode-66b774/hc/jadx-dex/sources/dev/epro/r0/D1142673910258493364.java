package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D1142673910258493364 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public /* synthetic */ float t;

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        dev.epro.r0.D1142673910258493364 d1142673910258493364 = new dev.epro.r0.D1142673910258493364(2, r4833348786910499294);
        d1142673910258493364.t = ((java.lang.Number) obj).floatValue();
        return d1142673910258493364;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((dev.epro.r0.R4833348786910499294) obj2, java.lang.Float.valueOf(((java.lang.Number) obj).floatValue())).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        return java.lang.Boolean.valueOf(this.t > 0.0f);
    }
}
