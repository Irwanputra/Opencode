package dev.epro.r0;

import android.graphics.Path;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class C9869900372345142877 {
    public static final T15443218846549482730 a;
    public static final T15443218846549482730 b;
    public static final Q9435736031653407531 c;
    public static final Q9435736031653407531 d;
    public static final Q9435736031653407531 e;
    public static final Q9435736031653407531 f;
    public static final float[] g;
    public static final D14731132657808549702 h;
    public static final Z14997871575210439922 i;
    public static Z7022156542152740569 j;
    public static Z7022156542152740569 k;

    public static final Integer A(S2509933476155449112 s2509933476155449112, Y5209789131793062978 y5209789131793062978, int i2, int i3) {
        Integer numA;
        int[] iArr = s2509933476155449112.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (s2509933476155449112.j(i2) && s2509933476155449112.i(i2) == 206 && S10823041268949770285.t(s2509933476155449112.p(iArr, i2), N2332913310205178802.e)) {
                Object objH = s2509933476155449112.h(i2, 0);
                F819643558874997944 f819643558874997944 = objH instanceof F819643558874997944 ? (F819643558874997944) objH : null;
                Z4972949040470868463 z4972949040470868463 = f819643558874997944 != null ? f819643558874997944.a : null;
                Z4695029197663506711 z4695029197663506711 = z4972949040470868463 instanceof Z4695029197663506711 ? (Z4695029197663506711) z4972949040470868463 : null;
                if (z4695029197663506711 != null && z4695029197663506711.a == y5209789131793062978) {
                    return Integer.valueOf(i2);
                }
            }
            if (s2509933476155449112.d(i2) && (numA = A(s2509933476155449112, y5209789131793062978, i2 + 1, i4)) != null) {
                return Integer.valueOf(numA.intValue());
            }
            i2 = i4;
        }
    }

    public static Q5325817201536810897 B(int i2) {
        Y16078568748172315946 y16078568748172315946 = Y16078568748172315946.k;
        float fT = K5751602218013079365.T((i2 >> 16) & 255);
        float fT2 = K5751602218013079365.T((i2 >> 8) & 255);
        float fT3 = K5751602218013079365.T(i2 & 255);
        double[][] dArr = K5751602218013079365.e;
        double d2 = fT;
        double[] dArr2 = dArr[0];
        double d3 = fT2;
        double d4 = fT3;
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d5, (float) d6, (float) ((d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]))};
        float[][] fArr2 = K5751602218013079365.b;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float[] fArr6 = y16078568748172315946.g;
        float f10 = y16078568748172315946.e;
        float f11 = y16078568748172315946.b;
        float f12 = fArr6[0] * f7;
        float f13 = fArr6[1] * f8;
        float f14 = fArr6[2] * f9;
        float f15 = y16078568748172315946.h;
        float fPow = (float) Math.pow((Math.abs(f12) * f15) / 100.0f, 0.41999998688697815d);
        float fPow2 = (float) Math.pow((Math.abs(f13) * f15) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) Math.pow((Math.abs(f14) * f15) / 100.0f, 0.41999998688697815d);
        float fSignum = ((Math.signum(f12) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f13) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float f16 = ((((-12.0f) * fSignum2) + (fSignum * 11.0f)) + fSignum3) / 11.0f;
        float f17 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
        float f18 = fSignum2 * 20.0f;
        float f19 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f18)) / 20.0f;
        float f20 = (((fSignum * 40.0f) + f18) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = fAtan2;
        float f22 = (f21 * 3.1415927f) / 180.0f;
        float fPow4 = ((float) Math.pow((f20 * y16078568748172315946.c) / f11, y16078568748172315946.j * f10)) * 100.0f;
        float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * y16078568748172315946.f) * y16078568748172315946.d) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, y16078568748172315946.a)), 0.7300000190734863d)) * ((float) Math.sqrt(fPow4 / 100.0f));
        float f23 = y16078568748172315946.i * fPow5;
        Math.sqrt((r2 * f10) / (f11 + 4.0f));
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f22;
        return new Q5325817201536810897(f21, fPow5, fPow4, f24, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    public static Q5325817201536810897 C(float f2, float f3, float f4) {
        float f5 = Y16078568748172315946.k.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(((double) f2) / 100.0d))) * r0.e) / (r0.b + 4.0f));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((((double) f5) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new Q5325817201536810897(f4, f3, f2, f6, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static final J12043550928838212009 D(E14944621269592904532 e14944621269592904532, G8001132634698687269 g8001132634698687269, int i2, T1542296375665870064 t1542296375665870064) {
        return ((i2 == 0 || i2 == -3) && t1542296375665870064 == T1542296375665870064.a) ? e14944621269592904532 : new N11664146429654385606(i2, t1542296375665870064, g8001132634698687269, e14944621269592904532);
    }

    public static final native int E(A8761903641619985212 a8761903641619985212);

    public static E6969320725925327626 F(J3745674191043464657 j3745674191043464657) {
        E6969320725925327626 e6969320725925327626 = j3745674191043464657.l0;
        if (e6969320725925327626 != null) {
            return e6969320725925327626;
        }
        long jD = J5654975781851244064.d(j3745674191043464657, E12775674050813925581.m);
        long jD2 = J5654975781851244064.d(j3745674191043464657, E12775674050813925581.p);
        long jD3 = J5654975781851244064.d(j3745674191043464657, E12775674050813925581.n);
        Y4261039727803185691 y4261039727803185691 = E12775674050813925581.q;
        long jD4 = J5654975781851244064.d(j3745674191043464657, y4261039727803185691);
        Y4261039727803185691 y42610397278031856912 = E12775674050813925581.r;
        E6969320725925327626 e69693207259253276262 = new E6969320725925327626(jD, jD2, jD3, jD4, J5654975781851244064.d(j3745674191043464657, y42610397278031856912), U10174709222559481877.b(0.38f, J5654975781851244064.d(j3745674191043464657, y4261039727803185691)), U10174709222559481877.b(0.38f, J5654975781851244064.d(j3745674191043464657, y42610397278031856912)));
        j3745674191043464657.l0 = e69693207259253276262;
        return e69693207259253276262;
    }

    public static final float G(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final Z7022156542152740569 H() {
        Z7022156542152740569 z7022156542152740569 = k;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new K11581048818582425500(7.41f, 15.41f));
        arrayList.add(new N18337357316239809325(12.0f, 10.83f));
        arrayList.add(new T8070361472955532362(4.59f, 4.58f));
        arrayList.add(new N18337357316239809325(18.0f, 14.0f));
        arrayList.add(new T8070361472955532362(-6.0f, -6.0f));
        arrayList.add(new T8070361472955532362(-6.0f, 6.0f));
        arrayList.add(new T8070361472955532362(1.41f, 1.41f));
        arrayList.add(G18244342923164738699.c);
        Q17593287602150918564.a(q17593287602150918564, arrayList, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        k = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final void I(G8001132634698687269 g8001132634698687269, Throwable th) {
        try {
            G15142808377942141248 g15142808377942141248 = (G15142808377942141248) g8001132634698687269.get(B14824868959299866349.e);
            if (g15142808377942141248 != null) {
                g15142808377942141248.handleException(g8001132634698687269, th);
            } else {
                T18016951143603335921.R(g8001132634698687269, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                O8620973563946607355.m(runtimeException, th);
                th = runtimeException;
            }
            T18016951143603335921.R(g8001132634698687269, th);
        }
    }

    public static final native boolean J(Throwable th);

    public static final boolean K(long j2) {
        return (j2 & 2) != 0;
    }

    public static final boolean L(long j2) {
        return (j2 & 1) != 0;
    }

    public static final int[] M(int i2, List list) {
        int i3;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i4 < size) {
                iArr[i4] = J8045362843799184672.u0(((U10174709222559481877) list.get(i4)).a);
                i4++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i2];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i5 = 0;
        while (i4 < size3) {
            long j2 = ((U10174709222559481877) list.get(i4)).a;
            if (U10174709222559481877.c(j2) == 0.0f) {
                if (i4 == 0) {
                    i3 = i5 + 1;
                    iArr2[i5] = J8045362843799184672.u0(U10174709222559481877.b(0.0f, ((U10174709222559481877) list.get(1)).a));
                } else if (i4 == size2) {
                    i3 = i5 + 1;
                    iArr2[i5] = J8045362843799184672.u0(U10174709222559481877.b(0.0f, ((U10174709222559481877) list.get(i4 - 1)).a));
                } else {
                    int i6 = i5 + 1;
                    iArr2[i5] = J8045362843799184672.u0(U10174709222559481877.b(0.0f, ((U10174709222559481877) list.get(i4 - 1)).a));
                    i5 += 2;
                    iArr2[i6] = J8045362843799184672.u0(U10174709222559481877.b(0.0f, ((U10174709222559481877) list.get(i4 + 1)).a));
                }
                i5 = i3;
            } else {
                iArr2[i5] = J8045362843799184672.u0(j2);
                i5++;
            }
            i4++;
        }
        return iArr2;
    }

    public static final float[] N(List list, List list2, int i2) {
        if (i2 == 0) {
            if (list != null) {
                return R9411874267597469228.b1(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i2];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i3 = 1;
        for (int i4 = 1; i4 < size; i4++) {
            long j2 = ((U10174709222559481877) list2.get(i4)).a;
            float fFloatValue = list != null ? ((Number) list.get(i4)).floatValue() : i4 / (list2.size() - 1);
            int i5 = i3 + 1;
            fArr[i3] = fFloatValue;
            if (U10174709222559481877.c(j2) == 0.0f) {
                i3 += 2;
                fArr[i5] = fFloatValue;
            } else {
                i3 = i5;
            }
        }
        fArr[i3] = list != null ? ((Number) list.get(list2.size() - 1)).floatValue() : 1.0f;
        return fArr;
    }

    public static final I1722681268793429505 O(I1722681268793429505 i1722681268793429505, J13386303774951932313 j13386303774951932313, P13832034982779129365 p13832034982779129365) {
        return i1722681268793429505.Q0(new R2554522643585578519(j13386303774951932313, p13832034982779129365));
    }

    public static final native int P(int i2, String str, Map map);

    public static final void Q(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static final void R(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final String S(Object[] objArr, int i2, int i3, E2168127913664336368 e2168127913664336368) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == e2168127913664336368) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final E2931101495752331306 T(W3656598099029166611 w3656598099029166611, F4096073349764486348 f4096073349764486348, Object obj, M3727281027331139839 m3727281027331139839) {
        m3727281027331139839.Y(-422486566, w3656598099029166611);
        boolean zG = w3656598099029166611.g();
        L6855102173777462404 l6855102173777462404 = w3656598099029166611.a;
        E2931101495752331306 e2931101495752331306 = E2931101495752331306.c;
        E2931101495752331306 e29311014957523313062 = E2931101495752331306.b;
        E2931101495752331306 e29311014957523313063 = E2931101495752331306.a;
        if (zG) {
            m3727281027331139839.a0(-212166497);
            m3727281027331139839.q(false);
            if (((Boolean) f4096073349764486348.invoke(obj)).booleanValue()) {
                e2931101495752331306 = e29311014957523313062;
            } else if (!((Boolean) f4096073349764486348.invoke(l6855102173777462404.g())).booleanValue()) {
                e2931101495752331306 = e29311014957523313063;
            }
        } else {
            m3727281027331139839.a0(-211886815);
            Object objM = m3727281027331139839.M();
            if (objM == O9023047933786425027.a) {
                objM = V4416135141588678913.t(Boolean.FALSE);
                m3727281027331139839.k0(objM);
            }
            W1972671267364756056 w1972671267364756056 = (W1972671267364756056) objM;
            Object value = w3656598099029166611.e.getValue();
            if (((Boolean) f4096073349764486348.invoke(l6855102173777462404.g())).booleanValue() || (value != null && ((Boolean) f4096073349764486348.invoke(value)).booleanValue())) {
                w1972671267364756056.setValue(Boolean.TRUE);
            }
            if (((Boolean) f4096073349764486348.invoke(obj)).booleanValue()) {
                e2931101495752331306 = e29311014957523313062;
            } else if ((value != null && ((Boolean) f4096073349764486348.invoke(value)).booleanValue()) || !((Boolean) w1972671267364756056.getValue()).booleanValue()) {
                e2931101495752331306 = e29311014957523313063;
            }
            m3727281027331139839.q(false);
        }
        m3727281027331139839.q(false);
        return e2931101495752331306;
    }

    public static final native String U(List list);

    public static final native JSONObject V(K4472753555329313235 k4472753555329313235);

    public static final native K4472753555329313235 W(JSONObject jSONObject);

    public static final native List X(String str);

    public static final void Y(List list, B1061516154492673368 b1061516154492673368) {
        Path path;
        int i2;
        float f2;
        int i3;
        M458157582077333589 m458157582077333589;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        List list2 = list;
        B1061516154492673368 b10615161544926733682 = b1061516154492673368;
        Path path2 = b10615161544926733682.a;
        int i4 = path2.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        path2.rewind();
        b10615161544926733682.h(i4);
        M458157582077333589 m4581575820773335892 = list2.isEmpty() ? G18244342923164738699.c : (M458157582077333589) list2.get(0);
        int size = list2.size();
        float f13 = 0.0f;
        int i5 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (i5 < size) {
            M458157582077333589 m4581575820773335893 = (M458157582077333589) list2.get(i5);
            if (m4581575820773335893 instanceof G18244342923164738699) {
                path2.close();
                path = path2;
                i2 = size;
                f2 = f13;
                i3 = i5;
                m458157582077333589 = m4581575820773335893;
                f14 = f18;
                f16 = f14;
                f15 = f19;
                f17 = f15;
            } else {
                if (m4581575820773335893 instanceof I11903408704749660994) {
                    I11903408704749660994 i11903408704749660994 = (I11903408704749660994) m4581575820773335893;
                    float f20 = i11903408704749660994.c;
                    f16 += f20;
                    float f21 = i11903408704749660994.d;
                    f17 += f21;
                    path2.rMoveTo(f20, f21);
                    path = path2;
                    i2 = size;
                    f2 = f13;
                    i3 = i5;
                    f18 = f16;
                    f19 = f17;
                } else {
                    if (m4581575820773335893 instanceof K11581048818582425500) {
                        K11581048818582425500 k11581048818582425500 = (K11581048818582425500) m4581575820773335893;
                        float f22 = k11581048818582425500.c;
                        float f23 = k11581048818582425500.d;
                        path2.moveTo(f22, f23);
                        path = path2;
                        f17 = f23;
                        f19 = f17;
                        f16 = f22;
                        f18 = f16;
                    } else {
                        if (m4581575820773335893 instanceof T8070361472955532362) {
                            T8070361472955532362 t8070361472955532362 = (T8070361472955532362) m4581575820773335893;
                            float f24 = t8070361472955532362.d;
                            float f25 = t8070361472955532362.c;
                            path2.rLineTo(f25, f24);
                            f16 += f25;
                            f17 += f24;
                        } else if (m4581575820773335893 instanceof N18337357316239809325) {
                            N18337357316239809325 n18337357316239809325 = (N18337357316239809325) m4581575820773335893;
                            float f26 = n18337357316239809325.d;
                            float f27 = n18337357316239809325.c;
                            b10615161544926733682.e(f27, f26);
                            path = path2;
                            f16 = f27;
                            f17 = f26;
                        } else if (m4581575820773335893 instanceof B7853650354552420046) {
                            float f28 = ((B7853650354552420046) m4581575820773335893).c;
                            path2.rLineTo(f28, f13);
                            f16 += f28;
                        } else if (m4581575820773335893 instanceof D17019851967677288206) {
                            float f29 = ((D17019851967677288206) m4581575820773335893).c;
                            b10615161544926733682.e(f29, f17);
                            path = path2;
                            f16 = f29;
                        } else if (m4581575820773335893 instanceof I13705132866148191069) {
                            float f30 = ((I13705132866148191069) m4581575820773335893).c;
                            path2.rLineTo(f13, f30);
                            f17 += f30;
                        } else if (m4581575820773335893 instanceof Q5399713605274603679) {
                            float f31 = ((Q5399713605274603679) m4581575820773335893).c;
                            b10615161544926733682.e(f16, f31);
                            path = path2;
                            f17 = f31;
                        } else {
                            if (m4581575820773335893 instanceof L4997663793588871338) {
                                L4997663793588871338 l4997663793588871338 = (L4997663793588871338) m4581575820773335893;
                                path2.rCubicTo(l4997663793588871338.c, l4997663793588871338.d, l4997663793588871338.e, l4997663793588871338.f, l4997663793588871338.g, l4997663793588871338.h);
                                f5 = l4997663793588871338.e + f16;
                                f6 = l4997663793588871338.f + f17;
                                f16 += l4997663793588871338.g;
                                f12 = l4997663793588871338.h;
                            } else {
                                if (m4581575820773335893 instanceof Z17567843015568193876) {
                                    Z17567843015568193876 z17567843015568193876 = (Z17567843015568193876) m4581575820773335893;
                                    path2.cubicTo(z17567843015568193876.c, z17567843015568193876.d, z17567843015568193876.e, z17567843015568193876.f, z17567843015568193876.g, z17567843015568193876.h);
                                    f5 = z17567843015568193876.e;
                                    f7 = z17567843015568193876.f;
                                    f8 = z17567843015568193876.g;
                                    f9 = z17567843015568193876.h;
                                } else if (m4581575820773335893 instanceof A18382775279431935848) {
                                    if (m4581575820773335892.a) {
                                        f10 = f16 - f14;
                                        f11 = f17 - f15;
                                    } else {
                                        f10 = f13;
                                        f11 = f10;
                                    }
                                    A18382775279431935848 a18382775279431935848 = (A18382775279431935848) m4581575820773335893;
                                    path2.rCubicTo(f10, f11, a18382775279431935848.c, a18382775279431935848.d, a18382775279431935848.e, a18382775279431935848.f);
                                    f5 = a18382775279431935848.c + f16;
                                    f6 = a18382775279431935848.d + f17;
                                    f16 += a18382775279431935848.e;
                                    f12 = a18382775279431935848.f;
                                } else if (m4581575820773335893 instanceof W10599348388964801452) {
                                    if (m4581575820773335892.a) {
                                        f16 = (f16 * 2.0f) - f14;
                                        f17 = (2.0f * f17) - f15;
                                    }
                                    W10599348388964801452 w10599348388964801452 = (W10599348388964801452) m4581575820773335893;
                                    path2.cubicTo(f16, f17, w10599348388964801452.c, w10599348388964801452.d, w10599348388964801452.e, w10599348388964801452.f);
                                    f5 = w10599348388964801452.c;
                                    f7 = w10599348388964801452.d;
                                    f8 = w10599348388964801452.e;
                                    f9 = w10599348388964801452.f;
                                } else if (m4581575820773335893 instanceof W7068258593160713508) {
                                    W7068258593160713508 w7068258593160713508 = (W7068258593160713508) m4581575820773335893;
                                    float f32 = w7068258593160713508.f;
                                    float f33 = w7068258593160713508.e;
                                    float f34 = w7068258593160713508.d;
                                    float f35 = w7068258593160713508.c;
                                    path2.rQuadTo(f35, f34, f33, f32);
                                    float f36 = f35 + f16;
                                    float f37 = f34 + f17;
                                    f16 += f33;
                                    f17 += f32;
                                    path = path2;
                                    f14 = f36;
                                    f15 = f37;
                                } else if (m4581575820773335893 instanceof Z16746971161691315984) {
                                    Z16746971161691315984 z16746971161691315984 = (Z16746971161691315984) m4581575820773335893;
                                    float f38 = z16746971161691315984.f;
                                    float f39 = z16746971161691315984.e;
                                    float f40 = z16746971161691315984.d;
                                    f5 = z16746971161691315984.c;
                                    path2.quadTo(f5, f40, f39, f38);
                                    path = path2;
                                    f17 = f38;
                                    f16 = f39;
                                    f15 = f40;
                                    i2 = size;
                                    f2 = f13;
                                    i3 = i5;
                                    m458157582077333589 = m4581575820773335893;
                                    f14 = f5;
                                } else if (m4581575820773335893 instanceof L5971454542863557373) {
                                    if (m4581575820773335892.b) {
                                        f3 = f16 - f14;
                                        f4 = f17 - f15;
                                    } else {
                                        f3 = f13;
                                        f4 = f3;
                                    }
                                    L5971454542863557373 l5971454542863557373 = (L5971454542863557373) m4581575820773335893;
                                    float f41 = l5971454542863557373.d;
                                    float f42 = l5971454542863557373.c;
                                    path2.rQuadTo(f3, f4, f42, f41);
                                    f5 = f3 + f16;
                                    f6 = f4 + f17;
                                    f16 += f42;
                                    f17 += f41;
                                    path = path2;
                                    f15 = f6;
                                    i2 = size;
                                    f2 = f13;
                                    i3 = i5;
                                    m458157582077333589 = m4581575820773335893;
                                    f14 = f5;
                                } else if (m4581575820773335893 instanceof E2615348471706213756) {
                                    if (m4581575820773335892.b) {
                                        f16 = (f16 * 2.0f) - f14;
                                        f17 = (2.0f * f17) - f15;
                                    }
                                    E2615348471706213756 e2615348471706213756 = (E2615348471706213756) m4581575820773335893;
                                    float f43 = e2615348471706213756.d;
                                    float f44 = e2615348471706213756.c;
                                    path2.quadTo(f16, f17, f44, f43);
                                    path = path2;
                                    i2 = size;
                                    f2 = f13;
                                    i3 = i5;
                                    f15 = f17;
                                    m458157582077333589 = m4581575820773335893;
                                    f17 = f43;
                                    f14 = f16;
                                    f16 = f44;
                                } else if (m4581575820773335893 instanceof G9301606066247153606) {
                                    G9301606066247153606 g9301606066247153606 = (G9301606066247153606) m4581575820773335893;
                                    float f45 = g9301606066247153606.h + f16;
                                    float f46 = g9301606066247153606.i + f17;
                                    i2 = size;
                                    f2 = 0.0f;
                                    path = path2;
                                    i3 = i5;
                                    y(b1061516154492673368, f16, f17, f45, f46, g9301606066247153606.c, g9301606066247153606.d, g9301606066247153606.e, g9301606066247153606.f, g9301606066247153606.g);
                                    f14 = f45;
                                    f16 = f14;
                                    f15 = f46;
                                    f17 = f15;
                                    m458157582077333589 = m4581575820773335893;
                                } else {
                                    path = path2;
                                    i2 = size;
                                    f2 = f13;
                                    i3 = i5;
                                    if (!(m4581575820773335893 instanceof V13715822862871681502)) {
                                        Z3383101362411723454.g();
                                        return;
                                    }
                                    V13715822862871681502 v13715822862871681502 = (V13715822862871681502) m4581575820773335893;
                                    float f47 = v13715822862871681502.i;
                                    float f48 = v13715822862871681502.h;
                                    m458157582077333589 = m4581575820773335893;
                                    y(b1061516154492673368, f16, f17, f48, f47, v13715822862871681502.c, v13715822862871681502.d, v13715822862871681502.e, v13715822862871681502.f, v13715822862871681502.g);
                                    f15 = f47;
                                    f17 = f15;
                                    f14 = f48;
                                    f16 = f14;
                                }
                                path = path2;
                                f16 = f8;
                                f17 = f9;
                                i2 = size;
                                f2 = f13;
                                i3 = i5;
                                m458157582077333589 = m4581575820773335893;
                                f15 = f7;
                                f14 = f5;
                            }
                            f17 += f12;
                            path = path2;
                            f15 = f6;
                            i2 = size;
                            f2 = f13;
                            i3 = i5;
                            m458157582077333589 = m4581575820773335893;
                            f14 = f5;
                        }
                        path = path2;
                    }
                    i2 = size;
                    f2 = f13;
                    i3 = i5;
                }
                m458157582077333589 = m4581575820773335893;
            }
            i5 = i3 + 1;
            list2 = list;
            b10615161544926733682 = b1061516154492673368;
            size = i2;
            path2 = path;
            m4581575820773335892 = m458157582077333589;
            f13 = f2;
        }
    }

    public static final long[] Z(List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = R7033599853981556291.Z(((U10174709222559481877) list.get(i2)).a);
        }
        return jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0590 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0865  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(dev.epro.r0.W3656598099029166611 r31, dev.epro.r0.F4096073349764486348 r32, dev.epro.r0.I1722681268793429505 r33, dev.epro.r0.Z5580852631924387145 r34, dev.epro.r0.J2232875916072654838 r35, dev.epro.r0.L12639328004344855510 r36, dev.epro.r0.J12078565427869724451 r37, dev.epro.r0.M3727281027331139839 r38, int r39) {
        /*
            Method dump skipped, instruction units count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C9869900372345142877.a(dev.epro.r0.W3656598099029166611, dev.epro.r0.F4096073349764486348, dev.epro.r0.I1722681268793429505, dev.epro.r0.Z5580852631924387145, dev.epro.r0.J2232875916072654838, dev.epro.r0.L12639328004344855510, dev.epro.r0.J12078565427869724451, dev.epro.r0.M3727281027331139839, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dev.epro.r0.L6855102173777462404, dev.epro.r0.S10479950654634216925] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList a0(S2509933476155449112 s2509933476155449112, int i2, Integer num) {
        ?? s10479950654634216925 = new S10479950654634216925(s2509933476155449112);
        int iQ = s2509933476155449112.q(i2);
        M7798980774515057476 m7798980774515057476A = s2509933476155449112.a(i2);
        while (i2 >= 0) {
            s10479950654634216925.j(s2509933476155449112.i(i2), s2509933476155449112.k(i2) ? s2509933476155449112.p(s2509933476155449112.b, i2) : O9023047933786425027.a, s2509933476155449112.a.m(i2), num);
            if (iQ >= 0) {
                M7798980774515057476 m7798980774515057476 = m7798980774515057476A;
                m7798980774515057476A = s2509933476155449112.a(iQ);
                i2 = iQ;
                iQ = s2509933476155449112.q(iQ);
                num = m7798980774515057476;
            } else {
                i2 = iQ;
                num = m7798980774515057476A;
            }
        }
        return (ArrayList) s10479950654634216925.a;
    }

    public static final void b(H9704280198787029462 h9704280198787029462, boolean z, I1722681268793429505 i1722681268793429505, Z5580852631924387145 z5580852631924387145, J2232875916072654838 j2232875916072654838, String str, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        I1722681268793429505 i17226812687934295052;
        String str2;
        m3727281027331139839.b0(1799879339);
        if ((i2 & 48) == 0) {
            i3 = (m3727281027331139839.g(z) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= m3727281027331139839.f(z5580852631924387145) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= m3727281027331139839.f(j2232875916072654838) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            i5 |= m3727281027331139839.h(t15443218846549482730) ? 1048576 : 524288;
        }
        if (m3727281027331139839.R(i5 & 1, (599185 & i5) != 599184)) {
            W3656598099029166611 w3656598099029166611M = V933048422416352811.M(Boolean.valueOf(z), "AnimatedVisibility", m3727281027331139839, ((i5 >> 3) & 14) | ((i5 >> 12) & 112), 0);
            Object objM = m3727281027331139839.M();
            if (objM == O9023047933786425027.a) {
                objM = J6249063375258466235.n;
                m3727281027331139839.k0(objM);
            }
            V10993962107938880611 v10993962107938880611 = V10993962107938880611.a;
            e(w3656598099029166611M, (F4096073349764486348) objM, v10993962107938880611, z5580852631924387145, j2232875916072654838, t15443218846549482730, m3727281027331139839, (i5 & 3670016) | (i5 & 896) | 48 | (i5 & 7168) | (57344 & i5));
            i17226812687934295052 = v10993962107938880611;
            str2 = "AnimatedVisibility";
        } else {
            m3727281027331139839.U();
            i17226812687934295052 = i1722681268793429505;
            str2 = str;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new P685158272982698400(h9704280198787029462, z, i17226812687934295052, z5580852631924387145, j2232875916072654838, str2, t15443218846549482730, i2);
        }
    }

    public static final CharSequence b0(CharSequence charSequence) {
        return charSequence.length() <= 5000 ? charSequence : (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? M8927913404651150384.A0(charSequence, 4999) : M8927913404651150384.A0(charSequence, 5000);
    }

    public static final void c(boolean z, I1722681268793429505 i1722681268793429505, Z5580852631924387145 z5580852631924387145, J2232875916072654838 j2232875916072654838, String str, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        I1722681268793429505 i17226812687934295052;
        String str2;
        m3727281027331139839.b0(234057107);
        int i3 = i2 | (m3727281027331139839.g(z) ? 32 : 16) | 384 | (m3727281027331139839.f(z5580852631924387145) ? 2048 : 1024) | (m3727281027331139839.f(j2232875916072654838) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | 196608;
        if (m3727281027331139839.R(i3 & 1, (599185 & i3) != 599184)) {
            W3656598099029166611 w3656598099029166611M = V933048422416352811.M(Boolean.valueOf(z), "AnimatedVisibility", m3727281027331139839, ((i3 >> 3) & 14) | 48, 0);
            Object objM = m3727281027331139839.M();
            if (objM == O9023047933786425027.a) {
                objM = J6249063375258466235.m;
                m3727281027331139839.k0(objM);
            }
            V10993962107938880611 v10993962107938880611 = V10993962107938880611.a;
            e(w3656598099029166611M, (F4096073349764486348) objM, v10993962107938880611, z5580852631924387145, j2232875916072654838, t15443218846549482730, m3727281027331139839, (i3 & 57344) | (i3 & 7168) | 432 | 1572864);
            i17226812687934295052 = v10993962107938880611;
            str2 = "AnimatedVisibility";
        } else {
            m3727281027331139839.U();
            i17226812687934295052 = i1722681268793429505;
            str2 = str;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new M7730611467783716050(z, i17226812687934295052, z5580852631924387145, j2232875916072654838, str2, t15443218846549482730, i2);
        }
    }

    public static final void c0(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            S10973172697741180971.j("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            S10973172697741180971.j("colors and colorStops arguments must have equal length.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r16, dev.epro.r0.I1722681268793429505 r17, dev.epro.r0.Z5580852631924387145 r18, dev.epro.r0.J2232875916072654838 r19, java.lang.String r20, dev.epro.r0.J12078565427869724451 r21, dev.epro.r0.M3727281027331139839 r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C9869900372345142877.d(boolean, dev.epro.r0.I1722681268793429505, dev.epro.r0.Z5580852631924387145, dev.epro.r0.J2232875916072654838, java.lang.String, dev.epro.r0.J12078565427869724451, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final native void d0(Map map, N5407556009060208754 n5407556009060208754);

    public static final void e(W3656598099029166611 w3656598099029166611, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, Z5580852631924387145 z5580852631924387145, J2232875916072654838 j2232875916072654838, J12078565427869724451 j12078565427869724451, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        Z5580852631924387145 z55808526319243871452;
        J2232875916072654838 j22328759160726548382;
        J12078565427869724451 j120785654278697244512;
        m3727281027331139839.b0(-497872534);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(w3656598099029166611) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(f4096073349764486348) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z55808526319243871452 = z5580852631924387145;
            i3 |= m3727281027331139839.f(z55808526319243871452) ? 2048 : 1024;
        } else {
            z55808526319243871452 = z5580852631924387145;
        }
        if ((i2 & 24576) == 0) {
            j22328759160726548382 = j2232875916072654838;
            i3 |= m3727281027331139839.f(j22328759160726548382) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        } else {
            j22328759160726548382 = j2232875916072654838;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            j120785654278697244512 = j12078565427869724451;
            i4 |= m3727281027331139839.h(j120785654278697244512) ? 1048576 : 524288;
        } else {
            j120785654278697244512 = j12078565427869724451;
        }
        if (m3727281027331139839.R(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z = (i5 == 32) | (i6 == 4);
            Object objM = m3727281027331139839.M();
            E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
            if (z || objM == e17149812035295265804) {
                objM = new F6018700727884056047(f4096073349764486348, w3656598099029166611);
                m3727281027331139839.k0(objM);
            }
            I1722681268793429505 i1722681268793429505C = I3887072968740112330.C(i1722681268793429505, (J12078565427869724451) objM);
            Object objM2 = m3727281027331139839.M();
            if (objM2 == e17149812035295265804) {
                objM2 = N6628307372799615376.k;
                m3727281027331139839.k0(objM2);
            }
            int i7 = 196608 | i6 | i5 | (i4 & 7168) | (57344 & i4);
            int i8 = i4 << 6;
            a(w3656598099029166611, f4096073349764486348, i1722681268793429505C, z55808526319243871452, j22328759160726548382, (L12639328004344855510) objM2, j120785654278697244512, m3727281027331139839, i7 | (29360128 & i8) | (i8 & 234881024));
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new M11684960389562544645(w3656598099029166611, f4096073349764486348, i1722681268793429505, z5580852631924387145, j2232875916072654838, j12078565427869724451, i2);
        }
    }

    public static final native void f(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, V1619459738679112388 v1619459738679112388, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void g(Long l, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, boolean z, String str, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void h(Long l, long j2, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final B18437066071346442440 i(int i2, int i3, T1542296375665870064 t1542296375665870064) {
        if (i2 < 0) {
            S10973172697741180971.i(G6547577305291411977.n(i2, "replay cannot be negative, but was "));
            return null;
        }
        if (i3 < 0) {
            S10973172697741180971.i(G6547577305291411977.n(i3, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i2 <= 0 && i3 <= 0 && t1542296375665870064 != T1542296375665870064.a) {
            Z3383101362411723454.l("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", t1542296375665870064);
            return null;
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new B18437066071346442440(i2, i4, t1542296375665870064);
    }

    public static /* synthetic */ B18437066071346442440 j(int i2, int i3, T1542296375665870064 t1542296375665870064, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            t1542296375665870064 = T1542296375665870064.a;
        }
        return i(i2, i3, t1542296375665870064);
    }

    public static final native void k(String str, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(L5257209402530789314 l5257209402530789314, String str, String str2, String str3, String str4, boolean z, boolean z2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, F4096073349764486348 f40960733497644863485, B13729205492206812220 b13729205492206812220, int i2, Integer num, List list, float f2, boolean z3, boolean z4, Integer num2, M3727281027331139839 m3727281027331139839, int i3, int i4, int i5, int i6);

    public static final native void m(String str, String str2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, B13729205492206812220 b13729205492206812220, List list, Integer num, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n(Q3156151770218362234 q3156151770218362234, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(boolean z, F4096073349764486348 f4096073349764486348, Integer num, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [dev.epro.r0.L6855102173777462404, dev.epro.r0.S10479950654634216925] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [dev.epro.r0.M7798980774515057476] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List p(K15438463641018513946 k15438463641018513946, Integer num, int i2, Integer num2) {
        int iF;
        int iR;
        U9803441765912152712 u9803441765912152712;
        if (k15438463641018513946.w || k15438463641018513946.o() == 0) {
            return O2161699089510411363.a;
        }
        ?? s10479950654634216925 = new S10479950654634216925(k15438463641018513946);
        if (num2 != null) {
            iF = num2.intValue();
        } else {
            iF = k15438463641018513946.v;
            if (iF < 0) {
                iF = k15438463641018513946.F(k15438463641018513946.b, i2);
            }
        }
        if (num == 0) {
            int iO = k15438463641018513946.i - k15438463641018513946.O(k15438463641018513946.b, k15438463641018513946.q(i2));
            Q9908018528090167751 q9908018528090167751 = k15438463641018513946.s;
            num = Integer.valueOf(iO + ((q9908018528090167751 == null || (u9803441765912152712 = (U9803441765912152712) q9908018528090167751.b(i2)) == null) ? 0 : u9803441765912152712.b));
        }
        int iQ = k15438463641018513946.q(i2) * 5;
        int[] iArr = k15438463641018513946.b;
        if (iQ < iArr.length) {
            iR = k15438463641018513946.r(i2);
        } else {
            int iF2 = iF >= 0 ? k15438463641018513946.F(iArr, iF) : iF;
            iR = k15438463641018513946.r(iF);
            int i3 = iF;
            iF = iF2;
            i2 = i3;
        }
        while (i2 >= 0) {
            s10479950654634216925.j(iR, (k15438463641018513946.b[(k15438463641018513946.q(i2) * 5) + 1] & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? k15438463641018513946.s(i2) : O9023047933786425027.a, k15438463641018513946.P(i2), num);
            num = k15438463641018513946.b(i2);
            if (iF >= 0) {
                int iF3 = k15438463641018513946.F(k15438463641018513946.b, iF);
                iR = k15438463641018513946.r(iF);
                int i4 = iF;
                iF = iF3;
                i2 = i4;
            } else {
                i2 = iF;
            }
        }
        return (ArrayList) s10479950654634216925.a;
    }

    public static void q(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            D11988991656201568495.i(i4, E12098517352909843120.p(i2, i3, "startIndex: ", ", endIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            S10973172697741180971.j(E12098517352909843120.l("startIndex: ", i2, i3, " > endIndex: "));
        }
    }

    public static void r(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            D11988991656201568495.i(i4, E12098517352909843120.p(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            S10973172697741180971.j(E12098517352909843120.l("fromIndex: ", i2, i3, " > toIndex: "));
        }
    }

    public static final int s(long j2, long j3) {
        boolean zL = L(j2);
        if (zL != L(j3)) {
            return zL ? -1 : 1;
        }
        return (Math.min(G(j2), G(j3)) >= 0.0f && K(j2) != K(j3)) ? K(j2) ? -1 : 1 : (int) Math.signum(G(j2) - G(j3));
    }

    public static final int t(List list) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int size = list.size() - 1;
        for (int i3 = 1; i3 < size; i3++) {
            if (U10174709222559481877.c(((U10174709222559481877) list.get(i3)).a) == 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static Q13169198992966610970 u(int i2) {
        return i2 != 0 ? i2 != 1 ? new Z17967803306442720428() : new G12608838369651811912() : new Z17967803306442720428();
    }

    public static final S9528220297869212846 v(J196785984016436306 j196785984016436306, String[] strArr, F4096073349764486348 f4096073349764486348) {
        H9390398899829886498 h9390398899829886498;
        Q11096631689211733349 q11096631689211733349G = j196785984016436306.g();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        J16088445080955867036 j16088445080955867036 = q11096631689211733349G.b;
        j16088445080955867036.getClass();
        H1358060654748692575 h1358060654748692575 = new H1358060654748692575();
        int i2 = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = j16088445080955867036.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                h1358060654748692575.addAll(set);
            } else {
                h1358060654748692575.add(str);
            }
        }
        String[] strArr3 = (String[]) T8598786036980488824.d(h1358060654748692575).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i2 >= length) {
                h9390398899829886498 = new H9390398899829886498(strArr3, iArr);
                break;
            }
            String str2 = strArr3[i2];
            LinkedHashMap linkedHashMap2 = j16088445080955867036.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                S10973172697741180971.j("There is no table with name ".concat(str2));
                h9390398899829886498 = null;
                break;
            }
            iArr[i2] = num.intValue();
            i2++;
        }
        String[] strArr4 = (String[]) h9390398899829886498.a;
        int[] iArr2 = (int[]) h9390398899829886498.b;
        strArr4.getClass();
        iArr2.getClass();
        return new S9528220297869212846(U16229988784104357932.y(new G6219617120344415229(new J13979756969328643311((Object) j16088445080955867036, (Object) iArr2, (Object) strArr4, (R4833348786910499294) null, (byte) 12), (byte) 5), -1), j196785984016436306, f4096073349764486348, (byte) 1);
    }

    public static final native N5407556009060208754 w(Map map);

    public static final native List x();

    public static final void y(B1061516154492673368 b1061516154492673368, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            y(b1061516154492673368, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d17 * dSqrt2;
        double d24 = dSqrt2 * d18;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
        double dAtan22 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d9 * d11;
        double d26 = d10 * d7;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d11;
        double d30 = d29 * dCos2;
        double d31 = d7 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d7 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = dAtan22 / ((double) iCeil);
        double d37 = dAtan2;
        double d38 = d32;
        int i2 = 0;
        double d39 = d35;
        double d40 = d3;
        while (i2 < iCeil) {
            double d41 = d37 + d36;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            int i3 = iCeil;
            double d42 = (((d11 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d43 = (d34 * dSin4) + (d11 * dSin2 * dCos4) + d28;
            double d44 = (d30 * dSin4) - (d31 * dCos4);
            double d45 = (dCos4 * d34) + (dSin4 * d33);
            double d46 = d41 - d37;
            double dTan = Math.tan(d46 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            b1061516154492673368.a.cubicTo((float) ((d38 * dSqrt3) + d2), (float) ((d39 * dSqrt3) + d40), (float) (d42 - (dSqrt3 * d44)), (float) (d43 - (dSqrt3 * d45)), (float) d42, (float) d43);
            d36 = d36;
            dSin2 = dSin2;
            d27 = d27;
            d2 = d42;
            i2++;
            d33 = d33;
            d37 = d41;
            d39 = d45;
            d38 = d44;
            iCeil = i3;
            d40 = d43;
            d11 = d6;
        }
    }

    public static final native Object z(Throwable th);

    static {
        izmyclvb.oeynnivvrnts0(1194);
        a = new T15443218846549482730(-1571120048, false, new B15085781124798608112());
        b = new T15443218846549482730(-1455401925, false, new H1364634762656128767((byte) 1));
        c = new Q9435736031653407531(0.31006f, 0.31616f);
        d = new Q9435736031653407531(0.34567f, 0.3585f);
        e = new Q9435736031653407531(0.32168f, 0.33767f);
        f = new Q9435736031653407531(0.31271f, 0.32902f);
        g = new float[]{0.964212f, 1.0f, 0.825188f};
        h = new D14731132657808549702("NO_VALUE", (byte) 25);
        i = new Z14997871575210439922((byte) 14);
    }
}
