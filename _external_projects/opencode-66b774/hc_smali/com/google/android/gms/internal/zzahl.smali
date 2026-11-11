.class public final Lcom/google/android/gms/internal/zzahl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzbyv:Lcom/google/android/gms/internal/zzalf;

.field private synthetic zzdau:Ljava/util/concurrent/Future;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzalf;Ljava/util/concurrent/Future;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzahl;->zzbyv:Lcom/google/android/gms/internal/zzalf;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzahl;->zzdau:Ljava/util/concurrent/Future;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahl;->zzbyv:Lcom/google/android/gms/internal/zzalf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzalf;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahl;->zzdau:Ljava/util/concurrent/Future;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_e
    return-void
.end method
