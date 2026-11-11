.class public final Lcom/google/android/gms/ads/InterstitialAd;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzlx;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzlx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    const-string v0, "Context cannot be null"

    invoke-static {p1, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getAdListener()Lcom/google/android/gms/ads/AdListener;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlx;->getAdListener()Lcom/google/android/gms/ads/AdListener;

    move-result-object v0

    return-object v0
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlx;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlx;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isLoaded()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlx;->isLoaded()Z

    move-result v0

    return v0
.end method

.method public final isLoading()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlx;->isLoading()Z

    move-result v0

    return v0
.end method

.method public final loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->zzbg()Lcom/google/android/gms/internal/zzlt;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzlx;->zza(Lcom/google/android/gms/internal/zzlt;)V

    return-void
.end method

.method public final setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzlx;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    if-eqz p1, :cond_13

    instance-of v0, p1, Lcom/google/android/gms/internal/zzje;

    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    check-cast p1, Lcom/google/android/gms/internal/zzje;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzlx;->zza(Lcom/google/android/gms/internal/zzje;)V

    return-void

    :cond_13
    if-nez p1, :cond_1b

    iget-object p1, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzlx;->zza(Lcom/google/android/gms/internal/zzje;)V

    :cond_1b
    return-void
.end method

.method public final setAdUnitId(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzlx;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public final setImmersiveMode(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzlx;->setImmersiveMode(Z)V

    return-void
.end method

.method public final setRewardedVideoAdListener(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzlx;->setRewardedVideoAdListener(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V

    return-void
.end method

.method public final show()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlx;->show()V

    return-void
.end method

.method public final zza(Z)V
    .registers 3

    iget-object p1, p0, Lcom/google/android/gms/ads/InterstitialAd;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlx;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzlx;->zza(Z)V

    return-void
.end method
