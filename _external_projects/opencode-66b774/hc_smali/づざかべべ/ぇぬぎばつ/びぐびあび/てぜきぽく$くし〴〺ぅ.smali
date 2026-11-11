.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;

.field public げつ〴ぬぐ:Z


# direct methods
.method public constructor <init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;->げつ〴ぬぐ:Z

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;->げつ〴ぬぐ:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 4

    iget-boolean p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;->げつ〴ぬぐ:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    iput-boolean v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;->げつ〴ぬぐ:Z

    return-void

    :cond_8
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;

    iget-object p1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇ〳〲〺すっ:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/4 v1, 0x0

    cmpl-float p1, p1, v1

    if-nez p1, :cond_23

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;

    iput v0, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->びえぁぜい:I

    invoke-virtual {p1, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺふねづ〺(I)V

    goto :goto_2d

    :cond_23
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;

    const/4 v0, 0x2

    iput v0, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->びえぁぜい:I

    .line 1
    iget-object p1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    :goto_2d
    return-void
.end method
