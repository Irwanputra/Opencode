package dev.epro.r0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Xml;
import android.view.DragEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX INFO: renamed from: o, reason: collision with root package name */
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
            Object objK = g17613326942144185441.k();
            objK.getClass();
            A12732730042960812466 a12732730042960812466 = ((Z9252984664652542715) objK).a;
            G429561569752528174 g429561569752528174 = (G429561569752528174) a12732730042960812466.b;
            F14378331124810887321 f14378331124810887321 = (F14378331124810887321) a12732730042960812466.c;
            Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) g429561569752528174.a.getValue();
            if (q17957571128037780363 == null) {
                y16414919402539525744 = new Y16414919402539525744(0, 0, new N3036857611236089530((byte) 12));
            } else {
                F14378331124810887321 f14378331124810887321C = G429561569752528174.c(f14378331124810887321, q17957571128037780363);
                if (f14378331124810887321C == null) {
                    y16414919402539525744 = new Y16414919402539525744(0, 0, new N3036857611236089530((byte) 13));
                } else {
                    I11366018238968599357 i11366018238968599357V = C775827382551829194.V(q17957571128037780363.j(f14378331124810887321C.b, f14378331124810887321C.c).d());
                    y16414919402539525744 = new Y16414919402539525744(i11366018238968599357V.d(), i11366018238968599357V.b(), new E6464496061242537963(i11366018238968599357V, (byte) 5));
                }
            }
            int i3 = y16414919402539525744.a;
            int i4 = y16414919402539525744.b;
            arrayList.add(new H9390398899829886498(g17613326942144185441.d(C12265524002282074474.R(i3, i3, i4, i4)), (B13729205492206812220) y16414919402539525744.c));
        }
        return arrayList;
    }

    public static String C(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (D1286559660607336098.r(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
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

    public static void H(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                } catch (Exception unused) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    fileOutputStreamOpenFileOutput.close();
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }

    public static final native Object I(L12602321637077960189 l12602321637077960189, K14749510448791472029 k14749510448791472029);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
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

    /* JADX WARN: Removed duplicated region for block: B:126:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final dev.epro.r0.M11181104712105445833 r25, final dev.epro.r0.I1722681268793429505 r26, final dev.epro.r0.S16571168858015125610 r27, final dev.epro.r0.F4096073349764486348 r28, final int r29, final boolean r30, final int r31, final int r32, final java.util.Map r33, dev.epro.r0.M3727281027331139839 r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5998207562248239613.b(dev.epro.r0.M11181104712105445833, dev.epro.r0.I1722681268793429505, dev.epro.r0.S16571168858015125610, dev.epro.r0.F4096073349764486348, int, boolean, int, int, java.util.Map, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r28, final dev.epro.r0.I1722681268793429505 r29, final dev.epro.r0.S16571168858015125610 r30, dev.epro.r0.F4096073349764486348 r31, int r32, boolean r33, final int r34, int r35, dev.epro.r0.M3727281027331139839 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5998207562248239613.c(java.lang.String, dev.epro.r0.I1722681268793429505, dev.epro.r0.S16571168858015125610, dev.epro.r0.F4096073349764486348, int, boolean, int, int, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final dev.epro.r0.I1722681268793429505 r17, dev.epro.r0.I5573661370475160895 r18, dev.epro.r0.V13882211622155904359 r19, dev.epro.r0.A4677720871826919358 r20, dev.epro.r0.U6155824110361579454 r21, dev.epro.r0.J12078565427869724451 r22, dev.epro.r0.M3727281027331139839 r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5998207562248239613.d(dev.epro.r0.I1722681268793429505, dev.epro.r0.I5573661370475160895, dev.epro.r0.V13882211622155904359, dev.epro.r0.A4677720871826919358, dev.epro.r0.U6155824110361579454, dev.epro.r0.J12078565427869724451, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final native void e(S10916774262026483422 s10916774262026483422, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, boolean z, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0203  */
    /* JADX WARN: Type inference failed for: r0v20, types: [dev.epro.r0.O2161699089510411363] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r43v0, types: [dev.epro.r0.M3727281027331139839] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [dev.epro.r0.W1972671267364756056, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final dev.epro.r0.I1722681268793429505 r30, final dev.epro.r0.M11181104712105445833 r31, final dev.epro.r0.F4096073349764486348 r32, final boolean r33, final java.util.Map r34, final dev.epro.r0.S16571168858015125610 r35, final int r36, final boolean r37, final int r38, final int r39, final dev.epro.r0.U14340554418656580554 r40, final dev.epro.r0.K14689388407946088944 r41, final dev.epro.r0.F4096073349764486348 r42, dev.epro.r0.M3727281027331139839 r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B5998207562248239613.f(dev.epro.r0.I1722681268793429505, dev.epro.r0.M11181104712105445833, dev.epro.r0.F4096073349764486348, boolean, java.util.Map, dev.epro.r0.S16571168858015125610, int, boolean, int, int, dev.epro.r0.U14340554418656580554, dev.epro.r0.K14689388407946088944, dev.epro.r0.F4096073349764486348, dev.epro.r0.M3727281027331139839, int, int):void");
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
        U12307647644992999381 u12307647644992999381D = A459791877761184370.e.d(0, str);
        if (u12307647644992999381D == null) {
            D11988991656201568495.l("No subtype found for: \"", str, 34);
            return null;
        }
        String str2 = (String) ((A10468597346719636873) u12307647644992999381D.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((A10468597346719636873) u12307647644992999381D.a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = u12307647644992999381D.b().b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= str.length()) {
                return new A459791877761184370(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            U12307647644992999381 u12307647644992999381D2 = A459791877761184370.f.d(i3, str);
            if (u12307647644992999381D2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i3) + "\" for: \"" + str + '\"').toString());
            }
            C8145984272139078584 c8145984272139078584 = u12307647644992999381D2.c;
            X13869420807587484607 x13869420807587484607B = c8145984272139078584.b(1);
            String str3 = x13869420807587484607B != null ? x13869420807587484607B.a : null;
            if (str3 == null) {
                i2 = u12307647644992999381D2.b().b;
            } else {
                X13869420807587484607 x13869420807587484607B2 = c8145984272139078584.b(2);
                String strSubstring = x13869420807587484607B2 != null ? x13869420807587484607B2.a : null;
                if (strSubstring == null) {
                    X13869420807587484607 x13869420807587484607B3 = c8145984272139078584.b(3);
                    x13869420807587484607B3.getClass();
                    strSubstring = x13869420807587484607B3.a;
                } else if (M8927913404651150384.r0(strSubstring, '\'') && M8927913404651150384.O(strSubstring, '\'') && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i2 = u12307647644992999381D2.b().b;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
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
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        w = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final Object u(G17613326942144185441 g17613326942144185441) {
        Object objK = g17613326942144185441.k();
        V2011418798970996039 v2011418798970996039 = objK instanceof V2011418798970996039 ? (V2011418798970996039) objK : null;
        if (v2011418798970996039 != null) {
            return v2011418798970996039.f541o;
        }
        return null;
    }

    public static final long v(Q9265972499284275049 q9265972499284275049) {
        DragEvent dragEvent = q9265972499284275049.a;
        float x2 = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x2)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
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
