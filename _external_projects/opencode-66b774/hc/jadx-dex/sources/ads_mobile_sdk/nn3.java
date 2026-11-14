package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class nn3 extends android.content.BroadcastReceiver implements dev.epro.r0.S1392253949846343516, dev.epro.r0.L17385865533161060024 {
    public final android.content.Context a;
    public final java.util.concurrent.ExecutorService b;
    public boolean c = true;

    public nn3(android.content.Context context, java.util.concurrent.ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    public final void a(java.util.HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", java.lang.Boolean.valueOf(z));
    }

    public final void b(java.util.HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", java.lang.Boolean.valueOf(z));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.c = false;
            }
        }
    }

    public final void a(java.util.HashMap map, android.content.Context context, android.view.View view) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", java.lang.Boolean.valueOf(z));
    }

    public final dev.epro.r0.D16915945238461757356 a() {
        return dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.J5800360223679855765(this, (byte) 7), this.b);
    }
}
