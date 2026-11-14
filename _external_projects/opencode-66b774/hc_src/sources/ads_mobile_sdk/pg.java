package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import dev.epro.r0.B6805403844224311194;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.F7878618420024429111;
import dev.epro.r0.J5800360223679855765;
import dev.epro.r0.L17385865533161060024;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.S1392253949846343516;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class pg implements S1392253949846343516, L17385865533161060024 {
    public final Context a;
    public final vi3 b;
    public final j7 c;
    public final F7878618420024429111 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public D16915945238461757356 f = M9216324016624295870.J("E");

    public pg(Context context, vi3 vi3Var, j7 j7Var, F7878618420024429111 f7878618420024429111) {
        this.a = context;
        this.b = vi3Var;
        this.c = j7Var;
        this.d = f7878618420024429111;
    }

    @Override // dev.epro.r0.L17385865533161060024
    public final D16915945238461757356 a() {
        if (this.e.getAndSet(true)) {
            return B6805403844224311194.b;
        }
        return this.d.submit((Callable) new J5800360223679855765(this, (byte) 8));
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void b(HashMap hashMap) {
        c(hashMap);
    }

    public final void c(HashMap hashMap) {
        synchronized (this) {
            hashMap.put("ai", this.f);
        }
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap hashMap, Context context, View view) {
        c(hashMap);
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap hashMap) {
        c(hashMap);
    }
}
