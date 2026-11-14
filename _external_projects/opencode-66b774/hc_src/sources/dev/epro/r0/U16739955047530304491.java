package dev.epro.r0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U16739955047530304491 implements Executor {
    public static final U16739955047530304491 a;
    public static final /* synthetic */ U16739955047530304491[] b;

    static {
        U16739955047530304491 u16739955047530304491 = new U16739955047530304491("INSTANCE", 0);
        a = u16739955047530304491;
        b = new U16739955047530304491[]{u16739955047530304491};
    }

    public static U16739955047530304491 valueOf(String str) {
        return (U16739955047530304491) Enum.valueOf(U16739955047530304491.class, str);
    }

    public static U16739955047530304491[] values() {
        return (U16739955047530304491[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
