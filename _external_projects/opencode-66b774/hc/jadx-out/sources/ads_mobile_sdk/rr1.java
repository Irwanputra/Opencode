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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.rr1 r24, java.util.Map r25, dev.epro.r0.K14749510448791472029 r26) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rr1.a(ads_mobile_sdk.rr1, java.util.Map, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void a(boolean z) {
        R7033599853981556291.E(this.b, null, null, new W6362393430097503357(this, z, null, (byte) 1), 3);
    }

    public final PopupWindow a(uw2 uw2Var, Activity activity, tx0 tx0Var) {
        String string;
        int i = uw2Var.a;
        activity.getClass();
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        int iApplyDimension = (int) TypedValue.applyDimension(1, i, displayMetrics);
        float f = uw2Var.b;
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, f, displayMetrics2);
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(iApplyDimension, iApplyDimension2));
        relativeLayout.addView(this.g, -1, -1);
        tx0Var.a(new fs3(2, iApplyDimension, iApplyDimension2, 8));
        LinearLayout linearLayout = new LinearLayout(activity);
        DisplayMetrics displayMetrics3 = activity.getResources().getDisplayMetrics();
        displayMetrics3.getClass();
        int iApplyDimension3 = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iApplyDimension3, iApplyDimension3);
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
        if (resources == null || (string = resources.getString(R.string.close_button)) == null) {
            string = "Close button";
        }
        linearLayout.setContentDescription(string);
        relativeLayout.addView(linearLayout, layoutParams);
        PopupWindow popupWindow = new PopupWindow((View) relativeLayout, iApplyDimension, iApplyDimension2, false);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setTouchable(true);
        popupWindow.setClippingEnabled(!uw2Var.e);
        return popupWindow;
    }

    public final void a(tx0 tx0Var, String str) {
        R7033599853981556291.E(this.b, null, null, new H4546125934900659656((Object) str, (Object) this, (Object) tx0Var, (R4833348786910499294) null, (byte) 14), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(1:(1:(1:(8:13|103|14|62|63|42|91|92)(2:20|21))(9:22|101|23|24|110|55|(1:58)|(6:61|62|63|42|91|92)|60))(1:27))(3:28|(1:31)|60)|100|32|(5:34|108|35|36|(4:41|42|91|92)(1:43))|44|(1:46)|47|96|48|49|105|50|51|(5:54|110|55|(0)|(0))|60) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:107|(1:(1:(1:(8:13|103|14|62|63|42|91|92)(2:20|21))(9:22|101|23|24|110|55|(1:58)|(6:61|62|63|42|91|92)|60))(1:27))(3:28|(1:31)|60)|100|32|(5:34|108|35|36|(4:41|42|91|92)(1:43))|44|(1:46)|47|96|48|49|105|50|51|(5:54|110|55|(0)|(0))|60) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01cc, code lost:
    
        r12 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01cf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ee A[Catch: all -> 0x01f1, TryCatch #1 {all -> 0x01f1, blocks: (B:73:0x01d3, B:75:0x01ee, B:80:0x01f7, B:81:0x01fa, B:83:0x01fe, B:84:0x0203, B:86:0x0207, B:87:0x020a, B:89:0x020e), top: B:98:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f7 A[Catch: all -> 0x01f1, TryCatch #1 {all -> 0x01f1, blocks: (B:73:0x01d3, B:75:0x01ee, B:80:0x01f7, B:81:0x01fa, B:83:0x01fe, B:84:0x0203, B:86:0x0207, B:87:0x020a, B:89:0x020e), top: B:98:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fe A[Catch: all -> 0x01f1, TryCatch #1 {all -> 0x01f1, blocks: (B:73:0x01d3, B:75:0x01ee, B:80:0x01f7, B:81:0x01fa, B:83:0x01fe, B:84:0x0203, B:86:0x0207, B:87:0x020a, B:89:0x020e), top: B:98:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0207 A[Catch: all -> 0x01f1, TryCatch #1 {all -> 0x01f1, blocks: (B:73:0x01d3, B:75:0x01ee, B:80:0x01f7, B:81:0x01fa, B:83:0x01fe, B:84:0x0203, B:86:0x0207, B:87:0x020a, B:89:0x020e), top: B:98:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #1 {all -> 0x01f1, blocks: (B:73:0x01d3, B:75:0x01ee, B:80:0x01f7, B:81:0x01fa, B:83:0x01fe, B:84:0x0203, B:86:0x0207, B:87:0x020a, B:89:0x020e), top: B:98:0x01d3 }] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
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
    public final java.lang.Object a(android.view.ViewGroup r17, ads_mobile_sdk.uw2 r18, android.app.Activity r19, android.view.Window r20, ads_mobile_sdk.tx0 r21, ads_mobile_sdk.jy0 r22, dev.epro.r0.K14749510448791472029 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rr1.a(android.view.ViewGroup, ads_mobile_sdk.uw2, android.app.Activity, android.view.Window, ads_mobile_sdk.tx0, ads_mobile_sdk.jy0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.rr1 r10, boolean r11, dev.epro.r0.K14749510448791472029 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rr1.a(ads_mobile_sdk.rr1, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
