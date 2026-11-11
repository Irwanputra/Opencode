.class public final Lcom/google/android/gms/internal/zzabo;
.super Lcom/google/android/gms/internal/zzagb;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field private static final sLock:Ljava/lang/Object;

.field private static zzclt:Lcom/google/android/gms/ads/internal/js/zzn;

.field private static zzcqh:J

.field private static zzcqi:Z

.field private static zzcqj:Lcom/google/android/gms/ads/internal/gmsg/HttpClient;

.field private static zzcqk:Lcom/google/android/gms/ads/internal/gmsg/zzy;

.field private static zzcql:Lcom/google/android/gms/ads/internal/gmsg/zzt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzcjn:Ljava/lang/Object;

.field private final zzcmm:Lcom/google/android/gms/internal/zzzx;

.field private final zzcmn:Lcom/google/android/gms/internal/zzaau;

.field private zzcmp:Lcom/google/android/gms/internal/zzix;

.field private zzcqm:Lcom/google/android/gms/ads/internal/js/zzaa;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/zzabo;->zzcqh:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzabo;->sLock:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/android/gms/internal/zzabo;->zzcqi:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/google/android/gms/internal/zzabo;->zzclt:Lcom/google/android/gms/ads/internal/js/zzn;

    sput-object v0, Lcom/google/android/gms/internal/zzabo;->zzcqj:Lcom/google/android/gms/ads/internal/gmsg/HttpClient;

    sput-object v0, Lcom/google/android/gms/internal/zzabo;->zzcqk:Lcom/google/android/gms/ads/internal/gmsg/zzy;

    sput-object v0, Lcom/google/android/gms/internal/zzabo;->zzcql:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzaau;Lcom/google/android/gms/internal/zzzx;Lcom/google/android/gms/internal/zzix;)V
    .registers 12

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzagb;-><init>(Z)V

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzabo;->zzcjn:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzabo;->zzcmm:Lcom/google/android/gms/internal/zzzx;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzabo;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzabo;->zzcmn:Lcom/google/android/gms/internal/zzaau;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzabo;->zzcmp:Lcom/google/android/gms/internal/zzix;

    sget-object p3, Lcom/google/android/gms/internal/zzabo;->sLock:Ljava/lang/Object;

    monitor-enter p3

    :try_start_16
    sget-boolean p4, Lcom/google/android/gms/internal/zzabo;->zzcqi:Z

    if-nez p4, :cond_5c

    new-instance p4, Lcom/google/android/gms/ads/internal/gmsg/zzy;

    invoke-direct {p4}, Lcom/google/android/gms/ads/internal/gmsg/zzy;-><init>()V

    sput-object p4, Lcom/google/android/gms/internal/zzabo;->zzcqk:Lcom/google/android/gms/ads/internal/gmsg/zzy;

    new-instance p4, Lcom/google/android/gms/ads/internal/gmsg/HttpClient;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p2, Lcom/google/android/gms/internal/zzaau;->zzaty:Lcom/google/android/gms/internal/zzakd;

    invoke-direct {p4, v1, v2}, Lcom/google/android/gms/ads/internal/gmsg/HttpClient;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)V

    sput-object p4, Lcom/google/android/gms/internal/zzabo;->zzcqj:Lcom/google/android/gms/ads/internal/gmsg/HttpClient;

    new-instance p4, Lcom/google/android/gms/internal/zzabw;

    invoke-direct {p4}, Lcom/google/android/gms/internal/zzabw;-><init>()V

    sput-object p4, Lcom/google/android/gms/internal/zzabo;->zzcql:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    new-instance p4, Lcom/google/android/gms/ads/internal/js/zzn;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p2, Lcom/google/android/gms/internal/zzaau;->zzaty:Lcom/google/android/gms/internal/zzakd;

    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbhm:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    new-instance v5, Lcom/google/android/gms/internal/zzabv;

    invoke-direct {v5}, Lcom/google/android/gms/internal/zzabv;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/zzabu;

    invoke-direct {v6}, Lcom/google/android/gms/internal/zzabu;-><init>()V

    move-object v1, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/js/zzn;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Ljava/lang/String;Lcom/google/android/gms/internal/zzaiq;Lcom/google/android/gms/internal/zzaiq;)V

    sput-object p4, Lcom/google/android/gms/internal/zzabo;->zzclt:Lcom/google/android/gms/ads/internal/js/zzn;

    sput-boolean v0, Lcom/google/android/gms/internal/zzabo;->zzcqi:Z

    :cond_5c
    monitor-exit p3

    return-void

    :catchall_5e
    move-exception p1

    monitor-exit p3
    :try_end_60
    .catchall {:try_start_16 .. :try_end_60} :catchall_5e

    throw p1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzabo;Lcom/google/android/gms/ads/internal/js/zzaa;)Lcom/google/android/gms/ads/internal/js/zzaa;
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzabo;->zzcqm:Lcom/google/android/gms/ads/internal/js/zzaa;

    return-object p1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzabo;)Lcom/google/android/gms/internal/zzzx;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzabo;->zzcmm:Lcom/google/android/gms/internal/zzzx;

    return-object p0
