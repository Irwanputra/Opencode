package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A13706681545055074315 implements dev.epro.r0.V4446577237959483780 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ dev.epro.r0.K10678596132709730734 c;

    public /* synthetic */ A13706681545055074315(java.lang.Object obj, dev.epro.r0.K10678596132709730734 k10678596132709730734, byte b) {
        this.a = b;
        this.b = obj;
        this.c = k10678596132709730734;
    }

    public final dev.epro.r0.K10678596132709730734 a(dev.epro.r0.F14240031463097426304 f14240031463097426304, dev.epro.r0.K11898134656129953686 k11898134656129953686) {
        byte b = this.a;
        dev.epro.r0.K10678596132709730734 k10678596132709730734 = this.c;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                if (k11898134656129953686.a == ((java.lang.Class) obj)) {
                    return k10678596132709730734;
                }
                return null;
            case 1:
                java.lang.Class<?> cls = k11898134656129953686.a;
                if (((java.lang.Class) obj).isAssignableFrom(cls)) {
                    return new dev.epro.r0.J17480908745181428642(this, cls);
                }
                return null;
            default:
                if (k11898134656129953686.equals((dev.epro.r0.K11898134656129953686) obj)) {
                    return k10678596132709730734;
                }
                return null;
        }
    }

    public java.lang.String toString() {
        byte b = this.a;
        dev.epro.r0.K10678596132709730734 k10678596132709730734 = this.c;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                return "Factory[type=" + ((java.lang.Class) obj).getName() + ",adapter=" + k10678596132709730734 + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((java.lang.Class) obj).getName() + ",adapter=" + k10678596132709730734 + "]";
            default:
                return super.toString();
        }
    }
}
