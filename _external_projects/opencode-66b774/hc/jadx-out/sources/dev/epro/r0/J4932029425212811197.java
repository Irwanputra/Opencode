package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J4932029425212811197 extends UnsupportedOperationException {
    public final J18325703078859211263 a;

    public J4932029425212811197(J18325703078859211263 j18325703078859211263) {
        this.a = j18325703078859211263;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
