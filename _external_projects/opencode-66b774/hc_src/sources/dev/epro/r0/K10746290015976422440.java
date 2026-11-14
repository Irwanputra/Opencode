package dev.epro.r0;

import org.chromium.net.NetworkException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K10746290015976422440 extends NetworkException {
    public final android.net.http.NetworkException a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K10746290015976422440(android.net.http.NetworkException r2, boolean r3) {
        /*
            r1 = this;
            java.lang.String r0 = dev.epro.r0.E16083594336174300203.g(r2)
            r1.<init>(r0, r2)
            r1.a = r2
            if (r3 != 0) goto L1a
            boolean r1 = dev.epro.r0.E16083594336174300203.y(r2)
            if (r1 != 0) goto L12
            goto L1a
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated."
            r1.<init>(r3, r2)
            throw r1
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K10746290015976422440.<init>(android.net.http.NetworkException, boolean):void");
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        int errorCode;
        errorCode = this.a.getErrorCode();
        return errorCode;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        boolean isImmediatelyRetryable;
        isImmediatelyRetryable = this.a.isImmediatelyRetryable();
        return isImmediatelyRetryable;
    }
}
