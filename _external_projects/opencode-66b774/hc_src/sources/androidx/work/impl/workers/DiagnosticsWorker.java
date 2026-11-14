package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import dev.epro.r0.A11054869418321976017;
import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.G16660188620551127941;
import dev.epro.r0.J196785984016436306;
import dev.epro.r0.K15167506293345463515;
import dev.epro.r0.O11820069373841472725;
import dev.epro.r0.O12545633033254628644;
import dev.epro.r0.O7265960433762398955;
import dev.epro.r0.R10975805389692362869;
import dev.epro.r0.R13606847544478402433;
import dev.epro.r0.R6421434650946170247;
import dev.epro.r0.V86870880106114790;
import dev.epro.r0.W13734796219485846113;
import dev.epro.r0.X18230120339549492884;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final R10975805389692362869 c() {
        W13734796219485846113 b = W13734796219485846113.b(this.a);
        b.getClass();
        WorkDatabase workDatabase = b.c;
        workDatabase.getClass();
        R6421434650946170247 x = workDatabase.x();
        V86870880106114790 v = workDatabase.v();
        O7265960433762398955 y = workDatabase.y();
        O11820069373841472725 u = workDatabase.u();
        O12545633033254628644 o12545633033254628644 = b.b.d;
        byte b2 = 4;
        List list = (List) G16660188620551127941.E(x.a, true, false, new X18230120339549492884(System.currentTimeMillis() - 86400000, b2));
        J196785984016436306 j196785984016436306 = x.a;
        List list2 = (List) G16660188620551127941.E(j196785984016436306, true, false, new A11054869418321976017(b2));
        List list3 = (List) G16660188620551127941.E(j196785984016436306, true, false, new A11054869418321976017((byte) 8));
        if (!list.isEmpty()) {
            B14824868959299866349 n = B14824868959299866349.n();
            int i = K15167506293345463515.a;
            n.getClass();
            B14824868959299866349 n2 = B14824868959299866349.n();
            K15167506293345463515.a(v, y, u, list);
            n2.getClass();
        }
        if (!list2.isEmpty()) {
            B14824868959299866349 n3 = B14824868959299866349.n();
            int i2 = K15167506293345463515.a;
            n3.getClass();
            B14824868959299866349 n4 = B14824868959299866349.n();
            K15167506293345463515.a(v, y, u, list2);
            n4.getClass();
        }
        if (!list3.isEmpty()) {
            B14824868959299866349 n5 = B14824868959299866349.n();
            int i3 = K15167506293345463515.a;
            n5.getClass();
            B14824868959299866349 n6 = B14824868959299866349.n();
            K15167506293345463515.a(v, y, u, list3);
            n6.getClass();
        }
        return new R13606847544478402433();
    }
}
