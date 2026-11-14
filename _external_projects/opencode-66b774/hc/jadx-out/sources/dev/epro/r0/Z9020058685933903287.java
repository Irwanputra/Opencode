package dev.epro.r0;

import org.chromium.net.QuicException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z9020058685933903287 extends QuicException {
    public final K10746290015976422440 a;

    public Z9020058685933903287(android.net.http.QuicException quicException) {
        super(quicException.getMessage(), quicException);
        this.a = new K10746290015976422440(quicException, true);
    }

    @Override // org.chromium.net.QuicException
    public final int getConnectionCloseSource() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        this.a.getClass();
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.a.getErrorCode();
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.a.a.isImmediatelyRetryable();
    }
}
