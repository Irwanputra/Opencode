package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E7682243255794982140 extends org.chromium.net.UploadDataSink {
    public final android.net.http.UploadDataSink a;

    public E7682243255794982140(android.net.http.UploadDataSink uploadDataSink) {
        this.a = uploadDataSink;
    }

    public final void onReadError(java.lang.Exception exc) {
        this.a.onReadError(exc);
    }

    public final void onReadSucceeded(boolean z) {
        this.a.onReadSucceeded(z);
    }

    public final void onRewindError(java.lang.Exception exc) {
        this.a.onRewindError(exc);
    }

    public final void onRewindSucceeded() {
        this.a.onRewindSucceeded();
    }
}
