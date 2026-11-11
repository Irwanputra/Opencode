.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/いいにぽつ;
.super Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;
.source ""


# instance fields
.field public final synthetic てぜきぽく:Landroidx/appcompat/widget/AppCompatSpinner;

.field public final synthetic ぺふねづ〺:Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/view/View;Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;)V
    .registers 4

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Landroidx/appcompat/widget/AppCompatSpinner;

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/いいにぽつ;->ぺふねづ〺:Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;

    invoke-direct {p0, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぇぬぎばつ;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/いいにぽつ;->ぺふねづ〺:Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;

    return-object v0
.end method

.method public くし〴〺ぅ()Z
    .registers 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatSpinner;->getInternalPopup()Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;

    move-result-object v0

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;->〺つふすそ()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatSpinner;->〺つふすそ()V

    :cond_11
    const/4 v0, 0x1

    return v0
.end method
