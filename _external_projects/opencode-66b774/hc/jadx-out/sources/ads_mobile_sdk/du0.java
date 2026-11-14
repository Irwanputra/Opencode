package ads_mobile_sdk;

import dev.epro.r0.N340633841638932414;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class du0 extends CancellationException implements N340633841638932414 {
    public final CancellationException a;

    public du0(CancellationException cancellationException) {
        super(cancellationException.getMessage());
        this.a = cancellationException;
    }

    @Override // dev.epro.r0.N340633841638932414
    public final Throwable a() {
        return this.a;
    }
}
