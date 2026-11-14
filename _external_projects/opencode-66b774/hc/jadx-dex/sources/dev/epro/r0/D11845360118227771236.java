package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D11845360118227771236 implements dev.epro.r0.V4446577237959483780 {
    public final /* synthetic */ byte a;
    public final dev.epro.r0.S790996689653940400 b;

    public /* synthetic */ D11845360118227771236(dev.epro.r0.S790996689653940400 s790996689653940400, byte b) {
        this.a = b;
        this.b = s790996689653940400;
    }

    public final dev.epro.r0.K10678596132709730734 a(dev.epro.r0.F14240031463097426304 f14240031463097426304, dev.epro.r0.K11898134656129953686 k11898134656129953686) {
        java.lang.Class cls;
        java.lang.reflect.Type[] actualTypeArguments;
        byte b = this.a;
        dev.epro.r0.S790996689653940400 s790996689653940400 = this.b;
        cls = java.lang.Object.class;
        switch (b) {
            case 0:
                java.lang.reflect.Type type = k11898134656129953686.b;
                java.lang.Class cls2 = k11898134656129953686.a;
                if (!java.util.Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                java.lang.reflect.Type typeO = dev.epro.r0.U15853425786981391261.O(type, cls2, java.util.Collection.class);
                cls = typeO instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) typeO).getActualTypeArguments()[0] : java.lang.Object.class;
                return new dev.epro.r0.J17480908745181428642(new dev.epro.r0.O16849885747999394079(f14240031463097426304, f14240031463097426304.c(new dev.epro.r0.K11898134656129953686(cls)), cls), s790996689653940400.d(k11898134656129953686, false));
            default:
                java.lang.reflect.Type type2 = k11898134656129953686.b;
                java.lang.Class cls3 = k11898134656129953686.a;
                if (!java.util.Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (java.util.Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new java.lang.reflect.Type[]{java.lang.String.class, java.lang.String.class};
                } else {
                    java.lang.reflect.Type typeO2 = dev.epro.r0.U15853425786981391261.O(type2, cls3, java.util.Map.class);
                    actualTypeArguments = typeO2 instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) typeO2).getActualTypeArguments() : new java.lang.reflect.Type[]{cls, cls};
                }
                java.lang.reflect.Type type3 = actualTypeArguments[0];
                java.lang.reflect.Type type4 = actualTypeArguments[1];
                return new dev.epro.r0.O16849885747999394079(this, new dev.epro.r0.O16849885747999394079(f14240031463097426304, (type3 == java.lang.Boolean.TYPE || type3 == java.lang.Boolean.class) ? dev.epro.r0.Q2123592735363394013.c : f14240031463097426304.c(new dev.epro.r0.K11898134656129953686(type3)), type3), new dev.epro.r0.O16849885747999394079(f14240031463097426304, f14240031463097426304.c(new dev.epro.r0.K11898134656129953686(type4)), type4), s790996689653940400.d(k11898134656129953686, false));
        }
    }
}
