package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C7253634312411945635 extends dev.epro.r0.L3120623210002840329 {
    public final /* synthetic */ dev.epro.r0.F2666344450883603512 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ dev.epro.r0.M17133811648581684718 f;
    public final /* synthetic */ dev.epro.r0.S8093187219740136623 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7253634312411945635(dev.epro.r0.S8093187219740136623 s8093187219740136623, dev.epro.r0.M17133811648581684718 m17133811648581684718, dev.epro.r0.F2666344450883603512 f2666344450883603512, long j, long j2, dev.epro.r0.M17133811648581684718 m171338116485816847182) {
        super(s8093187219740136623, m17133811648581684718);
        this.c = f2666344450883603512;
        this.d = j;
        this.e = j2;
        this.f = m171338116485816847182;
        java.util.Objects.requireNonNull(s8093187219740136623);
        this.g = s8093187219740136623;
    }

    public final void b() {
        dev.epro.r0.M17133811648581684718 m17133811648581684718 = this.f;
        dev.epro.r0.S8093187219740136623 s8093187219740136623 = this.g;
        if (dev.epro.r0.S8093187219740136623.d(s8093187219740136623)) {
            a(new dev.epro.r0.L1893317219943000644(-2, (java.lang.Throwable) null));
            return;
        }
        if (dev.epro.r0.S8093187219740136623.c(s8093187219740136623)) {
            a(new dev.epro.r0.L1893317219943000644(-14, (java.lang.Throwable) null));
            return;
        }
        try {
            dev.epro.r0.J16132835055968791970 j16132835055968791970 = s8093187219740136623.e.n;
            android.os.Bundle bundleA = dev.epro.r0.S8093187219740136623.a(s8093187219740136623, this.c, this.d, this.e);
            dev.epro.r0.F7345429099619087968 f7345429099619087968 = new dev.epro.r0.F7345429099619087968(s8093187219740136623, m17133811648581684718, (byte) 0);
            dev.epro.r0.J16132835055968791970 j161328350559687919702 = j16132835055968791970;
            j161328350559687919702.getClass();
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i = dev.epro.r0.K14793979556917953798.a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(f7345429099619087968);
            try {
                j161328350559687919702.a.transact(3, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (android.os.RemoteException e) {
            s8093187219740136623.a.getClass();
            m17133811648581684718.a(new dev.epro.r0.L1893317219943000644(-100, e));
        }
    }
}
