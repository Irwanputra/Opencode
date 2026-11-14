package ads_mobile_sdk;

import dev.epro.r0.N340633841638932414;
import dev.epro.r0.P2480554073835519965;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class lw0 extends CancellationException implements N340633841638932414 {
    public final P2480554073835519965 a;

    public lw0(P2480554073835519965 p2480554073835519965) {
        super(p2480554073835519965.getMessage());
        this.a = p2480554073835519965;
    }

    @Override // dev.epro.r0.N340633841638932414
    public final Throwable a() {
        return this.a;
    }
}
