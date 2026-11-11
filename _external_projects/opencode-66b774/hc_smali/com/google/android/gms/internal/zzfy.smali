.class public final Lcom/google/android/gms/internal/zzfy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzhd;


# instance fields
.field private final mView:Landroid/view/View;

.field private final zzawq:Lcom/google/android/gms/internal/zzafo;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/google/android/gms/internal/zzafo;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfy;->mView:Landroid/view/View;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzfy;->zzawq:Lcom/google/android/gms/internal/zzafo;

    return-void
.end method


# virtual methods
.method public final zzgd()Landroid/view/View;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfy;->mView:Landroid/view/View;

    return-object v0
.end method

.method public final zzge()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfy;->zzawq:Lcom/google/android/gms/internal/zzafo;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfy;->mView:Landroid/view/View;

    if-nez v0, :cond_9

    goto :goto_b

    :cond_9
    const/4 v0, 0x0

    return v0

    :cond_b
    :goto_b
    const/4 v0, 0x1

    return v0
.end method

.method public final zzgf()Lcom/google/android/gms/internal/zzhd;
    .registers 1

    return-object p0
.end method
