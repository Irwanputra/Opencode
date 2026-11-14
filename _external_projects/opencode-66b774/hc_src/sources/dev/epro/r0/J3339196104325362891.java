package dev.epro.r0;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J3339196104325362891 implements U10510841700634832156 {
    public final OutputStream a;
    public final P14350738122333703069 b;
    public final /* synthetic */ J15730374346044043770 c;

    public J3339196104325362891(J15730374346044043770 j15730374346044043770) {
        this.c = j15730374346044043770;
        Socket socket = (Socket) j15730374346044043770.c;
        this.a = socket.getOutputStream();
        this.b = new P14350738122333703069(socket);
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final O12329764647113144543 a() {
        return this.b;
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.a;
        J15730374346044043770 j15730374346044043770 = this.c;
        P14350738122333703069 p14350738122333703069 = this.b;
        p14350738122333703069.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) j15730374346044043770.d;
            Socket socket = (Socket) j15730374346044043770.c;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (p14350738122333703069.i()) {
                    throw p14350738122333703069.k(null);
                }
            }
        } catch (IOException e) {
            if (!p14350738122333703069.i()) {
                throw e;
            }
            throw p14350738122333703069.k(e);
        } finally {
            p14350738122333703069.i();
        }
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Flushable
    public final void flush() {
        P14350738122333703069 p14350738122333703069 = this.b;
        p14350738122333703069.h();
        try {
            this.a.flush();
            if (p14350738122333703069.i()) {
                throw p14350738122333703069.k(null);
            }
        } catch (IOException e) {
            if (!p14350738122333703069.i()) {
                throw e;
            }
            throw p14350738122333703069.k(e);
        } finally {
            p14350738122333703069.i();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.c.c) + ')';
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final void y(P5176232750190581838 p5176232750190581838, long j) {
        E12775674050813925581.t(p5176232750190581838.b, 0L, j);
        while (j > 0) {
            P14350738122333703069 p14350738122333703069 = this.b;
            p14350738122333703069.f();
            P5586796822028136504 p5586796822028136504 = p5176232750190581838.a;
            p5586796822028136504.getClass();
            int min = (int) Math.min(j, p5586796822028136504.c - p5586796822028136504.b);
            p14350738122333703069.h();
            try {
                try {
                    this.a.write(p5586796822028136504.a, p5586796822028136504.b, min);
                    if (p14350738122333703069.i()) {
                        throw p14350738122333703069.k(null);
                    }
                    int i = p5586796822028136504.b + min;
                    p5586796822028136504.b = i;
                    long j2 = min;
                    j -= j2;
                    p5176232750190581838.b -= j2;
                    if (i == p5586796822028136504.c) {
                        p5176232750190581838.a = p5586796822028136504.a();
                        B14689168980551717317.a(p5586796822028136504);
                    }
                } catch (IOException e) {
                    if (!p14350738122333703069.i()) {
                        throw e;
                    }
                    throw p14350738122333703069.k(e);
                }
            } catch (Throwable th) {
                p14350738122333703069.i();
                throw th;
            }
        }
    }
}
