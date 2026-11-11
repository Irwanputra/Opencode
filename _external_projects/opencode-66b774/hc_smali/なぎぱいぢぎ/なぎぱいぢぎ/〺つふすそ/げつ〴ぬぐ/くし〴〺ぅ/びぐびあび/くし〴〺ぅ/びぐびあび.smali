.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/くし〴〺ぅ/びぐびあび;
.super Landroid/widget/RelativeLayout;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field public 〺つふすそ:Lcom/google/android/gms/internal/zzaig;

.field public くし〴〺ぅ:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/internal/zzaig;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/zzaig;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/くし〴〺ぅ/びぐびあび;->〺つふすそ:Lcom/google/android/gms/internal/zzaig;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/zzaig;->zzcl(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3

    iget-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/くし〴〺ぅ/びぐびあび;->くし〴〺ぅ:Z

    if-nez v0, :cond_9

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/くし〴〺ぅ/びぐびあび;->〺つふすそ:Lcom/google/android/gms/internal/zzaig;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaig;->zze(Landroid/view/MotionEvent;)V

    :cond_9
    const/4 p1, 0x0

    return p1
.end method
