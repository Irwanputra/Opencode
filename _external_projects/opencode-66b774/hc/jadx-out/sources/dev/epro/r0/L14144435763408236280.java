package dev.epro.r0;

import android.app.Activity;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import java.util.Map;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L14144435763408236280 extends Binder implements IInterface {
    public final /* synthetic */ byte i;

    public L14144435763408236280(String str, byte b) {
        this.i = b;
        switch (b) {
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    public abstract boolean a(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.i;
        return this;
    }

    public boolean b(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean c(Parcel parcel, int i) {
        final byte b = 0;
        final byte b2 = 1;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) H15787954015490686430.a(parcel);
        H15787954015490686430.b(parcel);
        X17317415102512733138 x17317415102512733138 = (X17317415102512733138) this;
        int i2 = bundle.getInt("statusCode", 9270);
        if (i2 != 9281) {
            String str = x17317415102512733138.k;
            String str2 = x17317415102512733138.j;
            final V9493494307739248620 v9493494307739248620 = x17317415102512733138.q;
            if (i2 != 9282) {
                switch (i2) {
                    case 9271:
                        P17112279574965248524 p17112279574965248524 = v9493494307739248620.a;
                        if (p17112279574965248524 != null) {
                            final Bundle bundle2 = new Bundle();
                            bundle2.putString("appId", str2);
                            bundle2.putString("callerId", str);
                            bundle2.putBinder("windowToken", x17317415102512733138.l);
                            bundle2.putInt("clientWindowWidthPx", x17317415102512733138.m);
                            bundle2.putInt("clientWindowHeightPx", x17317415102512733138.n);
                            p17112279574965248524.a(new Runnable() { // from class: dev.epro.r0.N7269332334484421408
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = b;
                                    Bundle bundle3 = bundle2;
                                    V9493494307739248620 v94934943077392486202 = v9493494307739248620;
                                    switch (b3) {
                                        case 0:
                                            try {
                                                P17112279574965248524 p171122795749652485242 = v94934943077392486202.a;
                                                if (p171122795749652485242 == null) {
                                                    throw null;
                                                }
                                                E16253938867888995076 e16253938867888995076 = (E16253938867888995076) ((IInterface) p171122795749652485242.j);
                                                if (e16253938867888995076 == null) {
                                                    return;
                                                }
                                                R14018015077011593505 r14018015077011593505 = (R14018015077011593505) e16253938867888995076;
                                                Parcel parcelC = r14018015077011593505.c();
                                                int i3 = H15787954015490686430.a;
                                                parcelC.writeInt(1);
                                                bundle3.writeToParcel(parcelC, 0);
                                                r14018015077011593505.d(parcelC, 2);
                                                return;
                                            } catch (RemoteException unused) {
                                                return;
                                            }
                                        default:
                                            try {
                                                P17112279574965248524 p171122795749652485243 = v94934943077392486202.a;
                                                if (p171122795749652485243 == null) {
                                                    throw null;
                                                }
                                                E16253938867888995076 e162539388678889950762 = (E16253938867888995076) ((IInterface) p171122795749652485243.j);
                                                if (e162539388678889950762 == null) {
                                                    return;
                                                }
                                                R14018015077011593505 r140180150770115935052 = (R14018015077011593505) e162539388678889950762;
                                                Parcel parcelC2 = r140180150770115935052.c();
                                                int i4 = H15787954015490686430.a;
                                                parcelC2.writeInt(1);
                                                bundle3.writeToParcel(parcelC2, 0);
                                                r140180150770115935052.d(parcelC2, 3);
                                                return;
                                            } catch (RemoteException unused2) {
                                                return;
                                            }
                                    }
                                }
                            });
                            return true;
                        }
                        break;
                    case 9272:
                        P17112279574965248524 p171122795749652485242 = v9493494307739248620.a;
                        if (p171122795749652485242 != null) {
                            p171122795749652485242.c(new U11129707225609510868(p171122795749652485242, b));
                            return true;
                        }
                        break;
                    case 9273:
                    case 9274:
                    case 9275:
                    case 9276:
                        break;
                    case 9277:
                        P17112279574965248524 p171122795749652485243 = v9493494307739248620.a;
                        if (p171122795749652485243 != null) {
                            final Bundle bundle3 = new Bundle();
                            bundle3.putString("appId", str2);
                            bundle3.putString("callerId", str);
                            p171122795749652485243.a(new Runnable() { // from class: dev.epro.r0.N7269332334484421408
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b3 = b2;
                                    Bundle bundle32 = bundle3;
                                    V9493494307739248620 v94934943077392486202 = v9493494307739248620;
                                    switch (b3) {
                                        case 0:
                                            try {
                                                P17112279574965248524 p1711227957496524852422 = v94934943077392486202.a;
                                                if (p1711227957496524852422 == null) {
                                                    throw null;
                                                }
                                                E16253938867888995076 e16253938867888995076 = (E16253938867888995076) ((IInterface) p1711227957496524852422.j);
                                                if (e16253938867888995076 == null) {
                                                    return;
                                                }
                                                R14018015077011593505 r14018015077011593505 = (R14018015077011593505) e16253938867888995076;
                                                Parcel parcelC = r14018015077011593505.c();
                                                int i3 = H15787954015490686430.a;
                                                parcelC.writeInt(1);
                                                bundle32.writeToParcel(parcelC, 0);
                                                r14018015077011593505.d(parcelC, 2);
                                                return;
                                            } catch (RemoteException unused) {
                                                return;
                                            }
                                        default:
                                            try {
                                                P17112279574965248524 p1711227957496524852432 = v94934943077392486202.a;
                                                if (p1711227957496524852432 == null) {
                                                    throw null;
                                                }
                                                E16253938867888995076 e162539388678889950762 = (E16253938867888995076) ((IInterface) p1711227957496524852432.j);
                                                if (e162539388678889950762 == null) {
                                                    return;
                                                }
                                                R14018015077011593505 r140180150770115935052 = (R14018015077011593505) e162539388678889950762;
                                                Parcel parcelC2 = r140180150770115935052.c();
                                                int i4 = H15787954015490686430.a;
                                                parcelC2.writeInt(1);
                                                bundle32.writeToParcel(parcelC2, 0);
                                                r140180150770115935052.d(parcelC2, 3);
                                                return;
                                            } catch (RemoteException unused2) {
                                                return;
                                            }
                                    }
                                }
                            });
                            return true;
                        }
                        break;
                    default:
                        Bundle bundle4 = new Bundle();
                        if (i2 == 9278) {
                            bundle4.putString("errorMessage", "HPOA internal error");
                        } else if (i2 == 9279) {
                            bundle4.putString("errorMessage", "HPOA authentication error");
                        } else if (i2 == 9280) {
                            bundle4.putString("errorMessage", "HPOA invalid parameter");
                        } else {
                            bundle4.putString("errorMessage", "HPOA unknown error");
                        }
                        x17317415102512733138.f572o.onError(bundle4);
                        P17112279574965248524 p171122795749652485244 = v9493494307739248620.a;
                        if (p171122795749652485244 != null) {
                            p171122795749652485244.c(new U11129707225609510868(p171122795749652485244, b));
                            return true;
                        }
                        break;
                }
            } else {
                Activity activity = v9493494307739248620.b;
                String packageName = activity.getPackageName();
                Map map = x17317415102512733138.p;
                Intent intentB = C468629748621011703.B(str2, str, packageName, map);
                intentB.addFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                if (activity.getPackageManager().resolveActivity(intentB, 65536) != null) {
                    activity.startActivityForResult(intentB, 0);
                    return true;
                }
                activity.startActivity(C468629748621011703.y(str2, str, map));
            }
        }
        return true;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (this.i) {
            case 0:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                F7345429099619087968 f7345429099619087968 = (F7345429099619087968) this;
                L1893317219943000644 l1893317219943000644 = null;
                S8093187219740136623 s8093187219740136623 = f7345429099619087968.n;
                P8755783434649014957 p8755783434649014957 = f7345429099619087968.m;
                byte b = f7345429099619087968.l;
                M17133811648581684718 m17133811648581684718 = f7345429099619087968.j;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle = (Bundle) K14793979556917953798.a(parcel);
                    K14793979556917953798.b(parcel);
                    switch (b) {
                        case 1:
                            f7345429099619087968.e(bundle);
                            p8755783434649014957.getClass();
                            s8093187219740136623.d.getClass();
                            int i3 = bundle.getInt("error");
                            if (i3 != 0) {
                                bundle.getBoolean("is.error.remediable");
                                l1893317219943000644 = new L1893317219943000644(i3, null);
                            }
                            if (l1893317219943000644 == null) {
                                m17133811648581684718.b(Long.valueOf(bundle.getLong("warm.up.sid")));
                            } else {
                                m17133811648581684718.a(l1893317219943000644);
                            }
                            break;
                        default:
                            f7345429099619087968.e(bundle);
                            break;
                    }
                } else if (i == 3) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle2 = (Bundle) K14793979556917953798.a(parcel);
                    K14793979556917953798.b(parcel);
                    switch (b) {
                        case 0:
                            f7345429099619087968.d(bundle2);
                            p8755783434649014957.getClass();
                            s8093187219740136623.d.getClass();
                            int i4 = bundle2.getInt("error");
                            if (i4 != 0) {
                                bundle2.getBoolean("is.error.remediable");
                                l1893317219943000644 = new L1893317219943000644(i4, null);
                            }
                            if (l1893317219943000644 == null) {
                                bundle2.getLong("request.token.sid");
                                G11450220448113054352.h(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("IntegrityDialogWrapper");
                                String string = bundle2.getString("token");
                                if (string == null) {
                                    Z3383101362411723454.k("Null token");
                                } else {
                                    m17133811648581684718.b(new L2523661064345652493(string));
                                }
                            } else {
                                m17133811648581684718.a(l1893317219943000644);
                            }
                            break;
                        default:
                            f7345429099619087968.d(bundle2);
                            break;
                    }
                } else {
                    S8093187219740136623 s80931872197401366232 = f7345429099619087968.k;
                    if (i != 4 && i != 5) {
                        return false;
                    }
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    K14793979556917953798.b(parcel);
                    s80931872197401366232.e.c(m17133811648581684718);
                }
                return true;
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return a(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                Z7373362977535421473 z7373362977535421473 = (Z7373362977535421473) this;
                switch (i) {
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        z7373362977535421473.k.post(new I3863025946240164840((Object) z7373362977535421473, P5711368119050701608.a(parcel, M11771061850939231904.CREATOR), z, (byte) 19));
                        break;
                    case 9:
                        break;
                }
                parcel2.writeNoException();
                return true;
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return b(i, parcel, parcel2);
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return c(parcel, i);
        }
    }
}
