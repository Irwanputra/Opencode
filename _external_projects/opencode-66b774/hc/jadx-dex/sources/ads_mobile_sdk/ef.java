package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ef extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.B13729205492206812220 {
    public final /* synthetic */ android.content.Context a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef(android.content.Context context, byte b) {
        super(0);
        this.i = b;
        this.a = context;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final java.lang.Object invoke() {
        byte b = this.i;
        android.content.Context context = this.a;
        switch (b) {
            case 0:
                return dev.epro.r0.E18444280280170001567.A(context, "google_mobile_ads_anr_logs.pb");
            case 1:
                return dev.epro.r0.E18444280280170001567.A(context, "google_mobile_ads_inspector_settings.pb");
            case 2:
                return dev.epro.r0.E18444280280170001567.A(context, "google_mobile_ads_ad_cache_manifest.pb");
            case 3:
                return dev.epro.r0.E18444280280170001567.A(context, "google_mobile_ads_native_ad_settings.pb");
            case 4:
                return dev.epro.r0.E18444280280170001567.A(context, "google_mobile_ads_csrb_data.pb");
            case 5:
                return dev.epro.r0.E18444280280170001567.A(context, "google_mobile_ads_shared_settings.pb");
            case 6:
                return dev.epro.r0.E18444280280170001567.A(context, "google_mobile_ads_flags.pb");
            case 7:
                return dev.epro.r0.E18444280280170001567.A(context, "google_mobile_ads_app_settings.pb");
            default:
                return dev.epro.r0.E18444280280170001567.A(context, "google_mobile_ads_sdk_core.pb");
        }
    }
}
