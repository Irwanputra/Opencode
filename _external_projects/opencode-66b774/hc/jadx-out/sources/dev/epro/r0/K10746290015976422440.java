package dev.epro.r0;

import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K10746290015976422440 extends NetworkException {
    public final android.net.http.NetworkException a;

    public K10746290015976422440(android.net.http.NetworkException networkException, boolean z) {
        super(networkException.getMessage(), networkException);
        this.a = networkException;
        if (!z && E16083594336174300203.y(networkException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.a.isImmediatelyRetryable();
    }
}
