.class public final Lcom/google/android/gms/internal/zzsq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zztc;


# instance fields
.field private synthetic zzbzg:Lcom/google/android/gms/internal/zznx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzsp;Lcom/google/android/gms/internal/zznx;)V
    .registers 3

    iput-object p2, p0, Lcom/google/android/gms/internal/zzsq;->zzbzg:Lcom/google/android/gms/internal/zznx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/zztd;)V
    .registers 3

    iget-object p1, p1, Lcom/google/android/gms/internal/zztd;->zzbzl:Lcom/google/android/gms/internal/zzoa;

    if-eqz p1, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/zzsq;->zzbzg:Lcom/google/android/gms/internal/zznx;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzoa;->zza(Lcom/google/android/gms/internal/zznx;)V

    :cond_9
    return-void
.end method
