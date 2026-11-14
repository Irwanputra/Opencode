package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ot0 implements dev.epro.r0.S1392253949846343516, dev.epro.r0.L17385865533161060024 {
    public final android.content.Context a;
    public final ads_mobile_sdk.vi3 b;
    public final dev.epro.r0.F7878618420024429111 c;
    public final ads_mobile_sdk.j7 d;
    public final dev.epro.r0.P17493338506140929634 g;
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean(false);
    public dev.epro.r0.D16915945238461757356 h = dev.epro.r0.B6805403844224311194.b;

    public ot0(android.content.Context context, ads_mobile_sdk.vi3 vi3Var, dev.epro.r0.F7878618420024429111 f7878618420024429111, ads_mobile_sdk.j7 j7Var, dev.epro.r0.P17493338506140929634 p17493338506140929634) {
        this.a = context;
        this.b = vi3Var;
        this.c = f7878618420024429111;
        this.d = j7Var;
        this.g = p17493338506140929634;
    }

    public final dev.epro.r0.D16915945238461757356 a() {
        if (this.e.getAndSet(true)) {
            return dev.epro.r0.B6805403844224311194.b;
        }
        if (!this.d.w()) {
            return dev.epro.r0.B6805403844224311194.b;
        }
        dev.epro.r0.S15368342082797059271 s15368342082797059271 = new dev.epro.r0.S15368342082797059271();
        this.h = s15368342082797059271;
        this.b.a(ads_mobile_sdk.yk0.EVENT_ID_INIT_GASS_TRACKER, new dev.epro.r0.Q9622116641457785369(this, s15368342082797059271, (byte) 22));
        return dev.epro.r0.B6805403844224311194.b;
    }

    public final void b(java.util.HashMap map) {
        map.put("gs", this.h);
    }

    public final void a(java.util.HashMap map, android.content.Context context, android.view.View view) {
        map.put("gs", this.h);
    }

    public final void a(java.util.HashMap map) {
        map.put("gs", this.h);
    }
}
