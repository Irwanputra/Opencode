package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import dev.epro.r0.B6805403844224311194;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.F7878618420024429111;
import dev.epro.r0.L17385865533161060024;
import dev.epro.r0.P17493338506140929634;
import dev.epro.r0.Q9622116641457785369;
import dev.epro.r0.S1392253949846343516;
import dev.epro.r0.S15368342082797059271;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ot0 implements S1392253949846343516, L17385865533161060024 {
    public final Context a;
    public final vi3 b;
    public final F7878618420024429111 c;
    public final j7 d;
    public final P17493338506140929634 g;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public D16915945238461757356 h = B6805403844224311194.b;

    public ot0(Context context, vi3 vi3Var, F7878618420024429111 f7878618420024429111, j7 j7Var, P17493338506140929634 p17493338506140929634) {
        this.a = context;
        this.b = vi3Var;
        this.c = f7878618420024429111;
        this.d = j7Var;
        this.g = p17493338506140929634;
    }

    @Override // dev.epro.r0.L17385865533161060024
    public final D16915945238461757356 a() {
        if (this.e.getAndSet(true)) {
            return B6805403844224311194.b;
        }
        if (!this.d.w()) {
            return B6805403844224311194.b;
        }
        S15368342082797059271 s15368342082797059271 = new S15368342082797059271();
        this.h = s15368342082797059271;
        this.b.a(yk0.EVENT_ID_INIT_GASS_TRACKER, new Q9622116641457785369(this, s15368342082797059271, (byte) 22));
        return B6805403844224311194.b;
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void b(HashMap hashMap) {
        hashMap.put("gs", this.h);
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap hashMap, Context context, View view) {
        hashMap.put("gs", this.h);
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap hashMap) {
        hashMap.put("gs", this.h);
    }
}
