package dev.epro.r0;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F5118097716799491450 extends Thread {
    public final WeakReference a;
    public final long b;
    public final CountDownLatch c = new CountDownLatch(1);
    public boolean d = false;

    public F5118097716799491450(M13065320725254807008 m13065320725254807008, long j) {
        this.a = new WeakReference(m13065320725254807008);
        this.b = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        M13065320725254807008 m13065320725254807008;
        WeakReference weakReference = this.a;
        try {
            if (this.c.await(this.b, TimeUnit.MILLISECONDS) || (m13065320725254807008 = (M13065320725254807008) weakReference.get()) == null) {
                return;
            }
            m13065320725254807008.a();
            this.d = true;
        } catch (InterruptedException unused) {
            M13065320725254807008 m130653207252548070082 = (M13065320725254807008) weakReference.get();
            if (m130653207252548070082 != null) {
                m130653207252548070082.a();
                this.d = true;
            }
        }
    }
}
