.class public Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/transformation/FabTransformationBehavior;->ぅみぱぎぎ(Landroid/view/View;Landroid/view/View;ZZ)Landroid/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroid/view/View;

.field public final synthetic くし〴〺ぅ:Landroid/view/View;

.field public final synthetic げつ〴ぬぐ:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/transformation/FabTransformationBehavior;ZLandroid/view/View;Landroid/view/View;)V
    .registers 5

    iput-boolean p2, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    iput-object p3, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    iput-object p4, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    iget-boolean p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-nez p1, :cond_17

    iget-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_17
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    iget-boolean p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz p1, :cond_16

    iget-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_16
    return-void
.end method
