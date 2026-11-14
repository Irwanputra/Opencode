package dev.epro.r0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H15979689472288269991 implements H11246634969386575622 {
    public final Context a;
    public final O5645052741531709506 b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public R7033599853981556291 g;

    public H15979689472288269991(Context context, O5645052741531709506 o5645052741531709506) {
        K5751602218013079365.x("Context cannot be null", context);
        this.a = context.getApplicationContext();
        this.b = o5645052741531709506;
    }

    @Override // dev.epro.r0.H11246634969386575622
    public final void a(R7033599853981556291 r7033599853981556291) {
        synchronized (this.c) {
            this.g = r7033599853981556291;
        }
        synchronized (this.c) {
            try {
                if (this.g == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.e;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new W1882561930554124601("emojiCompat"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.f = threadPoolExecutor2;
                    this.e = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new W13948953340889349604(this, (byte) 9));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.g = null;
                Handler handler = this.d;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.d = null;
                ThreadPoolExecutor threadPoolExecutor = this.f;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.e = null;
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final J18236984568855953541 c() {
        try {
            Context context = this.a;
            Object[] objArr = {this.b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            Q6203700555324584864 q6203700555324584864A = W11651948933197276719.a(context, Collections.unmodifiableList(arrayList));
            boolean z = q6203700555324584864A.a;
            if (z) {
                K2042933864045806308.i(G6547577305291411977.o(z ? 1 : 0, "fetchFonts failed (", ")"));
                return null;
            }
            J18236984568855953541[] j18236984568855953541Arr = (J18236984568855953541[]) ((List) q6203700555324584864A.b).get(0);
            if (j18236984568855953541Arr != null && j18236984568855953541Arr.length != 0) {
                return j18236984568855953541Arr[0];
            }
            K2042933864045806308.i("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Z3383101362411723454.m("provider not found", e);
            return null;
        }
    }
}
