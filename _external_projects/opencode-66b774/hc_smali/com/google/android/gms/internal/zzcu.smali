.class public final Lcom/google/android/gms/internal/zzcu;
.super Lcom/google/android/gms/internal/zzct;
.source ""


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzct;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public static zza(Ljava/lang/String;Landroid/content/Context;Z)Lcom/google/android/gms/internal/zzcu;
    .registers 4

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzct;->zza(Landroid/content/Context;Z)V

    new-instance v0, Lcom/google/android/gms/internal/zzcu;

    invoke-direct {v0, p1, p0, p2}, Lcom/google/android/gms/internal/zzcu;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/zzdm;Lcom/google/android/gms/internal/zzaz;Lcom/google/android/gms/internal/zzaw;)Ljava/util/List;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzdm;",
            "Lcom/google/android/gms/internal/zzaz;",
            "Lcom/google/android/gms/internal/zzaw;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdm;->zzag()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_2d

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzct;->zzahr:Z

    if-nez v0, :cond_b

    goto :goto_2d

    :cond_b
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdm;->zzac()I

    move-result v6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzct;->zza(Lcom/google/android/gms/internal/zzdm;Lcom/google/android/gms/internal/zzaz;Lcom/google/android/gms/internal/zzaw;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance p3, Lcom/google/android/gms/internal/zzed;

    const/16 v7, 0x18

    const-string v3, "VywbbfxE2QuRqZ5xcIwapO7AdSzfVaSWnmJxmUg+0adJ3QBAH5P7EgXr1uzyY+u6"

    const-string v4, "JgKAyQW0PWqOrZHk4ZNT0IJH02FdSWTXOOjBnF9RRok="

    move-object v1, p3

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/zzed;-><init>(Lcom/google/android/gms/internal/zzdm;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzaz;II)V

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_2d
    :goto_2d
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzct;->zza(Lcom/google/android/gms/internal/zzdm;Lcom/google/android/gms/internal/zzaz;Lcom/google/android/gms/internal/zzaw;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
