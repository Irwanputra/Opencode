.class public final Lcom/google/android/gms/internal/zzabt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzcqn:Lcom/google/android/gms/internal/zzabo;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzabo;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzabt;->zzcqn:Lcom/google/android/gms/internal/zzabo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabt;->zzcqn:Lcom/google/android/gms/internal/zzabo;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzabo;->zzb(Lcom/google/android/gms/internal/zzabo;)Lcom/google/android/gms/ads/internal/js/zzaa;

    move-result-object v0

    if-eqz v0, :cond_17

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabt;->zzcqn:Lcom/google/android/gms/internal/zzabo;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzabo;->zzb(Lcom/google/android/gms/internal/zzabo;)Lcom/google/android/gms/ads/internal/js/zzaa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/js/zzaa;->release()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabt;->zzcqn:Lcom/google/android/gms/internal/zzabo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzabo;->zza(Lcom/google/android/gms/internal/zzabo;Lcom/google/android/gms/ads/internal/js/zzaa;)Lcom/google/android/gms/ads/internal/js/zzaa;

    :cond_17
    return-void
.end method
