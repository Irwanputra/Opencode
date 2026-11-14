package dev.epro.r0;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y13568929412073945273 implements Z3199509763485999673, T16632042582001818609 {
    public static final /* synthetic */ int j = 0;
    public final W13734796219485846113 a;
    public final Q13914734507241918864 b;
    public final Object c = new Object();
    public T4643696886244492064 d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashMap g;
    public final V14323974914327418545 h;
    public SystemForegroundService i;

    static {
        B14824868959299866349.o("SystemFgDispatcher");
    }

    public Y13568929412073945273(Context context) {
        W13734796219485846113 b = W13734796219485846113.b(context);
        this.a = b;
        this.b = b.d;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.h = new V14323974914327418545(b.j);
        b.f.a(this);
    }

    public static Intent a(Context context, T4643696886244492064 t4643696886244492064, Y13562572432692301388 y13562572432692301388) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", t4643696886244492064.a);
        intent.putExtra("KEY_GENERATION", t4643696886244492064.b);
        intent.putExtra("KEY_NOTIFICATION_ID", y13562572432692301388.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", y13562572432692301388.b);
        intent.putExtra("KEY_NOTIFICATION", y13562572432692301388.c);
        return intent;
    }

    public final void b(Intent intent) {
        if (this.i == null) {
            S10973172697741180971.m("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        T4643696886244492064 t4643696886244492064 = new T4643696886244492064(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        B14824868959299866349.n().getClass();
        if (notification == null) {
            S10973172697741180971.j("Notification passed in the intent was null.");
            return;
        }
        Y13562572432692301388 y13562572432692301388 = new Y13562572432692301388(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(t4643696886244492064, y13562572432692301388);
        Y13562572432692301388 y135625724326923013882 = (Y13562572432692301388) linkedHashMap.get(this.d);
        if (y135625724326923013882 == null) {
            this.d = t4643696886244492064;
        } else {
            this.i.d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((Y13562572432692301388) ((Map.Entry) it.next()).getValue()).b;
                }
                y13562572432692301388 = new Y13562572432692301388(y135625724326923013882.a, y135625724326923013882.c, i);
            } else {
                y13562572432692301388 = y135625724326923013882;
            }
        }
        SystemForegroundService systemForegroundService = this.i;
        int i2 = y13562572432692301388.a;
        int i3 = y13562572432692301388.b;
        Notification notification2 = y13562572432692301388.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            N13459929895848246258.u(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            N13459929895848246258.t(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    @Override // dev.epro.r0.Z3199509763485999673
    public final void c(L16425900549479658727 l16425900549479658727, G11493083415162978130 g11493083415162978130) {
        if (g11493083415162978130 instanceof A6522995672858297071) {
            B14824868959299866349.n().getClass();
            T4643696886244492064 k = Q9282725956684299602.k(l16425900549479658727);
            int i = ((A6522995672858297071) g11493083415162978130).a;
            W13734796219485846113 w13734796219485846113 = this.a;
            Q13914734507241918864 q13914734507241918864 = w13734796219485846113.d;
            q13914734507241918864.a.execute(new Y5433946636275846014(w13734796219485846113.f, new X5127101262035123109(k), true, i));
        }
    }

    @Override // dev.epro.r0.T16632042582001818609
    public final void d(T4643696886244492064 t4643696886244492064, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                Q15035754882231748864 q15035754882231748864 = ((L16425900549479658727) this.f.remove(t4643696886244492064)) != null ? (Q15035754882231748864) this.g.remove(t4643696886244492064) : null;
                if (q15035754882231748864 != null) {
                    q15035754882231748864.c(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Y13562572432692301388 y13562572432692301388 = (Y13562572432692301388) this.e.remove(t4643696886244492064);
        if (t4643696886244492064.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (T4643696886244492064) entry.getKey();
                if (this.i != null) {
                    Y13562572432692301388 y135625724326923013882 = (Y13562572432692301388) entry.getValue();
                    SystemForegroundService systemForegroundService = this.i;
                    int i = y135625724326923013882.a;
                    int i2 = y135625724326923013882.b;
                    Notification notification = y135625724326923013882.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        N13459929895848246258.u(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        N13459929895848246258.t(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.i.d.cancel(y135625724326923013882.a);
                }
            } else {
                this.d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.i;
        if (y13562572432692301388 == null || systemForegroundService2 == null) {
            return;
        }
        B14824868959299866349 n = B14824868959299866349.n();
        t4643696886244492064.toString();
        n.getClass();
        systemForegroundService2.d.cancel(y13562572432692301388.a);
    }

    public final void e() {
        this.i = null;
        synchronized (this.c) {
            try {
                Iterator it = this.g.values().iterator();
                while (it.hasNext()) {
                    ((Q15035754882231748864) it.next()).c(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        N12253737202470468561 n12253737202470468561 = this.a.f;
        synchronized (n12253737202470468561.k) {
            n12253737202470468561.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        B14824868959299866349.n().getClass();
        for (Map.Entry entry : this.e.entrySet()) {
            if (((Y13562572432692301388) entry.getValue()).b == i2) {
                T4643696886244492064 t4643696886244492064 = (T4643696886244492064) entry.getKey();
                W13734796219485846113 w13734796219485846113 = this.a;
                Q13914734507241918864 q13914734507241918864 = w13734796219485846113.d;
                q13914734507241918864.a.execute(new Y5433946636275846014(w13734796219485846113.f, new X5127101262035123109(t4643696886244492064), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.i;
        if (systemForegroundService != null) {
            systemForegroundService.b = true;
            B14824868959299866349.n().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
