.class public final Lcom/google/android/gms/internal/zzaja;
.super Lcom/google/android/gms/internal/zzau;
.source ""


# instance fields
.field private synthetic zzdco:[B

.field private synthetic zzdcp:Ljava/util/Map;

.field private synthetic zzdcq:Lcom/google/android/gms/internal/zzajv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzaiv;ILjava/lang/String;Lcom/google/android/gms/internal/zzy;Lcom/google/android/gms/internal/zzx;[BLjava/util/Map;Lcom/google/android/gms/internal/zzajv;)V
    .registers 9

    iput-object p6, p0, Lcom/google/android/gms/internal/zzaja;->zzdco:[B

    iput-object p7, p0, Lcom/google/android/gms/internal/zzaja;->zzdcp:Ljava/util/Map;

    iput-object p8, p0, Lcom/google/android/gms/internal/zzaja;->zzdcq:Lcom/google/android/gms/internal/zzajv;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/google/android/gms/internal/zzau;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/zzy;Lcom/google/android/gms/internal/zzx;)V

    return-void
.end method


# virtual methods
.method public final getHeaders()Ljava/util/Map;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaja;->zzdcp:Ljava/util/Map;

    if-nez v0, :cond_8

    invoke-super {p0}, Lcom/google/android/gms/internal/zzr;->getHeaders()Ljava/util/Map;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final synthetic zza(Ljava/lang/Object;)V
    .registers 2

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzaja;->zzh(Ljava/lang/String;)V

    return-void
.end method

.method public final zzf()[B
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaja;->zzdco:[B

    if-nez v0, :cond_8

    invoke-super {p0}, Lcom/google/android/gms/internal/zzr;->zzf()[B

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final zzh(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaja;->zzdcq:Lcom/google/android/gms/internal/zzajv;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzajv;->zzcr(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzau;->zzh(Ljava/lang/String;)V

    return-void
.end method
