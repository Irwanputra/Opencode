.class public final Lcom/google/android/gms/internal/zzxv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzcjp:Lcom/google/android/gms/internal/zzxu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzxu;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzxv;->zzcjp:Lcom/google/android/gms/internal/zzxu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzxv;->zzcjp:Lcom/google/android/gms/internal/zzxu;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzxu;->zza(Lcom/google/android/gms/internal/zzxu;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_d

    return-void

    :cond_d
    const-string v0, "Timed out waiting for WebView to finish loading."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzxv;->zzcjp:Lcom/google/android/gms/internal/zzxu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzxu;->cancel()V

    return-void
.end method
