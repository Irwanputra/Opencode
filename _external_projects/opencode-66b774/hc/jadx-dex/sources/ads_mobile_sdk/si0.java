package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class si0 extends android.database.ContentObserver {
    public final android.os.Handler a;
    public final android.content.Context b;
    public final android.media.AudioManager c;
    public final ads_mobile_sdk.p72 e;
    public final java.util.concurrent.atomic.AtomicReference f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public final java.util.concurrent.ExecutorService h;

    public si0(android.os.Handler handler, android.content.Context context, dev.epro.r0.Y2677586711477821327 y2677586711477821327, ads_mobile_sdk.p72 p72Var) {
        super(handler);
        this.f = new java.util.concurrent.atomic.AtomicReference(java.lang.Float.valueOf(-1.0f));
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.a = handler;
        this.b = context;
        this.c = (android.media.AudioManager) context.getSystemService("audio");
        this.e = p72Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        byte b = 1;
        if (this.g.getAndSet(true)) {
            return;
        }
        this.h.submit(new ads_mobile_sdk.qj3(this, b));
    }
}
