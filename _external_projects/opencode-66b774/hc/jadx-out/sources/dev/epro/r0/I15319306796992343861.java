package dev.epro.r0;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I15319306796992343861 {
    public static final /* synthetic */ int a = 0;

    static {
        B14824868959299866349.o("WorkerWrapper");
    }

    public static final Object a(D16915945238461757356 d16915945238461757356, P14960607863193493823 p14960607863193493823, R14062301455140331524 r14062301455140331524) {
        Object obj;
        try {
            byte b = 0;
            if (!d16915945238461757356.isDone()) {
                H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(r14062301455140331524));
                h7219028874700587498.t();
                d16915945238461757356.a(new M14623918774394739022(d16915945238461757356, h7219028874700587498, b), A3452148295251753522.a);
                h7219028874700587498.v(new J3772078759892425500(p14960607863193493823, d16915945238461757356, (byte) 9));
                return h7219028874700587498.r();
            }
            while (true) {
                try {
                    obj = d16915945238461757356.get();
                    break;
                } catch (InterruptedException unused) {
                    b = 1;
                } catch (Throwable th) {
                    if (b != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (b != 0) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
