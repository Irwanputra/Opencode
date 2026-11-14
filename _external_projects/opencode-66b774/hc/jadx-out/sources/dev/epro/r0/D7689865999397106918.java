package dev.epro.r0;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class D7689865999397106918 implements N8011592092801627539 {
    public final File a;
    public final C8804068735739007381 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public D7689865999397106918(File file, C8804068735739007381 c8804068735739007381) {
        this.a = file;
        this.b = c8804068735739007381;
    }

    @Override // dev.epro.r0.N8011592092801627539
    public final void close() {
        this.c.set(true);
    }
}
