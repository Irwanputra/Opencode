package p000.p001;

import java.util.concurrent.ThreadFactory;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ThreadFactoryC0651 implements ThreadFactory {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4414;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ String f4415;

    public ThreadFactoryC0651(String str, boolean z) {
        this.f4415 = str;
        this.f4414 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f4415);
        thread.setDaemon(this.f4414);
        return thread;
    }
}
