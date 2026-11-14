package ads_mobile_sdk;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import dev.epro.r0.V5431423861497278836;
import dev.epro.r0.Z1210210371491270950;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import net.zetetic.database.CursorWindow;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class q extends t93 {
    public final Object f;
    public final Object g;
    public final /* synthetic */ byte l = 1;

    public q(V5431423861497278836 v5431423861497278836, rp1 rp1Var, View view, Activity activity, vi3 vi3Var) {
        super("YogFlZs1RNid8jXejn6sh6rwte9QKE4YgqGrhuNwxPzA3TxHPCNCCaIcAYI8Ditv", "75AF8KO808mso+ucw9eYaxGBzfCZKKkZyn5a9bWi1r0=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_ACTIVITY_SIGNALS_TASK));
        this.g = view;
        this.f = activity;
    }

    @Override // ads_mobile_sdk.t93
    public final void a(Method method, V5431423861497278836 v5431423861497278836) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.l) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.g, (Activity) this.f);
                objArr.getClass();
                synchronized (v5431423861497278836) {
                    long longValue = ((Long) objArr[0]).longValue();
                    v5431423861497278836.b();
                    pd pdVar = (pd) v5431423861497278836.b;
                    i = pdVar.bitField1_;
                    pdVar.bitField1_ = i | 67108864;
                    pdVar.activityIntentSignal_ = longValue;
                    long longValue2 = ((Long) objArr[1]).longValue();
                    v5431423861497278836.b();
                    pd pdVar2 = (pd) v5431423861497278836.b;
                    i2 = pdVar2.bitField1_;
                    pdVar2.bitField1_ = i2 | 134217728;
                    pdVar2.activityStackSizeSignal_ = longValue2;
                    String str = (String) objArr[2];
                    v5431423861497278836.b();
                    ((pd) v5431423861497278836.b).b(str);
                }
                return;
            case 1:
                Long[] lArr = new Long[9];
                Arrays.fill((Object[]) lArr, (Object) (-1L));
                Long l = (Long) ((Map) this.f).get("tcq");
                if (l == null) {
                    l = -1L;
                }
                lArr[0] = l;
                Long l2 = (Long) ((Map) this.f).get("tpq");
                if (l2 == null) {
                    l2 = -1L;
                }
                lArr[1] = l2;
                Long l3 = (Long) ((Map) this.f).get("tcv");
                if (l3 == null) {
                    l3 = -1L;
                }
                lArr[2] = l3;
                Long l4 = (Long) ((Map) this.f).get("tpv");
                if (l4 == null) {
                    l4 = -1L;
                }
                lArr[3] = l4;
                Long l5 = (Long) ((Map) this.f).get("tchv");
                if (l5 == null) {
                    l5 = -1L;
                }
                lArr[4] = l5;
                Long l6 = (Long) ((Map) this.f).get("tphv");
                if (l6 == null) {
                    l6 = -1L;
                }
                lArr[5] = l6;
                Long l7 = (Long) ((Map) this.f).get("tcc");
                if (l7 == null) {
                    l7 = -1L;
                }
                lArr[6] = l7;
                Long l8 = (Long) ((Map) this.f).get("tpc");
                if (l8 == null) {
                    l8 = -1L;
                }
                lArr[7] = l8;
                Long l9 = (Long) ((Map) this.f).get("tst");
                if (l9 == null) {
                    l9 = -1L;
                }
                lArr[8] = l9;
                for (int i16 = 0; i16 < 9; i16++) {
                    if (lArr[i16] == null) {
                        lArr[i16] = -1L;
                    }
                }
                Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((sb3) this.g).ordinal()));
                lArr2.getClass();
                synchronized (v5431423861497278836) {
                    long longValue3 = lArr2[0].longValue();
                    v5431423861497278836.b();
                    pd pdVar3 = (pd) v5431423861497278836.b;
                    i3 = pdVar3.bitField3_;
                    pdVar3.bitField3_ = i3 | 32;
                    pdVar3.evtTime_ = longValue3;
                    long longValue4 = lArr2[1].longValue();
                    v5431423861497278836.b();
                    pd pdVar4 = (pd) v5431423861497278836.b;
                    i4 = pdVar4.bitField0_;
                    pdVar4.bitField0_ = i4 | 134217728;
                    pdVar4.utzSignal_ = longValue4;
                    long longValue5 = lArr2[2].longValue();
                    v5431423861497278836.b();
                    pd pdVar5 = (pd) v5431423861497278836.b;
                    i5 = pdVar5.bitField0_;
                    pdVar5.bitField0_ = i5 | 2097152;
                    pdVar5.usgSignal_ = longValue5;
                    long longValue6 = lArr2[3].longValue();
                    v5431423861497278836.b();
                    pd pdVar6 = (pd) v5431423861497278836.b;
                    i6 = pdVar6.bitField0_;
                    pdVar6.bitField0_ = i6 | 65536;
                    pdVar6.uptSignal_ = longValue6;
                    long longValue7 = lArr2[4].longValue();
                    v5431423861497278836.b();
                    pd pdVar7 = (pd) v5431423861497278836.b;
                    i7 = pdVar7.bitField2_;
                    pdVar7.bitField2_ = i7 | 8192;
                    pdVar7.impressionDurationMs_ = longValue7;
                    long longValue8 = lArr2[5].longValue();
                    v5431423861497278836.b();
                    pd pdVar8 = (pd) v5431423861497278836.b;
                    i8 = pdVar8.bitField2_;
                    pdVar8.bitField2_ = i8 | CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                    pdVar8.impressionDurationHighAttentionMs_ = longValue8;
                    long longValue9 = lArr2[6].longValue();
                    v5431423861497278836.b();
                    pd pdVar9 = (pd) v5431423861497278836.b;
                    i9 = pdVar9.bitField1_;
                    pdVar9.bitField1_ = i9 | 4096;
                    pdVar9.deviceElapsedRealTimeSignal_ = longValue9;
                    long longValue10 = lArr2[7].longValue();
                    v5431423861497278836.b();
                    pd pdVar10 = (pd) v5431423861497278836.b;
                    i10 = pdVar10.bitField1_;
                    pdVar10.bitField1_ = i10 | 8192;
                    pdVar10.deviceUptimeSignal_ = longValue10;
                }
                return;
            default:
                View view = (View) this.g;
                if (view == null) {
                    return;
                }
                Object invoke = method.invoke("", (DisplayMetrics) this.f, view);
                invoke.getClass();
                Long[] lArr3 = (Long[]) invoke;
                Z1210210371491270950 o2 = od.o();
                long longValue11 = lArr3[2].longValue();
                o2.b();
                od odVar = (od) o2.b;
                i11 = odVar.bitField0_;
                odVar.bitField0_ = i11 | 4;
                odVar.minAlphaSignal_ = longValue11;
                long longValue12 = lArr3[1].longValue();
                o2.b();
                od odVar2 = (od) o2.b;
                i12 = odVar2.bitField0_;
                odVar2.bitField0_ = 8 | i12;
                odVar2.viewHeight_ = longValue12;
                long longValue13 = lArr3[0].longValue();
                o2.b();
                od odVar3 = (od) o2.b;
                i13 = odVar3.bitField0_;
                odVar3.bitField0_ = i13 | 16;
                odVar3.viewWidth_ = longValue13;
                long longValue14 = lArr3[3].longValue();
                o2.b();
                od odVar4 = (od) o2.b;
                i14 = odVar4.bitField0_;
                odVar4.bitField0_ = i14 | 1;
                odVar4.percentAdOnScreen_ = longValue14;
                long longValue15 = lArr3[4].longValue();
                o2.b();
                od odVar5 = (od) o2.b;
                i15 = odVar5.bitField0_;
                odVar5.bitField0_ = i15 | 32;
                odVar5.displayDensity_ = longValue15;
                synchronized (v5431423861497278836) {
                    od odVar6 = (od) o2.a();
                    v5431423861497278836.b();
                    ((pd) v5431423861497278836.b).a(odVar6);
                }
                return;
        }
    }

    public q(V5431423861497278836 v5431423861497278836, rp1 rp1Var, DisplayMetrics displayMetrics, View view, vi3 vi3Var) {
        super("ktF+VSqkyodZ4tIducgfLzYxzdB5ofNGaymoDbvueLMrjNjMtHTNPm366Piu8CC0", "rXm9R0gBTUHduh38r/rV98JLnl4TdPu3aUnjFtquoyc=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_VIEW_SIGNALS_TASK));
        this.f = displayMetrics;
        this.g = view;
    }

    public q(V5431423861497278836 v5431423861497278836, rp1 rp1Var, sb3 sb3Var, Map map, vi3 vi3Var) {
        super("UGEehKvlkU4SDW4B4NE5sq9Y1SUhBYeK8lA7WvxibEr5oNTwuJn6DZSm7y2VXAMQ", "y8kGBnxfl+gCJUlPjWurqThF+Nx8iRaiEfVAIjzOakY=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_TIME_SIGNALS_TASK));
        this.f = map;
        this.g = sb3Var;
    }
}
