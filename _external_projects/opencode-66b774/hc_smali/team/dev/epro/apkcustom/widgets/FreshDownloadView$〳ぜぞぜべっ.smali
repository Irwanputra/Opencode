.class public Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$〳ぜぞぜべっ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getPrepareAnimator()Landroid/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$〳ぜぞぜべっ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$〳ぜぞぜべっ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    const/4 v0, 0x0

    .line 1
    iput-object v0, p1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->げがぴうあだ:Landroid/graphics/DashPathEffect;

    .line 2
    iput-object v0, p1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぃぜぶの〸ぃ:Landroid/graphics/DashPathEffect;

    .line 3
    iput-object v0, p1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ながふずは:Landroid/graphics/DashPathEffect;

    .line 4
    invoke-virtual {p1}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぎぱいぢぎ()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 2

    return-void
.end method
