.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 5

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉざぅち〻:Landroid/widget/PopupWindow;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x37

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おかぷせ〱()V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->くねねぱす〻()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_3d

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    move-result-object v2

    invoke-virtual {v2, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->げつ〴ぬぐ(F)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iput-object v2, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->は〲ぱなで:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->は〲ぱなで:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    new-instance v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;)V

    invoke-virtual {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->びぐびあび(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    goto :goto_4b

    :cond_3d
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_4b
    return-void
.end method
