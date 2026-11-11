.class public Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getDownLoadErrorAnimator()Landroid/animation/AnimatorSet;
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

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$びぐびあび;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$びぐびあび;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 1
    iput p1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぶでにく〼〳:F

    .line 2
    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$びぐびあび;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
