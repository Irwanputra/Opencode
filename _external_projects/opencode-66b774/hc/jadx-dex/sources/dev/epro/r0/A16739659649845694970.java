package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A16739659649845694970 implements android.os.Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.M8821877208104636290 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) throws dev.epro.r0.M8821877208104636290 {
        int iV = 0;
        android.accounts.Account account = null;
        dev.epro.r0.B6867906687934285025 b6867906687934285025 = null;
        android.content.Intent intent = null;
        java.lang.String strH = null;
        java.lang.String strH2 = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new dev.epro.r0.H15446768409112154310(parcel.readInt() != 0 ? (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                dev.epro.r0.J8290223557870360453 j8290223557870360453 = new dev.epro.r0.J8290223557870360453(parcel);
                j8290223557870360453.a = parcel.readByte() != 0;
                return j8290223557870360453;
            case 2:
                return new dev.epro.r0.B6836344041339734677(parcel);
            case 3:
                return new dev.epro.r0.I5194986633932264076(parcel);
            case 4:
                return new dev.epro.r0.X9224684763743102869(parcel.readInt());
            case 5:
                dev.epro.r0.I15053439731709465652 i15053439731709465652 = new dev.epro.r0.I15053439731709465652();
                i15053439731709465652.a = parcel.readString();
                i15053439731709465652.b = parcel.readInt();
                return i15053439731709465652;
            case 6:
                dev.epro.r0.Y4202658600493238058 y4202658600493238058 = new dev.epro.r0.Y4202658600493238058();
                y4202658600493238058.e = null;
                y4202658600493238058.f = new java.util.ArrayList();
                y4202658600493238058.g = new java.util.ArrayList();
                y4202658600493238058.a = parcel.createStringArrayList();
                y4202658600493238058.b = parcel.createStringArrayList();
                y4202658600493238058.c = (dev.epro.r0.B6836344041339734677[]) parcel.createTypedArray(dev.epro.r0.B6836344041339734677.CREATOR);
                y4202658600493238058.d = parcel.readInt();
                y4202658600493238058.e = parcel.readString();
                y4202658600493238058.f = parcel.createStringArrayList();
                y4202658600493238058.g = parcel.createTypedArrayList(dev.epro.r0.I5194986633932264076.CREATOR);
                y4202658600493238058.h = parcel.createTypedArrayList(dev.epro.r0.I15053439731709465652.CREATOR);
                return y4202658600493238058;
            case 7:
                return new dev.epro.r0.J13380993798601407787(parcel);
            case 8:
                parcel.getClass();
                android.os.Parcelable parcelable = parcel.readParcelable(android.content.IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new dev.epro.r0.X11530728323241563344((android.content.IntentSender) parcelable, (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 9:
                dev.epro.r0.K17628906008394984379 k17628906008394984379 = new dev.epro.r0.K17628906008394984379(parcel);
                k17628906008394984379.a = ((java.lang.Integer) parcel.readValue(dev.epro.r0.K17628906008394984379.class.getClassLoader())).intValue();
                return k17628906008394984379;
            case 10:
                dev.epro.r0.B12414884914999257225 b12414884914999257225 = new dev.epro.r0.B12414884914999257225(parcel);
                b12414884914999257225.a = parcel.readInt();
                return b12414884914999257225;
            case 11:
                return new androidx.versionedparcelable.ParcelImpl(parcel);
            case 12:
                return new dev.epro.r0.O15319392248629494012(parcel.readFloat());
            case 13:
                return new dev.epro.r0.P6024466796603310388(parcel.readInt());
            case 14:
                return new dev.epro.r0.D10907589866287058828(parcel.readLong());
            case 15:
                int iC = dev.epro.r0.U8836654130139556418.C(parcel);
                while (parcel.dataPosition() < iC) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        strH2 = dev.epro.r0.U8836654130139556418.h(parcel, i);
                    } else if (c != 2) {
                        dev.epro.r0.U8836654130139556418.z(parcel, i);
                    } else {
                        iV = dev.epro.r0.U8836654130139556418.v(parcel, i);
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC);
                return new ads_mobile_sdk.al0(strH2, iV);
            case 16:
                int iC2 = dev.epro.r0.U8836654130139556418.C(parcel);
                while (parcel.dataPosition() < iC2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        dev.epro.r0.U8836654130139556418.z(parcel, i2);
                    } else {
                        strH = dev.epro.r0.U8836654130139556418.h(parcel, i2);
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC2);
                return new ads_mobile_sdk.gg0(strH);
            case 17:
                int iC3 = dev.epro.r0.U8836654130139556418.C(parcel);
                int iV2 = 0;
                while (true) {
                    byte[] bArr = null;
                    while (parcel.dataPosition() < iC3) {
                        int i3 = parcel.readInt();
                        char c2 = (char) i3;
                        if (c2 == 1) {
                            iV = dev.epro.r0.U8836654130139556418.v(parcel, i3);
                        } else if (c2 == 2) {
                            int iW = dev.epro.r0.U8836654130139556418.w(parcel, i3);
                            int iDataPosition = parcel.dataPosition();
                            if (iW == 0) {
                            }
                            byte[] bArrCreateByteArray = parcel.createByteArray();
                            parcel.setDataPosition(iDataPosition + iW);
                            bArr = bArrCreateByteArray;
                            break;
                        } else if (c2 != 3) {
                            dev.epro.r0.U8836654130139556418.z(parcel, i3);
                        } else {
                            iV2 = dev.epro.r0.U8836654130139556418.v(parcel, i3);
                        }
                    }
                    dev.epro.r0.U8836654130139556418.k(parcel, iC3);
                    return new ads_mobile_sdk.vm2(bArr, iV, iV2);
                }
                break;
            case 18:
                int iC4 = dev.epro.r0.U8836654130139556418.C(parcel);
                while (true) {
                    byte[] bArr2 = null;
                    while (parcel.dataPosition() < iC4) {
                        int i4 = parcel.readInt();
                        char c3 = (char) i4;
                        if (c3 == 1) {
                            iV = dev.epro.r0.U8836654130139556418.v(parcel, i4);
                        } else if (c3 != 2) {
                            dev.epro.r0.U8836654130139556418.z(parcel, i4);
                        } else {
                            int iW2 = dev.epro.r0.U8836654130139556418.w(parcel, i4);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iW2 == 0) {
                            }
                            byte[] bArrCreateByteArray2 = parcel.createByteArray();
                            parcel.setDataPosition(iDataPosition2 + iW2);
                            bArr2 = bArrCreateByteArray2;
                        }
                        break;
                    }
                    dev.epro.r0.U8836654130139556418.k(parcel, iC4);
                    return new ads_mobile_sdk.wt0(iV, bArr2);
                }
                break;
            case 19:
                int iC5 = dev.epro.r0.U8836654130139556418.C(parcel);
                while (true) {
                    java.util.ArrayList arrayListCreateTypedArrayList = null;
                    while (parcel.dataPosition() < iC5) {
                        int i5 = parcel.readInt();
                        char c4 = (char) i5;
                        if (c4 == 1) {
                            iV = dev.epro.r0.U8836654130139556418.v(parcel, i5);
                        } else if (c4 != 2) {
                            dev.epro.r0.U8836654130139556418.z(parcel, i5);
                        } else {
                            android.os.Parcelable.Creator creator = dev.epro.r0.K8261958701207187192.CREATOR;
                            int iW3 = dev.epro.r0.U8836654130139556418.w(parcel, i5);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iW3 == 0) {
                            }
                            arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition3 + iW3);
                        }
                        break;
                    }
                    dev.epro.r0.U8836654130139556418.k(parcel, iC5);
                    return new dev.epro.r0.X12923627983819883516(iV, arrayListCreateTypedArrayList);
                }
                break;
            case 20:
                int iC6 = dev.epro.r0.U8836654130139556418.C(parcel);
                int iV3 = 0;
                while (parcel.dataPosition() < iC6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iV = dev.epro.r0.U8836654130139556418.v(parcel, i6);
                    } else if (c5 == 2) {
                        iV3 = dev.epro.r0.U8836654130139556418.v(parcel, i6);
                    } else if (c5 != 3) {
                        dev.epro.r0.U8836654130139556418.z(parcel, i6);
                    } else {
                        intent = (android.content.Intent) dev.epro.r0.U8836654130139556418.g(parcel, i6, android.content.Intent.CREATOR);
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC6);
                return new dev.epro.r0.N8983057124922319375(iV, iV3, intent);
            case 21:
                int iC7 = dev.epro.r0.U8836654130139556418.C(parcel);
                long j = 0;
                int iV4 = 0;
                java.lang.String strH3 = null;
                java.lang.String strH4 = null;
                java.lang.String strH5 = null;
                java.lang.String strH6 = null;
                android.net.Uri uri = null;
                java.lang.String strH7 = null;
                java.lang.String strH8 = null;
                java.util.ArrayList arrayList = null;
                java.lang.String strH9 = null;
                java.lang.String strH10 = null;
                while (parcel.dataPosition() < iC7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iV4 = dev.epro.r0.U8836654130139556418.v(parcel, i7);
                            break;
                        case 2:
                            strH3 = dev.epro.r0.U8836654130139556418.h(parcel, i7);
                            break;
                        case 3:
                            strH4 = dev.epro.r0.U8836654130139556418.h(parcel, i7);
                            break;
                        case 4:
                            strH5 = dev.epro.r0.U8836654130139556418.h(parcel, i7);
                            break;
                        case 5:
                            strH6 = dev.epro.r0.U8836654130139556418.h(parcel, i7);
                            break;
                        case 6:
                            uri = (android.net.Uri) dev.epro.r0.U8836654130139556418.g(parcel, i7, android.net.Uri.CREATOR);
                            break;
                        case 7:
                            strH7 = dev.epro.r0.U8836654130139556418.h(parcel, i7);
                            break;
                        case '\b':
                            dev.epro.r0.U8836654130139556418.F(parcel, i7, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            strH8 = dev.epro.r0.U8836654130139556418.h(parcel, i7);
                            break;
                        case '\n':
                            android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> creator2 = com.google.android.gms.common.api.Scope.CREATOR;
                            int iW4 = dev.epro.r0.U8836654130139556418.w(parcel, i7);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iW4 != 0) {
                                java.util.ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(iDataPosition4 + iW4);
                                arrayList = arrayListCreateTypedArrayList2;
                            } else {
                                arrayList = null;
                            }
                            break;
                        case 11:
                            strH9 = dev.epro.r0.U8836654130139556418.h(parcel, i7);
                            break;
                        case '\f':
                            strH10 = dev.epro.r0.U8836654130139556418.h(parcel, i7);
                            break;
                        default:
                            dev.epro.r0.U8836654130139556418.z(parcel, i7);
                            break;
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC7);
                return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(iV4, strH3, strH4, strH5, strH6, uri, strH7, j, strH8, arrayList, strH9, strH10);
            case 22:
                int iC8 = dev.epro.r0.U8836654130139556418.C(parcel);
                java.util.ArrayList<java.lang.String> arrayList2 = null;
                java.lang.String strH11 = null;
                while (parcel.dataPosition() < iC8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        int iW5 = dev.epro.r0.U8836654130139556418.w(parcel, i8);
                        int iDataPosition5 = parcel.dataPosition();
                        if (iW5 == 0) {
                            arrayList2 = null;
                        } else {
                            java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition5 + iW5);
                            arrayList2 = arrayListCreateStringArrayList;
                        }
                    } else if (c6 != 2) {
                        dev.epro.r0.U8836654130139556418.z(parcel, i8);
                    } else {
                        strH11 = dev.epro.r0.U8836654130139556418.h(parcel, i8);
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC8);
                return new dev.epro.r0.N4917429841024089144(strH11, arrayList2);
            case 23:
                int iC9 = dev.epro.r0.U8836654130139556418.C(parcel);
                dev.epro.r0.Q1083297855554014009 q1083297855554014009 = null;
                while (parcel.dataPosition() < iC9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        iV = dev.epro.r0.U8836654130139556418.v(parcel, i9);
                    } else if (c7 == 2) {
                        b6867906687934285025 = (dev.epro.r0.B6867906687934285025) dev.epro.r0.U8836654130139556418.g(parcel, i9, dev.epro.r0.B6867906687934285025.CREATOR);
                    } else if (c7 != 3) {
                        dev.epro.r0.U8836654130139556418.z(parcel, i9);
                    } else {
                        q1083297855554014009 = (dev.epro.r0.Q1083297855554014009) dev.epro.r0.U8836654130139556418.g(parcel, i9, dev.epro.r0.Q1083297855554014009.CREATOR);
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC9);
                return new dev.epro.r0.M11771061850939231904(iV, b6867906687934285025, q1083297855554014009);
            case 24:
                int iC10 = dev.epro.r0.U8836654130139556418.C(parcel);
                long j2 = 0;
                long j3 = 0;
                int iV5 = -1;
                int iV6 = 0;
                int iV7 = 0;
                int iV8 = 0;
                int iV9 = 0;
                java.lang.String strH12 = null;
                java.lang.String strH13 = null;
                while (parcel.dataPosition() < iC10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iV6 = dev.epro.r0.U8836654130139556418.v(parcel, i10);
                            break;
                        case 2:
                            iV7 = dev.epro.r0.U8836654130139556418.v(parcel, i10);
                            break;
                        case 3:
                            iV8 = dev.epro.r0.U8836654130139556418.v(parcel, i10);
                            break;
                        case 4:
                            dev.epro.r0.U8836654130139556418.F(parcel, i10, 8);
                            j2 = parcel.readLong();
                            break;
                        case 5:
                            dev.epro.r0.U8836654130139556418.F(parcel, i10, 8);
                            j3 = parcel.readLong();
                            break;
                        case 6:
                            strH12 = dev.epro.r0.U8836654130139556418.h(parcel, i10);
                            break;
                        case 7:
                            strH13 = dev.epro.r0.U8836654130139556418.h(parcel, i10);
                            break;
                        case '\b':
                            iV9 = dev.epro.r0.U8836654130139556418.v(parcel, i10);
                            break;
                        case '\t':
                            iV5 = dev.epro.r0.U8836654130139556418.v(parcel, i10);
                            break;
                        default:
                            dev.epro.r0.U8836654130139556418.z(parcel, i10);
                            break;
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC10);
                return new dev.epro.r0.K8261958701207187192(iV6, iV7, iV8, j2, j3, strH12, strH13, iV9, iV5);
            case 25:
                int iC11 = dev.epro.r0.U8836654130139556418.C(parcel);
                int iV10 = 0;
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iC11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iV = dev.epro.r0.U8836654130139556418.v(parcel, i11);
                    } else if (c8 == 2) {
                        account = (android.accounts.Account) dev.epro.r0.U8836654130139556418.g(parcel, i11, android.accounts.Account.CREATOR);
                    } else if (c8 == 3) {
                        iV10 = dev.epro.r0.U8836654130139556418.v(parcel, i11);
                    } else if (c8 != 4) {
                        dev.epro.r0.U8836654130139556418.z(parcel, i11);
                    } else {
                        googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) dev.epro.r0.U8836654130139556418.g(parcel, i11, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC11);
                return new dev.epro.r0.X14549083928103405288(iV, account, iV10, googleSignInAccount);
            case 26:
                int iC12 = dev.epro.r0.U8836654130139556418.C(parcel);
                int iV11 = 0;
                boolean zU = false;
                boolean zU2 = false;
                android.os.IBinder iBinder = null;
                dev.epro.r0.B6867906687934285025 b68679066879342850252 = null;
                while (parcel.dataPosition() < iC12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        iV11 = dev.epro.r0.U8836654130139556418.v(parcel, i12);
                    } else if (c9 == 2) {
                        int iW6 = dev.epro.r0.U8836654130139556418.w(parcel, i12);
                        int iDataPosition6 = parcel.dataPosition();
                        if (iW6 == 0) {
                            iBinder = null;
                        } else {
                            android.os.IBinder strongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(iDataPosition6 + iW6);
                            iBinder = strongBinder;
                        }
                    } else if (c9 == 3) {
                        b68679066879342850252 = (dev.epro.r0.B6867906687934285025) dev.epro.r0.U8836654130139556418.g(parcel, i12, dev.epro.r0.B6867906687934285025.CREATOR);
                    } else if (c9 == 4) {
                        zU = dev.epro.r0.U8836654130139556418.u(parcel, i12);
                    } else if (c9 != 5) {
                        dev.epro.r0.U8836654130139556418.z(parcel, i12);
                    } else {
                        zU2 = dev.epro.r0.U8836654130139556418.u(parcel, i12);
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC12);
                return new dev.epro.r0.Q1083297855554014009(iV11, iBinder, b68679066879342850252, zU, zU2);
            case 27:
                int iC13 = dev.epro.r0.U8836654130139556418.C(parcel);
                int iV12 = 0;
                int iV13 = 0;
                android.app.PendingIntent pendingIntent = null;
                java.lang.String strH14 = null;
                java.lang.Integer numValueOf = null;
                while (parcel.dataPosition() < iC13) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        iV12 = dev.epro.r0.U8836654130139556418.v(parcel, i13);
                    } else if (c10 == 2) {
                        iV13 = dev.epro.r0.U8836654130139556418.v(parcel, i13);
                    } else if (c10 == 3) {
                        pendingIntent = (android.app.PendingIntent) dev.epro.r0.U8836654130139556418.g(parcel, i13, android.app.PendingIntent.CREATOR);
                    } else if (c10 == 4) {
                        strH14 = dev.epro.r0.U8836654130139556418.h(parcel, i13);
                    } else if (c10 != 5) {
                        dev.epro.r0.U8836654130139556418.z(parcel, i13);
                    } else {
                        int iW7 = dev.epro.r0.U8836654130139556418.w(parcel, i13);
                        if (iW7 == 0) {
                            numValueOf = null;
                        } else {
                            if (iW7 != 4) {
                                java.lang.String hexString = java.lang.Integer.toHexString(iW7);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(hexString).length() + java.lang.String.valueOf(4).length() + 19 + java.lang.String.valueOf(iW7).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(iW7);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new dev.epro.r0.M8821877208104636290(sb.toString(), parcel);
                            }
                            numValueOf = java.lang.Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC13);
                return new dev.epro.r0.B6867906687934285025(iV12, iV13, pendingIntent, strH14, numValueOf);
            case 28:
                int iC14 = dev.epro.r0.U8836654130139556418.C(parcel);
                int iV14 = 0;
                boolean zU3 = false;
                boolean zU4 = false;
                int iV15 = 0;
                int iV16 = 0;
                while (parcel.dataPosition() < iC14) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        iV14 = dev.epro.r0.U8836654130139556418.v(parcel, i14);
                    } else if (c11 == 2) {
                        zU3 = dev.epro.r0.U8836654130139556418.u(parcel, i14);
                    } else if (c11 == 3) {
                        zU4 = dev.epro.r0.U8836654130139556418.u(parcel, i14);
                    } else if (c11 == 4) {
                        iV15 = dev.epro.r0.U8836654130139556418.v(parcel, i14);
                    } else if (c11 != 5) {
                        dev.epro.r0.U8836654130139556418.z(parcel, i14);
                    } else {
                        iV16 = dev.epro.r0.U8836654130139556418.v(parcel, i14);
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC14);
                return new dev.epro.r0.F5577235160184315757(iV14, zU3, zU4, iV15, iV16);
            default:
                int iC15 = dev.epro.r0.U8836654130139556418.C(parcel);
                long j4 = -1;
                int iV17 = 0;
                boolean zU5 = false;
                java.lang.String strH15 = null;
                while (parcel.dataPosition() < iC15) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        strH15 = dev.epro.r0.U8836654130139556418.h(parcel, i15);
                    } else if (c12 == 2) {
                        iV17 = dev.epro.r0.U8836654130139556418.v(parcel, i15);
                    } else if (c12 == 3) {
                        dev.epro.r0.U8836654130139556418.F(parcel, i15, 8);
                        j4 = parcel.readLong();
                    } else if (c12 != 4) {
                        dev.epro.r0.U8836654130139556418.z(parcel, i15);
                    } else {
                        zU5 = dev.epro.r0.U8836654130139556418.u(parcel, i15);
                    }
                }
                dev.epro.r0.U8836654130139556418.k(parcel, iC15);
                return new dev.epro.r0.J18325703078859211263(strH15, iV17, j4, zU5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dev.epro.r0.H15446768409112154310[i];
            case 1:
                return new dev.epro.r0.J8290223557870360453[i];
            case 2:
                return new dev.epro.r0.B6836344041339734677[i];
            case 3:
                return new dev.epro.r0.I5194986633932264076[i];
            case 4:
                return new dev.epro.r0.X9224684763743102869[i];
            case 5:
                return new dev.epro.r0.I15053439731709465652[i];
            case 6:
                return new dev.epro.r0.Y4202658600493238058[i];
            case 7:
                return new dev.epro.r0.J13380993798601407787[i];
            case 8:
                return new dev.epro.r0.X11530728323241563344[i];
            case 9:
                return new dev.epro.r0.K17628906008394984379[i];
            case 10:
                return new dev.epro.r0.B12414884914999257225[i];
            case 11:
                return new androidx.versionedparcelable.ParcelImpl[i];
            case 12:
                return new dev.epro.r0.O15319392248629494012[i];
            case 13:
                return new dev.epro.r0.P6024466796603310388[i];
            case 14:
                return new dev.epro.r0.D10907589866287058828[i];
            case 15:
                return new ads_mobile_sdk.al0[i];
            case 16:
                return new ads_mobile_sdk.gg0[i];
            case 17:
                return new ads_mobile_sdk.vm2[i];
            case 18:
                return new ads_mobile_sdk.wt0[i];
            case 19:
                return new dev.epro.r0.X12923627983819883516[i];
            case 20:
                return new dev.epro.r0.N8983057124922319375[i];
            case 21:
                return new com.google.android.gms.auth.api.signin.GoogleSignInAccount[i];
            case 22:
                return new dev.epro.r0.N4917429841024089144[i];
            case 23:
                return new dev.epro.r0.M11771061850939231904[i];
            case 24:
                return new dev.epro.r0.K8261958701207187192[i];
            case 25:
                return new dev.epro.r0.X14549083928103405288[i];
            case 26:
                return new dev.epro.r0.Q1083297855554014009[i];
            case 27:
                return new dev.epro.r0.B6867906687934285025[i];
            case 28:
                return new dev.epro.r0.F5577235160184315757[i];
            default:
                return new dev.epro.r0.J18325703078859211263[i];
        }
    }
}
