package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class k33 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final java.util.HashMap f63o = new java.util.HashMap();
    public final android.content.Context a;
    public final ads_mobile_sdk.d62 b;
    public boolean g;
    public final android.content.Intent h;
    public final dev.epro.r0.W4415201450379021245 i;
    public ads_mobile_sdk.j33 m;
    public dev.epro.r0.S16368912275120420111 n;
    public final java.util.ArrayList d = new java.util.ArrayList();
    public final java.util.HashSet e = new java.util.HashSet();
    public final java.lang.Object f = new java.lang.Object();
    public final dev.epro.r0.F7831687019675582853 k = new dev.epro.r0.F7831687019675582853(this);
    public final java.util.concurrent.atomic.AtomicInteger l = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.lang.String c = "PrewarmService";
    public final java.lang.ref.WeakReference j = new java.lang.ref.WeakReference(null);

    public k33(android.content.Context context, ads_mobile_sdk.d62 d62Var, android.content.Intent intent, dev.epro.r0.W4415201450379021245 w4415201450379021245) {
        this.a = context;
        this.b = d62Var;
        this.h = intent;
        this.i = w4415201450379021245;
    }

    public final void a(ads_mobile_sdk.e33 e33Var) {
        dev.epro.r0.S16368912275120420111 s16368912275120420111 = this.n;
        ads_mobile_sdk.d62 d62Var = this.b;
        java.util.ArrayList arrayList = this.d;
        if (s16368912275120420111 != null || this.g) {
            if (!this.g) {
                e33Var.run();
                return;
            } else {
                d62Var.getClass();
                arrayList.add(e33Var);
                return;
            }
        }
        d62Var.getClass();
        arrayList.add(e33Var);
        ads_mobile_sdk.j33 j33Var = new ads_mobile_sdk.j33(this);
        this.m = j33Var;
        this.g = true;
        if (this.a.bindService(this.h, j33Var, 1)) {
            return;
        }
        int i = 0;
        this.g = false;
        int size = arrayList.size();
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            dev.epro.r0.M8821877208104636290 m8821877208104636290 = new dev.epro.r0.M8821877208104636290("Failed to bind to the service.");
            dev.epro.r0.M17133811648581684718 m17133811648581684718 = ((ads_mobile_sdk.e13) obj).a;
            if (m17133811648581684718 != null) {
                m17133811648581684718.a(m8821877208104636290);
            }
        }
        arrayList.clear();
    }

    public final void b(ads_mobile_sdk.e13 e13Var) {
        android.os.Handler handler;
        java.util.HashMap map = f63o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new android.os.Handler(handlerThread.getLooper()));
                }
                handler = (android.os.Handler) map.get(this.c);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        handler.post(e13Var);
    }
}
