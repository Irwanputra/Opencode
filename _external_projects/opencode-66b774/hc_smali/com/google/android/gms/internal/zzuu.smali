.class public final Lcom/google/android/gms/internal/zzuu;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzug;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private final mStartTime:J

.field private final zzanj:Lcom/google/android/gms/internal/zznu;

.field private final zzanw:Lcom/google/android/gms/internal/zzux;

.field private final zzavp:Z

.field private final zzcef:Lcom/google/android/gms/internal/zzui;

.field private final zzcej:Z

.field private final zzcek:Z

.field private final zzcey:Lcom/google/android/gms/internal/zzaat;

.field private final zzcez:J

.field private zzcfb:Z

.field private final zzcfd:Ljava/lang/String;

.field private zzcfe:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzuo;",
            ">;"
        }
    .end annotation
.end field

.field private zzcfi:Lcom/google/android/gms/internal/zzul;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzux;Lcom/google/android/gms/internal/zzui;ZZLjava/lang/String;JJLcom/google/android/gms/internal/zznu;Z)V
    .registers 15

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzuu;->mLock:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzuu;->zzcfb:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzuu;->zzcfe:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzuu;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzuu;->zzcey:Lcom/google/android/gms/internal/zzaat;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzuu;->zzanw:Lcom/google/android/gms/internal/zzux;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzuu;->zzcef:Lcom/google/android/gms/internal/zzui;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zzuu;->zzavp:Z

    iput-boolean p6, p0, Lcom/google/android/gms/internal/zzuu;->zzcej:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/zzuu;->zzcfd:Ljava/lang/String;

    iput-wide p8, p0, Lcom/google/android/gms/internal/zzuu;->mStartTime:J

    iput-wide p10, p0, Lcom/google/android/gms/internal/zzuu;->zzcez:J

    iput-object p12, p0, Lcom/google/android/gms/internal/zzuu;->zzanj:Lcom/google/android/gms/internal/zznu;

    iput-boolean p13, p0, Lcom/google/android/gms/internal/zzuu;->zzcek:Z

    return-void
.end method


# virtual methods
.method public final cancel()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuu;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzuu;->zzcfb:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/zzuu;->zzcfi:Lcom/google/android/gms/internal/zzul;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzul;->cancel()V

    :cond_d
    monitor-exit v0

    return-void

    :catchall_f
    move-exception v1

    monitor-exit v0
    :try_end_11
    .catchall {:try_start_4 .. :try_end_11} :catchall_f

    throw v1
.end method

