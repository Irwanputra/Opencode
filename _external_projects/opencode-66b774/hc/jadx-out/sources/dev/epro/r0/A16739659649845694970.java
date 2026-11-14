package dev.epro.r0;

import ads_mobile_sdk.al0;
import ads_mobile_sdk.gg0;
import ads_mobile_sdk.vm2;
import ads_mobile_sdk.wt0;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A16739659649845694970 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = 0;
        Account account = null;
        B6867906687934285025 b6867906687934285025 = null;
        Intent intent = null;
        String strH = null;
        String strH2 = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new H15446768409112154310(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                J8290223557870360453 j8290223557870360453 = new J8290223557870360453(parcel);
                j8290223557870360453.a = parcel.readByte() != 0;
                return j8290223557870360453;
            case 2:
                return new B6836344041339734677(parcel);
            case 3:
                return new I5194986633932264076(parcel);
            case 4:
                return new X9224684763743102869(parcel.readInt());
            case 5:
                I15053439731709465652 i15053439731709465652 = new I15053439731709465652();
                i15053439731709465652.a = parcel.readString();
                i15053439731709465652.b = parcel.readInt();
                return i15053439731709465652;
            case 6:
                Y4202658600493238058 y4202658600493238058 = new Y4202658600493238058();
                y4202658600493238058.e = null;
                y4202658600493238058.f = new ArrayList();
                y4202658600493238058.g = new ArrayList();
                y4202658600493238058.a = parcel.createStringArrayList();
                y4202658600493238058.b = parcel.createStringArrayList();
                y4202658600493238058.c = (B6836344041339734677[]) parcel.createTypedArray(B6836344041339734677.CREATOR);
                y4202658600493238058.d = parcel.readInt();
                y4202658600493238058.e = parcel.readString();
                y4202658600493238058.f = parcel.createStringArrayList();
                y4202658600493238058.g = parcel.createTypedArrayList(I5194986633932264076.CREATOR);
                y4202658600493238058.h = parcel.createTypedArrayList(I15053439731709465652.CREATOR);
                return y4202658600493238058;
            case 7:
                return new J13380993798601407787(parcel);
            case 8:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new X11530728323241563344((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 9:
                K17628906008394984379 k17628906008394984379 = new K17628906008394984379(parcel);
                k17628906008394984379.a = ((Integer) parcel.readValue(K17628906008394984379.class.getClassLoader())).intValue();
                return k17628906008394984379;
            case 10:
                B12414884914999257225 b12414884914999257225 = new B12414884914999257225(parcel);
                b12414884914999257225.a = parcel.readInt();
                return b12414884914999257225;
            case 11:
                return new ParcelImpl(parcel);
            case 12:
                return new O15319392248629494012(parcel.readFloat());
            case 13:
                return new P6024466796603310388(parcel.readInt());
            case 14:
                return new D10907589866287058828(parcel.readLong());
            case 15:
                int iC = U8836654130139556418.C(parcel);
                while (parcel.dataPosition() < iC) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        strH2 = U8836654130139556418.h(parcel, i);
                    } else if (c != 2) {
                        U8836654130139556418.z(parcel, i);
                    } else {
                        iV = U8836654130139556418.v(parcel, i);
                    }
                }
                U8836654130139556418.k(parcel, iC);
                return new al0(strH2, iV);
            case 16:
                int iC2 = U8836654130139556418.C(parcel);
                while (parcel.dataPosition() < iC2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        U8836654130139556418.z(parcel, i2);
                    } else {
                        strH = U8836654130139556418.h(parcel, i2);
                    }
                }
                U8836654130139556418.k(parcel, iC2);
                return new gg0(strH);
            case 17:
                int iC3 = U8836654130139556418.C(parcel);
                int iV2 = 0;
                while (true) {
                    byte[] bArr = null;
                    while (parcel.dataPosition() < iC3) {
                        int i3 = parcel.readInt();
                        char c2 = (char) i3;
                        if (c2 == 1) {
                            iV = U8836654130139556418.v(parcel, i3);
                        } else if (c2 == 2) {
                            int iW = U8836654130139556418.w(parcel, i3);
                            int iDataPosition = parcel.dataPosition();
                            if (iW == 0) {
                            }
                            byte[] bArrCreateByteArray = parcel.createByteArray();
                            parcel.setDataPosition(iDataPosition + iW);
                            bArr = bArrCreateByteArray;
                            break;
                        } else if (c2 != 3) {
                            U8836654130139556418.z(parcel, i3);
                        } else {
                            iV2 = U8836654130139556418.v(parcel, i3);
                        }
                    }
                    U8836654130139556418.k(parcel, iC3);
                    return new vm2(bArr, iV, iV2);
                }
                break;
            case 18:
                int iC4 = U8836654130139556418.C(parcel);
                while (true) {
                    byte[] bArr2 = null;
                    while (parcel.dataPosition() < iC4) {
                        int i4 = parcel.readInt();
                        char c3 = (char) i4;
                        if (c3 == 1) {
                            iV = U8836654130139556418.v(parcel, i4);
                        } else if (c3 != 2) {
                            U8836654130139556418.z(parcel, i4);
                        } else {
                            int iW2 = U8836654130139556418.w(parcel, i4);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iW2 == 0) {
                            }
                            byte[] bArrCreateByteArray2 = parcel.createByteArray();
                            parcel.setDataPosition(iDataPosition2 + iW2);
                            bArr2 = bArrCreateByteArray2;
                        }
                        break;
                    }
                    U8836654130139556418.k(parcel, iC4);
                    return new wt0(iV, bArr2);
                }
                break;
            case 19:
                int iC5 = U8836654130139556418.C(parcel);
                while (true) {
                    ArrayList arrayListCreateTypedArrayList = null;
                    while (parcel.dataPosition() < iC5) {
                        int i5 = parcel.readInt();
                        char c4 = (char) i5;
                        if (c4 == 1) {
                            iV = U8836654130139556418.v(parcel, i5);
                        } else if (c4 != 2) {
                            U8836654130139556418.z(parcel, i5);
                        } else {
                            Parcelable.Creator<K8261958701207187192> creator = K8261958701207187192.CREATOR;
                            int iW3 = U8836654130139556418.w(parcel, i5);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iW3 == 0) {
                            }
                            arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition3 + iW3);
                        }
                        break;
                    }
                    U8836654130139556418.k(parcel, iC5);
                    return new X12923627983819883516(iV, arrayListCreateTypedArrayList);
                }
                break;
            case 20:
                int iC6 = U8836654130139556418.C(parcel);
                int iV3 = 0;
                while (parcel.dataPosition() < iC6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iV = U8836654130139556418.v(parcel, i6);
                    } else if (c5 == 2) {
                        iV3 = U8836654130139556418.v(parcel, i6);
                    } else if (c5 != 3) {
                        U8836654130139556418.z(parcel, i6);
                    } else {
                        intent = (Intent) U8836654130139556418.g(parcel, i6, Intent.CREATOR);
                    }
                }
                U8836654130139556418.k(parcel, iC6);
                return new N8983057124922319375(iV, iV3, intent);
            case 21:
                int iC7 = U8836654130139556418.C(parcel);
                long j = 0;
                int iV4 = 0;
                String strH3 = null;
                String strH4 = null;
                String strH5 = null;
                String strH6 = null;
                Uri uri = null;
                String strH7 = null;
                String strH8 = null;
                ArrayList arrayList = null;
                String strH9 = null;
                String strH10 = null;
                while (parcel.dataPosition() < iC7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iV4 = U8836654130139556418.v(parcel, i7);
                            break;
                        case 2:
                            strH3 = U8836654130139556418.h(parcel, i7);
                            break;
                        case 3:
                            strH4 = U8836654130139556418.h(parcel, i7);
                            break;
                        case 4:
                            strH5 = U8836654130139556418.h(parcel, i7);
                            break;
                        case 5:
                            strH6 = U8836654130139556418.h(parcel, i7);
                            break;
                        case 6:
                            uri = (Uri) U8836654130139556418.g(parcel, i7, Uri.CREATOR);
                            break;
                        case 7:
                            strH7 = U8836654130139556418.h(parcel, i7);
                            break;
                        case '\b':
                            U8836654130139556418.F(parcel, i7, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            strH8 = U8836654130139556418.h(parcel, i7);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int iW4 = U8836654130139556418.w(parcel, i7);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iW4 != 0) {
                                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(iDataPosition4 + iW4);
                                arrayList = arrayListCreateTypedArrayList2;
                            } else {
                                arrayList = null;
                            }
                            break;
                        case 11:
                            strH9 = U8836654130139556418.h(parcel, i7);
                            break;
                        case '\f':
                            strH10 = U8836654130139556418.h(parcel, i7);
                            break;
                        default:
                            U8836654130139556418.z(parcel, i7);
                            break;
                    }
                }
                U8836654130139556418.k(parcel, iC7);
                return new GoogleSignInAccount(iV4, strH3, strH4, strH5, strH6, uri, strH7, j, strH8, arrayList, strH9, strH10);
            case 22:
                int iC8 = U8836654130139556418.C(parcel);
                ArrayList<String> arrayList2 = null;
                String strH11 = null;
                while (parcel.dataPosition() < iC8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        int iW5 = U8836654130139556418.w(parcel, i8);
                        int iDataPosition5 = parcel.dataPosition();
                        if (iW5 == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition5 + iW5);
                            arrayList2 = arrayListCreateStringArrayList;
                        }
                    } else if (c6 != 2) {
                        U8836654130139556418.z(parcel, i8);
                    } else {
                        strH11 = U8836654130139556418.h(parcel, i8);
                    }
                }
                U8836654130139556418.k(parcel, iC8);
                return new N4917429841024089144(strH11, arrayList2);
            case 23:
                int iC9 = U8836654130139556418.C(parcel);
                Q1083297855554014009 q1083297855554014009 = null;
                while (parcel.dataPosition() < iC9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        iV = U8836654130139556418.v(parcel, i9);
                    } else if (c7 == 2) {
                        b6867906687934285025 = (B6867906687934285025) U8836654130139556418.g(parcel, i9, B6867906687934285025.CREATOR);
                    } else if (c7 != 3) {
                        U8836654130139556418.z(parcel, i9);
                    } else {
                        q1083297855554014009 = (Q1083297855554014009) U8836654130139556418.g(parcel, i9, Q1083297855554014009.CREATOR);
                    }
                }
                U8836654130139556418.k(parcel, iC9);
                return new M11771061850939231904(iV, b6867906687934285025, q1083297855554014009);
            case 24:
                int iC10 = U8836654130139556418.C(parcel);
                long j2 = 0;
                long j3 = 0;
                int iV5 = -1;
                int iV6 = 0;
                int iV7 = 0;
                int iV8 = 0;
                int iV9 = 0;
                String strH12 = null;
                String strH13 = null;
                while (parcel.dataPosition() < iC10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iV6 = U8836654130139556418.v(parcel, i10);
                            break;
                        case 2:
                            iV7 = U8836654130139556418.v(parcel, i10);
                            break;
                        case 3:
                            iV8 = U8836654130139556418.v(parcel, i10);
                            break;
                        case 4:
                            U8836654130139556418.F(parcel, i10, 8);
                            j2 = parcel.readLong();
                            break;
                        case 5:
                            U8836654130139556418.F(parcel, i10, 8);
                            j3 = parcel.readLong();
                            break;
                        case 6:
                            strH12 = U8836654130139556418.h(parcel, i10);
                            break;
                        case 7:
                            strH13 = U8836654130139556418.h(parcel, i10);
                            break;
                        case '\b':
                            iV9 = U8836654130139556418.v(parcel, i10);
                            break;
                        case '\t':
                            iV5 = U8836654130139556418.v(parcel, i10);
                            break;
                        default:
                            U8836654130139556418.z(parcel, i10);
                            break;
                    }
                }
                U8836654130139556418.k(parcel, iC10);
                return new K8261958701207187192(iV6, iV7, iV8, j2, j3, strH12, strH13, iV9, iV5);
            case 25:
                int iC11 = U8836654130139556418.C(parcel);
                int iV10 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iC11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iV = U8836654130139556418.v(parcel, i11);
                    } else if (c8 == 2) {
                        account = (Account) U8836654130139556418.g(parcel, i11, Account.CREATOR);
                    } else if (c8 == 3) {
                        iV10 = U8836654130139556418.v(parcel, i11);
                    } else if (c8 != 4) {
                        U8836654130139556418.z(parcel, i11);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) U8836654130139556418.g(parcel, i11, GoogleSignInAccount.CREATOR);
                    }
                }
                U8836654130139556418.k(parcel, iC11);
                return new X14549083928103405288(iV, account, iV10, googleSignInAccount);
            case 26:
                int iC12 = U8836654130139556418.C(parcel);
                int iV11 = 0;
                boolean zU = false;
                boolean zU2 = false;
                IBinder iBinder = null;
                B6867906687934285025 b68679066879342850252 = null;
                while (parcel.dataPosition() < iC12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        iV11 = U8836654130139556418.v(parcel, i12);
                    } else if (c9 == 2) {
                        int iW6 = U8836654130139556418.w(parcel, i12);
                        int iDataPosition6 = parcel.dataPosition();
                        if (iW6 == 0) {
                            iBinder = null;
                        } else {
                            IBinder strongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(iDataPosition6 + iW6);
                            iBinder = strongBinder;
                        }
                    } else if (c9 == 3) {
                        b68679066879342850252 = (B6867906687934285025) U8836654130139556418.g(parcel, i12, B6867906687934285025.CREATOR);
                    } else if (c9 == 4) {
                        zU = U8836654130139556418.u(parcel, i12);
                    } else if (c9 != 5) {
                        U8836654130139556418.z(parcel, i12);
                    } else {
                        zU2 = U8836654130139556418.u(parcel, i12);
                    }
                }
                U8836654130139556418.k(parcel, iC12);
                return new Q1083297855554014009(iV11, iBinder, b68679066879342850252, zU, zU2);
            case 27:
                int iC13 = U8836654130139556418.C(parcel);
                int iV12 = 0;
                int iV13 = 0;
                PendingIntent pendingIntent = null;
                String strH14 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iC13) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        iV12 = U8836654130139556418.v(parcel, i13);
                    } else if (c10 == 2) {
                        iV13 = U8836654130139556418.v(parcel, i13);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) U8836654130139556418.g(parcel, i13, PendingIntent.CREATOR);
                    } else if (c10 == 4) {
                        strH14 = U8836654130139556418.h(parcel, i13);
                    } else if (c10 != 5) {
                        U8836654130139556418.z(parcel, i13);
                    } else {
                        int iW7 = U8836654130139556418.w(parcel, i13);
                        if (iW7 == 0) {
                            numValueOf = null;
                        } else {
                            if (iW7 != 4) {
                                String hexString = Integer.toHexString(iW7);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(iW7).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(iW7);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new M8821877208104636290(sb.toString(), parcel);
                            }
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                U8836654130139556418.k(parcel, iC13);
                return new B6867906687934285025(iV12, iV13, pendingIntent, strH14, numValueOf);
            case 28:
                int iC14 = U8836654130139556418.C(parcel);
                int iV14 = 0;
                boolean zU3 = false;
                boolean zU4 = false;
                int iV15 = 0;
                int iV16 = 0;
                while (parcel.dataPosition() < iC14) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        iV14 = U8836654130139556418.v(parcel, i14);
                    } else if (c11 == 2) {
                        zU3 = U8836654130139556418.u(parcel, i14);
                    } else if (c11 == 3) {
                        zU4 = U8836654130139556418.u(parcel, i14);
                    } else if (c11 == 4) {
                        iV15 = U8836654130139556418.v(parcel, i14);
                    } else if (c11 != 5) {
                        U8836654130139556418.z(parcel, i14);
                    } else {
                        iV16 = U8836654130139556418.v(parcel, i14);
                    }
                }
                U8836654130139556418.k(parcel, iC14);
                return new F5577235160184315757(iV14, zU3, zU4, iV15, iV16);
            default:
                int iC15 = U8836654130139556418.C(parcel);
                long j4 = -1;
                int iV17 = 0;
                boolean zU5 = false;
                String strH15 = null;
                while (parcel.dataPosition() < iC15) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        strH15 = U8836654130139556418.h(parcel, i15);
                    } else if (c12 == 2) {
                        iV17 = U8836654130139556418.v(parcel, i15);
                    } else if (c12 == 3) {
                        U8836654130139556418.F(parcel, i15, 8);
                        j4 = parcel.readLong();
                    } else if (c12 != 4) {
                        U8836654130139556418.z(parcel, i15);
                    } else {
                        zU5 = U8836654130139556418.u(parcel, i15);
                    }
                }
                U8836654130139556418.k(parcel, iC15);
                return new J18325703078859211263(strH15, iV17, j4, zU5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new H15446768409112154310[i];
            case 1:
                return new J8290223557870360453[i];
            case 2:
                return new B6836344041339734677[i];
            case 3:
                return new I5194986633932264076[i];
            case 4:
                return new X9224684763743102869[i];
            case 5:
                return new I15053439731709465652[i];
            case 6:
                return new Y4202658600493238058[i];
            case 7:
                return new J13380993798601407787[i];
            case 8:
                return new X11530728323241563344[i];
            case 9:
                return new K17628906008394984379[i];
            case 10:
                return new B12414884914999257225[i];
            case 11:
                return new ParcelImpl[i];
            case 12:
                return new O15319392248629494012[i];
            case 13:
                return new P6024466796603310388[i];
            case 14:
                return new D10907589866287058828[i];
            case 15:
                return new al0[i];
            case 16:
                return new gg0[i];
            case 17:
                return new vm2[i];
            case 18:
                return new wt0[i];
            case 19:
                return new X12923627983819883516[i];
            case 20:
                return new N8983057124922319375[i];
            case 21:
                return new GoogleSignInAccount[i];
            case 22:
                return new N4917429841024089144[i];
            case 23:
                return new M11771061850939231904[i];
            case 24:
                return new K8261958701207187192[i];
            case 25:
                return new X14549083928103405288[i];
            case 26:
                return new Q1083297855554014009[i];
            case 27:
                return new B6867906687934285025[i];
            case 28:
                return new F5577235160184315757[i];
            default:
                return new J18325703078859211263[i];
        }
    }
}
