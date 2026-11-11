.class public Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;
.super Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final synthetic のぷのちつ:Landroidx/appcompat/widget/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;Landroid/view/View;)V
    .registers 12

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;->のぷのちつ:Landroidx/appcompat/widget/ActionMenuPresenter;

    sget v5, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionOverflowMenuStyle:I

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    .line 1
    invoke-direct/range {v0 .. v6}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;-><init>(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/View;ZII)V

    .line 2
    iget-object p2, p3, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;->びえぁぜい:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    .line 3
    invoke-virtual {p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result p2

    if-nez p2, :cond_1f

    iget-object p2, p1, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    if-nez p2, :cond_1d

    .line 4
    iget-object p2, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    .line 5
    check-cast p2, Landroid/view/View;

    .line 6
    :cond_1d
    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Landroid/view/View;

    .line 7
    :cond_1f
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuPresenter;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionMenuPresenter$なぎぱいぢぎ;

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ()V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;->のぷのちつ:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぶでにく〼〳:Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;

    const/4 v1, 0x0

    iput v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->びえぁぜい:I

    invoke-super {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->くし〴〺ぅ()V

    return-void
.end method
