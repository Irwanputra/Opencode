package dev.epro.r0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F13067510361649884247 implements ThreadFactory {
    public final /* synthetic */ byte a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return Executors.defaultThreadFactory().newThread(new A884078926372128069(runnable, (byte) 0));
            default:
                return new R4689349539015301944(runnable, "fonts-androidx");
        }
    }
}
