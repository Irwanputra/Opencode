.class public Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ScrollingTabContainerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;

.field public げつ〴ぬぐ:Z


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ScrollingTabContainerView;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;->げつ〴ぬぐ:Z

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;->げつ〴ぬぐ:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    iget-boolean p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;->げつ〴ぬぐ:Z

    if-eqz p1, :cond_5

    return-void

    :cond_5
    iget-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    iget-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    iput-boolean v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;->げつ〴ぬぐ:Z

    return-void
.end method
