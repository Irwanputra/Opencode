.class public final Lcom/google/android/gms/internal/zzis;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzbbf:Lcom/google/android/gms/internal/zzix;

.field private final zzbbg:Lcom/google/android/gms/internal/zzjc;

.field private final zzbbh:Z


# direct methods
.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzis;->zzbbh:Z

    new-instance v0, Lcom/google/android/gms/internal/zzix;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzix;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzis;->zzbbf:Lcom/google/android/gms/internal/zzix;

    new-instance v0, Lcom/google/android/gms/internal/zzjc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzjc;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzis;->zzbbg:Lcom/google/android/gms/internal/zzjc;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzis;->zzhm()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzix;Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzis;->zzbbf:Lcom/google/android/gms/internal/zzix;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzis;->zzbbh:Z

    new-instance p1, Lcom/google/android/gms/internal/zzjc;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzjc;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzis;->zzbbg:Lcom/google/android/gms/internal/zzjc;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzis;->zzhm()V

    return-void
.end method

.method public static zzhl()Lcom/google/android/gms/internal/zzis;
    .registers 1

    new-instance v0, Lcom/google/android/gms/internal/zzis;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzis;-><init>()V

    return-object v0
.end method

.method private final declared-synchronized zzhm()V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzis;->zzbbg:Lcom/google/android/gms/internal/zzjc;

    new-instance v1, Lcom/google/android/gms/internal/zzja;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzja;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/zzjc;->zzbcz:Lcom/google/android/gms/internal/zzja;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzis;->zzbbg:Lcom/google/android/gms/internal/zzjc;

    new-instance v1, Lcom/google/android/gms/internal/zzjb;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzjb;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/zzjc;->zzbcy:Lcom/google/android/gms/internal/zzjb;
    :try_end_13
    .catchall {:try_start_1 .. :try_end_13} :catchall_15

    monitor-exit p0

    return-void

    :catchall_15
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private static zzhn()[J
    .registers 7

    invoke-static {}, Lcom/google/android/gms/internal/zznh;->zzix()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_35

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, ","

    invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v4, v2

    :goto_21
    if-ge v3, v4, :cond_d

    aget-object v5, v2, v3

    :try_start_25
    invoke-static {v5}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2c
    .catch Ljava/lang/NumberFormatException; {:try_start_25 .. :try_end_2c} :catch_2d

    goto :goto_32

    :catch_2d
    const-string v5, "Experiment ID is not a number"

    invoke-static {v5}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    :goto_32
    add-int/lit8 v3, v3, 0x1

    goto :goto_21

    :cond_35
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [J

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_40
    if-ge v3, v2, :cond_53

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v3, v3, 0x1

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    aput-wide v5, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_40

    :cond_53
    return-object v0
.end method


# virtual methods
.method public final declared-synchronized zza(Lcom/google/android/gms/internal/zzit;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzis;->zzbbh:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/zzis;->zzbbg:Lcom/google/android/gms/internal/zzjc;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzit;->zza(Lcom/google/android/gms/internal/zzjc;)V
    :try_end_a
    .catchall {:try_start_1 .. :try_end_a} :catchall_c

    :cond_a
    monitor-exit p0

    return-void

    :catchall_c
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zza(Lcom/google/android/gms/internal/zziu$zza$zzb;)V
    .registers 4

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzis;->zzbbh:Z

    if-eqz v0, :cond_47

    iget-object v0, p0, Lcom/google/android/gms/internal/zzis;->zzbbg:Lcom/google/android/gms/internal/zzjc;

    invoke-static {}, Lcom/google/android/gms/internal/zzis;->zzhn()[J

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/zzjc;->zzbcx:[J

    iget-object v0, p0, Lcom/google/android/gms/internal/zzis;->zzbbf:Lcom/google/android/gms/internal/zzix;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzis;->zzbbg:Lcom/google/android/gms/internal/zzjc;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzfjs;->zzc(Lcom/google/android/gms/internal/zzfjs;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzix;->zzd([B)Lcom/google/android/gms/internal/zziz;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zziu$zza$zzb;->zzhq()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zziz;->zzq(I)Lcom/google/android/gms/internal/zziz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zziz;->zzbk()V

    const-string v0, "Logging Event with event code : "

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zziu$zza$zzb;->zzhq()I

    move-result p1

    const/16 v1, 0xa

    invoke-static {p1, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_3f

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_44

    :cond_3f
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_44
    invoke-static {p1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V
    :try_end_47
    .catchall {:try_start_1 .. :try_end_47} :catchall_49

    :cond_47
    monitor-exit p0

    return-void

    :catchall_49
    move-exception p1

    monitor-exit p0

    throw p1
.end method
