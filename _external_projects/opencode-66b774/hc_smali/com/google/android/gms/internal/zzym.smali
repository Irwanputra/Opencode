.class public final Lcom/google/android/gms/internal/zzym;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/google/android/gms/internal/zzafo;",
        ">;"
    }
.end annotation


# static fields
.field private static zzckf:J = 0xaL


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mErrorCode:I

.field private final mLock:Ljava/lang/Object;

.field private final zzanj:Lcom/google/android/gms/internal/zznu;

.field private final zzarn:Lcom/google/android/gms/internal/zzzb;

.field private final zzbuv:Lcom/google/android/gms/internal/zzcv;

.field private final zzcjk:Lcom/google/android/gms/internal/zzafp;

.field private final zzckg:Lcom/google/android/gms/internal/zzaiv;

.field private final zzckh:Lcom/google/android/gms/ads/internal/zzba;

.field private zzcki:Z

.field private zzckj:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzckk:Lorg/json/JSONObject;

.field private zzckl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzba;Lcom/google/android/gms/internal/zzaiv;Lcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/internal/zzafp;Lcom/google/android/gms/internal/zznu;)V
    .registers 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzym;->mLock:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzym;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzym;->zzckh:Lcom/google/android/gms/ads/internal/zzba;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzym;->zzckg:Lcom/google/android/gms/internal/zzaiv;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzym;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzym;->zzbuv:Lcom/google/android/gms/internal/zzcv;

    iput-object p6, p0, Lcom/google/android/gms/internal/zzym;->zzanj:Lcom/google/android/gms/internal/zznu;

    invoke-virtual {p2}, Lcom/google/android/gms/ads/internal/zzba;->zzdq()Lcom/google/android/gms/internal/zzzb;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzym;->zzarn:Lcom/google/android/gms/internal/zzzb;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzym;->zzcki:Z

    const/4 p1, -0x2

    iput p1, p0, Lcom/google/android/gms/internal/zzym;->mErrorCode:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzym;->zzckj:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzym;->zzckl:Ljava/lang/String;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzym;)Lcom/google/android/gms/ads/internal/zzba;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzym;->zzckh:Lcom/google/android/gms/ads/internal/zzba;

    return-object p0
.end method

