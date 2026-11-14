package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S14461012662136963693 {
    public final Object a = new Object();
    public final N10542843603712830247 b = new N10542843603712830247();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public final void a(P7827270438547540384 p7827270438547540384) {
        this.b.b(new I6845661640435175914(P12466553659249280316.a, p7827270438547540384));
        i();
    }

    public final Exception b() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object c() {
        Object obj;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new Z6733768557799306456(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void e(Exception exc) {
        M18113111391818111737.w("Exception must not be null", exc);
        synchronized (this.a) {
            h();
            this.c = true;
            this.f = exc;
        }
        this.b.c(this);
    }

    public final void f(Object obj) {
        synchronized (this.a) {
            h();
            this.c = true;
            this.e = obj;
        }
        this.b.c(this);
    }

    public final void g() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.c(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        boolean z;
        if (this.c) {
            synchronized (this.a) {
                z = this.c;
            }
            if (!z) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excB = b();
        }
    }

    public final void i() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
