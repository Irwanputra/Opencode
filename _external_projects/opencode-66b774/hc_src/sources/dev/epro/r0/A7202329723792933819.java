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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (str != null) {
                i = i2;
            }
            AtomicReference atomicReference = this.k;
            Queue queue2 = (Queue) atomicReference.get();
            D6285004323073107982 d6285004323073107982 = this.c;
            Application application = d6285004323073107982.a;
            U502168740281352038 l2 = R11149085407531885860.l();
            Y16042940039758055201 l3 = O17502728698316798833.l();
            Q6316841325799975503 l4 = K3685918173329061.l();
            l4.b();
            K3685918173329061.o((K3685918173329061) l4.b, i);
            if (str != null) {
                l4.b();
                K3685918173329061.m((K3685918173329061) l4.b, str);
            }
            if (currentTimeMillis > 0) {
                l4.b();
                K3685918173329061.n((K3685918173329061) l4.b, currentTimeMillis);
            }
            K3685918173329061 k3685918173329061 = (K3685918173329061) l4.a();
            l3.b();
            O17502728698316798833.q((O17502728698316798833) l3.b, k3685918173329061);
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
                l3.b();
                O17502728698316798833.n((O17502728698316798833) l3.b, str2);
            }
            P6050475907163555115 p6050475907163555115 = d6285004323073107982.b;
            if (p6050475907163555115 == null) {
                G9236695831746325507 l5 = P6050475907163555115.l();
                l5.b();
                P6050475907163555115.m((P6050475907163555115) l5.b);
                p6050475907163555115 = (P6050475907163555115) l5.a();
                d6285004323073107982.b = p6050475907163555115;
            }
            l3.b();
            O17502728698316798833.r((O17502728698316798833) l3.b, p6050475907163555115);
            J16182260230277075531 j16182260230277075531 = d6285004323073107982.d;
            if (j16182260230277075531 == null) {
                D9644658574388513154 l6 = J16182260230277075531.l();
                int i3 = Build.VERSION.SDK_INT;
                l6.b();
                J16182260230277075531.m((J16182260230277075531) l6.b, i3);
                String str3 = Build.MODEL;
                l6.b();
                J16182260230277075531.n((J16182260230277075531) l6.b);
                l6.b();
                J16182260230277075531.p((J16182260230277075531) l6.b);
                String str4 = Build.VERSION.RELEASE;
                l6.b();
                J16182260230277075531.o((J16182260230277075531) l6.b);
                j16182260230277075531 = (J16182260230277075531) l6.a();
                d6285004323073107982.d = j16182260230277075531;
            }
            l3.b();
            O17502728698316798833.p((O17502728698316798833) l3.b, j16182260230277075531);
            P3983812329505132585 p3983812329505132585 = d6285004323073107982.c;
            if (p3983812329505132585 == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    U1589746969543987342 l7 = P3983812329505132585.l();
                    String l8 = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
                    l7.b();
                    P3983812329505132585.n((P3983812329505132585) l7.b, l8);
                    l7.b();
                    P3983812329505132585.m((P3983812329505132585) l7.b, packageName);
                    d6285004323073107982.c = (P3983812329505132585) l7.a();
                }
                p3983812329505132585 = d6285004323073107982.c;
            }
            if (p3983812329505132585 != null) {
                l3.b();
                O17502728698316798833.o((O17502728698316798833) l3.b, p3983812329505132585);
            }
            String string = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string != null && !string.isEmpty()) {
                T1758414213958857646 t1758414213958857646 = new T1758414213958857646(string);
                while (t1758414213958857646.hasNext()) {
                    String str5 = (String) t1758414213958857646.next();
                    l3.b();
                    O17502728698316798833.m((O17502728698316798833) l3.b, str5);
                }
            }
            O17502728698316798833 o17502728698316798833 = (O17502728698316798833) l3.a();
            l2.b();
            R11149085407531885860.m((R11149085407531885860) l2.b, o17502728698316798833);
            long currentTimeMillis2 = System.currentTimeMillis();
            l2.b();
            R11149085407531885860.n((R11149085407531885860) l2.b, currentTimeMillis2);
            queue2.add((R11149085407531885860) l2.a());
            if (this.e) {
                ((ArrayDeque) this.l.get()).addAll((Collection) atomicReference.get());
            }
            this.d.execute(new U3594978070141619353((Object) this, (byte) 20));
        }
    }
}
