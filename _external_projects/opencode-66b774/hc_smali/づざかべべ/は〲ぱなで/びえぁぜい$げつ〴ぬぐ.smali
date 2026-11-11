.class public Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""

# interfaces
.implements Landroidx/transition/Transition$びぐびあび;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/は〲ぱなで/びえぁぜい;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final 〳ぜぞぜべっ:F

.field public final 〺つふすそ:Landroid/view/View;

.field public ぁごぐすすぃ:F

.field public final くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Landroid/view/View;

.field public づざかべべ:[I

.field public なぎぱいぢぎ:F

.field public final びぐびあび:I

.field public final ぺぁあねじ:F


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View;IIFF)V
    .registers 8

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    iput-object p2, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    sub-int/2addr p3, v0

    iput p3, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    sub-int/2addr p4, p1

    iput p4, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->びぐびあび:I

    iput p5, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〳ぜぞぜべっ:F

    iput p6, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->ぺぁあねじ:F

    sget p1, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->transition_position:I

    invoke-virtual {p2, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [I

    iput-object p3, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->づざかべべ:[I

    if-eqz p3, :cond_31

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_31
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 5

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->づざかべべ:[I

    if-nez p1, :cond_9

    const/4 p1, 0x2

    new-array p1, p1, [I

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->づざかべべ:[I

    :cond_9
    iget-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->づざかべべ:[I

    const/4 v0, 0x0

    iget v1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->くし〴〺ぅ:I

    int-to-float v1, v1

    iget-object v2, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    move-result v2

    add-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    aput v1, p1, v0

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->づざかべべ:[I

    const/4 v0, 0x1

    iget v1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->びぐびあび:I

    int-to-float v1, v1

    iget-object v2, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    move-result v2

    add-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    aput v1, p1, v0

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    sget v0, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->transition_position:I

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->づざかべべ:[I

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public onAnimationPause(Landroid/animation/Animator;)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p1

    iput p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->なぎぱいぢぎ:F

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    iput p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->ぁごぐすすぃ:F

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    iget v0, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〳ぜぞぜべっ:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    iget v0, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->ぺぁあねじ:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public onAnimationResume(Landroid/animation/Animator;)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    iget v0, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->なぎぱいぢぎ:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    iget v0, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->ぁごぐすすぃ:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public 〺つふすそ(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public くし〴〺ぅ(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public げつ〴ぬぐ(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public づざかべべ(Landroidx/transition/Transition;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    iget v1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〳ぜぞぜべっ:F

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/View;

    iget v1, p0, Lづざかべべ/は〲ぱなで/びえぁぜい$げつ〴ぬぐ;->ぺぁあねじ:F

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->ぶでにく〼〳(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    return-void
.end method

.method public びぐびあび(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method
