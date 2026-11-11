.class public final Lcom/google/android/gms/internal/zzamj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzdhp:Lcom/google/android/gms/internal/zzama;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzami;Lcom/google/android/gms/internal/zzama;)V
    .registers 3

    iput-object p2, p0, Lcom/google/android/gms/internal/zzamj;->zzdhp:Lcom/google/android/gms/internal/zzama;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamj;->zzdhp:Lcom/google/android/gms/internal/zzama;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzama;->zzrs()V

    return-void
.end method
