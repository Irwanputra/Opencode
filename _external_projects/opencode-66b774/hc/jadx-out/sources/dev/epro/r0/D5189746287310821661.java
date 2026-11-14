package dev.epro.r0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class D5189746287310821661 {
    public static final /* synthetic */ int a = 0;

    static {
        B14824868959299866349.o("Schedulers");
    }

    public static void a(R6421434650946170247 r6421434650946170247, O12545633033254628644 o12545633033254628644, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r6421434650946170247.c(jCurrentTimeMillis, ((L16425900549479658727) it.next()).a);
            }
        }
    }

    public static void b(W1977247516027959386 w1977247516027959386, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        R6421434650946170247 r6421434650946170247X = workDatabase.x();
        workDatabase.b();
        try {
            J196785984016436306 j196785984016436306 = r6421434650946170247X.a;
            J196785984016436306 j1967859840164363062 = r6421434650946170247X.a;
            List list2 = (List) G16660188620551127941.E(j196785984016436306, true, false, new A11054869418321976017((byte) 5));
            a(r6421434650946170247X, w1977247516027959386.d, list2);
            List list3 = (List) G16660188620551127941.E(j1967859840164363062, true, false, new A11054869418321976017((byte) 3));
            a(r6421434650946170247X, w1977247516027959386.d, list3);
            list3.addAll(list2);
            List list4 = (List) G16660188620551127941.E(j1967859840164363062, true, false, new A11054869418321976017((byte) 8));
            workDatabase.q();
            workDatabase.m();
            if (list3.size() > 0) {
                L16425900549479658727[] l16425900549479658727Arr = (L16425900549479658727[]) list3.toArray(new L16425900549479658727[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Q17790836556653998983 q17790836556653998983 = (Q17790836556653998983) it.next();
                    if (q17790836556653998983.e()) {
                        q17790836556653998983.b(l16425900549479658727Arr);
                    }
                }
            }
            if (list4.size() > 0) {
                L16425900549479658727[] l16425900549479658727Arr2 = (L16425900549479658727[]) list4.toArray(new L16425900549479658727[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Q17790836556653998983 q177908365566539989832 = (Q17790836556653998983) it2.next();
                    if (!q177908365566539989832.e()) {
                        q177908365566539989832.b(l16425900549479658727Arr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.m();
            throw th;
        }
    }
}
