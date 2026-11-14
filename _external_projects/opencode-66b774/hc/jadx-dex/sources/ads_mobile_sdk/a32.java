package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class a32 extends ads_mobile_sdk.t93 {
    public final java.lang.Object f;
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a32(dev.epro.r0.V5431423861497278836 v5431423861497278836, ads_mobile_sdk.rp1 rp1Var, java.util.Map map, ads_mobile_sdk.vi3 vi3Var, byte b) {
        super("3SWPPciYi5aHoI1OBERhDipvlPpAtbhfeYDZhMqijRWqAxjBiv72prN8AzcVA5J9", "qGPJHMLFunr1AVkW6Fhi9ZzRNPJl3SeBnAUGHmixXQ0=", v5431423861497278836, rp1Var, vi3Var.a(ads_mobile_sdk.yk0.EVENT_ID_NETWORK_SIGNALS_TASK));
        this.l = b;
        switch (b) {
            case 1:
                super("sAX/3/HOCTeahXhFfASNpd/c1hPgxO8Q5YUuIxnLYaEKGrUg4RvUMR7m2gTrRspl", "tw44Pm8L1hyUidMqnQUhLFu8E6wuFVyExTmoxz14Zrw=", v5431423861497278836, rp1Var, vi3Var.a(ads_mobile_sdk.yk0.EVENT_ID_NAVIGATION_SIGNALS_TASK));
                this.f = map;
                break;
            default:
                this.f = map;
                break;
        }
    }

    @Override // ads_mobile_sdk.t93
    public final void a(java.lang.reflect.Method method, dev.epro.r0.V5431423861497278836 v5431423861497278836) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Object obj;
        int i = 2;
        switch (this.l) {
            case 0:
                java.lang.Object[] objArr = (java.lang.Object[]) method.invoke("", (android.net.NetworkCapabilities) ((java.util.Map) this.f).get("ntc"), (java.lang.Long) ((java.util.Map) this.f).get("vs"), (java.lang.Long) ((java.util.Map) this.f).get("vf"));
                objArr.getClass();
                synchronized (v5431423861497278836) {
                    try {
                        long jLongValue = ((java.lang.Long) objArr[0]).longValue();
                        v5431423861497278836.b();
                        ads_mobile_sdk.pd pdVar = (ads_mobile_sdk.pd) v5431423861497278836.b;
                        pdVar.bitField0_ |= 1024;
                        pdVar.netSignal_ = jLongValue;
                        long jLongValue2 = ((java.lang.Long) objArr[1]).longValue();
                        if (jLongValue2 >= 0) {
                            v5431423861497278836.b();
                            ads_mobile_sdk.pd pdVar2 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                            pdVar2.bitField2_ |= 2048;
                            pdVar2.timeSinceVpnOnMs_ = jLongValue2;
                        }
                        long jLongValue3 = ((java.lang.Long) objArr[2]).longValue();
                        if (jLongValue3 >= 0) {
                            v5431423861497278836.b();
                            ads_mobile_sdk.pd pdVar3 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                            pdVar3.bitField2_ |= 4096;
                            pdVar3.adeventToVpnOffMs_ = jLongValue3;
                        }
                        if (objArr.length > 3 && (obj = objArr[3]) != null) {
                            int i_a$1 = dev.epro.r0.G6547577305291411977._a$1(((java.lang.Long) obj).intValue());
                            if (i_a$1 == 0) {
                                throw null;
                            }
                            v5431423861497278836.b();
                            ads_mobile_sdk.pd pdVar4 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                            pdVar4.getClass();
                            pdVar4.proxyDetectedSignal_ = dev.epro.r0.G6547577305291411977.f(i_a$1);
                            pdVar4.bitField2_ |= 16;
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                java.util.List list = (java.util.List) ((java.util.Map) this.f).get("vst");
                if (list == null) {
                    return;
                }
                java.lang.Object objInvoke = method.invoke("", list);
                objInvoke.getClass();
                java.lang.Long l = (java.lang.Long) objInvoke;
                synchronized (v5431423861497278836) {
                    try {
                        int i_a = dev.epro.r0.G6547577305291411977._a(l.intValue());
                        if (i_a == 0) {
                            throw null;
                        }
                        v5431423861497278836.b();
                        ads_mobile_sdk.pd pdVar5 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                        pdVar5.getClass();
                        switch (i_a) {
                            case 1:
                                i = 0;
                                break;
                            case 2:
                                i = 1;
                                break;
                            case 3:
                                break;
                            case 4:
                                i = 3;
                                break;
                            case 5:
                                i = 4;
                                break;
                            case 6:
                                i = 5;
                                break;
                            case 7:
                                i = 6;
                                break;
                            case 8:
                                i = 7;
                                break;
                            case 9:
                                i = 8;
                                break;
                            case 10:
                                i = 9;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                                i = 11;
                                break;
                            case 13:
                                i = 12;
                                break;
                            case 14:
                                i = 13;
                                break;
                            default:
                                throw null;
                        }
                        pdVar5.navigationTriggerType_ = i;
                        pdVar5.bitField2_ |= 16777216;
                    } finally {
                    }
                }
                return;
            default:
                java.lang.Object[] objArr2 = (java.lang.Object[]) method.invoke("", ((ads_mobile_sdk.j7) this.f).F());
                objArr2.getClass();
                synchronized (v5431423861497278836) {
                    java.lang.String str = (java.lang.String) objArr2[0];
                    v5431423861497278836.b();
                    ((ads_mobile_sdk.pd) v5431423861497278836.b).d(str);
                    java.lang.String str2 = (java.lang.String) objArr2[1];
                    v5431423861497278836.b();
                    ((ads_mobile_sdk.pd) v5431423861497278836.b).c(str2);
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a32(dev.epro.r0.V5431423861497278836 v5431423861497278836, ads_mobile_sdk.rp1 rp1Var, ads_mobile_sdk.j7 j7Var, ads_mobile_sdk.vi3 vi3Var) {
        super("hnBCwtuP5R5SJ5F4x4TxEurUH9ekxtbt0orp9iG05UpBiWU25w8Om1d8AQSEyroz", "BQOK0OF7gUdXqvqzzdyNoaNQjSVn8TXR/sCzgQu1m/I=", v5431423861497278836, rp1Var, vi3Var.a(ads_mobile_sdk.yk0.EVENT_ID_ENV_VERSION_SIGNALS_TASK));
        this.l = (byte) 2;
        this.f = j7Var;
    }
}
