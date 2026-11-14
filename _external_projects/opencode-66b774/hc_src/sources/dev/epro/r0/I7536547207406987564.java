package dev.epro.r0;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I7536547207406987564 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ L9852841107405549527 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I7536547207406987564(L9852841107405549527 l9852841107405549527, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = l9852841107405549527;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        L9852841107405549527 l9852841107405549527 = this.v;
        switch (b) {
            case 0:
                return new I7536547207406987564(l9852841107405549527, r4833348786910499294, (byte) 0);
            default:
                return new I7536547207406987564(l9852841107405549527, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                long j = ((L2216691091636065972) obj).a;
                return new I7536547207406987564(this.v, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return ((I7536547207406987564) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        CharSequence text;
        int i;
        Spanned spanned;
        int i2;
        M11181104712105445833 m11181104712105445833;
        byte b = this.t;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        byte b2 = 1;
        L9852841107405549527 l9852841107405549527 = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                byte b3 = this.u;
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            E17665849472693074628.k(obj);
                            break;
                        } else {
                            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        E17665849472693074628.k(obj);
                    }
                } else {
                    E17665849472693074628.k(obj);
                    this.u = (byte) 1;
                    if (l9852841107405549527.t(this) == z3437138737604933638) {
                    }
                }
                H9390398899829886498 f = l9852841107405549527.f();
                if (f != null) {
                    String str = (String) f.a;
                    long j = ((F12478849263529740365) f.b).a;
                    S16869475527240117894 s16869475527240117894 = l9852841107405549527.j;
                    if (s16869475527240117894 != null) {
                        this.u = (byte) 2;
                        Object d = ((K1755082528704418605) s16869475527240117894).d(str, j, this);
                        if (d != z3437138737604933638) {
                            d = o9245300239821758723;
                        }
                        if (d == z3437138737604933638) {
                        }
                    }
                }
                break;
            default:
                byte b4 = this.u;
                if (b4 != 0) {
                    if (b4 != 1) {
                        if (b4 == 2) {
                            E17665849472693074628.k(obj);
                            obj2 = obj;
                            m11181104712105445833 = (M11181104712105445833) obj2;
                            if (m11181104712105445833 != null && l9852841107405549527.h()) {
                                R2889690641793769398 r2889690641793769398 = new R2889690641793769398(E15826830759497041750.l(l9852841107405549527.l(), l9852841107405549527.l().a.b.length()));
                                r2889690641793769398.c(m11181104712105445833);
                                M11181104712105445833 i3 = r2889690641793769398.i();
                                M11181104712105445833 k = E15826830759497041750.k(l9852841107405549527.l(), l9852841107405549527.l().a.b.length());
                                R2889690641793769398 r28896906417937693982 = new R2889690641793769398(i3);
                                r28896906417937693982.c(k);
                                M11181104712105445833 i4 = r28896906417937693982.i();
                                int length = m11181104712105445833.b.length() + F12478849263529740365.g(l9852841107405549527.l().b);
                                l9852841107405549527.c.invoke(L9852841107405549527.b(i4, T1335862270807194835.d(length, length)));
                                l9852841107405549527.r(I3645473568512758926.a);
                                l9852841107405549527.a.e = true;
                            }
                            break;
                        } else {
                            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        E17665849472693074628.k(obj);
                        a = obj;
                    }
                } else {
                    E17665849472693074628.k(obj);
                    L3957284589981577691 l3957284589981577691 = l9852841107405549527.h;
                    if (l3957284589981577691 != null) {
                        this.u = (byte) 1;
                        a = ((T2834513763987957608) l3957284589981577691).a();
                        if (a == z3437138737604933638) {
                        }
                    }
                }
                P444548812388912419 p444548812388912419 = (P444548812388912419) a;
                if (p444548812388912419 != null) {
                    this.u = (byte) 2;
                    ClipData clipData = p444548812388912419.a;
                    int i5 = 0;
                    ClipData.Item itemAt = clipData.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        obj2 = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i6 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i6];
                                if (S10823041268949770285.t(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel obtain = Parcel.obtain();
                                    byte[] decode = Base64.decode(value, i5);
                                    obtain.unmarshall(decode, i5, decode.length);
                                    obtain.setDataPosition(i5);
                                    long j2 = U10174709222559481877.h;
                                    long j3 = j2;
                                    long j4 = J5593409210068682756.c;
                                    long j5 = j4;
                                    R6694982557896913324 r6694982557896913324 = null;
                                    M2626744064473853568 m2626744064473853568 = null;
                                    S12008558933731077464 s12008558933731077464 = null;
                                    String str2 = null;
                                    V16528451706120227503 v16528451706120227503 = null;
                                    T10255414283460940890 t10255414283460940890 = null;
                                    W7621125212597703960 w7621125212597703960 = null;
                                    H7281108764511748709 h7281108764511748709 = null;
                                    while (obtain.dataAvail() > b2) {
                                        byte readByte = obtain.readByte();
                                        if (readByte != b2) {
                                            i = i5;
                                            spanned = spanned2;
                                            if (readByte == 2) {
                                                if (obtain.dataAvail() >= 5) {
                                                    byte readByte2 = obtain.readByte();
                                                    long j6 = readByte2 == b2 ? 4294967296L : readByte2 == 2 ? 8589934592L : 0L;
                                                    j4 = E6417708602094478350.a(j6, 0L) ? J5593409210068682756.c : V3311072669930093336.n(obtain.readFloat(), j6);
                                                    i5 = i;
                                                    spanned2 = spanned;
                                                    b2 = 1;
                                                } else {
                                                    arrayList.add(new F14378331124810887321(spanStart, spanEnd, new W1742516786250891319(j2, j4, r6694982557896913324, m2626744064473853568, s12008558933731077464, (H885820584188137964) null, str2, j5, v16528451706120227503, t10255414283460940890, (A5535629440393075509) null, j3, w7621125212597703960, h7281108764511748709, 49152)));
                                                }
                                            } else if (readByte == 3) {
                                                if (obtain.dataAvail() >= 4) {
                                                    spanned2 = spanned;
                                                    r6694982557896913324 = new R6694982557896913324(obtain.readInt());
                                                    b2 = 1;
                                                    i5 = i;
                                                } else {
                                                    arrayList.add(new F14378331124810887321(spanStart, spanEnd, new W1742516786250891319(j2, j4, r6694982557896913324, m2626744064473853568, s12008558933731077464, (H885820584188137964) null, str2, j5, v16528451706120227503, t10255414283460940890, (A5535629440393075509) null, j3, w7621125212597703960, h7281108764511748709, 49152)));
                                                }
                                            } else if (readByte == 4) {
                                                b2 = 1;
                                                if (obtain.dataAvail() >= 1) {
                                                    byte readByte3 = obtain.readByte();
                                                    M2626744064473853568 m26267440644738535682 = new M2626744064473853568((readByte3 != 0 && readByte3 == 1) ? 1 : i);
                                                    i5 = i;
                                                    m2626744064473853568 = m26267440644738535682;
                                                    spanned2 = spanned;
                                                } else {
                                                    arrayList.add(new F14378331124810887321(spanStart, spanEnd, new W1742516786250891319(j2, j4, r6694982557896913324, m2626744064473853568, s12008558933731077464, (H885820584188137964) null, str2, j5, v16528451706120227503, t10255414283460940890, (A5535629440393075509) null, j3, w7621125212597703960, h7281108764511748709, 49152)));
                                                }
                                            } else if (readByte != 5) {
                                                if (readByte == 6) {
                                                    str2 = obtain.readString();
                                                } else if (readByte != 7) {
                                                    if (readByte == 8) {
                                                        if (obtain.dataAvail() >= 4) {
                                                            i5 = i;
                                                            v16528451706120227503 = new V16528451706120227503(obtain.readFloat());
                                                            b2 = 1;
                                                            spanned2 = spanned;
                                                        }
                                                    } else if (readByte == 9) {
                                                        if (obtain.dataAvail() >= 8) {
                                                            spanned2 = spanned;
                                                            t10255414283460940890 = new T10255414283460940890(obtain.readFloat(), obtain.readFloat());
                                                            b2 = 1;
                                                            i5 = i;
                                                        }
                                                    } else if (readByte == 10) {
                                                        if (obtain.dataAvail() >= 8) {
                                                            int i7 = U10174709222559481877.i;
                                                            long readLong = obtain.readLong();
                                                            long j7 = readLong & 63;
                                                            if (j7 >= 16) {
                                                                readLong = (readLong & (-64)) | (j7 + 1);
                                                            }
                                                            j3 = readLong;
                                                        }
                                                    } else if (readByte == 11) {
                                                        if (obtain.dataAvail() >= 4) {
                                                            int readInt = obtain.readInt();
                                                            int i8 = (readInt & 2) != 0 ? 1 : i;
                                                            int i9 = (readInt & 1) != 0 ? 1 : i;
                                                            W7621125212597703960 w76211252125977039602 = W7621125212597703960.d;
                                                            W7621125212597703960 w76211252125977039603 = W7621125212597703960.c;
                                                            if (i8 != 0 && i9 != 0) {
                                                                List V = K5751602218013079365.V(w76211252125977039602, w76211252125977039603);
                                                                Integer valueOf = Integer.valueOf(i);
                                                                int size = V.size();
                                                                for (int i10 = i; i10 < size; i10++) {
                                                                    valueOf = Integer.valueOf(valueOf.intValue() | ((W7621125212597703960) V.get(i10)).a);
                                                                }
                                                                w76211252125977039602 = new W7621125212597703960(valueOf.intValue());
                                                            } else if (i8 == 0) {
                                                                w7621125212597703960 = i9 != 0 ? w76211252125977039603 : W7621125212597703960.b;
                                                            }
                                                            w7621125212597703960 = w76211252125977039602;
                                                        }
                                                    } else if (readByte == 12) {
                                                        if (obtain.dataAvail() >= 20) {
                                                            int i11 = U10174709222559481877.i;
                                                            long readLong2 = obtain.readLong();
                                                            long j8 = readLong2 & 63;
                                                            if (j8 >= 16) {
                                                                readLong2 = (readLong2 & (-64)) | (j8 + 1);
                                                            }
                                                            i5 = i;
                                                            spanned2 = spanned;
                                                            h7281108764511748709 = new H7281108764511748709(readLong2, (Float.floatToRawIntBits(obtain.readFloat()) << 32) | (Float.floatToRawIntBits(obtain.readFloat()) & 4294967295L), obtain.readFloat());
                                                            b2 = 1;
                                                        }
                                                    }
                                                    arrayList.add(new F14378331124810887321(spanStart, spanEnd, new W1742516786250891319(j2, j4, r6694982557896913324, m2626744064473853568, s12008558933731077464, (H885820584188137964) null, str2, j5, v16528451706120227503, t10255414283460940890, (A5535629440393075509) null, j3, w7621125212597703960, h7281108764511748709, 49152)));
                                                } else if (obtain.dataAvail() >= 5) {
                                                    byte readByte4 = obtain.readByte();
                                                    long j9 = readByte4 == 1 ? 4294967296L : readByte4 == 2 ? 8589934592L : 0L;
                                                    j5 = E6417708602094478350.a(j9, 0L) ? J5593409210068682756.c : V3311072669930093336.n(obtain.readFloat(), j9);
                                                } else {
                                                    arrayList.add(new F14378331124810887321(spanStart, spanEnd, new W1742516786250891319(j2, j4, r6694982557896913324, m2626744064473853568, s12008558933731077464, (H885820584188137964) null, str2, j5, v16528451706120227503, t10255414283460940890, (A5535629440393075509) null, j3, w7621125212597703960, h7281108764511748709, 49152)));
                                                }
                                                i5 = i;
                                                spanned2 = spanned;
                                                b2 = 1;
                                            } else if (obtain.dataAvail() >= 1) {
                                                byte readByte5 = obtain.readByte();
                                                if (readByte5 != 0) {
                                                    if (readByte5 == 1) {
                                                        i2 = 65535;
                                                    } else if (readByte5 == 3) {
                                                        i2 = 2;
                                                    } else if (readByte5 == 2) {
                                                        i2 = 1;
                                                    }
                                                    S12008558933731077464 s120085589337310774642 = new S12008558933731077464(i2);
                                                    i5 = i;
                                                    s12008558933731077464 = s120085589337310774642;
                                                    b2 = 1;
                                                    spanned2 = spanned;
                                                }
                                                i2 = i;
                                                S12008558933731077464 s1200855893373107746422 = new S12008558933731077464(i2);
                                                i5 = i;
                                                s12008558933731077464 = s1200855893373107746422;
                                                b2 = 1;
                                                spanned2 = spanned;
                                            } else {
                                                arrayList.add(new F14378331124810887321(spanStart, spanEnd, new W1742516786250891319(j2, j4, r6694982557896913324, m2626744064473853568, s12008558933731077464, (H885820584188137964) null, str2, j5, v16528451706120227503, t10255414283460940890, (A5535629440393075509) null, j3, w7621125212597703960, h7281108764511748709, 49152)));
                                            }
                                        } else if (obtain.dataAvail() >= 8) {
                                            int i12 = U10174709222559481877.i;
                                            long readLong3 = obtain.readLong();
                                            long j10 = readLong3 & 63;
                                            j2 = j10 < 16 ? readLong3 : (readLong3 & (-64)) | (j10 + 1);
                                        } else {
                                            i = i5;
                                            spanned = spanned2;
                                            arrayList.add(new F14378331124810887321(spanStart, spanEnd, new W1742516786250891319(j2, j4, r6694982557896913324, m2626744064473853568, s12008558933731077464, (H885820584188137964) null, str2, j5, v16528451706120227503, t10255414283460940890, (A5535629440393075509) null, j3, w7621125212597703960, h7281108764511748709, 49152)));
                                        }
                                    }
                                    i = i5;
                                    spanned = spanned2;
                                    arrayList.add(new F14378331124810887321(spanStart, spanEnd, new W1742516786250891319(j2, j4, r6694982557896913324, m2626744064473853568, s12008558933731077464, (H885820584188137964) null, str2, j5, v16528451706120227503, t10255414283460940890, (A5535629440393075509) null, j3, w7621125212597703960, h7281108764511748709, 49152)));
                                } else {
                                    i = i5;
                                    spanned = spanned2;
                                }
                                if (i6 != length2) {
                                    i6++;
                                    i5 = i;
                                    spanned2 = spanned;
                                    b2 = 1;
                                }
                            }
                        }
                        String obj3 = text.toString();
                        M11181104712105445833 m111811047121054458332 = Z15472362586437216226.a;
                        obj2 = new M11181104712105445833(arrayList.isEmpty() ? null : arrayList, obj3);
                    } else {
                        obj2 = new M11181104712105445833(text.toString());
                    }
                    if (obj2 == z3437138737604933638) {
                    }
                    m11181104712105445833 = (M11181104712105445833) obj2;
                    if (m11181104712105445833 != null) {
                        R2889690641793769398 r28896906417937693983 = new R2889690641793769398(E15826830759497041750.l(l9852841107405549527.l(), l9852841107405549527.l().a.b.length()));
                        r28896906417937693983.c(m11181104712105445833);
                        M11181104712105445833 i32 = r28896906417937693983.i();
                        M11181104712105445833 k2 = E15826830759497041750.k(l9852841107405549527.l(), l9852841107405549527.l().a.b.length());
                        R2889690641793769398 r288969064179376939822 = new R2889690641793769398(i32);
                        r288969064179376939822.c(k2);
                        M11181104712105445833 i42 = r288969064179376939822.i();
                        int length3 = m11181104712105445833.b.length() + F12478849263529740365.g(l9852841107405549527.l().b);
                        l9852841107405549527.c.invoke(L9852841107405549527.b(i42, T1335862270807194835.d(length3, length3)));
                        l9852841107405549527.r(I3645473568512758926.a);
                        l9852841107405549527.a.e = true;
                    }
                }
                break;
        }
        return o9245300239821758723;
    }
}
