.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/fragment/app/Fragment;

.field public final synthetic くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

.field public final synthetic げつ〴ぬぐ:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;)V
    .registers 4

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iput-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    iput-object p3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ$げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method
