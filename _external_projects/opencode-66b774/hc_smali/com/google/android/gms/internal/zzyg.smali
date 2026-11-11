.class public final Lcom/google/android/gms/internal/zzyg;
.super Lcom/google/android/gms/internal/zzxw;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzanj:Lcom/google/android/gms/internal/zznu;

.field private zzanw:Lcom/google/android/gms/internal/zzux;

.field private final zzbyk:Lcom/google/android/gms/internal/zzanh;

.field private zzcef:Lcom/google/android/gms/internal/zzui;

.field private zzcjw:Lcom/google/android/gms/internal/zzug;

.field public zzcjx:Lcom/google/android/gms/internal/zzuo;

.field private zzcjy:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzafp;Lcom/google/android/gms/internal/zzux;Lcom/google/android/gms/internal/zzyb;Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzanh;)V
    .registers 7

    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/internal/zzxw;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzafp;Lcom/google/android/gms/internal/zzyb;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/zzyg;->zzanw:Lcom/google/android/gms/internal/zzux;

    iget-object p1, p2, Lcom/google/android/gms/internal/zzafp;->zzcxl:Lcom/google/android/gms/internal/zzui;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzyg;->zzcef:Lcom/google/android/gms/internal/zzui;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzyg;->zzanj:Lcom/google/android/gms/internal/zznu;

    iput-object p6, p0, Lcom/google/android/gms/internal/zzyg;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzyg;)Lcom/google/android/gms/internal/zzanh;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzyg;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    return-object p0
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzyg;Z)Z
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzyg;->zzcjy:Z

    return p1
.end method

