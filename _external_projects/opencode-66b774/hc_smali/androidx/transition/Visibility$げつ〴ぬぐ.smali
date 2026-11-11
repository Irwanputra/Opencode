.class public Landroidx/transition/Visibility$げつ〴ぬぐ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""

# interfaces
.implements Landroidx/transition/Transition$びぐびあび;
.implements Lづざかべべ/は〲ぱなで/げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Visibility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final 〺つふすそ:I

.field public final くし〴〺ぅ:Landroid/view/ViewGroup;

.field public final げつ〴ぬぐ:Landroid/view/View;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Z

.field public final びぐびあび:Z


# direct methods
.method public constructor <init>(Landroid/view/View;IZ)V
    .registers 5

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    iput-object p1, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    iput p2, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    iput-boolean p3, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->びぐびあび:Z

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/transition/Visibility$げつ〴ぬぐ;->ぁごぐすすぃ(Z)V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 2

    invoke-virtual {p0}, Landroidx/transition/Visibility$げつ〴ぬぐ;->なぎぱいぢぎ()V

    return-void
.end method

.method public onAnimationPause(Landroid/animation/Animator;)V
    .registers 4

    iget-boolean p1, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-nez p1, :cond_d

    iget-object p1, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    iget v0, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->〺つふすそ:I

    .line 1
    sget-object v1, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v1, p1, v0}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぁごぐすすぃ(Landroid/view/View;I)V

    :cond_d
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .registers 2

    return-void
.end method

.method public onAnimationResume(Landroid/animation/Animator;)V
    .registers 4

    iget-boolean p1, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-nez p1, :cond_c

    iget-object p1, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    const/4 v0, 0x0

    .line 1
    sget-object v1, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v1, p1, v0}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぁごぐすすぃ(Landroid/view/View;I)V

    :cond_c
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 2

    return-void
.end method

.method public 〺つふすそ(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final ぁごぐすすぃ(Z)V
    .registers 3

    iget-boolean v0, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v0, :cond_11

    iget-boolean v0, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->づざかべべ:Z

    if-eq v0, p1, :cond_11

    iget-object v0, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_11

    iput-boolean p1, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->づざかべべ:Z

    invoke-static {v0, p1}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->〺つふすそ(Landroid/view/ViewGroup;Z)V

    :cond_11
    return-void
.end method

.method public くし〴〺ぅ(Landroidx/transition/Transition;)V
    .registers 2

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/transition/Visibility$げつ〴ぬぐ;->ぁごぐすすぃ(Z)V

    return-void
.end method

.method public げつ〴ぬぐ(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public づざかべべ(Landroidx/transition/Transition;)V
    .registers 2

    invoke-virtual {p0}, Landroidx/transition/Visibility$げつ〴ぬぐ;->なぎぱいぢぎ()V

    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->ぶでにく〼〳(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    return-void
.end method

.method public final なぎぱいぢぎ()V
    .registers 4

    iget-boolean v0, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-nez v0, :cond_14

    iget-object v0, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    iget v1, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->〺つふすそ:I

    .line 1
    sget-object v2, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v2, v0, v1}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぁごぐすすぃ(Landroid/view/View;I)V

    .line 2
    iget-object v0, p0, Landroidx/transition/Visibility$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_14
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/transition/Visibility$げつ〴ぬぐ;->ぁごぐすすぃ(Z)V

    return-void
.end method

.method public びぐびあび(Landroidx/transition/Transition;)V
    .registers 2

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/transition/Visibility$げつ〴ぬぐ;->ぁごぐすすぃ(Z)V

    return-void
.end method
