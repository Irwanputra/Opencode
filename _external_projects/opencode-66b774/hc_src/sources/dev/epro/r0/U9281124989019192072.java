package dev.epro.r0;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U9281124989019192072 implements S7370861580758580261 {
    public final InputStream a;
    public final P14350738122333703069 b;
    public final /* synthetic */ J15730374346044043770 c;

    public U9281124989019192072(J15730374346044043770 j15730374346044043770) {
        this.c = j15730374346044043770;
        Socket socket = (Socket) j15730374346044043770.c;
        this.a = socket.getInputStream();
        this.b = new P14350738122333703069(socket);
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final O12329764647113144543 a() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        J15730374346044043770 j15730374346044043770 = this.c;
        P14350738122333703069 p14350738122333703069 = this.b;
        p14350738122333703069.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) j15730374346044043770.d;
            Socket socket = (Socket) j15730374346044043770.c;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.a.close();
                    }
                }
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

    @Override // dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) {
        p5176232750190581838.getClass();
        P14350738122333703069 p14350738122333703069 = this.b;
        p14350738122333703069.f();
        P5586796822028136504 z = p5176232750190581838.z(1);
        int min = (int) Math.min(8192L, 8192 - z.c);
        try {
            p14350738122333703069.h();
            try {
                int read = this.a.read(z.a, z.c, min);
                if (p14350738122333703069.i()) {
                    throw p14350738122333703069.k(null);
                }
                if (read != -1) {
                    z.c += read;
                    long j2 = read;
                    p5176232750190581838.b += j2;
                    return j2;
                }
                if (z.b != z.c) {
                    return -1L;
                }
                p5176232750190581838.a = z.a();
                B14689168980551717317.a(z);
                return -1L;
            } catch (IOException e) {
                if (p14350738122333703069.i()) {
                    throw p14350738122333703069.k(e);
                }
                throw e;
            } finally {
                p14350738122333703069.i();
            }
        } catch (AssertionError e2) {
            if (Y13582060529021210230.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.c.c) + ')';
    }
}
