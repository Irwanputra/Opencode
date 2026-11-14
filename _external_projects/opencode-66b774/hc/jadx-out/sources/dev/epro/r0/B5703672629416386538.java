package dev.epro.r0;

import ads_mobile_sdk.b03;
import ads_mobile_sdk.bs3;
import ads_mobile_sdk.c7;
import ads_mobile_sdk.cq0;
import ads_mobile_sdk.d33;
import ads_mobile_sdk.d62;
import ads_mobile_sdk.e23;
import ads_mobile_sdk.e52;
import ads_mobile_sdk.f01;
import ads_mobile_sdk.fb;
import ads_mobile_sdk.gn1;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.jx1;
import ads_mobile_sdk.ko1;
import ads_mobile_sdk.kv0;
import ads_mobile_sdk.lp3;
import ads_mobile_sdk.n42;
import ads_mobile_sdk.qe3;
import ads_mobile_sdk.su0;
import ads_mobile_sdk.tf1;
import ads_mobile_sdk.wt1;
import ads_mobile_sdk.y13;
import ads_mobile_sdk.z1;
import ads_mobile_sdk.ze;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import androidx.webkit.Profile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B5703672629416386538 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5703672629416386538(it1 it1Var, wt1 wt1Var, I16631908410500040363 i16631908410500040363, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 7;
        this.u = wt1Var;
        this.v = i16631908410500040363;
        this.w = it1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        Object obj3 = this.v;
        switch (b) {
            case 0:
                return new B5703672629416386538(this.u, obj3, obj2, r4833348786910499294, (byte) 0);
            case 1:
                B5703672629416386538 b5703672629416386538 = new B5703672629416386538(obj3, obj2, r4833348786910499294, (byte) 1);
                b5703672629416386538.u = obj;
                return b5703672629416386538;
            case 2:
                B5703672629416386538 b57036726294163865382 = new B5703672629416386538((byte) 2, r4833348786910499294, obj2, obj3, false);
                b57036726294163865382.u = obj;
                return b57036726294163865382;
            case 3:
                B5703672629416386538 b57036726294163865383 = new B5703672629416386538((byte) 3, r4833348786910499294, obj2, obj3, false);
                b57036726294163865383.u = obj;
                return b57036726294163865383;
            case 4:
                B5703672629416386538 b57036726294163865384 = new B5703672629416386538(obj3, obj2, r4833348786910499294, (byte) 4);
                b57036726294163865384.u = obj;
                return b57036726294163865384;
            case 5:
                return new B5703672629416386538(this.u, obj3, obj2, r4833348786910499294, (byte) 5);
            case 6:
                B5703672629416386538 b57036726294163865385 = new B5703672629416386538(obj3, obj2, r4833348786910499294, (byte) 6);
                b57036726294163865385.u = obj;
                return b57036726294163865385;
            case 7:
                return new B5703672629416386538((it1) obj2, (wt1) this.u, (I16631908410500040363) obj3, r4833348786910499294);
            case 8:
                B5703672629416386538 b57036726294163865386 = new B5703672629416386538(obj3, obj2, r4833348786910499294, (byte) 8);
                b57036726294163865386.u = obj;
                return b57036726294163865386;
            case 9:
                return new B5703672629416386538(this.u, obj3, obj2, r4833348786910499294, (byte) 9);
            case 10:
                B5703672629416386538 b57036726294163865387 = new B5703672629416386538(obj3, obj2, r4833348786910499294, (byte) 10);
                b57036726294163865387.u = obj;
                return b57036726294163865387;
            case 11:
                B5703672629416386538 b57036726294163865388 = new B5703672629416386538(obj3, obj2, r4833348786910499294, (byte) 11);
                b57036726294163865388.u = obj;
                return b57036726294163865388;
            case 12:
                B5703672629416386538 b57036726294163865389 = new B5703672629416386538(obj3, obj2, r4833348786910499294, (byte) 12);
                b57036726294163865389.u = obj;
                return b57036726294163865389;
            default:
                return new B5703672629416386538(this.u, obj3, obj2, r4833348786910499294, (byte) 13);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                ((B5703672629416386538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 1:
                return ((B5703672629416386538) create((R4833348786910499294) obj2, (ze) obj)).invokeSuspend(o9245300239821758723);
            case 2:
                return ((B5703672629416386538) create((R4833348786910499294) obj2, (y13) obj)).invokeSuspend(o9245300239821758723);
            case 3:
                return ((B5703672629416386538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 4:
                ((B5703672629416386538) create((R4833348786910499294) obj2, (SQLiteDatabase) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 5:
                ((B5703672629416386538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 6:
                return ((B5703672629416386538) create((R4833348786910499294) obj2, (cq0) obj)).invokeSuspend(o9245300239821758723);
            case 7:
                ((B5703672629416386538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 8:
                return ((B5703672629416386538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 9:
                ((B5703672629416386538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 10:
                return ((B5703672629416386538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 11:
                ((B5703672629416386538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 12:
                return ((B5703672629416386538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                ((B5703672629416386538) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r7v0, types: [dev.epro.r0.R4833348786910499294] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ads_mobile_sdk.tf1] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ads_mobile_sdk.tf1] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dev.epro.r0.O2161699089510411363] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        I16631908410500040363 i16631908410500040363Y;
        ?? arrayList;
        I16631908410500040363 i16631908410500040363Y2;
        I16631908410500040363 i16631908410500040363Y3;
        P16422848101170923038 p16422848101170923038E;
        String strA;
        String strA2;
        byte b = this.t;
        byte b2 = 2;
        L856869997670741194 l856869997670741194 = L856869997670741194.d;
        ?? r6 = 0;
        int i = 0;
        int i2 = 0;
        ?? tf1Var = 0;
        tf1Var = 0;
        tf1Var = 0;
        tf1Var = 0;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        byte b3 = 1;
        Object obj2 = this.v;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                S11892176994350381461 s11892176994350381461 = (S11892176994350381461) obj2;
                R5670552972627103399 r5670552972627103399 = (R5670552972627103399) obj3;
                for (R14289894334981469490 r14289894334981469490 : (Set) ((W1972671267364756056) this.u).getValue()) {
                    if (!((List) s11892176994350381461.b().e.a.getValue()).contains(r14289894334981469490) && !r5670552972627103399.contains(r14289894334981469490)) {
                        s11892176994350381461.b().c(r14289894334981469490);
                    }
                }
                return o9245300239821758723;
            case 1:
                E17665849472693074628.k(obj);
                String str = (String) obj2;
                kv0 kv0Var = (kv0) obj3;
                W12857842498428870907 w12857842498428870907 = (W12857842498428870907) ((ze) this.u).n();
                Collections.unmodifiableMap(Collections.unmodifiableMap(((ze) w12857842498428870907.b).logs_)).getClass();
                w12857842498428870907.b();
                ze zeVar = (ze) w12857842498428870907.b;
                gn1 gn1Var = zeVar.logs_;
                if (!gn1Var.a) {
                    zeVar.logs_ = gn1Var.b();
                }
                zeVar.logs_.put(str, kv0Var);
                return (ze) w12857842498428870907.a();
            case 2:
                E17665849472693074628.k(obj);
                String str2 = (String) obj2;
                I4512433669318320344 i4512433669318320344 = (I4512433669318320344) ((y13) this.u).n();
                str2.getClass();
                i4512433669318320344.b();
                ((y13) i4512433669318320344.b).b(str2);
                ((e23) obj3).c.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                i4512433669318320344.b();
                y13 y13Var = (y13) i4512433669318320344.b;
                y13Var.bitField0_ = 2 | y13Var.bitField0_;
                y13Var.lastUpdateTimeMs_ = jCurrentTimeMillis;
                return (y13) i4512433669318320344.a();
            case 3:
                E17665849472693074628.k(obj);
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.u;
                P16422848101170923038 p16422848101170923038 = (P16422848101170923038) obj2;
                jx1 jx1Var = (jx1) obj3;
                ArrayList arrayList2 = new ArrayList(Z115818233709597990.k0(p16422848101170923038, 10));
                int size = p16422848101170923038.a.size();
                while (r6 < size) {
                    arrayList2.add(R7033599853981556291.l(w5797197595347441198, null, new fb((Object) jx1Var, r3.get(r6), (R4833348786910499294) tf1Var, (byte) 6), 3));
                    r6++;
                }
                return arrayList2;
            case 4:
                E17665849472693074628.k(obj);
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.u;
                n42 n42Var = (n42) obj2;
                String str3 = n42.f;
                n42Var.getClass();
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{(String) obj3});
                n42.a(n42Var, sQLiteDatabase);
                return o9245300239821758723;
            case 5:
                Q16898486116126855517 q16898486116126855517 = (Q16898486116126855517) this.u;
                H7219028874700587498 h7219028874700587498 = (H7219028874700587498) obj3;
                qe3 qe3Var = (qe3) obj2;
                z1 z1Var = qe3Var.f;
                d33 d33Var = qe3Var.h;
                E17665849472693074628.k(obj);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                try {
                    if (q16898486116126855517 instanceof ko1) {
                        qe3Var.l.a(d33Var, z1Var, q16898486116126855517, new f01(atomicBoolean, h7219028874700587498));
                    } else if (q16898486116126855517 instanceof b03) {
                        qe3Var.m.a(d33Var, z1Var, q16898486116126855517, new f01(atomicBoolean, h7219028874700587498));
                    } else if (q16898486116126855517 instanceof e52) {
                        ((T13262009518181969142) qe3Var.n.get()).a(d33Var, z1Var, q16898486116126855517, new f01(atomicBoolean, h7219028874700587498));
                    }
                    break;
                } catch (Throwable th) {
                    if (!atomicBoolean.getAndSet(true)) {
                        byte b4 = X2485016533998461232._a(1).a;
                        String message = th.getMessage();
                        if (message == null) {
                            message = th.toString();
                        }
                        h7219028874700587498.resumeWith(new su0(new S12306309242770307923(b4, message, "com.google.android.libraries.ads.mobile.sdk")));
                    }
                }
                return o9245300239821758723;
            case 6:
                E17665849472693074628.k(obj);
                String str4 = (String) obj2;
                String str5 = (String) obj3;
                Y5584543079932758380 y5584543079932758380 = (Y5584543079932758380) ((cq0) this.u).n();
                if (str4 == null || str4.length() == 0) {
                    Collections.unmodifiableMap(Collections.unmodifiableMap(((cq0) y5584543079932758380.b).storedSdkCoreData_)).getClass();
                    str5.getClass();
                    y5584543079932758380.b();
                    cq0 cq0Var = (cq0) y5584543079932758380.b;
                    gn1 gn1Var2 = cq0Var.storedSdkCoreData_;
                    if (!gn1Var2.a) {
                        cq0Var.storedSdkCoreData_ = gn1Var2.b();
                    }
                    cq0Var.storedSdkCoreData_.remove(str5);
                } else {
                    Collections.unmodifiableMap(Collections.unmodifiableMap(((cq0) y5584543079932758380.b).storedSdkCoreData_)).getClass();
                    str5.getClass();
                    y5584543079932758380.b();
                    cq0 cq0Var2 = (cq0) y5584543079932758380.b;
                    gn1 gn1Var3 = cq0Var2.storedSdkCoreData_;
                    if (!gn1Var3.a) {
                        cq0Var2.storedSdkCoreData_ = gn1Var3.b();
                    }
                    cq0Var2.storedSdkCoreData_.put(str5, str4);
                }
                return (cq0) y5584543079932758380.a();
            case 7:
                it1 it1Var = (it1) obj3;
                E17665849472693074628.k(obj);
                c7 c7Var = ((wt1) this.u).d;
                I16631908410500040363 i16631908410500040363 = (I16631908410500040363) obj2;
                c7Var.getClass();
                i16631908410500040363.getClass();
                try {
                    i16631908410500040363Y = i16631908410500040363.y("mute");
                    break;
                } catch (Exception unused) {
                    i16631908410500040363Y = null;
                }
                if (i16631908410500040363Y == null || (p16422848101170923038E = d62.e(i16631908410500040363Y, "reasons")) == null) {
                    arrayList = O2161699089510411363.a;
                } else {
                    arrayList = new ArrayList();
                    ArrayList arrayList3 = p16422848101170923038E.a;
                    int size2 = arrayList3.size();
                    while (i2 < size2) {
                        Object obj4 = arrayList3.get(i2);
                        i2++;
                        try {
                            I16631908410500040363 i16631908410500040363L = ((K15572083692188606544) obj4).l();
                            strA = d62.a(i16631908410500040363L, "reason", "");
                            strA2 = d62.a(i16631908410500040363L, "ping_url", "");
                            break;
                        } catch (Exception unused2) {
                        }
                        tf1 tf1Var2 = (M8927913404651150384.Y(strA) || M8927913404651150384.Y(strA2)) ? null : new tf1(strA, strA2);
                        if (tf1Var2 != null) {
                            arrayList.add(tf1Var2);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it1Var.p.add((tf1) it.next());
                }
                c7Var.getClass();
                try {
                    i16631908410500040363Y2 = i16631908410500040363.y("mute");
                    break;
                } catch (Exception unused3) {
                    i16631908410500040363Y2 = null;
                }
                if (i16631908410500040363Y2 != null) {
                    try {
                        i16631908410500040363Y3 = i16631908410500040363Y2.y("default_reason");
                    } catch (Exception unused4) {
                        i16631908410500040363Y3 = null;
                    }
                    if (i16631908410500040363Y3 != null) {
                        String strA3 = d62.a(i16631908410500040363Y3, "reason", "");
                        String strA4 = d62.a(i16631908410500040363Y3, "ping_url", "");
                        if (!M8927913404651150384.Y(strA3) && !M8927913404651150384.Y(strA4)) {
                            tf1Var = new tf1(strA3, strA4);
                        }
                    }
                    break;
                }
                it1Var.q = tf1Var;
                return o9245300239821758723;
            case 8:
                E17665849472693074628.k(obj);
                W5797197595347441198 w57971975953474411982 = (W5797197595347441198) this.u;
                P16422848101170923038 p164228481011709230382 = (P16422848101170923038) obj2;
                c7 c7Var2 = (c7) obj3;
                ArrayList arrayList4 = new ArrayList(Z115818233709597990.k0(p164228481011709230382, 10));
                ArrayList arrayList5 = p164228481011709230382.a;
                int size3 = arrayList5.size();
                while (i < size3) {
                    Object obj5 = arrayList5.get(i);
                    i++;
                    arrayList4.add(R7033599853981556291.l(w57971975953474411982, null, new fb(obj5, (Object) c7Var2, (R4833348786910499294) tf1Var, (byte) 18), 3));
                }
                return arrayList4;
            case 9:
                E17665849472693074628.k(obj);
                AtomicBoolean atomicBoolean2 = lp3.a;
                Profile profile = (Profile) this.u;
                String str6 = (String) obj2;
                F7878618420024429111 f7878618420024429111 = ((bs3) obj3).g.d;
                profile.getClass();
                str6.getClass();
                if (lp3.d.get()) {
                    try {
                        profile.prefetchUrlAsync(str6, null, f7878618420024429111, new U11450443558875589191((byte) 9));
                    } catch (Throwable unused5) {
                        lp3.d.set(false);
                    }
                    break;
                }
                return o9245300239821758723;
            case 10:
                E17665849472693074628.k(obj);
                W5797197595347441198 w57971975953474411983 = (W5797197595347441198) this.u;
                S14157914735975478504 s14157914735975478504 = (S14157914735975478504) obj2;
                N235339945877347053 n235339945877347053 = (N235339945877347053) obj3;
                R7033599853981556291.E(w57971975953474411983, null, l856869997670741194, new J613969224664809486(s14157914735975478504, n235339945877347053, tf1Var, b3), 1);
                return R7033599853981556291.E(w57971975953474411983, null, l856869997670741194, new J613969224664809486(s14157914735975478504, n235339945877347053, tf1Var, b2), 1);
            case 11:
                E17665849472693074628.k(obj);
                W5797197595347441198 w57971975953474411984 = (W5797197595347441198) this.u;
                N17102349568798422850 n17102349568798422850 = (N17102349568798422850) obj2;
                D2717688760023469083 d2717688760023469083 = n17102349568798422850.s;
                S14157914735975478504 s141579147359754785042 = (S14157914735975478504) obj3;
                L17554200096564731241 l17554200096564731241 = new L17554200096564731241(d2717688760023469083, n17102349568798422850, (byte) 24);
                R4833348786910499294 r4833348786910499294 = null;
                R7033599853981556291.E(w57971975953474411984, null, l856869997670741194, new T16740726869587199021(d2717688760023469083, s141579147359754785042, r4833348786910499294, r6), 1);
                R7033599853981556291.E(w57971975953474411984, null, l856869997670741194, new O12152244488187446230((Object) n17102349568798422850, (Object) d2717688760023469083, (Object) s141579147359754785042, (Object) l17554200096564731241, (R4833348786910499294) null, (byte) 18), 1);
                R7033599853981556291.E(w57971975953474411984, null, l856869997670741194, new C288342651169725874(d2717688760023469083, s141579147359754785042, l17554200096564731241, r4833348786910499294, (byte) 21), 1);
                return o9245300239821758723;
            case 12:
                E17665849472693074628.k(obj);
                W5797197595347441198 w57971975953474411985 = (W5797197595347441198) this.u;
                D2717688760023469083 d27176887600234690832 = (D2717688760023469083) obj2;
                S14157914735975478504 s141579147359754785043 = (S14157914735975478504) obj3;
                R7033599853981556291.E(w57971975953474411985, null, l856869997670741194, new T16740726869587199021(d27176887600234690832, s141579147359754785043, tf1Var, b3), 1);
                R7033599853981556291.E(w57971975953474411985, null, l856869997670741194, new T16740726869587199021(d27176887600234690832, s141579147359754785043, tf1Var, b2), 1);
                return R7033599853981556291.E(w57971975953474411985, null, l856869997670741194, new T16740726869587199021(s141579147359754785043, d27176887600234690832, null), 1);
            default:
                H617089765907910851 h617089765907910851 = (H617089765907910851) obj3;
                R8029976778412248429 r8029976778412248429 = (R8029976778412248429) obj2;
                E17665849472693074628.k(obj);
                K192523740806967956 k192523740806967956 = (K192523740806967956) this.u;
                Boolean bool = k192523740806967956.a;
                Boolean bool2 = Boolean.TRUE;
                if (S10823041268949770285.t(bool, bool2)) {
                    r8029976778412248429.a(h617089765907910851.e());
                    r8029976778412248429.d(h617089765907910851.f());
                }
                k192523740806967956.a = bool2;
                return o9245300239821758723;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B5703672629416386538(Object obj, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B5703672629416386538(Object obj, Object obj2, Object obj3, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B5703672629416386538(byte b, R4833348786910499294 r4833348786910499294, Object obj, Object obj2, boolean z) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = obj2;
        this.w = obj;
    }
}
