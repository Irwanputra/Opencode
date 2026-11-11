.class public final Lcom/google/android/gms/internal/zzti;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzapq:Ljava/lang/String;

.field private final zzbzt:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/google/android/gms/internal/zztj;",
            ">;"
        }
    .end annotation
.end field

.field private zzbzu:Lcom/google/android/gms/internal/zzjj;

.field private final zzbzv:I

.field private zzbzw:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzjj;Ljava/lang/String;I)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "null reference"

    if-eqz p1, :cond_1d

    if-eqz p2, :cond_17

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzti;->zzbzt:Ljava/util/LinkedList;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzti;->zzbzu:Lcom/google/android/gms/internal/zzjj;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzti;->zzapq:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/zzti;->zzbzv:I

    return-void

    .line 1
    :cond_17
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1d
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzti;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzti;->zzapq:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzti;)Lcom/google/android/gms/internal/zzjj;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzti;->zzbzu:Lcom/google/android/gms/internal/zzjj;

    return-object p0
.end method


# virtual methods
.method public final getAdUnitId()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzti;->zzapq:Ljava/lang/String;

    return-object v0
.end method

.method public final getNetworkType()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzti;->zzbzv:I

    return v0
.end method

.method public final size()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzti;->zzbzt:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/zzsd;Lcom/google/android/gms/internal/zzjj;)V
    .registers 4

    new-instance v0, Lcom/google/android/gms/internal/zztj;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/zztj;-><init>(Lcom/google/android/gms/internal/zzti;Lcom/google/android/gms/internal/zzsd;Lcom/google/android/gms/internal/zzjj;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzti;->zzbzt:Ljava/util/LinkedList;

    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/zzsd;)Z
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zztj;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zztj;-><init>(Lcom/google/android/gms/internal/zzti;Lcom/google/android/gms/internal/zzsd;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzti;->zzbzt:Ljava/util/LinkedList;

    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zztj;->load()Z

    move-result p1

    return p1
.end method

.method public final zzkx()Lcom/google/android/gms/internal/zzjj;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzti;->zzbzu:Lcom/google/android/gms/internal/zzjj;

    return-object v0
.end method

.method public final zzky()I
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzti;->zzbzt:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_7
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zztj;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/zztj;->zzcab:Z

    if-eqz v2, :cond_7

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_1a
    return v1
.end method

.method public final zzkz()I
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzti;->zzbzt:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_7
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zztj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zztj;->load()Z

    move-result v2

    if-eqz v2, :cond_7

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_1c
    return v1
.end method

.method public final zzla()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzti;->zzbzw:Z

    return-void
.end method

.method public final zzlb()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzti;->zzbzw:Z

    return v0
.end method

.method public final zzm(Lcom/google/android/gms/internal/zzjj;)Lcom/google/android/gms/internal/zztj;
    .registers 2

    if-eqz p1, :cond_4

    iput-object p1, p0, Lcom/google/android/gms/internal/zzti;->zzbzu:Lcom/google/android/gms/internal/zzjj;

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/zzti;->zzbzt:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zztj;

    return-object p1
.end method
