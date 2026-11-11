.class public final Lcom/google/android/gms/internal/zzalx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzdgk:Lcom/google/android/gms/internal/zzalr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzalr;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzalx;->zzdgk:Lcom/google/android/gms/internal/zzalr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzalx;->zzdgk:Lcom/google/android/gms/internal/zzalr;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzalr;->zza(Lcom/google/android/gms/internal/zzalr;)Lcom/google/android/gms/internal/zzama;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lcom/google/android/gms/internal/zzalx;->zzdgk:Lcom/google/android/gms/internal/zzalr;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzalr;->zza(Lcom/google/android/gms/internal/zzalr;)Lcom/google/android/gms/internal/zzama;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzama;->onPaused()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzalx;->zzdgk:Lcom/google/android/gms/internal/zzalr;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzalr;->zza(Lcom/google/android/gms/internal/zzalr;)Lcom/google/android/gms/internal/zzama;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzama;->zzrr()V

    :cond_1a
    return-void
.end method