.method private final zza(Lcom/google/android/gms/internal/zzou;)Lcom/google/android/gms/internal/zzafo;
    .registers 47

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/google/android/gms/internal/zzym;->mLock:Ljava/lang/Object;

    monitor-enter v2

    :try_start_5
    iget v0, v1, Lcom/google/android/gms/internal/zzym;->mErrorCode:I

    const/4 v3, -0x2

    if-nez p1, :cond_f

    if-ne v0, v3, :cond_f

    const/4 v0, 0x0

    const/4 v8, 0x0

    goto :goto_10

    :cond_f
    move v8, v0

    :goto_10
    monitor-exit v2
    :try_end_11
    .catchall {:try_start_5 .. :try_end_11} :catchall_85

    if-eq v8, v3, :cond_17

    const/4 v0, 0x0

    move-object/from16 v32, v0

    goto :goto_19

    :cond_17
    move-object/from16 v32, p1

    :goto_19
    new-instance v0, Lcom/google/android/gms/internal/zzafo;

    move-object v4, v0

    iget-object v2, v1, Lcom/google/android/gms/internal/zzym;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v3, v2, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v5, v3, Lcom/google/android/gms/internal/zzaat;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    const/4 v6, 0x0

    iget-object v15, v2, Lcom/google/android/gms/internal/zzafp;->zzcxy:Lcom/google/android/gms/internal/zzaax;

    iget-object v7, v15, Lcom/google/android/gms/internal/zzaax;->zzcdk:Ljava/util/List;

    iget-object v9, v15, Lcom/google/android/gms/internal/zzaax;->zzcdl:Ljava/util/List;

    iget-object v10, v1, Lcom/google/android/gms/internal/zzym;->zzckj:Ljava/util/List;

    iget v11, v15, Lcom/google/android/gms/internal/zzaax;->orientation:I

    iget-wide v12, v15, Lcom/google/android/gms/internal/zzaax;->zzcdq:J

    iget-object v14, v3, Lcom/google/android/gms/internal/zzaat;->zzcng:Ljava/lang/String;

    const/4 v3, 0x0

    move-object v6, v15

    move v15, v3

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    iget-object v3, v2, Lcom/google/android/gms/internal/zzafp;->zzauc:Lcom/google/android/gms/internal/zzjn;

    move-object/from16 v23, v3

    move-object/from16 v44, v4

    iget-wide v3, v6, Lcom/google/android/gms/internal/zzaax;->zzcov:J

    move-wide/from16 v24, v3

    iget-wide v3, v2, Lcom/google/android/gms/internal/zzafp;->zzcxp:J

    move-wide/from16 v26, v3

    iget-wide v3, v2, Lcom/google/android/gms/internal/zzafp;->zzcxq:J

    move-wide/from16 v28, v3

    iget-object v3, v6, Lcom/google/android/gms/internal/zzaax;->zzcpb:Ljava/lang/String;

    move-object/from16 v30, v3

    iget-object v3, v1, Lcom/google/android/gms/internal/zzym;->zzckk:Lorg/json/JSONObject;

    move-object/from16 v31, v3

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    iget-boolean v3, v6, Lcom/google/android/gms/internal/zzaax;->zzcpo:Z

    move/from16 v36, v3

    iget-object v3, v6, Lcom/google/android/gms/internal/zzaax;->zzcpp:Lcom/google/android/gms/internal/zzaaz;

    move-object/from16 v37, v3

    const/16 v38, 0x0

    iget-object v3, v6, Lcom/google/android/gms/internal/zzaax;->zzcdn:Ljava/util/List;

    move-object/from16 v39, v3

    iget-object v3, v1, Lcom/google/android/gms/internal/zzym;->zzckl:Ljava/lang/String;

    move-object/from16 v40, v3

    iget-object v3, v2, Lcom/google/android/gms/internal/zzafp;->zzcxw:Lcom/google/android/gms/internal/zzis;

    move-object/from16 v41, v3

    iget-boolean v3, v6, Lcom/google/android/gms/internal/zzaax;->zzaqv:Z

    move/from16 v42, v3

    iget-boolean v2, v2, Lcom/google/android/gms/internal/zzafp;->zzcxx:Z

    move/from16 v43, v2

    move-object/from16 v4, v44

    const/4 v6, 0x0

    invoke-direct/range {v4 .. v43}, Lcom/google/android/gms/internal/zzafo;-><init>(Lcom/google/android/gms/internal/zzjj;Lcom/google/android/gms/internal/zzanh;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/zzuh;Lcom/google/android/gms/internal/zzva;Ljava/lang/String;Lcom/google/android/gms/internal/zzui;Lcom/google/android/gms/internal/zzuk;JLcom/google/android/gms/internal/zzjn;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/zzou;Lcom/google/android/gms/internal/zzaeq;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/zzaaz;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/zzis;ZZ)V

    return-object v0

    :catchall_85
    move-exception v0

    :try_start_86
    monitor-exit v2
    :try_end_87
    .catchall {:try_start_86 .. :try_end_87} :catchall_85

    throw v0
.end method

