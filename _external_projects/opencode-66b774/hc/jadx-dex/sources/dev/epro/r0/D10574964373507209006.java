package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class D10574964373507209006 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dev.epro.r0.F17673720950005104351 b;

    public /* synthetic */ D10574964373507209006(dev.epro.r0.F17673720950005104351 f17673720950005104351, byte b) {
        this.a = b;
        this.b = f17673720950005104351;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean zContains;
        byte b = this.a;
        dev.epro.r0.F17673720950005104351 f17673720950005104351 = this.b;
        java.lang.String str = (java.lang.String) obj;
        switch (b) {
            case 0:
                str.getClass();
                zContains = f17673720950005104351.c().contains(str);
                break;
            default:
                str.getClass();
                zContains = f17673720950005104351.c().contains(str);
                break;
        }
        return java.lang.Boolean.valueOf(!zContains);
    }
}
