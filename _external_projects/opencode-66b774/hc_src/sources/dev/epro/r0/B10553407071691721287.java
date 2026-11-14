package dev.epro.r0;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B10553407071691721287 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ B10553407071691721287(byte b) {
        this.a = b;
    }

    public static void a(U15967579131276469447 u15967579131276469447, Parcel parcel, int i) {
        int A = C468629748621011703.A(parcel, 20293);
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
            int A2 = C468629748621011703.A(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            C468629748621011703.D(parcel, A2);
        }
        C468629748621011703.w(parcel, 6, u15967579131276469447.i, i);
        Bundle bundle = u15967579131276469447.j;
        if (bundle != null) {
            int A3 = C468629748621011703.A(parcel, 7);
            parcel.writeBundle(bundle);
            C468629748621011703.D(parcel, A3);
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
        C468629748621011703.D(parcel, A);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        switch (this.a) {
            case 0:
                int C = U8836654130139556418.C(parcel);
                while (parcel.dataPosition() < C) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        i = U8836654130139556418.v(parcel, readInt);
                    } else if (c != 2) {
                        U8836654130139556418.z(parcel, readInt);
                    } else {
                        str = U8836654130139556418.h(parcel, readInt);
                    }
                }
                U8836654130139556418.k(parcel, C);
                return new Scope(i, str);
            case 1:
                int C2 = U8836654130139556418.C(parcel);
                while (parcel.dataPosition() < C2) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        str = U8836654130139556418.h(parcel, readInt2);
                    } else if (c2 != 2) {
                        U8836654130139556418.z(parcel, readInt2);
                    } else {
                        i = U8836654130139556418.v(parcel, readInt2);
                    }
                }
                U8836654130139556418.k(parcel, C2);
                return new N3755692042688883577(str, i);
            case 2:
                int C3 = U8836654130139556418.C(parcel);
                PendingIntent pendingIntent = null;
                B6867906687934285025 b6867906687934285025 = null;
                while (parcel.dataPosition() < C3) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 1) {
                        i = U8836654130139556418.v(parcel, readInt3);
                    } else if (c3 == 2) {
                        str = U8836654130139556418.h(parcel, readInt3);
                    } else if (c3 == 3) {
                        pendingIntent = (PendingIntent) U8836654130139556418.g(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c3 != 4) {
                        U8836654130139556418.z(parcel, readInt3);
                    } else {
                        b6867906687934285025 = (B6867906687934285025) U8836654130139556418.g(parcel, readInt3, B6867906687934285025.CREATOR);
                    }
                }
                U8836654130139556418.k(parcel, C3);
                return new Status(i, str, pendingIntent, b6867906687934285025);
            case 3:
                int C4 = U8836654130139556418.C(parcel);
                Bundle bundle = null;
                J18325703078859211263[] j18325703078859211263Arr = null;
                M3288231786426044629 m3288231786426044629 = null;
                while (parcel.dataPosition() < C4) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 1) {
                        int w = U8836654130139556418.w(parcel, readInt4);
                        int dataPosition = parcel.dataPosition();
                        if (w == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition + w);
                            bundle = readBundle;
                        }
                    } else if (c4 == 2) {
                        j18325703078859211263Arr = (J18325703078859211263[]) U8836654130139556418.j(parcel, readInt4, J18325703078859211263.CREATOR);
                    } else if (c4 == 3) {
                        i = U8836654130139556418.v(parcel, readInt4);
                    } else if (c4 != 4) {
                        U8836654130139556418.z(parcel, readInt4);
                    } else {
                        m3288231786426044629 = (M3288231786426044629) U8836654130139556418.g(parcel, readInt4, M3288231786426044629.CREATOR);
                    }
                }
                U8836654130139556418.k(parcel, C4);
                Y9189380382094246501 y9189380382094246501 = new Y9189380382094246501();
                y9189380382094246501.d = bundle;
                y9189380382094246501.e = j18325703078859211263Arr;
                y9189380382094246501.f = i;
                y9189380382094246501.g = m3288231786426044629;
                return y9189380382094246501;
            case 4:
                int C5 = U8836654130139556418.C(parcel);
                boolean z = false;
                boolean z2 = false;
                int i2 = 0;
                F5577235160184315757 f5577235160184315757 = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < C5) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            f5577235160184315757 = (F5577235160184315757) U8836654130139556418.g(parcel, readInt5, F5577235160184315757.CREATOR);
                            break;
                        case 2:
                            z = U8836654130139556418.u(parcel, readInt5);
                            break;
                        case 3:
                            z2 = U8836654130139556418.u(parcel, readInt5);
                            break;
                        case 4:
                            int w2 = U8836654130139556418.w(parcel, readInt5);
                            int dataPosition2 = parcel.dataPosition();
                            if (w2 != 0) {
                                int[] createIntArray = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + w2);
                                iArr = createIntArray;
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i2 = U8836654130139556418.v(parcel, readInt5);
                            break;
                        case 6:
                            int w3 = U8836654130139556418.w(parcel, readInt5);
                            int dataPosition3 = parcel.dataPosition();
                            if (w3 != 0) {
                                int[] createIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + w3);
                                iArr2 = createIntArray2;
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            U8836654130139556418.z(parcel, readInt5);
                            break;
                    }
                }
                U8836654130139556418.k(parcel, C5);
                return new M3288231786426044629(f5577235160184315757, z, z2, iArr, i2, iArr2);
            case 5:
                int C6 = U8836654130139556418.C(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = U15967579131276469447.r;
                J18325703078859211263[] j18325703078859211263Arr2 = U15967579131276469447.s;
                J18325703078859211263[] j18325703078859211263Arr3 = j18325703078859211263Arr2;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                boolean z3 = false;
                int i6 = 0;
                boolean z4 = false;
                String str2 = null;
                IBinder iBinder = null;
                Account account = null;
                String str3 = null;
                while (parcel.dataPosition() < C6) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i3 = U8836654130139556418.v(parcel, readInt6);
                            break;
                        case 2:
                            i4 = U8836654130139556418.v(parcel, readInt6);
                            break;
                        case 3:
                            i5 = U8836654130139556418.v(parcel, readInt6);
                            break;
                        case 4:
                            str2 = U8836654130139556418.h(parcel, readInt6);
                            break;
                        case 5:
                            int w4 = U8836654130139556418.w(parcel, readInt6);
                            int dataPosition4 = parcel.dataPosition();
                            if (w4 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition4 + w4);
                                iBinder = readStrongBinder;
                                break;
                            } else {
                                iBinder = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) U8836654130139556418.j(parcel, readInt6, Scope.CREATOR);
                            break;
                        case 7:
                            int w5 = U8836654130139556418.w(parcel, readInt6);
                            int dataPosition5 = parcel.dataPosition();
                            if (w5 != 0) {
                                Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition5 + w5);
                                bundle2 = readBundle2;
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case '\b':
                            account = (Account) U8836654130139556418.g(parcel, readInt6, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            U8836654130139556418.z(parcel, readInt6);
                            break;
                        case '\n':
                            j18325703078859211263Arr2 = (J18325703078859211263[]) U8836654130139556418.j(parcel, readInt6, J18325703078859211263.CREATOR);
                            break;
                        case 11:
                            j18325703078859211263Arr3 = (J18325703078859211263[]) U8836654130139556418.j(parcel, readInt6, J18325703078859211263.CREATOR);
                            break;
                        case '\f':
                            z3 = U8836654130139556418.u(parcel, readInt6);
                            break;
                        case '\r':
                            i6 = U8836654130139556418.v(parcel, readInt6);
                            break;
                        case 14:
                            z4 = U8836654130139556418.u(parcel, readInt6);
                            break;
                        case 15:
                            str3 = U8836654130139556418.h(parcel, readInt6);
                            break;
                    }
                }
                U8836654130139556418.k(parcel, C6);
                return new U15967579131276469447(i3, i4, i5, str2, iBinder, scopeArr, bundle2, account, j18325703078859211263Arr2, j18325703078859211263Arr3, z3, i6, z4, str3);
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
