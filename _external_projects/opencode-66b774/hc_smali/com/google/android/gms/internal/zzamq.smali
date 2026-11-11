.class public final Lcom/google/android/gms/internal/zzamq;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzarf:Lcom/google/android/gms/internal/zzakd;

.field private final zzcrt:Ljava/lang/String;

.field private final zzdgt:Lcom/google/android/gms/internal/zznu;

.field private zzdgx:Z

.field private final zzdje:Lcom/google/android/gms/internal/zzns;

.field private final zzdjf:Lcom/google/android/gms/internal/zzair;

.field private final zzdjg:[J

.field private final zzdjh:[Ljava/lang/String;

.field private zzdji:Z

.field private zzdjj:Z

.field private zzdjk:Z

.field private zzdjl:Z

.field private zzdjm:Lcom/google/android/gms/internal/zzamb;

.field private zzdjn:Z

.field private zzdjo:Z

.field private zzdjp:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Ljava/lang/String;Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzns;)V
    .registers 20

    move-object v1, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/zzaiu;

    invoke-direct {v2}, Lcom/google/android/gms/internal/zzaiu;-><init>()V

    const-string v3, "min_1"

    const-wide/16 v4, 0x1

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/zzaiu;->zza(Ljava/lang/String;DD)Lcom/google/android/gms/internal/zzaiu;

    move-result-object v8

    const-string v9, "1_5"

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v12, 0x4014000000000000L    # 5.0

    invoke-virtual/range {v8 .. v13}, Lcom/google/android/gms/internal/zzaiu;->zza(Ljava/lang/String;DD)Lcom/google/android/gms/internal/zzaiu;

    move-result-object v2

    const-string v3, "5_10"

    const-wide/high16 v4, 0x4014000000000000L    # 5.0

    const-wide/high16 v6, 0x4024000000000000L    # 10.0

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/zzaiu;->zza(Ljava/lang/String;DD)Lcom/google/android/gms/internal/zzaiu;

    move-result-object v8

    const-string v9, "10_20"

    const-wide/high16 v10, 0x4024000000000000L    # 10.0

    const-wide/high16 v12, 0x4034000000000000L    # 20.0

    invoke-virtual/range {v8 .. v13}, Lcom/google/android/gms/internal/zzaiu;->zza(Ljava/lang/String;DD)Lcom/google/android/gms/internal/zzaiu;

    move-result-object v2

    const-string v3, "20_30"

    const-wide/high16 v4, 0x4034000000000000L    # 20.0

    const-wide/high16 v6, 0x403e000000000000L    # 30.0

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/zzaiu;->zza(Ljava/lang/String;DD)Lcom/google/android/gms/internal/zzaiu;

    move-result-object v8

    const-string v9, "30_max"

    const-wide/high16 v10, 0x403e000000000000L    # 30.0

    const-wide v12, 0x7fefffffffffffffL    # Double.MAX_VALUE

    invoke-virtual/range {v8 .. v13}, Lcom/google/android/gms/internal/zzaiu;->zza(Ljava/lang/String;DD)Lcom/google/android/gms/internal/zzaiu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaiu;->zzqr()Lcom/google/android/gms/internal/zzair;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/zzamq;->zzdjf:Lcom/google/android/gms/internal/zzair;

    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/google/android/gms/internal/zzamq;->zzdji:Z

    iput-boolean v0, v1, Lcom/google/android/gms/internal/zzamq;->zzdjj:Z

    iput-boolean v0, v1, Lcom/google/android/gms/internal/zzamq;->zzdjk:Z

    iput-boolean v0, v1, Lcom/google/android/gms/internal/zzamq;->zzdjl:Z

    const-wide/16 v2, -0x1

    iput-wide v2, v1, Lcom/google/android/gms/internal/zzamq;->zzdjp:J

    move-object v4, p1

    iput-object v4, v1, Lcom/google/android/gms/internal/zzamq;->mContext:Landroid/content/Context;

    move-object/from16 v4, p2

    iput-object v4, v1, Lcom/google/android/gms/internal/zzamq;->zzarf:Lcom/google/android/gms/internal/zzakd;

    move-object/from16 v4, p3

    iput-object v4, v1, Lcom/google/android/gms/internal/zzamq;->zzcrt:Ljava/lang/String;

    move-object/from16 v4, p4

    iput-object v4, v1, Lcom/google/android/gms/internal/zzamq;->zzdgt:Lcom/google/android/gms/internal/zznu;

    move-object/from16 v4, p5

    iput-object v4, v1, Lcom/google/android/gms/internal/zzamq;->zzdje:Lcom/google/android/gms/internal/zzns;

    sget-object v4, Lcom/google/android/gms/internal/zznh;->zzbil:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_85

    new-array v2, v0, [Ljava/lang/String;

    iput-object v2, v1, Lcom/google/android/gms/internal/zzamq;->zzdjh:[Ljava/lang/String;

    new-array v0, v0, [J

    iput-object v0, v1, Lcom/google/android/gms/internal/zzamq;->zzdjg:[J

    return-void

    :cond_85
    const-string v5, ","

    invoke-static {v4, v5}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    new-array v5, v5, [Ljava/lang/String;

    iput-object v5, v1, Lcom/google/android/gms/internal/zzamq;->zzdjh:[Ljava/lang/String;

    array-length v5, v4

    new-array v5, v5, [J

    iput-object v5, v1, Lcom/google/android/gms/internal/zzamq;->zzdjg:[J

    const/4 v5, 0x0

    :goto_96
    array-length v0, v4

    if-ge v5, v0, :cond_b1

    :try_start_99
    iget-object v0, v1, Lcom/google/android/gms/internal/zzamq;->zzdjg:[J

    aget-object v6, v4, v5

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    aput-wide v6, v0, v5
    :try_end_a3
    .catch Ljava/lang/NumberFormatException; {:try_start_99 .. :try_end_a3} :catch_a4

    goto :goto_ae

    :catch_a4
    move-exception v0

    const-string v6, "Unable to parse frame hash target time number."

    invoke-static {v6, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/zzamq;->zzdjg:[J

    aput-wide v2, v0, v5

    :goto_ae
    add-int/lit8 v5, v5, 0x1

    goto :goto_96

    :cond_b1
    return-void
.end method


# virtual methods
.method public final onStop()V
    .registers 9

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbik:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_d8

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdjn:Z

    if-nez v0, :cond_d8

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v0, "type"

    const-string v1, "native-player-metrics"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamq;->zzcrt:Ljava/lang/String;

    const-string v1, "request"

    invoke-virtual {v5, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdjm:Lcom/google/android/gms/internal/zzamb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamb;->zzri()Ljava/lang/String;

    move-result-object v0

    const-string v1, "player"

    invoke-virtual {v5, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdjf:Lcom/google/android/gms/internal/zzair;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzair;->getBuckets()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzait;

    const-string v2, "fps_c_"

    iget-object v3, v1, Lcom/google/android/gms/internal/zzait;->name:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_5d

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_63

    :cond_5d
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v2, v3

    :goto_63
    iget v3, v1, Lcom/google/android/gms/internal/zzait;->count:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "fps_p_"

    iget-object v3, v1, Lcom/google/android/gms/internal/zzait;->name:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_7f

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_85

    :cond_7f
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v2, v3

    :goto_85
    iget-wide v3, v1, Lcom/google/android/gms/internal/zzait;->zzdcf:D

    invoke-static {v3, v4}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3e

    :cond_8f
    const/4 v0, 0x0

    :goto_90
    iget-object v1, p0, Lcom/google/android/gms/internal/zzamq;->zzdjg:[J

    array-length v2, v1

    if-ge v0, v2, :cond_c5

    iget-object v2, p0, Lcom/google/android/gms/internal/zzamq;->zzdjh:[Ljava/lang/String;

    aget-object v2, v2, v0

    if-eqz v2, :cond_c2

    const-string v3, "fh_"

    aget-wide v6, v1, v0

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c2
    add-int/lit8 v0, v0, 0x1

    goto :goto_90

    :cond_c5
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzamq;->mContext:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamq;->zzarf:Lcom/google/android/gms/internal/zzakd;

    iget-object v3, v0, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    const/4 v6, 0x1

    const-string v4, "gmob-apps"

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdjn:Z

    :cond_d8
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzamb;)V
    .registers 8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdgt:Lcom/google/android/gms/internal/zznu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamq;->zzdje:Lcom/google/android/gms/internal/zzns;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "vpc2"

    aput-object v5, v3, v4

    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/zznn;->zza(Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzamq;->zzdji:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdgt:Lcom/google/android/gms/internal/zznu;

    if-eqz v0, :cond_1e

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzamb;->zzri()Ljava/lang/String;

    move-result-object v1

    const-string v2, "vpn"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zznu;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1e
    iput-object p1, p0, Lcom/google/android/gms/internal/zzamq;->zzdjm:Lcom/google/android/gms/internal/zzamb;

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/zzamb;)V
    .registers 21

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/google/android/gms/internal/zzamq;->zzdjk:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1b

    iget-boolean v1, v0, Lcom/google/android/gms/internal/zzamq;->zzdjl:Z

    if-nez v1, :cond_1b

    iget-object v1, v0, Lcom/google/android/gms/internal/zzamq;->zzdgt:Lcom/google/android/gms/internal/zznu;

    iget-object v4, v0, Lcom/google/android/gms/internal/zzamq;->zzdje:Lcom/google/android/gms/internal/zzns;

    new-array v5, v3, [Ljava/lang/String;

    const-string v6, "vff2"

    aput-object v6, v5, v2

    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/zznn;->zza(Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    iput-boolean v3, v0, Lcom/google/android/gms/internal/zzamq;->zzdjl:Z

    :cond_1b
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    .line 2
    iget-boolean v1, v0, Lcom/google/android/gms/internal/zzamq;->zzdgx:Z

    const-wide/16 v6, 0x1

    if-eqz v1, :cond_52

    iget-boolean v1, v0, Lcom/google/android/gms/internal/zzamq;->zzdjo:Z

    if-eqz v1, :cond_52

    iget-wide v8, v0, Lcom/google/android/gms/internal/zzamq;->zzdjp:J

    const-wide/16 v10, -0x1

    cmp-long v1, v8, v10

    if-eqz v1, :cond_52

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v6, v7}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v8

    long-to-double v8, v8

    iget-wide v10, v0, Lcom/google/android/gms/internal/zzamq;->zzdjp:J

    sub-long v10, v4, v10

    long-to-double v10, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v8, v10

    iget-object v1, v0, Lcom/google/android/gms/internal/zzamq;->zzdjf:Lcom/google/android/gms/internal/zzair;

    invoke-virtual {v1, v8, v9}, Lcom/google/android/gms/internal/zzair;->zza(D)V

    :cond_52
    iget-boolean v1, v0, Lcom/google/android/gms/internal/zzamq;->zzdgx:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/zzamq;->zzdjo:Z

    iput-wide v4, v0, Lcom/google/android/gms/internal/zzamq;->zzdjp:J

    sget-object v1, Lcom/google/android/gms/internal/zznh;->zzbim:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/zzamb;->getCurrentPosition()I

    move-result v1

    int-to-long v8, v1

    const/4 v1, 0x0

    :goto_6e
    iget-object v10, v0, Lcom/google/android/gms/internal/zzamq;->zzdjh:[Ljava/lang/String;

    array-length v11, v10

    if-ge v1, v11, :cond_dc

    aget-object v10, v10, v1

    if-nez v10, :cond_d7

    iget-object v10, v0, Lcom/google/android/gms/internal/zzamq;->zzdjg:[J

    aget-wide v11, v10, v1

    sub-long v11, v8, v11

    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    cmp-long v12, v4, v10

    if-lez v12, :cond_d7

    iget-object v4, v0, Lcom/google/android/gms/internal/zzamq;->zzdjh:[Ljava/lang/String;

    const/16 v5, 0x8

    move-object/from16 v10, p1

    invoke-virtual {v10, v5, v5}, Landroid/view/TextureView;->getBitmap(II)Landroid/graphics/Bitmap;

    move-result-object v8

    const-wide/16 v9, 0x3f

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    :goto_94
    if-ge v13, v5, :cond_c6

    const/4 v11, 0x0

    :goto_97
    if-ge v11, v5, :cond_c1

    invoke-virtual {v8, v11, v13}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v12

    invoke-static {v12}, Landroid/graphics/Color;->blue(I)I

    move-result v16

    invoke-static {v12}, Landroid/graphics/Color;->red(I)I

    move-result v17

    add-int v17, v17, v16

    invoke-static {v12}, Landroid/graphics/Color;->green(I)I

    move-result v12

    add-int v12, v12, v17

    const/16 v5, 0x80

    if-le v12, v5, :cond_b4

    move-wide/from16 v17, v6

    goto :goto_b6

    :cond_b4
    const-wide/16 v17, 0x0

    :goto_b6
    long-to-int v5, v9

    shl-long v17, v17, v5

    or-long v14, v14, v17

    add-int/lit8 v11, v11, 0x1

    sub-long/2addr v9, v6

    const/16 v5, 0x8

    goto :goto_97

    :cond_c1
    add-int/lit8 v13, v13, 0x1

    const/16 v5, 0x8

    goto :goto_94

    :cond_c6
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v2

    const-string v2, "%016X"

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v1

    return-void

    :cond_d7
    move-object/from16 v10, p1

    add-int/lit8 v1, v1, 0x1

    goto :goto_6e

    :cond_dc
    return-void
.end method

.method public final zzro()V
    .registers 7

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdji:Z

    if-eqz v0, :cond_1a

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdjj:Z

    if-eqz v0, :cond_9

    goto :goto_1a

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdgt:Lcom/google/android/gms/internal/zznu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamq;->zzdje:Lcom/google/android/gms/internal/zzns;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "vfr2"

    aput-object v5, v3, v4

    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/zznn;->zza(Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzamq;->zzdjj:Z

    :cond_1a
    :goto_1a
    return-void
.end method

.method public final zzsn()V
    .registers 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdgx:Z

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzamq;->zzdjj:Z

    if-eqz v1, :cond_1b

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzamq;->zzdjk:Z

    if-nez v1, :cond_1b

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamq;->zzdgt:Lcom/google/android/gms/internal/zznu;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzamq;->zzdje:Lcom/google/android/gms/internal/zzns;

    new-array v3, v0, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "vfp2"

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/zznn;->zza(Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdjk:Z

    :cond_1b
    return-void
.end method

.method public final zzso()V
    .registers 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamq;->zzdgx:Z

    return-void
.end method
