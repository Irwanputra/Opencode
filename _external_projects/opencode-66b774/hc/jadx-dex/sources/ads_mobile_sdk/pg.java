package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pg implements dev.epro.r0.S1392253949846343516, dev.epro.r0.L17385865533161060024 {
    public final android.content.Context a;
    public final ads_mobile_sdk.vi3 b;
    public final ads_mobile_sdk.j7 c;
    public final dev.epro.r0.F7878618420024429111 d;
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean(false);
    public dev.epro.r0.D16915945238461757356 f = dev.epro.r0.M9216324016624295870.J("E");

    public pg(android.content.Context context, ads_mobile_sdk.vi3 vi3Var, ads_mobile_sdk.j7 j7Var, dev.epro.r0.F7878618420024429111 f7878618420024429111) {
        this.a = context;
        this.b = vi3Var;
        this.c = j7Var;
        this.d = f7878618420024429111;
    }

    public final dev.epro.r0.D16915945238461757356 a() {
        if (this.e.getAndSet(true)) {
            return dev.epro.r0.B6805403844224311194.b;
        }
        return this.d.submit(new dev.epro.r0.J5800360223679855765(this, (byte) 8));
    }

    public final void b(java.util.HashMap map) {
        c(map);
    }

    public final void c(java.util.HashMap map) {
        synchronized (this) {
            map.put("ai", this.f);
        }
    }

    public final void a(java.util.HashMap map, android.content.Context context, android.view.View view) {
        c(map);
    }

    public final void a(java.util.HashMap map) {
        c(map);
    }
}
