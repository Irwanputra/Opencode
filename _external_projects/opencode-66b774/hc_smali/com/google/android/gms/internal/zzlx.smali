.class public final Lcom/google/android/gms/internal/zzlx;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzalp:Lcom/google/android/gms/internal/zzjm;

.field private zzamt:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

.field private zzapq:Ljava/lang/String;

.field private zzaqg:Z

.field private zzbdd:Lcom/google/android/gms/internal/zzje;

.field private zzbde:Lcom/google/android/gms/ads/AdListener;

.field private final zzbgb:Lcom/google/android/gms/internal/zzuw;

.field private zzbgf:Lcom/google/android/gms/ads/Correlator;

.field private zzbgg:Lcom/google/android/gms/internal/zzks;

.field private zzbgh:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

.field private zzbgl:Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;

.field private zzbgm:Z

.field private zzgz:Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    sget-object v0, Lcom/google/android/gms/internal/zzjm;->zzbej:Lcom/google/android/gms/internal/zzjm;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/internal/zzlx;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzjm;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V
    .registers 4

    sget-object v0, Lcom/google/android/gms/internal/zzjm;->zzbej:Lcom/google/android/gms/internal/zzjm;

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/internal/zzlx;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzjm;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzjm;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzuw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzuw;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgb:Lcom/google/android/gms/internal/zzuw;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlx;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzlx;->zzalp:Lcom/google/android/gms/internal/zzjm;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzlx;->zzbgl:Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;

    return-void
.end method

.method private final zzak(Ljava/lang/String;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_5

    return-void

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3f

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "The ad unit ID must be set on InterstitialAd before "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is called."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getAdListener()Lcom/google/android/gms/ads/AdListener;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbde:Lcom/google/android/gms/ads/AdListener;

    return-object v0
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzapq:Ljava/lang/String;

    return-object v0
.end method

.method public final getAppEventListener()Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzamt:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    return-object v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .registers 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->zzcp()Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_8} :catch_9

    return-object v0

    :catch_9
    move-exception v0

    const-string v1, "Failed to get the mediation adapter class name."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getOnCustomRenderedAdLoadedListener()Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgh:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    return-object v0
.end method

