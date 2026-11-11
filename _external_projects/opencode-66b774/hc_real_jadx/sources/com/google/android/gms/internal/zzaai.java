package com.google.android.gms.internal;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaai extends Exception {
    private final int mErrorCode;

    public zzaai(String str, int i) {
        super(str);
        this.mErrorCode = i;
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }
}
