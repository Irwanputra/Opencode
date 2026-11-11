.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/てぜきぽく;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Landroid/view/View;

.field public final synthetic くし〴〺ぅ:Landroidx/fragment/app/Fragment;

.field public final synthetic げつ〴ぬぐ:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/Fragment;)V
    .registers 5

    iput-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/てぜきぽく;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    iput-object p3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/てぜきぽく;->〺つふすそ:Landroid/view/View;

    iput-object p4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/てぜきぽく;->くし〴〺ぅ:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/てぜきぽく;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/てぜきぽく;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/てぜきぽく;->くし〴〺ぅ:Landroidx/fragment/app/Fragment;

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->ぉひのべい:Landroid/view/View;

    if-eqz v0, :cond_19

    iget-boolean p1, p1, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    if-eqz p1, :cond_19

    const/16 p1, 0x8

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_19
    return-void
.end method