.end method

.method private final zza(Lcom/google/android/gms/internal/zzaat;Ljava/lang/String;)Lorg/json/JSONObject;
    .registers 8

    iget-object v0, p1, Lcom/google/android/gms/internal/zzaat;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzjj;->extras:Landroid/os/Bundle;

    const-string v1, "sdk_less_server_data"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_e

    return-object v1

    :cond_e
    :try_start_e
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzes()Lcom/google/android/gms/internal/zzacq;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzabo;->mContext:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzacq;->zzo(Landroid/content/Context;)Ljava/util/concurrent/Future;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzaco;
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_1e} :catch_1f

    goto :goto_26

    :catch_1f
    move-exception v2

    const-string v3, "Error grabbing device info: "

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v2, v1

    :goto_26
    iget-object v3, p0, Lcom/google/android/gms/internal/zzabo;->mContext:Landroid/content/Context;

    new-instance v4, Lcom/google/android/gms/internal/zzabz;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzabz;-><init>()V

    iput-object p1, v4, Lcom/google/android/gms/internal/zzabz;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iput-object v2, v4, Lcom/google/android/gms/internal/zzabz;->zzcqw:Lcom/google/android/gms/internal/zzaco;

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/zzacg;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzabz;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_38

    return-object v1

    :cond_38
    :try_start_38
    iget-object v2, p0, Lcom/google/android/gms/internal/zzabo;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v2
    :try_end_3e
    .catch Ljava/io/IOException; {:try_start_38 .. :try_end_3e} :catch_43
    .catch Ljava/lang/IllegalStateException; {:try_start_38 .. :try_end_3e} :catch_41
    .catch Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/げつ〴ぬぐ; {:try_start_38 .. :try_end_3e} :catch_3f

    goto :goto_4a

    :catch_3f
    move-exception v2

    goto :goto_44

    :catch_41
    move-exception v2

    goto :goto_44

    :catch_43
    move-exception v2

    :goto_44
    const-string v3, "Cannot get advertising id info"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v2, v1

    :goto_4a
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v4, "request_id"

    invoke-virtual {v3, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "request_param"

    invoke-virtual {v3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "data"

    invoke-virtual {v3, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v2, :cond_76

    invoke-virtual {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object p1

    const-string p2, "adid"

    invoke-virtual {v3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "lat"

    invoke-virtual {v3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_76
    :try_start_76
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/zzahn;->zzq(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_7e
    .catch Lorg/json/JSONException; {:try_start_76 .. :try_end_7e} :catch_7f

    return-object p1

    :catch_7f
    return-object v1
.end method

.method public static zza(Lcom/google/android/gms/ads/internal/js/zzc;)V
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzabo;->zzcqk:Lcom/google/android/gms/ads/internal/gmsg/zzy;

    const-string v1, "/loadAd"

    invoke-interface {p0, v1, v0}, Lcom/google/android/gms/ads/internal/js/zzaj;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v0, Lcom/google/android/gms/internal/zzabo;->zzcqj:Lcom/google/android/gms/ads/internal/gmsg/HttpClient;

    const-string v1, "/fetchHttpRequest"

    invoke-interface {p0, v1, v0}, Lcom/google/android/gms/ads/internal/js/zzaj;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v0, Lcom/google/android/gms/internal/zzabo;->zzcql:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v1, "/invalidRequest"

    invoke-interface {p0, v1, v0}, Lcom/google/android/gms/ads/internal/js/zzaj;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzabo;)Lcom/google/android/gms/ads/internal/js/zzaa;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzabo;->zzcqm:Lcom/google/android/gms/ads/internal/js/zzaa;

    return-object p0
.end method

.method public static zzb(Lcom/google/android/gms/ads/internal/js/zzc;)V
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzabo;->zzcqk:Lcom/google/android/gms/ads/internal/gmsg/zzy;

    const-string v1, "/loadAd"

    invoke-interface {p0, v1, v0}, Lcom/google/android/gms/ads/internal/js/zzaj;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v0, Lcom/google/android/gms/internal/zzabo;->zzcqj:Lcom/google/android/gms/ads/internal/gmsg/HttpClient;

    const-string v1, "/fetchHttpRequest"

    invoke-interface {p0, v1, v0}, Lcom/google/android/gms/ads/internal/js/zzaj;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v0, Lcom/google/android/gms/internal/zzabo;->zzcql:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v1, "/invalidRequest"

    invoke-interface {p0, v1, v0}, Lcom/google/android/gms/ads/internal/js/zzaj;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    return-void
.end method

.method private final zzc(Lcom/google/android/gms/internal/zzaat;)Lcom/google/android/gms/internal/zzaax;
    .registers 10

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzqb()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzabo;->zza(Lcom/google/android/gms/internal/zzaat;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_14

    new-instance p1, Lcom/google/android/gms/internal/zzaax;

    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    return-object p1

    :cond_14
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v3

    check-cast v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    .line 2
    sget-object v5, Lcom/google/android/gms/internal/zzabo;->zzcqk:Lcom/google/android/gms/ads/internal/gmsg/zzy;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/ads/internal/gmsg/zzy;->zzas(Ljava/lang/String;)Ljava/util/concurrent/Future;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/internal/zzajr;->zzajw:Landroid/os/Handler;

    new-instance v7, Lcom/google/android/gms/internal/zzabq;

    invoke-direct {v7, p0, v1, v0}, Lcom/google/android/gms/internal/zzabq;-><init>(Lcom/google/android/gms/internal/zzabo;Lorg/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-wide v0, Lcom/google/android/gms/internal/zzabo;->zzcqh:J

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v6

    check-cast v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 3
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    sub-long/2addr v6, v3

    sub-long/2addr v0, v6

    const/4 v3, -0x1

    .line 4
    :try_start_43
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v5, v0, v1, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;
    :try_end_4b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_43 .. :try_end_4b} :catch_7e
    .catch Ljava/lang/InterruptedException; {:try_start_43 .. :try_end_4b} :catch_7e
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_43 .. :try_end_4b} :catch_77
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_43 .. :try_end_4b} :catch_71

    if-nez v0, :cond_53

    new-instance p1, Lcom/google/android/gms/internal/zzaax;

    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    return-object p1

    :cond_53
    iget-object v1, p0, Lcom/google/android/gms/internal/zzabo;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, p1, v0}, Lcom/google/android/gms/internal/zzacg;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzaat;Ljava/lang/String;)Lcom/google/android/gms/internal/zzaax;

    move-result-object p1

    iget v0, p1, Lcom/google/android/gms/internal/zzaax;->errorCode:I

    const/4 v1, -0x3

    if-eq v0, v1, :cond_70

    iget-object v0, p1, Lcom/google/android/gms/internal/zzaax;->body:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_70

    new-instance p1, Lcom/google/android/gms/internal/zzaax;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    :cond_70
    return-object p1

    :catch_71
    new-instance p1, Lcom/google/android/gms/internal/zzaax;

    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    return-object p1

    :catch_77
    new-instance p1, Lcom/google/android/gms/internal/zzaax;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    return-object p1

    :catch_7e
    new-instance p1, Lcom/google/android/gms/internal/zzaax;

    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    return-object p1
.end method

.method public static synthetic zzno()Lcom/google/android/gms/ads/internal/gmsg/zzy;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzabo;->zzcqk:Lcom/google/android/gms/ads/internal/gmsg/zzy;

    return-object v0
.end method

.method public static synthetic zznp()Lcom/google/android/gms/ads/internal/js/zzn;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzabo;->zzclt:Lcom/google/android/gms/ads/internal/js/zzn;

    return-object v0
.end method


# virtual methods
.method public final onStop()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabo;->zzcjn:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/google/android/gms/internal/zzajr;->zzajw:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/zzabt;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/zzabt;-><init>(Lcom/google/android/gms/internal/zzabo;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v0

    return-void

    :catchall_f
    move-exception v1

    monitor-exit v0
    :try_end_11
    .catchall {:try_start_3 .. :try_end_11} :catchall_f

    throw v1
.end method

.method public final zzdm()V
    .registers 15

    const-string v0, "SdkLessAdLoaderBackgroundTask started."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzabo;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaff;->zzy(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v9, Lcom/google/android/gms/internal/zzaat;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzabo;->zzcmn:Lcom/google/android/gms/internal/zzaau;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzabo;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzaff;->zzw(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzabo;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzaff;->zzx(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    const-wide/16 v4, -0x1

    move-object v2, v9

    move-object v8, v0

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/zzaat;-><init>(Lcom/google/android/gms/internal/zzaau;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzabo;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/zzaff;->zzg(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0, v9}, Lcom/google/android/gms/internal/zzabo;->zzc(Lcom/google/android/gms/internal/zzaat;)Lcom/google/android/gms/internal/zzaax;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    .line 2
    new-instance v0, Lcom/google/android/gms/internal/zzafp;

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget v6, v3, Lcom/google/android/gms/internal/zzaax;->errorCode:I

    iget-wide v10, v3, Lcom/google/android/gms/internal/zzaax;->zzcpa:J

    const/4 v12, 0x0

    iget-object v13, p0, Lcom/google/android/gms/internal/zzabo;->zzcmp:Lcom/google/android/gms/internal/zzix;

    move-object v1, v0

    move-object v2, v9

    move-wide v9, v10

    move-object v11, v12

    move-object v12, v13

    invoke-direct/range {v1 .. v12}, Lcom/google/android/gms/internal/zzafp;-><init>(Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaax;Lcom/google/android/gms/internal/zzui;Lcom/google/android/gms/internal/zzjn;IJJLorg/json/JSONObject;Lcom/google/android/gms/internal/zzix;)V

    sget-object v1, Lcom/google/android/gms/internal/zzajr;->zzajw:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/zzabp;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/zzabp;-><init>(Lcom/google/android/gms/internal/zzabo;Lcom/google/android/gms/internal/zzafp;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
