package dev.epro.r0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D11845360118227771236 implements V4446577237959483780 {
    public final /* synthetic */ byte a;
    public final S790996689653940400 b;

    public /* synthetic */ D11845360118227771236(S790996689653940400 s790996689653940400, byte b) {
        this.a = b;
        this.b = s790996689653940400;
    }

    @Override // dev.epro.r0.V4446577237959483780
    public final K10678596132709730734 a(F14240031463097426304 f14240031463097426304, K11898134656129953686 k11898134656129953686) {
        Class cls;
        Type[] actualTypeArguments;
        byte b = this.a;
        S790996689653940400 s790996689653940400 = this.b;
        cls = Object.class;
        switch (b) {
            case 0:
                Type type = k11898134656129953686.b;
                Class cls2 = k11898134656129953686.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type typeO = U15853425786981391261.O(type, cls2, Collection.class);
                cls = typeO instanceof ParameterizedType ? ((ParameterizedType) typeO).getActualTypeArguments()[0] : Object.class;
                return new J17480908745181428642(new O16849885747999394079(f14240031463097426304, f14240031463097426304.c(new K11898134656129953686(cls)), cls), s790996689653940400.d(k11898134656129953686, false));
            default:
                Type type2 = k11898134656129953686.b;
                Class cls3 = k11898134656129953686.a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeO2 = U15853425786981391261.O(type2, cls3, Map.class);
                    actualTypeArguments = typeO2 instanceof ParameterizedType ? ((ParameterizedType) typeO2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new O16849885747999394079(this, new O16849885747999394079(f14240031463097426304, (type3 == Boolean.TYPE || type3 == Boolean.class) ? Q2123592735363394013.c : f14240031463097426304.c(new K11898134656129953686(type3)), type3), new O16849885747999394079(f14240031463097426304, f14240031463097426304.c(new K11898134656129953686(type4)), type4), s790996689653940400.d(k11898134656129953686, false));
        }
    }
}
