package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E8496491261769853844 implements java.util.concurrent.Executor {
    public final /* synthetic */ byte a;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.a) {
            case 0:
                new java.lang.Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
