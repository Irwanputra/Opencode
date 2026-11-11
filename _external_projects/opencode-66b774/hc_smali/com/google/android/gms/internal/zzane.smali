.class public final Lcom/google/android/gms/internal/zzane;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzt;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
        "Lcom/google/android/gms/internal/zzamp;",
        ">;"
    }
.end annotation


# instance fields
.field private zzdkh:Lcom/google/android/gms/internal/zzana;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static zze(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return-object v1

    :cond_8
    :try_start_8
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_16
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_16} :catch_17

    return-object p0

    :catch_17
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x27

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Precache invalid numeric parameter \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\': "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .registers 14

    check-cast p1, Lcom/google/android/gms/internal/zzamp;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfb()Lcom/google/android/gms/internal/zzamz;

    const-string v0, "abort"

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    iget-object p2, p0, Lcom/google/android/gms/internal/zzane;->zzdkh:Lcom/google/android/gms/internal/zzana;

    if-eqz p2, :cond_15

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzana;->abort()V

    return-void

    :cond_15
    invoke-static {p1}, Lcom/google/android/gms/internal/zzamz;->zzb(Lcom/google/android/gms/internal/zzamp;)Z

    move-result p1

    if-nez p1, :cond_20

    const-string p1, "Precache abort but no precache task running."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :cond_20
    return-void

    :cond_21
    const-string v0, "src"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_c1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzane;->zzdkh:Lcom/google/android/gms/internal/zzana;

    if-eqz v1, :cond_35

    const-string p1, "Threadless precache task has already started."

    :goto_31
    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_35
    invoke-static {p1}, Lcom/google/android/gms/internal/zzamz;->zzc(Lcom/google/android/gms/internal/zzamp;)Lcom/google/android/gms/internal/zzamx;

    move-result-object v1

    if-eqz v1, :cond_3e

    const-string p1, "Precache task is already running."

    goto :goto_31

    :cond_3e
    invoke-interface {p1}, Lcom/google/android/gms/internal/zzamp;->zzbq()Lcom/google/android/gms/ads/internal/zzv;

    move-result-object v1

    if-nez v1, :cond_47

    const-string p1, "Precache requires a dependency provider."

    goto :goto_31

    :cond_47
    new-instance v1, Lcom/google/android/gms/internal/zzamo;

    const-string v2, "flags"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzamo;-><init>(Ljava/lang/String;)V

    const-string v2, "notifyBytes"

    invoke-static {p2, v2}, Lcom/google/android/gms/internal/zzane;->zze(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "notifyMillis"

    invoke-static {p2, v3}, Lcom/google/android/gms/internal/zzane;->zze(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "player"

    invoke-static {p2, v4}, Lcom/google/android/gms/internal/zzane;->zze(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_6d

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_6d
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzamp;->zzbq()Lcom/google/android/gms/ads/internal/zzv;

    move-result-object v6

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/zzv;->zzaol:Lcom/google/android/gms/internal/zzanf;

    const/4 v7, 0x0

    invoke-interface {v6, p1, v4, v7, v1}, Lcom/google/android/gms/internal/zzanf;->zza(Lcom/google/android/gms/internal/zzamp;ILjava/lang/String;Lcom/google/android/gms/internal/zzamo;)Lcom/google/android/gms/internal/zzana;

    move-result-object v4

    const/4 v6, 0x1

    if-nez v2, :cond_84

    if-eqz v3, :cond_82

    goto :goto_84

    :cond_82
    const/4 v7, 0x0

    goto :goto_85

    :cond_84
    :goto_84
    const/4 v7, 0x1

    :goto_85
    if-eqz v7, :cond_b8

    iget-object v1, v1, Lcom/google/android/gms/internal/zzamo;->zzdix:Ljava/lang/String;

    const-string v7, ","

    invoke-virtual {v1, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v7, v1

    const/4 v8, 0x0

    :goto_91
    if-ge v8, v7, :cond_aa

    aget-object v9, v1, v8

    const-string v10, "1"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a7

    const-string v10, "2"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a7

    const/4 v5, 0x1

    goto :goto_aa

    :cond_a7
    add-int/lit8 v8, v8, 0x1

    goto :goto_91

    :cond_aa
    :goto_aa
    if-eqz v5, :cond_b8

    if-eqz v2, :cond_b2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    goto :goto_b5

    :cond_b2
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    :goto_b5
    iput-object v4, p0, Lcom/google/android/gms/internal/zzane;->zzdkh:Lcom/google/android/gms/internal/zzana;

    goto :goto_cf

    :cond_b8
    new-instance v1, Lcom/google/android/gms/internal/zzamx;

    invoke-direct {v1, p1, v4, v0}, Lcom/google/android/gms/internal/zzamx;-><init>(Lcom/google/android/gms/internal/zzamp;Lcom/google/android/gms/internal/zzana;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagb;->zznd()Ljava/lang/Object;

    goto :goto_cf

    :cond_c1
    invoke-static {p1}, Lcom/google/android/gms/internal/zzamz;->zzc(Lcom/google/android/gms/internal/zzamp;)Lcom/google/android/gms/internal/zzamx;

    move-result-object p1

    if-nez p1, :cond_cf

    iget-object p1, p0, Lcom/google/android/gms/internal/zzane;->zzdkh:Lcom/google/android/gms/internal/zzana;

    if-nez p1, :cond_cf

    const-string p1, "Precache must specify a source."

    goto/16 :goto_31

    :cond_cf
    :goto_cf
    const-string p1, "minBufferMs"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzane;->zze(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_da

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    :cond_da
    const-string p1, "maxBufferMs"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzane;->zze(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_e5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    :cond_e5
    const-string p1, "bufferForPlaybackMs"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzane;->zze(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_f0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    :cond_f0
    const-string p1, "bufferForPlaybackAfterRebufferMs"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzane;->zze(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_fb

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    :cond_fb
    return-void
.end method
