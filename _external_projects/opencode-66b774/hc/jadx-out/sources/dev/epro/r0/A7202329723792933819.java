package dev.epro.r0;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A7202329723792933819 {
    public final Application b;
    public final D6285004323073107982 c;
    public final Executor d;
    public final boolean e;
    public final AtomicReference f = new AtomicReference(new ArrayDeque());
    public final AtomicReference g = new AtomicReference(new ArrayDeque());
    public final AtomicReference h = new AtomicReference(new ArrayDeque());
    public final AtomicReference i = new AtomicReference(new ArrayDeque());
    public final AtomicReference j = new AtomicReference(new ArrayDeque());
    public final AtomicReference k = new AtomicReference(new ArrayDeque());
    public final AtomicReference l = new AtomicReference(new ArrayDeque());
    public final AtomicReference a = new AtomicReference(null);

    public A7202329723792933819(Application application, Executor executor, D6285004323073107982 d6285004323073107982, boolean z) {
        this.e = z;
        this.b = application;
        this.c = d6285004323073107982;
        this.d = executor;
    }

    public final void a(Queue queue, int i, int i2, String str) {
        Bundle bundle;
        Long l = (Long) queue.poll();
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (str != null) {
                i = i2;
            }
            AtomicReference atomicReference = this.k;
            Queue queue2 = (Queue) atomicReference.get();
            D6285004323073107982 d6285004323073107982 = this.c;
            Application application = d6285004323073107982.a;
            U502168740281352038 u502168740281352038L = R11149085407531885860.l();
            Y16042940039758055201 y16042940039758055201L = O17502728698316798833.l();
            Q6316841325799975503 q6316841325799975503L = K3685918173329061.l();
            q6316841325799975503L.b();
            K3685918173329061.o((K3685918173329061) q6316841325799975503L.b, i);
            if (str != null) {
                q6316841325799975503L.b();
                K3685918173329061.m((K3685918173329061) q6316841325799975503L.b, str);
            }
            if (jCurrentTimeMillis > 0) {
                q6316841325799975503L.b();
                K3685918173329061.n((K3685918173329061) q6316841325799975503L.b, jCurrentTimeMillis);
            }
            K3685918173329061 k3685918173329061 = (K3685918173329061) q6316841325799975503L.a();
            y16042940039758055201L.b();
            O17502728698316798833.q((O17502728698316798833) y16042940039758055201L.b, k3685918173329061);
            String str2 = d6285004323073107982.e;
            PackageInfo packageInfo = null;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    d6285004323073107982.e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                TextUtils.isEmpty(d6285004323073107982.e);
                str2 = d6285004323073107982.e;
            }
            if (str2 != null) {
                y16042940039758055201L.b();
                O17502728698316798833.n((O17502728698316798833) y16042940039758055201L.b, str2);
            }
            P6050475907163555115 p6050475907163555115 = d6285004323073107982.b;
            if (p6050475907163555115 == null) {
                G9236695831746325507 g9236695831746325507L = P6050475907163555115.l();
                g9236695831746325507L.b();
                P6050475907163555115.m((P6050475907163555115) g9236695831746325507L.b);
                p6050475907163555115 = (P6050475907163555115) g9236695831746325507L.a();
                d6285004323073107982.b = p6050475907163555115;
            }
            y16042940039758055201L.b();
            O17502728698316798833.r((O17502728698316798833) y16042940039758055201L.b, p6050475907163555115);
            J16182260230277075531 j16182260230277075531 = d6285004323073107982.d;
            if (j16182260230277075531 == null) {
                D9644658574388513154 d9644658574388513154L = J16182260230277075531.l();
                int i3 = Build.VERSION.SDK_INT;
                d9644658574388513154L.b();
                J16182260230277075531.m((J16182260230277075531) d9644658574388513154L.b, i3);
                String str3 = Build.MODEL;
                d9644658574388513154L.b();
                J16182260230277075531.n((J16182260230277075531) d9644658574388513154L.b);
                d9644658574388513154L.b();
                J16182260230277075531.p((J16182260230277075531) d9644658574388513154L.b);
                String str4 = Build.VERSION.RELEASE;
                d9644658574388513154L.b();
                J16182260230277075531.o((J16182260230277075531) d9644658574388513154L.b);
                j16182260230277075531 = (J16182260230277075531) d9644658574388513154L.a();
                d6285004323073107982.d = j16182260230277075531;
            }
            y16042940039758055201L.b();
            O17502728698316798833.p((O17502728698316798833) y16042940039758055201L.b, j16182260230277075531);
            P3983812329505132585 p3983812329505132585 = d6285004323073107982.c;
            if (p3983812329505132585 == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    U1589746969543987342 u1589746969543987342L = P3983812329505132585.l();
                    String string = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
                    u1589746969543987342L.b();
                    P3983812329505132585.n((P3983812329505132585) u1589746969543987342L.b, string);
                    u1589746969543987342L.b();
                    P3983812329505132585.m((P3983812329505132585) u1589746969543987342L.b, packageName);
                    d6285004323073107982.c = (P3983812329505132585) u1589746969543987342L.a();
                }
                p3983812329505132585 = d6285004323073107982.c;
            }
            if (p3983812329505132585 != null) {
                y16042940039758055201L.b();
                O17502728698316798833.o((O17502728698316798833) y16042940039758055201L.b, p3983812329505132585);
            }
            String string2 = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string2 != null && !string2.isEmpty()) {
                T1758414213958857646 t1758414213958857646 = new T1758414213958857646(string2);
                while (t1758414213958857646.hasNext()) {
                    String str5 = (String) t1758414213958857646.next();
                    y16042940039758055201L.b();
                    O17502728698316798833.m((O17502728698316798833) y16042940039758055201L.b, str5);
                }
            }
            O17502728698316798833 o17502728698316798833 = (O17502728698316798833) y16042940039758055201L.a();
            u502168740281352038L.b();
            R11149085407531885860.m((R11149085407531885860) u502168740281352038L.b, o17502728698316798833);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            u502168740281352038L.b();
            R11149085407531885860.n((R11149085407531885860) u502168740281352038L.b, jCurrentTimeMillis2);
            queue2.add((R11149085407531885860) u502168740281352038L.a());
            if (this.e) {
                ((ArrayDeque) this.l.get()).addAll((Collection) atomicReference.get());
            }
            this.d.execute(new U3594978070141619353((Object) this, (byte) 20));
        }
    }
}
