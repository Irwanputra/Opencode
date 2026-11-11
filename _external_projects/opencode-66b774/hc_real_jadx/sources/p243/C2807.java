package p243;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: ぺぁあねじ.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2807 extends C2812 {

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final /* synthetic */ Socket f10475;

    public C2807(Socket socket) {
        this.f10475 = socket;
    }

    @Override // p243.C2812
    /* renamed from: てぜきぽく */
    public IOException mo1893(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p243.C2812
    /* renamed from: のぷのちつ */
    public void mo1894() {
        Level level;
        StringBuilder sb;
        Logger logger;
        Exception exc;
        try {
            this.f10475.close();
        } catch (AssertionError e) {
            if (!C2810.m4895(e)) {
                throw e;
            }
            Logger logger2 = C2810.f10480;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e;
            logger = logger2;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f10475);
            logger.log(level, sb.toString(), (Throwable) exc);
        } catch (Exception e2) {
            Logger logger3 = C2810.f10480;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e2;
            logger = logger3;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f10475);
            logger.log(level, sb.toString(), (Throwable) exc);
        }
    }
}
