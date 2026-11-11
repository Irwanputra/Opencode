.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Landroid/view/View;

.field public final synthetic くし〴〺ぅ:Landroidx/fragment/app/Fragment;

.field public final synthetic げつ〴ぬぐ:Landroid/view/ViewGroup;

.field public final synthetic びぐびあび:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/Fragment;)V
    .registers 5

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->びぐびあび:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iput-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    iput-object p3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->〺つふすそ:Landroid/view/View;

    iput-object p4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->くし〴〺ぅ:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 8

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->くし〴〺ぅ:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->〳ぜぞぜべっ()Landroid/animation/Animator;

    move-result-object p1

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->くし〴〺ぅ:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->はつきどっ(Landroid/animation/Animator;)V

    if-eqz p1, :cond_2d

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    if-gez p1, :cond_2d

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->びぐびあび:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺふねづ〺;->くし〴〺ぅ:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->〻ぞまぎな〻()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->な〱ちぉじ(Landroidx/fragment/app/Fragment;IIIZ)V

    :cond_2d
    return-void
.end method
