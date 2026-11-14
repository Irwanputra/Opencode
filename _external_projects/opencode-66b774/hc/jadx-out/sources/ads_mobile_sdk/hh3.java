package ads_mobile_sdk;

import dev.epro.r0.Q9622116641457785369;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class hh3 implements ThreadFactory {
    public final String a;
    public Integer b = null;
    public final AtomicInteger c = new AtomicInteger(1);

    public hh3(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        String str = "GMA(" + this.a + ") " + this.c.getAndIncrement();
        Integer num = this.b;
        return num == null ? new Thread(runnable, str) : new Thread(new Q9622116641457785369(num, runnable, (byte) 21), str);
    }
}
