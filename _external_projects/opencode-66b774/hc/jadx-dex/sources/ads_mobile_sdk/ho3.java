package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ho3 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.ci3 a;
    public final dev.epro.r0.W5797197595347441198 b;

    public ho3(ads_mobile_sdk.ci3 ci3Var, dev.epro.r0.W5797197595347441198 w5797197595347441198) {
        ci3Var.getClass();
        w5797197595347441198.getClass();
        this.a = ci3Var;
        this.b = w5797197595347441198;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        int i;
        int i2;
        int i3;
        try {
            ads_mobile_sdk.sy0 sy0VarD = tx0Var.d();
            java.lang.String str = (java.lang.String) map.get("duration");
            if (str == null) {
                ads_mobile_sdk.zi3.a(6, "Invalid videoMeta gmsg with no duration.", null);
                return dev.epro.r0.O9245300239821758723.a;
            }
            java.lang.Float.parseFloat(str);
            if (sy0VarD == null) {
                "1".equals(map.get("customControlsAllowed"));
                "1".equals(map.get("clickToExpandAllowed"));
                sy0VarD = new ads_mobile_sdk.sy0(tx0Var, this.b);
                synchronized (tx0Var) {
                    try {
                        if (tx0Var.d() != null) {
                            ads_mobile_sdk.xv.a("Attempt to create multiple GmaWebViewVideoController.", (java.lang.Exception) null);
                        } else {
                            tx0Var.q = sy0VarD;
                        }
                    } finally {
                    }
                }
            }
            boolean zEquals = "1".equals(map.get("muted"));
            java.lang.String str2 = (java.lang.String) map.get("playbackState");
            if (str2 == null) {
                ads_mobile_sdk.zi3.a(6, "Invalid videoMeta gmsg with no playback state.", null);
                return dev.epro.r0.O9245300239821758723.a;
            }
            int i4 = java.lang.Integer.parseInt(str2);
            int[] iArrC = dev.epro.r0.L11610354117192841236.C(5);
            int length = iArrC.length;
            int i5 = 0;
            while (true) {
                i = 1;
                if (i5 >= length) {
                    i2 = 0;
                    break;
                }
                int i6 = iArrC[i5];
                if (i6 != 1) {
                    i3 = 2;
                    if (i6 == 2) {
                        i3 = 1;
                    } else if (i6 != 3) {
                        if (i6 == 4) {
                            i3 = 3;
                        } else {
                            if (i6 != 5) {
                                throw null;
                            }
                            i3 = 5;
                        }
                    }
                } else {
                    i3 = 0;
                }
                if (i3 == i4) {
                    i2 = i6;
                    break;
                }
                i5++;
            }
            if (i2 != 0) {
                i = i2;
            }
            java.lang.String str3 = (java.lang.String) map.get("aspectRatio");
            if (str3 == null) {
                ads_mobile_sdk.zi3.a(6, "Invalid videoMeta gmsg with no aspect ratio.", null);
                return dev.epro.r0.O9245300239821758723.a;
            }
            sy0VarD.a(java.lang.Float.parseFloat(str3), i, zEquals);
        } catch (java.lang.NumberFormatException e) {
            ads_mobile_sdk.zi3.a(4, "Exception handling video metadata", e);
            this.a.a("VideoMetadataGmsgHandler.onGmsg", (java.lang.Throwable) e);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 10;
    }

    public final boolean c() {
        return true;
    }
}
