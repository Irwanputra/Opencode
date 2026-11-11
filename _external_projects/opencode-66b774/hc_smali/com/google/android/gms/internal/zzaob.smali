.class public final Lcom/google/android/gms/internal/zzaob;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzanb:Ljava/util/Map;

.field private synthetic zzdng:Lcom/google/android/gms/internal/zzaoa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzaoa;Ljava/util/Map;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaob;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaob;->zzanb:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaob;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaoa;->zzb(Lcom/google/android/gms/internal/zzaoa;)Lcom/google/android/gms/internal/zzamp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaob;->zzanb:Ljava/util/Map;

    const-string v2, "pubVideoCmd"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/zzamp;->zza(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
