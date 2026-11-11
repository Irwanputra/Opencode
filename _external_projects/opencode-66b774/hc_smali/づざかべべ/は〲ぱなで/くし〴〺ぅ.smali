.class public Lづざかべべ/は〲ぱなで/くし〴〺ぅ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic 〳ぜぞぜべっ:Landroidx/transition/ChangeTransform;

.field public 〺つふすそ:Landroid/graphics/Matrix;

.field public final synthetic ぁごぐすすぃ:Landroidx/transition/ChangeTransform$びぐびあび;

.field public final synthetic くし〴〺ぅ:Z

.field public げつ〴ぬぐ:Z

.field public final synthetic づざかべべ:Landroid/view/View;

.field public final synthetic なぎぱいぢぎ:Landroidx/transition/ChangeTransform$づざかべべ;

.field public final synthetic びぐびあび:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroidx/transition/ChangeTransform;ZLandroid/graphics/Matrix;Landroid/view/View;Landroidx/transition/ChangeTransform$づざかべべ;Landroidx/transition/ChangeTransform$びぐびあび;)V
    .registers 7

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->〳ぜぞぜべっ:Landroidx/transition/ChangeTransform;

    iput-boolean p2, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->くし〴〺ぅ:Z

    iput-object p3, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->びぐびあび:Landroid/graphics/Matrix;

    iput-object p4, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->づざかべべ:Landroid/view/View;

    iput-object p5, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->なぎぱいぢぎ:Landroidx/transition/ChangeTransform$づざかべべ;

    iput-object p6, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->ぁごぐすすぃ:Landroidx/transition/ChangeTransform$びぐびあび;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->〺つふすそ:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->げつ〴ぬぐ:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 5

    iget-boolean p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->げつ〴ぬぐ:Z

    const/4 v0, 0x0

    if-nez p1, :cond_35

    iget-boolean p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->くし〴〺ぅ:Z

    if-eqz p1, :cond_27

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->〳ぜぞぜべっ:Landroidx/transition/ChangeTransform;

    iget-boolean p1, p1, Landroidx/transition/ChangeTransform;->ぇ〳〲〺すっ:Z

    if-eqz p1, :cond_27

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->びぐびあび:Landroid/graphics/Matrix;

    .line 1
    iget-object v1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->〺つふすそ:Landroid/graphics/Matrix;

    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->づざかべべ:Landroid/view/View;

    sget v1, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->transition_transform:I

    iget-object v2, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->〺つふすそ:Landroid/graphics/Matrix;

    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->なぎぱいぢぎ:Landroidx/transition/ChangeTransform$づざかべべ;

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->づざかべべ:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroidx/transition/ChangeTransform$づざかべべ;->げつ〴ぬぐ(Landroid/view/View;)V

    goto :goto_35

    .line 2
    :cond_27
    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->づざかべべ:Landroid/view/View;

    sget v1, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->transition_transform:I

    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->づざかべべ:Landroid/view/View;

    sget v1, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->parent_matrix:I

    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_35
    :goto_35
    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->づざかべべ:Landroid/view/View;

    .line 3
    sget-object v1, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v1, p1, v0}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->びぐびあび(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 4
    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->なぎぱいぢぎ:Landroidx/transition/ChangeTransform$づざかべべ;

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->づざかべべ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroidx/transition/ChangeTransform$づざかべべ;->げつ〴ぬぐ(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationPause(Landroid/animation/Animator;)V
    .registers 4

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->ぁごぐすすぃ:Landroidx/transition/ChangeTransform$びぐびあび;

    .line 1
    iget-object p1, p1, Landroidx/transition/ChangeTransform$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Matrix;

    .line 2
    iget-object v0, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->〺つふすそ:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->づざかべべ:Landroid/view/View;

    sget v0, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->transition_transform:I

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->〺つふすそ:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->なぎぱいぢぎ:Landroidx/transition/ChangeTransform$づざかべべ;

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->づざかべべ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroidx/transition/ChangeTransform$づざかべべ;->げつ〴ぬぐ(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationResume(Landroid/animation/Animator;)V
    .registers 2

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/くし〴〺ぅ;->づざかべべ:Landroid/view/View;

    invoke-static {p1}, Landroidx/transition/ChangeTransform;->けときぜと(Landroid/view/View;)V

    return-void
.end method
