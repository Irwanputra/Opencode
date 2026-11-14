package dev.epro.r0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A3452148295251753522 implements Executor {
    public static final A3452148295251753522 a;
    public static final /* synthetic */ A3452148295251753522[] b;

    static {
        A3452148295251753522 a3452148295251753522 = new A3452148295251753522("INSTANCE", 0);
        a = a3452148295251753522;
        b = new A3452148295251753522[]{a3452148295251753522};
    }

    public static A3452148295251753522 valueOf(String str) {
        return (A3452148295251753522) Enum.valueOf(A3452148295251753522.class, str);
    }

    public static A3452148295251753522[] values() {
        return (A3452148295251753522[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
