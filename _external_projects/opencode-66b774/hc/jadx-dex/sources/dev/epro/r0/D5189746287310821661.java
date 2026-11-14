package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class D5189746287310821661 {
    public static final /* synthetic */ int a = 0;

    static {
        dev.epro.r0.B14824868959299866349.o("Schedulers");
    }

    public static void a(dev.epro.r0.R6421434650946170247 r6421434650946170247, dev.epro.r0.O12545633033254628644 o12545633033254628644, java.util.List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r6421434650946170247.c(jCurrentTimeMillis, ((dev.epro.r0.L16425900549479658727) it.next()).a);
            }
        }
    }

    public static void b(dev.epro.r0.W1977247516027959386 w1977247516027959386, androidx.work.impl.WorkDatabase workDatabase, java.util.List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        dev.epro.r0.R6421434650946170247 r6421434650946170247X = workDatabase.x();
        workDatabase.b();
        try {
            dev.epro.r0.J196785984016436306 j196785984016436306 = r6421434650946170247X.a;
            dev.epro.r0.J196785984016436306 j1967859840164363062 = r6421434650946170247X.a;
            java.util.List list2 = (java.util.List) dev.epro.r0.G16660188620551127941.E(j196785984016436306, true, false, new dev.epro.r0.A11054869418321976017((byte) 5));
            a(r6421434650946170247X, w1977247516027959386.d, list2);
            java.util.List list3 = (java.util.List) dev.epro.r0.G16660188620551127941.E(j1967859840164363062, true, false, new dev.epro.r0.A11054869418321976017((byte) 3));
            a(r6421434650946170247X, w1977247516027959386.d, list3);
            list3.addAll(list2);
            java.util.List list4 = (java.util.List) dev.epro.r0.G16660188620551127941.E(j1967859840164363062, true, false, new dev.epro.r0.A11054869418321976017((byte) 8));
            workDatabase.q();
            workDatabase.m();
            if (list3.size() > 0) {
                dev.epro.r0.L16425900549479658727[] l16425900549479658727Arr = (dev.epro.r0.L16425900549479658727[]) list3.toArray(new dev.epro.r0.L16425900549479658727[list3.size()]);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    dev.epro.r0.Q17790836556653998983 q17790836556653998983 = (dev.epro.r0.Q17790836556653998983) it.next();
                    if (q17790836556653998983.e()) {
                        q17790836556653998983.b(l16425900549479658727Arr);
                    }
                }
            }
            if (list4.size() > 0) {
                dev.epro.r0.L16425900549479658727[] l16425900549479658727Arr2 = (dev.epro.r0.L16425900549479658727[]) list4.toArray(new dev.epro.r0.L16425900549479658727[list4.size()]);
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    dev.epro.r0.Q17790836556653998983 q177908365566539989832 = (dev.epro.r0.Q17790836556653998983) it2.next();
                    if (!q177908365566539989832.e()) {
                        q177908365566539989832.b(l16425900549479658727Arr2);
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            workDatabase.m();
            throw th;
        }
    }
}
