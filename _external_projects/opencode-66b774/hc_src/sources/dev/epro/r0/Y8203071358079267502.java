package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y8203071358079267502 {
    public static final Y8203071358079267502 a;
    public static final Y8203071358079267502 b;
    public static final Y8203071358079267502 c;
    public static final Y8203071358079267502 d;
    public static final Y8203071358079267502 e;
    public static final Y8203071358079267502 f;
    public static final /* synthetic */ Y8203071358079267502[] g;

    static {
        Y8203071358079267502 y8203071358079267502 = new Y8203071358079267502("ENQUEUED", 0);
        a = y8203071358079267502;
        Y8203071358079267502 y82030713580792675022 = new Y8203071358079267502("RUNNING", 1);
        b = y82030713580792675022;
        Y8203071358079267502 y82030713580792675023 = new Y8203071358079267502("SUCCEEDED", 2);
        c = y82030713580792675023;
        Y8203071358079267502 y82030713580792675024 = new Y8203071358079267502("FAILED", 3);
        d = y82030713580792675024;
        Y8203071358079267502 y82030713580792675025 = new Y8203071358079267502("BLOCKED", 4);
        e = y82030713580792675025;
        Y8203071358079267502 y82030713580792675026 = new Y8203071358079267502("CANCELLED", 5);
        f = y82030713580792675026;
        g = new Y8203071358079267502[]{y8203071358079267502, y82030713580792675022, y82030713580792675023, y82030713580792675024, y82030713580792675025, y82030713580792675026};
    }

    public static Y8203071358079267502 valueOf(String str) {
        return (Y8203071358079267502) Enum.valueOf(Y8203071358079267502.class, str);
    }

    public static Y8203071358079267502[] values() {
        return (Y8203071358079267502[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
