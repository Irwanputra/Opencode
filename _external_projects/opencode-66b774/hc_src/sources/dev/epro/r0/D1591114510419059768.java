package dev.epro.r0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class D1591114510419059768 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ W13734796219485846113 b;

    public /* synthetic */ D1591114510419059768(W13734796219485846113 w13734796219485846113, byte b) {
        this.a = b;
        this.b = w13734796219485846113;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W13734796219485846113 w13734796219485846113 = this.b;
        switch (b) {
            case 0:
                WorkDatabase workDatabase = w13734796219485846113.c;
                workDatabase.getClass();
                workDatabase.p(new N8306548196372912291(new Q9622116641457785369(workDatabase, w13734796219485846113, (byte) 4), (byte) 7));
                D5189746287310821661.b(w13734796219485846113.b, workDatabase, w13734796219485846113.e);
                break;
            default:
                WorkDatabase workDatabase2 = w13734796219485846113.c;
                Context context = w13734796219485846113.a;
                int i = O4773618520189057698.f;
                if (Build.VERSION.SDK_INT >= 34) {
                    X11601796392564033066.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList d = O4773618520189057698.d(context, jobScheduler);
                if (d != null && !d.isEmpty()) {
                    int size = d.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = d.get(i2);
                        i2++;
                        O4773618520189057698.c(jobScheduler, ((JobInfo) obj).getId());
                    }
                }
                ((Number) G16660188620551127941.E(workDatabase2.x().a, false, true, new A11054869418321976017((byte) 9))).intValue();
                D5189746287310821661.b(w13734796219485846113.b, workDatabase2, w13734796219485846113.e);
                break;
        }
        return o9245300239821758723;
    }
}