.method public final isLoaded()Z
    .registers 4

    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-nez v1, :cond_6

    return v0

    :cond_6
    invoke-interface {v1}, Lcom/google/android/gms/internal/zzks;->isReady()Z

    move-result v0
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_a} :catch_b

    return v0

    :catch_b
    move-exception v1

    const-string v2, "Failed to check if ad is ready."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public final isLoading()Z
    .registers 4

    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-nez v1, :cond_6

    return v0

    :cond_6
    invoke-interface {v1}, Lcom/google/android/gms/internal/zzks;->isLoading()Z

    move-result v0
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_a} :catch_b

    return v0

    :catch_b
    move-exception v1

    const-string v2, "Failed to check if ad is loading."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public final setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .registers 4

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/zzlx;->zzbde:Lcom/google/android/gms/ads/AdListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_12

    if-eqz p1, :cond_e

    new-instance v1, Lcom/google/android/gms/internal/zzjg;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzjg;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    goto :goto_f

    :cond_e
    const/4 v1, 0x0

    :goto_f
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzkh;)V
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_12} :catch_13

    :cond_12
    return-void

    :catch_13
    move-exception p1

    const-string v0, "Failed to set the AdListener."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setAdUnitId(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzapq:Ljava/lang/String;

    if-nez v0, :cond_7

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlx;->zzapq:Ljava/lang/String;

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad unit ID can only be set once on InterstitialAd."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setAppEventListener(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    .registers 4

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/zzlx;->zzamt:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_12

    if-eqz p1, :cond_e

    new-instance v1, Lcom/google/android/gms/internal/zzjp;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzjp;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    goto :goto_f

    :cond_e
    const/4 v1, 0x0

    :goto_f
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzkx;)V
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_12} :catch_13

    :cond_12
    return-void

    :catch_13
    move-exception p1

    const-string v0, "Failed to set the AppEventListener."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setCorrelator(Lcom/google/android/gms/ads/Correlator;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlx;->zzbgf:Lcom/google/android/gms/ads/Correlator;

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_11

    if-nez p1, :cond_a

    const/4 p1, 0x0

    goto :goto_e

    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/ads/Correlator;->zzbh()Lcom/google/android/gms/internal/zzkc;

    move-result-object p1

    :goto_e
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzld;)V
    :try_end_11
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_11} :catch_12

    :cond_11
    return-void

    :catch_12
    move-exception p1

    const-string v0, "Failed to set correlator."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setImmersiveMode(Z)V
    .registers 3

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzlx;->zzaqg:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_9

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzks;->setImmersiveMode(Z)V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_9} :catch_a

    :cond_9
    return-void

    :catch_a
    move-exception p1

    const-string v0, "Failed to set immersive mode"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setOnCustomRenderedAdLoadedListener(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V
    .registers 4

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/zzlx;->zzbgh:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_12

    if-eqz p1, :cond_e

    new-instance v1, Lcom/google/android/gms/internal/zzod;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzod;-><init>(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V

    goto :goto_f

    :cond_e
    const/4 v1, 0x0

    :goto_f
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzoa;)V
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_12} :catch_13

    :cond_12
    return-void

    :catch_13
    move-exception p1

    const-string v0, "Failed to set the OnCustomRenderedAdLoadedListener."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setRewardedVideoAdListener(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V
    .registers 4

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/zzlx;->zzgz:Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_12

    if-eqz p1, :cond_e

    new-instance v1, Lcom/google/android/gms/internal/zzadu;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzadu;-><init>(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V

    goto :goto_f

    :cond_e
    const/4 v1, 0x0

    :goto_f
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzadp;)V
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_12} :catch_13

    :cond_12
    return-void

    :catch_13
    move-exception p1

    const-string v0, "Failed to set the AdListener."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final show()V
    .registers 3

    :try_start_0
    const-string v0, "show"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzlx;->zzak(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->showInterstitial()V
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_a} :catch_b

    return-void

    :catch_b
    move-exception v0

    const-string v1, "Failed to show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzje;)V
    .registers 4

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/zzlx;->zzbdd:Lcom/google/android/gms/internal/zzje;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_12

    if-eqz p1, :cond_e

    new-instance v1, Lcom/google/android/gms/internal/zzjf;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzjf;-><init>(Lcom/google/android/gms/internal/zzje;)V

    goto :goto_f

    :cond_e
    const/4 v1, 0x0

    :goto_f
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzke;)V
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_12} :catch_13

    :cond_12
    return-void

    :catch_13
    move-exception p1

    const-string v0, "Failed to set the AdClickListener."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzlt;)V
    .registers 10

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-nez v0, :cond_98

    const-string v0, "loadAd"

    iget-object v1, p0, Lcom/google/android/gms/internal/zzlx;->zzapq:Ljava/lang/String;

    if-nez v1, :cond_d

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzlx;->zzak(Ljava/lang/String;)V

    :cond_d
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgm:Z

    if-eqz v0, :cond_16

    invoke-static {}, Lcom/google/android/gms/internal/zzjn;->zzhs()Lcom/google/android/gms/internal/zzjn;

    move-result-object v0

    goto :goto_1b

    :cond_16
    new-instance v0, Lcom/google/android/gms/internal/zzjn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzjn;-><init>()V

    :goto_1b
    move-object v4, v0

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzib()Lcom/google/android/gms/internal/zzjr;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->mContext:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzlx;->zzapq:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzlx;->zzbgb:Lcom/google/android/gms/internal/zzuw;

    new-instance v7, Lcom/google/android/gms/internal/zzju;

    move-object v1, v7

    move-object v3, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzju;-><init>(Lcom/google/android/gms/internal/zzjr;Landroid/content/Context;Lcom/google/android/gms/internal/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;)V

    const/4 v1, 0x0

    invoke-static {v0, v1, v7}, Lcom/google/android/gms/internal/zzjr;->zza(Landroid/content/Context;ZLcom/google/android/gms/internal/zzjr$zza;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzks;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzlx;->zzbde:Lcom/google/android/gms/ads/AdListener;

    if-eqz v1, :cond_44

    new-instance v1, Lcom/google/android/gms/internal/zzjg;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlx;->zzbde:Lcom/google/android/gms/ads/AdListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzjg;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzkh;)V

    :cond_44
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbdd:Lcom/google/android/gms/internal/zzje;

    if-eqz v0, :cond_54

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    new-instance v1, Lcom/google/android/gms/internal/zzjf;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlx;->zzbdd:Lcom/google/android/gms/internal/zzje;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzjf;-><init>(Lcom/google/android/gms/internal/zzje;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzke;)V

    :cond_54
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzamt:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    if-eqz v0, :cond_64

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    new-instance v1, Lcom/google/android/gms/internal/zzjp;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlx;->zzamt:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzjp;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzkx;)V

    :cond_64
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgh:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    if-eqz v0, :cond_74

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    new-instance v1, Lcom/google/android/gms/internal/zzod;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlx;->zzbgh:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzod;-><init>(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzoa;)V

    :cond_74
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgf:Lcom/google/android/gms/ads/Correlator;

    if-eqz v0, :cond_81

    iget-object v1, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/Correlator;->zzbh()Lcom/google/android/gms/internal/zzkc;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzld;)V

    :cond_81
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzgz:Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;

    if-eqz v0, :cond_91

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    new-instance v1, Lcom/google/android/gms/internal/zzadu;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlx;->zzgz:Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzadu;-><init>(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzadp;)V

    :cond_91
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzlx;->zzaqg:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->setImmersiveMode(Z)V

    :cond_98
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgg:Lcom/google/android/gms/internal/zzks;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzlx;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzjm;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzlt;)Lcom/google/android/gms/internal/zzjj;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zzb(Lcom/google/android/gms/internal/zzjj;)Z

    move-result v0

    if-eqz v0, :cond_af

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlx;->zzbgb:Lcom/google/android/gms/internal/zzuw;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzlt;->zzim()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzuw;->zzn(Ljava/util/Map;)V
    :try_end_af
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_af} :catch_b0

    :cond_af
    return-void

    :catch_b0
    move-exception p1

    const-string v0, "Failed to load ad."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza(Z)V
    .registers 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzlx;->zzbgm:Z

    return-void
.end method
