package dev.epro.go;

import dev.epro.go.Seq;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class Universe {

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyerror extends Exception implements Seq.Proxy, error {
        private final int refnum;

        public proxyerror(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.go.error
        public native String error();

        @Override // java.lang.Throwable
        public String getMessage() {
            return error();
        }

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    static {
        Seq.touch();
        _init();
    }

    private Universe() {
    }

    private static native void _init();

    public static void touch() {
    }
}
