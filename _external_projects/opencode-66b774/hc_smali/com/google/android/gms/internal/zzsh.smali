.class public final Lcom/google/android/gms/internal/zzsh;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zztc;


# instance fields
.field private synthetic zzbze:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzsf;I)V
    .registers 3

    iput p2, p0, Lcom/google/android/gms/internal/zzsh;->zzbze:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/zztd;)V
    .registers 3

    iget-object p1, p1, Lcom/google/android/gms/internal/zztd;->zzape:Lcom/google/android/gms/internal/zzkh;

    if-eqz p1, :cond_9

    iget v0, p0, Lcom/google/android/gms/internal/zzsh;->zzbze:I

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzkh;->onAdFailedToLoad(I)V

    :cond_9
    return-void
.end method
