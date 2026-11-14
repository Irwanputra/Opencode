package dev.epro.r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W16234715998534786353 extends L3120623210002840329 {
    public final /* synthetic */ long c;
    public final /* synthetic */ M17133811648581684718 d;
    public final /* synthetic */ S8093187219740136623 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W16234715998534786353(S8093187219740136623 s8093187219740136623, M17133811648581684718 m17133811648581684718, long j, M17133811648581684718 m171338116485816847182) {
        super(s8093187219740136623, m17133811648581684718);
        this.c = j;
        this.d = m171338116485816847182;
        Objects.requireNonNull(s8093187219740136623);
        this.e = s8093187219740136623;
    }

    @Override // dev.epro.r0.N3901745123707141715
    public final void b() {
        M17133811648581684718 m17133811648581684718 = this.d;
        S8093187219740136623 s8093187219740136623 = this.e;
        if (S8093187219740136623.d(s8093187219740136623)) {
            a(new L1893317219943000644(-2, null));
            return;
        }
        if (S8093187219740136623.c(s8093187219740136623)) {
            a(new L1893317219943000644(-14, null));
            return;
        }
        try {
            E17780051485341276699 e17780051485341276699 = s8093187219740136623.e.n;
            Bundle bundleB = S8093187219740136623.b(s8093187219740136623, this.c);
            F7345429099619087968 f7345429099619087968 = new F7345429099619087968(s8093187219740136623, m17133811648581684718, (byte) 1);
            J16132835055968791970 j16132835055968791970 = (J16132835055968791970) e17780051485341276699;
            j16132835055968791970.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i = K14793979556917953798.a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(f7345429099619087968);
            try {
                j16132835055968791970.a.transact(2, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            s8093187219740136623.a.getClass();
            m17133811648581684718.a(new L1893317219943000644(-100, e));
        }
    }
}
