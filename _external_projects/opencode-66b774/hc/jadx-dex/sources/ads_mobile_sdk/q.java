package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class q extends ads_mobile_sdk.t93 {
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final /* synthetic */ byte l = 1;

    public q(dev.epro.r0.V5431423861497278836 v5431423861497278836, ads_mobile_sdk.rp1 rp1Var, android.view.View view, android.app.Activity activity, ads_mobile_sdk.vi3 vi3Var) {
        super("YogFlZs1RNid8jXejn6sh6rwte9QKE4YgqGrhuNwxPzA3TxHPCNCCaIcAYI8Ditv", "75AF8KO808mso+ucw9eYaxGBzfCZKKkZyn5a9bWi1r0=", v5431423861497278836, rp1Var, vi3Var.a(ads_mobile_sdk.yk0.EVENT_ID_ACTIVITY_SIGNALS_TASK));
        this.g = view;
        this.f = activity;
    }

    @Override // ads_mobile_sdk.t93
    public final void a(java.lang.reflect.Method method, dev.epro.r0.V5431423861497278836 v5431423861497278836) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        switch (this.l) {
            case 0:
                java.lang.Object[] objArr = (java.lang.Object[]) method.invoke("", (android.view.View) this.g, (android.app.Activity) this.f);
                objArr.getClass();
                synchronized (v5431423861497278836) {
                    long jLongValue = ((java.lang.Long) objArr[0]).longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar.bitField1_ |= 67108864;
                    pdVar.activityIntentSignal_ = jLongValue;
                    long jLongValue2 = ((java.lang.Long) objArr[1]).longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar2 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar2.bitField1_ |= 134217728;
                    pdVar2.activityStackSizeSignal_ = jLongValue2;
                    java.lang.String str = (java.lang.String) objArr[2];
                    v5431423861497278836.b();
                    ((ads_mobile_sdk.pd) v5431423861497278836.b).b(str);
                    break;
                }
                return;
            case 1:
                java.lang.Long[] lArr = new java.lang.Long[9];
                java.util.Arrays.fill((java.lang.Object[]) lArr, (java.lang.Object) (-1L));
                java.lang.Long l = (java.lang.Long) ((java.util.Map) this.f).get("tcq");
                if (l == null) {
                    l = -1L;
                }
                lArr[0] = l;
                java.lang.Long l2 = (java.lang.Long) ((java.util.Map) this.f).get("tpq");
                if (l2 == null) {
                    l2 = -1L;
                }
                lArr[1] = l2;
                java.lang.Long l3 = (java.lang.Long) ((java.util.Map) this.f).get("tcv");
                if (l3 == null) {
                    l3 = -1L;
                }
                lArr[2] = l3;
                java.lang.Long l4 = (java.lang.Long) ((java.util.Map) this.f).get("tpv");
                if (l4 == null) {
                    l4 = -1L;
                }
                lArr[3] = l4;
                java.lang.Long l5 = (java.lang.Long) ((java.util.Map) this.f).get("tchv");
                if (l5 == null) {
                    l5 = -1L;
                }
                lArr[4] = l5;
                java.lang.Long l6 = (java.lang.Long) ((java.util.Map) this.f).get("tphv");
                if (l6 == null) {
                    l6 = -1L;
                }
                lArr[5] = l6;
                java.lang.Long l7 = (java.lang.Long) ((java.util.Map) this.f).get("tcc");
                if (l7 == null) {
                    l7 = -1L;
                }
                lArr[6] = l7;
                java.lang.Long l8 = (java.lang.Long) ((java.util.Map) this.f).get("tpc");
                if (l8 == null) {
                    l8 = -1L;
                }
                lArr[7] = l8;
                java.lang.Long l9 = (java.lang.Long) ((java.util.Map) this.f).get("tst");
                if (l9 == null) {
                    l9 = -1L;
                }
                lArr[8] = l9;
                for (int i = 0; i < 9; i++) {
                    if (lArr[i] == null) {
                        lArr[i] = -1L;
                    }
                }
                java.lang.Long[] lArr2 = (java.lang.Long[]) method.invoke("", lArr, java.lang.Integer.valueOf(((ads_mobile_sdk.sb3) this.g).ordinal()));
                lArr2.getClass();
                synchronized (v5431423861497278836) {
                    long jLongValue3 = lArr2[0].longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar3 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar3.bitField3_ |= 32;
                    pdVar3.evtTime_ = jLongValue3;
                    long jLongValue4 = lArr2[1].longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar4 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar4.bitField0_ |= 134217728;
                    pdVar4.utzSignal_ = jLongValue4;
                    long jLongValue5 = lArr2[2].longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar5 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar5.bitField0_ |= 2097152;
                    pdVar5.usgSignal_ = jLongValue5;
                    long jLongValue6 = lArr2[3].longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar6 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar6.bitField0_ |= 65536;
                    pdVar6.uptSignal_ = jLongValue6;
                    long jLongValue7 = lArr2[4].longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar7 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar7.bitField2_ |= 8192;
                    pdVar7.impressionDurationMs_ = jLongValue7;
                    long jLongValue8 = lArr2[5].longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar8 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar8.bitField2_ |= 16384;
                    pdVar8.impressionDurationHighAttentionMs_ = jLongValue8;
                    long jLongValue9 = lArr2[6].longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar9 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar9.bitField1_ |= 4096;
                    pdVar9.deviceElapsedRealTimeSignal_ = jLongValue9;
                    long jLongValue10 = lArr2[7].longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar10 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar10.bitField1_ |= 8192;
                    pdVar10.deviceUptimeSignal_ = jLongValue10;
                    break;
                }
                return;
            default:
                android.view.View view = (android.view.View) this.g;
                if (view == null) {
                    return;
                }
                java.lang.Object objInvoke = method.invoke("", (android.util.DisplayMetrics) this.f, view);
                objInvoke.getClass();
                java.lang.Long[] lArr3 = (java.lang.Long[]) objInvoke;
                dev.epro.r0.Z1210210371491270950 z1210210371491270950O = ads_mobile_sdk.od.o();
                long jLongValue11 = lArr3[2].longValue();
                z1210210371491270950O.b();
                ads_mobile_sdk.od odVar = (ads_mobile_sdk.od) z1210210371491270950O.b;
                odVar.bitField0_ |= 4;
                odVar.minAlphaSignal_ = jLongValue11;
                long jLongValue12 = lArr3[1].longValue();
                z1210210371491270950O.b();
                ads_mobile_sdk.od odVar2 = (ads_mobile_sdk.od) z1210210371491270950O.b;
                odVar2.bitField0_ = 8 | odVar2.bitField0_;
                odVar2.viewHeight_ = jLongValue12;
                long jLongValue13 = lArr3[0].longValue();
                z1210210371491270950O.b();
                ads_mobile_sdk.od odVar3 = (ads_mobile_sdk.od) z1210210371491270950O.b;
                odVar3.bitField0_ |= 16;
                odVar3.viewWidth_ = jLongValue13;
                long jLongValue14 = lArr3[3].longValue();
                z1210210371491270950O.b();
                ads_mobile_sdk.od odVar4 = (ads_mobile_sdk.od) z1210210371491270950O.b;
                odVar4.bitField0_ |= 1;
                odVar4.percentAdOnScreen_ = jLongValue14;
                long jLongValue15 = lArr3[4].longValue();
                z1210210371491270950O.b();
                ads_mobile_sdk.od odVar5 = (ads_mobile_sdk.od) z1210210371491270950O.b;
                odVar5.bitField0_ |= 32;
                odVar5.displayDensity_ = jLongValue15;
                synchronized (v5431423861497278836) {
                    ads_mobile_sdk.od odVar6 = (ads_mobile_sdk.od) z1210210371491270950O.a();
                    v5431423861497278836.b();
                    ((ads_mobile_sdk.pd) v5431423861497278836.b).a(odVar6);
                    break;
                }
                return;
        }
    }

    public q(dev.epro.r0.V5431423861497278836 v5431423861497278836, ads_mobile_sdk.rp1 rp1Var, android.util.DisplayMetrics displayMetrics, android.view.View view, ads_mobile_sdk.vi3 vi3Var) {
        super("ktF+VSqkyodZ4tIducgfLzYxzdB5ofNGaymoDbvueLMrjNjMtHTNPm366Piu8CC0", "rXm9R0gBTUHduh38r/rV98JLnl4TdPu3aUnjFtquoyc=", v5431423861497278836, rp1Var, vi3Var.a(ads_mobile_sdk.yk0.EVENT_ID_VIEW_SIGNALS_TASK));
        this.f = displayMetrics;
        this.g = view;
    }

    public q(dev.epro.r0.V5431423861497278836 v5431423861497278836, ads_mobile_sdk.rp1 rp1Var, ads_mobile_sdk.sb3 sb3Var, java.util.Map map, ads_mobile_sdk.vi3 vi3Var) {
        super("UGEehKvlkU4SDW4B4NE5sq9Y1SUhBYeK8lA7WvxibEr5oNTwuJn6DZSm7y2VXAMQ", "y8kGBnxfl+gCJUlPjWurqThF+Nx8iRaiEfVAIjzOakY=", v5431423861497278836, rp1Var, vi3Var.a(ads_mobile_sdk.yk0.EVENT_ID_TIME_SIGNALS_TASK));
        this.f = map;
        this.g = sb3Var;
    }
}
