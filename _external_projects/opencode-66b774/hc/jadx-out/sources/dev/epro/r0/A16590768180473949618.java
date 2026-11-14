package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A16590768180473949618 {
    public static final A16590768180473949618 a;
    public static final A16590768180473949618 b;
    public static final A16590768180473949618 c;
    public static final /* synthetic */ A16590768180473949618[] d;

    static {
        A16590768180473949618 a16590768180473949618 = new A16590768180473949618("Yes", 0);
        a = a16590768180473949618;
        A16590768180473949618 a165907681804739496182 = new A16590768180473949618("No", 1);
        b = a165907681804739496182;
        A16590768180473949618 a165907681804739496183 = new A16590768180473949618("NotInitialized", 2);
        c = a165907681804739496183;
        d = new A16590768180473949618[]{a16590768180473949618, a165907681804739496182, a165907681804739496183};
    }

    public static A16590768180473949618 valueOf(String str) {
        return (A16590768180473949618) Enum.valueOf(A16590768180473949618.class, str);
    }

    public static A16590768180473949618[] values() {
        return (A16590768180473949618[]) d.clone();
    }
}
