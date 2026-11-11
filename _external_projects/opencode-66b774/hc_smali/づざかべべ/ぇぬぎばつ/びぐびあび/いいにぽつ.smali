.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Landroid/view/ViewPropertyAnimator;

.field public final synthetic くし〴〺ぅ:Landroid/view/View;

.field public final synthetic げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;

.field public final synthetic びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;


# direct methods
.method public constructor <init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
    .registers 5

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iput-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;

    iput-object p3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->〺つふすそ:Landroid/view/ViewPropertyAnimator;

    iput-object p4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->くし〴〺ぅ:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->〺つふすそ:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->くし〴〺ぅ:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->くし〴〺ぅ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    .line 1
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    .line 2
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iget-object p1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ざとぅぼこ〺:Ljava/util/ArrayList;

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    invoke-virtual {p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺふねづ〺()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/いいにぽつ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
