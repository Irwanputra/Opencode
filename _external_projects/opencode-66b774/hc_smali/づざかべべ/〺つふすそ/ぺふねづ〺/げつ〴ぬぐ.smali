.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 6

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;

    iget-boolean v0, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->づざかべべ:Z

    if-eqz v0, :cond_4e

    .line 1
    iget-object v0, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->〳ぜぞぜべっ(I)I

    move-result v0

    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 2
    invoke-virtual {v2, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->づざかべべ(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1c

    invoke-virtual {v2, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->ぉざぅち〻(Landroid/view/View;)Z

    move-result v2

    goto :goto_1d

    :cond_1c
    const/4 v2, 0x0

    :goto_1d
    if-eqz v2, :cond_28

    const/4 v2, 0x2

    if-eq v0, v2, :cond_28

    .line 3
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->〺つふすそ(I)V

    goto :goto_51

    :cond_28
    const/4 v2, 0x1

    if-eq v0, v2, :cond_51

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 4
    invoke-virtual {p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->づざかべべ(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_37

    invoke-virtual {p1, v0, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->ごづごきえ(Landroid/view/View;Z)V

    goto :goto_51

    :cond_37
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No drawer view found with gravity "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v1}, Landroidx/drawerlayout/widget/DrawerLayout;->ぺふねづ〺(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_4e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_51
    :goto_51
    return-void
.end method
