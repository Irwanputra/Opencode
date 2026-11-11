.class public Lcom/google/android/gms/ads/MobileAds;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/MobileAds$Settings;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getRewardedVideoAdInstance(Landroid/content/Context;)Lcom/google/android/gms/ads/reward/RewardedVideoAd;
    .registers 2

    invoke-static {}, Lcom/google/android/gms/internal/zzly;->zziq()Lcom/google/android/gms/internal/zzly;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzly;->getRewardedVideoAdInstance(Landroid/content/Context;)Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    move-result-object p0

    return-object p0
.end method

.method public static initialize(Landroid/content/Context;)V
    .registers 2

    const/4 v0, 0x0

    invoke-static {p0, v0, v0}, Lcom/google/android/gms/ads/MobileAds;->initialize(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/MobileAds$Settings;)V

    return-void
.end method

.method public static initialize(Landroid/content/Context;Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/ads/MobileAds;->initialize(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/MobileAds$Settings;)V

    return-void
.end method

.method public static initialize(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/MobileAds$Settings;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzly;->zziq()Lcom/google/android/gms/internal/zzly;

    move-result-object v0

    if-nez p2, :cond_8

    const/4 p2, 0x0

    goto :goto_a

    .line 1
    :cond_8
    iget-object p2, p2, Lcom/google/android/gms/ads/MobileAds$Settings;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzma;

    .line 2
    :goto_a
    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/zzly;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzma;)V

    return-void
.end method

.method public static openDebugMenu(Landroid/content/Context;Ljava/lang/String;)V
    .registers 3

    invoke-static {}, Lcom/google/android/gms/internal/zzly;->zziq()Lcom/google/android/gms/internal/zzly;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/zzly;->openDebugMenu(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static setAppMuted(Z)V
    .registers 2

    invoke-static {}, Lcom/google/android/gms/internal/zzly;->zziq()Lcom/google/android/gms/internal/zzly;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzly;->setAppMuted(Z)V

    return-void
.end method

.method public static setAppVolume(F)V
    .registers 2

    invoke-static {}, Lcom/google/android/gms/internal/zzly;->zziq()Lcom/google/android/gms/internal/zzly;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzly;->setAppVolume(F)V

    return-void
.end method
