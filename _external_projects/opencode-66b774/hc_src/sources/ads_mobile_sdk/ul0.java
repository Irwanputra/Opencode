package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.J5800360223679855765;
import dev.epro.r0.K17751841687800543607;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.O11692414993408430441;
import dev.epro.r0.S1392253949846343516;
import dev.epro.r0.V5431423861497278836;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ul0 implements K17751841687800543607 {
    public final ExecutorService a;
    public final A8094652504661216977 b;
    public final A8094652504661216977 c;
    public final ub3 d;
    public final A8094652504661216977 e;
    public final v80 f;
    public final j7 g;

    public ul0(ExecutorService executorService, A8094652504661216977 a8094652504661216977, A8094652504661216977 a80946525046612169772, ub3 ub3Var, A8094652504661216977 a80946525046612169773, v80 v80Var, j7 j7Var) {
        this.a = executorService;
        this.b = a8094652504661216977;
        this.c = a80946525046612169772;
        this.d = ub3Var;
        this.e = a80946525046612169773;
        this.f = v80Var;
        this.g = j7Var;
    }

    @Override // dev.epro.r0.K17751841687800543607
    public final void a(MotionEvent motionEvent) {
        q61 q61Var = (q61) this.e.get();
        synchronized (q61Var) {
            try {
                q61Var.b = motionEvent;
                if (motionEvent.getAction() == 1) {
                    q61Var.c = MotionEvent.obtain(motionEvent);
                }
                o61 o61Var = q61Var.d;
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
                    o61Var.g = Math.hypot(motionEvent.getRawX() - o61Var.e, motionEvent.getRawY() - o61Var.f) + o61Var.g;
                    o61Var.e = motionEvent.getRawX();
                    o61Var.f = motionEvent.getRawY();
                } else if (action == 2) {
                    o61Var.b += motionEvent.getHistorySize() + 1;
                    o61Var.g = Math.hypot(motionEvent.getRawX() - o61Var.e, motionEvent.getRawY() - o61Var.f) + o61Var.g;
                    o61Var.e = motionEvent.getRawX();
                    o61Var.f = motionEvent.getRawY();
                } else if (action == 3) {
                    o61Var.d++;
                }
                if (q61Var.a.size() >= 6) {
                    q61Var.a.remove();
                }
                q61Var.a.add(new p61(motionEvent));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.K17751841687800543607
    public final D16915945238461757356 b(Context context, String str, View view, Activity activity) {
        ub3 ub3Var = this.d;
        ub3Var.getClass();
        HashMap hashMap = new HashMap();
        Iterator it = ub3Var.a.iterator();
        while (it.hasNext()) {
            ((S1392253949846343516) it.next()).b(hashMap);
        }
        q61 q61Var = (q61) this.e.get();
        synchronized (q61Var) {
            try {
                MotionEvent motionEvent = q61Var.b;
                if (motionEvent != null) {
                    hashMap.put("evt", motionEvent);
                }
                MotionEvent motionEvent2 = q61Var.c;
                if (motionEvent2 != null) {
                    hashMap.put("nv", motionEvent2);
                }
                hashMap.put("oe", q61Var.d);
                ArrayDeque arrayDeque = q61Var.a;
                hashMap.put("ro", arrayDeque.toArray(new p61[arrayDeque.size()]));
                q61Var.d = new o61();
                q61Var.a.clear();
                MotionEvent motionEvent3 = q61Var.c;
                if (motionEvent3 != null) {
                    motionEvent3.recycle();
                    q61Var.c = null;
                }
                q61Var.b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        O11692414993408430441 o11692414993408430441 = (O11692414993408430441) this.f.get();
        context.getClass();
        o11692414993408430441.c = context;
        o11692414993408430441.d = view;
        o11692414993408430441.e = activity;
        o11692414993408430441.f = str;
        o11692414993408430441.g = hashMap;
        o11692414993408430441.i = sb3.c;
        V5431423861497278836 w = pd.w();
        w.getClass();
        o11692414993408430441.h = w;
        return ((z73) o11692414993408430441.a().B.get()).b();
    }

    @Override // dev.epro.r0.K17751841687800543607
    public final String b() {
        return "1.960507516";
    }

    @Override // dev.epro.r0.K17751841687800543607
    public final D16915945238461757356 a(Context context) {
        O11692414993408430441 o11692414993408430441 = (O11692414993408430441) this.f.get();
        context.getClass();
        o11692414993408430441.c = context;
        ub3 ub3Var = this.d;
        ub3Var.getClass();
        HashMap hashMap = new HashMap();
        Iterator it = ub3Var.a.iterator();
        while (it.hasNext()) {
            ((S1392253949846343516) it.next()).a(hashMap);
        }
        o11692414993408430441.g = hashMap;
        V5431423861497278836 w = pd.w();
        w.getClass();
        o11692414993408430441.h = w;
        o11692414993408430441.i = sb3.a;
        return ((z73) o11692414993408430441.a().B.get()).b();
    }

    @Override // dev.epro.r0.K17751841687800543607
    public final D16915945238461757356 a(Context context, String str, View view, Activity activity) {
        O11692414993408430441 o11692414993408430441 = (O11692414993408430441) this.f.get();
        context.getClass();
        o11692414993408430441.c = context;
        o11692414993408430441.d = view;
        o11692414993408430441.e = activity;
        if (!this.g.A()) {
            str = "";
        }
        o11692414993408430441.f = str;
        ub3 ub3Var = this.d;
        ub3Var.getClass();
        HashMap hashMap = new HashMap();
        Iterator it = ub3Var.a.iterator();
        while (it.hasNext()) {
            ((S1392253949846343516) it.next()).a(hashMap, context, view);
        }
        o11692414993408430441.g = hashMap;
        V5431423861497278836 w = pd.w();
        w.getClass();
        o11692414993408430441.h = w;
        o11692414993408430441.i = sb3.b;
        return ((z73) o11692414993408430441.a().B.get()).b();
    }

    @Override // dev.epro.r0.K17751841687800543607
    public final D16915945238461757356 a() {
        return M9216324016624295870.X(new J5800360223679855765(this, (byte) 9), this.a);
    }
}
