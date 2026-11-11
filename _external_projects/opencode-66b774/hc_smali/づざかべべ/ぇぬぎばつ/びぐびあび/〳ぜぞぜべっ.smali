.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Landroid/view/View;

.field public final synthetic げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

.field public final synthetic づざかべべ:Landroid/view/ViewPropertyAnimator;

.field public final synthetic なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

.field public final synthetic びぐびあび:I


# direct methods
.method public constructor <init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V
    .registers 7

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iput-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iput p3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->〺つふすそ:I

    iput-object p4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->くし〴〺ぅ:Landroid/view/View;

    iput p5, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->びぐびあび:I

    iput-object p6, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->づざかべべ:Landroid/view/ViewPropertyAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 3

    iget p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->〺つふすそ:I

    const/4 v0, 0x0

    if-eqz p1, :cond_a

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    :cond_a
    iget p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->びぐびあび:I

    if-eqz p1, :cond_13

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    :cond_13
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->づざかべべ:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    .line 1
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    .line 2
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iget-object p1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぇぬぎばつ:Ljava/util/ArrayList;

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    invoke-virtual {p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺふねづ〺()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 2

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
