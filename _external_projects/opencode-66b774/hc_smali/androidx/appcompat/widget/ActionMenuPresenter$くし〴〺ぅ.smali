.class public Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public 〺つふすそ:Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;

.field public final synthetic くし〴〺ぅ:Landroidx/appcompat/widget/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;)V
    .registers 3

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;->くし〴〺ぅ:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;->くし〴〺ぅ:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v0, :cond_d

    .line 2
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;

    if-eqz v1, :cond_d

    invoke-interface {v1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V

    .line 3
    :cond_d
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;->くし〴〺ぅ:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 4
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    .line 5
    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_29

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ()Z

    move-result v0

    if-eqz v0, :cond_29

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;->くし〴〺ぅ:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;

    iput-object v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->でどあくず:Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;

    :cond_29
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;->くし〴〺ぅ:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->〻ぞまぎな〻:Landroidx/appcompat/widget/ActionMenuPresenter$くし〴〺ぅ;

    return-void
.end method
