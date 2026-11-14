package dev.epro.r0;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M14623918774394739022 implements Runnable {
    public final /* synthetic */ byte a;
    public final D16915945238461757356 b;
    public final H7219028874700587498 c;

    public /* synthetic */ M14623918774394739022(D16915945238461757356 d16915945238461757356, H7219028874700587498 h7219028874700587498, byte b) {
        this.a = b;
        this.b = d16915945238461757356;
        this.c = h7219028874700587498;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        H7219028874700587498 h7219028874700587498 = this.c;
        D16915945238461757356 d16915945238461757356 = this.b;
        switch (b) {
            case 0:
                if (d16915945238461757356.isCancelled()) {
                    h7219028874700587498.k(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = d16915945238461757356.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            h7219028874700587498.resumeWith(obj);
                            return;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            h7219028874700587498.resumeWith(new C10696704014433963524(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                break;
            default:
                if (d16915945238461757356.isCancelled()) {
                    h7219028874700587498.k(null);
                    return;
                }
                try {
                    h7219028874700587498.resumeWith(P16078978668947144669.e(d16915945238461757356));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    if (cause2 != null) {
                        h7219028874700587498.resumeWith(new C10696704014433963524(cause2));
                        return;
                    } else {
                        X11333337577019102532 x11333337577019102532 = new X11333337577019102532();
                        S10823041268949770285.Y(x11333337577019102532, S10823041268949770285.class.getName());
                        throw x11333337577019102532;
                    }
                }
        }
    }
}
