package ads_mobile_sdk;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.H4546125934900659656;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.U15842361112894803844;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.W6362393430097503357;
import dev.epro.r0.X5670102799181443745;
import java.util.Optional;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class rr1 {
    public final bq1 a;
    public final W5797197595347441198 b;
    public final W5797197595347441198 c;
    public final js1 d;
    public final g0 e;
    public final A8094652504661216977 f;
    public final jy0 g;
    public final tx0 h;
    public final H15186625828076266306 i;
    public PopupWindow j;
    public ImageView k;
    public ViewGroup.LayoutParams l;
    public fs3 m;
    public ViewGroup n;

    public rr1(bq1 bq1Var, W5797197595347441198 w5797197595347441198, W5797197595347441198 w57971975953474411982, js1 js1Var, Optional optional, g0 g0Var, A8094652504661216977 a8094652504661216977) {
        bq1Var.getClass();
        w5797197595347441198.getClass();
        w57971975953474411982.getClass();
        js1Var.getClass();
        optional.getClass();
        g0Var.getClass();
        a8094652504661216977.getClass();
        this.a = bq1Var;
        this.b = w5797197595347441198;
        this.c = w57971975953474411982;
        this.d = js1Var;
        this.e = g0Var;
        this.f = a8094652504661216977;
        jy0 jy0Var = (jy0) optional.orElse(null);
        this.g = jy0Var;
        this.h = jy0Var != null ? jy0Var.a : null;
        this.i = new H15186625828076266306();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.rr1 r24, java.util.Map r25, dev.epro.r0.K14749510448791472029 r26) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rr1.a(ads_mobile_sdk.rr1, java.util.Map, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void a(boolean z) {
        R7033599853981556291.E(this.b, null, null, new W6362393430097503357(this, z, null, (byte) 1), 3);
    }

    public final PopupWindow a(uw2 uw2Var, Activity activity, tx0 tx0Var) {
        String str;
        int i = uw2Var.a;
        activity.getClass();
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        int applyDimension = (int) TypedValue.applyDimension(1, i, displayMetrics);
        float f = uw2Var.b;
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        int applyDimension2 = (int) TypedValue.applyDimension(1, f, displayMetrics2);
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(applyDimension, applyDimension2));
        relativeLayout.addView(this.g, -1, -1);
        tx0Var.a(new fs3(2, applyDimension, applyDimension2, 8));
        LinearLayout linearLayout = new LinearLayout(activity);
        DisplayMetrics displayMetrics3 = activity.getResources().getDisplayMetrics();
        displayMetrics3.getClass();
        int applyDimension3 = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(applyDimension3, applyDimension3);
        U15842361112894803844 u15842361112894803844 = uw2Var.f.a;
        int i2 = u15842361112894803844.d;
        int i3 = 0;
        while (i3 < i2) {
            Object obj = u15842361112894803844.get(i3);
            i3++;
            layoutParams.addRule(((Number) obj).intValue());
        }
        linearLayout.setOnClickListener(new X5670102799181443745(this, (byte) 2));
        Resources resources = activity.getResources();
        if (resources == null || (str = resources.getString(R.string.close_button)) == null) {
            str = "Close button";
        }
        linearLayout.setContentDescription(str);
        relativeLayout.addView(linearLayout, layoutParams);
        PopupWindow popupWindow = new PopupWindow((View) relativeLayout, applyDimension, applyDimension2, false);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setTouchable(true);
        popupWindow.setClippingEnabled(!uw2Var.e);
        return popupWindow;
    }

    public final void a(tx0 tx0Var, String str) {
        R7033599853981556291.E(this.b, null, null, new H4546125934900659656((Object) str, (Object) this, (Object) tx0Var, (R4833348786910499294) null, (byte) 14), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:3|(18:5|6|7|(1:(1:(1:(8:12|13|14|15|16|17|18|19)(2:47|48))(9:49|50|51|52|53|54|(1:56)|(6:59|15|16|17|18|19)|58))(1:66))(3:98|(1:100)|58)|67|68|(5:70|71|72|73|(4:75|17|18|19)(1:76))|79|(1:81)|82|83|84|85|86|87|88|(5:90|53|54|(0)|(0))|58))|67|68|(0)|79|(0)|82|83|84|85|86|87|88|(0)|58) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:(2:3|(18:5|6|7|(1:(1:(1:(8:12|13|14|15|16|17|18|19)(2:47|48))(9:49|50|51|52|53|54|(1:56)|(6:59|15|16|17|18|19)|58))(1:66))(3:98|(1:100)|58)|67|68|(5:70|71|72|73|(4:75|17|18|19)(1:76))|79|(1:81)|82|83|84|85|86|87|88|(5:90|53|54|(0)|(0))|58))|7|(0)(0)|67|68|(0)|79|(0)|82|83|84|85|86|87|88|(0)|58) */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cc, code lost:
    
        r12 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ee A[Catch: all -> 0x01f1, TryCatch #1 {all -> 0x01f1, blocks: (B:25:0x01d3, B:27:0x01ee, B:29:0x01f7, B:30:0x01fa, B:32:0x01fe, B:33:0x0203, B:35:0x0207, B:36:0x020a, B:38:0x020e), top: B:24:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f7 A[Catch: all -> 0x01f1, TryCatch #1 {all -> 0x01f1, blocks: (B:25:0x01d3, B:27:0x01ee, B:29:0x01f7, B:30:0x01fa, B:32:0x01fe, B:33:0x0203, B:35:0x0207, B:36:0x020a, B:38:0x020e), top: B:24:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01fe A[Catch: all -> 0x01f1, TryCatch #1 {all -> 0x01f1, blocks: (B:25:0x01d3, B:27:0x01ee, B:29:0x01f7, B:30:0x01fa, B:32:0x01fe, B:33:0x0203, B:35:0x0207, B:36:0x020a, B:38:0x020e), top: B:24:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0207 A[Catch: all -> 0x01f1, TryCatch #1 {all -> 0x01f1, blocks: (B:25:0x01d3, B:27:0x01ee, B:29:0x01f7, B:30:0x01fa, B:32:0x01fe, B:33:0x0203, B:35:0x0207, B:36:0x020a, B:38:0x020e), top: B:24:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x020e A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #1 {all -> 0x01f1, blocks: (B:25:0x01d3, B:27:0x01ee, B:29:0x01f7, B:30:0x01fa, B:32:0x01fe, B:33:0x0203, B:35:0x0207, B:36:0x020a, B:38:0x020e), top: B:24:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7 A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #2 {all -> 0x0102, blocks: (B:68:0x00c3, B:70:0x00c7, B:72:0x00da, B:73:0x00e8, B:75:0x0108, B:76:0x0110, B:79:0x0114, B:81:0x011b, B:82:0x011e, B:84:0x0126, B:87:0x0180), top: B:67:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011b A[Catch: all -> 0x0102, TryCatch #2 {all -> 0x0102, blocks: (B:68:0x00c3, B:70:0x00c7, B:72:0x00da, B:73:0x00e8, B:75:0x0108, B:76:0x0110, B:79:0x0114, B:81:0x011b, B:82:0x011e, B:84:0x0126, B:87:0x0180), top: B:67:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r4v18, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.ViewGroup r17, ads_mobile_sdk.uw2 r18, android.app.Activity r19, android.view.Window r20, ads_mobile_sdk.tx0 r21, ads_mobile_sdk.jy0 r22, dev.epro.r0.K14749510448791472029 r23) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rr1.a(android.view.ViewGroup, ads_mobile_sdk.uw2, android.app.Activity, android.view.Window, ads_mobile_sdk.tx0, ads_mobile_sdk.jy0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0058, code lost:
    
        if (r12.c(r0) == r6) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:15:0x00d8, B:30:0x005c, B:34:0x0066, B:37:0x006c, B:39:0x0073, B:41:0x0077, B:43:0x0082, B:45:0x008b, B:46:0x008e, B:48:0x0092, B:49:0x0095, B:52:0x009f), top: B:29:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:15:0x00d8, B:30:0x005c, B:34:0x0066, B:37:0x006c, B:39:0x0073, B:41:0x0077, B:43:0x0082, B:45:0x008b, B:46:0x008e, B:48:0x0092, B:49:0x0095, B:52:0x009f), top: B:29:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:15:0x00d8, B:30:0x005c, B:34:0x0066, B:37:0x006c, B:39:0x0073, B:41:0x0077, B:43:0x0082, B:45:0x008b, B:46:0x008e, B:48:0x0092, B:49:0x0095, B:52:0x009f), top: B:29:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:15:0x00d8, B:30:0x005c, B:34:0x0066, B:37:0x006c, B:39:0x0073, B:41:0x0077, B:43:0x0082, B:45:0x008b, B:46:0x008e, B:48:0x0092, B:49:0x0095, B:52:0x009f), top: B:29:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v10, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r10v13, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.rr1 r10, boolean r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rr1.a(ads_mobile_sdk.rr1, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