.method public final zzh(Ljava/util/List;)Lcom/google/android/gms/internal/zzuo;
    .registers 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzuh;",
            ">;)",
            "Lcom/google/android/gms/internal/zzuo;"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "Starting mediation."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v1, Lcom/google/android/gms/internal/zzuu;->zzanj:Lcom/google/android/gms/internal/zznu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zznu;->zzjf()Lcom/google/android/gms/internal/zzns;

    move-result-object v2

    iget-object v3, v1, Lcom/google/android/gms/internal/zzuu;->zzcey:Lcom/google/android/gms/internal/zzaat;

    iget-object v3, v3, Lcom/google/android/gms/internal/zzaat;->zzauc:Lcom/google/android/gms/internal/zzjn;

    const/4 v4, 0x2

    new-array v4, v4, [I

    iget-object v5, v3, Lcom/google/android/gms/internal/zzjn;->zzbem:[Lcom/google/android/gms/internal/zzjn;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_43

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzez()Lcom/google/android/gms/internal/zzuq;

    iget-object v5, v1, Lcom/google/android/gms/internal/zzuu;->zzcfd:Ljava/lang/String;

    invoke-static {v5, v4}, Lcom/google/android/gms/internal/zzuq;->zza(Ljava/lang/String;[I)Z

    move-result v5

    if-eqz v5, :cond_43

    aget v5, v4, v6

    aget v4, v4, v7

    iget-object v8, v3, Lcom/google/android/gms/internal/zzjn;->zzbem:[Lcom/google/android/gms/internal/zzjn;

    array-length v9, v8

    const/4 v10, 0x0

    :goto_32
    if-ge v10, v9, :cond_43

    aget-object v11, v8, v10

    iget v12, v11, Lcom/google/android/gms/internal/zzjn;->width:I

    if-ne v5, v12, :cond_40

    iget v12, v11, Lcom/google/android/gms/internal/zzjn;->height:I

    if-ne v4, v12, :cond_40

    move-object v3, v11

    goto :goto_43

    :cond_40
    add-int/lit8 v10, v10, 0x1

    goto :goto_32

    :cond_43
    :goto_43
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_47
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_172

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/zzuh;

    const-string v8, "Trying mediation network: "

    iget-object v9, v5, Lcom/google/android/gms/internal/zzuh;->zzccr:Ljava/lang/String;

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    if-eqz v10, :cond_66

    invoke-virtual {v8, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_6c

    :cond_66
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v8}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v8, v9

    :goto_6c
    invoke-static {v8}, Lcom/google/android/gms/internal/zzakb;->zzct(Ljava/lang/String;)V

    iget-object v8, v5, Lcom/google/android/gms/internal/zzuh;->zzccs:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_75
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_16f

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    iget-object v10, v1, Lcom/google/android/gms/internal/zzuu;->zzanj:Lcom/google/android/gms/internal/zznu;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/zznu;->zzjf()Lcom/google/android/gms/internal/zzns;

    move-result-object v10

    iget-object v15, v1, Lcom/google/android/gms/internal/zzuu;->mLock:Ljava/lang/Object;

    monitor-enter v15

    :try_start_8a
    iget-boolean v11, v1, Lcom/google/android/gms/internal/zzuu;->zzcfb:Z

    if-eqz v11, :cond_96

    new-instance v0, Lcom/google/android/gms/internal/zzuo;

    const/4 v2, -0x1

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/zzuo;-><init>(I)V

    monitor-exit v15

    return-object v0

    :cond_96
    new-instance v14, Lcom/google/android/gms/internal/zzul;

    iget-object v12, v1, Lcom/google/android/gms/internal/zzuu;->mContext:Landroid/content/Context;

    iget-object v13, v1, Lcom/google/android/gms/internal/zzuu;->zzanw:Lcom/google/android/gms/internal/zzux;

    iget-object v11, v1, Lcom/google/android/gms/internal/zzuu;->zzcef:Lcom/google/android/gms/internal/zzui;

    iget-object v6, v1, Lcom/google/android/gms/internal/zzuu;->zzcey:Lcom/google/android/gms/internal/zzaat;

    iget-object v7, v6, Lcom/google/android/gms/internal/zzaat;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    move-object/from16 p1, v4

    iget-object v4, v6, Lcom/google/android/gms/internal/zzaat;->zzaty:Lcom/google/android/gms/internal/zzakd;

    move-object/from16 v27, v8

    iget-boolean v8, v1, Lcom/google/android/gms/internal/zzuu;->zzavp:Z

    move-object/from16 v28, v2

    iget-boolean v2, v1, Lcom/google/android/gms/internal/zzuu;->zzcej:Z

    move-object/from16 v29, v10

    iget-object v10, v6, Lcom/google/android/gms/internal/zzaat;->zzauo:Lcom/google/android/gms/internal/zzpe;

    move-object/from16 v30, v0

    iget-object v0, v6, Lcom/google/android/gms/internal/zzaat;->zzauw:Ljava/util/List;

    move-object/from16 v23, v0

    iget-object v0, v6, Lcom/google/android/gms/internal/zzaat;->zzcns:Ljava/util/List;

    iget-object v6, v6, Lcom/google/android/gms/internal/zzaat;->zzcon:Ljava/util/List;

    move-object/from16 v25, v6

    iget-boolean v6, v1, Lcom/google/android/gms/internal/zzuu;->zzcek:Z
    :try_end_c0
    .catchall {:try_start_8a .. :try_end_c0} :catchall_168

    move-object/from16 v16, v11

    move-object v11, v14

    move-object/from16 v17, v13

    move-object v13, v9

    move-object/from16 v31, v9

    move-object v9, v14

    move-object/from16 v14, v17

    move-object/from16 v32, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v5

    move-object/from16 v17, v7

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move/from16 v20, v8

    move/from16 v21, v2

    move-object/from16 v22, v10

    move-object/from16 v24, v0

    move/from16 v26, v6

    :try_start_e1
    invoke-direct/range {v11 .. v26}, Lcom/google/android/gms/internal/zzul;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;Lcom/google/android/gms/internal/zzui;Lcom/google/android/gms/internal/zzuh;Lcom/google/android/gms/internal/zzjj;Lcom/google/android/gms/internal/zzjn;Lcom/google/android/gms/internal/zzakd;ZZLcom/google/android/gms/internal/zzpe;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V

    iput-object v9, v1, Lcom/google/android/gms/internal/zzuu;->zzcfi:Lcom/google/android/gms/internal/zzul;

    monitor-exit v32
    :try_end_e7
    .catchall {:try_start_e1 .. :try_end_e7} :catchall_16d

    iget-wide v6, v1, Lcom/google/android/gms/internal/zzuu;->mStartTime:J

    iget-wide v10, v1, Lcom/google/android/gms/internal/zzuu;->zzcez:J

    invoke-virtual {v9, v6, v7, v10, v11}, Lcom/google/android/gms/internal/zzul;->zza(JJ)Lcom/google/android/gms/internal/zzuo;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/zzuu;->zzcfe:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v2, v0, Lcom/google/android/gms/internal/zzuo;->zzcer:I

    if-nez v2, :cond_138

    const-string v2, "Adapter succeeded."

    invoke-static {v2}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/google/android/gms/internal/zzuu;->zzanj:Lcom/google/android/gms/internal/zznu;

    const-string v3, "mediation_network_succeed"

    move-object/from16 v9, v31

    invoke-virtual {v2, v3, v9}, Lcom/google/android/gms/internal/zznu;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11b

    iget-object v2, v1, Lcom/google/android/gms/internal/zzuu;->zzanj:Lcom/google/android/gms/internal/zznu;

    const-string v3, "mediation_networks_fail"

    const-string v4, ","

    move-object/from16 v6, v30

    invoke-static {v4, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/zznu;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    :cond_11b
    iget-object v2, v1, Lcom/google/android/gms/internal/zzuu;->zzanj:Lcom/google/android/gms/internal/zznu;

    const/4 v4, 0x1

    new-array v3, v4, [Ljava/lang/String;

    const-string v5, "mls"

    const/4 v7, 0x0

    aput-object v5, v3, v7

    move-object/from16 v8, v29

    invoke-virtual {v2, v8, v3}, Lcom/google/android/gms/internal/zznu;->zza(Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    iget-object v2, v1, Lcom/google/android/gms/internal/zzuu;->zzanj:Lcom/google/android/gms/internal/zznu;

    new-array v3, v4, [Ljava/lang/String;

    const-string v4, "ttm"

    aput-object v4, v3, v7

    move-object/from16 v10, v28

    invoke-virtual {v2, v10, v3}, Lcom/google/android/gms/internal/zznu;->zza(Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    return-object v0

    :cond_138
    move-object/from16 v10, v28

    move-object/from16 v8, v29

    move-object/from16 v6, v30

    move-object/from16 v9, v31

    const/4 v4, 0x1

    const/4 v7, 0x0

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v1, Lcom/google/android/gms/internal/zzuu;->zzanj:Lcom/google/android/gms/internal/zznu;

    new-array v9, v4, [Ljava/lang/String;

    const-string v4, "mlf"

    aput-object v4, v9, v7

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/zznu;->zza(Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    iget-object v2, v0, Lcom/google/android/gms/internal/zzuo;->zzcet:Lcom/google/android/gms/internal/zzva;

    if-eqz v2, :cond_15e

    sget-object v2, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v4, Lcom/google/android/gms/internal/zzuv;

    invoke-direct {v4, v1, v0}, Lcom/google/android/gms/internal/zzuv;-><init>(Lcom/google/android/gms/internal/zzuu;Lcom/google/android/gms/internal/zzuo;)V

    invoke-virtual {v2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_15e
    move-object/from16 v4, p1

    move-object v0, v6

    move-object v2, v10

    move-object/from16 v8, v27

    const/4 v6, 0x0

    const/4 v7, 0x1

    goto/16 :goto_75

    :catchall_168
    move-exception v0

    move-object/from16 v32, v15

    :goto_16b
    :try_start_16b
    monitor-exit v32
    :try_end_16c
    .catchall {:try_start_16b .. :try_end_16c} :catchall_16d

    throw v0

    :catchall_16d
    move-exception v0

    goto :goto_16b

    :cond_16f
    const/4 v7, 0x1

    goto/16 :goto_47

    :cond_172
    move-object v6, v0

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_186

    iget-object v0, v1, Lcom/google/android/gms/internal/zzuu;->zzanj:Lcom/google/android/gms/internal/zznu;

    const-string v2, "mediation_networks_fail"

    const-string v3, ","

    invoke-static {v3, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zznu;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    :cond_186
    new-instance v0, Lcom/google/android/gms/internal/zzuo;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/zzuo;-><init>(I)V

    return-object v0
.end method

.method public final zzlu()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzuo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzuu;->zzcfe:Ljava/util/List;

    return-object v0
.end method