.method private final zza(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/internal/zzakv;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "ZZ)",
            "Lcom/google/android/gms/internal/zzakv<",
            "Lcom/google/android/gms/internal/zzoi;",
            ">;"
        }
    .end annotation

    const-string v0, "url"

    if-eqz p2, :cond_9

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_d

    :cond_9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_d
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const-string v3, "scale"

    invoke-virtual {p1, v3, v1, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    const/4 v1, 0x1

    const-string v2, "is_transparent"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_2c

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzym;->zzd(IZ)V

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakl;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaku;

    move-result-object p1

    return-object p1

    :cond_2c
    if-eqz p3, :cond_3c

    new-instance p1, Lcom/google/android/gms/internal/zzoi;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-direct {p1, v1, p2, v4, v5}, Lcom/google/android/gms/internal/zzoi;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;D)V

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakl;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaku;

    move-result-object p1

    return-object p1

    :cond_3c
    iget-object p1, p0, Lcom/google/android/gms/internal/zzym;->zzckg:Lcom/google/android/gms/internal/zzaiv;

    new-instance p3, Lcom/google/android/gms/internal/zzyq;

    move-object v1, p3

    move-object v2, p0

    move v3, p2

    move-object v7, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/zzyq;-><init>(Lcom/google/android/gms/internal/zzym;ZDZLjava/lang/String;)V

    invoke-virtual {p1, v0, p3}, Lcom/google/android/gms/internal/zzaiv;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzajb;)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzym;Lcom/google/android/gms/internal/zzqm;Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzym;->zzc(Lcom/google/android/gms/internal/zzqm;Ljava/lang/String;)V

    return-void
.end method

.method public static zzb(Lcom/google/android/gms/internal/zzakv;)Lcom/google/android/gms/internal/zzanh;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzakv<",
            "Lcom/google/android/gms/internal/zzanh;",
            ">;)",
            "Lcom/google/android/gms/internal/zzanh;"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbot:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzanh;
    :try_end_19
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_19} :catch_25
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_19} :catch_1e
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_19} :catch_1c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_19} :catch_1a

    return-object p0

    :catch_1a
    move-exception p0

    goto :goto_1f

    :catch_1c
    move-exception p0

    goto :goto_1f

    :catch_1e
    move-exception p0

    :goto_1f
    const-string v0, "Exception occurred while waiting for video to load"

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_32

    :catch_25
    move-exception p0

    const-string v0, "InterruptedException occurred while waiting for video to load"

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    :goto_32
    const/4 p0, 0x0

    return-object p0
.end method

.method private static zzb(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
    .registers 4

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string p1, "r"

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    const-string v0, "g"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "b"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p1, v0, p0}, Landroid/graphics/Color;->rgb(III)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_1e
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_1e} :catch_1f

    return-object p0

    :catch_1f
    const/4 p0, 0x0

    return-object p0
.end method

