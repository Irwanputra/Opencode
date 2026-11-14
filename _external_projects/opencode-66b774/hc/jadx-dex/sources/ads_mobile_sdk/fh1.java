package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class fh1 {
    public java.lang.String a = "";
    public java.lang.String b = "";
    public int c = 0;
    public int d = 2;
    public int e = 0;
    public ads_mobile_sdk.te2 f = null;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.fh1)) {
            return false;
        }
        ads_mobile_sdk.fh1 fh1Var = (ads_mobile_sdk.fh1) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, fh1Var.a) && this.b.equals(fh1Var.b) && this.c == fh1Var.c && this.d == fh1Var.d && this.e == fh1Var.e && dev.epro.r0.S10823041268949770285.t(this.f, fh1Var.f);
    }

    public final int hashCode() {
        int iH = dev.epro.r0.U1554499319261669842.h(this.e, (dev.epro.r0.L11610354117192841236.A(this.d) + dev.epro.r0.U1554499319261669842.h(this.c, dev.epro.r0.E12098517352909843120.h(this.a.hashCode() * 31, 31, this.b))) * 31);
        ads_mobile_sdk.te2 te2Var = this.f;
        return iH + (te2Var == null ? 0 : te2Var.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = this.a;
        java.lang.String str3 = this.b;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        ads_mobile_sdk.te2 te2Var = this.f;
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("InternalRequestTraceMeta(internalRequestId=", str2, ", gwsQueryId=", str3, ", sequenceNumber=");
        sbY.append(i);
        sbY.append(", scarRequestType=");
        switch (i2) {
            case 1:
                str = "SCAR_REQUEST_TYPE_ADMOB";
                break;
            case 2:
                str = "SCAR_REQUEST_TYPE_UNSPECIFIED";
                break;
            case 3:
                str = "SCAR_REQUEST_TYPE_INBOUND_MEDIATION";
                break;
            case 4:
                str = "SCAR_REQUEST_TYPE_GBID";
                break;
            case 5:
                str = "SCAR_REQUEST_TYPE_GOLDENEYE";
                break;
            case 6:
                str = "SCAR_REQUEST_TYPE_YAVIN";
                break;
            case 7:
                str = "SCAR_REQUEST_TYPE_UNITY";
                break;
            case 8:
                str = "SCAR_REQUEST_TYPE_PAW";
                break;
            case 9:
                str = "SCAR_REQUEST_TYPE_GUILDER";
                break;
            case 10:
                str = "SCAR_REQUEST_TYPE_GAM_S2S";
                break;
            case 11:
                str = "UNRECOGNIZED";
                break;
            default:
                str = "null";
                break;
        }
        sbY.append(str);
        sbY.append(", mediationChainLength=");
        sbY.append(i3);
        sbY.append(", persistentCacheRequestData=");
        sbY.append(te2Var);
        sbY.append(")");
        return sbY.toString();
    }
}
