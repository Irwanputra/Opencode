package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ul0 implements dev.epro.r0.K17751841687800543607 {
    public final java.util.concurrent.ExecutorService a;
    public final dev.epro.r0.A8094652504661216977 b;
    public final dev.epro.r0.A8094652504661216977 c;
    public final ads_mobile_sdk.ub3 d;
    public final dev.epro.r0.A8094652504661216977 e;
    public final ads_mobile_sdk.v80 f;
    public final ads_mobile_sdk.j7 g;

    public ul0(java.util.concurrent.ExecutorService executorService, dev.epro.r0.A8094652504661216977 a8094652504661216977, dev.epro.r0.A8094652504661216977 a80946525046612169772, ads_mobile_sdk.ub3 ub3Var, dev.epro.r0.A8094652504661216977 a80946525046612169773, ads_mobile_sdk.v80 v80Var, ads_mobile_sdk.j7 j7Var) {
        this.a = executorService;
        this.b = a8094652504661216977;
        this.c = a80946525046612169772;
        this.d = ub3Var;
        this.e = a80946525046612169773;
        this.f = v80Var;
        this.g = j7Var;
    }

    public final void a(android.view.MotionEvent motionEvent) {
        ads_mobile_sdk.q61 q61Var = (ads_mobile_sdk.q61) this.e.get();
        synchronized (q61Var) {
            try {
                q61Var.b = motionEvent;
                if (motionEvent.getAction() == 1) {
                    q61Var.c = android.view.MotionEvent.obtain(motionEvent);
                }
                ads_mobile_sdk.o61 o61Var = q61Var.d;
                int action = motionEvent.getAction();
                if (action == 0) {
                    o61Var.a++;
                    o61Var.g = 0.0d;
                    o61Var.e = motionEvent.getRawX();
                    o61Var.f = motionEvent.getRawY();
                    o61Var.h = motionEvent.getX();
                    o61Var.i = motionEvent.getY();
                    o61Var.j = motionEvent.getRawX();
                    o61Var.k = motionEvent.getRawY();
                } else if (action == 1) {
                    o61Var.c++;
                    o61Var.g = java.lang.Math.hypot(((double) motionEvent.getRawX()) - o61Var.e, ((double) motionEvent.getRawY()) - o61Var.f) + o61Var.g;
                    o61Var.e = motionEvent.getRawX();
                    o61Var.f = motionEvent.getRawY();
                } else if (action == 2) {
                    o61Var.b += (long) (motionEvent.getHistorySize() + 1);
                    o61Var.g = java.lang.Math.hypot(((double) motionEvent.getRawX()) - o61Var.e, ((double) motionEvent.getRawY()) - o61Var.f) + o61Var.g;
                    o61Var.e = motionEvent.getRawX();
                    o61Var.f = motionEvent.getRawY();
                } else if (action == 3) {
                    o61Var.d++;
                }
                if (q61Var.a.size() >= 6) {
                    q61Var.a.remove();
                }
                q61Var.a.add(new ads_mobile_sdk.p61(motionEvent));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final dev.epro.r0.D16915945238461757356 b(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        ads_mobile_sdk.ub3 ub3Var = this.d;
        ub3Var.getClass();
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = ub3Var.a.iterator();
        while (it.hasNext()) {
            ((dev.epro.r0.S1392253949846343516) it.next()).b(map);
        }
        ads_mobile_sdk.q61 q61Var = (ads_mobile_sdk.q61) this.e.get();
        synchronized (q61Var) {
            try {
                android.view.MotionEvent motionEvent = q61Var.b;
                if (motionEvent != null) {
                    map.put("evt", motionEvent);
                }
                android.view.MotionEvent motionEvent2 = q61Var.c;
                if (motionEvent2 != null) {
                    map.put("nv", motionEvent2);
                }
                map.put("oe", q61Var.d);
                java.util.ArrayDeque arrayDeque = q61Var.a;
                map.put("ro", arrayDeque.toArray(new ads_mobile_sdk.p61[arrayDeque.size()]));
                q61Var.d = new ads_mobile_sdk.o61();
                q61Var.a.clear();
                android.view.MotionEvent motionEvent3 = q61Var.c;
                if (motionEvent3 != null) {
                    motionEvent3.recycle();
                    q61Var.c = null;
                }
                q61Var.b = null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        dev.epro.r0.O11692414993408430441 o11692414993408430441 = (dev.epro.r0.O11692414993408430441) this.f.get();
        context.getClass();
        o11692414993408430441.c = context;
        o11692414993408430441.d = view;
        o11692414993408430441.e = activity;
        o11692414993408430441.f = str;
        o11692414993408430441.g = map;
        o11692414993408430441.i = ads_mobile_sdk.sb3.c;
        dev.epro.r0.V5431423861497278836 v5431423861497278836W = ads_mobile_sdk.pd.w();
        v5431423861497278836W.getClass();
        o11692414993408430441.h = v5431423861497278836W;
        return ((ads_mobile_sdk.z73) o11692414993408430441.a().B.get()).b();
    }

    public final java.lang.String b() {
        return "1.960507516";
    }

    public final dev.epro.r0.D16915945238461757356 a(android.content.Context context) {
        dev.epro.r0.O11692414993408430441 o11692414993408430441 = (dev.epro.r0.O11692414993408430441) this.f.get();
        context.getClass();
        o11692414993408430441.c = context;
        ads_mobile_sdk.ub3 ub3Var = this.d;
        ub3Var.getClass();
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = ub3Var.a.iterator();
        while (it.hasNext()) {
            ((dev.epro.r0.S1392253949846343516) it.next()).a(map);
        }
        o11692414993408430441.g = map;
        dev.epro.r0.V5431423861497278836 v5431423861497278836W = ads_mobile_sdk.pd.w();
        v5431423861497278836W.getClass();
        o11692414993408430441.h = v5431423861497278836W;
        o11692414993408430441.i = ads_mobile_sdk.sb3.a;
        return ((ads_mobile_sdk.z73) o11692414993408430441.a().B.get()).b();
    }

    public final dev.epro.r0.D16915945238461757356 a(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        dev.epro.r0.O11692414993408430441 o11692414993408430441 = (dev.epro.r0.O11692414993408430441) this.f.get();
        context.getClass();
        o11692414993408430441.c = context;
        o11692414993408430441.d = view;
        o11692414993408430441.e = activity;
        if (!this.g.A()) {
            str = "";
        }
        o11692414993408430441.f = str;
        ads_mobile_sdk.ub3 ub3Var = this.d;
        ub3Var.getClass();
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = ub3Var.a.iterator();
        while (it.hasNext()) {
            ((dev.epro.r0.S1392253949846343516) it.next()).a(map, context, view);
        }
        o11692414993408430441.g = map;
        dev.epro.r0.V5431423861497278836 v5431423861497278836W = ads_mobile_sdk.pd.w();
        v5431423861497278836W.getClass();
        o11692414993408430441.h = v5431423861497278836W;
        o11692414993408430441.i = ads_mobile_sdk.sb3.b;
        return ((ads_mobile_sdk.z73) o11692414993408430441.a().B.get()).b();
    }

    public final dev.epro.r0.D16915945238461757356 a() {
        return dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.J5800360223679855765(this, (byte) 9), this.a);
    }
}
