package ads_mobile_sdk;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.F4673815160636847046;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K15572083692188606544;
import dev.epro.r0.L10099138097812701130;
import dev.epro.r0.L622219180424329983;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.Q7316561721656982910;
import dev.epro.r0.R17673595953307659557;
import dev.epro.r0.R471735865396224762;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.S11564727846197427291;
import dev.epro.r0.S8064361206571326475;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.X9852054718446117252;
import dev.epro.r0.Y4798753258822141670;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class m92 implements Y4798753258822141670 {
    public final Context a;
    public final jr0 b;
    public final rw0 c;
    public final k8 d;
    public final y2 e;
    public final g0 f;
    public final V2597580950516131749 g;
    public final V2597580950516131749 h;
    public final rr1 i;
    public final qw2 j;
    public final i80 k;
    public final zm0 l;
    public final z1 m;
    public final z03 n;

    /* renamed from: o, reason: collision with root package name */
    public final t42 f75o;
    public final zg2 p;
    public final j01 q;
    public final ci3 r;
    public final hv s;

    public m92(Context context, jr0 jr0Var, rw0 rw0Var, k8 k8Var, y2 y2Var, g0 g0Var, d92 d92Var, V2597580950516131749 v2597580950516131749, rr1 rr1Var, qw2 qw2Var, i80 i80Var, zm0 zm0Var, z1 z1Var, z03 z03Var, t42 t42Var, zg2 zg2Var, j01 j01Var, ci3 ci3Var, hv hvVar) {
        context.getClass();
        jr0Var.getClass();
        rw0Var.getClass();
        k8Var.getClass();
        y2Var.getClass();
        g0Var.getClass();
        d92Var.getClass();
        v2597580950516131749.getClass();
        rr1Var.getClass();
        qw2Var.getClass();
        i80Var.getClass();
        zm0Var.getClass();
        z1Var.getClass();
        z03Var.getClass();
        t42Var.getClass();
        zg2Var.getClass();
        j01Var.getClass();
        ci3Var.getClass();
        hvVar.getClass();
        this.a = context;
        this.b = jr0Var;
        this.c = rw0Var;
        this.d = k8Var;
        this.e = y2Var;
        this.f = g0Var;
        this.g = d92Var;
        this.h = v2597580950516131749;
        this.i = rr1Var;
        this.j = qw2Var;
        this.k = i80Var;
        this.l = zm0Var;
        this.m = z1Var;
        this.n = z03Var;
        this.f75o = t42Var;
        this.p = zg2Var;
        this.q = j01Var;
        this.r = ci3Var;
        this.s = hvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x024c, code lost:
    
        if (r0 == r12) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x026b, code lost:
    
        if (r1.b(r2, r8, r7, r19, r6) == r12) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02c7, code lost:
    
        if (dev.epro.r0.S10823041268949770285.t(r1.a.getPackageName(), r0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x036c, code lost:
    
        if (r1.a(r2, r14, r4, r7, r19, r6) == r12) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x06bf, code lost:
    
        if (r0 == r12) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0597, code lost:
    
        if (ads_mobile_sdk.z03.a(r10, r4, r9) != r12) goto L222;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    @Override // dev.epro.r0.Y4798753258822141670
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r19, java.util.Map r20, dev.epro.r0.R4833348786910499294 r21) {
        /*
            Method dump skipped, instructions count: 1782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m92.a(ads_mobile_sdk.tx0, java.util.Map, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.tx0 r10, java.util.Map r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m92.b(ads_mobile_sdk.tx0, java.util.Map, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        int hashCode = str.hashCode();
        return hashCode != 99 ? hashCode != 108 ? (hashCode == 112 && str.equals("p")) ? 7 : -1 : str.equals("l") ? 6 : -1 : !str.equals("c") ? -1 : 14;
    }

    public final Map b(String str) {
        int length = str.length();
        X9852054718446117252 x9852054718446117252 = X9852054718446117252.a;
        if (length == 0) {
            return x9852054718446117252;
        }
        try {
            Object b = new F14240031463097426304().b(I16631908410500040363.class, str);
            b.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((S11564727846197427291) ((I16631908410500040363) b).a.entrySet()).iterator();
            while (((L622219180424329983) it).hasNext()) {
                S8064361206571326475 a = ((L622219180424329983) it).a();
                String str2 = (String) a.getKey();
                K15572083692188606544 k15572083692188606544 = (K15572083692188606544) a.getValue();
                str2.getClass();
                String p = k15572083692188606544.p();
                p.getClass();
                linkedHashMap.put(str2, p);
            }
            return linkedHashMap;
        } catch (Exception e) {
            this.r.a("OpenGmsgHandler.parseHsdpExtraQueryParams", (Throwable) e);
            return x9852054718446117252;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x010d, code lost:
    
        if (r4.a(r3, r1, r5, r8, r9, r10, r11, r12, r13, r14) != r15) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010f, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        if (ads_mobile_sdk.z03.a(r0, r13, r14) == r15) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Map r17, boolean r18, boolean r19, ads_mobile_sdk.tx0 r20, dev.epro.r0.K14749510448791472029 r21) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m92.b(java.util.Map, boolean, boolean, ads_mobile_sdk.tx0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 4;
    }

    public final ResolveInfo a(Intent intent, List list) {
        Object obj;
        ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (S10823041268949770285.t(((ResolveInfo) obj).activityInfo.name, resolveActivity.activityInfo.name)) {
                    break;
                }
            }
            if (obj != null) {
                return resolveActivity;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0231 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0232 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.app.Activity, android.net.Uri, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16, types: [ads_mobile_sdk.m92, ads_mobile_sdk.tx0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [ads_mobile_sdk.m92, ads_mobile_sdk.tx0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r17, boolean r18, boolean r19, boolean r20, ads_mobile_sdk.tx0 r21, dev.epro.r0.K14749510448791472029 r22) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m92.a(java.util.Map, boolean, boolean, boolean, ads_mobile_sdk.tx0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:3|(17:5|6|7|(12:(2:124|(1:(11:127|128|129|130|53|54|(1:56)(1:70)|(1:58)(4:65|66|67|68)|59|60|61)(2:134|135))(13:136|137|138|139|(3:73|74|(1:76))|52|53|54|(0)(0)|(0)(0)|59|60|61))(4:10|11|12|13)|121|31|32|(1:34)(1:49)|(1:36)(3:45|(1:47)|48)|37|38|(1:40)(1:44)|41|42|43)(2:144|(1:204)(7:154|155|156|158|159|160|(8:185|186|187|(1:189)(1:194)|(1:191)(1:192)|41|42|43)(13:164|165|166|167|168|169|170|171|172|173|174|(1:176)|25)))|14|15|(6:18|19|20|21|22|23)|50|(0)|52|53|54|(0)(0)|(0)(0)|59|60|61))|14|15|(6:18|19|20|21|22|23)|50|(0)|52|53|54|(0)(0)|(0)(0)|59|60|61) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0154, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0155, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ba, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0151, code lost:
    
        if (r4 != r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0191, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0192, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017b, code lost:
    
        if (r0.a(r12) == r6) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b0 A[Catch: all -> 0x028a, TRY_LEAVE, TryCatch #7 {all -> 0x028a, blocks: (B:83:0x0277, B:85:0x027e, B:87:0x0282, B:89:0x0286, B:90:0x028d, B:92:0x0291, B:94:0x0295, B:96:0x0299, B:97:0x029a, B:98:0x029f, B:99:0x02a0, B:100:0x02a7, B:101:0x02a8, B:102:0x02af, B:103:0x02b0), top: B:82:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0215 A[Catch: all -> 0x017e, TryCatch #20 {all -> 0x017e, blocks: (B:54:0x0184, B:56:0x018c, B:59:0x01ac, B:65:0x0199, B:68:0x01a1, B:32:0x020d, B:34:0x0215, B:37:0x0242, B:40:0x0267, B:44:0x026d, B:45:0x021e, B:48:0x0230, B:74:0x0168, B:76:0x016c), top: B:73:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0267 A[Catch: all -> 0x017e, TRY_ENTER, TryCatch #20 {all -> 0x017e, blocks: (B:54:0x0184, B:56:0x018c, B:59:0x01ac, B:65:0x0199, B:68:0x01a1, B:32:0x020d, B:34:0x0215, B:37:0x0242, B:40:0x0267, B:44:0x026d, B:45:0x021e, B:48:0x0230, B:74:0x0168, B:76:0x016c), top: B:73:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x026d A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #20 {all -> 0x017e, blocks: (B:54:0x0184, B:56:0x018c, B:59:0x01ac, B:65:0x0199, B:68:0x01a1, B:32:0x020d, B:34:0x0215, B:37:0x0242, B:40:0x0267, B:44:0x026d, B:45:0x021e, B:48:0x0230, B:74:0x0168, B:76:0x016c), top: B:73:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021e A[Catch: all -> 0x017e, TryCatch #20 {all -> 0x017e, blocks: (B:54:0x0184, B:56:0x018c, B:59:0x01ac, B:65:0x0199, B:68:0x01a1, B:32:0x020d, B:34:0x0215, B:37:0x0242, B:40:0x0267, B:44:0x026d, B:45:0x021e, B:48:0x0230, B:74:0x0168, B:76:0x016c), top: B:73:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018c A[Catch: all -> 0x017e, Exception -> 0x0191, TryCatch #11 {Exception -> 0x0191, blocks: (B:54:0x0184, B:56:0x018c, B:65:0x0199), top: B:53:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0199 A[Catch: all -> 0x017e, Exception -> 0x0191, TRY_LEAVE, TryCatch #11 {Exception -> 0x0191, blocks: (B:54:0x0184, B:56:0x018c, B:65:0x0199), top: B:53:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027e A[Catch: all -> 0x028a, TryCatch #7 {all -> 0x028a, blocks: (B:83:0x0277, B:85:0x027e, B:87:0x0282, B:89:0x0286, B:90:0x028d, B:92:0x0291, B:94:0x0295, B:96:0x0299, B:97:0x029a, B:98:0x029f, B:99:0x02a0, B:100:0x02a7, B:101:0x02a8, B:102:0x02af, B:103:0x02b0), top: B:82:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [ads_mobile_sdk.cc2] */
    /* JADX WARN: Type inference failed for: r10v12, types: [ads_mobile_sdk.cc2] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [ads_mobile_sdk.cc2] */
    /* JADX WARN: Type inference failed for: r10v9, types: [ads_mobile_sdk.cc2] */
    /* JADX WARN: Type inference failed for: r11v3, types: [ads_mobile_sdk.j01] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ads_mobile_sdk.m92] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [dev.epro.r0.O9245300239821758723] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r17, boolean r18, boolean r19, ads_mobile_sdk.tx0 r20, dev.epro.r0.K14749510448791472029 r21) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m92.a(java.util.Map, boolean, boolean, ads_mobile_sdk.tx0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ads_mobile_sdk.tx0 r5, java.lang.String r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m92.a(ads_mobile_sdk.tx0, java.lang.String, dev.epro.r0.K14749510448791472029):void");
    }

    public final void a(Q7316561721656982910 q7316561721656982910, Activity activity, Uri uri, String str, Map map) {
        ActivityOptions activityOptions;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (q7316561721656982910 != null) {
            intent.setPackage(((ComponentName) q7316561721656982910.d).getPackageName());
            F4673815160636847046 f4673815160636847046 = (F4673815160636847046) q7316561721656982910.c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", f4673815160636847046);
            intent.putExtras(bundle);
        }
        jr0 jr0Var = this.b;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:cct_v2_partial_custom_tab_config:enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
            String str2 = (String) map.get("cct_init_h");
            String str3 = (String) map.get("cct_bp");
            if (str2 != null && !M8927913404651150384.Y(str2) && Integer.parseInt(str2) > 0) {
                int parseInt = Integer.parseInt(str2);
                if (parseInt > 0) {
                    intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", parseInt);
                    intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
                } else {
                    S10973172697741180971.j("Invalid value for the initialHeightPx argument");
                    return;
                }
            }
            if (str3 != null && !M8927913404651150384.Y(str3) && Integer.parseInt(str3) >= 0 && Integer.parseInt(str3) <= 2) {
                int parseInt2 = Integer.parseInt(str3);
                if (parseInt2 >= 0 && parseInt2 <= 2) {
                    intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", parseInt2);
                } else {
                    S10973172697741180971.j("Invalid value for the position argument");
                    return;
                }
            }
        }
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle2 = new Bundle();
            bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        String a = R17673595953307659557.a();
        if (!TextUtils.isEmpty(a)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            activityOptions = L10099138097812701130.a();
            R471735865396224762.a(activityOptions, false);
        } else {
            activityOptions = null;
        }
        Bundle bundle3 = activityOptions != null ? activityOptions.toBundle() : null;
        intent.setPackage(str);
        intent.setData(uri);
        activity.startActivity(intent, bundle3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r8.a(r0) != r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r6 == r7) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r9, boolean r10, boolean r11, boolean r12, boolean r13, ads_mobile_sdk.tx0 r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof ads_mobile_sdk.k92
            if (r0 == 0) goto L13
            r0 = r15
            ads_mobile_sdk.k92 r0 = (ads_mobile_sdk.k92) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.k92 r0 = new ads_mobile_sdk.k92
            r0.<init>(r8, r15)
        L18:
            java.lang.Object r15 = r0.f
            int r1 = r0.h
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L50
            if (r1 == r5) goto L42
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            dev.epro.r0.E17665849472693074628.k(r15)
            return r6
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r2
        L36:
            boolean r8 = r0.d
            boolean r9 = r0.c
            ads_mobile_sdk.tx0 r10 = r0.b
            java.util.Map r11 = r0.a
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L88
        L42:
            boolean r13 = r0.e
            boolean r11 = r0.d
            boolean r10 = r0.c
            ads_mobile_sdk.tx0 r14 = r0.b
            java.util.Map r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L6b
        L50:
            dev.epro.r0.E17665849472693074628.k(r15)
            if (r10 == 0) goto L6b
            if (r12 == 0) goto L6b
            r0.a = r9
            r0.b = r14
            r0.c = r10
            r0.d = r11
            r0.e = r13
            r0.h = r5
            ads_mobile_sdk.y2 r8 = r8.e
            r8.n(r0)
            if (r6 != r7) goto L6b
            goto Lac
        L6b:
            if (r10 == 0) goto L84
            if (r13 == 0) goto L84
            ads_mobile_sdk.et0 r8 = r14.f113o
            if (r8 == 0) goto L84
            r0.a = r9
            r0.b = r14
            r0.c = r10
            r0.d = r11
            r0.h = r4
            dev.epro.r0.O9245300239821758723 r8 = r8.a(r0)
            if (r8 != r7) goto L84
            goto Lac
        L84:
            r8 = r11
            r11 = r9
            r9 = r10
            r10 = r14
        L88:
            if (r8 == 0) goto Lad
            dev.epro.r0.I16631908410500040363 r8 = new dev.epro.r0.I16631908410500040363
            r8.<init>()
            java.lang.String r12 = "event_id"
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.r(r11, r9)
            r0.a = r2
            r0.b = r2
            r0.h = r3
            java.lang.String r9 = "openIntentAsync"
            java.lang.Object r8 = r10.a(r8, r9, r0)
            if (r8 != r7) goto Lad
        Lac:
            return r7
        Lad:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m92.a(java.util.Map, boolean, boolean, boolean, boolean, ads_mobile_sdk.tx0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
