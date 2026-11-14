package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B6740141578304212918 {

    @dev.epro.r0.O7462376509978667369("initial_ad_unit_id")
    public final java.lang.String a;

    @dev.epro.r0.O7462376509978667369("ad_source_name")
    public final java.lang.String b;

    @dev.epro.r0.O7462376509978667369("click_urls")
    public final java.util.List<java.lang.String> c;

    @dev.epro.r0.O7462376509978667369("imp_urls")
    public final java.util.List<java.lang.String> d;

    @dev.epro.r0.O7462376509978667369("manual_tracking_urls")
    public final java.util.List<java.lang.String> e;

    @dev.epro.r0.O7462376509978667369("fill_urls")
    public final java.util.List<java.lang.String> f;

    @dev.epro.r0.O7462376509978667369("video_start_urls")
    public final java.util.List<java.lang.String> g;

    @dev.epro.r0.O7462376509978667369("video_reward_urls")
    public final java.util.List<java.lang.String> h;

    @dev.epro.r0.O7462376509978667369("video_complete_urls")
    public final java.util.List<java.lang.String> i;

    @dev.epro.r0.O7462376509978667369("is_closable_area_disabled")
    public final boolean j;

    @dev.epro.r0.O7462376509978667369("recursive_request_parameters")
    public final dev.epro.r0.I16631908410500040363 k;

    @dev.epro.r0.O7462376509978667369("is_analytics_logging_enabled")
    public final boolean l;

    @dev.epro.r0.O7462376509978667369("rewards")
    public java.util.List<android.os.Bundle> m;

    @dev.epro.r0.O7462376509978667369("recursive_signal_collection")
    public final dev.epro.r0.P16422848101170923038 n;

    public B6740141578304212918(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, java.util.ArrayList arrayList5, java.util.ArrayList arrayList6, java.util.ArrayList arrayList7, boolean z, dev.epro.r0.I16631908410500040363 i16631908410500040363, boolean z2, dev.epro.r0.P16422848101170923038 p16422848101170923038) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
        this.g = arrayList5;
        this.h = arrayList6;
        this.i = arrayList7;
        this.j = z;
        this.k = i16631908410500040363;
        this.l = z2;
        this.m = dev.epro.r0.O2161699089510411363.a;
        this.n = p16422848101170923038;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.B6740141578304212918)) {
            return false;
        }
        dev.epro.r0.B6740141578304212918 b6740141578304212918 = (dev.epro.r0.B6740141578304212918) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, b6740141578304212918.a) && dev.epro.r0.S10823041268949770285.t(this.b, b6740141578304212918.b) && dev.epro.r0.S10823041268949770285.t(this.c, b6740141578304212918.c) && dev.epro.r0.S10823041268949770285.t(this.d, b6740141578304212918.d) && dev.epro.r0.S10823041268949770285.t(this.e, b6740141578304212918.e) && dev.epro.r0.S10823041268949770285.t(this.f, b6740141578304212918.f) && dev.epro.r0.S10823041268949770285.t(this.g, b6740141578304212918.g) && dev.epro.r0.S10823041268949770285.t(this.h, b6740141578304212918.h) && dev.epro.r0.S10823041268949770285.t(this.i, b6740141578304212918.i) && this.j == b6740141578304212918.j && dev.epro.r0.S10823041268949770285.t(this.k, b6740141578304212918.k) && this.l == b6740141578304212918.l && dev.epro.r0.S10823041268949770285.t(this.m, b6740141578304212918.m) && dev.epro.r0.S10823041268949770285.t(this.n, b6740141578304212918.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iB = dev.epro.r0.E10717724117948616506.b(dev.epro.r0.E10717724117948616506.b(dev.epro.r0.E10717724117948616506.b(dev.epro.r0.E10717724117948616506.b(dev.epro.r0.E10717724117948616506.b(dev.epro.r0.E10717724117948616506.b(dev.epro.r0.E10717724117948616506.b(dev.epro.r0.H4776669175763245653.c(this.a.hashCode() * 31, this.b), this.c), this.d), this.e), this.f), this.g), this.h), this.i);
        boolean z = this.j;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode = (this.k.a.hashCode() + ((iB + r1) * 31)) * 31;
        boolean z2 = this.l;
        int i = (iHashCode + (z2 ? 1 : z2)) * 31;
        java.util.List<android.os.Bundle> list = this.m;
        int iHashCode2 = (i + (list == null ? 0 : list.hashCode())) * 31;
        dev.epro.r0.P16422848101170923038 p16422848101170923038 = this.n;
        return iHashCode2 + (p16422848101170923038 != null ? p16422848101170923038.a.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        java.util.List<java.lang.String> list = this.c;
        java.util.List<java.lang.String> list2 = this.d;
        java.util.List<java.lang.String> list3 = this.e;
        java.util.List<java.lang.String> list4 = this.f;
        java.util.List<java.lang.String> list5 = this.g;
        java.util.List<java.lang.String> list6 = this.h;
        java.util.List<java.lang.String> list7 = this.i;
        boolean z = this.j;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.k;
        boolean z2 = this.l;
        java.util.List<android.os.Bundle> list8 = this.m;
        dev.epro.r0.P16422848101170923038 p16422848101170923038 = this.n;
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("ParentAdConfig(innerAdUnitId=", str, ", adSourceName=", str2, ", clickUrls=");
        sbY.append(list);
        sbY.append(", impressionUrls=");
        sbY.append(list2);
        sbY.append(", manualTrackingUrls=");
        sbY.append(list3);
        sbY.append(", fillUrls=");
        sbY.append(list4);
        sbY.append(", videoStartUrls=");
        sbY.append(list5);
        sbY.append(", videoRewardsUrls=");
        sbY.append(list6);
        sbY.append(", videoCompleteUrls=");
        sbY.append(list7);
        sbY.append(", isClosableAreaDisabled=");
        sbY.append(z);
        sbY.append(", recursiveRequestParameters=");
        sbY.append(i16631908410500040363);
        sbY.append(", isAnalyticsLoggingEnabled=");
        sbY.append(z2);
        sbY.append(", rewardsBundles=");
        sbY.append(list8);
        sbY.append(", recursiveSignalCollectionConfig=");
        sbY.append(p16422848101170923038);
        sbY.append(")");
        return sbY.toString();
    }
}
