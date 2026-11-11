.class public final Lcom/google/android/gms/internal/zzid;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private final zzbat:Ljava/lang/Runnable;

.field private zzbau:Lcom/google/android/gms/internal/zzik;

.field private zzbav:Lcom/google/android/gms/internal/zzio;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzie;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzie;-><init>(Lcom/google/android/gms/internal/zzid;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzid;->zzbat:Ljava/lang/Runnable;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzid;->mLock:Ljava/lang/Object;

    return-void
.end method

.method private final connect()V
    .registers 7

    iget-object v0, p0, Lcom/google/android/gms/internal/zzid;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzid;->mContext:Landroid/content/Context;

    if-eqz v1, :cond_2c

    iget-object v1, p0, Lcom/google/android/gms/internal/zzid;->zzbau:Lcom/google/android/gms/internal/zzik;

    if-eqz v1, :cond_c

    goto :goto_2c

    :cond_c
    new-instance v1, Lcom/google/android/gms/internal/zzig;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzig;-><init>(Lcom/google/android/gms/internal/zzid;)V

    new-instance v2, Lcom/google/android/gms/internal/zzih;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/zzih;-><init>(Lcom/google/android/gms/internal/zzid;)V

    new-instance v3, Lcom/google/android/gms/internal/zzik;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzid;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzew()Lcom/google/android/gms/internal/zzajf;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzajf;->zzqs()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v3, v4, v5, v1, v2}, Lcom/google/android/gms/internal/zzik;-><init>(Landroid/content/Context;Landroid/os/Looper;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざっざへづ;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/でどあくず;)V

    iput-object v3, p0, Lcom/google/android/gms/internal/zzid;->zzbau:Lcom/google/android/gms/internal/zzik;

    invoke-virtual {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/は〲ぱなで;->zzakj()V

    monitor-exit v0

    return-void

    :cond_2c
    :goto_2c
    monitor-exit v0

    return-void

    :catchall_2e
    move-exception v1

    monitor-exit v0
    :try_end_30
    .catchall {:try_start_3 .. :try_end_30} :catchall_2e

    throw v1
.end method

.method private final disconnect()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzid;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzid;->zzbau:Lcom/google/android/gms/internal/zzik;

    if-nez v1, :cond_9

    monitor-exit v0

    return-void

    :cond_9
    invoke-virtual {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/は〲ぱなで;->isConnected()Z

    move-result v1

    if-nez v1, :cond_17

    iget-object v1, p0, Lcom/google/android/gms/internal/zzid;->zzbau:Lcom/google/android/gms/internal/zzik;

    invoke-virtual {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/は〲ぱなで;->isConnecting()Z

    move-result v1

    if-eqz v1, :cond_1c

    :cond_17
    iget-object v1, p0, Lcom/google/android/gms/internal/zzid;->zzbau:Lcom/google/android/gms/internal/zzik;

    invoke-virtual {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/は〲ぱなで;->disconnect()V

    :cond_1c
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/zzid;->zzbau:Lcom/google/android/gms/internal/zzik;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzid;->zzbav:Lcom/google/android/gms/internal/zzio;

    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    monitor-exit v0

    return-void

    :catchall_26
    move-exception v1

    monitor-exit v0
    :try_end_28
    .catchall {:try_start_3 .. :try_end_28} :catchall_26

    throw v1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzik;)Lcom/google/android/gms/internal/zzik;
    .registers 2

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzid;->zzbau:Lcom/google/android/gms/internal/zzik;

    return-object p1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzio;)Lcom/google/android/gms/internal/zzio;
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzid;->zzbav:Lcom/google/android/gms/internal/zzio;

    return-object p1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzid;)V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzid;->disconnect()V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzid;)V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzid;->connect()V

    return-void
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/zzid;)Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzid;->mLock:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic zzd(Lcom/google/android/gms/internal/zzid;)Lcom/google/android/gms/internal/zzik;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzid;->zzbau:Lcom/google/android/gms/internal/zzik;

    return-object p0
.end method


# virtual methods
.method public final initialize(Landroid/content/Context;)V
    .registers 4

    if-nez p1, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzid;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_6
    iget-object v1, p0, Lcom/google/android/gms/internal/zzid;->mContext:Landroid/content/Context;

    if-eqz v1, :cond_c

    monitor-exit v0

    return-void

    :cond_c
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzid;->mContext:Landroid/content/Context;

    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbqh:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_28

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzid;->connect()V

    goto :goto_46

    :cond_28
    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbqg:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_46

    new-instance p1, Lcom/google/android/gms/internal/zzif;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/zzif;-><init>(Lcom/google/android/gms/internal/zzid;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzel()Lcom/google/android/gms/internal/zzhg;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzhg;->zza(Lcom/google/android/gms/internal/zzhj;)V

    :cond_46
    :goto_46
    monitor-exit v0

    return-void

    :catchall_48
    move-exception p1

    monitor-exit v0
    :try_end_4a
    .catchall {:try_start_6 .. :try_end_4a} :catchall_48

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzil;)Lcom/google/android/gms/internal/zzii;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzid;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzid;->zzbav:Lcom/google/android/gms/internal/zzio;

    if-nez v1, :cond_e

    new-instance p1, Lcom/google/android/gms/internal/zzii;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzii;-><init>()V

    monitor-exit v0
    :try_end_d
    .catchall {:try_start_3 .. :try_end_d} :catchall_21

    return-object p1

    :cond_e
    :try_start_e
    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zzio;->zza(Lcom/google/android/gms/internal/zzil;)Lcom/google/android/gms/internal/zzii;

    move-result-object p1
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_e .. :try_end_12} :catch_14
    .catchall {:try_start_e .. :try_end_12} :catchall_21

    :try_start_12
    monitor-exit v0

    return-object p1

    :catch_14
    move-exception p1

    const-string v1, "Unable to call into cache service."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lcom/google/android/gms/internal/zzii;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzii;-><init>()V

    monitor-exit v0

    return-object p1

    :catchall_21
    move-exception p1

    monitor-exit v0
    :try_end_23
    .catchall {:try_start_12 .. :try_end_23} :catchall_21

    throw p1
.end method

.method public final zzhe()V
    .registers 6

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbqi:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzid;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_15
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzid;->connect()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    sget-object v1, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzid;->zzbat:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzid;->zzbat:Ljava/lang/Runnable;

    sget-object v3, Lcom/google/android/gms/internal/zznh;->zzbqj:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    monitor-exit v0

    return-void

    :catchall_3c
    move-exception v1

    monitor-exit v0
    :try_end_3e
    .catchall {:try_start_15 .. :try_end_3e} :catchall_3c

    throw v1

    :cond_3f
    return-void
.end method
