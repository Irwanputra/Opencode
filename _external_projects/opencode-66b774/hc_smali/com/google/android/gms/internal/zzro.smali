.class public final Lcom/google/android/gms/internal/zzro;
.super Lcom/google/android/gms/internal/zzrg;
.source ""


# instance fields
.field private final zzbwr:Lcom/google/android/gms/ads/formats/OnPublisherAdViewLoadedListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/OnPublisherAdViewLoadedListener;)V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzrg;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzro;->zzbwr:Lcom/google/android/gms/ads/formats/OnPublisherAdViewLoadedListener;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzro;)Lcom/google/android/gms/ads/formats/OnPublisherAdViewLoadedListener;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzro;->zzbwr:Lcom/google/android/gms/ads/formats/OnPublisherAdViewLoadedListener;

    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/zzks;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V
    .registers 6

    if-eqz p1, :cond_59

    if-nez p2, :cond_5

    goto :goto_59

    :cond_5
    invoke-static {p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    invoke-direct {v0, p2}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x0

    :try_start_11
    invoke-interface {p1}, Lcom/google/android/gms/internal/zzks;->zzce()Lcom/google/android/gms/internal/zzkh;

    move-result-object v1

    instance-of v1, v1, Lcom/google/android/gms/internal/zzjg;

    if-eqz v1, :cond_31

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzks;->zzce()Lcom/google/android/gms/internal/zzkh;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzjg;

    if-eqz v1, :cond_26

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzjg;->getAdListener()Lcom/google/android/gms/ads/AdListener;

    move-result-object v1

    goto :goto_27

    :cond_26
    move-object v1, p2

    :goto_27
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    :try_end_2a
    .catch Landroid/os/RemoteException; {:try_start_11 .. :try_end_2a} :catch_2b

    goto :goto_31

    :catch_2b
    move-exception v1

    const-string v2, "Failed to get ad listener."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_31
    :goto_31
    :try_start_31
    invoke-interface {p1}, Lcom/google/android/gms/internal/zzks;->zzcd()Lcom/google/android/gms/internal/zzkx;

    move-result-object v1

    instance-of v1, v1, Lcom/google/android/gms/internal/zzjp;

    if-eqz v1, :cond_4f

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzks;->zzcd()Lcom/google/android/gms/internal/zzkx;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzjp;

    if-eqz v1, :cond_45

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzjp;->getAppEventListener()Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    move-result-object p2

    :cond_45
    invoke-virtual {v0, p2}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->setAppEventListener(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    :try_end_48
    .catch Landroid/os/RemoteException; {:try_start_31 .. :try_end_48} :catch_49

    goto :goto_4f

    :catch_49
    move-exception p2

    const-string v1, "Failed to get app event listener."

    invoke-static {v1, p2}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4f
    :goto_4f
    sget-object p2, Lcom/google/android/gms/internal/zzajr;->zzajw:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/zzrp;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/android/gms/internal/zzrp;-><init>(Lcom/google/android/gms/internal/zzro;Lcom/google/android/gms/ads/doubleclick/PublisherAdView;Lcom/google/android/gms/internal/zzks;)V

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_59
    :goto_59
    return-void
.end method
