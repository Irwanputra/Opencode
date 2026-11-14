package dev.epro.r0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class V10156126906264989283 extends H4611829575853284164 implements V9261584529168786349 {
    public static final V10156126906264989283 h = new V10156126906264989283(6, O4077903568229246.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // dev.epro.r0.V9261584529168786349
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        W1977247516027959386 w1977247516027959386 = (W1977247516027959386) obj2;
        Q13914734507241918864 q13914734507241918864 = (Q13914734507241918864) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        I6674524549538428163 i6674524549538428163 = (I6674524549538428163) obj5;
        N12253737202470468561 n12253737202470468561 = (N12253737202470468561) obj6;
        context.getClass();
        w1977247516027959386.getClass();
        q13914734507241918864.getClass();
        workDatabase.getClass();
        i6674524549538428163.getClass();
        int i = D5189746287310821661.a;
        O4773618520189057698 o4773618520189057698 = new O4773618520189057698(context, workDatabase, w1977247516027959386);
        F5574204526321220811.a(context, SystemJobService.class, true);
        B14824868959299866349.n().getClass();
        return K5751602218013079365.V(o4773618520189057698, new H209482626850465049(context, w1977247516027959386, i6674524549538428163, n12253737202470468561, new F6353700998356592239(n12253737202470468561, q13914734507241918864), q13914734507241918864));
    }
}
