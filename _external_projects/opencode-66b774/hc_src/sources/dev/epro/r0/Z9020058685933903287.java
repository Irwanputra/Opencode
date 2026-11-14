package dev.epro.r0;

import org.chromium.net.QuicException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z9020058685933903287 extends QuicException {
    public final K10746290015976422440 a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Z9020058685933903287(android.net.http.QuicException r3) {
        /*
            r2 = this;
            java.lang.String r0 = dev.epro.r0.E16083594336174300203.h(r3)
            r2.<init>(r0, r3)
            dev.epro.r0.K10746290015976422440 r0 = new dev.epro.r0.K10746290015976422440
            r1 = 1
            r0.<init>(r3, r1)
            r2.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z9020058685933903287.<init>(android.net.http.QuicException):void");
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
        int errorCode;
        errorCode = this.a.a.getErrorCode();
        return errorCode;
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        boolean isImmediatelyRetryable;
        isImmediatelyRetryable = this.a.a.isImmediatelyRetryable();
        return isImmediatelyRetryable;
    }
}
