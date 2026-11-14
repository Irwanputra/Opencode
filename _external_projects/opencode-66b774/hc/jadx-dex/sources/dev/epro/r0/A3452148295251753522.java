package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A3452148295251753522 implements java.util.concurrent.Executor {
    public static final dev.epro.r0.A3452148295251753522 a;
    public static final /* synthetic */ dev.epro.r0.A3452148295251753522[] b;

    static {
        dev.epro.r0.A3452148295251753522 a3452148295251753522 = new dev.epro.r0.A3452148295251753522("INSTANCE", 0);
        a = a3452148295251753522;
        b = new dev.epro.r0.A3452148295251753522[]{a3452148295251753522};
    }

    public static dev.epro.r0.A3452148295251753522 valueOf(java.lang.String str) {
        return (dev.epro.r0.A3452148295251753522) java.lang.Enum.valueOf(dev.epro.r0.A3452148295251753522.class, str);
    }

    public static dev.epro.r0.A3452148295251753522[] values() {
        return (dev.epro.r0.A3452148295251753522[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "DirectExecutor";
    }
}