.method private static zzk(Ljava/util/List;)Ljava/lang/String;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzuo;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, ""

    if-nez p0, :cond_5

    return-object v0

    :cond_5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_9
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_94

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzuo;

    if-eqz v1, :cond_9

    iget-object v4, v1, Lcom/google/android/gms/internal/zzuo;->zzces:Lcom/google/android/gms/internal/zzuh;

    if-eqz v4, :cond_9

    iget-object v4, v4, Lcom/google/android/gms/internal/zzuh;->zzcct:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_9

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, v1, Lcom/google/android/gms/internal/zzuo;->zzces:Lcom/google/android/gms/internal/zzuh;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzuh;->zzcct:Ljava/lang/String;

    iget v5, v1, Lcom/google/android/gms/internal/zzuo;->zzcer:I

    const/4 v6, -0x1

    const/4 v7, 0x5

    const/4 v8, 0x4

    const/4 v9, 0x3

    if-eq v5, v6, :cond_49

    if-eqz v5, :cond_4a

    if-eq v5, v3, :cond_47

    if-eq v5, v9, :cond_45

    if-eq v5, v8, :cond_43

    if-eq v5, v7, :cond_41

    const/4 v2, 0x6

    goto :goto_4a

    :cond_41
    const/4 v2, 0x5

    goto :goto_4a

    :cond_43
    const/4 v2, 0x3

    goto :goto_4a

    :cond_45
    const/4 v2, 0x2

    goto :goto_4a

    :cond_47
    const/4 v2, 0x1

    goto :goto_4a

    :cond_49
    const/4 v2, 0x4

    :cond_4a
    :goto_4a
    iget-wide v5, v1, Lcom/google/android/gms/internal/zzuo;->zzcex:J

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x21

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_9

    :cond_94
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    sub-int/2addr p0, v3

    invoke-static {v2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-virtual {v0, v2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final onStop()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzxw;->zzcjn:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-super {p0}, Lcom/google/android/gms/internal/zzxw;->onStop()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzyg;->zzcjw:Lcom/google/android/gms/internal/zzug;

    if-eqz v1, :cond_d

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzug;->cancel()V

    :cond_d
    monitor-exit v0

    return-void

    :catchall_f
    move-exception v1

    monitor-exit v0
    :try_end_11
    .catchall {:try_start_3 .. :try_end_11} :catchall_f

    throw v1
.end method

.method public final zze(J)V
    .registers 20

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/google/android/gms/internal/zzxw;->zzcjn:Ljava/lang/Object;

    monitor-enter v2

    :try_start_5
    iget-object v7, v1, Lcom/google/android/gms/internal/zzyg;->zzcef:Lcom/google/android/gms/internal/zzui;

    iget v0, v7, Lcom/google/android/gms/internal/zzui;->zzcdt:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_3c

    new-instance v0, Lcom/google/android/gms/internal/zzur;

    iget-object v4, v1, Lcom/google/android/gms/internal/zzxw;->mContext:Landroid/content/Context;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzxw;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v5, v3, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v6, v1, Lcom/google/android/gms/internal/zzyg;->zzanw:Lcom/google/android/gms/internal/zzux;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzxw;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-boolean v8, v3, Lcom/google/android/gms/internal/zzaax;->zzben:Z

    iget-boolean v9, v3, Lcom/google/android/gms/internal/zzaax;->zzbep:Z

    iget-object v10, v3, Lcom/google/android/gms/internal/zzaax;->zzcpq:Ljava/lang/String;

    sget-object v3, Lcom/google/android/gms/internal/zznh;->zzbnj:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v11

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    const/4 v15, 0x2

    iget-object v3, v1, Lcom/google/android/gms/internal/zzxw;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-boolean v11, v3, Lcom/google/android/gms/internal/zzafp;->zzcxx:Z

    move-object v3, v0

    move/from16 v16, v11

    move-wide/from16 v11, p1

    invoke-direct/range {v3 .. v16}, Lcom/google/android/gms/internal/zzur;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzux;Lcom/google/android/gms/internal/zzui;ZZLjava/lang/String;JJIZ)V

    goto :goto_6c

    :cond_3c
    new-instance v0, Lcom/google/android/gms/internal/zzuu;

    iget-object v4, v1, Lcom/google/android/gms/internal/zzxw;->mContext:Landroid/content/Context;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzxw;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v5, v3, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v6, v1, Lcom/google/android/gms/internal/zzyg;->zzanw:Lcom/google/android/gms/internal/zzux;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzxw;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-boolean v8, v3, Lcom/google/android/gms/internal/zzaax;->zzben:Z

    iget-boolean v9, v3, Lcom/google/android/gms/internal/zzaax;->zzbep:Z

    iget-object v10, v3, Lcom/google/android/gms/internal/zzaax;->zzcpq:Ljava/lang/String;

    sget-object v3, Lcom/google/android/gms/internal/zznh;->zzbnj:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v11

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    iget-object v15, v1, Lcom/google/android/gms/internal/zzyg;->zzanj:Lcom/google/android/gms/internal/zznu;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzxw;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-boolean v11, v3, Lcom/google/android/gms/internal/zzafp;->zzcxx:Z

    move-object v3, v0

    move/from16 v16, v11

    move-wide/from16 v11, p1

    invoke-direct/range {v3 .. v16}, Lcom/google/android/gms/internal/zzuu;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzux;Lcom/google/android/gms/internal/zzui;ZZLjava/lang/String;JJLcom/google/android/gms/internal/zznu;Z)V

    :goto_6c
    iput-object v0, v1, Lcom/google/android/gms/internal/zzyg;->zzcjw:Lcom/google/android/gms/internal/zzug;

    monitor-exit v2
    :try_end_6f
    .catchall {:try_start_5 .. :try_end_6f} :catchall_149

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, v1, Lcom/google/android/gms/internal/zzyg;->zzcef:Lcom/google/android/gms/internal/zzui;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzui;->zzcdj:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, v1, Lcom/google/android/gms/internal/zzxw;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzaat;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzjj;->zzbdp:Landroid/os/Bundle;

    const-string v3, "com.google.ads.mediation.admob.AdMobAdapter"

    const/4 v4, 0x0

    if-eqz v2, :cond_92

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_92

    const-string v5, "_skipMediation"

    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    goto :goto_93

    :cond_92
    const/4 v2, 0x0

    :goto_93
    if-eqz v2, :cond_b1

    invoke-virtual {v0}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    :cond_99
    :goto_99
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b1

    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/zzuh;

    iget-object v5, v5, Lcom/google/android/gms/internal/zzuh;->zzccs:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_99

    invoke-interface {v2}, Ljava/util/ListIterator;->remove()V

    goto :goto_99

    :cond_b1
    iget-object v2, v1, Lcom/google/android/gms/internal/zzyg;->zzcjw:Lcom/google/android/gms/internal/zzug;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/zzug;->zzh(Ljava/util/List;)Lcom/google/android/gms/internal/zzuo;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/zzyg;->zzcjx:Lcom/google/android/gms/internal/zzuo;

    iget v2, v0, Lcom/google/android/gms/internal/zzuo;->zzcer:I

    const/4 v3, 0x1

    if-eqz v2, :cond_e4

    new-instance v0, Lcom/google/android/gms/internal/zzxz;

    if-eq v2, v3, :cond_dd

    iget-object v2, v1, Lcom/google/android/gms/internal/zzyg;->zzcjx:Lcom/google/android/gms/internal/zzuo;

    iget v2, v2, Lcom/google/android/gms/internal/zzuo;->zzcer:I

    const/16 v3, 0x28

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected mediation result: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v4}, Lcom/google/android/gms/internal/zzxz;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_dd
    const-string v2, "No fill from any mediation ad networks."

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/zzxz;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_e4
    iget-object v0, v0, Lcom/google/android/gms/internal/zzuo;->zzces:Lcom/google/android/gms/internal/zzuh;

    if-eqz v0, :cond_148

    iget-object v0, v0, Lcom/google/android/gms/internal/zzuh;->zzcdc:Ljava/lang/String;

    if-eqz v0, :cond_148

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v0, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    sget-object v2, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/zzyh;

    invoke-direct {v3, v1, v0}, Lcom/google/android/gms/internal/zzyh;-><init>(Lcom/google/android/gms/internal/zzyg;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const-wide/16 v2, 0xa

    :try_start_fd
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v5}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_102
    .catch Ljava/lang/InterruptedException; {:try_start_fd .. :try_end_102} :catch_126

    iget-object v2, v1, Lcom/google/android/gms/internal/zzxw;->zzcjn:Ljava/lang/Object;

    monitor-enter v2

    :try_start_105
    iget-boolean v0, v1, Lcom/google/android/gms/internal/zzyg;->zzcjy:Z

    if-eqz v0, :cond_11b

    iget-object v0, v1, Lcom/google/android/gms/internal/zzyg;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzanh;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_113

    monitor-exit v2

    return-void

    :cond_113
    new-instance v0, Lcom/google/android/gms/internal/zzxz;

    const-string v3, "Assets not loaded, web view is destroyed"

    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/zzxz;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_11b
    new-instance v0, Lcom/google/android/gms/internal/zzxz;

    const-string v3, "View could not be prepared"

    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/zzxz;-><init>(Ljava/lang/String;I)V

    throw v0

    :catchall_123
    move-exception v0

    monitor-exit v2
    :try_end_125
    .catchall {:try_start_105 .. :try_end_125} :catchall_123

    throw v0

    :catch_126
    move-exception v0

    new-instance v2, Lcom/google/android/gms/internal/zzxz;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x26

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Interrupted while waiting for latch : "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v4}, Lcom/google/android/gms/internal/zzxz;-><init>(Ljava/lang/String;I)V

    throw v2

    :cond_148
    return-void

    :catchall_149
    move-exception v0

    :try_start_14a
    monitor-exit v2
    :try_end_14b
    .catchall {:try_start_14a .. :try_end_14b} :catchall_149

    goto :goto_14d

    :goto_14c
    throw v0

    :goto_14d
    goto :goto_14c
