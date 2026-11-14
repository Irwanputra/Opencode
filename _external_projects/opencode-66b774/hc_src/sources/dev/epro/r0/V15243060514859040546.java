package dev.epro.r0;

import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class V15243060514859040546 extends UploadDataSink {
    public final AtomicInteger a = new AtomicInteger(3);
    public final L16935913137280991791 b;
    public final Executor c;
    public final P15983149023236604271 d;
    public ByteBuffer e;
    public long f;
    public long g;
    public int h;

    public V15243060514859040546(Executor executor, Executor executor2, P15983149023236604271 p15983149023236604271) {
        this.b = new L16935913137280991791(this, executor);
        this.c = executor2;
        this.d = new P15983149023236604271(p15983149023236604271, (byte) 1);
    }

    public final void a(S8612901348883321174 s8612901348883321174, String str) {
        U1748733558996603759.b("JavaUploadDataSinkBase#executeOnExecutor ".concat(str));
        try {
            this.c.execute(new Q9622116641457785369(str, s8612901348883321174, (byte) 8));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(R5909351061398077004 r5909351061398077004, String str) {
        try {
            U1748733558996603759.b("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor ".concat(str));
            try {
                this.b.execute(new E138661690457992157(this, str, r5909351061398077004, (byte) 2));
                Trace.endSection();
            } finally {
            }
        } catch (RejectedExecutionException e) {
            c(e);
        }
    }

    public abstract void c(Exception exc);

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        c(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        AtomicInteger atomicInteger = this.a;
        if (!atomicInteger.compareAndSet(0, 2)) {
            S10973172697741180971.m(G6547577305291411977.n(atomicInteger.get(), "onReadSucceeded() called when not awaiting a read result; in state: "));
        } else {
            a(new S8612901348883321174(((W7359389094007644644) this).m, new T15299836306962536625(this, z, (byte) 1), (byte) 2), "onReadSucceeded");
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        c(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger = this.a;
        if (!atomicInteger.compareAndSet(1, 2)) {
            S10973172697741180971.m(G6547577305291411977.n(atomicInteger.get(), "onRewindSucceeded() called when not awaiting a rewind; in state: "));
        } else {
            a(new S8612901348883321174(((W7359389094007644644) this).m, new Q9808704968580942152(this, (byte) 0), (byte) 2), "startRead");
        }
    }
}