.method private final zzc(Lcom/google/android/gms/internal/zzqm;Ljava/lang/String;)V
    .registers 5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzym;->zzckh:Lcom/google/android/gms/ads/internal/zzba;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzqm;->getCustomTemplateId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzba;->zzs(Ljava/lang/String;)Lcom/google/android/gms/internal/zzqw;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/zzqw;->zzb(Lcom/google/android/gms/internal/zzqm;Ljava/lang/String;)V
    :try_end_f
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_f} :catch_10

    :cond_f
    return-void

    :catch_10
    move-exception p1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x28

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Failed to call onCustomClick for asset "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static zzd(Lorg/json/JSONObject;Ljava/lang/String;)[Ljava/lang/String;
    .registers 4

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-nez p0, :cond_8

    const/4 p0, 0x0

    return-object p0

    :cond_8
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result p1

    new-array p1, p1, [Ljava/lang/String;

    const/4 v0, 0x0

    :goto_f
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_1e

    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    :cond_1e
    return-object p1
.end method

.method private static zzl(Ljava/util/List;)Lcom/google/android/gms/internal/zzakv;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzakv<",
            "TV;>;>;)",
            "Lcom/google/android/gms/internal/zzakv<",
            "Ljava/util/List<",
            "TV;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzalf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzalf;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/zzakv;

    new-instance v5, Lcom/google/android/gms/internal/zzyr;

    invoke-direct {v5, v2, v1, v0, p0}, Lcom/google/android/gms/internal/zzyr;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;ILcom/google/android/gms/internal/zzalf;Ljava/util/List;)V

    sget-object v6, Lcom/google/android/gms/internal/zzahh;->zzdar:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {v4, v5, v6}, Lcom/google/android/gms/internal/zzakv;->zza(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_13

    :cond_2a
    return-object v0
.end method

.method private static zzm(Ljava/util/List;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzakv<",
            "TV;>;>;)",
            "Ljava/util/List<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_9
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzakv;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_1f
    return-object v0
.end method

.method public static synthetic zzn(Ljava/util/List;)Ljava/util/List;
    .registers 1

    invoke-static {p0}, Lcom/google/android/gms/internal/zzym;->zzm(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final zzng()Lcom/google/android/gms/internal/zzafo;
    .registers 14

    const-string v0, "custom_template_id"

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_4
    iget-object v3, p0, Lcom/google/android/gms/internal/zzym;->zzckh:Lcom/google/android/gms/ads/internal/zzba;

    invoke-virtual {v3}, Lcom/google/android/gms/ads/internal/zzba;->getUuid()Ljava/lang/String;

    move-result-object v12

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzym;->zznh()Z

    move-result v3

    if-nez v3, :cond_78

    new-instance v3, Lcom/google/android/gms/internal/zzalf;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzalf;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/zzyl;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzyl;-><init>()V

    new-instance v3, Lorg/json/JSONObject;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzym;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzafp;->zzcxy:Lcom/google/android/gms/internal/zzaax;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzaax;->body:Ljava/lang/String;

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v4, Lorg/json/JSONObject;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzym;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v5, v5, Lcom/google/android/gms/internal/zzafp;->zzcxy:Lcom/google/android/gms/internal/zzaax;

    iget-object v5, v5, Lcom/google/android/gms/internal/zzaax;->body:Ljava/lang/String;

    invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    move-result v5
    :try_end_34
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_34} :catch_189
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_34} :catch_189
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_34} :catch_189
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_34} :catch_182
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_34} :catch_17e
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_34} :catch_17a

    const-string v6, "ads"

    if-eqz v5, :cond_4c

    :try_start_38
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_43

    invoke-virtual {v4, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    goto :goto_44

    :cond_43
    move-object v4, v2

    :goto_44
    if-eqz v4, :cond_4c

    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    move-result v4

    if-nez v4, :cond_50

    :cond_4c
    const/4 v4, 0x3

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/zzym;->zzz(I)V

    :cond_50
    iget-object v4, p0, Lcom/google/android/gms/internal/zzym;->zzarn:Lcom/google/android/gms/internal/zzzb;

    invoke-interface {v4, v3}, Lcom/google/android/gms/internal/zzzb;->zzi(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v3

    sget-wide v4, Lcom/google/android/gms/internal/zzym;->zzckf:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v3, v4, v5, v7}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONObject;

    const-string v4, "success"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_78

    const-string v4, "json"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    move-object v9, v3

    goto :goto_79

    :cond_78
    move-object v9, v2

    :goto_79
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzym;->zznh()Z

    move-result v3

    if-nez v3, :cond_10b

    if-nez v9, :cond_83

    goto/16 :goto_10b

    :cond_83
    const-string v3, "template_id"

    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/zzym;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzaat;->zzauo:Lcom/google/android/gms/internal/zzpe;

    if-eqz v4, :cond_94

    iget-boolean v5, v4, Lcom/google/android/gms/internal/zzpe;->zzbve:Z

    goto :goto_95

    :cond_94
    const/4 v5, 0x0

    :goto_95
    if-eqz v4, :cond_9a

    iget-boolean v4, v4, Lcom/google/android/gms/internal/zzpe;->zzbvg:Z

    goto :goto_9b

    :cond_9a
    const/4 v4, 0x0

    :goto_9b
    const-string v6, "2"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ad

    new-instance v0, Lcom/google/android/gms/internal/zzzc;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzym;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/zzafp;->zzcxx:Z

    invoke-direct {v0, v5, v4, v3}, Lcom/google/android/gms/internal/zzzc;-><init>(ZZZ)V

    goto :goto_10c

    :cond_ad
    const-string v6, "1"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_bf

    new-instance v0, Lcom/google/android/gms/internal/zzzd;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzym;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/zzafp;->zzcxx:Z

    invoke-direct {v0, v5, v4, v3}, Lcom/google/android/gms/internal/zzzd;-><init>(ZZZ)V

    goto :goto_10c

    :cond_bf
    const-string v4, "3"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_108

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/zzalf;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzalf;-><init>()V

    sget-object v6, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v7, Lcom/google/android/gms/internal/zzyn;

    invoke-direct {v7, p0, v4, v3}, Lcom/google/android/gms/internal/zzyn;-><init>(Lcom/google/android/gms/internal/zzym;Lcom/google/android/gms/internal/zzalf;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-wide v6, Lcom/google/android/gms/internal/zzym;->zzckf:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v6, v7, v3}, Lcom/google/android/gms/internal/zzalf;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_ea

    new-instance v0, Lcom/google/android/gms/internal/zzze;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/zzze;-><init>(Z)V

    goto :goto_10c

    :cond_ea
    const-string v3, "No handler for custom template: "

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_ff

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_104

    :cond_ff
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_104
    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    goto :goto_10b

    :cond_108
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzym;->zzz(I)V

    :cond_10b
    :goto_10b
    move-object v0, v2

    :goto_10c
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzym;->zznh()Z

    move-result v3

    if-nez v3, :cond_15a

    if-eqz v0, :cond_15a

    if-nez v9, :cond_117

    goto :goto_15a

    :cond_117
    const-string v3, "tracking_urls_and_actions"

    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "impression_tracking_urls"

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/zzym;->zzd(Lorg/json/JSONObject;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_127

    move-object v4, v2

    goto :goto_12b

    :cond_127
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :goto_12b
    iput-object v4, p0, Lcom/google/android/gms/internal/zzym;->zzckj:Ljava/util/List;

    const-string v4, "active_view"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/gms/internal/zzym;->zzckk:Lorg/json/JSONObject;

    const-string v3, "debug_signals"

    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/gms/internal/zzym;->zzckl:Ljava/lang/String;

    invoke-interface {v0, p0, v9}, Lcom/google/android/gms/internal/zzys;->zza(Lcom/google/android/gms/internal/zzym;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzou;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/zzow;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzym;->mContext:Landroid/content/Context;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzym;->zzckh:Lcom/google/android/gms/ads/internal/zzba;

    iget-object v7, p0, Lcom/google/android/gms/internal/zzym;->zzarn:Lcom/google/android/gms/internal/zzzb;

    iget-object v8, p0, Lcom/google/android/gms/internal/zzym;->zzbuv:Lcom/google/android/gms/internal/zzcv;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzym;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v11, v4, Lcom/google/android/gms/internal/zzaat;->zzaty:Lcom/google/android/gms/internal/zzakd;

    move-object v4, v3

    move-object v10, v0

    invoke-direct/range {v4 .. v12}, Lcom/google/android/gms/internal/zzow;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzot;Lcom/google/android/gms/internal/zzzb;Lcom/google/android/gms/internal/zzcv;Lorg/json/JSONObject;Lcom/google/android/gms/internal/zzou;Lcom/google/android/gms/internal/zzakd;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/zzou;->zzb(Lcom/google/android/gms/internal/zzos;)V

    goto :goto_15b

    :cond_15a
    :goto_15a
    move-object v0, v2

    :goto_15b
    instance-of v3, v0, Lcom/google/android/gms/internal/zzon;

    if-eqz v3, :cond_175

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/zzon;

    new-instance v4, Lcom/google/android/gms/internal/zzyl;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzyl;-><init>()V

    new-instance v5, Lcom/google/android/gms/internal/zzyo;

    invoke-direct {v5, p0, v3}, Lcom/google/android/gms/internal/zzyo;-><init>(Lcom/google/android/gms/internal/zzym;Lcom/google/android/gms/internal/zzon;)V

    iput-object v5, v4, Lcom/google/android/gms/internal/zzyl;->zzcke:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzym;->zzarn:Lcom/google/android/gms/internal/zzzb;

    const-string v4, "/nativeAdCustomClick"

    invoke-interface {v3, v4, v5}, Lcom/google/android/gms/internal/zzzb;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    :cond_175
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzym;->zza(Lcom/google/android/gms/internal/zzou;)Lcom/google/android/gms/internal/zzafo;

    move-result-object v0
    :try_end_179
    .catch Ljava/util/concurrent/CancellationException; {:try_start_38 .. :try_end_179} :catch_189
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_38 .. :try_end_179} :catch_189
    .catch Ljava/lang/InterruptedException; {:try_start_38 .. :try_end_179} :catch_189
    .catch Lorg/json/JSONException; {:try_start_38 .. :try_end_179} :catch_182
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_38 .. :try_end_179} :catch_17e
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_179} :catch_17a

    return-object v0

    :catch_17a
    move-exception v0

    const-string v3, "Error occured while doing native ads initialization."

    goto :goto_185

    :catch_17e
    move-exception v0

    const-string v3, "Timeout when loading native ad."

    goto :goto_185

    :catch_182
    move-exception v0

    const-string v3, "Malformed native JSON response."

    :goto_185
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_18a

    :catch_189
    nop

    :goto_18a
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzym;->zzcki:Z

    if-nez v0, :cond_191

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzym;->zzz(I)V

    :cond_191
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/zzym;->zza(Lcom/google/android/gms/internal/zzou;)Lcom/google/android/gms/internal/zzafo;

    move-result-object v0

    return-object v0
