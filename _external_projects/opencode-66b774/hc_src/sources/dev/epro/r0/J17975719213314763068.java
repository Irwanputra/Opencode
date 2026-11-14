package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class J17975719213314763068 {
    public static final K17660872976528163763 a;

    static {
        K17660872976528163763 k17660872976528163763 = null;
        try {
            k17660872976528163763 = (K17660872976528163763) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (k17660872976528163763 == null) {
            k17660872976528163763 = new K17660872976528163763();
        }
        a = k17660872976528163763;
    }

    public static V6281043481934004271 a(Class cls) {
        a.getClass();
        return new V6281043481934004271(cls);
    }
}