.end method

.method public final zzy(I)Lcom/google/android/gms/internal/zzafo;
    .registers 46

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/zzxw;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    new-instance v42, Lcom/google/android/gms/internal/zzafo;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzaat;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    iget-object v4, v0, Lcom/google/android/gms/internal/zzyg;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    iget-object v2, v0, Lcom/google/android/gms/internal/zzxw;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-object v5, v2, Lcom/google/android/gms/internal/zzaax;->zzcdk:Ljava/util/List;

    iget-object v7, v2, Lcom/google/android/gms/internal/zzaax;->zzcdl:Ljava/util/List;

    iget-object v8, v2, Lcom/google/android/gms/internal/zzaax;->zzcoy:Ljava/util/List;

    iget v9, v2, Lcom/google/android/gms/internal/zzaax;->orientation:I

    iget-wide v10, v2, Lcom/google/android/gms/internal/zzaax;->zzcdq:J

    iget-object v12, v1, Lcom/google/android/gms/internal/zzaat;->zzcng:Ljava/lang/String;

    iget-boolean v13, v2, Lcom/google/android/gms/internal/zzaax;->zzcow:Z

    iget-object v1, v0, Lcom/google/android/gms/internal/zzyg;->zzcjx:Lcom/google/android/gms/internal/zzuo;

    if-eqz v1, :cond_24

    iget-object v6, v1, Lcom/google/android/gms/internal/zzuo;->zzces:Lcom/google/android/gms/internal/zzuh;

    move-object v14, v6

    goto :goto_25

    :cond_24
    const/4 v14, 0x0

    :goto_25
    if-eqz v1, :cond_2b

    iget-object v6, v1, Lcom/google/android/gms/internal/zzuo;->zzcet:Lcom/google/android/gms/internal/zzva;

    move-object v15, v6

    goto :goto_2c

    :cond_2b
    const/4 v15, 0x0

    :goto_2c
    if-eqz v1, :cond_31

    iget-object v1, v1, Lcom/google/android/gms/internal/zzuo;->zzceu:Ljava/lang/String;

    goto :goto_37

    :cond_31
    const-class v1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    :goto_37
    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/zzyg;->zzcef:Lcom/google/android/gms/internal/zzui;

    iget-object v6, v0, Lcom/google/android/gms/internal/zzyg;->zzcjx:Lcom/google/android/gms/internal/zzuo;

    if-eqz v6, :cond_44

    iget-object v6, v6, Lcom/google/android/gms/internal/zzuo;->zzcev:Lcom/google/android/gms/internal/zzuk;

    move-object/from16 v18, v6

    goto :goto_46

    :cond_44
    const/16 v18, 0x0

    :goto_46
    iget-object v6, v0, Lcom/google/android/gms/internal/zzxw;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    move-object/from16 v17, v14

    move-object/from16 v19, v15

    iget-wide v14, v6, Lcom/google/android/gms/internal/zzaax;->zzcox:J

    iget-object v2, v0, Lcom/google/android/gms/internal/zzxw;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    move-wide/from16 v21, v14

    iget-object v15, v2, Lcom/google/android/gms/internal/zzafp;->zzauc:Lcom/google/android/gms/internal/zzjn;

    move-object/from16 v23, v15

    iget-wide v14, v6, Lcom/google/android/gms/internal/zzaax;->zzcov:J

    move-wide/from16 v24, v14

    iget-wide v14, v2, Lcom/google/android/gms/internal/zzafp;->zzcxp:J

    move-wide/from16 v26, v14

    iget-wide v14, v6, Lcom/google/android/gms/internal/zzaax;->zzcpa:J

    move-wide/from16 v28, v14

    iget-object v15, v6, Lcom/google/android/gms/internal/zzaax;->zzcpb:Ljava/lang/String;

    iget-object v14, v2, Lcom/google/android/gms/internal/zzafp;->zzcxj:Lorg/json/JSONObject;

    const/16 v30, 0x0

    iget-object v2, v6, Lcom/google/android/gms/internal/zzaax;->zzcpl:Lcom/google/android/gms/internal/zzaeq;

    move-object/from16 v31, v15

    iget-object v15, v6, Lcom/google/android/gms/internal/zzaax;->zzcpm:Ljava/util/List;

    move-object/from16 v32, v15

    iget-object v15, v6, Lcom/google/android/gms/internal/zzaax;->zzcpn:Ljava/util/List;

    move-object/from16 v33, v2

    if-eqz v1, :cond_7b

    iget-boolean v2, v1, Lcom/google/android/gms/internal/zzui;->zzcdv:Z

    move/from16 v34, v2

    goto :goto_7e

    :cond_7b
    const/4 v2, 0x0

    const/16 v34, 0x0

    :goto_7e
    iget-object v6, v6, Lcom/google/android/gms/internal/zzaax;->zzcpp:Lcom/google/android/gms/internal/zzaaz;

    iget-object v2, v0, Lcom/google/android/gms/internal/zzyg;->zzcjw:Lcom/google/android/gms/internal/zzug;

    if-eqz v2, :cond_8f

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzug;->zzlu()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/zzyg;->zzk(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v36, v2

    goto :goto_91

    :cond_8f
    const/16 v36, 0x0

    :goto_91
    iget-object v2, v0, Lcom/google/android/gms/internal/zzxw;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    move-object/from16 v20, v6

    iget-object v6, v2, Lcom/google/android/gms/internal/zzaax;->zzcdn:Ljava/util/List;

    move-object/from16 v37, v6

    iget-object v6, v2, Lcom/google/android/gms/internal/zzaax;->zzcps:Ljava/lang/String;

    move-object/from16 v38, v6

    iget-object v6, v0, Lcom/google/android/gms/internal/zzxw;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v0, v6, Lcom/google/android/gms/internal/zzafp;->zzcxw:Lcom/google/android/gms/internal/zzis;

    move-object/from16 v39, v0

    iget-boolean v0, v2, Lcom/google/android/gms/internal/zzaax;->zzaqv:Z

    move/from16 v40, v0

    iget-boolean v0, v6, Lcom/google/android/gms/internal/zzafp;->zzcxx:Z

    move/from16 v41, v0

    move-object/from16 v0, v33

    move-object/from16 v2, v42

    move-object/from16 v35, v20

    move/from16 v6, p1

    move-object/from16 v33, v14

    move-wide/from16 v20, v21

    move-object/from16 v14, v17

    move-object/from16 v43, v15

    move-object/from16 v22, v23

    move-object/from16 v15, v19

    move-object/from16 v17, v1

    move-wide/from16 v19, v20

    move-object/from16 v21, v22

    move-wide/from16 v22, v24

    move-wide/from16 v24, v26

    move-wide/from16 v26, v28

    move-object/from16 v28, v31

    move-object/from16 v29, v33

    move-object/from16 v31, v0

    move-object/from16 v33, v43

    invoke-direct/range {v2 .. v41}, Lcom/google/android/gms/internal/zzafo;-><init>(Lcom/google/android/gms/internal/zzjj;Lcom/google/android/gms/internal/zzanh;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/zzuh;Lcom/google/android/gms/internal/zzva;Ljava/lang/String;Lcom/google/android/gms/internal/zzui;Lcom/google/android/gms/internal/zzuk;JLcom/google/android/gms/internal/zzjn;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/zzou;Lcom/google/android/gms/internal/zzaeq;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/zzaaz;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/zzis;ZZ)V

    return-object v42
.end method
