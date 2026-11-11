.class public final Lcom/google/android/gms/internal/zzza;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# instance fields
.field private synthetic zzclk:Lcom/google/android/gms/internal/zzyt;

.field private synthetic zzclm:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzyt;Ljava/lang/ref/WeakReference;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzza;->zzclk:Lcom/google/android/gms/internal/zzyt;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzza;->zzclm:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrollChanged()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzza;->zzclk:Lcom/google/android/gms/internal/zzyt;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzza;->zzclm:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zzyt;->zza(Lcom/google/android/gms/internal/zzyt;Ljava/lang/ref/WeakReference;Z)V

    return-void
.end method
