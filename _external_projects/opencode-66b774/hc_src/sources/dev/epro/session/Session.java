package dev.epro.session;

import dev.epro.go.Seq;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public abstract class Session {
    static {
        Seq.touch();
        _init();
    }

    private Session() {
    }

    private static native void _init();

    public static native void open();

    public static native boolean ready();

    public static native void require();

    public static void touch() {
    }
}
