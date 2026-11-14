package dev.epro.r0;

import ads_mobile_sdk.d62;
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

/* loaded from: classes3.dex */
public abstract class P13747563277035175218 {
    public static Z7022156542152740569 a;

    static {
        izmyclvb.qgayjvbiagej2(1967);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
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
            q9 j = V1475975160983963926.j(i16631908410500040363.w("type_num").j());
            long n = i16631908410500040363.w("value").n();
            int j2 = i16631908410500040363.w("precision_num").j();
            int i2 = 2;
            if (j2 != 1) {
                if (j2 == 2) {
                    i = 3;
                } else if (j2 != 3) {
                    i = 1;
                } else {
                    i2 = 4;
                }
                String p = i16631908410500040363.w("currency").p();
                p.getClass();
                return new o9(j, n, i, p);
            }
            i = i2;
            String p2 = i16631908410500040363.w("currency").p();
            p2.getClass();
            return new o9(j, n, i, p2);
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

    public static o9 c(I16631908410500040363 i16631908410500040363) {
        long j;
        q9 q9Var;
        int i;
        String a2 = d62.a(i16631908410500040363, "type", "");
        String a3 = d62.a(i16631908410500040363, "precision", "");
        String a4 = d62.a(i16631908410500040363, "currency", "");
        try {
            j = i16631908410500040363.w("value").n();
        } catch (Exception unused) {
            j = 0;
        }
        int hashCode = a2.hashCode();
        if (hashCode == 66934) {
            if (a2.equals("CPC")) {
                q9Var = q9.CPC;
            }
            q9Var = q9.UNKNOWN;
        } else if (hashCode != 66944) {
            if (hashCode == 1349395245 && a2.equals("ONE_PIXEL")) {
                j /= 1000;
                q9Var = q9.ONE_PIXEL;
            }
            q9Var = q9.UNKNOWN;
        } else {
            if (a2.equals("CPM")) {
                q9Var = q9.CPM;
            }
            q9Var = q9.UNKNOWN;
        }
        q9 q9Var2 = q9Var;
        long j2 = j;
        int hashCode2 = a3.hashCode();
        if (hashCode2 == -2131980260) {
            if (a3.equals("ESTIMATED")) {
                i = 2;
            }
            i = 1;
        } else if (hashCode2 != 399232571) {
            if (hashCode2 == 1271254246 && a3.equals("PUBLISHER_PROVIDED")) {
                i = 3;
            }
            i = 1;
        } else {
            if (a3.equals("PRECISE")) {
                i = 4;
            }
            i = 1;
        }
        return new o9(q9Var2, j2, i, a4);
    }

    public static final void d(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            S10973172697741180971.i(i != i2 ? G11450220448113054352.h(i, i2, "Both size ", " and step ", " must be greater than zero.") : G6547577305291411977.o(i, "size ", " must be greater than zero."));
        }
    }

    public static final native JSONObject e(String str, JSONObject jSONObject);

    public static final void f(SQLiteConnection sQLiteConnection, String str) {
        sQLiteConnection.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.step();
            T18016951143603335921.y(prepare, null);
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
        V14323974914327418545 d = G11450220448113054352.d(17.65f, 6.35f);
        d.d(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        d.e(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        d.o(3.57f, 8.0f, 7.99f, 8.0f);
        d.e(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        d.g(-2.08f);
        d.e(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        d.e(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        d.o(2.69f, -6.0f, 6.0f, -6.0f);
        d.e(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        d.h(13.0f, 11.0f);
        d.g(7.0f);
        d.r(4.0f);
        d.i(-2.35f, 2.35f);
        d.c();
        Q17593287602150918564.a(q17593287602150918564, d.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b = q17593287602150918564.b();
        a = b;
        return b;
    }

    public static final O16392062884302746898 i(Q17957571128037780363 q17957571128037780363, int i) {
        K10916014851776401112 k10916014851776401112 = q17957571128037780363.a;
        V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
        if (k10916014851776401112.a.b.length() != 0) {
            int d = v11538895333762958192.d(i);
            if ((i != 0 && d == v11538895333762958192.d(i - 1)) || (i != k10916014851776401112.a.b.length() && d == v11538895333762958192.d(i + 1))) {
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
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    public static final native void m(JSONObject jSONObject, String str, String str2);

    public static final native int n(Map map);

    public static H3430986877638506198 o(H3430986877638506198 h3430986877638506198) {
        return !(h3430986877638506198 instanceof E16744721071374399606) ? h3430986877638506198 instanceof K2976652177739377661 ? h3430986877638506198 : h3430986877638506198 instanceof Serializable ? new K2976652177739377661(h3430986877638506198) : new E16744721071374399606(h3430986877638506198) : h3430986877638506198;
    }
}
