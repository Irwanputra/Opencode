package dev.epro.r0;

import ads_mobile_sdk.o9;
import ads_mobile_sdk.q9;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P13747563277035175218 {
    public static Z7022156542152740569 a;

    static {
        izmyclvb.qgayjvbiagej2(1967);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ads_mobile_sdk.e42 a(dev.epro.r0.I16631908410500040363 r7) {
        /*
            ads_mobile_sdk.e42 r0 = new ads_mobile_sdk.e42     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = "impression_prerequisite"
            r2 = 0
            int r1 = ads_mobile_sdk.d62.a(r7, r1, r2)     // Catch: java.lang.Exception -> L30
            r3 = 2
            r4 = 3
            r5 = 1
            if (r1 == 0) goto L12
            if (r1 == r5) goto L16
            if (r1 == r3) goto L14
        L12:
            r1 = r5
            goto L17
        L14:
            r1 = r4
            goto L17
        L16:
            r1 = r3
        L17:
            java.lang.String r6 = "click_prerequisite"
            int r6 = ads_mobile_sdk.d62.a(r7, r6, r2)     // Catch: java.lang.Exception -> L30
            if (r6 == 0) goto L23
            if (r6 == r5) goto L26
            if (r6 == r3) goto L25
        L23:
            r3 = r5
            goto L26
        L25:
            r3 = r4
        L26:
            java.lang.String r4 = "notification_flow_enabled"
            boolean r7 = ads_mobile_sdk.d62.a(r7, r4, r2)     // Catch: java.lang.Exception -> L30
            r0.<init>(r1, r3, r7)     // Catch: java.lang.Exception -> L30
            return r0
        L30:
            r7 = move-exception
            ads_mobile_sdk.cc2 r0 = dev.epro.r0.G6547577305291411977.l(r7)
            java.util.ArrayList r0 = r0.s
            java.lang.String r1 = r7.getMessage()
            if (r1 != 0) goto L45
            java.lang.Class r7 = r7.getClass()
            java.lang.String r1 = r7.getName()
        L45:
            r0.add(r1)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P13747563277035175218.a(dev.epro.r0.I16631908410500040363):ads_mobile_sdk.e42");
    }

    public static o9 b(I16631908410500040363 i16631908410500040363) {
        int i;
        try {
            LinkedHashMap linkedHashMap = q9.c;
            q9 q9VarJ = V1475975160983963926.j(i16631908410500040363.w("type_num").j());
            long jN = i16631908410500040363.w("value").n();
            int iJ = i16631908410500040363.w("precision_num").j();
            int i2 = 2;
            if (iJ == 1) {
                i = i2;
            } else if (iJ == 2) {
                i = 3;
            } else if (iJ != 3) {
                i = 1;
            } else {
                i2 = 4;
                i = i2;
            }
            String strP = i16631908410500040363.w("currency").p();
            strP.getClass();
            return new o9(q9VarJ, jN, i, strP);
        } catch (Exception e) {
            ArrayList arrayList = G6547577305291411977.l(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ads_mobile_sdk.o9 c(dev.epro.r0.I16631908410500040363 r10) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = ""
            java.lang.String r0 = ads_mobile_sdk.d62.a(r10, r0, r1)
            java.lang.String r2 = "precision"
            java.lang.String r2 = ads_mobile_sdk.d62.a(r10, r2, r1)
            java.lang.String r3 = "currency"
            java.lang.String r9 = ads_mobile_sdk.d62.a(r10, r3, r1)
            java.lang.String r1 = "value"
            dev.epro.r0.K15572083692188606544 r10 = r10.w(r1)     // Catch: java.lang.Exception -> L1f
            long r3 = r10.n()     // Catch: java.lang.Exception -> L1f
            goto L21
        L1f:
            r3 = 0
        L21:
            int r10 = r0.hashCode()
            r1 = 66934(0x10576, float:9.3795E-41)
            if (r10 == r1) goto L52
            r1 = 66944(0x10580, float:9.3809E-41)
            if (r10 == r1) goto L46
            r1 = 1349395245(0x506e232d, float:1.59811308E10)
            if (r10 == r1) goto L35
            goto L5a
        L35:
            java.lang.String r10 = "ONE_PIXEL"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L3e
            goto L5a
        L3e:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            ads_mobile_sdk.q9 r10 = ads_mobile_sdk.q9.ONE_PIXEL
        L43:
            r5 = r10
            r6 = r3
            goto L60
        L46:
            java.lang.String r10 = "CPM"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L4f
            goto L5a
        L4f:
            ads_mobile_sdk.q9 r10 = ads_mobile_sdk.q9.CPM
            goto L43
        L52:
            java.lang.String r10 = "CPC"
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L5d
        L5a:
            ads_mobile_sdk.q9 r10 = ads_mobile_sdk.q9.UNKNOWN
            goto L43
        L5d:
            ads_mobile_sdk.q9 r10 = ads_mobile_sdk.q9.CPC
            goto L43
        L60:
            int r10 = r2.hashCode()
            r0 = -2131980260(0xffffffff80ec901c, float:-2.1724874E-38)
            if (r10 == r0) goto L8b
            r0 = 399232571(0x17cbce3b, float:1.3170627E-24)
            if (r10 == r0) goto L80
            r0 = 1271254246(0x4bc5cce6, float:2.5926092E7)
            if (r10 == r0) goto L74
            goto L93
        L74:
            java.lang.String r10 = "PUBLISHER_PROVIDED"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L7d
            goto L93
        L7d:
            r10 = 3
        L7e:
            r8 = r10
            goto L97
        L80:
            java.lang.String r10 = "PRECISE"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L89
            goto L93
        L89:
            r10 = 4
            goto L7e
        L8b:
            java.lang.String r10 = "ESTIMATED"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L95
        L93:
            r10 = 1
            goto L7e
        L95:
            r10 = 2
            goto L7e
        L97:
            ads_mobile_sdk.o9 r4 = new ads_mobile_sdk.o9
            r4.<init>(r5, r6, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P13747563277035175218.c(dev.epro.r0.I16631908410500040363):ads_mobile_sdk.o9");
    }

    public static final void d(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            S10973172697741180971.i(i != i2 ? G11450220448113054352.h(i, i2, "Both size ", " and step ", " must be greater than zero.") : G6547577305291411977.o(i, "size ", " must be greater than zero."));
        }
    }

    public static final native JSONObject e(String str, JSONObject jSONObject);

    public static final void f(SQLiteConnection sQLiteConnection, String str) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            T18016951143603335921.y(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public static final ViewParent g(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final Z7022156542152740569 h() {
        Z7022156542152740569 z7022156542152740569 = a;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545D = G11450220448113054352.d(17.65f, 6.35f);
        v14323974914327418545D.d(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        v14323974914327418545D.e(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        v14323974914327418545D.o(3.57f, 8.0f, 7.99f, 8.0f);
        v14323974914327418545D.e(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        v14323974914327418545D.g(-2.08f);
        v14323974914327418545D.e(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        v14323974914327418545D.e(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        v14323974914327418545D.o(2.69f, -6.0f, 6.0f, -6.0f);
        v14323974914327418545D.e(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        v14323974914327418545D.h(13.0f, 11.0f);
        v14323974914327418545D.g(7.0f);
        v14323974914327418545D.r(4.0f);
        v14323974914327418545D.i(-2.35f, 2.35f);
        v14323974914327418545D.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        a = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final O16392062884302746898 i(Q17957571128037780363 q17957571128037780363, int i) {
        K10916014851776401112 k10916014851776401112 = q17957571128037780363.a;
        V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
        if (k10916014851776401112.a.b.length() != 0) {
            int iD = v11538895333762958192.d(i);
            if ((i != 0 && iD == v11538895333762958192.d(i - 1)) || (i != k10916014851776401112.a.b.length() && iD == v11538895333762958192.d(i + 1))) {
                return q17957571128037780363.a(i);
            }
        }
        return q17957571128037780363.i(i);
    }

    public static final boolean j(KeyEvent keyEvent) {
        InputDevice device = keyEvent.getDevice();
        return (device == null || device.isVirtual() || device.getKeyboardType() != 2 || (keyEvent.getFlags() & 2) == 2) ? false : true;
    }

    public static final boolean k(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static long l(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static final native void m(JSONObject jSONObject, String str, String str2);

    public static final native int n(Map map);

    public static H3430986877638506198 o(H3430986877638506198 h3430986877638506198) {
        return ((h3430986877638506198 instanceof E16744721071374399606) || (h3430986877638506198 instanceof K2976652177739377661)) ? h3430986877638506198 : h3430986877638506198 instanceof Serializable ? new K2976652177739377661(h3430986877638506198) : new E16744721071374399606(h3430986877638506198);
    }
}
