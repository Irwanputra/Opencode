package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class C9221822072270301850 implements dev.epro.r0.H4563649114871566866 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.reflect.Type b;

    public /* synthetic */ C9221822072270301850(java.lang.reflect.Type type, byte b) {
        this.a = b;
        this.b = type;
    }

    public final java.lang.Object c() {
        byte b = this.a;
        java.lang.reflect.Type type = this.b;
        switch (b) {
            case 0:
                if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                    dev.epro.r0.S10973172697741180971.k("Invalid EnumSet type: ", type);
                } else {
                    java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0];
                    if (!(type2 instanceof java.lang.Class)) {
                        dev.epro.r0.S10973172697741180971.k("Invalid EnumSet type: ", type);
                    }
                }
                break;
            default:
                if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                    dev.epro.r0.S10973172697741180971.k("Invalid EnumMap type: ", type);
                } else {
                    java.lang.reflect.Type type3 = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0];
                    if (!(type3 instanceof java.lang.Class)) {
                        dev.epro.r0.S10973172697741180971.k("Invalid EnumMap type: ", type);
                    }
                }
                break;
        }
        return null;
    }
}
