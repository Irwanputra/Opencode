package dev.epro.r0;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I6845661640435175914 {
    public final /* synthetic */ byte a;
    public final Executor b;
    public final Object c;
    public final Object d;

    public I6845661640435175914(Executor executor, P7827270438547540384 p7827270438547540384) {
        this.a = (byte) 2;
        this.c = new Object();
        this.b = executor;
        this.d = p7827270438547540384;
    }

    public void a() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((S14461012662136963693) obj).g();
                break;
            default:
                ((S14461012662136963693) obj).g();
                break;
        }
    }

    public void b(Exception exc) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((S14461012662136963693) obj).e(exc);
                break;
            default:
                ((S14461012662136963693) obj).e(exc);
                break;
        }
    }

    public final void c(S14461012662136963693 s14461012662136963693) {
        boolean z = false;
        switch (this.a) {
            case 0:
                this.b.execute(new I3863025946240164840((Object) this, (Object) s14461012662136963693, z, (byte) 25));
                return;
            case 1:
                if (s14461012662136963693.d) {
                    synchronized (this.c) {
                        break;
                    }
                    this.b.execute(new U3594978070141619353((Object) this, (byte) 21));
                    return;
                }
                return;
            case 2:
                synchronized (this.c) {
                    break;
                }
                this.b.execute(new I3863025946240164840((Object) this, (Object) s14461012662136963693, z, (byte) 27));
                return;
            case 3:
                if (s14461012662136963693.d() || s14461012662136963693.d) {
                    return;
                }
                synchronized (this.c) {
                    break;
                }
                this.b.execute(new I3863025946240164840((Object) this, (Object) s14461012662136963693, z, (byte) 28));
                return;
            case 4:
                if (s14461012662136963693.d()) {
                    synchronized (this.c) {
                        break;
                    }
                    this.b.execute(new I3863025946240164840((Object) this, (Object) s14461012662136963693, z, (byte) 29));
                    return;
                }
                return;
            default:
                this.b.execute(new B451504449649050588(this, s14461012662136963693));
                return;
        }
    }

    public I6845661640435175914(Executor executor, I6845661640435175914 i6845661640435175914) {
        this.a = (byte) 1;
        this.c = new Object();
        this.b = executor;
        this.d = i6845661640435175914;
    }

    public I6845661640435175914(Executor executor, I6845661640435175914 i6845661640435175914, byte b) {
        this.a = (byte) 3;
        this.c = new Object();
        this.b = executor;
        this.d = i6845661640435175914;
    }

    public I6845661640435175914(Executor executor, I6845661640435175914 i6845661640435175914, char c) {
        this.a = (byte) 4;
        this.c = new Object();
        this.b = executor;
        this.d = i6845661640435175914;
    }

    public /* synthetic */ I6845661640435175914(Executor executor, Object obj, S14461012662136963693 s14461012662136963693, byte b) {
        this.a = b;
        this.b = executor;
        this.c = obj;
        this.d = s14461012662136963693;
    }
}
