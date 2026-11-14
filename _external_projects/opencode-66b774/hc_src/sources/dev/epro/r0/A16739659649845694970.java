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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A16739659649845694970 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        Account account = null;
        B6867906687934285025 b6867906687934285025 = null;
        Intent intent = null;
        String str = null;
        String str2 = null;
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
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new X11530728323241563344((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
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
                int C = U8836654130139556418.C(parcel);
                while (parcel.dataPosition() < C) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        str2 = U8836654130139556418.h(parcel, readInt);
                    } else if (c != 2) {
                        U8836654130139556418.z(parcel, readInt);
                    } else {
                        i = U8836654130139556418.v(parcel, readInt);
                    }
                }
                U8836654130139556418.k(parcel, C);
                return new al0(str2, i);
            case 16:
                int C2 = U8836654130139556418.C(parcel);
                while (parcel.dataPosition() < C2) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        U8836654130139556418.z(parcel, readInt2);
                    } else {
                        str = U8836654130139556418.h(parcel, readInt2);
                    }
                }
                U8836654130139556418.k(parcel, C2);
                return new gg0(str);
            case 17:
                int C3 = U8836654130139556418.C(parcel);
                int i2 = 0;
                while (true) {
                    byte[] bArr = null;
                    while (parcel.dataPosition() < C3) {
                        int readInt3 = parcel.readInt();
                        char c2 = (char) readInt3;
                        if (c2 == 1) {
                            i = U8836654130139556418.v(parcel, readInt3);
                        } else if (c2 == 2) {
                            int w = U8836654130139556418.w(parcel, readInt3);
                            int dataPosition = parcel.dataPosition();
                            if (w == 0) {
                                break;
                            }
                            byte[] createByteArray = parcel.createByteArray();
                            parcel.setDataPosition(dataPosition + w);
                            bArr = createByteArray;
                        } else if (c2 != 3) {
                            U8836654130139556418.z(parcel, readInt3);
                        } else {
                            i2 = U8836654130139556418.v(parcel, readInt3);
                        }
                    }
                    U8836654130139556418.k(parcel, C3);
                    return new vm2(bArr, i, i2);
                    break;
                }
            case 18:
                int C4 = U8836654130139556418.C(parcel);
                while (true) {
                    byte[] bArr2 = null;
                    while (parcel.dataPosition() < C4) {
                        int readInt4 = parcel.readInt();
                        char c3 = (char) readInt4;
                        if (c3 == 1) {
                            i = U8836654130139556418.v(parcel, readInt4);
                        } else if (c3 != 2) {
                            U8836654130139556418.z(parcel, readInt4);
                        } else {
                            int w2 = U8836654130139556418.w(parcel, readInt4);
                            int dataPosition2 = parcel.dataPosition();
                            if (w2 == 0) {
                                break;
                            }
                            byte[] createByteArray2 = parcel.createByteArray();
                            parcel.setDataPosition(dataPosition2 + w2);
                            bArr2 = createByteArray2;
                        }
                    }
                    U8836654130139556418.k(parcel, C4);
                    return new wt0(i, bArr2);
                    break;
                }
            case 19:
                int C5 = U8836654130139556418.C(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < C5) {
                        int readInt5 = parcel.readInt();
                        char c4 = (char) readInt5;
                        if (c4 == 1) {
                            i = U8836654130139556418.v(parcel, readInt5);
                        } else if (c4 != 2) {
                            U8836654130139556418.z(parcel, readInt5);
                        } else {
                            Parcelable.Creator<K8261958701207187192> creator = K8261958701207187192.CREATOR;
                            int w3 = U8836654130139556418.w(parcel, readInt5);
                            int dataPosition3 = parcel.dataPosition();
                            if (w3 == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition3 + w3);
                        }
                    }
                    U8836654130139556418.k(parcel, C5);
                    return new X12923627983819883516(i, arrayList);
                    break;
                }
            case 20:
                int C6 = U8836654130139556418.C(parcel);
                int i3 = 0;
                while (parcel.dataPosition() < C6) {
                    int readInt6 = parcel.readInt();
                    char c5 = (char) readInt6;
                    if (c5 == 1) {
                        i = U8836654130139556418.v(parcel, readInt6);
                    } else if (c5 == 2) {
                        i3 = U8836654130139556418.v(parcel, readInt6);
                    } else if (c5 != 3) {
                        U8836654130139556418.z(parcel, readInt6);
                    } else {
                        intent = (Intent) U8836654130139556418.g(parcel, readInt6, Intent.CREATOR);
                    }
                }
                U8836654130139556418.k(parcel, C6);
                return new N8983057124922319375(i, i3, intent);
            case 21:
                int C7 = U8836654130139556418.C(parcel);
                long j = 0;
                int i4 = 0;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                Uri uri = null;
                String str7 = null;
                String str8 = null;
                ArrayList arrayList2 = null;
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < C7) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            i4 = U8836654130139556418.v(parcel, readInt7);
                            break;
                        case 2:
                            str3 = U8836654130139556418.h(parcel, readInt7);
                            break;
                        case 3:
                            str4 = U8836654130139556418.h(parcel, readInt7);
                            break;
                        case 4:
                            str5 = U8836654130139556418.h(parcel, readInt7);
                            break;
                        case 5:
                            str6 = U8836654130139556418.h(parcel, readInt7);
                            break;
                        case 6:
                            uri = (Uri) U8836654130139556418.g(parcel, readInt7, Uri.CREATOR);
                            break;
                        case 7:
                            str7 = U8836654130139556418.h(parcel, readInt7);
                            break;
                        case '\b':
                            U8836654130139556418.F(parcel, readInt7, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            str8 = U8836654130139556418.h(parcel, readInt7);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int w4 = U8836654130139556418.w(parcel, readInt7);
                            int dataPosition4 = parcel.dataPosition();
                            if (w4 != 0) {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(dataPosition4 + w4);
                                arrayList2 = createTypedArrayList;
                                break;
                            } else {
                                arrayList2 = null;
                                break;
                            }
                        case 11:
                            str9 = U8836654130139556418.h(parcel, readInt7);
                            break;
                        case '\f':
                            str10 = U8836654130139556418.h(parcel, readInt7);
                            break;
                        default:
                            U8836654130139556418.z(parcel, readInt7);
                            break;
                    }
                }
                U8836654130139556418.k(parcel, C7);
                return new GoogleSignInAccount(i4, str3, str4, str5, str6, uri, str7, j, str8, arrayList2, str9, str10);
            case 22:
                int C8 = U8836654130139556418.C(parcel);
                ArrayList<String> arrayList3 = null;
                String str11 = null;
                while (parcel.dataPosition() < C8) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        int w5 = U8836654130139556418.w(parcel, readInt8);
                        int dataPosition5 = parcel.dataPosition();
                        if (w5 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition5 + w5);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c6 != 2) {
                        U8836654130139556418.z(parcel, readInt8);
                    } else {
                        str11 = U8836654130139556418.h(parcel, readInt8);
                    }
                }
                U8836654130139556418.k(parcel, C8);
                return new N4917429841024089144(str11, arrayList3);
            case 23:
                int C9 = U8836654130139556418.C(parcel);
                Q1083297855554014009 q1083297855554014009 = null;
                while (parcel.dataPosition() < C9) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        i = U8836654130139556418.v(parcel, readInt9);
                    } else if (c7 == 2) {
                        b6867906687934285025 = (B6867906687934285025) U8836654130139556418.g(parcel, readInt9, B6867906687934285025.CREATOR);
                    } else if (c7 != 3) {
                        U8836654130139556418.z(parcel, readInt9);
                    } else {
                        q1083297855554014009 = (Q1083297855554014009) U8836654130139556418.g(parcel, readInt9, Q1083297855554014009.CREATOR);
                    }
                }
                U8836654130139556418.k(parcel, C9);
                return new M11771061850939231904(i, b6867906687934285025, q1083297855554014009);
            case 24:
                int C10 = U8836654130139556418.C(parcel);
                long j2 = 0;
                long j3 = 0;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < C10) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i6 = U8836654130139556418.v(parcel, readInt10);
                            break;
                        case 2:
                            i7 = U8836654130139556418.v(parcel, readInt10);
                            break;
                        case 3:
                            i8 = U8836654130139556418.v(parcel, readInt10);
                            break;
                        case 4:
                            U8836654130139556418.F(parcel, readInt10, 8);
                            j2 = parcel.readLong();
                            break;
                        case 5:
                            U8836654130139556418.F(parcel, readInt10, 8);
                            j3 = parcel.readLong();
                            break;
                        case 6:
                            str12 = U8836654130139556418.h(parcel, readInt10);
                            break;
                        case 7:
                            str13 = U8836654130139556418.h(parcel, readInt10);
                            break;
                        case '\b':
                            i9 = U8836654130139556418.v(parcel, readInt10);
                            break;
                        case '\t':
                            i5 = U8836654130139556418.v(parcel, readInt10);
                            break;
                        default:
                            U8836654130139556418.z(parcel, readInt10);
                            break;
                    }
                }
                U8836654130139556418.k(parcel, C10);
                return new K8261958701207187192(i6, i7, i8, j2, j3, str12, str13, i9, i5);
            case 25:
                int C11 = U8836654130139556418.C(parcel);
                int i10 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < C11) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        i = U8836654130139556418.v(parcel, readInt11);
                    } else if (c8 == 2) {
                        account = (Account) U8836654130139556418.g(parcel, readInt11, Account.CREATOR);
                    } else if (c8 == 3) {
                        i10 = U8836654130139556418.v(parcel, readInt11);
                    } else if (c8 != 4) {
                        U8836654130139556418.z(parcel, readInt11);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) U8836654130139556418.g(parcel, readInt11, GoogleSignInAccount.CREATOR);
                    }
                }
                U8836654130139556418.k(parcel, C11);
                return new X14549083928103405288(i, account, i10, googleSignInAccount);
            case 26:
                int C12 = U8836654130139556418.C(parcel);
                int i11 = 0;
                boolean z = false;
                boolean z2 = false;
                IBinder iBinder = null;
                B6867906687934285025 b68679066879342850252 = null;
                while (parcel.dataPosition() < C12) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 1) {
                        i11 = U8836654130139556418.v(parcel, readInt12);
                    } else if (c9 == 2) {
                        int w6 = U8836654130139556418.w(parcel, readInt12);
                        int dataPosition6 = parcel.dataPosition();
                        if (w6 == 0) {
                            iBinder = null;
                        } else {
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition6 + w6);
                            iBinder = readStrongBinder;
                        }
                    } else if (c9 == 3) {
                        b68679066879342850252 = (B6867906687934285025) U8836654130139556418.g(parcel, readInt12, B6867906687934285025.CREATOR);
                    } else if (c9 == 4) {
                        z = U8836654130139556418.u(parcel, readInt12);
                    } else if (c9 != 5) {
                        U8836654130139556418.z(parcel, readInt12);
                    } else {
                        z2 = U8836654130139556418.u(parcel, readInt12);
                    }
                }
                U8836654130139556418.k(parcel, C12);
                return new Q1083297855554014009(i11, iBinder, b68679066879342850252, z, z2);
            case 27:
                int C13 = U8836654130139556418.C(parcel);
                int i12 = 0;
                int i13 = 0;
                PendingIntent pendingIntent = null;
                String str14 = null;
                Integer num = null;
                while (parcel.dataPosition() < C13) {
                    int readInt13 = parcel.readInt();
                    char c10 = (char) readInt13;
                    if (c10 == 1) {
                        i12 = U8836654130139556418.v(parcel, readInt13);
                    } else if (c10 == 2) {
                        i13 = U8836654130139556418.v(parcel, readInt13);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) U8836654130139556418.g(parcel, readInt13, PendingIntent.CREATOR);
                    } else if (c10 == 4) {
                        str14 = U8836654130139556418.h(parcel, readInt13);
                    } else if (c10 != 5) {
                        U8836654130139556418.z(parcel, readInt13);
                    } else {
                        int w7 = U8836654130139556418.w(parcel, readInt13);
                        if (w7 == 0) {
                            num = null;
                        } else {
                            if (w7 != 4) {
                                String hexString = Integer.toHexString(w7);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(w7).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(w7);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new M8821877208104636290(sb.toString(), parcel);
                            }
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                U8836654130139556418.k(parcel, C13);
                return new B6867906687934285025(i12, i13, pendingIntent, str14, num);
            case 28:
                int C14 = U8836654130139556418.C(parcel);
                int i14 = 0;
                boolean z3 = false;
                boolean z4 = false;
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < C14) {
                    int readInt14 = parcel.readInt();
                    char c11 = (char) readInt14;
                    if (c11 == 1) {
                        i14 = U8836654130139556418.v(parcel, readInt14);
                    } else if (c11 == 2) {
                        z3 = U8836654130139556418.u(parcel, readInt14);
                    } else if (c11 == 3) {
                        z4 = U8836654130139556418.u(parcel, readInt14);
                    } else if (c11 == 4) {
                        i15 = U8836654130139556418.v(parcel, readInt14);
                    } else if (c11 != 5) {
                        U8836654130139556418.z(parcel, readInt14);
                    } else {
                        i16 = U8836654130139556418.v(parcel, readInt14);
                    }
                }
                U8836654130139556418.k(parcel, C14);
                return new F5577235160184315757(i14, z3, z4, i15, i16);
            default:
                int C15 = U8836654130139556418.C(parcel);
                long j4 = -1;
                int i17 = 0;
                boolean z5 = false;
                String str15 = null;
                while (parcel.dataPosition() < C15) {
                    int readInt15 = parcel.readInt();
                    char c12 = (char) readInt15;
                    if (c12 == 1) {
                        str15 = U8836654130139556418.h(parcel, readInt15);
                    } else if (c12 == 2) {
                        i17 = U8836654130139556418.v(parcel, readInt15);
                    } else if (c12 == 3) {
                        U8836654130139556418.F(parcel, readInt15, 8);
                        j4 = parcel.readLong();
                    } else if (c12 != 4) {
                        U8836654130139556418.z(parcel, readInt15);
                    } else {
                        z5 = U8836654130139556418.u(parcel, readInt15);
                    }
                }
                U8836654130139556418.k(parcel, C15);
                return new J18325703078859211263(str15, i17, j4, z5);
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
