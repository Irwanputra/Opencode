package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B13729205492206812220;
import dev.epro.r0.E18444280280170001567;
import dev.epro.r0.P9893650590651797888;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ef extends P9893650590651797888 implements B13729205492206812220 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef(Context context, byte b) {
        super(0);
        this.i = b;
        this.a = context;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.i;
        Context context = this.a;
        switch (b) {
            case 0:
                return E18444280280170001567.A(context, "google_mobile_ads_anr_logs.pb");
            case 1:
                return E18444280280170001567.A(context, "google_mobile_ads_inspector_settings.pb");
            case 2:
                return E18444280280170001567.A(context, "google_mobile_ads_ad_cache_manifest.pb");
            case 3:
                return E18444280280170001567.A(context, "google_mobile_ads_native_ad_settings.pb");
            case 4:
                return E18444280280170001567.A(context, "google_mobile_ads_csrb_data.pb");
            case 5:
                return E18444280280170001567.A(context, "google_mobile_ads_shared_settings.pb");
            case 6:
                return E18444280280170001567.A(context, "google_mobile_ads_flags.pb");
            case 7:
                return E18444280280170001567.A(context, "google_mobile_ads_app_settings.pb");
            default:
                return E18444280280170001567.A(context, "google_mobile_ads_sdk_core.pb");
        }
    }
}
