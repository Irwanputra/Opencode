package dev.epro.r0;

import dev.epro.httpcustom.HTTPCustomApp;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I6453388557760166973 implements A18195026813295081326 {
    public volatile O15378179187853170099 a;
    public final Object b = new Object();
    public final F6942723054099263096 c;

    public I6453388557760166973(F6942723054099263096 f6942723054099263096) {
        this.c = f6942723054099263096;
    }

    @Override // dev.epro.r0.A18195026813295081326
    public final Object d() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new O15378179187853170099(new U9296548531947164180((HTTPCustomApp) this.c.b, false));
                    }
                } finally {
                }
            }
        }
        return this.a;
    }
}
