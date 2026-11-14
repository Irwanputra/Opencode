package dev.epro.r0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z886113521968091188 implements Executor {
    public static final Z886113521968091188 a;
    public static final /* synthetic */ Z886113521968091188[] b;

    static {
        Z886113521968091188 z886113521968091188 = new Z886113521968091188("INSTANCE", 0);
        a = z886113521968091188;
        b = new Z886113521968091188[]{z886113521968091188};
    }

    public static Z886113521968091188 valueOf(String str) {
        return (Z886113521968091188) Enum.valueOf(Z886113521968091188.class, str);
    }

    public static Z886113521968091188[] values() {
        return (Z886113521968091188[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
