package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W13904991817818359627 extends R2901646497320263774 {
    public static boolean g;

    public static void a(F10736675061244242991 f10736675061244242991, String str, Collection collection, N16832371728954486047 n16832371728954486047, int i, V14822036933104273045 v14822036933104273045, CronetException cronetException) {
        W13904991817818359627 w13904991817818359627 = new W13904991817818359627(str, collection, new I2529023569716020990(), i, v14822036933104273045, cronetException);
        f10736675061244242991.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (f10736675061244242991.b) {
            arrayList.addAll(f10736675061244242991.b.values());
        }
        if (n16832371728954486047 != null) {
            arrayList.add(n16832371728954486047);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            N16832371728954486047 n168323717289544860472 = (N16832371728954486047) obj;
            try {
                n168323717289544860472.a.getExecutor().execute(new Q9622116641457785369(n168323717289544860472, w13904991817818359627, (byte) 2));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!g) {
            g = true;
        }
        return this.c;
    }
}
