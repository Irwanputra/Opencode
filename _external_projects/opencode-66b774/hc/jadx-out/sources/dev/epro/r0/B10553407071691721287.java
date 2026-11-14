package dev.epro.r0;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B10553407071691721287 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ B10553407071691721287(byte b) {
        this.a = b;
    }

    public static void a(U15967579131276469447 u15967579131276469447, Parcel parcel, int i) {
        int iA = C468629748621011703.A(parcel, 20293);
        int i2 = u15967579131276469447.d;
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = u15967579131276469447.e;
        C468629748621011703.z(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = u15967579131276469447.f;
        C468629748621011703.z(parcel, 3, 4);
        parcel.writeInt(i4);
        C468629748621011703.v(parcel, u15967579131276469447.g, 4);
        IBinder iBinder = u15967579131276469447.h;
        if (iBinder != null) {
            int iA2 = C468629748621011703.A(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            C468629748621011703.D(parcel, iA2);
        }
        C468629748621011703.w(parcel, 6, u15967579131276469447.i, i);
        Bundle bundle = u15967579131276469447.j;
        if (bundle != null) {
            int iA3 = C468629748621011703.A(parcel, 7);
            parcel.writeBundle(bundle);
            C468629748621011703.D(parcel, iA3);
        }
        C468629748621011703.u(parcel, 8, u15967579131276469447.k, i);
        C468629748621011703.w(parcel, 10, u15967579131276469447.l, i);
        C468629748621011703.w(parcel, 11, u15967579131276469447.m, i);
        boolean z = u15967579131276469447.n;
        C468629748621011703.z(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = u15967579131276469447.f522o;
        C468629748621011703.z(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = u15967579131276469447.p;
        C468629748621011703.z(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C468629748621011703.v(parcel, u15967579131276469447.q, 15);
        C468629748621011703.D(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = 0;
        String strH = null;
        switch (this.a) {
            case 0:
                int iC = U8836654130139556418.C(parcel);
                while (parcel.dataPosition() < iC) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iV = U8836654130139556418.v(parcel, i);
                    } else if (c != 2) {
                        U8836654130139556418.z(parcel, i);
                    } else {
                        strH = U8836654130139556418.h(parcel, i);
                    }
                }
                U8836654130139556418.k(parcel, iC);
                return new Scope(iV, strH);
            case 1:
                int iC2 = U8836654130139556418.C(parcel);
                while (parcel.dataPosition() < iC2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        strH = U8836654130139556418.h(parcel, i2);
                    } else if (c2 != 2) {
                        U8836654130139556418.z(parcel, i2);
                    } else {
                        iV = U8836654130139556418.v(parcel, i2);
                    }
                }
                U8836654130139556418.k(parcel, iC2);
                return new N3755692042688883577(strH, iV);
            case 2:
                int iC3 = U8836654130139556418.C(parcel);
                PendingIntent pendingIntent = null;
                B6867906687934285025 b6867906687934285025 = null;
                while (parcel.dataPosition() < iC3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iV = U8836654130139556418.v(parcel, i3);
                    } else if (c3 == 2) {
                        strH = U8836654130139556418.h(parcel, i3);
                    } else if (c3 == 3) {
                        pendingIntent = (PendingIntent) U8836654130139556418.g(parcel, i3, PendingIntent.CREATOR);
                    } else if (c3 != 4) {
                        U8836654130139556418.z(parcel, i3);
                    } else {
                        b6867906687934285025 = (B6867906687934285025) U8836654130139556418.g(parcel, i3, B6867906687934285025.CREATOR);
                    }
                }
                U8836654130139556418.k(parcel, iC3);
                return new Status(iV, strH, pendingIntent, b6867906687934285025);
            case 3:
                int iC4 = U8836654130139556418.C(parcel);
                Bundle bundle = null;
                J18325703078859211263[] j18325703078859211263Arr = null;
                M3288231786426044629 m3288231786426044629 = null;
                while (parcel.dataPosition() < iC4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        int iW = U8836654130139556418.w(parcel, i4);
                        int iDataPosition = parcel.dataPosition();
                        if (iW == 0) {
                            bundle = null;
                        } else {
                            Bundle bundle2 = parcel.readBundle();
                            parcel.setDataPosition(iDataPosition + iW);
                            bundle = bundle2;
                        }
                    } else if (c4 == 2) {
                        j18325703078859211263Arr = (J18325703078859211263[]) U8836654130139556418.j(parcel, i4, J18325703078859211263.CREATOR);
                    } else if (c4 == 3) {
                        iV = U8836654130139556418.v(parcel, i4);
                    } else if (c4 != 4) {
                        U8836654130139556418.z(parcel, i4);
                    } else {
                        m3288231786426044629 = (M3288231786426044629) U8836654130139556418.g(parcel, i4, M3288231786426044629.CREATOR);
                    }
                }
                U8836654130139556418.k(parcel, iC4);
                Y9189380382094246501 y9189380382094246501 = new Y9189380382094246501();
                y9189380382094246501.d = bundle;
                y9189380382094246501.e = j18325703078859211263Arr;
                y9189380382094246501.f = iV;
                y9189380382094246501.g = m3288231786426044629;
                return y9189380382094246501;
            case 4:
                int iC5 = U8836654130139556418.C(parcel);
                boolean zU = false;
                boolean zU2 = false;
                int iV2 = 0;
                F5577235160184315757 f5577235160184315757 = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < iC5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            f5577235160184315757 = (F5577235160184315757) U8836654130139556418.g(parcel, i5, F5577235160184315757.CREATOR);
                            break;
                        case 2:
                            zU = U8836654130139556418.u(parcel, i5);
                            break;
                        case 3:
                            zU2 = U8836654130139556418.u(parcel, i5);
                            break;
                        case 4:
                            int iW2 = U8836654130139556418.w(parcel, i5);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iW2 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iW2);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case 5:
                            iV2 = U8836654130139556418.v(parcel, i5);
                            break;
                        case 6:
                            int iW3 = U8836654130139556418.w(parcel, i5);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iW3 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iW3);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            U8836654130139556418.z(parcel, i5);
                            break;
                    }
                }
                U8836654130139556418.k(parcel, iC5);
                return new M3288231786426044629(f5577235160184315757, zU, zU2, iArr, iV2, iArr2);
            case 5:
                int iC6 = U8836654130139556418.C(parcel);
                Bundle bundle3 = new Bundle();
                Scope[] scopeArr = U15967579131276469447.r;
                J18325703078859211263[] j18325703078859211263Arr2 = U15967579131276469447.s;
                J18325703078859211263[] j18325703078859211263Arr3 = j18325703078859211263Arr2;
                int iV3 = 0;
                int iV4 = 0;
                int iV5 = 0;
                boolean zU3 = false;
                int iV6 = 0;
                boolean zU4 = false;
                String strH2 = null;
                IBinder iBinder = null;
                Account account = null;
                String strH3 = null;
                while (parcel.dataPosition() < iC6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iV3 = U8836654130139556418.v(parcel, i6);
                            break;
                        case 2:
                            iV4 = U8836654130139556418.v(parcel, i6);
                            break;
                        case 3:
                            iV5 = U8836654130139556418.v(parcel, i6);
                            break;
                        case 4:
                            strH2 = U8836654130139556418.h(parcel, i6);
                            break;
                        case 5:
                            int iW4 = U8836654130139556418.w(parcel, i6);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iW4 != 0) {
                                IBinder strongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition4 + iW4);
                                iBinder = strongBinder;
                            } else {
                                iBinder = null;
                            }
                            break;
                        case 6:
                            scopeArr = (Scope[]) U8836654130139556418.j(parcel, i6, Scope.CREATOR);
                            break;
                        case 7:
                            int iW5 = U8836654130139556418.w(parcel, i6);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iW5 != 0) {
                                Bundle bundle4 = parcel.readBundle();
                                parcel.setDataPosition(iDataPosition5 + iW5);
                                bundle3 = bundle4;
                            } else {
                                bundle3 = null;
                            }
                            break;
                        case '\b':
                            account = (Account) U8836654130139556418.g(parcel, i6, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            U8836654130139556418.z(parcel, i6);
                            break;
                        case '\n':
                            j18325703078859211263Arr2 = (J18325703078859211263[]) U8836654130139556418.j(parcel, i6, J18325703078859211263.CREATOR);
                            break;
                        case 11:
                            j18325703078859211263Arr3 = (J18325703078859211263[]) U8836654130139556418.j(parcel, i6, J18325703078859211263.CREATOR);
                            break;
                        case '\f':
                            zU3 = U8836654130139556418.u(parcel, i6);
                            break;
                        case '\r':
                            iV6 = U8836654130139556418.v(parcel, i6);
                            break;
                        case 14:
                            zU4 = U8836654130139556418.u(parcel, i6);
                            break;
                        case 15:
                            strH3 = U8836654130139556418.h(parcel, i6);
                            break;
                    }
                }
                U8836654130139556418.k(parcel, iC6);
                return new U15967579131276469447(iV3, iV4, iV5, strH2, iBinder, scopeArr, bundle3, account, j18325703078859211263Arr2, j18325703078859211263Arr3, zU3, iV6, zU4, strH3);
            default:
                return new T9787743509987680105(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Scope[i];
            case 1:
                return new N3755692042688883577[i];
            case 2:
                return new Status[i];
            case 3:
                return new Y9189380382094246501[i];
            case 4:
                return new M3288231786426044629[i];
            case 5:
                return new U15967579131276469447[i];
            default:
                return new T9787743509987680105[i];
        }
    }
}
