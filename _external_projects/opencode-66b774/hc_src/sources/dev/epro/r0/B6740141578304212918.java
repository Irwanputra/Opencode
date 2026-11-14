package dev.epro.r0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B6740141578304212918 {

    @O7462376509978667369("initial_ad_unit_id")
    public final String a;

    @O7462376509978667369("ad_source_name")
    public final String b;

    @O7462376509978667369("click_urls")
    public final List<String> c;

    @O7462376509978667369("imp_urls")
    public final List<String> d;

    @O7462376509978667369("manual_tracking_urls")
    public final List<String> e;

    @O7462376509978667369("fill_urls")
    public final List<String> f;

    @O7462376509978667369("video_start_urls")
    public final List<String> g;

    @O7462376509978667369("video_reward_urls")
    public final List<String> h;

    @O7462376509978667369("video_complete_urls")
    public final List<String> i;

    @O7462376509978667369("is_closable_area_disabled")
    public final boolean j;

    @O7462376509978667369("recursive_request_parameters")
    public final I16631908410500040363 k;

    @O7462376509978667369("is_analytics_logging_enabled")
    public final boolean l;

    @O7462376509978667369("rewards")
    public List<Bundle> m;

    @O7462376509978667369("recursive_signal_collection")
    public final P16422848101170923038 n;

    public B6740141578304212918(String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, boolean z, I16631908410500040363 i16631908410500040363, boolean z2, P16422848101170923038 p16422848101170923038) {
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
        this.m = O2161699089510411363.a;
        this.n = p16422848101170923038;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B6740141578304212918)) {
            return false;
        }
        B6740141578304212918 b6740141578304212918 = (B6740141578304212918) obj;
        return S10823041268949770285.t(this.a, b6740141578304212918.a) && S10823041268949770285.t(this.b, b6740141578304212918.b) && S10823041268949770285.t(this.c, b6740141578304212918.c) && S10823041268949770285.t(this.d, b6740141578304212918.d) && S10823041268949770285.t(this.e, b6740141578304212918.e) && S10823041268949770285.t(this.f, b6740141578304212918.f) && S10823041268949770285.t(this.g, b6740141578304212918.g) && S10823041268949770285.t(this.h, b6740141578304212918.h) && S10823041268949770285.t(this.i, b6740141578304212918.i) && this.j == b6740141578304212918.j && S10823041268949770285.t(this.k, b6740141578304212918.k) && this.l == b6740141578304212918.l && S10823041268949770285.t(this.m, b6740141578304212918.m) && S10823041268949770285.t(this.n, b6740141578304212918.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b = E10717724117948616506.b(E10717724117948616506.b(E10717724117948616506.b(E10717724117948616506.b(E10717724117948616506.b(E10717724117948616506.b(E10717724117948616506.b(H4776669175763245653.c(this.a.hashCode() * 31, this.b), this.c), this.d), this.e), this.f), this.g), this.h), this.i);
        boolean z = this.j;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode = (this.k.a.hashCode() + ((b + i) * 31)) * 31;
        boolean z2 = this.l;
        int i2 = (hashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        List<Bundle> list = this.m;
        int hashCode2 = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        P16422848101170923038 p16422848101170923038 = this.n;
        return hashCode2 + (p16422848101170923038 != null ? p16422848101170923038.a.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List<String> list = this.c;
        List<String> list2 = this.d;
        List<String> list3 = this.e;
        List<String> list4 = this.f;
        List<String> list5 = this.g;
        List<String> list6 = this.h;
        List<String> list7 = this.i;
        boolean z = this.j;
        I16631908410500040363 i16631908410500040363 = this.k;
        boolean z2 = this.l;
        List<Bundle> list8 = this.m;
        P16422848101170923038 p16422848101170923038 = this.n;
        StringBuilder y = G6547577305291411977.y("ParentAdConfig(innerAdUnitId=", str, ", adSourceName=", str2, ", clickUrls=");
        y.append(list);
        y.append(", impressionUrls=");
        y.append(list2);
        y.append(", manualTrackingUrls=");
        y.append(list3);
        y.append(", fillUrls=");
        y.append(list4);
        y.append(", videoStartUrls=");
        y.append(list5);
        y.append(", videoRewardsUrls=");
        y.append(list6);
        y.append(", videoCompleteUrls=");
        y.append(list7);
        y.append(", isClosableAreaDisabled=");
        y.append(z);
        y.append(", recursiveRequestParameters=");
        y.append(i16631908410500040363);
        y.append(", isAnalyticsLoggingEnabled=");
        y.append(z2);
        y.append(", rewardsBundles=");
        y.append(list8);
        y.append(", recursiveSignalCollectionConfig=");
        y.append(p16422848101170923038);
        y.append(")");
        return y.toString();
    }
}
