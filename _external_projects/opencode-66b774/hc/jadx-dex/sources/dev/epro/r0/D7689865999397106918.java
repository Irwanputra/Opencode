package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class D7689865999397106918 implements dev.epro.r0.N8011592092801627539 {
    public final java.io.File a;
    public final dev.epro.r0.C8804068735739007381 b;
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public D7689865999397106918(java.io.File file, dev.epro.r0.C8804068735739007381 c8804068735739007381) {
        this.a = file;
        this.b = c8804068735739007381;
    }

    public final void close() {
        this.c.set(true);
    }
}
