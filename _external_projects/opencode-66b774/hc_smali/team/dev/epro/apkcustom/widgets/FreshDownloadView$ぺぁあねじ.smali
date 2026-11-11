.class public Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぺぁあねじ;
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

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぺぁあねじ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぺぁあねじ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    .line 1
    iput-object v0, p1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
