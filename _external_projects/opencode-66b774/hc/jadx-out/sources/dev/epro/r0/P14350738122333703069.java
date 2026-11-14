package dev.epro.r0;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P14350738122333703069 extends Y7327269104420830054 {
    public final Socket n;

    public P14350738122333703069(Socket socket) {
        this.n = socket;
    }

    @Override // dev.epro.r0.Y7327269104420830054
    public final void j() {
        Socket socket = this.n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!Y13582060529021210230.a(e)) {
                throw e;
            }
            Logger logger = Y13582060529021210230.a;
            Level level = Level.WARNING;
            Objects.toString(socket);
            logger.getClass();
        } catch (Exception unused) {
            Logger logger2 = Y13582060529021210230.a;
            Level level2 = Level.WARNING;
            Objects.toString(socket);
            logger2.getClass();
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
