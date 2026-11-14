package ads_mobile_sdk;

import android.os.Bundle;
import dev.epro.r0.B18329032920392634747;
import dev.epro.r0.B9271643986061518267;
import dev.epro.r0.C10696704014433963524;
import dev.epro.r0.H7219028874700587498;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.S12306309242770307923;
import dev.epro.r0.T7225292889360033468;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class f01 implements B18329032920392634747 {
    public final /* synthetic */ H7219028874700587498 a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ f01(AtomicBoolean atomicBoolean, H7219028874700587498 h7219028874700587498) {
        this.a = h7219028874700587498;
        this.b = atomicBoolean;
    }

    public void a(T7225292889360033468 t7225292889360033468) {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.resumeWith(new su0(new S12306309242770307923(7, t7225292889360033468.a, "com.google.android.libraries.ads.mobile.sdk")));
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onDismissed(Bundle bundle) {
        H7219028874700587498 h7219028874700587498 = this.a;
        if ((h7219028874700587498.s() instanceof B9271643986061518267) && this.b.compareAndSet(false, true)) {
            h7219028874700587498.resumeWith(O9245300239821758723.a);
        }
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onError(Bundle bundle) {
        H7219028874700587498 h7219028874700587498 = this.a;
        if ((h7219028874700587498.s() instanceof B9271643986061518267) && this.b.compareAndSet(false, true)) {
            h7219028874700587498.resumeWith(new C10696704014433963524(new Exception("HSDP open failed: " + bundle)));
        }
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onShown(Bundle bundle) {
        H7219028874700587498 h7219028874700587498 = this.a;
        if ((h7219028874700587498.s() instanceof B9271643986061518267) && this.b.compareAndSet(false, true)) {
            h7219028874700587498.resumeWith(O9245300239821758723.a);
        }
    }
}
