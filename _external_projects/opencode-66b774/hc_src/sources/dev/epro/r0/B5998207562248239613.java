package dev.epro.r0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.DragEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public abstract class B5998207562248239613 {
    public static final Object a;
    public static final Y4261039727803185691 b;
    public static final Y4261039727803185691 c;
    public static final float d;
    public static final Y4261039727803185691 e;
    public static final float f;
    public static final float g;
    public static final Y4261039727803185691 h;
    public static final StackTraceElement[] i;
    public static final Y4261039727803185691 j;
    public static final D4961612090878789022 k;
    public static final Y4261039727803185691 l;
    public static final float m;
    public static final V10933700885381486763 n;

    /* renamed from: o, reason: collision with root package name */
    public static final Y4261039727803185691 f177o;
    public static final Y4261039727803185691 p;
    public static final D4961612090878789022 q;
    public static final float r;
    public static final float s;
    public static final Object t;
    public static int u;
    public static final Z14997871575210439922 v;
    public static Z7022156542152740569 w;
    public static Z7022156542152740569 x;

    public static G5920303990939058292 A(G8001132634698687269 g8001132634698687269, L12639328004344855510 l12639328004344855510) {
        g8001132634698687269.getClass();
        return T18016951143603335921.I(new M11115334227134251595(g8001132634698687269, L856869997670741194.a, l12639328004344855510, (byte) 4));
    }

    public static final ArrayList B(List list, B13729205492206812220 b13729205492206812220) {
        Y16414919402539525744 y16414919402539525744;
        if (!((Boolean) b13729205492206812220.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i2);
            Object k2 = g17613326942144185441.k();
            k2.getClass();
            A12732730042960812466 a12732730042960812466 = ((Z9252984664652542715) k2).a;
            G429561569752528174 g429561569752528174 = (G429561569752528174) a12732730042960812466.b;
            F14378331124810887321 f14378331124810887321 = (F14378331124810887321) a12732730042960812466.c;
            Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) g429561569752528174.a.getValue();
            if (q17957571128037780363 == null) {
                y16414919402539525744 = new Y16414919402539525744(0, 0, new N3036857611236089530((byte) 12));
            } else {
                F14378331124810887321 c2 = G429561569752528174.c(f14378331124810887321, q17957571128037780363);
                if (c2 == null) {
                    y16414919402539525744 = new Y16414919402539525744(0, 0, new N3036857611236089530((byte) 13));
                } else {
                    I11366018238968599357 V = C775827382551829194.V(q17957571128037780363.j(c2.b, c2.c).d());
                    y16414919402539525744 = new Y16414919402539525744(V.d(), V.b(), new E6464496061242537963(V, (byte) 5));
                }
            }
            int i3 = y16414919402539525744.a;
            int i4 = y16414919402539525744.b;
            arrayList.add(new H9390398899829886498(g17613326942144185441.d(C12265524002282074474.R(i3, i3, i4, i4)), (B13729205492206812220) y16414919402539525744.c));
        }
        return arrayList;
    }

    public static String C(Context context) {
        String opPackageName;
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (D1286559660607336098.r(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            StringBuilder sb = new StringBuilder();
            opPackageName = context.getOpPackageName();
            sb.append(opPackageName);
            sb.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
            str = sb.toString();
            if (D1286559660607336098.r(context, str) == 0) {
                return str;
            }
        }
        K2042933864045806308.i(G6547577305291411977.s("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    public static final I1722681268793429505 D(I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348) {
        return i1722681268793429505.Q0(new E16360231328790433773(f4096073349764486348, null));
    }

    public static final I1722681268793429505 E(I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348) {
        return i1722681268793429505.Q0(new E16360231328790433773(null, f4096073349764486348));
    }

    public static final I1722681268793429505 F(I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348) {
        return i1722681268793429505.Q0(new N3763125415201877818(f4096073349764486348));
    }

    public static BigDecimal G(String str) {
        k(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = dev.epro.r0.B5998207562248239613.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L50
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L4e
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            if (r5 == 0) goto L4c
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4c
            goto L4c
        L42:
            r6 = move-exception
            if (r5 == 0) goto L48
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L48
        L48:
            throw r6     // Catch: java.lang.Throwable -> L12
        L49:
            if (r5 == 0) goto L4c
            goto L3e
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L4f
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L4f:
            return
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5998207562248239613.H(android.content.Context, java.lang.String):void");
    }

    public static final native Object I(L12602321637077960189 l12602321637077960189, K14749510448791472029 k14749510448791472029);

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        if (r5 != 4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String J(android.content.Context r8) {
        /*
            java.lang.Object r0 = dev.epro.r0.B5998207562248239613.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L63
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L4c
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
        L44:
            if (r2 == 0) goto L55
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L55
            goto L55
        L4a:
            r8 = move-exception
            goto L65
        L4c:
            if (r2 == 0) goto L51
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L51
        L51:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L52:
            if (r2 == 0) goto L55
            goto L46
        L55:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5c
            goto L61
        L5c:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5998207562248239613.J(android.content.Context):java.lang.String");
    }

    public static final native K9060572936240110247 K(Z12230432157744414222 z12230432157744414222, Z12230432157744414222 z122304321577444142222, G13897809556106331572 g13897809556106331572, boolean z);

    public static Intent L(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        int i3 = i2 & 2;
        if (i3 == 0 && (i2 & 4) == 0) {
            S10973172697741180971.j("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i3 == 0 || (i2 & 4) == 0) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 33 ? F18342544821595307642.m(context, broadcastReceiver, intentFilter, i2) : i4 >= 26 ? F18342544821595307642.l(context, broadcastReceiver, intentFilter, i2) : (i2 & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, C(context), null) : context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
        S10973172697741180971.j("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        return null;
    }

    public static final native J9879469284241532070 M(String str, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839);

    public static final int N(int i2, int i3) {
        if (i2 == Integer.MAX_VALUE) {
            return i2;
        }
        int i4 = i2 - i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    public static final I1722681268793429505 O(I1722681268793429505 i1722681268793429505, M11181104712105445833 m11181104712105445833, S16571168858015125610 s16571168858015125610, F4096073349764486348 f4096073349764486348, int i2, boolean z, int i3, int i4, U14340554418656580554 u14340554418656580554, List list, F4096073349764486348 f40960733497644863482, K14689388407946088944 k14689388407946088944, F4096073349764486348 f40960733497644863483) {
        if (k14689388407946088944 == null) {
            return i1722681268793429505.Q0(V10993962107938880611.a).Q0(new Q15972232904793050537(m11181104712105445833, s16571168858015125610, u14340554418656580554, f4096073349764486348, i2, z, i3, i4, list, f40960733497644863482, f40960733497644863483));
        }
        return i1722681268793429505.Q0(k14689388407946088944.g).Q0(new M17448801426690103928(m11181104712105445833, s16571168858015125610, u14340554418656580554, f4096073349764486348, i2, z, i3, i4, list, f40960733497644863482, k14689388407946088944));
    }

    public static Q17276063867044657934 a(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new Q17276063867044657934(D15913187640519482289.h, Float.valueOf(f2), new I13752901056665676111(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void b(final M11181104712105445833 m11181104712105445833, final I1722681268793429505 i1722681268793429505, final S16571168858015125610 s16571168858015125610, final F4096073349764486348 f4096073349764486348, final int i2, final boolean z, final int i3, final int i4, final Map map, M3727281027331139839 m3727281027331139839, final int i5, final int i6) {
        boolean z2;
        int i7;
        K14689388407946088944 k14689388407946088944;
        boolean z3;
        boolean z4;
        byte b2;
        M3727281027331139839 m37272810273311398392 = m3727281027331139839;
        m37272810273311398392.b0(-1343466571);
        int i8 = (i5 & 6) == 0 ? (m37272810273311398392.f(m11181104712105445833) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i8 |= m37272810273311398392.f(i1722681268793429505) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i8 |= m37272810273311398392.f(s16571168858015125610) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 |= m37272810273311398392.h(f4096073349764486348) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= m37272810273311398392.d(i2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i5) == 0) {
            z2 = z;
            i8 |= m37272810273311398392.g(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((1572864 & i5) == 0) {
            i8 |= m37272810273311398392.d(i3) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i8 |= m37272810273311398392.d(i4) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i8 |= m37272810273311398392.h(map) ? 67108864 : 33554432;
        }
        int i9 = i8 | 805306368;
        int i10 = (i6 & 6) == 0 ? i6 | ((i6 & 8) == 0 ? m37272810273311398392.f(null) : m37272810273311398392.h(null) ? 4 : 2) : i6;
        if (m37272810273311398392.R(i9 & 1, ((i9 & 306783379) == 306783378 && (i10 & 3) == 2) ? false : true)) {
            V933048422416352811.N(i4, i3);
            A957273981459855795 a957273981459855795 = (A957273981459855795) m37272810273311398392.j(E3933996248613761216.a);
            Object obj = O9023047933786425027.a;
            if (a957273981459855795 != null) {
                m37272810273311398392.a0(1588272647);
                long j2 = ((E8171957064035740491) m37272810273311398392.j(L9437793152864500530.a)).b;
                Object[] objArr = {a957273981459855795};
                i7 = i9;
                V10300877997588547986 v10300877997588547986 = new V10300877997588547986((Object) new K5271540294206541871(a957273981459855795, (byte) 4), (Object) new F17594658268783405200((byte) 9), (byte) 20);
                boolean h2 = m37272810273311398392.h(a957273981459855795);
                Object M = m37272810273311398392.M();
                if (h2 || M == obj) {
                    b2 = 0;
                    M = new D4126507157296262211(a957273981459855795, b2);
                    m37272810273311398392.k0(M);
                } else {
                    b2 = 0;
                }
                long longValue = ((Number) C468629748621011703.m(objArr, v10300877997588547986, (B13729205492206812220) M, m37272810273311398392, b2)).longValue();
                boolean e2 = m37272810273311398392.e(longValue) | m37272810273311398392.f(a957273981459855795) | m37272810273311398392.e(j2);
                Object M2 = m37272810273311398392.M();
                if (e2 || M2 == obj) {
                    M2 = new K14689388407946088944(longValue, a957273981459855795, j2);
                    m37272810273311398392.k0(M2);
                }
                k14689388407946088944 = (K14689388407946088944) M2;
                m37272810273311398392.q(false);
            } else {
                i7 = i9;
                m37272810273311398392.a0(1588900273);
                m37272810273311398392.q(false);
                k14689388407946088944 = null;
            }
            H9390398899829886498 h9390398899829886498 = U2699050688473929358.a;
            int length = m11181104712105445833.b.length();
            List list = m11181104712105445833.a;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    F14378331124810887321 f14378331124810887321 = (F14378331124810887321) list.get(i11);
                    if ((f14378331124810887321.a instanceof S509580920476247129) && "androidx.compose.foundation.text.inlineContent".equals(f14378331124810887321.d)) {
                        z3 = false;
                        if (Z15472362586437216226.b(0, length, f14378331124810887321.b, f14378331124810887321.c)) {
                            z4 = true;
                            break;
                        }
                    }
                }
            }
            z3 = false;
            z4 = false;
            boolean m2 = A15222901130456174747.m(m11181104712105445833);
            U14340554418656580554 u14340554418656580554 = (U14340554418656580554) m37272810273311398392.j(Y238707362170117896.k);
            if (z4 || m2) {
                boolean z5 = z3;
                K14689388407946088944 k146893884079460889442 = k14689388407946088944;
                m37272810273311398392.a0(1590195670);
                boolean z6 = (i7 & 14) == 4 ? true : z5;
                Object M3 = m37272810273311398392.M();
                if (z6 || M3 == obj) {
                    M3 = V4416135141588678913.t(m11181104712105445833);
                    m37272810273311398392.k0(M3);
                }
                W1972671267364756056 w1972671267364756056 = (W1972671267364756056) M3;
                M11181104712105445833 m111811047121054458332 = (M11181104712105445833) w1972671267364756056.getValue();
                boolean f2 = m37272810273311398392.f(w1972671267364756056);
                Object M4 = m37272810273311398392.M();
                if (f2 || M4 == obj) {
                    M4 = new E4034754046325952430(w1972671267364756056, (byte) 4);
                    m37272810273311398392.k0(M4);
                }
                int i12 = i7 << 6;
                f(i1722681268793429505, m111811047121054458332, f4096073349764486348, z4, map, s16571168858015125610, i2, z, i3, i4, u14340554418656580554, k146893884079460889442, (F4096073349764486348) M4, m37272810273311398392, ((i7 >> 3) & 910) | ((i7 >> 12) & 57344) | ((i7 << 9) & 458752) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), ((i7 >> 21) & 896) | (57344 & (i10 << 12)));
                m37272810273311398392 = m37272810273311398392;
                m37272810273311398392.q(false);
            } else {
                m37272810273311398392.a0(1589148149);
                R4468382834154872542.a(m11181104712105445833, s16571168858015125610, u14340554418656580554, null, z2, m37272810273311398392);
                I1722681268793429505 O = O(i1722681268793429505, m11181104712105445833, s16571168858015125610, f4096073349764486348, i2, z, i3, i4, u14340554418656580554, null, null, k14689388407946088944, null);
                D4887919054349991205 d4887919054349991205 = D4887919054349991205.f;
                int hashCode = Long.hashCode(m37272810273311398392.T);
                I1722681268793429505 N = V12319504402545346730.N(m37272810273311398392, O);
                P3648740535677465818 l2 = m37272810273311398392.l();
                X4572652335386916693.Po.getClass();
                m37272810273311398392.d0();
                if (m37272810273311398392.S) {
                    m37272810273311398392.k(H11725168162114556860.S);
                } else {
                    m37272810273311398392.n0();
                }
                W7808703833045379622.J(P2382941533350862833.i, m37272810273311398392, d4887919054349991205);
                W7808703833045379622.J(P2382941533350862833.h, m37272810273311398392, l2);
                W7808703833045379622.H(m37272810273311398392);
                W7808703833045379622.J(P2382941533350862833.g, m37272810273311398392, N);
                W7808703833045379622.J(P2382941533350862833.j, m37272810273311398392, Integer.valueOf(hashCode));
                m37272810273311398392.q(true);
                m37272810273311398392.q(false);
                m37272810273311398392 = m37272810273311398392;
            }
        } else {
            m37272810273311398392.U();
        }
        V4878375136513573151 t2 = m37272810273311398392.t();
        if (t2 != null) {
            t2.d = new L12639328004344855510() { // from class: dev.epro.r0.B7866161682207130435
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p2 = V16504496955554646429.p(i5 | 1);
                    int p3 = V16504496955554646429.p(i6);
                    M11181104712105445833 m111811047121054458333 = M11181104712105445833.this;
                    I1722681268793429505 i17226812687934295052 = i1722681268793429505;
                    S16571168858015125610 s165711688580151256102 = s16571168858015125610;
                    F4096073349764486348 f40960733497644863482 = f4096073349764486348;
                    byte b3 = i2;
                    boolean z7 = z;
                    int i13 = i3;
                    boolean z8 = i4;
                    Map map2 = map;
                    B5998207562248239613.b(m111811047121054458333, i17226812687934295052, s165711688580151256102, f40960733497644863482, b3, z7, i13, z8 ? 1 : 0, map2, (M3727281027331139839) obj2, p2, p3);
                    return O9245300239821758723.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r28, final dev.epro.r0.I1722681268793429505 r29, final dev.epro.r0.S16571168858015125610 r30, dev.epro.r0.F4096073349764486348 r31, int r32, boolean r33, final int r34, int r35, dev.epro.r0.M3727281027331139839 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5998207562248239613.c(java.lang.String, dev.epro.r0.I1722681268793429505, dev.epro.r0.S16571168858015125610, dev.epro.r0.F4096073349764486348, int, boolean, int, int, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final dev.epro.r0.I1722681268793429505 r17, dev.epro.r0.I5573661370475160895 r18, dev.epro.r0.V13882211622155904359 r19, dev.epro.r0.A4677720871826919358 r20, dev.epro.r0.U6155824110361579454 r21, dev.epro.r0.J12078565427869724451 r22, dev.epro.r0.M3727281027331139839 r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5998207562248239613.d(dev.epro.r0.I1722681268793429505, dev.epro.r0.I5573661370475160895, dev.epro.r0.V13882211622155904359, dev.epro.r0.A4677720871826919358, dev.epro.r0.U6155824110361579454, dev.epro.r0.J12078565427869724451, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final native void e(S10916774262026483422 s10916774262026483422, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, boolean z, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [dev.epro.r0.O2161699089510411363] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r43v0, types: [dev.epro.r0.M3727281027331139839] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [dev.epro.r0.W1972671267364756056, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static final void f(final I1722681268793429505 i1722681268793429505, final M11181104712105445833 m11181104712105445833, final F4096073349764486348 f4096073349764486348, final boolean z, final Map map, final S16571168858015125610 s16571168858015125610, final int i2, final boolean z2, final int i3, final int i4, final U14340554418656580554 u14340554418656580554, final K14689388407946088944 k14689388407946088944, final F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, final int i5, final int i6) {
        G429561569752528174 g429561569752528174;
        D16945471218061474327 d16945471218061474327;
        G429561569752528174 g4295615697525281742;
        B13729205492206812220 b13729205492206812220;
        H9390398899829886498 h9390398899829886498;
        E4034754046325952430 e4034754046325952430;
        ?? r9;
        Object e8725686959797322599;
        boolean z3;
        ?? r4;
        Object obj;
        ?? r0;
        m3727281027331139839.b0(-2118572703);
        int i7 = (i5 & 6) == 0 ? (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i7 |= m3727281027331139839.f(m11181104712105445833) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= m3727281027331139839.h(f4096073349764486348) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= m3727281027331139839.g(z) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= m3727281027331139839.h(map) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= m3727281027331139839.f(s16571168858015125610) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= m3727281027331139839.d(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= m3727281027331139839.g(z2) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= m3727281027331139839.d(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= m3727281027331139839.d(i4) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        int i8 = (i6 & 6) == 0 ? i6 | (m3727281027331139839.h(u14340554418656580554) ? 4 : 2) : i6;
        if ((i6 & 48) == 0) {
            i8 |= m3727281027331139839.h(k14689388407946088944) ? 32 : 16;
        }
        int i9 = i7;
        if ((i6 & 384) == 0) {
            i8 |= m3727281027331139839.h(null) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= m3727281027331139839.h(f40960733497644863482) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= (32768 & i6) == 0 ? m3727281027331139839.f(null) : m3727281027331139839.h(null) ? 16384 : 8192;
        }
        if (m3727281027331139839.R(i9 & 1, ((i9 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean m2 = A15222901130456174747.m(m11181104712105445833);
            E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
            if (m2) {
                m3727281027331139839.a0(145641571);
                boolean z4 = (i9 & 112) == 32;
                ?? M = m3727281027331139839.M();
                G429561569752528174 g4295615697525281743 = M;
                if (z4 || M == e17149812035295265804) {
                    G429561569752528174 g4295615697525281744 = new G429561569752528174(m11181104712105445833);
                    m3727281027331139839.k0(g4295615697525281744);
                    g4295615697525281743 = g4295615697525281744;
                }
                g429561569752528174 = g4295615697525281743;
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(145707228);
                m3727281027331139839.q(false);
                g429561569752528174 = null;
            }
            if (A15222901130456174747.m(m11181104712105445833)) {
                m3727281027331139839.a0(145905443);
                boolean f2 = ((i9 & 112) == 32) | m3727281027331139839.f(g429561569752528174);
                ?? M2 = m3727281027331139839.M();
                D16945471218061474327 d169454712180614743272 = M2;
                if (f2 || M2 == e17149812035295265804) {
                    D16945471218061474327 d169454712180614743273 = new D16945471218061474327((Object) g429561569752528174, (Object) m11181104712105445833, (byte) 15);
                    m3727281027331139839.k0(d169454712180614743273);
                    d169454712180614743272 = d169454712180614743273;
                }
                d16945471218061474327 = d169454712180614743272;
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(146002721);
                boolean z5 = (i9 & 112) == 32;
                Object M3 = m3727281027331139839.M();
                Object obj2 = M3;
                if (z5 || M3 == e17149812035295265804) {
                    S464754454553842217 s464754454553842217 = new S464754454553842217(m11181104712105445833, (byte) 8);
                    m3727281027331139839.k0(s464754454553842217);
                    obj2 = s464754454553842217;
                }
                d16945471218061474327 = (B13729205492206812220) obj2;
                m3727281027331139839.q(false);
            }
            if (z) {
                if (map != null) {
                    H9390398899829886498 h93903988998298864982 = U2699050688473929358.a;
                    if (!map.isEmpty()) {
                        int length = m11181104712105445833.b.length();
                        g4295615697525281742 = g429561569752528174;
                        List list = m11181104712105445833.a;
                        if (list != null) {
                            r0 = new ArrayList(list.size());
                            int size = list.size();
                            b13729205492206812220 = d16945471218061474327;
                            int i10 = 0;
                            while (i10 < size) {
                                List list2 = list;
                                F14378331124810887321 f14378331124810887321 = (F14378331124810887321) list.get(i10);
                                int i11 = size;
                                Object obj3 = f14378331124810887321.a;
                                int i12 = i10;
                                int i13 = f14378331124810887321.c;
                                int i14 = f14378331124810887321.b;
                                String str = f14378331124810887321.d;
                                if ((obj3 instanceof S509580920476247129) && "androidx.compose.foundation.text.inlineContent".equals(str) && Z15472362586437216226.b(0, length, i14, i13)) {
                                    Object obj4 = f14378331124810887321.a;
                                    obj4.getClass();
                                    r0.add(new F14378331124810887321(((S509580920476247129) obj4).a, i14, i13, str));
                                }
                                i10 = i12 + 1;
                                size = i11;
                                list = list2;
                            }
                        } else {
                            b13729205492206812220 = d16945471218061474327;
                            r0 = O2161699089510411363.a;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = r0.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            if (map.get(((F14378331124810887321) r0.get(i15)).a) != null) {
                                Z3383101362411723454.s();
                                return;
                            }
                        }
                        h9390398899829886498 = new H9390398899829886498(arrayList, arrayList2);
                        e4034754046325952430 = null;
                    }
                }
                g4295615697525281742 = g429561569752528174;
                b13729205492206812220 = d16945471218061474327;
                h9390398899829886498 = U2699050688473929358.a;
                e4034754046325952430 = null;
            } else {
                g4295615697525281742 = g429561569752528174;
                b13729205492206812220 = d16945471218061474327;
                e4034754046325952430 = null;
                h9390398899829886498 = new H9390398899829886498(null, null);
            }
            List list3 = (List) h9390398899829886498.a;
            List list4 = (List) h9390398899829886498.b;
            if (z) {
                m3727281027331139839.a0(146318828);
                Object M4 = m3727281027331139839.M();
                Object obj5 = M4;
                if (M4 == e17149812035295265804) {
                    V697849047308847220 t2 = V4416135141588678913.t(e4034754046325952430);
                    m3727281027331139839.k0(t2);
                    obj5 = t2;
                }
                m3727281027331139839.q(false);
                r9 = (W1972671267364756056) obj5;
            } else {
                m3727281027331139839.a0(146406588);
                m3727281027331139839.q(false);
                r9 = e4034754046325952430;
            }
            if (z) {
                m3727281027331139839.a0(146499837);
                boolean f3 = m3727281027331139839.f(r9);
                ?? M5 = m3727281027331139839.M();
                E4034754046325952430 e40347540463259524302 = M5;
                if (f3 || M5 == e17149812035295265804) {
                    E4034754046325952430 e40347540463259524303 = new E4034754046325952430(r9, (byte) 5);
                    m3727281027331139839.k0(e40347540463259524303);
                    e40347540463259524302 = e40347540463259524303;
                }
                e4034754046325952430 = e40347540463259524302;
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(146571260);
                m3727281027331139839.q(false);
            }
            F4096073349764486348 f40960733497644863483 = e4034754046325952430;
            int i16 = (i9 >> 3) & 14;
            G429561569752528174 g4295615697525281745 = g4295615697525281742;
            R4468382834154872542.a(m11181104712105445833, s16571168858015125610, u14340554418656580554, list3, z2, m3727281027331139839);
            M11181104712105445833 m111811047121054458332 = (M11181104712105445833) b13729205492206812220.invoke();
            boolean h2 = m3727281027331139839.h(g4295615697525281745) | ((i9 & 896) == 256);
            Object M6 = m3727281027331139839.M();
            Object obj6 = M6;
            if (h2 || M6 == e17149812035295265804) {
                T7192276515593820863 t7192276515593820863 = new T7192276515593820863(g4295615697525281745, f4096073349764486348, (byte) 0);
                m3727281027331139839.k0(t7192276515593820863);
                obj6 = t7192276515593820863;
            }
            I1722681268793429505 O = O(i1722681268793429505, m111811047121054458332, s16571168858015125610, (F4096073349764486348) obj6, i2, z2, i3, i4, u14340554418656580554, list3, f40960733497644863483, k14689388407946088944, f40960733497644863482);
            if (z) {
                m3727281027331139839.a0(147956465);
                boolean h3 = m3727281027331139839.h(g4295615697525281745);
                Object M7 = m3727281027331139839.M();
                Object obj7 = M7;
                if (h3 || M7 == e17149812035295265804) {
                    U9064145938361820831 u9064145938361820831 = new U9064145938361820831(g4295615697525281745, (byte) 1);
                    m3727281027331139839.k0(u9064145938361820831);
                    obj7 = u9064145938361820831;
                }
                B13729205492206812220 b137292054922068122202 = (B13729205492206812220) obj7;
                boolean f4 = m3727281027331139839.f(r9);
                Object M8 = m3727281027331139839.M();
                Object obj8 = M8;
                if (f4 || M8 == e17149812035295265804) {
                    C13964068377165850232 c13964068377165850232 = new C13964068377165850232(r9, (byte) 2);
                    m3727281027331139839.k0(c13964068377165850232);
                    obj8 = c13964068377165850232;
                }
                e8725686959797322599 = new E8725686959797322599(b137292054922068122202, (B13729205492206812220) obj8, (byte) 1);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(147779703);
                boolean h4 = m3727281027331139839.h(g4295615697525281745);
                Object M9 = m3727281027331139839.M();
                if (h4 || M9 == e17149812035295265804) {
                    r4 = 0;
                    U9064145938361820831 u90641459383618208312 = new U9064145938361820831(g4295615697525281745, false ? 1 : 0);
                    m3727281027331139839.k0(u90641459383618208312);
                    obj = u90641459383618208312;
                } else {
                    r4 = 0;
                    obj = M9;
                }
                e8725686959797322599 = new P716791095848659252((B13729205492206812220) obj, r4);
                m3727281027331139839.q(r4);
            }
            int hashCode = Long.hashCode(m3727281027331139839.T);
            P3648740535677465818 l2 = m3727281027331139839.l();
            I1722681268793429505 N = V12319504402545346730.N(m3727281027331139839, O);
            X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, e8725686959797322599);
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, l2);
            W7808703833045379622.J(P2382941533350862833.j, m3727281027331139839, Integer.valueOf(hashCode));
            W7808703833045379622.H(m3727281027331139839);
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, N);
            if (g4295615697525281745 == null) {
                m3727281027331139839.a0(-433557001);
                z3 = false;
            } else {
                z3 = false;
                m3727281027331139839.a0(-291080374);
                g4295615697525281745.a(0, m3727281027331139839);
            }
            m3727281027331139839.q(z3);
            if (list4 == null) {
                m3727281027331139839.a0(-433506223);
            } else {
                m3727281027331139839.a0(-433506222);
                U2699050688473929358.a(m11181104712105445833, list4, m3727281027331139839, i16);
            }
            m3727281027331139839.q(z3);
            m3727281027331139839.q(true);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t3 = m3727281027331139839.t();
        if (t3 != null) {
            t3.d = new L12639328004344855510() { // from class: dev.epro.r0.R7913129456972335500
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    int p2 = V16504496955554646429.p(i5 | 1);
                    int p3 = V16504496955554646429.p(i6);
                    I1722681268793429505 i17226812687934295052 = I1722681268793429505.this;
                    M11181104712105445833 m111811047121054458333 = m11181104712105445833;
                    F4096073349764486348 f40960733497644863484 = f4096073349764486348;
                    boolean z6 = z;
                    Map map2 = map;
                    S16571168858015125610 s165711688580151256102 = s16571168858015125610;
                    byte b2 = i2;
                    boolean z7 = z2;
                    int i17 = i3;
                    boolean z8 = i4;
                    U14340554418656580554 u143405544186565805542 = u14340554418656580554;
                    K14689388407946088944 k146893884079460889442 = k14689388407946088944;
                    F4096073349764486348 f40960733497644863485 = f40960733497644863482;
                    B5998207562248239613.f(i17226812687934295052, m111811047121054458333, f40960733497644863484, z6, map2, s165711688580151256102, b2, z7, i17, z8 ? 1 : 0, u143405544186565805542, k146893884079460889442, f40960733497644863485, (M3727281027331139839) obj9, p2, p3);
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static final native void g(J9879469284241532070 j9879469284241532070, J12078565427869724451 j12078565427869724451, L12639328004344855510 l12639328004344855510, boolean z, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native Object i(R13205971432857419934 r13205971432857419934, List list, byte[] bArr, Y9581402170807256401 y9581402170807256401, G7649746643047100333 g7649746643047100333, K14749510448791472029 k14749510448791472029);

    public static void k(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static int l(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new K16329559678279668737(context).a.areNotificationsEnabled() ? 0 : -1;
        }
        Z3383101362411723454.k("permission must be non-null");
        return 0;
    }

    public static final native int m(T13776387768935285955 t13776387768935285955, O3963944098342584804 o3963944098342584804);

    public static Q17276063867044657934 n(Q17276063867044657934 q17276063867044657934, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) q17276063867044657934.b.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((I13752901056665676111) q17276063867044657934.c).a;
        }
        return new Q17276063867044657934(q17276063867044657934.a, Float.valueOf(f2), new I13752901056665676111(f3), q17276063867044657934.d, q17276063867044657934.e, q17276063867044657934.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final M14117160572836268953 o(Context context) {
        T15504973625601650233 t15504973625601650233 = new T15504973625601650233(0 == true ? 1 : 0);
        context.getApplicationContext();
        return new M14117160572836268953(t15504973625601650233, new R8132622196923263774(Build.VERSION.SDK_INT >= 31 ? T15293084839223270388.a.a(context) : 0));
    }

    public static final native Object p(String str, M7561717362698189968 m7561717362698189968, K14749510448791472029 k14749510448791472029);

    public static A459791877761184370 q(String str) {
        str.getClass();
        U12307647644992999381 d2 = A459791877761184370.e.d(0, str);
        if (d2 == null) {
            D11988991656201568495.l("No subtype found for: \"", str, 34);
            return null;
        }
        String str2 = (String) ((A10468597346719636873) d2.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((A10468597346719636873) d2.a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = d2.b().b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= str.length()) {
                return new A459791877761184370(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            U12307647644992999381 d3 = A459791877761184370.f.d(i3, str);
            if (d3 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i3) + "\" for: \"" + str + '\"').toString());
            }
            C8145984272139078584 c8145984272139078584 = d3.c;
            X13869420807587484607 b2 = c8145984272139078584.b(1);
            String str3 = b2 != null ? b2.a : null;
            if (str3 == null) {
                i2 = d3.b().b;
            } else {
                X13869420807587484607 b3 = c8145984272139078584.b(2);
                String str4 = b3 != null ? b3.a : null;
                if (str4 == null) {
                    X13869420807587484607 b4 = c8145984272139078584.b(3);
                    b4.getClass();
                    str4 = b4.a;
                } else if (M8927913404651150384.r0(str4, '\'') && M8927913404651150384.O(str4, '\'') && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i2 = d3.b().b;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList r(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            dev.epro.r0.E6296634938622743063 r1 = new dev.epro.r0.E6296634938622743063
            r1.<init>(r0, r8)
            java.lang.Object r2 = dev.epro.r0.D17154507594675396172.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = dev.epro.r0.D17154507594675396172.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            dev.epro.r0.N14408349579153351094 r5 = (dev.epro.r0.N14408349579153351094) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Laf
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = dev.epro.r0.D17154507594675396172.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L7e
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = dev.epro.r0.U3773161118279281523.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
        L7e:
            if (r4 == 0) goto Laa
            java.lang.Object r2 = dev.epro.r0.D17154507594675396172.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = dev.epro.r0.D17154507594675396172.b     // Catch: java.lang.Throwable -> L96
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L96
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L96
            if (r3 != 0) goto L98
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L96
            r3.<init>()     // Catch: java.lang.Throwable -> L96
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r8 = move-exception
            goto La8
        L98:
            dev.epro.r0.N14408349579153351094 r0 = new dev.epro.r0.N14408349579153351094     // Catch: java.lang.Throwable -> L96
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L96
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L96
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L96
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            goto Lae
        La8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            throw r8
        Laa:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lae:
            return r4
        Laf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5998207562248239613.r(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static final native Integer s(G13897809556106331572 g13897809556106331572);

    public static final Z7022156542152740569 t() {
        Z7022156542152740569 z7022156542152740569 = w;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("AutoMirrored.Outlined.InsertDriveFile", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(14.0f, 2.0f);
        v14323974914327418545.f(6.0f);
        v14323974914327418545.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        v14323974914327418545.h(4.0f, 20.0f);
        v14323974914327418545.e(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        v14323974914327418545.f(18.0f);
        v14323974914327418545.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v14323974914327418545.r(8.0f);
        v14323974914327418545.i(-6.0f, -6.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(6.0f, 20.0f);
        v14323974914327418545.r(4.0f);
        v14323974914327418545.g(7.0f);
        v14323974914327418545.s(5.0f);
        v14323974914327418545.g(5.0f);
        v14323974914327418545.s(11.0f);
        v14323974914327418545.f(6.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        w = b2;
        return b2;
    }

    public static final Object u(G17613326942144185441 g17613326942144185441) {
        Object k2 = g17613326942144185441.k();
        V2011418798970996039 v2011418798970996039 = k2 instanceof V2011418798970996039 ? (V2011418798970996039) k2 : null;
        if (v2011418798970996039 != null) {
            return v2011418798970996039.f541o;
        }
        return null;
    }

    public static final long v(Q9265972499284275049 q9265972499284275049) {
        DragEvent dragEvent = q9265972499284275049.a;
        float x2 = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x2) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static final native Set w(Z12230432157744414222 z12230432157744414222);

    public static final void x(M3727281027331139839 m3727281027331139839, L12639328004344855510 l12639328004344855510) {
        l12639328004344855510.getClass();
        V12319504402545346730.s(2, l12639328004344855510);
        l12639328004344855510.invoke(m3727281027331139839, 1);
    }

    public static final native boolean y(Z12230432157744414222 z12230432157744414222);

    public static final native Z12230432157744414222 z(Z12230432157744414222 z12230432157744414222);

    public abstract int h(int i2, int i3, F10342546226345611902 f10342546226345611902, Z17471428274427141949 z17471428274427141949, int i4);

    public Integer j(Z17471428274427141949 z17471428274427141949) {
        return null;
    }

    static {
        izmyclvb.oeynnivvrnts0(184);
        a = new Object();
        b = Y4261039727803185691.m;
        c = Y4261039727803185691.h;
        d = 0.1f;
        e = Y4261039727803185691.i;
        f = 0.38f;
        g = 1.0f;
        h = Y4261039727803185691.e;
        i = new StackTraceElement[0];
        j = Y4261039727803185691.c;
        k = D4961612090878789022.h;
        l = Y4261039727803185691.d;
        m = 6.0f;
        n = V10933700885381486763.c;
        Y4261039727803185691 y4261039727803185691 = Y4261039727803185691.b;
        f177o = y4261039727803185691;
        p = y4261039727803185691;
        q = D4961612090878789022.b;
        r = 48.0f;
        s = 68.0f;
        t = new Object();
        v = new Z14997871575210439922((byte) 21);
    }
}
