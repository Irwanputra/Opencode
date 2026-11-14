package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import dev.epro.r0.C7584963549263810245;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.E4951175994894594588;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.H14305894327539119220;
import dev.epro.r0.J8109720887967463919;
import dev.epro.r0.K15572083692188606544;
import dev.epro.r0.L622219180424329983;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P9893650590651797888;
import dev.epro.r0.R4890209015164086160;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S11564727846197427291;
import dev.epro.r0.S2322588539201815831;
import dev.epro.r0.S8064361206571326475;
import dev.epro.r0.W17538889179347911592;
import dev.epro.r0.Y12531765857967015337;
import dev.epro.r0.Z115818233709597990;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetProvider;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ao extends P9893650590651797888 implements F4096073349764486348 {
    public static final ao a;
    public static final ao a$1;
    public static final ao a$10;
    public static final ao a$11;
    public static final ao a$12;
    public static final ao a$13;
    public static final ao a$14;
    public static final ao a$15;
    public static final ao a$16;
    public static final ao a$17;
    public static final ao a$18;
    public static final ao a$19;
    public static final ao a$2;
    public static final ao a$20;
    public static final ao a$21;
    public static final ao a$22;
    public static final ao a$23;
    public static final ao a$24;
    public static final ao a$25;
    public static final ao a$26;
    public static final ao a$3;
    public static final ao a$4;
    public static final ao a$5;
    public static final ao a$6;
    public static final ao a$7;
    public static final ao a$8;
    public static final ao a$9;
    public final /* synthetic */ byte i;

    static {
        int i = 1;
        a = new ao(i, (byte) 0);
        a$1 = new ao(i, (byte) 1);
        a$2 = new ao(i, (byte) 2);
        a$3 = new ao(i, (byte) 3);
        a$4 = new ao(i, (byte) 4);
        a$5 = new ao(i, (byte) 5);
        a$6 = new ao(i, (byte) 6);
        a$7 = new ao(i, (byte) 7);
        a$8 = new ao(i, (byte) 8);
        a$9 = new ao(i, (byte) 9);
        a$10 = new ao(i, (byte) 10);
        a$11 = new ao(i, (byte) 11);
        a$12 = new ao(i, (byte) 12);
        a$13 = new ao(i, (byte) 13);
        a$14 = new ao(i, (byte) 14);
        a$15 = new ao(i, (byte) 15);
        a$16 = new ao(i, (byte) 16);
        a$17 = new ao(i, (byte) 17);
        a$18 = new ao(i, (byte) 18);
        a$19 = new ao(i, (byte) 19);
        a$20 = new ao(i, (byte) 20);
        a$21 = new ao(i, (byte) 21);
        a$22 = new ao(i, (byte) 22);
        a$23 = new ao(i, (byte) 23);
        a$24 = new ao(i, (byte) 24);
        a$25 = new ao(i, (byte) 25);
        a$26 = new ao(i, (byte) 26);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao(int i, byte b) {
        super(i);
        this.i = b;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                K15572083692188606544 k15572083692188606544 = (K15572083692188606544) obj;
                k15572083692188606544.getClass();
                E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                return new E17093345031926825464(M9216324016624295870.Z(k15572083692188606544.j(), N13798149404328803870.MILLISECONDS));
            case 1:
                K15572083692188606544 k155720836921886065442 = (K15572083692188606544) obj;
                k155720836921886065442.getClass();
                E17149812035295265804 e171498120352952658042 = E17093345031926825464.b;
                return new E17093345031926825464(M9216324016624295870.Z(k155720836921886065442.j(), N13798149404328803870.MINUTES));
            case 2:
                K15572083692188606544 k155720836921886065443 = (K15572083692188606544) obj;
                k155720836921886065443.getClass();
                E17149812035295265804 e171498120352952658043 = E17093345031926825464.b;
                return new E17093345031926825464(M9216324016624295870.Z(k155720836921886065443.j(), N13798149404328803870.SECONDS));
            case 3:
                K15572083692188606544 k155720836921886065444 = (K15572083692188606544) obj;
                k155720836921886065444.getClass();
                String strP = k155720836921886065444.p();
                strP.getClass();
                return M8927913404651150384.p0(strP, new String[]{";"}, 6);
            case 4:
                return Boolean.valueOf(S10823041268949770285.t(((CronetProvider) obj).getName(), "Google-Play-Services-Cronet-Provider"));
            case 5:
                return Boolean.valueOf(((p31) obj) == null);
            case 6:
                K15572083692188606544 k155720836921886065445 = (K15572083692188606544) obj;
                k155720836921886065445.getClass();
                String strP2 = k155720836921886065445.p();
                strP2.getClass();
                return strP2;
            case 7:
                K15572083692188606544 k155720836921886065446 = (K15572083692188606544) obj;
                k155720836921886065446.getClass();
                H14305894327539119220 h14305894327539119220 = k155720836921886065446.l().a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(E4951175994894594588.u0(h14305894327539119220.d));
                Iterator it = ((S11564727846197427291) h14305894327539119220.entrySet()).iterator();
                while (((L622219180424329983) it).hasNext()) {
                    S8064361206571326475 s8064361206571326475A = ((L622219180424329983) it).a();
                    linkedHashMap.put(s8064361206571326475A.getKey(), ((K15572083692188606544) s8064361206571326475A.getValue()).p());
                }
                return linkedHashMap;
            case 8:
                g1 g1Var = (g1) obj;
                g1Var.getClass();
                Collection collectionValues = g1Var.u().values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    return g1Var;
                }
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    Collection collectionValues2 = ((vr0) it2.next()).o().values();
                    if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                        Iterator it3 = collectionValues2.iterator();
                        while (it3.hasNext()) {
                            O6641393078261985068 o6641393078261985068R = ((g6) it3.next()).r();
                            o6641393078261985068R.getClass();
                            if (!o6641393078261985068R.isEmpty()) {
                                Iterator<E> it4 = o6641393078261985068R.iterator();
                                while (it4.hasNext()) {
                                    if (((b6) it4.next()).r$1() != 2) {
                                        S2322588539201815831 s2322588539201815831 = (S2322588539201815831) g1Var.n();
                                        Map mapE = s2322588539201815831.e();
                                        mapE.getClass();
                                        for (String str : R9411874267597469228.d1(new R4890209015164086160(mapE.keySet()))) {
                                            Map mapE2 = s2322588539201815831.e();
                                            mapE2.getClass();
                                            vr0 vr0Var = (vr0) mapE2.get(str);
                                            if (vr0Var != null) {
                                                s2322588539201815831.e().getClass();
                                                C7584963549263810245 c7584963549263810245 = (C7584963549263810245) vr0Var.n();
                                                Map mapE3 = c7584963549263810245.e();
                                                mapE3.getClass();
                                                for (String str2 : R9411874267597469228.d1(new R4890209015164086160(mapE3.keySet()))) {
                                                    Map mapE4 = c7584963549263810245.e();
                                                    mapE4.getClass();
                                                    g6 g6Var = (g6) mapE4.get(str2);
                                                    if (g6Var != null) {
                                                        c7584963549263810245.e().getClass();
                                                        Y12531765857967015337 y12531765857967015337 = (Y12531765857967015337) g6Var.n();
                                                        List listF = y12531765857967015337.f();
                                                        listF.getClass();
                                                        Iterator it5 = listF.iterator();
                                                        it5.getClass();
                                                        int i = 0;
                                                        while (it5.hasNext()) {
                                                            int i2 = i + 1;
                                                            b6 b6Var = (b6) it5.next();
                                                            if (b6Var.r$1() != 2) {
                                                                y12531765857967015337.f().getClass();
                                                                W17538889179347911592 w17538889179347911592 = (W17538889179347911592) b6Var.n();
                                                                w17538889179347911592.c(2);
                                                                b6 b6Var2 = (b6) w17538889179347911592.a();
                                                                y12531765857967015337.b();
                                                                ((g6) y12531765857967015337.b).a(i, b6Var2);
                                                            }
                                                            i = i2;
                                                        }
                                                        g6 g6Var2 = (g6) y12531765857967015337.a();
                                                        str2.getClass();
                                                        c7584963549263810245.d(str2, g6Var2);
                                                    }
                                                }
                                                vr0 vr0Var2 = (vr0) c7584963549263810245.a();
                                                str.getClass();
                                                s2322588539201815831.d(str, vr0Var2);
                                            }
                                        }
                                        return (g1) s2322588539201815831.a();
                                    }
                                }
                            }
                        }
                    }
                }
                return g1Var;
            case 9:
                String str3 = (String) obj;
                return Boolean.valueOf(!(str3 == null || str3.length() == 0));
            case 10:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 11:
                K15572083692188606544 k155720836921886065447 = (K15572083692188606544) obj;
                k155720836921886065447.getClass();
                return Boolean.valueOf(k155720836921886065447.b());
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() + ":" + entry.getValue();
            case 13:
                K15572083692188606544 k155720836921886065448 = (K15572083692188606544) obj;
                k155720836921886065448.getClass();
                E17149812035295265804 e171498120352952658044 = E17093345031926825464.b;
                return new E17093345031926825464(M9216324016624295870.Z(k155720836921886065448.j(), N13798149404328803870.DAYS));
            case 14:
                K15572083692188606544 k155720836921886065449 = (K15572083692188606544) obj;
                k155720836921886065449.getClass();
                return Double.valueOf(k155720836921886065449.c());
            case 15:
                K15572083692188606544 k1557208369218860654410 = (K15572083692188606544) obj;
                k1557208369218860654410.getClass();
                H14305894327539119220 h143058943275391192202 = k1557208369218860654410.l().a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(E4951175994894594588.u0(h143058943275391192202.d));
                Iterator it6 = ((S11564727846197427291) h143058943275391192202.entrySet()).iterator();
                while (((L622219180424329983) it6).hasNext()) {
                    S8064361206571326475 s8064361206571326475A2 = ((L622219180424329983) it6).a();
                    linkedHashMap2.put(s8064361206571326475A2.getKey(), Double.valueOf(((K15572083692188606544) s8064361206571326475A2.getValue()).c()));
                }
                return linkedHashMap2;
            case 16:
                p60 p60Var = (p60) obj;
                p60Var.getClass();
                long jG = E17093345031926825464.g(p60Var.c, p60Var.b.b);
                return p60Var.a + "." + E17093345031926825464.e(jG);
            case 17:
                K15572083692188606544 k1557208369218860654411 = (K15572083692188606544) obj;
                k1557208369218860654411.getClass();
                return Float.valueOf(k1557208369218860654411.i());
            case 18:
                K15572083692188606544 k1557208369218860654412 = (K15572083692188606544) obj;
                k1557208369218860654412.getClass();
                return Integer.valueOf(k1557208369218860654412.j());
            case 19:
                K15572083692188606544 k1557208369218860654413 = (K15572083692188606544) obj;
                k1557208369218860654413.getClass();
                String strP3 = k1557208369218860654413.p();
                strP3.getClass();
                List listP0 = M8927913404651150384.p0(strP3, new String[]{","}, 6);
                ArrayList arrayList = new ArrayList(Z115818233709597990.k0(listP0, 10));
                Iterator it7 = listP0.iterator();
                while (it7.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it7.next())));
                }
                return arrayList;
            case 20:
                od1 od1Var = (od1) obj;
                od1Var.getClass();
                return new ls1(od1Var);
            case 21:
                ((g1) obj).getClass();
                g1 g1VarQ = g1.q();
                g1VarQ.getClass();
                return g1VarQ;
            case 22:
                K15572083692188606544 k1557208369218860654414 = (K15572083692188606544) obj;
                k1557208369218860654414.getClass();
                return k1557208369218860654414.l();
            case 23:
                K15572083692188606544 k1557208369218860654415 = (K15572083692188606544) obj;
                k1557208369218860654415.getClass();
                String strP4 = k1557208369218860654415.p();
                strP4.getClass();
                return M8927913404651150384.p0(strP4, new String[]{","}, 6);
            case 24:
                InternalNativeAd internalNativeAd = (InternalNativeAd) obj;
                internalNativeAd.getClass();
                return new ms1(internalNativeAd);
            case 25:
                s43 s43Var = (s43) obj;
                s43Var.getClass();
                J8109720887967463919 j8109720887967463919 = s43Var.a;
                j8109720887967463919.b();
                k43 k43Var = (k43) j8109720887967463919.b;
                k43Var.bitField0_ |= 1;
                k43Var.isInstallReferrerReported_ = true;
                return O9245300239821758723.a;
            default:
                K15572083692188606544 k1557208369218860654416 = (K15572083692188606544) obj;
                k1557208369218860654416.getClass();
                return Long.valueOf(k1557208369218860654416.n());
        }
    }
}
