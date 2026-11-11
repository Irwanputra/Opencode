.class public final Lcom/google/android/gms/internal/zzws;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic zzcgy:Lcom/google/android/gms/internal/zzwr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzwr;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzws;->zzcgy:Lcom/google/android/gms/internal/zzwr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object p1, p0, Lcom/google/android/gms/internal/zzws;->zzcgy:Lcom/google/android/gms/internal/zzwr;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzwr;->zzl(Z)V

    return-void
.end method
