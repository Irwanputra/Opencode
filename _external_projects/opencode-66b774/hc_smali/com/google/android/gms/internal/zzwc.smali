.class public final Lcom/google/android/gms/internal/zzwc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzcfx:Lcom/google/android/gms/internal/zzvx;

.field private synthetic zzcfy:Lcom/google/ads/AdRequest$ErrorCode;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzvx;Lcom/google/ads/AdRequest$ErrorCode;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzwc;->zzcfx:Lcom/google/android/gms/internal/zzvx;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzwc;->zzcfy:Lcom/google/ads/AdRequest$ErrorCode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzwc;->zzcfx:Lcom/google/android/gms/internal/zzvx;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzvx;->zza(Lcom/google/android/gms/internal/zzvx;)Lcom/google/android/gms/internal/zzvd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzwc;->zzcfy:Lcom/google/ads/AdRequest$ErrorCode;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzwj;->zza(Lcom/google/ads/AdRequest$ErrorCode;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzvd;->onAdFailedToLoad(I)V
    :try_end_f
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_f} :catch_10

    return-void

    :catch_10
    move-exception v0

    const-string v1, "Could not call onAdFailedToLoad."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