.end method

.method private final zznh()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzym;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzym;->zzcki:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method private final zzz(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzym;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzym;->zzcki:Z

    iput p1, p0, Lcom/google/android/gms/internal/zzym;->mErrorCode:I

    monitor-exit v0

    return-void

    :catchall_a
    move-exception p1

    monitor-exit v0
    :try_end_c
    .catchall {:try_start_4 .. :try_end_c} :catchall_a

    throw p1
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzym;->zzng()Lcom/google/android/gms/internal/zzafo;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Lorg/json/JSONObject;Ljava/lang/String;ZZ)Lcom/google/android/gms/internal/zzakv;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "ZZ)",
            "Lcom/google/android/gms/internal/zzakv<",
            "Lcom/google/android/gms/internal/zzoi;",
            ">;"
        }
    .end annotation

    if-eqz p3, :cond_7

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_b

    :cond_7
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    :goto_b
    if-nez p1, :cond_12

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :cond_12
    invoke-direct {p0, p1, p3, p4}, Lcom/google/android/gms/internal/zzym;->zza(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lorg/json/JSONObject;Ljava/lang/String;ZZZ)Ljava/util/List;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "ZZZ)",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzakv<",
            "Lcom/google/android/gms/internal/zzoi;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 p3, 0x0

    if-eqz p1, :cond_34

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-nez v0, :cond_13

    goto :goto_34

    :cond_13
    if-eqz p5, :cond_1a

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result p5

    goto :goto_1b

    :cond_1a
    const/4 p5, 0x1

    :goto_1b
    const/4 v0, 0x0

    :goto_1c
    if-ge v0, p5, :cond_33

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_29

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :cond_29
    invoke-direct {p0, v1, p3, p4}, Lcom/google/android/gms/internal/zzym;->zza(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/internal/zzakv;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1c

    :cond_33
    return-object p2

    :cond_34
    :goto_34
    invoke-virtual {p0, p3, p3}, Lcom/google/android/gms/internal/zzym;->zzd(IZ)V

    return-object p2
.end method

.method public final zza(Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/concurrent/Future<",
            "Lcom/google/android/gms/internal/zzoi;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "require"

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p2

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzym;->zza(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    return-object p1
.end method

.method public final zzc(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/internal/zzakv;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/zzakv<",
            "Lcom/google/android/gms/internal/zzanh;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_c

    invoke-static {p2}, Lcom/google/android/gms/internal/zzakl;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaku;

    move-result-object p1

    return-object p1

    :cond_c
    const-string v0, "vast_xml"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_22

    const-string p1, "Required field \'vast_xml\' is missing"

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/google/android/gms/internal/zzakl;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaku;

    move-result-object p1

    return-object p1

    :cond_22
    iget-object v1, p0, Lcom/google/android/gms/internal/zzym;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzym;->zzbuv:Lcom/google/android/gms/internal/zzcv;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzym;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzym;->zzanj:Lcom/google/android/gms/internal/zznu;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzym;->zzckh:Lcom/google/android/gms/ads/internal/zzba;

    new-instance p2, Lcom/google/android/gms/internal/zzyt;

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzyt;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/internal/zzafp;Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/ads/internal/zzba;)V

    new-instance v0, Lcom/google/android/gms/internal/zzalf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzalf;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    new-instance v1, Lcom/google/android/gms/internal/zzyu;

    invoke-direct {v1, p2, p1, v0}, Lcom/google/android/gms/internal/zzyu;-><init>(Lcom/google/android/gms/internal/zzyt;Lorg/json/JSONObject;Lcom/google/android/gms/internal/zzalf;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/zzahn;->runOnUiThread(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public final zzd(IZ)V
    .registers 3

    if-eqz p2, :cond_5

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzym;->zzz(I)V

    :cond_5
    return-void
.end method

.method public final zzh(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzakv;
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/internal/zzakv<",
            "Lcom/google/android/gms/internal/zzog;",
            ">;"
        }
    .end annotation

    const-string v0, "attribution"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_e

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakl;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaku;

    move-result-object p1

    return-object p1

    :cond_e
    const-string p1, "text"

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, -0x1

    const-string v1, "text_size"

    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    const-string v0, "text_color"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzym;->zzb(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    const-string v0, "bg_color"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzym;->zzb(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x3e8

    const-string v3, "animation_ms"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v10

    const/16 v1, 0xfa0

    const-string v3, "presentation_ms"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    iget-object v1, p0, Lcom/google/android/gms/internal/zzym;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzaat;->zzauo:Lcom/google/android/gms/internal/zzpe;

    if-eqz v1, :cond_48

    iget v3, v1, Lcom/google/android/gms/internal/zzpe;->versionCode:I

    const/4 v4, 0x2

    if-lt v3, v4, :cond_48

    iget v1, v1, Lcom/google/android/gms/internal/zzpe;->zzbvh:I

    move v11, v1

    goto :goto_4a

    :cond_48
    const/4 v1, 0x1

    const/4 v11, 0x1

    :goto_4a
    const-string v1, "allow_pub_rendering"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v12

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v3, "images"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_68

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v3, "images"

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/zzym;->zza(Lorg/json/JSONObject;Ljava/lang/String;ZZZ)Ljava/util/List;

    move-result-object v1

    goto :goto_72

    :cond_68
    const-string v3, "image"

    const/4 v4, 0x0

    invoke-virtual {p0, v2, v3, v4, v4}, Lcom/google/android/gms/internal/zzym;->zza(Lorg/json/JSONObject;Ljava/lang/String;ZZ)Lcom/google/android/gms/internal/zzakv;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_72
    invoke-static {v1}, Lcom/google/android/gms/internal/zzym;->zzl(Ljava/util/List;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/zzyp;

    move-object v3, v2

    move-object v4, p0

    move-object v5, p1

    move-object v6, v0

    invoke-direct/range {v3 .. v12}, Lcom/google/android/gms/internal/zzyp;-><init>(Lcom/google/android/gms/internal/zzym;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;IIIIZ)V

    sget-object p1, Lcom/google/android/gms/internal/zzahh;->zzdar:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/zzakl;->zza(Lcom/google/android/gms/internal/zzakv;Lcom/google/android/gms/internal/zzakh;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    return-object p1
.end method
