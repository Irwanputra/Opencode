.class public final Lcom/google/android/gms/internal/zznl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzbsi:Lcom/google/android/gms/internal/zznk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zznk;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zznl;->zzbsi:Lcom/google/android/gms/internal/zznk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zznl;->zzbsi:Lcom/google/android/gms/internal/zznk;

    invoke-static {v0}, Lcom/google/android/gms/internal/zznk;->zza(Lcom/google/android/gms/internal/zznk;)V

    return-void
.end method
