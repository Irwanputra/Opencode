.class public final Lcom/google/android/gms/internal/zzly;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field private static final sLock:Ljava/lang/Object;

.field private static zzbgn:Lcom/google/android/gms/internal/zzly;


# instance fields
.field private zzbgo:Lcom/google/android/gms/internal/zzlg;

.field private zzbgp:Lcom/google/android/gms/ads/reward/RewardedVideoAd;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzly;->sLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zziq()Lcom/google/android/gms/internal/zzly;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzly;->sLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/google/android/gms/internal/zzly;->zzbgn:Lcom/google/android/gms/internal/zzly;

    if-nez v1, :cond_e

    new-instance v1, Lcom/google/android/gms/internal/zzly;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzly;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/zzly;->zzbgn:Lcom/google/android/gms/internal/zzly;

    :cond_e
    sget-object v1, Lcom/google/android/gms/internal/zzly;->zzbgn:Lcom/google/android/gms/internal/zzly;

    monitor-exit v0

    return-object v1

    :catchall_12
    move-exception v1

    monitor-exit v0
    :try_end_14
    .catchall {:try_start_3 .. :try_end_14} :catchall_12

    throw v1
.end method


# virtual methods
.method public final getRewardedVideoAdInstance(Landroid/content/Context;)Lcom/google/android/gms/ads/reward/RewardedVideoAd;
    .registers 6

    sget-object v0, Lcom/google/android/gms/internal/zzly;->sLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzly;->zzbgp:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    if-eqz v1, :cond_9

    monitor-exit v0

    return-object v1

    :cond_9
    new-instance v1, Lcom/google/android/gms/internal/zzuw;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzuw;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzib()Lcom/google/android/gms/internal/zzjr;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/zzjz;

    invoke-direct {v3, v2, p1, v1}, Lcom/google/android/gms/internal/zzjz;-><init>(Lcom/google/android/gms/internal/zzjr;Landroid/content/Context;Lcom/google/android/gms/internal/zzux;)V

    const/4 v1, 0x0

    invoke-static {p1, v1, v3}, Lcom/google/android/gms/internal/zzjr;->zza(Landroid/content/Context;ZLcom/google/android/gms/internal/zzjr$zza;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzadk;

    new-instance v2, Lcom/google/android/gms/internal/zzadx;

    invoke-direct {v2, p1, v1}, Lcom/google/android/gms/internal/zzadx;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzadk;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/zzly;->zzbgp:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    monitor-exit v0

    return-object v2

    :catchall_27
    move-exception p1

    monitor-exit v0
    :try_end_29
    .catchall {:try_start_3 .. :try_end_29} :catchall_27

    throw p1
.end method

.method public final openDebugMenu(Landroid/content/Context;Ljava/lang/String;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    const-string v1, "MobileAds.initialize() must be called prior to opening debug menu."

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->へ〱そかのず(ZLjava/lang/Object;)V

    :try_start_c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    .line 1
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v1, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 2
    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/zzlg;->zzb(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;Ljava/lang/String;)V
    :try_end_16
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_16} :catch_17

    return-void

    :catch_17
    move-exception p1

    const-string p2, "Unable to open debug menu."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setAppMuted(Z)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    const-string v1, "MobileAds.initialize() must be called prior to setting app muted state."

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->へ〱そかのず(ZLjava/lang/Object;)V

    :try_start_c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzlg;->setAppMuted(Z)V
    :try_end_11
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_11} :catch_12

    return-void

    :catch_12
    move-exception p1

    const-string v0, "Unable to set app mute state."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setAppVolume(F)V
    .registers 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    cmpg-float v2, v2, p1

    if-gtz v2, :cond_f

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v2, p1, v2

    if-gtz v2, :cond_f

    const/4 v2, 0x1

    goto :goto_10

    :cond_f
    const/4 v2, 0x0

    :goto_10
    if-eqz v2, :cond_29

    iget-object v2, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    if-eqz v2, :cond_17

    const/4 v0, 0x1

    :cond_17
    const-string v1, "MobileAds.initialize() must be called prior to setting the app volume."

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->へ〱そかのず(ZLjava/lang/Object;)V

    :try_start_1c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzlg;->setAppVolume(F)V
    :try_end_21
    .catch Landroid/os/RemoteException; {:try_start_1c .. :try_end_21} :catch_22

    return-void

    :catch_22
    move-exception p1

    const-string v0, "Unable to set app volume."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 1
    :cond_29
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The app volume must be a value between 0 and 1 inclusive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzma;)V
    .registers 6

    sget-object p3, Lcom/google/android/gms/internal/zzly;->sLock:Ljava/lang/Object;

    monitor-enter p3

    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    if-eqz v0, :cond_9

    monitor-exit p3
    :try_end_8
    .catchall {:try_start_3 .. :try_end_8} :catchall_42

    return-void

    :cond_9
    if-eqz p1, :cond_3a

    :try_start_b
    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzib()Lcom/google/android/gms/internal/zzjr;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzjw;

    invoke-direct {v1, v0, p1}, Lcom/google/android/gms/internal/zzjw;-><init>(Lcom/google/android/gms/internal/zzjr;Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/zzjr;->zza(Landroid/content/Context;ZLcom/google/android/gms/internal/zzjr$zza;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzlg;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzlg;->initialize()V

    if-eqz p2, :cond_38

    iget-object v0, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    new-instance v1, Lcom/google/android/gms/internal/zzlz;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/zzlz;-><init>(Lcom/google/android/gms/internal/zzly;Landroid/content/Context;)V

    .line 1
    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {p1, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 2
    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/zzlg;->zza(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V
    :try_end_31
    .catch Landroid/os/RemoteException; {:try_start_b .. :try_end_31} :catch_32
    .catchall {:try_start_b .. :try_end_31} :catchall_42

    goto :goto_38

    :catch_32
    move-exception p1

    :try_start_33
    const-string p2, "MobileAdsSettingManager initialization failed"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_38
    :goto_38
    monitor-exit p3

    return-void

    :cond_3a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Context cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_42
    move-exception p1

    monitor-exit p3
    :try_end_44
    .catchall {:try_start_33 .. :try_end_44} :catchall_42

    throw p1
.end method

.method public final zzdn()F
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    const/high16 v1, 0x3f800000    # 1.0f

    if-nez v0, :cond_7

    return v1

    :cond_7
    :try_start_7
    invoke-interface {v0}, Lcom/google/android/gms/internal/zzlg;->zzdn()F

    move-result v1
    :try_end_b
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_b} :catch_c

    goto :goto_12

    :catch_c
    move-exception v0

    const-string v2, "Unable to get app volume."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_12
    return v1
.end method

.method public final zzdo()Z
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzly;->zzbgo:Lcom/google/android/gms/internal/zzlg;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    :try_start_6
    invoke-interface {v0}, Lcom/google/android/gms/internal/zzlg;->zzdo()Z

    move-result v1
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_a} :catch_b

    goto :goto_11

    :catch_b
    move-exception v0

    const-string v2, "Unable to get app mute state."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_11
    return v1
.end method
