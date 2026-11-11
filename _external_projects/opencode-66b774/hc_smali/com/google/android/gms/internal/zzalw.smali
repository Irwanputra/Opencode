.class public final Lcom/google/android/gms/internal/zzalw;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzdgk:Lcom/google/android/gms/internal/zzalr;

.field private synthetic zzdgn:I

.field private synthetic zzdgo:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzalr;II)V
    .registers 4

    iput-object p1, p0, Lcom/google/android/gms/internal/zzalw;->zzdgk:Lcom/google/android/gms/internal/zzalr;

    iput p2, p0, Lcom/google/android/gms/internal/zzalw;->zzdgn:I

    iput p3, p0, Lcom/google/android/gms/internal/zzalw;->zzdgo:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzalw;->zzdgk:Lcom/google/android/gms/internal/zzalr;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzalr;->zza(Lcom/google/android/gms/internal/zzalr;)Lcom/google/android/gms/internal/zzama;

    move-result-object v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Lcom/google/android/gms/internal/zzalw;->zzdgk:Lcom/google/android/gms/internal/zzalr;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzalr;->zza(Lcom/google/android/gms/internal/zzalr;)Lcom/google/android/gms/internal/zzama;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/zzalw;->zzdgn:I

    iget v2, p0, Lcom/google/android/gms/internal/zzalw;->zzdgo:I

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzama;->zzf(II)V

    :cond_15
    return-void
.end method
