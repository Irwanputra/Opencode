package androidx.work.impl.workers;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class DiagnosticsWorker extends androidx.work.Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final dev.epro.r0.R10975805389692362869 c() {
        dev.epro.r0.W13734796219485846113 w13734796219485846113B = dev.epro.r0.W13734796219485846113.b(((dev.epro.r0.P14960607863193493823) this).a);
        w13734796219485846113B.getClass();
        androidx.work.impl.WorkDatabase workDatabase = w13734796219485846113B.c;
        workDatabase.getClass();
        dev.epro.r0.R6421434650946170247 r6421434650946170247X = workDatabase.x();
        dev.epro.r0.V86870880106114790 v86870880106114790V = workDatabase.v();
        dev.epro.r0.O7265960433762398955 o7265960433762398955Y = workDatabase.y();
        dev.epro.r0.O11820069373841472725 o11820069373841472725U = workDatabase.u();
        dev.epro.r0.O12545633033254628644 o12545633033254628644 = w13734796219485846113B.b.d;
        java.util.List list = (java.util.List) dev.epro.r0.G16660188620551127941.E(r6421434650946170247X.a, true, false, new dev.epro.r0.X18230120339549492884(java.lang.System.currentTimeMillis() - 86400000, (byte) 4));
        dev.epro.r0.J196785984016436306 j196785984016436306 = r6421434650946170247X.a;
        java.util.List list2 = (java.util.List) dev.epro.r0.G16660188620551127941.E(j196785984016436306, true, false, new dev.epro.r0.A11054869418321976017((byte) 4));
        java.util.List list3 = (java.util.List) dev.epro.r0.G16660188620551127941.E(j196785984016436306, true, false, new dev.epro.r0.A11054869418321976017((byte) 8));
        if (!list.isEmpty()) {
            dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
            int i = dev.epro.r0.K15167506293345463515.a;
            b14824868959299866349N.getClass();
            dev.epro.r0.B14824868959299866349 b14824868959299866349N2 = dev.epro.r0.B14824868959299866349.n();
            dev.epro.r0.K15167506293345463515.a(v86870880106114790V, o7265960433762398955Y, o11820069373841472725U, list);
            b14824868959299866349N2.getClass();
        }
        if (!list2.isEmpty()) {
            dev.epro.r0.B14824868959299866349 b14824868959299866349N3 = dev.epro.r0.B14824868959299866349.n();
            int i2 = dev.epro.r0.K15167506293345463515.a;
            b14824868959299866349N3.getClass();
            dev.epro.r0.B14824868959299866349 b14824868959299866349N4 = dev.epro.r0.B14824868959299866349.n();
            dev.epro.r0.K15167506293345463515.a(v86870880106114790V, o7265960433762398955Y, o11820069373841472725U, list2);
            b14824868959299866349N4.getClass();
        }
        if (!list3.isEmpty()) {
            dev.epro.r0.B14824868959299866349 b14824868959299866349N5 = dev.epro.r0.B14824868959299866349.n();
            int i3 = dev.epro.r0.K15167506293345463515.a;
            b14824868959299866349N5.getClass();
            dev.epro.r0.B14824868959299866349 b14824868959299866349N6 = dev.epro.r0.B14824868959299866349.n();
            dev.epro.r0.K15167506293345463515.a(v86870880106114790V, o7265960433762398955Y, o11820069373841472725U, list3);
            b14824868959299866349N6.getClass();
        }
        return new dev.epro.r0.R13606847544478402433();
    }
}
